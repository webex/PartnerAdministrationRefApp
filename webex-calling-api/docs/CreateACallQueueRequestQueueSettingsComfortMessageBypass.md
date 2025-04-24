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


# CreateACallQueueRequestQueueSettingsComfortMessageBypass

Play a shorter comfort message instead of the usual Comfort or Music On Hold announcement to all the calls that should be answered quickly. This feature prevents a caller from hearing a short portion of the standard comfort message that abruptly ends when they are connected to an agent.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** | If enabled play comfort bypass message. |  [optional] |
|**callWaitingAgeThreshold** | **BigDecimal** | The interval in seconds between each repetition of the comfort bypass message played to queued users. The minimum time is 1 seconds. The maximum time is 120 seconds. |  [optional] |
|**greeting** | [**GreetingEnum**](#GreetingEnum) | Indicates how to handle new calls when the queue is full. |  |
|**audioAnnouncementFiles** | **List&lt;Object&gt;** | Array of announcement files to be played as &#x60;comfortMessageBypass&#x60; greetings. These files are from the list of announcements files associated with this call queue. For &#x60;CUSTOM&#x60; announcement, a minimum of 1 file is mandatory, and the maximum is 4. |  [optional] |



## Enum: GreetingEnum

| Name | Value |
|---- | -----|
| CUSTOM | &quot;CUSTOM&quot; |
| DEFAULT | &quot;DEFAULT&quot; |



