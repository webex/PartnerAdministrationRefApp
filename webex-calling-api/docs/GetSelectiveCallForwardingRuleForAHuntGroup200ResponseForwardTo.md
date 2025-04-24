

# GetSelectiveCallForwardingRuleForAHuntGroup200ResponseForwardTo

Controls what happens when the rule matches including the destination number for the call forwarding.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**selection** | [**SelectionEnum**](#SelectionEnum) | Controls what happens when the rule matches. |  |
|**phoneNumber** | **String** | Phone number used if selection is &#x60;FORWARD_TO_SPECIFIED_NUMBER&#x60;. |  [optional] |



## Enum: SelectionEnum

| Name | Value |
|---- | -----|
| FORWARD_TO_DEFAULT_NUMBER | &quot;FORWARD_TO_DEFAULT_NUMBER&quot; |
| FORWARD_TO_SPECIFIED_NUMBER | &quot;FORWARD_TO_SPECIFIED_NUMBER&quot; |
| DO_NOT_FORWARD | &quot;DO_NOT_FORWARD&quot; |



