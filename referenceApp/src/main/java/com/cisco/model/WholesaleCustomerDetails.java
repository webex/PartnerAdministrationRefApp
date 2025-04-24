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

import java.util.List;

public class WholesaleCustomerDetails {
    private String provisioningId;
    private List<Object> packages;
    private String externalId;
    private String addressLine1;
    private String city;
    private String stateOrProvince;
    private String zipOrPostalCode;
    private String country;
    private String name;
    private String primaryEmail;
    private String language;
    private String locationName;
    private String locationAddressLine1;
    private String locationCity;
    private String locationStateOrProvince;
    private String locationZipOrPostalCode;
    private String locationCountry;
    private String locationTimezone;
    private String locationLanguage;
    private String locationEmergencyId;
    private String meetingsTimezone;

    public String getProvisioningId() {
        return provisioningId;
    }

    public void setProvisioningId(String provisioningId) {
        this.provisioningId = provisioningId;
    }

    public List<Object> getPackages() {
        return packages;
    }

    public void setPackages(List<Object> packages) {
        this.packages = packages;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateOrProvince() {
        return stateOrProvince;
    }

    public void setStateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }

    public String getZipOrPostalCode() {
        return zipOrPostalCode;
    }

    public void setZipOrPostalCode(String zipOrPostalCode) {
        this.zipOrPostalCode = zipOrPostalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationAddressLine1() {
        return locationAddressLine1;
    }

    public void setLocationAddressLine1(String locationAddressLine1) {
        this.locationAddressLine1 = locationAddressLine1;
    }

    public String getLocationCity() {
        return locationCity;
    }

    public void setLocationCity(String locationCity) {
        this.locationCity = locationCity;
    }

    public String getLocationStateOrProvince() {
        return locationStateOrProvince;
    }

    public void setLocationStateOrProvince(String locationStateOrProvince) {
        this.locationStateOrProvince = locationStateOrProvince;
    }

    public String getLocationZipOrPostalCode() {
        return locationZipOrPostalCode;
    }

    public void setLocationZipOrPostalCode(String locationZipOrPostalCode) {
        this.locationZipOrPostalCode = locationZipOrPostalCode;
    }

    public String getLocationCountry() {
        return locationCountry;
    }

    public void setLocationCountry(String locationCountry) {
        this.locationCountry = locationCountry;
    }

    public String getLocationTimezone() {
        return locationTimezone;
    }

    public void setLocationTimezone(String locationTimezone) {
        this.locationTimezone = locationTimezone;
    }

    public String getLocationLanguage() {
        return locationLanguage;
    }

    public void setLocationLanguage(String locationLanguage) {
        this.locationLanguage = locationLanguage;
    }

    public String getLocationEmergencyId() {
        return locationEmergencyId;
    }

    public void setLocationEmergencyId(String locationEmergencyId) {
        this.locationEmergencyId = locationEmergencyId;
    }

    public String getMeetingsTimezone() {
        return meetingsTimezone;
    }

    public void setMeetingsTimezone(String meetingsTimezone) {
        this.meetingsTimezone = meetingsTimezone;
    }
}
