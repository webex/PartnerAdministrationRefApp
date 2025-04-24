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

import com.cisco.model.PhoneNumberDetails;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

@Component
public class PhoneNumberCliInputProvider implements PhoneNumberInputProvider {

    private final Scanner scanner;

    public PhoneNumberCliInputProvider(final Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public PhoneNumberDetails getProvisioningDetails() {

        final var phoneNumberDetails = new PhoneNumberDetails();

        System.out.print("Enter organization ID: ");
        final var orgId = scanner.nextLine();
        phoneNumberDetails.setOrgId(orgId);

        System.out.print("Enter location ID: ");
        final var locationId = scanner.nextLine();
        phoneNumberDetails.setLocationId(locationId);

        phoneNumberDetails.setPhoneNumbers(this.getPhoneNumbers());

        return phoneNumberDetails;
    }

    @Override
    public List<String> getPhoneNumbers() {
        System.out.print("Enter phone numbers (separated by commas): ");

        final var phoneNumbers = scanner.nextLine();
        final var phoneNumbersArray = phoneNumbers.split(",");

        final var phoneNumbersList = new ArrayList<String>();
        for (String phoneNumber : phoneNumbersArray) {
            phoneNumbersList.add(phoneNumber.trim());
        }

        return phoneNumbersList.isEmpty() ? Collections.emptyList() : phoneNumbersList;
    }

    @Override
    public PhoneNumberDetails getLocationIdAndOrgId() {

        final var phoneNumberDetails = new PhoneNumberDetails();

        System.out.print("Enter organization ID: ");
        final var orgId = scanner.nextLine();
        phoneNumberDetails.setOrgId(orgId);

        System.out.print("Enter location ID: ");
        final var locationId = scanner.nextLine();
        phoneNumberDetails.setLocationId(locationId);

        return phoneNumberDetails;
    }
}
