

# ListReport


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique report id that corresponds to a billing report. |  [optional] |
|**billingStartDate** | **String** | Billing report startDate. |  [optional] |
|**billingEndDate** | **String** | Billing report endDate. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the billing report |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Billing Report Type. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| USER | &quot;USER&quot; |
| CUSTOMER | &quot;CUSTOMER&quot; |
| PARTNER | &quot;PARTNER&quot; |



