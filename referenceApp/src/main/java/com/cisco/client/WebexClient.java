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
package com.cisco.client;

import com.cisco.auth.AccessTokenProvider;
import com.cisco.model.LocationCallSettingsRequest;
import com.cisco.model.PersonDetails;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.api.DefaultApi;
import org.openapitools.client.api.DefaultWebexAdminApi;
import org.openapitools.client.model.CreateADeviceByMACAddress200Response;
import org.openapitools.client.model.CreateADeviceByMACAddressRequest;
import org.openapitools.client.model.CreateALocation201Response;
import org.openapitools.client.model.CreateALocationRequest;
import org.openapitools.client.model.CreateAPerson200Response;
import org.openapitools.client.model.GetAWholesaleCustomer200Response;
import org.openapitools.client.model.GetAnOrganization200Response;
import org.openapitools.client.model.GetOrganizationDetails200Response;
import org.openapitools.client.model.GetPhoneNumbersForAnOrganizationWithGivenCriterias200Response;
import org.openapitools.client.model.ListLocations200Response;
import org.openapitools.client.model.ListWholesaleCustomers200Response;
import org.openapitools.client.model.ListWholesaleSubscribers200Response;
import org.openapitools.client.model.NumbersPost;
import org.openapitools.client.model.ProvisionAWholesaleCustomer202Response;
import org.openapitools.client.model.ProvisionAWholesaleCustomerRequest;
import org.openapitools.client.model.ProvisionAWholesaleSubscriber200Response;
import org.openapitools.client.model.ProvisionAWholesaleSubscriberRequest;
import org.openapitools.client.model.RetrievePSTNConnectionForALocation200Response;
import org.openapitools.client.model.SetupPSTNConnectionForALocationRequest;
import org.openapitools.client.model.UpdateAPersonRequest;
import org.openapitools.client.model.UpdateAnOrganizationRequest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.net.SocketTimeoutException;

public class WebexClient {
    private static final String WEBEX_BASE_URL = "https://webexapis.com/v1";
    private static final String LOCATIONS_BASE_URL = WEBEX_BASE_URL + "/telephony/config/locations/";
    private static final String IDENTITY_SCIM_BASE_URL = WEBEX_BASE_URL + "/scim/";

    private final DefaultApi apiInstance;
    private final DefaultWebexAdminApi webexAdminApiInstance;
    private final RestTemplate restTemplate;
    private final AccessTokenProvider accessTokenProvider;

    public WebexClient(final DefaultApi apiInstance,
                       final DefaultWebexAdminApi webexAdminApiInstance,
                       final RestTemplate restTemplate,
                       final AccessTokenProvider accessTokenProvider) {
        this.apiInstance = apiInstance;
        this.webexAdminApiInstance = webexAdminApiInstance;
        this.restTemplate = restTemplate;
        this.accessTokenProvider = accessTokenProvider;
    }

    public CreateADeviceByMACAddress200Response createADeviceByMACAddress(
        final String orgId, final CreateADeviceByMACAddressRequest request) {

        return executeAndHandleErrors(orgId,
            () -> apiInstance.createADeviceByMACAddress(orgId, this.accessTokenProvider.getAccessToken(), request));
    }

    public void deleteADevice(final String deviceId, final String orgId) {
        executeAndHandleErrors(orgId,
                () -> apiInstance.deleteADevice(deviceId, orgId, this.accessTokenProvider.getAccessToken()));
    }

    public CreateALocation201Response createALocation(
        final String orgId, final CreateALocationRequest createALocationRequest) {

        return executeAndHandleErrors(orgId,
            () -> apiInstance.createALocation(orgId, this.accessTokenProvider.getAccessToken(), createALocationRequest));
    }

    public ListLocations200Response listLocations(
        final String name, final String id, final String orgId, final BigDecimal max) {

        return executeAndHandleErrors(orgId,
            () -> apiInstance.listLocations(name, id, orgId, max, this.accessTokenProvider.getAccessToken()));
    }

    public GetPhoneNumbersForAnOrganizationWithGivenCriterias200Response getPhoneNumbersForAnOrganizationWithGivenCriterias(
        final String orgId, final String locationId, final BigDecimal max, final BigDecimal start, final String phoneNumber,
        final Boolean available, final String order, final String ownerName, final String ownerId, final String ownerType,
        final String extension, final String numberType, final String phoneNumberType, final String state, final Boolean details,
        final Boolean tollFreeNumbers, final Boolean restrictedNonGeoNumbers, final String includedTelephonyTypes,
        final Boolean serviceNumber) {

        return executeAndHandleErrors(orgId,
            () -> apiInstance.getPhoneNumbersForAnOrganizationWithGivenCriterias(orgId, locationId, max, start, phoneNumber,
            available, order, ownerName, ownerId, ownerType, extension, numberType, phoneNumberType, state, details,
            tollFreeNumbers, restrictedNonGeoNumbers, includedTelephonyTypes, serviceNumber, this.accessTokenProvider.getAccessToken()));
    }

