

# GetPersonPrimaryAvailablePhoneNumbers200ResponsePhoneNumbersInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phoneNumber** | **String** | A unique identifier for the phone number. |  |
|**state** | [**StateEnum**](#StateEnum) | Phone number&#39;s state. |  |
|**isMainNumber** | **Boolean** | Indicates if the phone number is used as a location CLID. |  |
|**telephonyType** | [**TelephonyTypeEnum**](#TelephonyTypeEnum) | Indicates the telephony type for the number. |  |
|**mobileNetwork** | **String** | Mobile Network for the number if the number&#39;s &#x60;telephonyType&#x60; is &#x60;MOBILE_NUMBER&#x60;. |  [optional] |
|**routingProfile** | **String** | Routing Profile for the number if the number&#39;s &#x60;telephonyType&#x60; is &#x60;MOBILE_NUMBER&#x60;. |  [optional] |
|**isServiceNumber** | **Boolean** | If &#x60;true&#x60;, the phone number is a service number; otherwise, it is a standard number. Service numbers are high-utilization or high-concurrency PSTN phone numbers that are neither mobile nor toll-free. |  |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| ACTIVE2 | &quot;ACTIVE&quot; |



## Enum: TelephonyTypeEnum

| Name | Value |
|---- | -----|
| PSTN_NUMBER | &quot;PSTN_NUMBER&quot; |
| MOBILE_NUMBER | &quot;MOBILE_NUMBER&quot; |



