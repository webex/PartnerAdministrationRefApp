

# GetCallDetails200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The call identifier of the call. |  |
|**callSessionId** | **String** | The call session identifier of the call session the call belongs to. This can be used to correlate multiple calls that are part of the same call session. |  |
|**personality** | [**PersonalityEnum**](#PersonalityEnum) |  The personality of the call. |  |
|**state** | [**StateEnum**](#StateEnum) | The current state of the call. |  |
|**remoteParty** | [**GetCallDetails200ResponseRemoteParty**](GetCallDetails200ResponseRemoteParty.md) |  |  |
|**appearance** | **BigDecimal** | The appearance value for the call. The appearance value can be used to display the user&#39;s calls in an order consistent with the user&#39;s devices. Only present when the call has an appearance value assigned. |  [optional] |
|**created** | **String** | The date and time the call was created. |  |
|**answered** | **String** | The date and time the call was answered. Only present when the call has been answered. |  [optional] |
|**redirections** | **List&lt;Object&gt;** | The list of details for previous redirections of the incoming call ordered from most recent to least recent. For example, if user B forwards an incoming call to user C, then a redirection entry is present for B&#39;s forwarding in C&#39;s incoming call details. Only present when there were previous redirections and the incoming call&#39;s state is alerting. |  [optional] |
|**recall** | [**GetCallDetails200ResponseRecall**](GetCallDetails200ResponseRecall.md) |  |  [optional] |
|**recordingState** | [**RecordingStateEnum**](#RecordingStateEnum) | The call&#39;s current recording state. Only present when the user&#39;s call recording has been invoked during the life of the call. |  [optional] |



## Enum: PersonalityEnum

| Name | Value |
|---- | -----|
| ORIGINATOR | &quot;originator&quot; |
| TERMINATOR | &quot;terminator&quot; |
| CLICK_TO_DIAL | &quot;clickToDial&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| CONNECTING | &quot;connecting&quot; |
| ALERTING | &quot;alerting&quot; |
| CONNECTED | &quot;connected&quot; |
| HELD | &quot;held&quot; |
| REMOTE_HELD | &quot;remoteHeld&quot; |
| DISCONNECTED | &quot;disconnected&quot; |



## Enum: RecordingStateEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| STARTED | &quot;started&quot; |
| PAUSED | &quot;paused&quot; |
| STOPPED | &quot;stopped&quot; |
| FAILED | &quot;failed&quot; |



