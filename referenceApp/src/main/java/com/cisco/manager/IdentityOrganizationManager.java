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
import com.cisco.input.IdentityOrganizationInputProvider;
import com.cisco.mapper.IdentityOrganizationMapper;
import com.cisco.util.Base64UuidUtil;
import org.openapitools.client.model.GetAnOrganization200Response;
import org.springframework.stereotype.Component;

@Component
public class IdentityOrganizationManager {

    private final IdentityOrganizationInputProvider identityOrganizationInputProvider;
    private final IdentityOrganizationMapper identityOrganizationMapper;
    private final WebexClient webexClient;

    public IdentityOrganizationManager(final IdentityOrganizationInputProvider identityOrganizationInputProvider,
                                       final IdentityOrganizationMapper identityOrganizationMapper,
                                       final WebexClient webexClient) {
        this.identityOrganizationInputProvider = identityOrganizationInputProvider;
        this.identityOrganizationMapper = identityOrganizationMapper;
        this.webexClient = webexClient;
    }

    //Get an identity organization
    public GetAnOrganization200Response getAnIdentityOrganization() {
        final var identityOrgId = identityOrganizationInputProvider.getIdentityOrganizationId();

        return this.getAnIdentityOrganization(identityOrgId);
    }

    public GetAnOrganization200Response getAnIdentityOrganization(final String orgId) {
        final var organizationUuid = Base64UuidUtil.getOrganizationUuid(orgId);

        return webexClient.getAnOrganization(organizationUuid);
    }

    //Update an organization name
    public GetAnOrganization200Response updateOrganizationName() {

        final var identityOrgDetails = identityOrganizationInputProvider.getIdentityOrganizationDetails();

        return this.updateOrganizationName(identityOrgDetails.getId(), identityOrgDetails.getDisplayName());
    }

    public GetAnOrganization200Response updateOrganizationName(final String orgId, final String displayName) {

        final var organizationUuid = Base64UuidUtil.getOrganizationUuid(orgId);

        //Read organization details
        final var getAnOrganization200Response = this.getAnIdentityOrganization(orgId);

        final var updateAnOrganizationRequest = identityOrganizationMapper.toUpdateAnOrganizationRequest(
            displayName, getAnOrganization200Response.getSchemas());

        return webexClient.updateAnOrganization(organizationUuid, updateAnOrganizationRequest);
    }
}
