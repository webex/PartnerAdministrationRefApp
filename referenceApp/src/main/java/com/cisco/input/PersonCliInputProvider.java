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

import com.cisco.manager.NumbersManager;
import com.cisco.model.PersonDetails;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;
@Component
public class PersonCliInputProvider implements PersonInputProvider {

    private final Scanner scanner;
    private final NumbersManager numbersManager;

    public PersonCliInputProvider(final Scanner scanner, final NumbersManager numbersManager) {
        this.scanner = scanner;
        this.numbersManager = numbersManager;
    }

    @Override
    public String getPersonId() {
        System.out.print("Enter person ID: ");
        return scanner.nextLine().trim();
    }

    @Override
    public String getPersonPhoneNumber(final PersonDetails personDetails) {
        final var phoneNumberList = numbersManager.listAvailablePhoneNumbers(
                personDetails.getOrgId(), personDetails.getLocationId());
        final var defaultPhoneNumber = phoneNumberList.get(0);
        System.out.printf(String.format("Enter primary phone number [%s]: ", defaultPhoneNumber));
        final var phoneNumber = readInput(scanner, defaultPhoneNumber);
        return validatePhoneNumber(phoneNumber, phoneNumberList, defaultPhoneNumber);
    }

    private String readInput(final Scanner scanner, final String defaultValue) {
        final var input = scanner.nextLine().trim();
        return input.isEmpty() ? defaultValue : input;
    }

    private String validatePhoneNumber(final String phoneNumber, final List<String> phoneNumberList, final String defaultPhoneNumber) {
        if (!phoneNumberList.contains(phoneNumber)) {
            System.out.printf("PhoneNumber provided is not present in available phoneNumbers for the location. Defaulting to %s%n", defaultPhoneNumber);
            return defaultPhoneNumber;
        }
        return phoneNumber;
    }
}
