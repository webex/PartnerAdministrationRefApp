

# GetDetailsForAHuntGroup200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier for the hunt group. |  |
|**name** | **String** | Unique name for the hunt group. |  |
|**phoneNumber** | **String** | Primary phone number of the hunt group. |  [optional] |
|**extension** | **String** | Extension of the hunt group. |  [optional] |
|**distinctiveRing** | **Boolean** | Whether or not the hunt group has the distinctive ring option enabled. |  |
|**alternateNumbers** | **List&lt;Object&gt;** | The alternate numbers feature allows you to assign multiple phone numbers or extensions to a hunt group. Each number will reach the same greeting and each menu will function identically to the main number. The alternate numbers option enables you to have up to ten (10) phone numbers ring into the hunt group. |  |
|**language** | **String** | Language for hunt group. |  [optional] |
|**languageCode** | **String** | Language code for hunt group. |  [optional] |
|**firstName** | **String** | First name to be shown when calls are forwarded out of this hunt group. Defaults to &#x60;.&#x60;. |  [optional] |
|**lastName** | **String** | Last name to be shown when calls are forwarded out of this hunt group. Defaults to phone number if set, otherwise defaults to call group name. |  [optional] |
|**timeZone** | **String** | Time zone for the hunt group. |  [optional] |
|**callPolicies** | [**GetDetailsForAHuntGroup200ResponseCallPolicies**](GetDetailsForAHuntGroup200ResponseCallPolicies.md) |  |  |
|**agents** | **List&lt;Object&gt;** | People, workspaces and virtual lines that are eligible to  receive calls. |  |
|**enabled** | **Boolean** | Whether or not the hunt group is enabled. |  |
|**huntGroupCallerIdForOutgoingCallsEnabled** | **Boolean** | Whether or not the hunt group can be used as the caller ID when the agent places outgoing calls. |  [optional] |



