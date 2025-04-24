

# GetPersonPlaceVirtualLineCallQueueObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID of person, workspace or virtual line. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the person, workspace or virtual line. |  |
|**firstName** | **String** | First name of person, workspace or virtual line. |  [optional] |
|**lastName** | **String** | First name of person, workspace or virtual line. |  [optional] |
|**phoneNumber** | **String** | Phone number of person, workspace or virtual line. |  [optional] |
|**extension** | **String** | Extension of person, workspace or virtual line. |  [optional] |
|**weight** | **String** | Weight of person, workspace or virtual line. Only applied when call policy is &#x60;WEIGHTED&#x60;. |  [optional] |
|**skillLevel** | **BigDecimal** | Skill level of person, workspace or virtual line. Only applied when the call &#x60;routingType&#x60; is &#x60;SKILL_BASED&#x60;. |  [optional] |
|**joinEnabled** | **Boolean** | Indicates the join status of the agent for this queue. The default value while creating call queue is &#x60;true&#x60;. |  [optional] |
|**location** | [**LocationObject**](LocationObject.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PEOPLE | &quot;PEOPLE&quot; |
| PLACE | &quot;PLACE&quot; |
| VIRTUAL_LINE | &quot;VIRTUAL_LINE&quot; |



