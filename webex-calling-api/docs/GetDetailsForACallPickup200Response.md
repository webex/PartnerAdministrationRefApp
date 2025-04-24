

# GetDetailsForACallPickup200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier for the call pickup. |  |
|**name** | **String** | Unique name for the call pickup. The maximum length is 80. |  |
|**notificationType** | [**NotificationTypeEnum**](#NotificationTypeEnum) | Type of the notification when an incoming call is unanswered. The call pickup group notifies all of its members. Default: NONE. |  [optional] |
|**notificationDelayTimerSeconds** | **BigDecimal** | After the number of seconds given by the &#x60;notificationDelayTimerSeconds&#x60; has elapsed, notify every member of the call pickup group when an incoming call goes unanswered. The &#x60;notificationType&#x60; field specifies the notification method. Default: 6. |  [optional] |
|**agents** | **List&lt;Object&gt;** | People, workspaces and virtual lines that are eligible to receive calls. |  [optional] |



## Enum: NotificationTypeEnum

| Name | Value |
|---- | -----|
| NONE | &quot;NONE&quot; |
| AUDIO_ONLY | &quot;AUDIO_ONLY&quot; |
| VISUAL_ONLY | &quot;VISUAL_ONLY&quot; |
| AUDIO_AND_VISUAL | &quot;AUDIO_AND_VISUAL&quot; |



