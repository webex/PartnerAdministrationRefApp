

# GetMeetingArchiveDetails200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**archiveId** | **String** | A unique identifier for the meeting archive summary. |  |
|**serviceType** | [**ServiceTypeEnum**](#ServiceTypeEnum) | Recording achrive report&#39;s service-type. |  |
|**title** | **String** | Meeting title. |  |
|**start** | **String** | Start time for meeting in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) compliant format. |  |
|**end** | **String** | End time for a meeting in ISO 8601 compliant format. |  |
|**hostDisplayName** | **String** | Display name for the meeting host. |  |
|**hostEmail** | **String** | Email address for the meeting host. |  |
|**participants** | **List&lt;Object&gt;** | The participants of the meeting archive. |  |
|**chats** | **List&lt;Object&gt;** | The chats of the meeting archive. |  |
|**polls** | **List&lt;Object&gt;** | The polls of the meeting archive. |  |
|**qas** | **List&lt;Object&gt;** | Meeting meeting archive&#39;s Q and A. |  |
|**systemInfos** | **List&lt;Object&gt;** | The system Information of the meeting archive, which can be only supported when serviceType is &#x60;SupportCenter&#x60;. |  |



## Enum: ServiceTypeEnum

| Name | Value |
|---- | -----|
| MEETING_CENTER | &quot;MeetingCenter&quot; |
| EVENT_CENTER | &quot;EventCenter&quot; |
| TRAINING_CENTER | &quot;TrainingCenter&quot; |
| SUPPORT_CENTER | &quot;SupportCenter&quot; |



