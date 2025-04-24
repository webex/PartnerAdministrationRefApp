

# GetAWholesaleCustomer200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique Cisco identifier for the customer. This value should be used for the &#x60;customerId&#x60; parameter in the Wholesale Customers and Wholesale Subscribers API. |  [optional] |
|**orgId** | **String** | The Organization ID of the enterprise on Cisco Webex, to be used when referencing this customer on other Cisco Webex APIs. Only presented when status is &#x60;provisioned&#x60;. |  [optional] |
|**externalId** | **String** | External ID of the Customer. |  [optional] |
|**address** | [**GetAWholesaleCustomer200ResponseAddress**](GetAWholesaleCustomer200ResponseAddress.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The provisioning status of the customer. |  [optional] |
|**packages** | **List&lt;Object&gt;** | List of package names provisioned |  [optional] |
|**resourceDetails** | [**GetAWholesaleCustomer200ResponseResourceDetails**](GetAWholesaleCustomer200ResponseResourceDetails.md) |  |  [optional] |
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



