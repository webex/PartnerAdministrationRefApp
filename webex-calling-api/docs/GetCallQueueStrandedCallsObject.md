

# GetCallQueueStrandedCallsObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) | Specifies call processing action type. |  |
|**transferPhoneNumber** | **String** | Call gets transferred to this number when action is set to &#x60;TRANSFER&#x60;. This can also be an extension. |  [optional] |
|**audioMessageSelection** | [**AudioMessageSelectionEnum**](#AudioMessageSelectionEnum) | Specifies what type of announcement to be played. |  |
|**audioFiles** | **List&lt;Object&gt;** | List of Announcement Audio Files when &#x60;audioMessageSelection&#x60; is &#x60;CUSTOM&#x60;. |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| NONE | &quot;NONE&quot; |
| BUSY | &quot;BUSY&quot; |
| TRANSFER | &quot;TRANSFER&quot; |
| NIGHT_SERVICE | &quot;NIGHT_SERVICE&quot; |
| RINGING | &quot;RINGING&quot; |
| ANNOUNCEMENT | &quot;ANNOUNCEMENT&quot; |



## Enum: AudioMessageSelectionEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;DEFAULT&quot; |
| CUSTOM | &quot;CUSTOM&quot; |



