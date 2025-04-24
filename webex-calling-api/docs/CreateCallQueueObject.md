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


# CreateCallQueueObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Unique name for the call queue. |  |
|**phoneNumber** | **String** | Primary phone number of the call queue. Either a &#x60;phoneNumber&#x60; or &#x60;extension&#x60; is mandatory. |  [optional] |
|**extension** | **String** | Primary phone extension of the call queue. Either a &#x60;phoneNumber&#x60; or extension is mandatory. |  [optional] |
|**languageCode** | **String** | Language code. |  [optional] |
|**firstName** | **String** | First name to be shown when calls are forwarded out of this call queue. Defaults to \&quot;.\&quot;. |  [optional] |
|**lastName** | **String** | Last name to be shown when calls are forwarded out of this call queue. Defaults to &#x60;phoneNumber&#x60; if set, otherwise defaults to call group name. |  [optional] |
|**timeZone** | **String** | Time zone for the call queue. |  [optional] |
|**callPolicies** | [**PostCallQueueCallPolicyObject**](PostCallQueueCallPolicyObject.md) |  |  |
|**queueSettings** | [**CallQueueQueueSettingsObject**](CallQueueQueueSettingsObject.md) |  |  |
|**agents** | **List&lt;Object&gt;** | People, workspaces and virtual lines that are eligible to receive calls. |  |
|**callingLineIdPolicy** | [**CallingLineIdPolicyEnum**](#CallingLineIdPolicyEnum) | Which type of Calling Line ID Policy Selected for Call Queue. |  [optional] |
|**callingLineIdPhoneNumber** | **String** | Calling line ID Phone number which will be shown if CUSTOM is selected. |  [optional] |
|**allowAgentJoinEnabled** | **Boolean** | Whether or not to allow agents to join or unjoin a queue. |  [optional] |
|**phoneNumberForOutgoingCallsEnabled** | **Boolean** | When true, indicates that the agent&#39;s configuration allows them to use the queue&#39;s Caller ID for outgoing calls. |  [optional] |



## Enum: CallingLineIdPolicyEnum

| Name | Value |
|---- | -----|
| DIRECT_LINE | &quot;DIRECT_LINE&quot; |
| LOCATION_NUMBER | &quot;LOCATION_NUMBER&quot; |
| CUSTOM | &quot;CUSTOM&quot; |



