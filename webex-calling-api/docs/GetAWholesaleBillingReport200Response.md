

# GetAWholesaleBillingReport200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique report ID that corresponds to a billing report. |  [optional] |
|**billingStartDate** | **String** | Billing report &#x60;startDate&#x60;. |  [optional] |
|**billingEndDate** | **String** | Billing report &#x60;endDate&#x60;. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Billing Report Type |  [optional] |
|**created** | **String** | The date and time the report was generated. |  [optional] |
|**createdBy** | **String** | The person ID of the partner administrator who created the report. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the billing report. |  [optional] |
|**tempDownloadURL** | **String** | The URL for partners to download the billing report. |  [optional] |
|**errors** | **List&lt;Object&gt;** | List of errors that occurred during report generation.  **Note:**  * This list captures errors that occurred during asynchronous or background report generation, after the request has been accepted and a &#x60;202 OK&#x60; response is returned. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| USER | &quot;USER&quot; |
| CUSTOMER | &quot;CUSTOMER&quot; |
| PARTNER | &quot;PARTNER&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |



