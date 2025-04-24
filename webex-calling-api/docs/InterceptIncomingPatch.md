

# InterceptIncomingPatch


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Indicated incoming calls are intercepted. |  [optional] |
|**voicemailEnabled** | **Boolean** | Indicates enabled or disabled state of sending incoming calls to voicemail when the destination is an internal phone number and that number has the voicemail service enabled. |  [optional] |
|**announcements** | [**InterceptAnnouncementsPatch**](InterceptAnnouncementsPatch.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| INTERCEPT_ALL | &quot;INTERCEPT_ALL&quot; |
| ALLOW_ALL | &quot;ALLOW_ALL&quot; |



