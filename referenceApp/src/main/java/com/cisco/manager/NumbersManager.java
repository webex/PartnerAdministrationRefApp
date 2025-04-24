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
import com.cisco.client.WebexClient;
import com.cisco.input.PhoneNumberInputProvider;
import org.openapitools.client.model.GetPhoneNumbersForAnOrganizationWithGivenCriterias200Response;
import org.openapitools.client.model.NumbersPost;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class NumbersManager {
    private final PhoneNumberInputProvider phoneNumberInputProvider;
    private final WebexClient webexClient;

    public NumbersManager(final PhoneNumberInputProvider phoneNumberInputProvider,
                          final WebexClient webexClient) {
        this.phoneNumberInputProvider = phoneNumberInputProvider;
        this.webexClient = webexClient;
    }

    public GetPhoneNumbersForAnOrganizationWithGivenCriterias200Response getNumberForOrgAndLocation(
        final String orgId,
        final String locationId) {
        return webexClient.getPhoneNumbersForAnOrganizationWithGivenCriterias(
            orgId,
            locationId,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null);
    }

    public List<String> addPhoneNumbersToLocation(final String locationId, final String orgId) {
        final var phoneNumbers = phoneNumberInputProvider.getPhoneNumbers();

        if (!phoneNumbers.isEmpty()) {
            if (this.addPhoneNumbersToLocation(locationId, orgId, phoneNumbers)) {
                System.out.println("Phone Numbers have been successfully added to the location");
                return phoneNumbers;
            } else {
                System.out.println("Failed to add Phone Numbers to the location");
                return Collections.emptyList();
            }
        }
        return phoneNumbers;
    }

    public boolean addPhoneNumbersToLocation(
        final String locationId,
        final String orgId,
        final List<String> phoneNumbers)
    {
        final var numbersPost = new NumbersPost();
        numbersPost.setPhoneNumbers(new ArrayList<>(phoneNumbers));

        try {
            System.out.println("Adding Phone Numbers to the location");
            webexClient.addPhoneNumbersToALocation(
                locationId,
                orgId,
                numbersPost);
            return true;
        } catch (ClientException e) {
            System.err.println("Error adding Phone Number to the location: " + e.getMessage());
            return false;
        }
    }


    public boolean addPhoneNumbersToLocation() {
        final var phoneNumberDetails = phoneNumberInputProvider.getProvisioningDetails();

        if (!phoneNumberDetails.getPhoneNumbers().isEmpty()) {

            if (this.addPhoneNumbersToLocation(
                phoneNumberDetails.getLocationId(), phoneNumberDetails.getOrgId(), phoneNumberDetails.getPhoneNumbers())) {
                System.out.println("Phone Numbers have been successfully added to the location.");
                return true;
            } else {
                System.out.println("Failed to add Phone Numbers. Returning to API Menu.");
                return false;
            }
        }
        return false;
    }

    public GetPhoneNumbersForAnOrganizationWithGivenCriterias200Response getNumberForOrgAndLocation() {

        final var details = phoneNumberInputProvider.getLocationIdAndOrgId();

        return this.getNumberForOrgAndLocation(details.getOrgId(), details.getLocationId());
    }

    public List<String> listAvailablePhoneNumbers(final String orgId, final String locationId) {
        final var phoneNumbers = getPhoneNumbersFromOrgAndLocation(orgId, locationId);
        System.out.println("Available phone numbers for the location:");
        var phoneNumberList = new ArrayList<String>();
        phoneNumbers.getPhoneNumbers().stream()
                .filter(number -> number.getOwner() == null)
                .forEach(number -> {
                    System.out.println(number.getPhoneNumber());
                    phoneNumberList.add(number.getPhoneNumber());
                });
        return phoneNumberList;
    }

    private GetPhoneNumbersForAnOrganizationWithGivenCriterias200Response getPhoneNumbersFromOrgAndLocation (final String orgId, final String locationId) {
        final var phoneNumbers = getNumberForOrgAndLocation(orgId, locationId);

        if (phoneNumbers == null || phoneNumbers.getPhoneNumbers().stream().allMatch(number -> number.getOwner() != null)) {
            System.out.println("No phone numbers available for the location. \nPlease add phone numbers to the location.");

            final var numbers = phoneNumberInputProvider.getPhoneNumbers();
            addPhoneNumbersToLocation(locationId, orgId, numbers);

            return getNumberForOrgAndLocation(orgId, locationId);
        }

        return phoneNumbers;
    }
}
