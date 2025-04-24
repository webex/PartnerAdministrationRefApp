

# GetAvailableAgentsFromCallPickups200ResponseAgentsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID of a person, workspace or virtual line. |  |
|**firstName** | **String** | First name of a person, workspace or virtual line. |  |
|**lastName** | **String** | Last name of a person, workspace or virtual line. |  |
|**displayName** | **String** | Display name of a person, workspace or virtual line. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the person, workspace or virtual line. |  |
|**email** | **String** | Email of a person, workspace or virtual line. |  |
|**phoneNumber** | **List&lt;Object&gt;** | List of phone numbers of a person, workspace or virtual line. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PEOPLE | &quot;PEOPLE&quot; |
| PLACE | &quot;PLACE&quot; |
| VIRTUAL_LINE | &quot;VIRTUAL_LINE&quot; |



