

# GetCallQueueCallPolicyObjectCallBounce

Settings for when the call into the call queue is not answered.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callBounceEnabled** | **Boolean** | If enabled, bounce calls after the set number of rings. |  |
|**callBounceMaxRings** | **BigDecimal** | Number of rings after which to bounce call, if call bounce is enabled. |  |
|**agentUnavailableEnabled** | **Boolean** | Bounce if agent becomes unavailable. |  |
|**alertAgentEnabled** | **Boolean** | Alert agent if call on hold more than &#x60;alertAgentMaxSeconds&#x60;. |  |
|**alertAgentMaxSeconds** | **BigDecimal** | Number of second after which to alert agent if &#x60;alertAgentEnabled&#x60;. |  |
|**callBounceOnHoldEnabled** | **Boolean** | Bounce if call on hold more than &#x60;callBounceMaxSeconds&#x60;. |  |
|**callBounceOnHoldMaxSeconds** | **BigDecimal** | Number of second after which to bounce if &#x60;callBounceEnabled&#x60;. |  |



