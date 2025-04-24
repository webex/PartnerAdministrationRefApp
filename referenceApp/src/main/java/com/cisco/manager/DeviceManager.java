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

import com.cisco.client.WebexClient;
import com.cisco.input.DeviceInputProvider;
import com.cisco.mapper.DeviceMapper;
import com.cisco.util.MacAddrUtil;
import org.openapitools.client.model.CreateADeviceByMACAddress200Response;
import org.openapitools.client.model.CreateADeviceByMACAddressRequest;
import org.springframework.stereotype.Component;

@Component
public class DeviceManager {

    private final WebexClient webexClient;
    private final DeviceInputProvider deviceInputProvider;
    private final DeviceMapper deviceMapper;

    public DeviceManager(final WebexClient webexClient,
                         final DeviceInputProvider deviceInputProvider,
                         final DeviceMapper deviceMapper) {
        this.webexClient = webexClient;
        this.deviceInputProvider = deviceInputProvider;
        this.deviceMapper = deviceMapper;
    }

    public CreateADeviceByMACAddress200Response createDevice() {
        final var deviceDetails = deviceInputProvider.getProvisioningDetails();
        final var request = deviceMapper.toCreateADeviceByMACAddressRequest(deviceDetails);

        return createDevice(deviceDetails.getOrgId(), request);
    }

    public CreateADeviceByMACAddress200Response createDevice(final String subscriberId) {
        final var deviceDetails = deviceInputProvider.getProvisioningDetails(subscriberId);
        final var request = deviceMapper.toCreateADeviceByMACAddressRequest(deviceDetails);

        return createDevice(deviceDetails.getOrgId(), request);

    }

    public CreateADeviceByMACAddress200Response createDevice(String orgId, CreateADeviceByMACAddressRequest request) {
        final var response = webexClient.createADeviceByMACAddress(orgId, request);
        return response;
    }
}
