

# GetPagingGroupAgentObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Agents ID. |  |
|**firstName** | **String** | Agent&#39;s first name. Minimum length is 1. Maximum length is 64. |  |
|**lastName** | **String** | Agent&#39;s last name. Minimum length is 1. Maximum length is 64. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the person, workspace or virtual line. |  |
|**phoneNumber** | **String** | Agent&#39;s phone number. Minimum length is 1. Maximum length is 23.  Either &#x60;phoneNumber&#x60; or &#x60;extension&#x60; is mandatory. |  [optional] |
|**extension** | **String** | Agent&#39;s extension. Minimum length is 2. Maximum length is 10.  Either &#x60;phoneNumber&#x60; or &#x60;extension&#x60; is mandatory. |  [optional] |
|**routingPrefix** | **String** | Routing prefix of location. |  [optional] |
|**esn** | **String** | Routing prefix + extension of a person or workspace. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PEOPLE | &quot;PEOPLE&quot; |
| PLACE | &quot;PLACE&quot; |
| VIRTUAL_LINE | &quot;VIRTUAL_LINE&quot; |



