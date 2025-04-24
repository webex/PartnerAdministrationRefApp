

# GetHuntGroupCallPolicyObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**policy** | [**HuntPolicySelection**](HuntPolicySelection.md) | Call routing policy used to dispatch calls to agents. |  |
|**waitingEnabled** | **Boolean** | If &#x60;false&#x60;, then the option is treated as \&quot;Advance when busy\&quot;. The hunt group won&#39;t ring agents when they&#39;re on a call and advances to the next agent. If a hunt group agent has call waiting enabled and the call is advanced to them, the call waits until that hunt group agent isn&#39;t busy. |  [optional] |
|**groupBusyEnabled** | **Boolean** | When &#x60;true&#x60;, the hunt group busy status will be set to busy. All new calls will get busy treatment. If &#x60;busyRedirect&#x60; is enabled, the calls are routed to the destination specified in &#x60;busyRedirect&#x60;. |  [optional] |
|**allowMembersToControlGroupBusyEnabled** | **Boolean** | When &#x60;true&#x60;, agents can change the hunt group busy status. |  [optional] |
|**noAnswer** | [**GetHuntGroupCallPolicyObjectNoAnswer**](GetHuntGroupCallPolicyObjectNoAnswer.md) |  |  |
|**busyRedirect** | [**GetHuntGroupCallPolicyObjectBusyRedirect**](GetHuntGroupCallPolicyObjectBusyRedirect.md) |  |  [optional] |
|**businessContinuityRedirect** | [**GetHuntGroupCallPolicyObjectBusinessContinuityRedirect**](GetHuntGroupCallPolicyObjectBusinessContinuityRedirect.md) |  |  [optional] |
|**businessContinuity** | [**GetHuntGroupCallPolicyObjectBusinessContinuity**](GetHuntGroupCallPolicyObjectBusinessContinuity.md) |  |  |



