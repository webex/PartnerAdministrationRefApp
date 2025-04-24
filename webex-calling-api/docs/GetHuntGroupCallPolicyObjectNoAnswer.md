

# GetHuntGroupCallPolicyObjectNoAnswer

Settings for when the call into the hunt group is not answered.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nextAgentEnabled** | **Boolean** | If enabled, advance to next agent after the &#x60;nextAgentRings&#x60; has occurred. |  |
|**nextAgentRings** | **BigDecimal** | Number of rings before call will be forwarded if unanswered and &#x60;nextAgentEnabled&#x60; is true. |  |
|**forwardEnabled** | **Boolean** | If &#x60;true&#x60;, forwards unanswered calls to the destination after the number of rings occurs. |  |
|**destination** | **String** | Destination if &#x60;forwardEnabled&#x60; is True. |  [optional] |
|**numberOfRings** | **BigDecimal** | Number of rings before forwarding calls if &#x60;forwardEnabled&#x60; is true. |  |
|**systemMaxNumberOfRings** | **BigDecimal** | System-wide maximum number of rings allowed for &#x60;numberOfRings&#x60; setting. |  |
|**destinationVoicemailEnabled** | **Boolean** | If &#x60;destinationVoicemailEnabled&#x60; is true, enables and disables sending incoming to destination number&#39;s voicemail if the destination is an internal phone number and that number has the voicemail service enabled. |  |



