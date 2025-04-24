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


# CallQueueQueueSettingsGetObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**queueSize** | **BigDecimal** | The maximum number of calls for this call queue. Once this number is reached, the &#x60;overflow&#x60; settings are triggered. |  |
|**callOfferToneEnabled** | **Boolean** | Play ringing tone to callers when their call is set to an available agent. |  [optional] |
|**resetCallStatisticsEnabled** | **Boolean** | Reset caller statistics upon queue entry. |  [optional] |
|**overflow** | [**CallQueueQueueSettingsGetObjectOverflow**](CallQueueQueueSettingsGetObjectOverflow.md) |  |  |
|**welcomeMessage** | [**CallQueueQueueSettingsGetObjectWelcomeMessage**](CallQueueQueueSettingsGetObjectWelcomeMessage.md) |  |  [optional] |
|**waitMessage** | [**CallQueueQueueSettingsGetObjectWaitMessage**](CallQueueQueueSettingsGetObjectWaitMessage.md) |  |  [optional] |
|**comfortMessage** | [**CallQueueQueueSettingsGetObjectComfortMessage**](CallQueueQueueSettingsGetObjectComfortMessage.md) |  |  [optional] |
|**comfortMessageBypass** | [**CallQueueQueueSettingsGetObjectComfortMessageBypass**](CallQueueQueueSettingsGetObjectComfortMessageBypass.md) |  |  [optional] |
|**mohMessage** | [**CallQueueQueueSettingsGetObjectMohMessage**](CallQueueQueueSettingsGetObjectMohMessage.md) |  |  [optional] |
|**whisperMessage** | [**CallQueueQueueSettingsGetObjectWhisperMessage**](CallQueueQueueSettingsGetObjectWhisperMessage.md) |  |  [optional] |



