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

import com.cisco.manager.WholesaleCustomerManager;
import com.cisco.manager.WholesaleSubscriberManager;
import com.cisco.model.DeviceDetails;
import com.cisco.util.MacAddrUtil;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class DeviceCliInputProvider implements DeviceInputProvider {

    public static final String DEFAULT_PHONE_MODEL = "Cisco 8865";

    final Scanner scanner;
    final WholesaleCustomerManager wholesaleCustomerManager;
    final WholesaleSubscriberManager wholesaleSubscriberManager;
    final MacAddrUtil macAddrUtil;

    public DeviceCliInputProvider(final Scanner scanner,
                                  final WholesaleCustomerManager wholesaleCustomerManager,
                                  final WholesaleSubscriberManager wholesaleSubscriberManager,
                                  final MacAddrUtil macAddrUtil) {
        this.scanner = scanner;
        this.wholesaleCustomerManager = wholesaleCustomerManager;
        this.wholesaleSubscriberManager = wholesaleSubscriberManager;
        this.macAddrUtil = macAddrUtil;
    }

    @Override
    public DeviceDetails getProvisioningDetails() {

        final var defaultCustomerId = wholesaleCustomerManager.getDefaultCustomerId();
        System.out.print("Enter customerId [" +  defaultCustomerId + "]: ");
        final var customerId = readInput(defaultCustomerId);

        final var defaultSubscriberId = wholesaleSubscriberManager.getDefaultSubscriberId(customerId);

        return getProvisioningDetails(defaultSubscriberId);
    }

    @Override
    public DeviceDetails getProvisioningDetails(final String defaultSubscriberId) {

        //region subscriberId
        System.out.print("Enter subscriberId [" +  defaultSubscriberId + "]: ");
        final var subscriberId = readInput(defaultSubscriberId);
        //endregion subscriberId

        //region personId
        final var subscriber = wholesaleSubscriberManager.getWholesaleSubscriber(subscriberId);
        final var personId = subscriber.getPersonId();
        //endregion personId

        // region orgId
        final var customerId = subscriber.getCustomerId();
        final var orgId = wholesaleCustomerManager.getWholesaleCustomer(customerId).getOrgId();
        // endregion orgId

        // region phoneModel
        System.out.print("Enter phone model [" + DEFAULT_PHONE_MODEL + "]: ");
        final var phoneModel = readInput(DEFAULT_PHONE_MODEL);
        // endregion phoneModel

        // region macAddress
        final var defaultMacAddress = macAddrUtil.generateRandomMacAddress();
        System.out.print("Enter MAC address [" + defaultMacAddress + "]: ");
        final var macAddress = readInput(defaultMacAddress);
        // endregion macAddress

        return new DeviceDetails(orgId, personId, phoneModel, macAddress);
    }

    private String readInput(final String defaultValue) {
        final var input = this.scanner.nextLine().trim();
        return input.isEmpty() ? defaultValue : input;
    }
}
