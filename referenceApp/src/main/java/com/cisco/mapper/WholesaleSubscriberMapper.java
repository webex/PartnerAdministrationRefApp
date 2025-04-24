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
package com.cisco.mapper;

import com.cisco.model.WholesaleSubscriberDetails;
import org.openapitools.client.model.ProvisionAWholesaleSubscriberRequest;
import org.openapitools.client.model.ProvisionAWholesaleSubscriberRequestProvisioningParameters;
import org.springframework.stereotype.Component;

@Component
public class WholesaleSubscriberMapper {

    public ProvisionAWholesaleSubscriberRequest toProvisionAWholesaleSubscriberRequest(final WholesaleSubscriberDetails wholesaleSubscriberDetails) {

        // region Populate Provisioning Parameters
        final var provisioningParameters = new ProvisionAWholesaleSubscriberRequestProvisioningParameters();
        provisioningParameters.setFirstName(wholesaleSubscriberDetails.getFirstName());
        provisioningParameters.setLastName(wholesaleSubscriberDetails.getLastName());
        provisioningParameters.setExtension(wholesaleSubscriberDetails.getExtension());
        provisioningParameters.setLocationId(wholesaleSubscriberDetails.getLocationId());
        provisioningParameters.setPrimaryPhoneNumber(wholesaleSubscriberDetails.getPhoneNumber());
        // endregion

        //region Populate ProvisionAWholesaleSubscriberRequest
        final var request = new ProvisionAWholesaleSubscriberRequest();
        request.setCustomerId(wholesaleSubscriberDetails.getCustomerId());
        request.setEmail(wholesaleSubscriberDetails.getEmail());
        request.setProvisioningParameters(provisioningParameters);
        request.setPackages(wholesaleSubscriberDetails.getPackages());
        //endregion

        return request;
    }
}
