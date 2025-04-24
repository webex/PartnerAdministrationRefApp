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

import com.cisco.model.AddressDetails;
import com.cisco.model.LocationDetails;
import org.openapitools.client.model.CreateALocationRequest;
import org.openapitools.client.model.CreateALocationRequestAddress;
import org.springframework.stereotype.Component;

@Component
public class LocationMapper {

    public CreateALocationRequest toCreateALocationRequest(final LocationDetails locationDetails) {
        final var request = new CreateALocationRequest();

        request.setName(locationDetails.getName());
        request.setTimeZone(locationDetails.getTimeZone());
        request.setPreferredLanguage(locationDetails.getPreferredLanguage());
        request.setAnnouncementLanguage(locationDetails.getAnnouncementLanguage());

        final var locationAddress = new CreateALocationRequestAddress();
        locationAddress.setAddress1(locationDetails.getAddress().getAddress1());
        locationAddress.setAddress2(locationDetails.getAddress().getAddress2());
        locationAddress.setCity(locationDetails.getAddress().getCity());
        locationAddress.setState(locationDetails.getAddress().getState());
        locationAddress.setCountry(locationDetails.getAddress().getCountry());
        locationAddress.setPostalCode(locationDetails.getAddress().getPostalCode());
        request.setAddress(locationAddress);

        request.setLatitude(locationDetails.getLatitude());
        request.setLongitude(locationDetails.getLongitude());
        request.setNotes(locationDetails.getNotes());

        return request;
    }
}
