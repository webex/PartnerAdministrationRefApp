<!--  Copyright 2025 Cisco Systems Inc.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.-->


# CreateACallPickupRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Unique name for the call pickup. The maximum length is 80. |  |
|**notificationType** | [**NotificationTypeEnum**](#NotificationTypeEnum) | Type of the notification when an incoming call is unanswered. The call pickup group notifies all of its members. Default: NONE. |  [optional] |
|**notificationDelayTimerSeconds** | **BigDecimal** | After the number of seconds given by the &#x60;notificationDelayTimerSeconds&#x60; has elapsed, notify every member of the call pickup group when an incoming call goes unanswered. The &#x60;notificationType&#x60; field specifies the notification method. Default: 6. |  [optional] |
|**agents** | **List&lt;Object&gt;** | An Array of ID strings of people, workspaces and virtual lines that are added to call pickup. |  [optional] |



## Enum: NotificationTypeEnum

| Name | Value |
|---- | -----|
| NONE | &quot;NONE&quot; |
| AUDIO_ONLY | &quot;AUDIO_ONLY&quot; |
| VISUAL_ONLY | &quot;VISUAL_ONLY&quot; |
| AUDIO_AND_VISUAL | &quot;AUDIO_AND_VISUAL&quot; |



