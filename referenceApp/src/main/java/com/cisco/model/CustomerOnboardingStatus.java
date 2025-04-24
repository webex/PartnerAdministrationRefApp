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
package com.cisco.model;

public class CustomerOnboardingStatus {
    private static String orgId;
    private static String locationId;
    private static String customerId;
    private static boolean phoneNumbersAddedToLocation = false;
    private static boolean pstnConnectionSetUp = false;
    private static boolean mainNumberConfiguredForLocation = false;
    private static boolean onboardingComplete = false;

    public static String getOrgId() {
        return orgId;
    }

    public static void setOrgId(final String orgId) {
        CustomerOnboardingStatus.orgId = orgId;
    }

    public static String getLocationId() {
        return locationId;
    }

    public static void setLocationId(final String locationId) {
        CustomerOnboardingStatus.locationId = locationId;
    }

    public static String getCustomerId() {
        return customerId;
    }

    public static void setCustomerId(final String customerId) {
        CustomerOnboardingStatus.customerId = customerId;
    }

    public static boolean isPhoneNumbersAddedToLocation() {
        return phoneNumbersAddedToLocation;
    }

    public static void setPhoneNumbersAddedToLocation(final boolean phoneNumbersAddedToLocation) {
        CustomerOnboardingStatus.phoneNumbersAddedToLocation = phoneNumbersAddedToLocation;
    }

    public static boolean isPstnConnectionSetUp() {
        return pstnConnectionSetUp;
    }

    public static void setPstnConnectionSetUp(final boolean pstnConnectionSetUp) {
        CustomerOnboardingStatus.pstnConnectionSetUp = pstnConnectionSetUp;
    }

    public static boolean isMainNumberConfiguredForLocation() {
        return mainNumberConfiguredForLocation;
    }

    public static void setMainNumberConfiguredForLocation(final boolean configureMainNumberToLocation) {
        CustomerOnboardingStatus.mainNumberConfiguredForLocation = configureMainNumberToLocation;
    }

    public static boolean isOnboardingComplete() {
        return onboardingComplete;
    }

    public static void setOnboardingComplete(final boolean onboardingComplete) {
        CustomerOnboardingStatus.onboardingComplete = onboardingComplete;
    }
}
