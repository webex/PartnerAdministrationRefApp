

# GetEventRecurrence

Recurrance scheme for an event.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recurForEver** | **Boolean** | True if the event repeats forever. Requires either &#x60;recurDaily&#x60; or &#x60;recurWeekly&#x60; to be specified. |  [optional] |
|**recurEndDate** | **String** | End date for the recurring event in the format of &#x60;YYYY-MM-DD&#x60;. Requires either &#x60;recurDaily&#x60; or &#x60;recurWeekly&#x60; to be specified. |  [optional] |
|**recurEndOccurrence** | **BigDecimal** | End recurrence after the event has repeated the specified number of times. Requires either &#x60;recurDaily&#x60; or &#x60;recurWeekly&#x60; to be specified. |  [optional] |
|**recurDaily** | [**GetEventRecurrenceRecurDaily**](GetEventRecurrenceRecurDaily.md) |  |  [optional] |
|**recurWeekly** | [**GetEventRecurrenceRecurWeekly**](GetEventRecurrenceRecurWeekly.md) |  |  [optional] |



