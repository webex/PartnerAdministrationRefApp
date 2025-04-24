

# InterceptOutGoingPatch


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | All outgoing calls are intercepted. |  [optional] |
|**transferEnabled** | **Boolean** | If &#x60;true&#x60;, when the person attempts to make an outbound call, a system default message is played and the call is made to the destination phone number. |  [optional] |
|**destination** | **String** | Number to which the outbound call be transferred. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| INTERCEPT_ALL | &quot;INTERCEPT_ALL&quot; |
| ALLOW_LOCAL_ONLY | &quot;ALLOW_LOCAL_ONLY&quot; |



