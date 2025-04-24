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


# Customer


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique Cisco identifier for the customer. This value should be used for the &#x60;customerId&#x60; parameter in the Wholesale Customers and Wholesale Subscribers API. |  [optional] |
|**orgId** | **String** | The Organization ID of the enterprise on Cisco Webex, to be used when referencing this customer on other Cisco Webex APIs. Only presented when status is &#x60;provisioned&#x60;. |  [optional] |
|**externalId** | **String** | External ID of the Customer. |  [optional] |
|**address** | [**Address**](Address.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The provisioning status of the customer. |  [optional] |
|**packages** | **List&lt;Object&gt;** | List of package names provisioned |  [optional] |
|**resourceDetails** | [**ResourceDetails**](ResourceDetails.md) |  |  [optional] |
|**errors** | **List&lt;Object&gt;** | List of errors that occurred during that last attempt to provision/update this customer.   *Note:*  + This list captures errors that occurred during *asynchronous or background* provisioning of the customer, *after* the API has been accepted and 202 response returned.  + Any errors that occur during initial API request validation will be captured directly in error response with appropriate HTTP status code. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PROVISIONED | &quot;provisioned&quot; |
| PROVISIONED_WITH_ERRORS | &quot;provisioned_with_errors&quot; |
| PROVISIONING | &quot;provisioning&quot; |
| UPDATING | &quot;updating&quot; |
| DELETING | &quot;deleting&quot; |
| ERROR | &quot;error&quot; |
| PENDING_RPL_REVIEW | &quot;pending_rpl_review&quot; |



