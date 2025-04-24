

# GetCallForwardingSettingsForAnAutoAttendant200ResponseCallForwardingAlways

Settings for forwarding all incoming calls to the destination you choose.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** | &#x60;Always&#x60; call forwarding is enabled or disabled. |  |
|**destination** | **String** | Destination for &#x60;Always&#x60; call forwarding. Required if field &#x60;enabled&#x60; is set to &#x60;true&#x60;. |  [optional] |
|**ringReminderEnabled** | **Boolean** | If &#x60;true&#x60;, a brief tone will be played on the person&#39;s phone when a call has been forwarded. |  |
|**sendToVoicemailEnabled** | **Boolean** | Indicates enabled or disabled state of sending incoming calls to voicemail when the destination is an internal phone number and that number has the voicemail service enabled. |  |



