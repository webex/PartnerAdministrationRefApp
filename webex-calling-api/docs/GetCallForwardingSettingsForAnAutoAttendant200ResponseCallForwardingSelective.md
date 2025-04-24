

# GetCallForwardingSettingsForAnAutoAttendant200ResponseCallForwardingSelective

Selectively forward calls to a designated number, depending on criteria rules. You'll need to have at least one rule for forwarding applied for call forwarding to be active.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** | &#x60;Busy&#x60; call forwarding is enabled or disabled. |  |
|**destination** | **String** | Destination for &#x60;Busy&#x60; call forwarding. |  [optional] |
|**ringReminderEnabled** | **Boolean** | If &#x60;true&#x60;, a brief tone will be played on the person&#39;s phone when a call has been forwarded. |  |
|**sendToVoicemailEnabled** | **Boolean** | Indicates enabled or disabled state of sending incoming calls to voicemail when the destination is an internal phone number and that number has the voicemail service enabled. |  |



