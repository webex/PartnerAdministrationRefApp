

# ListMeetingArchiveSummaries200ResponseItemsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**archiveId** | **String** | A unique identifier for the meeting archive summary. |  [optional] |
|**serviceType** | [**ServiceTypeEnum**](#ServiceTypeEnum) | Recording achrive summary&#39;s service-type. |  [optional] |
|**title** | **String** | Meeting title. |  [optional] |
|**createTime** | **String** | The date and time in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) compliant format that when the archive was created by the system. |  [optional] |



## Enum: ServiceTypeEnum

| Name | Value |
|---- | -----|
| MEETING_CENTER | &quot;MeetingCenter&quot; |
| EVENT_CENTER | &quot;EventCenter&quot; |
| TRAINING_CENTER | &quot;TrainingCenter&quot; |
| SUPPORT_CENTER | &quot;SupportCenter&quot; |