    public void addPhoneNumbersToALocation(
        final String locationId, final String orgId, final NumbersPost numbersPost) {

        executeAndHandleErrors(orgId,
            () -> apiInstance.addPhoneNumbersToALocation(locationId, orgId, this.accessTokenProvider.getAccessToken(), numbersPost));
    }

    public void setupPSTNConnectionForALocation(
        final String locationId, final String orgId,
        final SetupPSTNConnectionForALocationRequest setupPSTNConnectionForALocationRequest) {

        executeAndHandleErrors(orgId,
            () -> apiInstance.setupPSTNConnectionForALocation(locationId, orgId, this.accessTokenProvider.getAccessToken(), setupPSTNConnectionForALocationRequest));
    }

    public RetrievePSTNConnectionForALocation200Response retrievePSTNConnectionForALocation(
        final String locationId, final String orgId) {

        return executeAndHandleErrors(orgId,
            () -> apiInstance.retrievePSTNConnectionForALocation(locationId, orgId, this.accessTokenProvider.getAccessToken()));
    }

    public ListWholesaleCustomers200Response listWholesaleCustomers(
        final String externalId, final String orgId, final String status, final String offset, final String max,
        final String onBehalfOfSubPartnerOrgId) {

        return executeAndHandleErrors(orgId,
            () -> apiInstance.listWholesaleCustomers(externalId, orgId, status, offset, max, onBehalfOfSubPartnerOrgId, this.accessTokenProvider.getAccessToken()));
    }

    public ApiResponse<ListWholesaleCustomers200Response> listWholesaleCustomersWithHttpInfo(
            final String externalId, final String orgId, final String status, final String offset, final String max,
            final String onBehalfOfSubPartnerOrgId) {

        return executeAndHandleErrors(orgId,
                () -> apiInstance.listWholesaleCustomersWithHttpInfo(externalId, orgId, status, offset, max, onBehalfOfSubPartnerOrgId, this.accessTokenProvider.getAccessToken()));
    }

    public GetAWholesaleCustomer200Response getAWholesaleCustomer(
        final String customerId, final String onBehalfOfSubPartnerOrgId) {

        return executeAndHandleErrors(
            () -> apiInstance.getAWholesaleCustomer(customerId, onBehalfOfSubPartnerOrgId, this.accessTokenProvider.getAccessToken()));
    }

    public ProvisionAWholesaleCustomer202Response provisionAWholesaleCustomer(
        final String onBehalfOfSubPartnerOrgId,
        final ProvisionAWholesaleCustomerRequest provisionAWholesaleCustomerRequest) {
        return executeAndHandleErrors(
            () -> apiInstance.provisionAWholesaleCustomer(onBehalfOfSubPartnerOrgId, this.accessTokenProvider.getAccessToken(), provisionAWholesaleCustomerRequest));
    }

    public ProvisionAWholesaleSubscriber200Response provisionAWholesaleSubscriber(
        final String onBehalfOfSubPartnerOrgId,
        final ProvisionAWholesaleSubscriberRequest provisionAWholesaleSubscriberRequest) {
        return executeAndHandleErrors(
            () -> apiInstance.provisionAWholesaleSubscriber(onBehalfOfSubPartnerOrgId, this.accessTokenProvider.getAccessToken(), provisionAWholesaleSubscriberRequest));
    }

    public ProvisionAWholesaleSubscriber200Response getAWholesaleSubscriber(
        final String subscriberId, final String onBehalfOfSubPartnerOrgId) {
        return executeAndHandleErrors(
            () -> apiInstance.getAWholesaleSubscriber(subscriberId, onBehalfOfSubPartnerOrgId, this.accessTokenProvider.getAccessToken()));
    }

    public ApiResponse<ListWholesaleSubscribers200Response> listWholesaleSubscribersWithHttpInfo(
        final Integer max, final Integer offset, final String customerId, final String personId, final String externalCustomerId,
        final String email, final String status, final String after, final String lastStatusChange, final String sortBy,
        final String sortOrder, final String onBehalfOfSubPartnerOrgId) {
        return executeAndHandleErrors(
            () -> apiInstance.listWholesaleSubscribersWithHttpInfo(max, offset, customerId, personId, externalCustomerId,
            email, status, after, lastStatusChange, sortBy, sortOrder, onBehalfOfSubPartnerOrgId, this.accessTokenProvider.getAccessToken()));
    }

