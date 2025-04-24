

# GetVirtualLineECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phoneNumber** | **String** | A unique identifier for the phone number. |  |
|**state** | [**StateEnum**](#StateEnum) | Phone number&#39;s state. |  |
|**isMainNumber** | **Boolean** | If &#x60;true&#x60;, the phone number is used as a location CLID. |  |
|**tollFreeNumber** | **Boolean** | If &#x60;true&#x60;, the phone number is a toll-free number. |  |
|**telephonyType** | [**TelephonyTypeEnum**](#TelephonyTypeEnum) | The telephony type for the number. |  |
|**isServiceNumber** | **Boolean** | If &#x60;true&#x60;, the phone number is a service number; otherwise, it is a standard number. Service numbers are high-utilization or high-concurrency PSTN phone numbers that are neither mobile nor toll-free. |  |
|**owner** | [**GetVirtualLineECBNAvailablePhoneNumbers200ResponsePhoneNumbersInnerOwner**](GetVirtualLineECBNAvailablePhoneNumbers200ResponsePhoneNumbersInnerOwner.md) |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| ACTIVE2 | &quot;ACTIVE&quot; |



## Enum: TelephonyTypeEnum

| Name | Value |
|---- | -----|
| NUMBER | &quot;PSTN_NUMBER&quot; |
| NUMBER2 | &quot;PSTN_NUMBER&quot; |



