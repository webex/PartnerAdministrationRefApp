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

import com.cisco.model.LocationCallSettingsDetails;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class LocationCallSettingsCliInputProvider implements LocationCallSettingsInputProvider {

    final static String DEFAULT_CALLING_ID_NAME = "My Company Outgoing";

    private Scanner scanner;

    public LocationCallSettingsCliInputProvider(final Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String getCallingLineIdName() {
        System.out.print("Enter calling line ID name [" + DEFAULT_CALLING_ID_NAME + "]: ");
        final var callingLineIdName = scanner.nextLine().trim();

        return callingLineIdName.isEmpty() ? DEFAULT_CALLING_ID_NAME : callingLineIdName;
    }

    @Override
    public LocationCallSettingsDetails getProvisioningDetails() {
        final var locationCallSettingsDetails = new LocationCallSettingsDetails();

        System.out.print("Enter organization ID: ");
        final var orgId = scanner.nextLine().trim();
        locationCallSettingsDetails.setOrgId(orgId);

        System.out.print("Enter location ID: ");
        final var locationId = scanner.nextLine().trim();
        locationCallSettingsDetails.setLocationId(locationId);

        System.out.print("Enter phone number: ");
        final var phoneNumber = scanner.nextLine().trim();
        locationCallSettingsDetails.setPhoneNumber(phoneNumber);

        System.out.print("Enter calling line ID name: ");
        final var callingLineIdName = scanner.nextLine().trim();
        locationCallSettingsDetails.setCallingLineIdName(callingLineIdName);

        return locationCallSettingsDetails;
    }
}
