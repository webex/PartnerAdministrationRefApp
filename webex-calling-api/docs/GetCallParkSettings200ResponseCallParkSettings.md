

# GetCallParkSettings200ResponseCallParkSettings

Setting controlling call park behavior.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ringPattern** | [**RingPatternEnum**](#RingPatternEnum) | Ring pattern for when this callpark is called. |  |
|**recallTime** | **BigDecimal** | Amount of time within 30 and 600 seconds the Call Park will be parked. If the call isn&#39;t picked up within the set time, then the call will be recalled based on the Call Park Recall setting. |  [optional] |
|**huntWaitTime** | **BigDecimal** | Amount of time within 30 and 600 seconds the Call Park will be parked. If the call isn&#39;t picked up, the call will revert back to the hunt group (after the person who parked the call is alerted). |  [optional] |



## Enum: RingPatternEnum

| Name | Value |
|---- | -----|
| NORMAL | &quot;NORMAL&quot; |
| LONG_LONG | &quot;LONG_LONG&quot; |
| SHORT_SHORT_LONG | &quot;SHORT_SHORT_LONG&quot; |
| SHORT_LONG_SHORT | &quot;SHORT_LONG_SHORT&quot; |



