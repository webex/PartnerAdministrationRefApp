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
import com.cisco.input.PstnInputProvider;
import org.openapitools.client.model.SetupPSTNConnectionForALocationRequest;
import org.springframework.stereotype.Component;

@Component
public class PstnManager {

    private final PstnInputProvider pstnInputProvider;
    private final WebexClient webexClient;

    public PstnManager(final PstnInputProvider pstnInputProvider, final WebexClient webexClient) {
        this.pstnInputProvider = pstnInputProvider;
        this.webexClient = webexClient;
    }

    public boolean setupPSTNConnection() {

        final var pstnDetails = pstnInputProvider.getProvisioningDetails();

        try {
            return setupPSTNConnection(pstnDetails.getLocationId(), pstnDetails.getOrgId());
        } catch (final ClientException e) {
            System.err.println("Error setting up PSTN connection: " + e.getMessage());
            return false;
        }
    }

    public boolean setupPSTNConnection(final String locationId, final String orgId) {
        final var request = new SetupPSTNConnectionForALocationRequest();
        final var pstnConnectionProviderId = pstnInputProvider.getPstnConnectionProviderId();
        request.setId(pstnConnectionProviderId);

        // Setup PTSN connection
        webexClient.setupPSTNConnectionForALocation(locationId, orgId, request);

        // Get and verify the PSTN connection is set up as expected
        final var response = webexClient.retrievePSTNConnectionForALocation(locationId, orgId);

        return pstnConnectionProviderId.equals(response.getId());
    }
}

