

# GetDetailsForACallQueueNightService200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nightServiceEnabled** | **Boolean** | Whether or not the call queue night service routing policy is enabled. |  |
|**action** | [**ActionEnum**](#ActionEnum) | Specifies call processing action type. |  [optional] |
|**transferPhoneNumber** | **String** | Call gets transferred to this number when action is set to &#x60;TRANSFER&#x60;. This can also be an extension. |  [optional] |
|**playAnnouncementBeforeEnabled** | **Boolean** | Specifies if an announcement plays to callers before applying the action. |  |
|**announcementMode** | [**AnnouncementModeEnum**](#AnnouncementModeEnum) | Specifies the type of announcements to played. |  |
|**audioMessageSelection** | [**AudioMessageSelectionEnum**](#AudioMessageSelectionEnum) | Specifies what type of announcements to be played when &#x60;announcementMode&#x60; is &#x60;NORMAL&#x60;. |  |
|**audioFiles** | **List&lt;Object&gt;** | List of Announcement Audio Files when &#x60;audioMessageSelection&#x60; is &#x60;CUSTOM&#x60;. |  [optional] |
|**businessHoursName** | **String** | Name of the schedule configured for a night service as one of from &#x60;businessHourSchedules&#x60; list. |  [optional] |
|**businessHoursLevel** | [**BusinessHoursLevelEnum**](#BusinessHoursLevelEnum) | Specifies whether the above mentioned schedule is org or location specific. (Must be from &#x60;businessHourSchedules&#x60; list). |  [optional] |
|**businessHourSchedules** | **List&lt;Object&gt;** | Lists the pre-configured business hour schedules. |  [optional] |
|**forceNightServiceEnabled** | **Boolean** | Force night service regardless of business hour schedule. |  |
|**manualAudioMessageSelection** | [**ManualAudioMessageSelectionEnum**](#ManualAudioMessageSelectionEnum) | Specifies what type of announcement to be played when &#x60;announcementMode&#x60; is &#x60;MANUAL&#x60;. |  |
|**manualAudioFiles** | **List&lt;Object&gt;** | List Of Audio Files. |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| BUSY | &quot;BUSY&quot; |
| TRANSFER | &quot;TRANSFER&quot; |



## Enum: AnnouncementModeEnum

| Name | Value |
|---- | -----|
| NORMAL | &quot;NORMAL&quot; |
| MANUAL | &quot;MANUAL&quot; |



## Enum: AudioMessageSelectionEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;DEFAULT&quot; |
| CUSTOM | &quot;CUSTOM&quot; |



## Enum: BusinessHoursLevelEnum

| Name | Value |
|---- | -----|
| ORGANIZATION | &quot;ORGANIZATION&quot; |
| LOCATION | &quot;LOCATION&quot; |



## Enum: ManualAudioMessageSelectionEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;DEFAULT&quot; |
| CUSTOM | &quot;CUSTOM&quot; |



