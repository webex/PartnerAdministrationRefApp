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

import com.cisco.config.ReferenceApplicationProperties;
import com.cisco.manager.WholesaleCustomerManager;
import com.cisco.model.WholesaleCustomerDetails;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Scanner;

@Component
public class WholesaleCustomerCliInputProvider implements WholesaleCustomerInputProvider {

    private static String DEFAULT_PACKAGE = "webex_voice";
    private static String DEFAULT_EXTERNAL_ID = "%04d";
    private static String DEFAULT_ADDRESS = "1234 Broadway";
    private static String DEFAULT_CITY = "New York";
    private static String DEFAULT_STATE_OR_PROVINCE = "NY";
    private static String DEFAULT_ZIP_OR_POSTAL_CODE = "10001";
    private static String DEFAULT_COUNTRY = "US";
    private static String DEFAULT_NAME = "MyCompany";
    private static String DEFAULT_PRIMARY_EMAIL = "mycompany%sadmin@wbxlab.us";
    private static String DEFAULT_LANGUAGE = "en";
    private static String DEFAULT_LOCATION_NAME = "Headquarters";
    private static String DEFAULT_LOCATION_ADDRESS_LINE_1 = DEFAULT_ADDRESS;
    private static String DEFAULT_LOCATION_CITY = DEFAULT_CITY;
    private static String DEFAULT_LOCATION_STATE_OR_PROVINCE = DEFAULT_STATE_OR_PROVINCE;
    private static String DEFAULT_LOCATION_ZIP_OR_POSTAL_CODE = DEFAULT_ZIP_OR_POSTAL_CODE;
    private static String DEFAULT_LOCATION_COUNTRY = DEFAULT_COUNTRY;
    private static String DEFAULT_TIMEZONE = "America/New_York";
    private static String DEFAULT_LOCATION_TIMEZONE = DEFAULT_TIMEZONE;
    private static String DEFAULT_LOCATION_LANGUAGE = "en_us";
    private static String DEFAULT_LOCATION_EMERGENCY_ID = "95547321";
    private static String DEFAULT_MEETINGS_TIMEZONE = DEFAULT_TIMEZONE;

    private final ReferenceApplicationProperties properties;
    final WholesaleCustomerManager wholesaleCustomerManager;
    final Scanner scanner;

    public WholesaleCustomerCliInputProvider(final ReferenceApplicationProperties properties,
                                             final WholesaleCustomerManager wholesaleCustomerManager,
                                             final Scanner scanner) {
        this.properties = properties;
        this.wholesaleCustomerManager = wholesaleCustomerManager;
        this.scanner = scanner;
    }

    @Override
    public String getCustomerId() {

        final var defaultCustomerId = wholesaleCustomerManager.getDefaultCustomerId();

        System.out.print("Enter customer ID [" + defaultCustomerId + "]: ");
        final var customerId = readInput(scanner, defaultCustomerId);

        return customerId;
    }

