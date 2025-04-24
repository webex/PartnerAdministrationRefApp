

# GetAScheduleDetails200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Identifier for a schedule. |  |
|**name** | **String** | Name for the schedule. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Indicates the schedule type whether &#x60;businessHours&#x60; or &#x60;holidays&#x60;. |  |
|**events** | [**List&lt;CreateScheduleForAPersonRequestEventsInner&gt;**](CreateScheduleForAPersonRequestEventsInner.md) | Indicates a list of events. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BUSINESS_HOURS | &quot;businessHours&quot; |
| HOLIDAYS | &quot;holidays&quot; |



