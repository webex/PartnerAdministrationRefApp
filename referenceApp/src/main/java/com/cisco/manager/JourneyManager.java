// Copyright 2025 Cisco Systems Inc.
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
package com.cisco.manager;

import com.cisco.client.ClientException;
import com.cisco.model.CustomerOnboardingStatus;
import com.cisco.model.SubscriberOnboardingStatus;
import org.openapitools.client.model.CreateADeviceByMACAddress200Response;
import org.openapitools.client.model.GetAWholesaleCustomer200Response;
import org.openapitools.client.model.GetAnOrganization200Response;
import org.openapitools.client.model.GetOrganizationDetails200Response;
import org.openapitools.client.model.ProvisionAWholesaleCustomer202Response;
import org.openapitools.client.model.ProvisionAWholesaleSubscriber200Response;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class JourneyManager {

    private final WholesaleCustomerManager wholesaleCustomerManager;
    private final WholesaleSubscriberManager wholesaleSubscriberManager;
    private final LocationManager locationManager;
    private final PstnManager pstnManager;
    private final OrganizationManager organizationManager;
    private final IdentityOrganizationManager identityOrganizationManager;
    private final DeviceManager deviceManager;
    private final NumbersManager numbersManager;
    private final LocationCallSettingsManager locationCallSettingsManager;
    private final Scanner scanner;

    public JourneyManager(
        final WholesaleCustomerManager wholesaleCustomerManager,
        final WholesaleSubscriberManager wholesaleSubscriberManager,
        final LocationManager locationManager,
        final PstnManager pstnManager,
        final OrganizationManager organizationManager,
        final DeviceManager deviceManager,
        final IdentityOrganizationManager identityOrganizationManager,
        final NumbersManager numbersManager,
        final LocationCallSettingsManager locationCallSettingsManager,
        final Scanner scanner) {
        this.wholesaleCustomerManager = wholesaleCustomerManager;
        this.wholesaleSubscriberManager = wholesaleSubscriberManager;
        this.locationManager = locationManager;
        this.pstnManager = pstnManager;
        this.organizationManager = organizationManager;
        this.deviceManager = deviceManager;
        this.identityOrganizationManager = identityOrganizationManager;
        this.numbersManager = numbersManager;
        this.locationCallSettingsManager = locationCallSettingsManager;
        this.scanner = scanner;
    }

    public boolean onboardAndConfigureCustomer()  {
        try {
            ////////////////////////////
            // Customer Provisioning //
            //////////////////////////
            System.out.println("Provision a Wholesale Customer");
            ProvisionAWholesaleCustomer202Response createWholesaleCustomerResp = null;

            try {
                createWholesaleCustomerResp = wholesaleCustomerManager.provisionAWholesaleCustomer();
                System.out.println(createWholesaleCustomerResp.getUrl());
            } catch (final ClientException e) {
                System.err.println("Error provisioning a Wholesale Customer: " + e.getMessage());
                System.out.println("Returning to Journey Menu");
                return false;
            }
            System.out.println("Provision a Wholesale Customer request processing complete");

            // Obtain the customerId from the URL
            String customerId = null;
            try {
                customerId = wholesaleCustomerManager.getCustomerIdFromProvisionWholesaleCustomerResponse(createWholesaleCustomerResp);
                CustomerOnboardingStatus.setCustomerId(customerId);
            } catch (final Exception e) {
                System.err.println("Error obtaining customerId: " + e.getMessage());
                System.out.println("Returning to Journey Menu");
                return false;
            }

            // Poll customer provisioning status to wait until it has been provisioned
            // False indicates provisioning error or timeout waiting, return to menu if that occurs
            try {
                if (!wholesaleCustomerManager.pollCustomerForProvisionedStatus(customerId)) {
                    System.out.println("Returning to Journey Menu");
                    return false;
                }
            } catch (final ClientException e) {
                System.err.println("Error polling customer provisioning status: " + e.getMessage());
                return false;
            }

            System.out.println("\nWholesale Customer has been successfully provisioned");


            ////////////////////////////////////////////
            // Verify Access to Customer Organization //
            ////////////////////////////////////////////
            System.out.println("\nVerifying access to the Wholesale Customer organization");
            String orgId;

            try {
                orgId = wholesaleCustomerManager.getWholesaleCustomer(customerId).getOrgId();
                final GetOrganizationDetails200Response getAnOrganization200Response = organizationManager.getOrganization(orgId);
                System.out.println("Access to organization " + getAnOrganization200Response.getDisplayName() + " verified");
            } catch (final ClientException e) {
                System.err.println("Error verifying access to organization: " + e.getMessage());
                System.out.println("Returning to Journey Menu");
                return false;
            }
            CustomerOnboardingStatus.setOrgId(orgId);
            /////////////////////////////////////////////
            // Customer Default Location ID Retrieval //
            ////////////////////////////////////////////
            System.out.println("\nGetting default location for Wholesale Customer");

            String locationId;
            try {
                locationId = locationManager.getFirstLocationIdForOrg(orgId).get();
            } catch (final ClientException e) {
                System.err.println("Error retrieving default location ID: " + e.getMessage());
                System.out.println("Returning to Journey Menu");
                return false;
            }

            CustomerOnboardingStatus.setLocationId(locationId);
            /////////////////////////////////////////////////
            // Configure Customer Location PSTN Connection //
            /////////////////////////////////////////////////
            System.out.println("Setting up PSTN connection for the location");
            try {
                if (!pstnManager.setupPSTNConnection(locationId, orgId)) {
                    System.err.println("Error setting up PSTN connection");
                    System.out.println("Returning to Journey Menu");
                    return false;
                }
                CustomerOnboardingStatus.setPstnConnectionSetUp(true);
            } catch (final ClientException e) {
                System.err.println("Error setting up PSTN connection: " + e.getMessage());
                System.out.println("Returning to Journey Menu");
                return false;
            }

            System.out.println("PSTN Connection has been successfully setup\n");

            //////////////////////////////////////////////
            // Configure Customer Location Phone Number //
            /////////////////////////////////////////////

            System.out.println("Adding Phone Numbers to the location.");
            final List<String> phoneNumbers;
            try {
                phoneNumbers = numbersManager.addPhoneNumbersToLocation(locationId, orgId);
                if (!phoneNumbers.isEmpty()) {
                    System.out.println("Phone Numbers have been successfully added to the location.");
                    CustomerOnboardingStatus.setPhoneNumbersAddedToLocation(true);
                } else {
                    System.out.println("Failed to add Phone Numbers. Returning to Journey Menu.");
                    return false;
                }
            } catch (final ClientException e) {
                System.err.println("Error adding Phone Number to the location: " + e.getMessage());
                System.out.println("Returning to Journey Menu");
                return false;
            }

            ////////////////////////////////////////
            // Configure Main Number for location //
            ///////////////////////////////////////

            System.out.println("Configuring Main Number for the location");

            try {
                if (!phoneNumbers.isEmpty() && locationCallSettingsManager.updateLocationCallSettings(locationId, orgId, phoneNumbers.getFirst())) {
                    System.out.println("Phone Number has been successfully configured as main number for the location");
                    CustomerOnboardingStatus.setMainNumberConfiguredForLocation(true);
                } else {
                    System.out.println("Returning to Journey Menu");
                    return false; // this is currently redundant but useful to explicitly specify as further journey calls are added
                }
            } catch (final Exception e) {
                System.err.println("Error while configuring Phone Number as main number for the location: " + e.getMessage());
                System.out.println("Returning to Journey Menu");
                return false;
            }

        } catch (final RuntimeException e) {
            System.out.println("Authorization error: " + e.getMessage());
            System.out.println("Returning to Journey Menu");
            return false;
        }
        CustomerOnboardingStatus.setOnboardingComplete(true);
        return true;
    }

    public boolean onboardAndConfigureSubscriber() {

        try {
            /////////////////////////////
            // Subscriber Provisioning //
            /////////////////////////////

            System.out.println("Provision a Wholesale Subscriber");

            ProvisionAWholesaleSubscriber200Response provisionWholesaleSubscriberResp = null;
            try {
                provisionWholesaleSubscriberResp = wholesaleSubscriberManager.provisionAWholesaleSubscriber();
            } catch (final ClientException e) {
                System.err.println("Error provisioning Wholesale subscriber: " + e.getMessage());
                System.out.println("Returning to Journey Menu");
                return false;
            }
            System.out.println("Provisioning of the Wholesale Subscriber completed");
            SubscriberOnboardingStatus.setSubscriberCreated(true);
            SubscriberOnboardingStatus.setPersonId(provisionWholesaleSubscriberResp.getPersonId());

            /////////////////////////////
            //       Add Device        //
            /////////////////////////////

            System.out.println("Adding device for Wholesale Subscriber");
            CreateADeviceByMACAddress200Response createDeviceResp = null;
            try {
                createDeviceResp = deviceManager.createDevice(provisionWholesaleSubscriberResp.getId());
                SubscriberOnboardingStatus.setDeviceAdded(true);
                SubscriberOnboardingStatus.setDeviceId(createDeviceResp.getId());
            } catch (final ClientException e) {
                System.err.println("Error adding device: " + e.getMessage());
                System.out.println("Returning to Journey Menu");
                return false;
            }
            System.out.println("Addition of device for Wholesale Subscriber completed");

        } catch (final RuntimeException e) {
            System.out.println("Authorization error: " + e.getMessage());
            System.out.println("Returning to Journey Menu");
            return false;
        }
        SubscriberOnboardingStatus.setOnboardingComplete(true);
        return true;
    }

    public void renameOrganization() {

        ///////////////////////////////
        // Getting Organization name //
        ///////////////////////////////

        try {
            String displayName = null;
            String orgId = null;
            try {
                System.out.println("Getting the organization display name of the recently created customer");
                final GetAWholesaleCustomer200Response wholesaleCustomer200Response = wholesaleCustomerManager.getWholesaleCustomer();
                orgId = wholesaleCustomer200Response.getOrgId();
                displayName = identityOrganizationManager.getAnIdentityOrganization(orgId).getDisplayName();
            } catch (ClientException e) {
                System.err.println("Error getting the organization display name: " + e.getMessage());
                System.out.println("Returning to Journey Menu");
                return;
            }
            System.out.println("Organization current display name: " + displayName);


            ////////////////////////////////
            // Updating Organization name //
            ///////////////////////////////

            final String newDisplayName = displayName + "_Updated";
            System.out.print("Enter a new display name for the organization [" + newDisplayName + "]: ");
            String enteredDisplayName = scanner.nextLine();
            if (enteredDisplayName.isEmpty()) {
                enteredDisplayName = newDisplayName;
            }

            try {
                final GetAnOrganization200Response updateOrganizationNameResponse = identityOrganizationManager.updateOrganizationName(orgId, enteredDisplayName);
            } catch (ClientException e) {
                System.err.println("Error updating the organization display name: " + e.getMessage());
                System.out.println("Returning to Journey Menu");
                return;
            }

            System.out.println("Finished updating Organization Details");
        } catch (RuntimeException e) {
            System.out.println("Authorization error: " + e.getMessage());
            System.out.println("Returning to Journey Menu");
        }
    }
}
