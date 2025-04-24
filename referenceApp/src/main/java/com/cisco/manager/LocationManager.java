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
import com.cisco.input.LocationInputProvider;
import com.cisco.mapper.LocationMapper;
import com.cisco.util.JsonUtil;
import org.openapitools.client.model.ListLocations200Response;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class LocationManager {

    private final LocationInputProvider locationInputProvider;
    private final LocationMapper locationMapper;
    private final WholesaleCustomerManager wholesaleCustomerManager;
    private final WebexClient webexClient;

    public LocationManager(final LocationInputProvider locationInputProvider,
                           final LocationMapper locationMapper,
                           final WholesaleCustomerManager wholesaleCustomerManager,
                           final WebexClient webexClient) {
        this.locationInputProvider = locationInputProvider;
        this.locationMapper = locationMapper;
        this.wholesaleCustomerManager = wholesaleCustomerManager;
        this.webexClient = webexClient;
    }

    public String createLocation() {
        final var locationDetails = locationInputProvider.getProvisioningDetails();
        final var request = locationMapper.toCreateALocationRequest(locationDetails);

        final var location = webexClient.createALocation(locationDetails.getOrgId(), request);

        return JsonUtil.prettyPrintJson(location.toJson());
    }

    public ListLocations200Response listLocations() {
        final var orgId = locationInputProvider.getOrganizationId();

        if (orgId.isPresent()) {
            return listLocations(orgId.get());
        } else {
            return listLocations(null);
        }
    }

    public ListLocations200Response listLocations(final String orgId) {
        return webexClient.listLocations(null, null, orgId, null);
    }

    public Optional<String> getDefaultLocationIdForCustomer(final String customerId) {
        try {
            final var orgId = wholesaleCustomerManager.getWholesaleCustomer(customerId).getOrgId();
            return getFirstLocationIdForOrg(orgId);
        } catch (ClientException e) {
            System.err.println("Error obtaining default location for customer");
        }
        return Optional.empty();
    }

    public Optional<String> getFirstLocationIdForOrg(final String orgId) {
        try {
            final var locationsList = listLocations(orgId);
            return JsonUtil.getFirstLocationIdForOrg(locationsList.toJson());
        } catch (Exception e) {
            System.err.println("Error obtaining locations list");
        }

        return Optional.empty();
    }
}
