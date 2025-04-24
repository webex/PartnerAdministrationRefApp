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

import com.cisco.model.AddressDetails;
import com.cisco.model.LocationDetails;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.Scanner;

@Component
public class LocationCliInputProvider implements LocationInputProvider {

    private static String DEFAULT_LOCATION_NAME = "Office-%3d";
    private static String DEFAULT_TIME_ZONE = "America/NY";
    private static String DEFAULT_PREFERRED_LANGUAGE = "en_us";
    private static String DEFAULT_ANNOUNCEMENT_LANGUAGE = "en_us";
    private static String DEFAULT_ADDRESS_LINE1 = "20 Cooper Square";
    private static String DEFAULT_ADDRESS_LINE2 = "Main Street";
    private static String DEFAULT_CITY = "New York";
    private static String DEFAULT_STATE = "NY";
    private static String DEFAULT_POSTAL_CODE = "10011";
    private static String DEFAULT_COUNTRY = "US";

    private Scanner scanner;

    public LocationCliInputProvider(final Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Optional<String> getOrganizationId() {
        System.out.print("Enter organization ID: ");
        final var orgId = readInput("");

        return orgId.isEmpty() ? Optional.empty() : Optional.of(orgId);
    }

    @Override
    public LocationDetails getProvisioningDetails() {

        final var locationDetails = new LocationDetails();
        final var randomNum = new java.util.Random().nextInt(100);

        //region orgId
        System.out.print("Enter organization ID []: ");
        final var orgId = readInput("");
        if (!orgId.isEmpty()) {
            locationDetails.setOrgId(orgId);
        }
        //endregion orgId

        //region name
        System.out.print(String.format("Enter name [" + DEFAULT_LOCATION_NAME + "]: ", randomNum));
        final var name = readInput(String.format(DEFAULT_LOCATION_NAME, randomNum));
        locationDetails.setName(name);
        //endregion name

        //region timeZone
        System.out.print("Enter timeZone ["+  DEFAULT_TIME_ZONE + "]: ");
        final var timeZone = readInput(DEFAULT_TIME_ZONE);
        locationDetails.setTimeZone(timeZone);
        //endregion timeZone

        //region preferredLanguage
        System.out.print("Enter preferredLanguage [" + DEFAULT_PREFERRED_LANGUAGE + "]: ");
        final var preferredLanguage = readInput(DEFAULT_PREFERRED_LANGUAGE);
        locationDetails.setPreferredLanguage(preferredLanguage);
        //endregion preferredLanguage

        //region announcementLanguage
        System.out.print("Enter announcementLanguage [" + DEFAULT_ANNOUNCEMENT_LANGUAGE + "]: ");
        final var announcementLanguage = readInput(DEFAULT_ANNOUNCEMENT_LANGUAGE);
        locationDetails.setAnnouncementLanguage(announcementLanguage);
        //endregion announcementLanguage

        //region address
        AddressDetails address = new AddressDetails();

        //region addressLine1
        System.out.print("Enter address line 1 [" + DEFAULT_ADDRESS_LINE1 + "]: ");
        final var addressLine1 = readInput(DEFAULT_ADDRESS_LINE1);
        address.setAddress1(addressLine1);
        //endregion addressLine1

        //region addressLine2
        System.out.print("Enter address line 2 [" + DEFAULT_ADDRESS_LINE2 + "]: ");
        final var addressLine2 = readInput(DEFAULT_ADDRESS_LINE2);
        address.setAddress2(addressLine2);
        //endregion addressLine2

        //region city
        System.out.print("Enter city [" + DEFAULT_CITY + "]: ");
        final var city = readInput(DEFAULT_CITY);
        address.setCity(city);
        //endregion city

        //region state
        System.out.print("Enter state [" + DEFAULT_STATE + "]: ");
        final var state = readInput(DEFAULT_STATE);
        address.setState(state);
        //endregion state

        //region postalCode
        System.out.print("Enter Postal Code [" + DEFAULT_POSTAL_CODE + "]: ");
        final var postalCode = readInput(DEFAULT_POSTAL_CODE);
        address.setPostalCode(postalCode);
        //endregion postalCode

        //region country
        System.out.print("Enter country [" + DEFAULT_COUNTRY + "]: ");
        final var country = readInput(DEFAULT_COUNTRY);
        address.setCountry(country);
        //endregion country

        locationDetails.setAddress(address);
        //endregion address

        //region latitude
        System.out.print("Enter latitude []: ");
        final var latitude = readInput("");
        if (!latitude.isEmpty()) {
            locationDetails.setLatitude(latitude);
        }
        //endregion latitude

        //region longitude
        System.out.print("Enter longitude []: ");
        final var longitude = readInput("");
        if (!longitude.isEmpty()) {
            locationDetails.setLongitude(longitude);
        }
        //endregion longitude

        //region notes
        System.out.print("Enter notes []: ");
        final var notes = readInput("");
        if (!notes.isEmpty()) {
            locationDetails.setNotes(notes);
        }
        //endregion notes

        return locationDetails;
    }

    private String readInput(final String defaultValue) {
        final var input = this.scanner.nextLine().trim();
        return input.isEmpty() ? defaultValue : input;
    }
}
