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
package com.cisco.config;

import com.cisco.auth.FileSystemTokenPersister;
import com.cisco.auth.TokenPersister;
import com.cisco.auth.AccessTokenProvider;
import com.cisco.auth.AuthorizationCodeToAccessTokenProvider;
import com.cisco.auth.InteractiveAuthFlowAccessTokenProvider;
import com.cisco.client.WebexClient;
import com.cisco.input.OAuthInputProvider;
import org.openapitools.client.ApiClient;
import org.openapitools.client.WebexAdminApiClient;
import org.openapitools.client.api.DefaultApi;
import org.openapitools.client.api.DefaultWebexAdminApi;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.Scanner;

@Configuration
public class ReferenceApplicationConfig {

    private final ReferenceApplicationProperties properties;

    public ReferenceApplicationConfig(ReferenceApplicationProperties referenceApplicationProperties) {
        this.properties = referenceApplicationProperties;
    }

    @Bean
    public ApiClient apiClient() {
        return new ApiClient();
    }

    @Bean
    public DefaultApi apiInstance(final ApiClient apiClient) {
        return new DefaultApi(apiClient);
    }

    @Bean
    public WebexAdminApiClient webexAdminApiClient() {
        return new WebexAdminApiClient();
    }

    @Bean
    public DefaultWebexAdminApi webexAdminApiInstance(final WebexAdminApiClient webexAdminApiClient) {
        return new DefaultWebexAdminApi(webexAdminApiClient);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }

    @Bean
    public TokenPersister tokenPersister() {
        return new FileSystemTokenPersister(properties.getRefreshTokenFile());
    }

    @Bean
    @ConditionalOnProperty(name = "webex.token-retrieval-method", havingValue = "auth-code-to-token-flow")
    public AccessTokenProvider authCodeToAccessTokenProvider(final OAuthInputProvider oAuthInputProvider,
                                                             final TokenPersister tokenPersister,
                                                             final RestTemplate restTemplate) {
        return new AuthorizationCodeToAccessTokenProvider(oAuthInputProvider, tokenPersister, restTemplate);
    }

    @Bean
    @ConditionalOnProperty(name = "webex.token-retrieval-method", havingValue = "interactive-auth-flow", matchIfMissing = true)
    public AccessTokenProvider interactiveAuthFlowAccessTokenProvider(final OAuthInputProvider oAuthInputProvider,
                                                                      final TokenPersister tokenPersister,
                                                                      final RestTemplate restTemplate) {
        // Since this application is a console application, we need to set the headless property to false. Note
        // that this AuthorizationProvider will fail if there is not a display available.
        System.setProperty("java.awt.headless", "false");
        return new InteractiveAuthFlowAccessTokenProvider(oAuthInputProvider, tokenPersister, restTemplate);
    }

    @Bean
    public WebexClient webexClient(final DefaultApi apiInstance,
                                   final DefaultWebexAdminApi webexAdminApiInstance,
                                   final RestTemplate restTemplate,
                                   final AccessTokenProvider authorizationProvider) {
        return new WebexClient(apiInstance, webexAdminApiInstance, restTemplate, authorizationProvider);
    }
}
