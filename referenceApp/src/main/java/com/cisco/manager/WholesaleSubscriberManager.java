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
import com.cisco.input.WholesaleSubscriberInputProvider;
import com.cisco.mapper.WholesaleSubscriberMapper;
import com.cisco.util.JsonUtil;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.model.ListWholesaleSubscribers200Response;
import org.openapitools.client.model.ProvisionAWholesaleSubscriber200Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WholesaleSubscriberManager {

    private final WebexClient webexClient;
    private final WholesaleSubscriberInputProvider wholesaleSubscriberInputProvider;
    private final WholesaleSubscriberMapper wholesaleSubscriberMapper;

    @Autowired
    public WholesaleSubscriberManager(final WebexClient webexClient,
                                      final WholesaleSubscriberInputProvider wholesaleSubscriberInputProvider,
                                      final WholesaleSubscriberMapper wholesaleSubscriberMapper) {
        this.webexClient = webexClient;
        this.wholesaleSubscriberInputProvider = wholesaleSubscriberInputProvider;
        this.wholesaleSubscriberMapper = wholesaleSubscriberMapper;
    }

    public ProvisionAWholesaleSubscriber200Response provisionAWholesaleSubscriber() {
        final var subscriberProvisioningDetails = wholesaleSubscriberInputProvider.getProvisioningDetails();
        final var request = wholesaleSubscriberMapper.toProvisionAWholesaleSubscriberRequest(subscriberProvisioningDetails);

        try {
            return webexClient.provisionAWholesaleSubscriber(null, request);
        } catch (ClientException e) {
            System.err.println("Exception when calling provisionAWholesaleSubscriber API: " + e.getMessage());
            throw e;
        }
    }

    public ProvisionAWholesaleSubscriber200Response getWholesaleSubscriber() {
        final var subscriberId = wholesaleSubscriberInputProvider.getSubscriberId();

        return getWholesaleSubscriber(subscriberId);
    }

    public ProvisionAWholesaleSubscriber200Response getWholesaleSubscriber(final String subscriberId) {
        try {
            return webexClient.getAWholesaleSubscriber(subscriberId, null);
        } catch (ClientException e) {
            System.err.println("Exception when calling getWholesaleSubscriber API: " + e.getMessage());
            throw e;
        }
    }

    public ListWholesaleSubscribers200Response listWholesaleSubscribers(final String customerId) {
        try {
            return webexClient.listWholesaleSubscribers(
                null, null, customerId, null, null, null,
                null, null, null, null, null, null);
        } catch (ClientException e) {
            System.err.println("Exception when calling listWholesaleSubscribers API: " + e.getMessage());
            throw e;
        }
    }

    public ApiResponse<ListWholesaleSubscribers200Response> listWholesaleSubscribers(final String customerId, final int max, final int offset) {
        try {
            return webexClient.listWholesaleSubscribersWithHttpInfo(max, offset, customerId, null, null, null,
                null, null, null, null, null, null);
        } catch (ClientException e) {
            System.err.println("Exception when calling listWholesaleSubscribers (with pagination) API: " + e.getMessage());
            throw e;
        }
    }

    public String getDefaultSubscriberId(final String customerId) {
        final var subscriberList = listWholesaleSubscribers(customerId);

        if (subscriberList.getItems() == null || subscriberList.getItems().isEmpty()) {
            System.out.println("No subscribers found for customer ID: " + customerId);
            return "";
        }

        return JsonUtil.getMostRecentSubscriberId(subscriberList.toJson()).get();
    }
}
