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

import com.cisco.model.CallingLineId;
import com.cisco.model.LocationCallSettingsRequest;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;

@Component
public class LocationCallSettingsMapper {

    public LocationCallSettingsRequest toLocationCallSettingsRequest(final String callingLineIdName,
                                                                     final String phoneNumber) {

        final var secureRandom = new SecureRandom();
        final var dialDigit = 10 + secureRandom.nextInt(90); // Random number between 10 and 99

        final var request = new LocationCallSettingsRequest();
        request.setEnforceOutsideDialDigit(true);
        request.setOutsideDialDigit(String.valueOf(dialDigit));

        final var callingLineId = new CallingLineId();
        callingLineId.setName(callingLineIdName);
        callingLineId.setPhoneNumber(phoneNumber);
        request.setCallingLineId(callingLineId);

        return request;
    }
}
