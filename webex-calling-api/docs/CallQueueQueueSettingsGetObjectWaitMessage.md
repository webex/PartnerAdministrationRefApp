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


# CallQueueQueueSettingsGetObjectWaitMessage

Notify the caller with either their estimated wait time or position in the queue. If this option is enabled, it plays after the welcome message and before the comfort message. By default, it is not enabled.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** | If enabled play Wait Message. |  [optional] |
|**waitMode** | [**WaitModeEnum**](#WaitModeEnum) | Estimated wait message operating mode. Supported values &#x60;TIME&#x60; and &#x60;POSITION&#x60;. |  |
|**handlingTime** | **BigDecimal** | The number of minutes for which the estimated wait is played. The minimum time is 10 minutes. The maximum time is 100 minutes. |  [optional] |
|**defaultHandlingTime** | **BigDecimal** | The default number of call handling minutes. The minimum time is 1 minutes, The maximum time is 100 minutes. |  [optional] |
|**queuePosition** | **BigDecimal** | The number of the position for which the estimated wait is played. The minimum positions are 10, The maximum positions are 100. |  [optional] |
|**highVolumeMessageEnabled** | **Boolean** | Play time / Play position High Volume. |  [optional] |
|**estimatedWaitingTime** | **BigDecimal** | The number of estimated waiting times in seconds. The minimum time is 10 seconds. The maximum time is 600 seconds. |  [optional] |
|**callbackOptionEnabled** | **Boolean** | Callback options enabled/disabled. Default value is false. |  [optional] |
|**minimumEstimatedCallbackTime** | **BigDecimal** | The minimum estimated callback times in minutes. The default value is 30. |  [optional] |
|**internationalCallbackEnabled** | **Boolean** | The international numbers for callback is enabled/disabled. The default value is &#x60;false&#x60;. |  [optional] |
|**playUpdatedEstimatedWaitMessage** | **Boolean** | Play updated estimated wait message. |  [optional] |



## Enum: WaitModeEnum

| Name | Value |
|---- | -----|
| TIME | &quot;TIME&quot; |
| POSITION | &quot;POSITION&quot; |



