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

public class SubscriberOnboardingStatus {
    private static boolean subscriberCreated = false;
    private static boolean deviceAdded = false;
    private static boolean onboardingComplete = false;
    private static String personId;
    private static String deviceId;

    public static boolean isSubscriberCreated() {
        return subscriberCreated;
    }

    public static boolean isDeviceAdded() {
        return deviceAdded;
    }

    public static boolean isOnboardingComplete() {
        return onboardingComplete;
    }

    public static String getPersonId() {
        return personId;
    }

    public static String getDeviceId() {
        return deviceId;
    }

    public static void setSubscriberCreated(final boolean subscriberCreated) {
        SubscriberOnboardingStatus.subscriberCreated = subscriberCreated;
    }

    public static void setDeviceAdded(final boolean deviceAdded) {
        SubscriberOnboardingStatus.deviceAdded = deviceAdded;
    }

    public static void setPersonId(final String personId) {
        SubscriberOnboardingStatus.personId = personId;
    }

    public static void setDeviceId(final String deviceId) {
        SubscriberOnboardingStatus.deviceId = deviceId;
    }

    public static void setOnboardingComplete(final boolean onboardingComplete) {
        SubscriberOnboardingStatus.onboardingComplete = onboardingComplete;
    }
}
