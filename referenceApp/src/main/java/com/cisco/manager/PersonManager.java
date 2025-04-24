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

import com.cisco.client.ClientException;
import com.cisco.client.WebexClient;
import com.cisco.input.PersonInputProvider;
import com.cisco.mapper.PersonMapper;
import com.cisco.model.PersonDetails;
import org.openapitools.client.model.CreateAPersonRequestPhoneNumbersInner;
import org.openapitools.client.model.UpdateAPersonRequest;
import org.springframework.stereotype.Component;

@Component
public class PersonManager {

    private final WebexClient webexClient;
    private final PersonInputProvider personInputProvider;
    private final PersonMapper personMapper;


    public PersonManager(final WebexClient webexClient,
                         final PersonInputProvider personInputProvider,
                         final PersonMapper personMapper) {
        this.webexClient = webexClient;
        this.personInputProvider = personInputProvider;
        this.personMapper = personMapper;
    }

    public PersonDetails getPersonDetails(final String personId) {
        try {
            final var personDetails = webexClient.getPersonDetails(personId);
            return personMapper.toPersonDetails(personDetails);
        } catch (final Exception e) {
            System.err.println("Exception when calling getPersonDetails API: " + e.getMessage());
            throw e;
        }
    }

    public boolean assignPhoneNumberToAPerson() {
        final var personDetails = getPersonDetails(personInputProvider.getPersonId());
        final var phoneNumbers = new CreateAPersonRequestPhoneNumbersInner();
        phoneNumbers.setType(CreateAPersonRequestPhoneNumbersInner.TypeEnum.WORK);
        phoneNumbers.setValue(personInputProvider.getPersonPhoneNumber(personDetails));
        final var updateAPersonRequest = personMapper.toUpdateAPersonPhoneNumberRequest(personDetails, phoneNumbers);

        return updateAPerson(personDetails, updateAPersonRequest);
    }

    private boolean updateAPerson(final PersonDetails personDetails, final UpdateAPersonRequest updateAPersonRequest) {
        try {
            webexClient.updateAPerson(personDetails, updateAPersonRequest);
            return true;
        } catch (final ClientException e) {
            System.err.println("Exception when calling assignPhoneNumberToSubscriber API: " + e.getMessage());
            return false;
        }
    }
}
