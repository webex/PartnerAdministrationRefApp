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

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@Component
public class OAuthCliInputProvider implements OAuthInputProvider {

    private final Scanner scanner;

    @Value("${webex.client-id:}")
    private String clientId;

    @Value("${webex.client-secret:}")
    private String clientSecret;

    @Value("${webex.redirect-uri:}")
    private String redirectUri;

    @Value("${webex.authorization-code:}")
    private String authorizationCode;

    @Value("${webex.scopes:}")
    private List<String> scopes;

    public OAuthCliInputProvider(final Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String getClientId() {
        if (this.clientId == null || this.clientId.isEmpty()) {
            System.out.print("Enter OAuth client ID: ");
            this.clientId = scanner.nextLine();
        }

        return this.clientId;
    }

    @Override
    public String getClientSecret() {
        if (this.clientSecret == null || this.clientSecret.isEmpty()) {
            System.out.print("Enter OAuth client secret: ");
            this.clientSecret = scanner.nextLine();
        }

        return this.clientSecret;
    }

    @Override
    public String getRedirectUri() {
        if (this.redirectUri == null || this.redirectUri.isEmpty()) {
            System.out.print("Enter OAuth redirect URI: ");
            this.redirectUri = scanner.nextLine();
        }

        return this.redirectUri;
    }

    @Override
    public String getAuthorizationCode() {
        if (this.authorizationCode == null || this.authorizationCode.isEmpty()) {
            System.out.print("Enter OAuth authorization code: ");
            this.authorizationCode = scanner.nextLine();
        }

        return this.authorizationCode;
    }

    @Override
    public List<String> getScopes() {
        if (this.scopes == null || this.scopes.isEmpty()) {
            System.out.print("Enter scopes (comma separated): ");
            this.scopes = Arrays.asList(scanner.nextLine().split(","));
        }

        return this.scopes;
    }
}
