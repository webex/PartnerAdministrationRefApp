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

import com.cisco.auth.AccessTokenProvider;
import com.cisco.client.ClientException;
import com.cisco.input.WholesaleCustomerInputProvider;
import com.cisco.util.PagingUtil;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Scanner;

import static com.cisco.util.JsonUtil.prettyPrintJson;

@Component
public class MenuManager {

    private final WholesaleCustomerManager wholesaleCustomerManager;
    private final WholesaleSubscriberManager wholesaleSubscriberManager;
    private final DeviceManager deviceManager;
    private final LocationManager locationManager;
    private final JourneyManager journeyManager;
    private final PstnManager pstnManager;
    private final OrganizationManager organizationManager;
    private final IdentityOrganizationManager identityOrganizationManager;
    private final NumbersManager numbersManager;
    private final LocationCallSettingsManager locationCallSettingsManager;
    private final WholesaleCustomerInputProvider wholesaleCustomerInputProvider;
    private final AccessTokenProvider accessTokenProvider;
    private final PersonManager personManager;

    public MenuManager(
        @Lazy WholesaleCustomerManager wholesaleCustomerManager,
        @Lazy WholesaleSubscriberManager wholesaleSubscriberManager,
        @Lazy DeviceManager deviceManager,
        @Lazy LocationManager locationManager,
        @Lazy JourneyManager journeyManager,
        @Lazy PstnManager pstnManager,
        @Lazy OrganizationManager organizationManager,
        @Lazy IdentityOrganizationManager identityOrganizationManager,
        @Lazy NumbersManager numbersManager,
        @Lazy LocationCallSettingsManager locationCallSettingsManager,
        @Lazy PersonManager personManager,
        @Lazy WholesaleCustomerInputProvider wholesaleCustomerInputProvider,
        @Lazy AccessTokenProvider accessTokenProvider) {
        this.wholesaleCustomerManager = wholesaleCustomerManager;
        this.wholesaleSubscriberManager = wholesaleSubscriberManager;
        this.deviceManager = deviceManager;
        this.locationManager = locationManager;
        this.journeyManager = journeyManager;
        this.pstnManager = pstnManager;
        this.organizationManager = organizationManager;
        this.identityOrganizationManager = identityOrganizationManager;
        this.numbersManager = numbersManager;
        this.locationCallSettingsManager = locationCallSettingsManager;
        this.personManager = personManager;
        this.wholesaleCustomerInputProvider = wholesaleCustomerInputProvider;
        this.accessTokenProvider = accessTokenProvider;
    }

    public void mainMenu() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("\n\n###########################");
        System.out.println("Logging in...");
        // invoke the access token provider to retrieve the access token so that it's available when running
        // onboarding journeys and for invoking individual API menu items
        this.accessTokenProvider.getAccessToken();

