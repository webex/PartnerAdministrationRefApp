

# GetCallQueueObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier for the call queue. |  |
|**name** | **String** | Unique name for the call queue. |  |
|**enabled** | **Boolean** | Whether or not the call queue is enabled. |  |
|**language** | **String** | Language for the call queue. |  [optional] |
|**languageCode** | **String** | Language code. |  [optional] |
|**firstName** | **String** | First name to be shown when calls are forwarded out of this call queue. Defaults to &#x60;.&#x60;. |  [optional] |
|**lastName** | **String** | Last name to be shown when calls are forwarded out of this call queue. Defaults to the &#x60;phoneNumber&#x60; if set, otherwise defaults to call group name. |  [optional] |
|**timeZone** | **String** | Time zone for the call queue. |  [optional] |
|**phoneNumber** | **String** | Primary phone number of the call queue. |  [optional] |
|**extension** | **String** | Extension of the call queue. |  [optional] |
|**routingPrefix** | **String** | Routing prefix of location. |  [optional] |
|**esn** | **String** | Routing prefix + extension of a person or workspace. |  [optional] |
|**tollFreeNumber** | **Boolean** | Indicate if the number is toll free. |  [optional] |
|**phoneNumberForOutgoingCallsEnabled** | **Boolean** | When true, indicates that the agent&#39;s configuration allows them to use the queue&#39;s Caller ID for outgoing calls. |  [optional] |
|**callingLineIdPolicy** | [**CallingLineIdPolicyEnum**](#CallingLineIdPolicyEnum) | Which type of Calling Line ID Policy Selected for Call Queue. |  [optional] |
|**callingLineIdPhoneNumber** | **String** | Calling line ID Phone number which will be shown if CUSTOM is selected. |  [optional] |
|**alternateNumberSettings** | [**GetCallQueueObjectAlternateNumberSettings**](GetCallQueueObjectAlternateNumberSettings.md) |  |  |
|**callPolicies** | [**GetCallQueueCallPolicyObject**](GetCallQueueCallPolicyObject.md) |  |  |
|**queueSettings** | [**CallQueueQueueSettingsGetObject**](CallQueueQueueSettingsGetObject.md) |  |  |
|**allowCallWaitingForAgentsEnabled** | **Boolean** | Flag to indicate whether call waiting is enabled for &#x60;agents&#x60;. |  [optional] |
|**agents** | **List&lt;Object&gt;** | People, workspaces and virtual lines that are eligible to receive calls. |  |
|**allowAgentJoinEnabled** | **Boolean** | Whether or not to allow agents to join or unjoin a queue. |  [optional] |



## Enum: CallingLineIdPolicyEnum

| Name | Value |
|---- | -----|
| DIRECT_LINE | &quot;DIRECT_LINE&quot; |
| LOCATION_NUMBER | &quot;LOCATION_NUMBER&quot; |
| CUSTOM | &quot;CUSTOM&quot; |



