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
package com.cisco.input;

import com.cisco.manager.LocationManager;
import com.cisco.manager.NumbersManager;
import com.cisco.manager.WholesaleCustomerManager;
import com.cisco.model.WholesaleSubscriberDetails;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

@Component
public class WholesaleSubscriberCliInputProvider implements WholesaleSubscriberInputProvider {

    public static final List<Integer> EMERGENCY_EXTENSIONS = List.of(1911, 911, 933, 611);

    final static String DEFAULT_EMAIL = "subscriber%04dadmin@wbxlab.us";
    final static String DEFAULT_FIRST_NAME = "Subscriber-%04d";
    final static String DEFAULT_LAST_NAME = "LastName-%04d";

    final WholesaleCustomerManager wholesaleCustomerManager;
    final LocationManager locationManager;
    final NumbersManager numbersManager;
    final Scanner scanner;

    public WholesaleSubscriberCliInputProvider(final WholesaleCustomerManager wholesaleCustomerManager,
                                               final LocationManager locationManager,
                                               final NumbersManager numbersManager,
                                               final Scanner scanner) {
        this.wholesaleCustomerManager = wholesaleCustomerManager;
        this.locationManager = locationManager;
        this.numbersManager = numbersManager;
        this.scanner = scanner;
    }

    @Override
    public String getSubscriberId() {
        System.out.print("Enter subscriber ID: ");
        final var subscriberId = scanner.nextLine().trim();

        return subscriberId;
    }

    @Override
    public WholesaleSubscriberDetails getProvisioningDetails() {

        final var randomNum = new java.util.Random().nextInt(10000);
        final var subscriberDetails = new WholesaleSubscriberDetails();

        //region subscriberId
        final var defaultCustomerId = wholesaleCustomerManager.getDefaultCustomerId();
        System.out.print("Enter customerId [" + defaultCustomerId + "]: ");
        final var customerId = readInput(scanner, defaultCustomerId);
        subscriberDetails.setCustomerId(customerId);
        //endregion

        //region email
        System.out.print(String.format("Enter an email address [" + DEFAULT_EMAIL + "]: ", randomNum));
        final var email = readInput(scanner, String.format(DEFAULT_EMAIL, randomNum));
        subscriberDetails.setEmail(email);
        //endregion

        // region Provisioning Parameters
        System.out.print("Enter provisioning parameters for the subscriber");

        // region firstName
        System.out.print(String.format("\nEnter first name [" + DEFAULT_FIRST_NAME + "]: ", randomNum));
        final var firstName = readInput(scanner, String.format(DEFAULT_FIRST_NAME, randomNum));
        subscriberDetails.setFirstName(firstName);
        //endregion firstName

        //region lastName
        System.out.print(String.format("Enter last name [" + DEFAULT_LAST_NAME + "]: ", randomNum));
        final var lastName = readInput(scanner, String.format(DEFAULT_LAST_NAME, randomNum));
        subscriberDetails.setLastName(lastName);
        //endregion lastName


        //region locationId
        final var defaultLocationId = locationManager.getDefaultLocationIdForCustomer(customerId).get();
        System.out.print(String.format("Enter location ID [" + defaultLocationId + "]: "));
        final var locationId = readInput(scanner, defaultLocationId);
        subscriberDetails.setLocationId(locationId);
        //endregion locationId

        //region phoneNumber
        final var orgId = wholesaleCustomerManager.getWholesaleCustomer(customerId).getOrgId();
        final var phoneNumbersList = numbersManager.listAvailablePhoneNumbers(orgId, locationId);
        final var defaultPhoneNumber = phoneNumbersList.get(0);
        System.out.printf(String.format("Enter primary phone number [%s]: ", defaultPhoneNumber));
        final var phoneNumber = validatePhoneNumber(readInput(scanner, defaultPhoneNumber), phoneNumbersList, defaultPhoneNumber);
        subscriberDetails.setPhoneNumber(phoneNumber);
        //endregion phoneNumber

        //region extension
        final var defaultExt = phoneNumber.isEmpty() ? buildRandomSubscriberProvisioningExtension()
                : phoneNumber.substring(phoneNumber.length() - 4);
        System.out.print(String.format("Enter extension number [%s]: ", defaultExt));
        final var extension = readInput(scanner, defaultExt);
        subscriberDetails.setExtension(extension);
        //endregion extension

        //endregion Provisioning Parameters

        // region packages
        List<Object> packages = new ArrayList<>();
        packages.add("webex_voice");
        subscriberDetails.setPackages(packages);
        //endregion packages

        return subscriberDetails;
    }

    private String readInput(final Scanner scanner, final String defaultValue) {
        final var input = scanner.nextLine().trim();
        return input.isEmpty() ? defaultValue : input;
    }

    private String buildRandomSubscriberProvisioningExtension() {
        final int randomExtension = ThreadLocalRandom.current().nextInt(10, 100000);
        return String.valueOf(EMERGENCY_EXTENSIONS.contains(randomExtension) ? randomExtension + 1 : randomExtension);
    }

    private String validatePhoneNumber(final String phoneNumber, final List<String> phoneNumberList, final String defaultPhoneNumber) {
        if (!phoneNumberList.contains(phoneNumber)) {
            System.out.printf("PhoneNumber provided is not present in available phoneNumbers for the location. Defaulting to %s%n", defaultPhoneNumber);
            return defaultPhoneNumber;
        }
        return phoneNumber;
    }
}
