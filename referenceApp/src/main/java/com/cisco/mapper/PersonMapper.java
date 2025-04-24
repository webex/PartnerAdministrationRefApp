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

import com.cisco.model.PersonDetails;
import com.cisco.model.PhoneNumber;
import org.openapitools.client.model.CreateAPerson200Response;
import org.openapitools.client.model.CreateAPerson200ResponsePhoneNumbersInner;
import org.openapitools.client.model.CreateAPersonRequestPhoneNumbersInner;
import org.openapitools.client.model.UpdateAPersonRequest;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Component
public class PersonMapper {

    public UpdateAPersonRequest toUpdateAPersonPhoneNumberRequest(final PersonDetails personDetails, final CreateAPersonRequestPhoneNumbersInner phoneNumber) {
        final var updateAPersonRequest = new UpdateAPersonRequest();

        updateAPersonRequest.setPhoneNumbers(Collections.singletonList(phoneNumber));
        updateAPersonRequest.setExtension(phoneNumber.getValue().substring(phoneNumber.getValue().length() - 4));
        updateAPersonRequest.setLicenses(personDetails.getLicenses());
        updateAPersonRequest.setDisplayName(personDetails.getDisplayName());
        updateAPersonRequest.setEmails(personDetails.getEmails());

        return updateAPersonRequest;
    }

    public PersonDetails toPersonDetails(final CreateAPerson200Response person) {
        final var personDetails = new PersonDetails();

        personDetails.setId(person.getId());
        personDetails.setDisplayName(person.getDisplayName());
        personDetails.setFirstName(person.getFirstName());
        personDetails.setLastName(person.getLastName());
        personDetails.setOrgId(person.getOrgId());
        personDetails.setRoles(person.getRoles());
        personDetails.setEmails(person.getEmails());
        personDetails.setPhoneNumbers(toPhoneNumbers(Objects.requireNonNull(person.getPhoneNumbers())));
        personDetails.setExtension(person.getExtension());
        personDetails.setLocationId(person.getLocationId());
        personDetails.setLicenses(person.getLicenses());
        personDetails.setDepartment(person.getDepartment());
        personDetails.setManager(person.getManager());
        personDetails.setTitle(person.getTitle());
        personDetails.setAddresses(Collections.singletonList(person.getAddresses()));
        personDetails.setCreated(person.getCreated());
        personDetails.setLastModified(person.getLastModified());
        personDetails.setTimezone(person.getTimezone());
        personDetails.setSiteUrls(person.getSiteUrls());
        personDetails.setSipAddresses(Collections.singletonList(person.getSipAddresses()));

        return personDetails;
    }

    public List<PhoneNumber> toPhoneNumbers(final List<CreateAPerson200ResponsePhoneNumbersInner> phoneNumbersInner) {
        final var phoneNumbers = new ArrayList<PhoneNumber>();

        for (final var phoneNumberInner : phoneNumbersInner) {
            final var phoneNumber = new PhoneNumber();

            phoneNumber.setValue(phoneNumberInner.getValue());
            phoneNumber.setType(String.valueOf(phoneNumberInner.getType()));
            phoneNumber.setPrimary(phoneNumberInner.getPrimary());

            phoneNumbers.add(phoneNumber);
        }

        return phoneNumbers;
    }
}
