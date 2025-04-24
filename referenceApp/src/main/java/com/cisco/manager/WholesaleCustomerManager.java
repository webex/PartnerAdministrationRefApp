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
import com.cisco.input.WholesaleCustomerInputProvider;
import com.cisco.mapper.WholesaleCustomerMapper;
import com.cisco.util.JsonUtil;
import com.cisco.util.SpinnerAnimation;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.model.GetAWholesaleCustomer200Response;
import org.openapitools.client.model.ListWholesaleCustomers200Response;
import org.openapitools.client.model.ProvisionAWholesaleCustomer202Response;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Supplier;

@Component
public class WholesaleCustomerManager {

    private final WebexClient webexClient;
    private final WholesaleCustomerInputProvider wholesaleCustomerInputProvider;
    private final WholesaleCustomerMapper wholesaleCustomerMapper;

    public WholesaleCustomerManager(final WebexClient webexClient,
                                    @Lazy final WholesaleCustomerInputProvider wholesaleCustomerInputProvider,
                                    @Lazy final WholesaleCustomerMapper wholesaleCustomerMapper) {
        this.webexClient = webexClient;
        this.wholesaleCustomerInputProvider = wholesaleCustomerInputProvider;
        this.wholesaleCustomerMapper = wholesaleCustomerMapper;
    }

    public ListWholesaleCustomers200Response listWholesaleCustomers() {
        try {
            return webexClient.listWholesaleCustomers(null, null, null, null, null, null);
        } catch (ClientException e) {
            System.err.println("Exception when calling listWholesaleCustomers API: " + e.getMessage());
            throw e;
        }
    }

    public ApiResponse<ListWholesaleCustomers200Response> listWholesaleCustomers(final String orgId, final int max, final int offset) {
        try {
            return webexClient.listWholesaleCustomersWithHttpInfo(null, null, null, String.valueOf(offset), String.valueOf(max), null);
        } catch (ClientException e) {
            System.err.println("Exception when calling listWholesaleCustomers (with pagination) API");
            e.printStackTrace();
            throw e;
        }
    }

    public GetAWholesaleCustomer200Response getWholesaleCustomer() {
        final var customerId = wholesaleCustomerInputProvider.getCustomerId();

        return getWholesaleCustomer(customerId);
    }

    public GetAWholesaleCustomer200Response getWholesaleCustomer(final String customerId) {
        try {
            return webexClient.getAWholesaleCustomer(customerId, null);
        } catch (ClientException e) {
            System.err.println("Exception when calling getWholesaleCustomer API: " + e.getMessage());
            throw e;
        }
    }

    public ProvisionAWholesaleCustomer202Response provisionAWholesaleCustomer() throws ClientException {
        final var customerProvisioningDetails = wholesaleCustomerInputProvider.getProvisioningDetails();
        final var request = wholesaleCustomerMapper.toProvisionAWholesaleCustomerRequest(customerProvisioningDetails);

        return webexClient.provisionAWholesaleCustomer(null, request);
    }

    public boolean pollCustomerForProvisionedStatus(String customerId) {

        final var maxTimeMillis = 2 * 60 * 1000; // 2 minutes in milliseconds

        Supplier<GetAWholesaleCustomer200Response.StatusEnum> customerProvisioningStatusSupplier = () -> {
            try {
                return getWholesaleCustomer(customerId).getStatus();
            } catch (ClientException e) {
                System.err.println("Exception when calling getWholesaleCustomer API: " + e.getMessage());
                return GetAWholesaleCustomer200Response.StatusEnum.ERROR;
            }
        };

        var status = SpinnerAnimation.pollForStatus(
            "customer provisioning",
            customerProvisioningStatusSupplier,
            GetAWholesaleCustomer200Response.StatusEnum.PROVISIONED,
            List.of(
                GetAWholesaleCustomer200Response.StatusEnum.ERROR,
                GetAWholesaleCustomer200Response.StatusEnum.PROVISIONED_WITH_ERRORS
            ),
            maxTimeMillis
        );

        return status == GetAWholesaleCustomer200Response.StatusEnum.PROVISIONED;
    }

    public String getCustomerIdFromProvisionWholesaleCustomerResponse(ProvisionAWholesaleCustomer202Response response) {
        final var url = response.getUrl();
        return url.substring(url.lastIndexOf('/') + 1);
    }

    public String getDefaultCustomerId() {
        return JsonUtil.getMostRecentCustomerId(listWholesaleCustomers().toJson()).get();
    }
}
