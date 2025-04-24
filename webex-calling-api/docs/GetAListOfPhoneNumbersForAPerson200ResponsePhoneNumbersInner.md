

# GetAListOfPhoneNumbersForAPerson200ResponsePhoneNumbersInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**primary** | **Boolean** | Flag to indicate if the number is primary or not. |  [optional] |
|**directNumber** | **String** | Phone number. |  [optional] |
|**extension** | **String** | Extension. |  [optional] |
|**routingPrefix** | **String** | Routing prefix of location. |  [optional] |
|**esn** | **String** | Routing prefix + extension of a person or workspace. |  [optional] |
|**ringPattern** | [**RingPatternEnum**](#RingPatternEnum) | Optional ring pattern. Applicable only for alternate numbers. |  [optional] |



## Enum: RingPatternEnum

| Name | Value |
|---- | -----|
| NORMAL | &quot;NORMAL&quot; |
| LONG_LONG | &quot;LONG_LONG&quot; |
| SHORT_SHORT_LONG | &quot;SHORT_SHORT_LONG&quot; |
| SHORT_LONG_SHORT | &quot;SHORT_LONG_SHORT&quot; |



