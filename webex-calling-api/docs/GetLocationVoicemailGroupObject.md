

# GetLocationVoicemailGroupObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | UUID of voicemail group of a particular location. |  |
|**name** | **String** | Name of the voicemail group. |  |
|**phoneNumber** | **String** | Voicemail group phone number. |  [optional] |
|**extension** | **BigDecimal** | Voicemail group extension number. |  [optional] |
|**routingPrefix** | **String** | Routing prefix of location. |  [optional] |
|**esn** | **String** | Routing prefix + extension of a person or workspace. |  [optional] |
|**tollFreeNumber** | **Boolean** | Voicemail group toll free number. |  [optional] |
|**firstName** | **String** | Voicemail group caller ID first name. |  |
|**lastName** | **String** | Voicemail group called ID last name. |  |
|**enabled** | **Boolean** | Enable/disable voicemail group. |  |
|**languageCode** | **String** | Language for voicemail group audio announcement. |  |
|**greeting** | [**GreetingEnum**](#GreetingEnum) | Set voicemail group greeting type. |  |
|**greetingUploaded** | **Boolean** | Enabled if CUSTOM greeting is previously uploaded. |  |
|**greetingDescription** | **String** | CUSTOM greeting for previously uploaded. |  [optional] |
|**messageStorage** | [**GetLocationVoicemailGroupObjectMessageStorage**](GetLocationVoicemailGroupObjectMessageStorage.md) |  |  [optional] |
|**notifications** | [**GetLocationVoicemailGroupObjectNotifications**](GetLocationVoicemailGroupObjectNotifications.md) |  |  [optional] |
|**faxMessage** | [**GetLocationVoicemailGroupObjectFaxMessage**](GetLocationVoicemailGroupObjectFaxMessage.md) |  |  [optional] |
|**transferToNumber** | [**GetLocationVoicemailGroupObjectTransferToNumber**](GetLocationVoicemailGroupObjectTransferToNumber.md) |  |  [optional] |
|**emailCopyOfMessage** | [**GetLocationVoicemailGroupObjectEmailCopyOfMessage**](GetLocationVoicemailGroupObjectEmailCopyOfMessage.md) |  |  [optional] |
|**voiceMessageForwardingEnabled** | **Boolean** | Enable/disable to forward voice message. |  |



## Enum: GreetingEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;DEFAULT&quot; |
| CUSTOM | &quot;CUSTOM&quot; |



