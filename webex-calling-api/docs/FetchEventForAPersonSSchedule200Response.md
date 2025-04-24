

# FetchEventForAPersonSSchedule200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Identifier for a event. |  |
|**name** | **String** | Name for the event. |  |
|**startDate** | **String** | Start date of the event, or first occurrence if repeating, in the format of &#x60;YYYY-MM-DD&#x60;.  This field is required if the &#x60;allDayEnabled&#x60; field is present. |  |
|**endDate** | **String** | End date of the event, or first occurrence if repeating, in the format of &#x60;YYYY-MM-DD&#x60;.  This field is required if the &#x60;allDayEnabled&#x60; field is present. |  |
|**startTime** | **String** | Start time of the event in the format of &#x60;HH:MM&#x60; (24 hours format).  This field is required if the &#x60;allDayEnabled&#x60; field is false or omitted. |  |
|**endTime** | **String** | End time of the event in the format of &#x60;HH:MM &#x60;(24 hours format).  This field is required if the &#x60;allDayEnabled&#x60; field is false or omitted. |  |
|**allDayEnabled** | **Boolean** | True if it is all-day event. |  [optional] |
|**recurrence** | [**FetchEventForAPersonSSchedule200ResponseRecurrence**](FetchEventForAPersonSSchedule200ResponseRecurrence.md) |  |  [optional] |



