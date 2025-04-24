

# GetHuntGroupCallPolicyObjectBusinessContinuity

Settings for sending calls to a specified destination if the phone is not connected to the network for any reason, such as a power outage, failed internet connection, or wiring problem. The `businessContinuity` object is deprecated and will be removed in the future.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** | Divert calls when unreachable, unanswered calls divert to a defined phone number. This could apply to phone calls that aren&#39;t answered due to a network outage, or all agents of the hunt group are busy and the advance when the busy option is also enabled. For persons with only a mobile device, calls won&#39;t be diverted if there is a network outage. |  |
|**destination** | **String** | Destination for business continuity. |  [optional] |
|**destinationVoicemailEnabled** | **Boolean** | The enabled or disabled state of sending diverted incoming calls to the &#x60;destination&#x60; number&#39;s voicemail if the &#x60;destination&#x60; is an internal phone number and that number has the voicemail service enabled. |  [optional] |



