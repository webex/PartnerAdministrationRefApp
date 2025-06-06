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

# openapi-java-client

All Webex Admin API
- API version: 1.0.0
  - Build date: 2024-11-22T14:36:52.661608Z[Europe/Dublin]
  - Generator version: 7.9.0

Webex Admin API specifications


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:1.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:

import org.openapitools.client.WebexAdminApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
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

## Documentation for API Endpoints

All URIs are relative to *https://webexapis.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**deleteOrganization**](docs/DefaultApi.md#deleteOrganization) | **DELETE** /organizations/{orgId} | Delete Organization
*DefaultApi* | [**getAnOrganization**](docs/DefaultApi.md#getAnOrganization) | **GET** /identity/v1/organizations/{orgId} | Get an organization
*DefaultApi* | [**getOrganizationDetails**](docs/DefaultApi.md#getOrganizationDetails) | **GET** /organizations/{orgId} | Get Organization Details
*DefaultApi* | [**listOrganizations**](docs/DefaultApi.md#listOrganizations) | **GET** /organizations | List Organizations
*DefaultApi* | [**updateAnOrganization**](docs/DefaultApi.md#updateAnOrganization) | **PATCH** /identity/v1/organizations/{orgId} | Update an organization


## Documentation for Models

 - [GetAnOrganization200Response](docs/GetAnOrganization200Response.md)
 - [GetAnOrganization200ResponseMeta](docs/GetAnOrganization200ResponseMeta.md)
 - [GetOrgResponse](docs/GetOrgResponse.md)
 - [GetOrganizationDetails200Response](docs/GetOrganizationDetails200Response.md)
 - [ListOrganizations200Response](docs/ListOrganizations200Response.md)
 - [MetaObject](docs/MetaObject.md)
 - [Organization](docs/Organization.md)
 - [OrganizationCollectionResponse](docs/OrganizationCollectionResponse.md)
 - [UpdateAnOrganizationRequest](docs/UpdateAnOrganizationRequest.md)
 - [UpdateOrgObject](docs/UpdateOrgObject.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



