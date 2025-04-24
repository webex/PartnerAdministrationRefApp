<!--  Copyright 2025 Cisco Systems Inc.

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.-->

# DefaultApi

All URIs are relative to *https://webexapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteOrganization**](DefaultApi.md#deleteOrganization) | **DELETE** /organizations/{orgId} | Delete Organization |
| [**getAnOrganization**](DefaultApi.md#getAnOrganization) | **GET** /identity/v1/organizations/{orgId} | Get an organization |
| [**getOrganizationDetails**](DefaultApi.md#getOrganizationDetails) | **GET** /organizations/{orgId} | Get Organization Details |
| [**listOrganizations**](DefaultApi.md#listOrganizations) | **GET** /organizations | List Organizations |
| [**updateAnOrganization**](DefaultApi.md#updateAnOrganization) | **PATCH** /identity/v1/organizations/{orgId} | Update an organization |


<a id="deleteOrganization"></a>
# **deleteOrganization**
> deleteOrganization(orgId, authorization)

Delete Organization

Deletes an organization, by ID. It may take up to 10 minutes for the organization to be deleted after the response is returned. &lt;br/&gt;&lt;br/&gt; Specify the org ID in the &#x60;orgId&#x60; parameter in the URI.  &lt;div&gt;&lt;Callout type&#x3D;\&quot;warning\&quot;&gt;Deleting your organization permanently deletes all of the information associated with your organization and is irreversible.&lt;/Callout&gt;&lt;/div&gt;  Deleting an Organization may fail with a HTTP 409 Conflict response and encounter one or more of the errors described below. Resolve these conditions to allow the delete to succeed. &lt;br/&gt;&lt;br/&gt;  + Org cannot be deleted as it has Linked sites.  + Org cannot be deleted as it has active subscriptions or licenses.  + Org cannot be deleted as [Directory Synchronization](https://developer.webex.com/docs/api/v1/broadworks-enterprises/get-directory-sync-status-for-an-enterprise) is enabled.  + Org cannot be deleted as it has more than 1 user.  + Org cannot be deleted as it has more than 1 managed by relationship.  + Org cannot be deleted as it has managed orgs.  &lt;div&gt; &lt;Callout type&#x3D;&#39;info&#39;&gt;When deleting a Webex for BroadWorks Organization with BroadWorks Directory Synchronization enabled, a prerequisite is to disable BroadWorks Directory Synchronization for the given Organization. Refer to the [Organization Deletion](https://developer.webex.com/docs/api/guides/webex-for-broadworks-developers-guide#organization-deletion) section of the [Webex for BroadWorks](/docs/api/guides/webex-for-broadworks-developers-guide) guide for more information.&lt;/Callout&gt; &lt;/div&gt;

### Example

```java
// Import classes:

import org.openapitools.client.WebexAdminApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultWebexAdminApi;

public class Example {
    public static void main(String[] args) {
        WebexAdminApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://webexapis.com");

        DefaultWebexAdminApi apiInstance = new DefaultWebexAdminApi(defaultClient);
        String orgId =
            "Y2lzY29zcGFyazovL3VzL09SR0FOSVpBVElPTi85NmFiYzJhYS0zZGNjLTExZTUtYTE1Mi1mZTM0ODE5Y2RjOWE"; // String | The unique identifier for the organization.
        String authorization = "Bearer YOUR_AUTHORIZATION_TOKEN"; // String | e.g. Bearer YOUR_AUTHORIZATION_TOKEN
        try {
            apiInstance.deleteOrganization(orgId, authorization);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#deleteOrganization");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orgId** | **String**| The unique identifier for the organization. | |
| **authorization** | **String**| e.g. Bearer YOUR_AUTHORIZATION_TOKEN | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="getAnOrganization"></a>
# **getAnOrganization**
> GetAnOrganization200Response getAnOrganization(orgId, authorization)

Get an organization

&lt;br/&gt;  **Authorization**  OAuth token rendered by identity broker.  &lt;br/&gt;  One of the following OAuth scopes is required:  - &#x60;identity:organizations_rw&#x60;  - &#x60;identity:organizations_read&#x60;  &lt;br/&gt;

### Example

```java
// Import classes:

import org.openapitools.client.WebexAdminApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultWebexAdminApi;

public class Example {
    public static void main(String[] args) {
        WebexAdminApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://webexapis.com");

        DefaultWebexAdminApi apiInstance = new DefaultWebexAdminApi(defaultClient);
        String orgId =
            "82adacf4-453f-4e2b-a406-2939fddcaad2"; // String | Webex Identity assigned organization identifier.
        String authorization = "Bearer YOUR_AUTHORIZATION_TOKEN"; // String | e.g. Bearer YOUR_AUTHORIZATION_TOKEN
        try {
            GetAnOrganization200Response result = apiInstance.getAnOrganization(orgId, authorization);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getAnOrganization");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orgId** | **String**| Webex Identity assigned organization identifier. | |
| **authorization** | **String**| e.g. Bearer YOUR_AUTHORIZATION_TOKEN | [optional] |

### Return type

[**GetAnOrganization200Response**](GetAnOrganization200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getOrganizationDetails"></a>
# **getOrganizationDetails**
> GetOrganizationDetails200Response getOrganizationDetails(orgId, authorization)

Get Organization Details

Shows details for an organization, by ID.  Specify the org ID in the &#x60;orgId&#x60; parameter in the URI.

### Example

```java
// Import classes:

import org.openapitools.client.WebexAdminApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultWebexAdminApi;

public class Example {
    public static void main(String[] args) {
        WebexAdminApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://webexapis.com");

        DefaultWebexAdminApi apiInstance = new DefaultWebexAdminApi(defaultClient);
        String orgId =
            "Y2lzY29zcGFyazovL3VzL09SR0FOSVpBVElPTi85NmFiYzJhYS0zZGNjLTExZTUtYTE1Mi1mZTM0ODE5Y2RjOWE"; // String | The unique identifier for the organization.
        String authorization = "Bearer YOUR_AUTHORIZATION_TOKEN"; // String | e.g. Bearer YOUR_AUTHORIZATION_TOKEN
        try {
            GetOrganizationDetails200Response result = apiInstance.getOrganizationDetails(orgId, authorization);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getOrganizationDetails");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orgId** | **String**| The unique identifier for the organization. | |
| **authorization** | **String**| e.g. Bearer YOUR_AUTHORIZATION_TOKEN | [optional] |

### Return type

[**GetOrganizationDetails200Response**](GetOrganizationDetails200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listOrganizations"></a>
# **listOrganizations**
> ListOrganizations200Response listOrganizations(authorization)

List Organizations

List all organizations visible by your account. The results will not be [paginated](/docs/basics#pagination).

### Example

```java
// Import classes:

import org.openapitools.client.WebexAdminApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultWebexAdminApi;

public class Example {
    public static void main(String[] args) {
        WebexAdminApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://webexapis.com");

        DefaultWebexAdminApi apiInstance = new DefaultWebexAdminApi(defaultClient);
        String authorization = "Bearer YOUR_AUTHORIZATION_TOKEN"; // String | e.g. Bearer YOUR_AUTHORIZATION_TOKEN
        try {
            ListOrganizations200Response result = apiInstance.listOrganizations(authorization);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#listOrganizations");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**| e.g. Bearer YOUR_AUTHORIZATION_TOKEN | [optional] |

### Return type

[**ListOrganizations200Response**](ListOrganizations200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateAnOrganization"></a>
# **updateAnOrganization**
> GetAnOrganization200Response updateAnOrganization(orgId, authorization, updateAnOrganizationRequest)

Update an organization

&lt;br/&gt;  **Authorization**  OAuth token rendered by identity broker.  &lt;br/&gt;  One of the following OAuth scopes is required:  - &#x60;identity:organizations_rw&#x60;  &lt;br/&gt;  The following administrators can use this API:  - &#x60;id_full_admin&#x60;  &lt;br/&gt;  **Usage**:  1. Input JSON must contain schema: \&quot;urn:cisco:codev:identity:organization:core:1.0\&quot;.

### Example

```java
// Import classes:

import org.openapitools.client.WebexAdminApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultWebexAdminApi;

public class Example {
    public static void main(String[] args) {
        WebexAdminApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://webexapis.com");

        DefaultWebexAdminApi apiInstance = new DefaultWebexAdminApi(defaultClient);
        String orgId =
            "82adacf4-453f-4e2b-a406-2939fddcaad2"; // String | Webex Identity assigned organization identifier.
        String authorization = "Bearer YOUR_AUTHORIZATION_TOKEN"; // String | e.g. Bearer YOUR_AUTHORIZATION_TOKEN
        UpdateAnOrganizationRequest updateAnOrganizationRequest =
            new UpdateAnOrganizationRequest(); // UpdateAnOrganizationRequest | 
        try {
            GetAnOrganization200Response result =
                apiInstance.updateAnOrganization(orgId, authorization, updateAnOrganizationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#updateAnOrganization");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orgId** | **String**| Webex Identity assigned organization identifier. | |
| **authorization** | **String**| e.g. Bearer YOUR_AUTHORIZATION_TOKEN | [optional] |
| **updateAnOrganizationRequest** | [**UpdateAnOrganizationRequest**](UpdateAnOrganizationRequest.md)|  | [optional] |

### Return type

[**GetAnOrganization200Response**](GetAnOrganization200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

