

# GetPhoneNumbersForAnOrganizationWithGivenCriterias200ResponsePhoneNumbersInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phoneNumber** | **String** | A unique identifier for the phone number. |  [optional] |
|**extension** | **String** | Extension for a phone number. |  [optional] |
|**routingPrefix** | **String** | Routing prefix of location. |  [optional] |
|**esn** | **String** | Routing prefix + extension of a person or workspace. |  [optional] |
|**state** | **String** | Phone number&#39;s state. |  |
|**phoneNumberType** | **String** | Type of phone number. |  |
|**mainNumber** | **Boolean** | If &#x60;true&#x60;, the phone number is used as location CLID. |  |
|**includedTelephonyTypes** | [**IncludedTelephonyTypesEnum**](#IncludedTelephonyTypesEnum) | The telephony type for the number. |  |
|**mobileNetwork** | **String** | Mobile Network for the number if the number is MOBILE_NUMBER. |  [optional] |
|**routingProfile** | **String** | Routing Profile for the number if the number is MOBILE_NUMBER. |  [optional] |
|**tollFreeNumber** | **Boolean** | If &#x60;true&#x60;, the phone number is a toll-free number. |  |
|**isServiceNumber** | **Boolean** | If &#x60;true&#x60;, the phone number is a service number; otherwise, it is a standard number. |  |
|**location** | [**GetPhoneNumbersForAnOrganizationWithGivenCriterias200ResponsePhoneNumbersInnerLocation**](GetPhoneNumbersForAnOrganizationWithGivenCriterias200ResponsePhoneNumbersInnerLocation.md) |  |  [optional] |
|**owner** | [**GetPhoneNumbersForAnOrganizationWithGivenCriterias200ResponsePhoneNumbersInnerOwner**](GetPhoneNumbersForAnOrganizationWithGivenCriterias200ResponsePhoneNumbersInnerOwner.md) |  |  [optional] |



## Enum: IncludedTelephonyTypesEnum

| Name | Value |
|---- | -----|
| PSTN_NUMBER | &quot;PSTN_NUMBER&quot; |
| MOBILE_NUMBER | &quot;MOBILE_NUMBER&quot; |
| MOBILE_NUMBER2 | &quot;MOBILE_NUMBER&quot; |



