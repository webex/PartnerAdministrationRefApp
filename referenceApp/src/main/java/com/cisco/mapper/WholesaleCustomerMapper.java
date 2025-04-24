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

import com.cisco.model.WholesaleCustomerDetails;
import org.openapitools.client.model.ProvisionAWholesaleCustomerRequest;
import org.openapitools.client.model.ProvisionAWholesaleCustomerRequestAddress;
import org.openapitools.client.model.ProvisionAWholesaleCustomerRequestCustomerInfo;
import org.openapitools.client.model.ProvisionAWholesaleCustomerRequestProvisioningParameters;
import org.openapitools.client.model.ProvisionAWholesaleCustomerRequestProvisioningParametersCalling;
import org.openapitools.client.model.ProvisionAWholesaleCustomerRequestProvisioningParametersCallingLocation;
import org.openapitools.client.model.ProvisionAWholesaleCustomerRequestProvisioningParametersCallingLocationAddress;
import org.openapitools.client.model.ProvisionAWholesaleCustomerRequestProvisioningParametersMeetings;
import org.springframework.stereotype.Component;

@Component
public class WholesaleCustomerMapper {

    public ProvisionAWholesaleCustomerRequest toProvisionAWholesaleCustomerRequest(final WholesaleCustomerDetails wholesaleCustomerDetails) {
        var request = new ProvisionAWholesaleCustomerRequest();

        //region Address
        ProvisionAWholesaleCustomerRequestAddress address = new ProvisionAWholesaleCustomerRequestAddress();
        address.addressLine1(wholesaleCustomerDetails.getAddressLine1());
        address.city(wholesaleCustomerDetails.getCity());
        address.stateOrProvince(wholesaleCustomerDetails.getStateOrProvince());
        address.zipOrPostalCode(wholesaleCustomerDetails.getZipOrPostalCode());
        address.country(wholesaleCustomerDetails.getCountry());
        //endregion

        //region Customer Info
        ProvisionAWholesaleCustomerRequestCustomerInfo customerInfo
            = new ProvisionAWholesaleCustomerRequestCustomerInfo();
        customerInfo.setName(wholesaleCustomerDetails.getName());
        customerInfo.setPrimaryEmail(wholesaleCustomerDetails.getPrimaryEmail());
        customerInfo.setLanguage(wholesaleCustomerDetails.getLanguage());
        //endregion

        //region Provisioning Parameters
        //region Calling Location Address
        ProvisionAWholesaleCustomerRequestProvisioningParametersCallingLocationAddress locationAddress
            = new ProvisionAWholesaleCustomerRequestProvisioningParametersCallingLocationAddress();

        locationAddress.addressLine1(wholesaleCustomerDetails.getLocationAddressLine1());
        locationAddress.city(wholesaleCustomerDetails.getLocationCity());
        locationAddress.stateOrProvince(wholesaleCustomerDetails.getLocationCity());
        locationAddress.zipOrPostalCode(wholesaleCustomerDetails.getLocationZipOrPostalCode());
        locationAddress.country(wholesaleCustomerDetails.getLocationCountry());
        //endregion

        //region Calling Location
        ProvisionAWholesaleCustomerRequestProvisioningParametersCallingLocation location
            = new ProvisionAWholesaleCustomerRequestProvisioningParametersCallingLocation();

        location.setName(wholesaleCustomerDetails.getLocationName());
        location.setAddress(locationAddress);
        location.setTimezone(wholesaleCustomerDetails.getLocationTimezone());
        location.setLanguage(wholesaleCustomerDetails.getLocationLanguage());
        location.setEmergencyLocationIdentifier(wholesaleCustomerDetails.getLocationEmergencyId());
        //endregion

        //region Calling Provisioning Parameters
        ProvisionAWholesaleCustomerRequestProvisioningParametersCalling calling
            = new ProvisionAWholesaleCustomerRequestProvisioningParametersCalling();
        calling.setLocation(location);
        //endregion

        //region Meetings Provisioning Parameters
        ProvisionAWholesaleCustomerRequestProvisioningParametersMeetings meetings
            = new ProvisionAWholesaleCustomerRequestProvisioningParametersMeetings();
        meetings.setTimezone(wholesaleCustomerDetails.getMeetingsTimezone());
        //endregion

        //region Populate Provisioning Parameters
        ProvisionAWholesaleCustomerRequestProvisioningParameters provisioningParameters
            = new ProvisionAWholesaleCustomerRequestProvisioningParameters();
        provisioningParameters.setCalling(calling);
        provisioningParameters.setMeetings(meetings);
        //endregion
        //endregion

        //region Populate ProvisionAWholesaleCustomerRequest
        request.setProvisioningId(wholesaleCustomerDetails.getProvisioningId());
        request.setPackages(wholesaleCustomerDetails.getPackages());
        request.setExternalId(wholesaleCustomerDetails.getExternalId());
        request.setAddress(address);
        request.setCustomerInfo(customerInfo);
        request.setProvisioningParameters(provisioningParameters);
        //endregion

        return request;
    }
}
