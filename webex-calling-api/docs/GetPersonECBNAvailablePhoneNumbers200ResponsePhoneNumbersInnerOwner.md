

# GetPersonECBNAvailablePhoneNumbers200ResponsePhoneNumbersInnerOwner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the owner to which phone number is assigned. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the PSTN phone number&#39;s owner. |  |
|**firstName** | **String** | First name of the phone number&#39;s owner. This field will be present only when the owner &#x60;type&#x60; is &#x60;PEOPLE&#x60; or &#x60;VIRTUAL_LINE&#x60;. |  [optional] |
|**lastName** | **String** | Last name of the phone number&#39;s owner. This field will be present only when the owner &#x60;type&#x60; is &#x60;PEOPLE&#x60; or &#x60;VIRTUAL_LINE&#x60;. |  [optional] |
|**displayName** | **String** | Display name of the phone number&#39;s owner. This field will be present only when the owner &#x60;type&#x60; is &#x60;PLACE&#x60;. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PLACE | &quot;PLACE&quot; |
| PEOPLE | &quot;PEOPLE&quot; |
| VIRTUAL_LINE | &quot;VIRTUAL_LINE&quot; |



