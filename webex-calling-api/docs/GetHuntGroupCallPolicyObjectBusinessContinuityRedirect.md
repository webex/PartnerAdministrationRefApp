

# GetHuntGroupCallPolicyObjectBusinessContinuityRedirect

Settings for sending calls to a specified destination if the phone is not connected to the network for any reason, such as a power outage, failed internet connection, or wiring problem.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** | If &#x60;true&#x60;, unreachable, unanswered calls are diverted to a defined phone number. For persons with only a mobile device, calls won&#39;t be diverted if there is a network outage. |  [optional] |
|**destination** | **String** | Destination for business continuity redirect. |  [optional] |
|**destinationVoicemailEnabled** | **Boolean** | The enabled or disabled state of sending diverted incoming calls to the &#x60;destination&#x60; number&#39;s voicemail if the &#x60;destination&#x60; is an internal phone number and that number has the voicemail service enabled. |  [optional] |



