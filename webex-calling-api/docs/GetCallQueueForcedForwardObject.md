

# GetCallQueueForcedForwardObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**forcedForwardEnabled** | **Boolean** | Whether or not the call queue forced forward routing policy setting is enabled. |  |
|**transferPhoneNumber** | **String** | Call gets transferred to this number when action is set to &#x60;TRANSFER&#x60;. This can also be an extension. |  [optional] |
|**playAnnouncementBeforeEnabled** | **Boolean** | Specifies if an announcement plays to callers before applying the action. |  |
|**audioMessageSelection** | [**AudioMessageSelectionEnum**](#AudioMessageSelectionEnum) | Specifies what type of announcement to be played. |  |
|**audioFiles** | **List&lt;Object&gt;** | List of Announcement Audio Files when &#x60;audioMessageSelection&#x60; is &#x60;CUSTOM&#x60;. |  [optional] |



## Enum: AudioMessageSelectionEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;DEFAULT&quot; |
| CUSTOM | &quot;CUSTOM&quot; |



