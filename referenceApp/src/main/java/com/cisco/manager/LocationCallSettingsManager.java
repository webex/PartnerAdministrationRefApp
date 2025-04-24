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
import com.cisco.input.LocationCallSettingsInputProvider;
import com.cisco.mapper.LocationCallSettingsMapper;
import com.cisco.model.LocationCallSettingsRequest;

import org.springframework.stereotype.Component;

@Component
public class LocationCallSettingsManager {
    private LocationCallSettingsInputProvider locationCallSettingsInputProvider;
    private LocationCallSettingsMapper locationCallSettingsMapper;
    private final WebexClient webexClient;

    public LocationCallSettingsManager(final LocationCallSettingsInputProvider locationCallSettingsInputProvider,
                                       final LocationCallSettingsMapper locationCallSettingsMapper,
                                       final WebexClient webexClient) {
        this.locationCallSettingsInputProvider = locationCallSettingsInputProvider;
        this.locationCallSettingsMapper = locationCallSettingsMapper;
        this.webexClient = webexClient;
    }

    public boolean updateLocationCallSettings()
    {
        final var details = locationCallSettingsInputProvider.getProvisioningDetails();
        final var request = locationCallSettingsMapper.toLocationCallSettingsRequest(details.getCallingLineIdName(), details.getPhoneNumber());

        try {
            updateLocationCallSettings(details.getLocationId(), details.getOrgId(), request);
            return true;
        } catch (final ClientException e) {
            System.err.println("Error while configuring Phone Number as main number for the location:" + e.getMessage());
            return false;
        }
    }

    public boolean updateLocationCallSettings(final String locationId,
                                              final String orgId,
                                              final String phoneNumber) {
        final var callingLineIdName = locationCallSettingsInputProvider.getCallingLineIdName();
        final var request = locationCallSettingsMapper.toLocationCallSettingsRequest(callingLineIdName, phoneNumber);

        try {
            updateLocationCallSettings(locationId, orgId, request);
            return true;
        } catch (final ClientException e) {
            System.err.println("Error while configuring Phone Number as main number for the location:" + e.getMessage());
            return false;
        }
    }

    private void updateLocationCallSettings(final String locationId,
                                            final String orgId,
                                            final LocationCallSettingsRequest requestBody)
    {
        webexClient.updateLocationCallSettings(locationId, orgId, requestBody);
    }
}
