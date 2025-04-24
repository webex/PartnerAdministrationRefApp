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
package com.cisco.auth;

import com.cisco.input.OAuthInputProvider;
import com.cisco.model.TokenInfo;
import org.springframework.web.client.RestTemplate;

/**
 * Provide authorization token using authorization code from the OAuthInputProvider.
 * This assumes that the authorization code is obtained previously and stored in the OAuthInputProvider.
 */
public class AuthorizationCodeToAccessTokenProvider extends AccessTokenProvider {

    private final OAuthInputProvider oAuthInputProvider;

    public AuthorizationCodeToAccessTokenProvider(final OAuthInputProvider oAuthInputProvider,
                                                  final TokenPersister tokenPersister,
                                                  final RestTemplate restTemplate) {
        super(tokenPersister, restTemplate, oAuthInputProvider);

        this.oAuthInputProvider = oAuthInputProvider;
    }

    @Override
    protected TokenInfo login() {
        return this.obtainAccessTokenWithAuthorizationCode(this.oAuthInputProvider.getClientId(),
                this.oAuthInputProvider.getClientSecret(),
                this.oAuthInputProvider.getAuthorizationCode(),
                this.oAuthInputProvider.getRedirectUri());
    }
}
