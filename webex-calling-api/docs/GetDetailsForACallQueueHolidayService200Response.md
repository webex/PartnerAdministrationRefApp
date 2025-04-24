

# GetDetailsForACallQueueHolidayService200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**holidayServiceEnabled** | **Boolean** | Whether or not the call queue holiday service routing policy is enabled. |  |
|**action** | [**ActionEnum**](#ActionEnum) | Specifies call processing action type. |  |
|**holidayScheduleLevel** | [**HolidayScheduleLevelEnum**](#HolidayScheduleLevelEnum) | Specifies whether the schedule mentioned in &#x60;holidayScheduleName&#x60; is org or location specific. (Must be from &#x60;holidaySchedules&#x60; list) |  |
|**holidayScheduleName** | **String** | Name of the schedule configured for a holiday service as one of from &#x60;holidaySchedules&#x60; list. |  [optional] |
|**transferPhoneNumber** | **String** | Call gets transferred to this number when action is set to &#x60;TRANSFER&#x60;. This can also be an extension. |  [optional] |
|**playAnnouncementBeforeEnabled** | **Boolean** | Specifies if an announcement plays to callers before applying the action. |  |
|**audioMessageSelection** | [**AudioMessageSelectionEnum**](#AudioMessageSelectionEnum) | Specifies what type of announcement to be played. |  |
|**audioFiles** | **List&lt;Object&gt;** | List of Announcement Audio Files when &#x60;audioMessageSelection&#x60; is &#x60;CUSTOM&#x60;. |  [optional] |
|**holidaySchedules** | **List&lt;Object&gt;** | Lists the pre-configured holiday schedules. |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| BUSY | &quot;BUSY&quot; |
| TRANSFER | &quot;TRANSFER&quot; |



## Enum: HolidayScheduleLevelEnum

| Name | Value |
|---- | -----|
| LOCATION | &quot;LOCATION&quot; |
| ORGANIZATION | &quot;ORGANIZATION&quot; |



## Enum: AudioMessageSelectionEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;DEFAULT&quot; |
| CUSTOM | &quot;CUSTOM&quot; |



