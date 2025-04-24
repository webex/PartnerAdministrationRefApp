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
import com.google.gson.Gson;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Base64;

public abstract class AccessTokenProvider {

    private final static String ACCESS_TOKEN_URL = "https://webexapis.com/v1/access_token";

    private final RestTemplate restTemplate;
    private final TokenPersister tokenPersister;
    private TokenInfo tokenInfo;
    private final OAuthInputProvider oAuthInputProvider;

    public AccessTokenProvider(final TokenPersister tokenPersister,
                               final RestTemplate restTemplate,
                               final OAuthInputProvider oAuthInputProvider) {
        this.restTemplate = restTemplate;
        this.tokenPersister = tokenPersister;
        this.oAuthInputProvider = oAuthInputProvider;
    }

    public String getAccessToken() {
        if (tokenInfo == null) {
            try {
                this.tokenInfo = this.getAuthorization();
            } catch (final RuntimeException e) {
                throw new RuntimeException("Failed to obtain access token from authorization code", e);
            }
        }

        return "Bearer " + tokenInfo.getAccessToken();
    }

    protected abstract TokenInfo login();

    protected TokenInfo getAuthorization() throws RuntimeException {
        var refreshToken = tokenPersister.readRefreshToken();

        TokenInfo tokenInfo;
        if (refreshToken.isEmpty()) {
            try {
                tokenInfo = login();
            } catch (final RestClientException e) {
                throw new RuntimeException("Failed to obtain access token", e);
            }
        } else {
            System.out.println("Using existing refresh token to obtain access token");

            try {
                tokenInfo = obtainAccessTokenWithRefreshToken(this.oAuthInputProvider.getClientId(),
                        this.oAuthInputProvider.getClientSecret(), refreshToken.get());
            } catch (final RestClientException e) {
                throw new RuntimeException("Failed to obtain access token from refresh token", e);
            }
        }
        return tokenInfo;
    }

    protected TokenInfo obtainAccessTokenWithAuthorizationCode(final String clientId,
                                                               final String clientSecret,
                                                               final String authorizationCode,
                                                               final String redirectUri) throws RestClientException {

        final var tokenInfo = this.getAccessToken(clientId, clientSecret, authorizationCode, redirectUri);
        saveRefreshToken(tokenInfo);

        return tokenInfo;
    }

    protected TokenInfo obtainAccessTokenWithRefreshToken(final String clientId,
                                                          final String clientSecret,
                                                          final String refreshToken) throws RestClientException {

        final var tokenInfo = this.getAccessToken(clientId, clientSecret, refreshToken);

        saveRefreshToken(tokenInfo);

        return tokenInfo;
    }

    private TokenInfo getAccessToken(
            final String clientId,
            final String clientSecret,
            final String authorizationCode,
            final String redirectUri) throws RestClientException {

        // Populate request headers
        final var headers = getHeadersForAccessTokenRequest(clientId, clientSecret);

        // Populate request body
        final var body = "grant_type=authorization_code" +
                "&code=" + authorizationCode +
                "&redirect_uri=" + redirectUri;

        // Build request
        final var request = new HttpEntity<>(body, headers);

        return getAccessToken(request);
    }

    private TokenInfo getAccessToken(
            final String clientId,
            final String clientSecret,
            final String refreshToken) throws RestClientException {

        // Populate request headers
        final var headers = getHeadersForAccessTokenRequest(clientId, clientSecret);

        // Populate request body
        final var body = "grant_type=refresh_token" +
                "&refresh_token=" + refreshToken;

        // Build request
        final var request = new HttpEntity<>(body, headers);

        return this.getAccessToken(request);
    }

    private void saveRefreshToken(final TokenInfo tokenInfo) {
        if (tokenInfo.getRefreshToken() != null) {
            tokenPersister.save(tokenInfo);
        }
    }

    private HttpHeaders getHeadersForAccessTokenRequest(final String clientId, final String clientSecret) {
        final var auth = clientId + ":" + clientSecret;
        final var encodedAuth = Base64.getEncoder().encodeToString(auth.getBytes());

        final var headers = new HttpHeaders();
        headers.setContentType(org.springframework.http.MediaType.APPLICATION_FORM_URLENCODED);
        headers.set("Authorization", "Basic " + encodedAuth);

        return headers;
    }

    private TokenInfo getAccessToken(final HttpEntity<String> request) throws RestClientException {
        final var response = restTemplate.exchange(ACCESS_TOKEN_URL, HttpMethod.POST, request, String.class).getBody();
        return new Gson().fromJson(response, TokenInfo.class);
    }
}