        do {
            System.out.println("\n\n###########################");
            System.out.println("Main Menu");
            System.out.println("###########################");
            System.out.println("1. Onboarding Journey");
            System.out.println("2. Individual APIs");
            System.out.println("0. Exit");
            System.out.println("###########################\n");

            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    journeyMenu();
                    break;
                case 2:
                    apiMenu();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    private void journeyMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n\n###########################");
            System.out.println("Journey Menu");
            System.out.println("###########################");
            System.out.println("1. Onboard and Configure Customer");
            System.out.println("2. Onboard and Configure Subscriber");
            System.out.println("3. Rename Customer");
            System.out.println("0. Return to main menu");
            System.out.println("###########################\n");

            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Onboard and Configure Customer Journey");
                    journeyManager.onboardAndConfigureCustomer();
                    break;
                case 2:
                    System.out.println("Onboard and Configure Subscriber Journey");
                    journeyManager.onboardAndConfigureSubscriber();
                    break;
                case 3:
                    System.out.println("Rename Organization Journey");
                    journeyManager.renameOrganization();
                    break;
                case 0:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    private void apiMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n\n###########################");
            System.out.println("API Menu");
            System.out.println("###########################");
            System.out.println("1. List Wholesale Customers");
            System.out.println("2. Get a Wholesale Customer");
            System.out.println("3. Provision a Wholesale Customer");
            System.out.println("4. List Wholesale Subscribers");
            System.out.println("5. Get a Wholesale Subscriber");
            System.out.println("6. Provision a Wholesale Subscriber");
            System.out.println("7. Create a Device");
            System.out.println("8. Create a Location");
            System.out.println("9. List Locations");
            System.out.println("10. Get an Organization Details");
            System.out.println("11. Setup PSTN Connection");
            System.out.println("12. Get an Identity Organization Details");
            System.out.println("13. Update an Identity Organization Name");
            System.out.println("14. Get Phone Number Assigned to the OrgId & Location");
            System.out.println("15. Assign Phone Number to the OrgId & Location");
            System.out.println("16. Configure Main Number to the OrgId & Location");
            System.out.println("17. Assign Phone Number to a Person");
            System.out.println("0. Return to main menu");
            System.out.println("###########################\n");

            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    try {
                        final var listWholesaleCustomers = this.listWholesaleCustomersMenu();
                        printApiResponse("List Wholesale Customers", listWholesaleCustomers);
                    } catch (final ClientException e) {
                        System.err.println("Error listing Wholesale Customers: " + e.getMessage());
                        System.out.println("Returning to API Menu");
                    }
                    break;
                case 2:
                    try {
                        final var getWholesaleCustomerResp = wholesaleCustomerManager.getWholesaleCustomer();
                        printApiResponse("Get Wholesale Customer", prettyPrintJson(getWholesaleCustomerResp.toJson()));
                    } catch (final ClientException e) {
                        System.err.println("Error getting Wholesale Customer: " + e.getMessage());
                        System.out.println("Returning to API Menu");
                    }
                    break;
                case 3:
                    try {
                        final var provisionAWholesaleCustomerResp = wholesaleCustomerManager.provisionAWholesaleCustomer();
                        printApiResponse("Provision a Wholesale Customer", provisionAWholesaleCustomerResp.getUrl());
                    } catch (final ClientException e) {
                        System.err.println("Error provisioning Wholesale Customer: " + e.getMessage());
                        System.out.println("Returning to API Menu");
                    }
                    break;
                case 4:
                    try {
                        final var listWholesaleSubscribers = this.listWholesaleSubscribersMenu();
                        printApiResponse("List Wholesale Subscribers", listWholesaleSubscribers);
                    } catch (final ClientException e) {
                        System.err.println("Error listing Wholesale Subscribers: " + e.getMessage());
                        System.out.println("Returning to API Menu");
                    }
                    break;
                case 5:
                    try {
                        final var getWholesaleSubscriberResp = wholesaleSubscriberManager.getWholesaleSubscriber();
                        printApiResponse("Get a Wholesale Subscriber", prettyPrintJson(getWholesaleSubscriberResp.toJson()));
                    } catch (final ClientException e) {
                        System.err.println("Error getting Wholesale Subscriber: " + e.getMessage());
                        System.out.println("Returning to API Menu");
                    }
                    break;
                case 6:
                    try {
                        final var provisionWholesaleSubscriberResp = wholesaleSubscriberManager.provisionAWholesaleSubscriber();
                        printApiResponse("Provision a Wholesale Subscriber", prettyPrintJson(provisionWholesaleSubscriberResp.toJson()));
                    } catch (final ClientException e) {
                        System.out.println("Returning to API Menu");
                    }
                    break;
                case 7:
                    try {
                        final var createDeviceResp = deviceManager.createDevice();
                        printApiResponse("Create a Device", prettyPrintJson(createDeviceResp.toJson()));
                    } catch (final ClientException e) {
                        System.err.println("Error creating Device: " + e.getMessage());
                        System.out.println("Returning to API Menu");
                    }
                    break;
                case 8:
                    try {
                        final var location = locationManager.createLocation();
                        printApiResponse("Create a Location", location);
                    } catch (final ClientException e) {
                        System.err.println("Error creating Location: " + e.getMessage());
                        System.out.println("Returning to API Menu");
                    }
                    break;
                case 9:
                    try {
                        final var locations = locationManager.listLocations();
                        printApiResponse("List Locations", prettyPrintJson(locations.toJson()));
                    } catch (final ClientException e) {
                        System.err.println("Error Listing Locations for given OrgId: " + e.getMessage());
                        System.out.println("Returning to API Menu");
                    }
                    break;
                case 10:
                    try {
                        final var orgDetails = organizationManager.getOrganization();
                        printApiResponse("Get an Organization Details", prettyPrintJson(orgDetails.toJson()));
                    } catch (final ClientException e) {
                        System.err.println("Error Getting Organization: " + e.getMessage());
                        System.out.println("Returning to API Menu");
                    }
                    break;
                case 11:
                    final var result = pstnManager.setupPSTNConnection();
                    printApiResponse("Setup PSTN Connection", result ? "Success" : "Failure");
                    break;
                case 12:
                    try {
                        final var getIdentityOrganization = identityOrganizationManager.getAnIdentityOrganization();
                        printApiResponse("Get an an Identity Organization Details", prettyPrintJson(getIdentityOrganization.toJson()));
                    } catch (final ClientException e) {
                        System.err.println("Error Getting Identity Organization: " + e.getMessage());
                        System.out.println("Returning to API Menu");
                    }
                    break;
                case 13:
                    try {
                        final var patchIdentityOrganization = identityOrganizationManager.updateOrganizationName();
                        printApiResponse("Update an Identity Organization Name", prettyPrintJson(patchIdentityOrganization.toJson()));
                    } catch (final ClientException e) {
                        System.err.println("Error Updating Identity Organization: " + e.getMessage());
                        System.out.println("Returning to API Menu");
                    }
                    break;
                case 14:
                    try {
                        final var number = numbersManager.getNumberForOrgAndLocation();
                        printApiResponse("Phone number details", prettyPrintJson(number.toJson()));
                    } catch (final ClientException e) {
                        System.err.println("Error getting Phone Number details: " + e.getMessage());
                        System.out.println("Returning to API Menu");
                    }
                    break;
                case 15:
                    final var success = numbersManager.addPhoneNumbersToLocation();
                    if (success) {
                        System.out.println("Phone numbers assigned successfully");
                    } else {
                        System.out.println("Returning to API Menu");
                    }
                    break;
                case 16:
                    if (locationCallSettingsManager.updateLocationCallSettings()) {
                        System.out.println("Phone Number has been successfully configured as main number to the location");
                    } else {
                        System.out.println("Returning to API Menu");
                    }
                    break;
                case 17:
                    if (personManager.assignPhoneNumberToAPerson()) {
                        System.out.println("Phone Number has been successfully assigned to the user");
                    } else {
                        System.out.println("Returning to API Menu");
                    }
                    break;
                case 0:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    public String listWholesaleCustomersMenu() {
        var maxRecords = PagingUtil.getMaxRecordsFromUser();
        return PagingUtil.listWithPaginationMenu(maxRecords, null, wholesaleCustomerManager::listWholesaleCustomers);
    }

    public String listWholesaleSubscribersMenu() {
        System.out.println("\n\n###########################");
        System.out.println("List Wholesale Subscriber Menu");
        System.out.println("###########################");
        System.out.println("1. List all Wholesale Subscribers");
        System.out.println("2. List Subscribers For A Wholesale Customer ID");
        System.out.println("0. Return to API Menu");
        System.out.println("###########################\n");

        System.out.print("Enter your choice: ");

        final var scanner = new Scanner(System.in);
        var choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 0) {
            System.out.println("Returning to API Menu...");
            return "";
        }

        var maxRecords = PagingUtil.getMaxRecordsFromUser();

        return switch (choice) {
            case 1 ->
                    PagingUtil.listWithPaginationMenu(maxRecords, null, wholesaleSubscriberManager::listWholesaleSubscribers);
            case 2 -> {
                final var customerId = wholesaleCustomerInputProvider.getCustomerId();
                yield PagingUtil.listWithPaginationMenu(maxRecords, customerId, wholesaleSubscriberManager::listWholesaleSubscribers);
            }
            default -> "Invalid choice. Please try again.";
        };
    }

    private void printApiResponse(final String name, final String response) {
        System.out.println("\n###########################");
        System.out.println(name);
        System.out.println("###########################");
        System.out.println(response);
    }
}
