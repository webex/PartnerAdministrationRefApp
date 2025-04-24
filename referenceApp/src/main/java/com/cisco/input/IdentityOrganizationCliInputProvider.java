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

import com.cisco.model.IdentityOrganizationDetails;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class IdentityOrganizationCliInputProvider implements IdentityOrganizationInputProvider {

    private final Scanner scanner;

    public IdentityOrganizationCliInputProvider(final Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public final String getIdentityOrganizationId() {

        System.out.print("Enter An Identity Organization ID: ");
        final var orgId = scanner.nextLine();

        return orgId;
    }

    @Override
    public final IdentityOrganizationDetails getIdentityOrganizationDetails() {
        final var identityOrgDetails = new IdentityOrganizationDetails();

        System.out.print("Enter An Identity Organization ID: ");
        final var orgId = scanner.nextLine();
        identityOrgDetails.setId(orgId);

        System.out.print("Enter A New Organization Name: ");
        final String displayName = scanner.nextLine();
        identityOrgDetails.setDisplayName(displayName);

        return identityOrgDetails;
    }
}
