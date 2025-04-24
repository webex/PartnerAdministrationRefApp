

# GetAPersonSPrivacySettings200ResponseMonitoringAgentsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the person. |  [optional] |
|**lastName** | **String** | Last name of the person. |  [optional] |
|**firstName** | **String** | First name of the person. |  [optional] |
|**displayName** | **String** | Display name of the person. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type usually indicates &#x60;PEOPLE&#x60;, &#x60;PLACE&#x60; or &#x60;VIRTUAL_LINE&#x60;. Push-to-Talk and Privacy features only supports &#x60;PEOPLE&#x60;. |  [optional] |
|**email** | **String** | Email address of the person. |  [optional] |
|**numbers** | [**List&lt;GetAPersonSPrivacySettings200ResponseMonitoringAgentsInnerNumbersInner&gt;**](GetAPersonSPrivacySettings200ResponseMonitoringAgentsInnerNumbersInner.md) | List of phone numbers of the person. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PEOPLE | &quot;PEOPLE&quot; |
| PLACE | &quot;PLACE&quot; |
| VIRTUAL_LINE | &quot;VIRTUAL_LINE&quot; |



