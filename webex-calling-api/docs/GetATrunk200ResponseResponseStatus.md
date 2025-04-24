

# GetATrunk200ResponseResponseStatus

Present partial error/warning status information included when the http response is 206.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **BigDecimal** | Error Code. 25013 for error retrieving the outbound proxy. 25014 for error retrieving the status |  |
|**type** | [**TypeEnum**](#TypeEnum) | Status type. |  |
|**summaryEnglish** | **String** | Error summary in English. |  |
|**detail** | **List&lt;Object&gt;** | Error Details. |  |
|**trackingId** | **String** | Error Tracking ID. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ERROR | &quot;ERROR&quot; |
| WARNING | &quot;WARNING&quot; |



