

# GetHuntGroupCallPolicyObjectBusyRedirect

Settings for sending calls to a specified destination when all agents are busy or when the hunt group busy status is set to busy.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** | If &#x60;true&#x60;, calls are diverted to a defined phone number when all agents are busy, or when the hunt group busy status is set to busy. |  [optional] |
|**destination** | **String** | Destination for busy redirect. |  [optional] |
|**destinationVoicemailEnabled** | **Boolean** | The enabled or disabled state of sending diverted incoming calls to the &#x60;destination&#x60; number&#39;s voicemail if the &#x60;destination&#x60; is an internal phone number and that number has the voicemail service enabled. |  [optional] |