    public ListWholesaleSubscribers200Response listWholesaleSubscribers(
        final Integer max, final Integer offset, final String customerId, final String personId, final String externalCustomerId,
        final String email, final String status, final String after, final String lastStatusChange, final String sortBy,
        final String sortOrder, final String onBehalfOfSubPartnerOrgId) {
        return executeAndHandleErrors(
            () -> apiInstance.listWholesaleSubscribers(max, offset, customerId, personId, externalCustomerId, email,
            status, after, lastStatusChange, sortBy, sortOrder, onBehalfOfSubPartnerOrgId, this.accessTokenProvider.getAccessToken()));
    }

    public CreateAPerson200Response getPersonDetails(final String personId) {
        return executeAndHandleErrors(
            () -> apiInstance.getPersonDetails(personId, true, this.accessTokenProvider.getAccessToken()));
    }

    public void updateAPerson(final PersonDetails personDetails, final UpdateAPersonRequest updateAPersonRequest) {
        executeAndHandleErrors(
            () -> apiInstance.updateAPerson(personDetails.getId(), true, true, true,
                this.accessTokenProvider.getAccessToken(), updateAPersonRequest));
    }

    public GetOrganizationDetails200Response getOrganizationDetails(final String orgId) {
        return executeAndHandleErrors(orgId,
            () -> webexAdminApiInstance.getOrganizationDetails(orgId, this.accessTokenProvider.getAccessToken()));
    }

    public GetAnOrganization200Response getAnOrganization(final String orgId) {
        return executeAndHandleErrors(orgId,
            () -> webexAdminApiInstance.getAnOrganization(orgId, this.accessTokenProvider.getAccessToken()));
    }

    public GetAnOrganization200Response updateAnOrganization(
        final String orgId, final UpdateAnOrganizationRequest updateAnOrganizationRequest) {
        return executeAndHandleErrors(orgId,
            () -> webexAdminApiInstance.updateAnOrganization(orgId, this.accessTokenProvider.getAccessToken(), updateAnOrganizationRequest));
    }

    public void deleteOrganization(final String orgId) {
        executeAndHandleErrors(orgId,
                () -> webexAdminApiInstance.deleteOrganization(orgId, this.accessTokenProvider.getAccessToken()));
    }

    public void updateLocationCallSettings(
        final String locationId, final String orgId, final LocationCallSettingsRequest requestBody) {

        final var url = LOCATIONS_BASE_URL + locationId + "?orgId=" + orgId;

        // Populate request headers
        final var headers = new HttpHeaders();
        headers.setContentType(org.springframework.http.MediaType.APPLICATION_JSON);
        headers.setBearerAuth(this.accessTokenProvider.getAccessToken().replaceFirst("^Bearer ", ""));

        // Build request
        final var request = new HttpEntity<>(requestBody, headers);

        executeAndHandleErrors(orgId,
            () -> restTemplate.exchange(url, HttpMethod.PUT, request, Void.class));
    }

    public void deleteAUser(final String orgId, final String userId) {

        final String url = IDENTITY_SCIM_BASE_URL + orgId + "/Users/" + userId;

        // Populate request headers
        final var headers = new HttpHeaders();
        headers.setContentType(org.springframework.http.MediaType.APPLICATION_JSON);
        headers.setBearerAuth(this.accessTokenProvider.getAccessToken().replaceFirst("^Bearer ", ""));

        // Build request
        final var request = new HttpEntity<>(headers);

        executeAndHandleErrors(orgId,
                () -> restTemplate.exchange(url, HttpMethod.DELETE, request, Void.class));
    }

    /**
     * Execute an operation and apply error handling scenarios based on the result.
     * @param orgId ID of the organization being referenced in the supplier, this is required to handle 403 errors
     * @param supplier operation to be executed
     * @return result of the operation
     * @param <T> type of the result
     */
    private <T> T executeAndHandleErrors(final String orgId, final ApiInstanceSupplier<T> supplier) {
        try {
            return supplier.get();
        } catch (final ApiException e) {
            return handleStatusCode(orgId, supplier, e.getCode(), e.getCause(), e.getResponseBody());
        } catch (final RestClientException e) {
            if (e instanceof HttpStatusCodeException httpStatusCodeException) {
                final var statusCode = httpStatusCodeException.getStatusCode();
                return handleStatusCode(orgId, supplier, statusCode.value(), e.getCause(), httpStatusCodeException.getResponseBodyAsString());
            }

            // Handle cases where the exception is not an HTTP exception e.g. SocketTimeoutException
            // Rethrow the exception to be handled by the caller
            throw new ClientException(-1, e.getMessage());
        }
    }

