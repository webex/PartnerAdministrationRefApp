

# GetSelectiveCallForwardingRuleForAHuntGroup200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Unique name for the selective rule in the hunt group. |  |
|**id** | **String** | Unique ID for the rule. |  |
|**enabled** | **Boolean** | Reflects if rule is enabled. |  [optional] |
|**holidaySchedule** | **String** | Name of the location&#39;s holiday schedule which determines when this selective call forwarding rule is in effect. |  [optional] |
|**businessSchedule** | **String** | Name of the location&#39;s business schedule which determines when this selective call forwarding rule is in effect. |  [optional] |
|**forwardTo** | [**GetSelectiveCallForwardingRuleForAHuntGroup200ResponseForwardTo**](GetSelectiveCallForwardingRuleForAHuntGroup200ResponseForwardTo.md) |  |  [optional] |
|**callsFrom** | [**CreateASelectiveCallForwardingRuleForAHuntGroupRequestCallsFrom**](CreateASelectiveCallForwardingRuleForAHuntGroupRequestCallsFrom.md) |  |  |
|**callsTo** | [**CreateASelectiveCallForwardingRuleForAHuntGroupRequestCallsTo**](CreateASelectiveCallForwardingRuleForAHuntGroupRequestCallsTo.md) |  |  |



