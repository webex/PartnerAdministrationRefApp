

# GetABroadWorksBillingReport200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique report ID that corresponds to a billing report. |  [optional] |
|**billingPeriod** | **String** | The year and month (&#x60;YYYY-MM&#x60;) for which the billing report was generated. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the billing report. |  [optional] |
|**created** | **String** | The date and time the report was generated. |  [optional] |
|**createdBy** | **String** | The person ID of the partner administrator who created the report. |  [optional] |
|**tempDownloadURL** | **String** | The URL for partners to download the billing report. |  [optional] |
|**errors** | **List&lt;Object&gt;** | List of errors that occurred during report generation.  **Note:**  * Captures errors that occurred during asynchronous or background report generation, after the request has been accepted and a &#x60;202 OK&#x60; response is returned. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |



