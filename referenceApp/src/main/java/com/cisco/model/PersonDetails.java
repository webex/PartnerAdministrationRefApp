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
package com.cisco.model;

import java.util.ArrayList;
import java.util.List;

public class PersonDetails {
    private String id;
    private List<Object> emails;
    private List<PhoneNumber> phoneNumbers;
    private String extension;
    private String locationId;
    private String displayName;
    private String firstName;
    private String lastName;
    private String orgId;
    private List<Object> roles = new ArrayList<>();
    private List<Object> licenses = new ArrayList<>();
    private String department;
    private String manager;
    private String title;
    private List<Object> addresses = new ArrayList<>();
    private String created;
    private String lastModified;
    private String timezone;
    private List<Object> siteUrls = new ArrayList<>();
    private List<Object> sipAddresses = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public List<Object> getEmails() {
        return emails;
    }

    public void setEmails(final List<Object> emails) {
        this.emails = emails;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(final List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(final String extension) {
        this.extension = extension;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(final String locationId) {
        this.locationId = locationId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(final String orgId) {
        this.orgId = orgId;
    }

    public List<Object> getRoles() {
        return roles;
    }

    public void setRoles(final List<Object> roles) {
        this.roles = roles;
    }

    public List<Object> getLicenses() {
        return licenses;
    }

    public void setLicenses(final List<Object> licenses) {
        this.licenses = licenses;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(final String department) {
        this.department = department;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(final String manager) {
        this.manager = manager;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public List<Object> getAddresses() {
        return addresses;
    }

    public void setAddresses(final List<Object> addresses) {
        this.addresses = addresses;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(final String created) {
        this.created = created;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(final String lastModified) {
        this.lastModified = lastModified;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(final String timezone) {
        this.timezone = timezone;
    }

    public List<Object> getSiteUrls() {
        return siteUrls;
    }

    public void setSiteUrls(final List<Object> siteUrls) {
        this.siteUrls = siteUrls;
    }

    public List<Object> getSipAddresses() {
        return sipAddresses;
    }

    public void setSipAddresses(final List<Object> sipAddresses) {
        this.sipAddresses = sipAddresses;
    }
}
