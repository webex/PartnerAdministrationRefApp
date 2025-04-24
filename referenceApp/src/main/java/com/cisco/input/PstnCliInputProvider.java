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
import com.cisco.model.PstnDetails;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class PstnCliInputProvider implements PstnInputProvider {

    private Scanner scanner;
    private ReferenceApplicationProperties properties;

    public PstnCliInputProvider(final Scanner scanner,
                                final ReferenceApplicationProperties properties) {
        this.scanner = scanner;
        this.properties = properties;
    }

    @Override
    public PstnDetails getProvisioningDetails() {

        final var pstnDetails = new PstnDetails();

        System.out.print("Enter organization ID: ");
        final var orgId = scanner.nextLine();
        pstnDetails.setOrgId(orgId);

        System.out.print("Enter location ID: ");
        final var locationId = scanner.nextLine();
        pstnDetails.setLocationId(locationId);

        return pstnDetails;
    }

    @Override
    public String getPstnConnectionProviderId() {

        final var defaultPstnConnectionProviderId = properties.getPstnConnectionProviderId();

        System.out.print("Enter PSTN connection provider ID" +
                (defaultPstnConnectionProviderId.isBlank() ? ": " : " [" + defaultPstnConnectionProviderId + "]: "));
        final var pstnConnectionProviderId = scanner.nextLine().trim();

        return pstnConnectionProviderId.isEmpty() ? defaultPstnConnectionProviderId : pstnConnectionProviderId;
    }
}