    @Override
    public WholesaleCustomerDetails getProvisioningDetails() {

        final var wholesaleCustomerDetails = new WholesaleCustomerDetails();

        //region provisioningId
        final var defaultProvisioningId = properties.getProvisioningId();
        System.out.print("\nEnter provisioningId" +
                (defaultProvisioningId.isBlank() ? ": " : " [" + defaultProvisioningId + "]: "));

        final String provisioningId = readInput(scanner, defaultProvisioningId);
        wholesaleCustomerDetails.setProvisioningId(provisioningId);
        //endregion

        //region packages
        /*
         * Provide a single package, with default of webex_voice
         * Other options for packages are:
         * common_area_calling
         * webex_calling
         * webex_meetings
         * webex_suite
         * cx_essentials
         */

        System.out.print("Enter package [" + DEFAULT_PACKAGE + "]: ");
        final var packageStr = readInput(scanner, DEFAULT_PACKAGE);
        final var packages = new ArrayList<>();
        packages.add(packageStr);
        wholesaleCustomerDetails.setPackages(packages);
        //endregion

        //region External ID
        final var externalIdRandomNum = new java.util.Random().nextInt(10000);
        System.out.print(String.format("Enter externalId [" + DEFAULT_EXTERNAL_ID + "]: ", externalIdRandomNum));
        final var externalId = readInput(scanner, String.format(DEFAULT_EXTERNAL_ID, externalIdRandomNum));
        wholesaleCustomerDetails.setExternalId(externalId);
        //endregion

        //region Address
        System.out.print("Address\n");

        //region Address Line 1
        System.out.print("Enter addressLine1 [" + DEFAULT_ADDRESS + "]: ");
        final var addressLine1 = readInput(scanner, DEFAULT_ADDRESS);
        wholesaleCustomerDetails.setAddressLine1(addressLine1);
        //endregion

        //region City
        System.out.print("Enter city [" + DEFAULT_CITY + "]: ");
        final var city = readInput(scanner, DEFAULT_CITY);
        wholesaleCustomerDetails.setCity(city);
        //endregion

        //region State or Province
        System.out.print("Enter State or Province [" + DEFAULT_STATE_OR_PROVINCE + "]: ");
        final var stateOrProvince = readInput(scanner, DEFAULT_STATE_OR_PROVINCE);
        wholesaleCustomerDetails.setStateOrProvince(stateOrProvince);
        //endregion

        //region ZIP or postal code
        System.out.print("Enter ZIP or postal code [" + DEFAULT_ZIP_OR_POSTAL_CODE + "]: ");
        final var zipOrPostalCode = readInput(scanner, DEFAULT_ZIP_OR_POSTAL_CODE);
        wholesaleCustomerDetails.setZipOrPostalCode(zipOrPostalCode);
        //endregion

        //region Country
        System.out.print("Enter country [" + DEFAULT_COUNTRY + "]: ");
        final var country = readInput(scanner, DEFAULT_COUNTRY);
        wholesaleCustomerDetails.setCountry(country);
        //endregion
        //endregion

        //region Customer Info
        System.out.print("Customer Info\n");
        //region Customer Name
        System.out.print(String.format("Enter customer name [" + DEFAULT_NAME + "-%s]: ", externalId));
        final var name = readInput(scanner, String.format(DEFAULT_NAME + "-%s", externalId));
        wholesaleCustomerDetails.setName(name);
        //endregion

        //region Primary Email
        System.out.print(String.format("Enter primary email [" + DEFAULT_PRIMARY_EMAIL + "]: ", externalId));
        final var primaryEmail = readInput(scanner, String.format(DEFAULT_PRIMARY_EMAIL, externalId));
        wholesaleCustomerDetails.setPrimaryEmail(primaryEmail);
        //endregion

        //region Language
        System.out.print("Enter language [" + DEFAULT_LANGUAGE + "]: ");
        final var language = readInput(scanner, DEFAULT_LANGUAGE);
        wholesaleCustomerDetails.setLanguage(language);
        //endregion
        //endregion

        //region Location
        System.out.print("Location\n");

        //region Location Name
        System.out.print("Enter location name [" + DEFAULT_LOCATION_NAME + "]: ");
        final var locationName = readInput(scanner, DEFAULT_LOCATION_NAME);
        wholesaleCustomerDetails.setLocationName(locationName);
        //endregion

        //region Location Address
        System.out.print("Location Address\n");

        //region Location Address Line 1
        System.out.print("Enter location addressLine1 [" + DEFAULT_LOCATION_ADDRESS_LINE_1 + "]: ");
        final var locationAddressLine1 = readInput(scanner, DEFAULT_LOCATION_ADDRESS_LINE_1);
        wholesaleCustomerDetails.setLocationAddressLine1(locationAddressLine1);
        //endregion

        //region Location city
        System.out.print("Enter location city [" + DEFAULT_LOCATION_CITY + "]: ");
        final var locationCity = readInput(scanner, DEFAULT_LOCATION_CITY);
        wholesaleCustomerDetails.setLocationCity(locationCity);
        //endregion

        //region Location State or Province
        System.out.print("Enter location State or Province [" + DEFAULT_LOCATION_STATE_OR_PROVINCE + "]: ");
        final var locationStateOrProvince = readInput(scanner, DEFAULT_LOCATION_STATE_OR_PROVINCE);
        wholesaleCustomerDetails.setLocationStateOrProvince(locationStateOrProvince);
        //endregion

        //region Location ZIP or postal code
        System.out.print("Enter location ZIP or postal code [" + DEFAULT_LOCATION_ZIP_OR_POSTAL_CODE + "]: ");
        final var locationZipOrPostalCode = readInput(scanner, DEFAULT_LOCATION_ZIP_OR_POSTAL_CODE);
        wholesaleCustomerDetails.setLocationZipOrPostalCode(locationZipOrPostalCode);
        //endregion

        //region Location country
        System.out.print("Enter location country [" + DEFAULT_LOCATION_COUNTRY + "]: ");
        final var locationCountry = readInput(scanner, DEFAULT_LOCATION_COUNTRY);
        wholesaleCustomerDetails.setLocationCountry(locationCountry);
        //endregion
        //endregion

        //region Location timezone
        System.out.print("Enter location timezone [" + DEFAULT_LOCATION_TIMEZONE + "]: ");
        final var locationTimezone = readInput(scanner, DEFAULT_LOCATION_TIMEZONE);
        wholesaleCustomerDetails.setLocationTimezone(locationTimezone);
        //endregion

        //region Location language
        System.out.print("Enter location language [" + DEFAULT_LOCATION_LANGUAGE + "]: ");
        final var locationLanguage = readInput(scanner, DEFAULT_LOCATION_LANGUAGE);
        wholesaleCustomerDetails.setLocationLanguage(locationLanguage);
        //endregion

        //region Location emergency identifier
        System.out.print("Enter location emergency identifier [" + DEFAULT_LOCATION_EMERGENCY_ID + "]: ");
        final var locationEmergencyId = readInput(scanner, DEFAULT_LOCATION_EMERGENCY_ID);
        wholesaleCustomerDetails.setLocationEmergencyId(locationEmergencyId);
        //endregion
        //endregion

        //region Meetings timezone
        System.out.print("Enter Webex Meetings timezone [" + DEFAULT_MEETINGS_TIMEZONE + "]: ");
        final var meetingsTimezone = readInput(scanner, DEFAULT_MEETINGS_TIMEZONE);
        wholesaleCustomerDetails.setMeetingsTimezone(meetingsTimezone);
        //endregion

        return wholesaleCustomerDetails;
    }

    private String readInput(final Scanner scanner, final String defaultValue) {
        final var input = scanner.nextLine().trim();
        return input.isEmpty() ? defaultValue : input;
    }
}
