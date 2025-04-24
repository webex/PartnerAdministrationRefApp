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


# Call


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The call identifier of the call. |  |
|**callSessionId** | **String** | The call session identifier of the call session the call belongs to. This can be used to correlate multiple calls that are part of the same call session. |  |
|**personality** | **CallPersonalityEnum** |  |  |
|**state** | **CallStateEnum** |  |  |
|**remoteParty** | [**PartyInformation**](PartyInformation.md) |  |  |
|**appearance** | **BigDecimal** | The appearance value for the call. The appearance value can be used to display the user&#39;s calls in an order consistent with the user&#39;s devices. Only present when the call has an appearance value assigned. |  [optional] |
|**created** | **String** | The date and time the call was created. |  |
|**answered** | **String** | The date and time the call was answered. Only present when the call has been answered. |  [optional] |
|**redirections** | **List&lt;Object&gt;** | The list of details for previous redirections of the incoming call ordered from most recent to least recent. For example, if user B forwards an incoming call to user C, then a redirection entry is present for B&#39;s forwarding in C&#39;s incoming call details. Only present when there were previous redirections and the incoming call&#39;s state is alerting. |  [optional] |
|**recall** | [**RecallInformation**](RecallInformation.md) |  |  [optional] |
|**recordingState** | **RecordingStateEnum** |  |  [optional] |



