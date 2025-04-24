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


# CallQueueQueueSettingsGetObjectOverflow

Settings for incoming calls exceed queueSize.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) | Indicates how to handle new calls when the queue is full. |  |
|**sendToVoicemail** | **Boolean** | When &#x60;true&#x60;, forwards all calls to a voicemail service of an internal number. This option is ignored when an external &#x60;transferNumber&#x60; is entered. |  [optional] |
|**transferNumber** | **String** | Destination number for overflow calls when &#x60;action&#x60; is set to &#x60;TRANSFER_TO_PHONE_NUMBER&#x60;. |  [optional] |
|**overflowAfterWaitEnabled** | **Boolean** | After calls wait for the configured number of seconds and no agent is available, the overflow treatment is triggered. |  [optional] |
|**overflowAfterWaitTime** | **BigDecimal** | Number of seconds to wait before the overflow treatment is triggered when no agent is available. The minimum value 0, The maximum value is 7200 seconds. |  [optional] |
|**playOverflowGreetingEnabled** | **Boolean** | Indicate overflow audio to be played, otherwise, callers will hear the hold music until the call is answered by a user. |  [optional] |
|**greeting** | [**GreetingEnum**](#GreetingEnum) | Indicates how to handle new calls when the queue is full. |  |
|**audioAnnouncementFiles** | **List&lt;Object&gt;** | Array of announcement files to be played as &#x60;overflow&#x60; greetings. These files are from the list of announcement files associated with this call queue. For &#x60;CUSTOM&#x60; announcement, a minimum of 1 file is mandatory, and the maximum is 4. |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| PERFORM_BUSY_TREATMENT | &quot;PERFORM_BUSY_TREATMENT&quot; |
| PLAY_RINGING_UNTIL_CALLER_HANGS_UP | &quot;PLAY_RINGING_UNTIL_CALLER_HANGS_UP&quot; |
| TRANSFER_TO_PHONE_NUMBER | &quot;TRANSFER_TO_PHONE_NUMBER&quot; |



## Enum: GreetingEnum

| Name | Value |
|---- | -----|
| CUSTOM | &quot;CUSTOM&quot; |
| DEFAULT | &quot;DEFAULT&quot; |



