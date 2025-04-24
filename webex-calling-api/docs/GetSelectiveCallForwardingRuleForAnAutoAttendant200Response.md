

# GetSelectiveCallForwardingRuleForAnAutoAttendant200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique ID for the rule. |  |
|**name** | **String** | Unique name for the selective rule in the auto attendant. |  |
|**enabled** | **Boolean** | Reflects if rule is enabled. |  |
|**businessSchedule** | **String** | Name of the location&#39;s business schedule which determines when this selective call forwarding rule is in effect. |  |
|**holidaySchedule** | **String** | Name of the location&#39;s holiday schedule which determines when this selective call forwarding rule is in effect. |  [optional] |
|**forwardTo** | [**CreateASelectiveCallForwardingRuleForAnAutoAttendantRequestForwardTo**](CreateASelectiveCallForwardingRuleForAnAutoAttendantRequestForwardTo.md) |  |  |
|**callsFrom** | [**CreateASelectiveCallForwardingRuleForAnAutoAttendantRequestCallsFrom**](CreateASelectiveCallForwardingRuleForAnAutoAttendantRequestCallsFrom.md) |  |  |
|**callsTo** | [**CreateASelectiveCallForwardingRuleForAHuntGroupRequestCallsTo**](CreateASelectiveCallForwardingRuleForAHuntGroupRequestCallsTo.md) |  |  |