    /**
     * Execute an operation and apply error handling scenarios based on the result.
     * @param orgId ID of the organization being referenced in the executor, this is required to handle 403 errors
     * @param executor operation to be executed
     */
    private void executeAndHandleErrors(final String orgId, final ApiInstanceExecutor executor) {
        try {
            executor.execute();
        } catch (final ApiException e) {
            handleStatusCode(orgId, () -> {
                executor.execute();
                return null;
            }, e.getCode(), e.getCause(), e.getResponseBody());

            throw new ClientException(e.getCode(), e.getResponseBody());
        }
    }

    /**
     * Execute an operation and apply error handling scenarios based on the result.
     * @param supplier operation to be executed
     * @return result of the operation
     * @param <T> type of the result
     */
    private <T> T executeAndHandleErrors(final ApiInstanceSupplier<T> supplier) {
        try {
            return supplier.get();
        } catch (final ApiException e) {
            return handleStatusCode(null, supplier, e.getCode(), e.getCause(), e.getResponseBody());
        }
    }

    /**
     * Execute an operation and apply error handling scenarios based on the result.
     * @param executor operation to be executed
     */
    private void executeAndHandleErrors(final ApiInstanceExecutor executor) {
        try {
            executor.execute();
        } catch (final ApiException e) {
            handleStatusCode(null, () -> {
                executor.execute();
                return null;
            }, e.getCode(), e.getCause(), e.getResponseBody());
        }
    }

    /**
     * Handle the status code of an API call and determine the appropriate action to take.
     * @param orgId ID of the organization being referenced in the supplier, this is required to handle 403 errors
     * @param supplier operation to be executed
     * @param statusCode status code of the previous API call
     * @param cause cause of the previous API call
     * @return result of the operation
     * @param <T> type of the result
     */
    private <T> T handleStatusCode(final String orgId, final ApiInstanceSupplier<T> supplier, final int statusCode, final Throwable cause, final String responseBody) {
        if (statusCode == HttpStatus.UNAUTHORIZED.value()) {
            return refreshTokenAndExecute(supplier);
        }
        if (statusCode == HttpStatus.FORBIDDEN.value() && orgId != null) {
            return invokeCustomerOrganizationsApiAndRetry(orgId, supplier);
        }
        if (isRetryableError(statusCode, cause)) {
            return execute(supplier);
        }
        throw new ClientException(statusCode, responseBody);
    }

    /**
     * Refreshes the access token and retries the operation. To be used in cases where the access token is expired,
     * typically when a 401 error is received previously.
     *
     * @param supplier code to be executed after the access token is refreshed
     * @param <T>      type of the result
     * @return result of the executed code
     */
    private <T> T refreshTokenAndExecute(final ApiInstanceSupplier<T> supplier) {
        try {
            accessTokenProvider.getAccessToken();
            return supplier.get();
        } catch (final ApiException e) {
            throw new ClientException(e.getCode(), e.getResponseBody());
        }
    }

    /**
     * Invokes the customer organizations API and retries the operation. To be used in cases where a 403 error is received.
     * Invoking the customer organizations API will put the customer in the manages list of the partner, which will allow
     * subsequent operations to succeed.
     * @param orgId organization ID being referenced in the supplier
     * @param supplier code to be executed after the customer organizations API is invoked
     * @return result of the executed code
     * @param <T> type of the result
     */
    private <T> T invokeCustomerOrganizationsApiAndRetry(final String orgId, final ApiInstanceSupplier<T> supplier) {
        try {
            getAnOrganization(orgId);
            return supplier.get();
        } catch (final ApiException e) {
            throw new ClientException(e.getCode(), e.getResponseBody());
        }
    }

    /**
     * Execute an operation once. Convert any error to a client exception.
     * @param supplier operation to be executed
     * @return result of the operation
     * @param <T> type of the result
     */
    private <T> T execute(final ApiInstanceSupplier<T> supplier) {
        try {
            return supplier.get();
        } catch (final ApiException e) {
            throw new ClientException(e.getCode(), e.getResponseBody());
        }
    }

    private boolean isRetryableError(final int statusCode, final Throwable cause) {
        return statusCode == HttpStatus.BAD_GATEWAY.value() ||
            statusCode == HttpStatus.SERVICE_UNAVAILABLE.value() ||
            cause instanceof SocketTimeoutException;
    }
}
