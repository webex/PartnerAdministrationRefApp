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

public class RefreshTokenToAccessTokenProvider extends AccessTokenProvider {

    private final String webexClientId;
    private final String webexClientSecret;
    private final String refreshToken;

    public RefreshTokenToAccessTokenProvider(final TokenPersister tokenPersister,
                                             final OAuthInputProvider oAuthInputProvider,
                                             final RestTemplate restTemplate,
                                             final String webexClientId,
                                             final String webexClientSecret,
                                             final String refreshToken) {
        super(tokenPersister, restTemplate, oAuthInputProvider);
        this.webexClientId = webexClientId;
        this.webexClientSecret = webexClientSecret;
        this.refreshToken = refreshToken;
    }

    @Override
    protected TokenInfo login() {
        return this.obtainAccessTokenWithRefreshToken(this.webexClientId,
                this.webexClientSecret,
                this.refreshToken);
    }
}
