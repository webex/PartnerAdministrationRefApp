

# GetAutoAttendantObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier for the auto attendant. |  |
|**name** | **String** | Unique name for the auto attendant. |  |
|**enabled** | **Boolean** | Flag to indicate if auto attendant number is enabled or not. |  |
|**phoneNumber** | **String** | Auto attendant phone number.  Either &#x60;phoneNumber&#x60; or &#x60;extension&#x60; is mandatory. |  [optional] |
|**extension** | **String** | Auto attendant extension.  Either &#x60;phoneNumber&#x60; or &#x60;extension&#x60; is mandatory. |  [optional] |
|**routingPrefix** | **String** | Routing prefix of location. |  [optional] |
|**esn** | **String** | Routing prefix + extension of a person or workspace. |  [optional] |
|**tollFreeNumber** | **Boolean** | Flag to indicate if auto attendant number is toll-free number. |  |
|**firstName** | **String** | First name defined for an auto attendant. |  |
|**lastName** | **String** | Last name defined for an auto attendant. |  |
|**alternateNumbers** | **List&lt;Object&gt;** | Alternate numbers defined for the auto attendant. |  [optional] |
|**language** | **String** | Language for the auto attendant. |  [optional] |
|**languageCode** | **String** | Language code for the auto attendant. |  [optional] |
|**businessSchedule** | **String** | Business hours defined for the auto attendant. |  |
|**holidaySchedule** | **String** | Holiday defined for the auto attendant. |  [optional] |
|**extensionDialing** | [**ExtensionDialingEnum**](#ExtensionDialingEnum) | Extension dialing setting. If the values are not set default will be set as &#x60;ENTERPRISE&#x60;. |  |
|**nameDialing** | [**NameDialingEnum**](#NameDialingEnum) | Name dialing setting. If the values are not set default will be set as &#x60;ENTERPRISE&#x60;. |  |
|**timeZone** | **String** | Time zone defined for the auto attendant. |  [optional] |
|**businessHoursMenu** | [**HoursMenuGetObject**](HoursMenuGetObject.md) |  |  |
|**afterHoursMenu** | [**HoursMenuGetObject**](HoursMenuGetObject.md) |  |  |



## Enum: ExtensionDialingEnum

| Name | Value |
|---- | -----|
| ENTERPRISE | &quot;ENTERPRISE&quot; |
| GROUP | &quot;GROUP&quot; |



## Enum: NameDialingEnum

| Name | Value |
|---- | -----|
| ENTERPRISE | &quot;ENTERPRISE&quot; |
| GROUP | &quot;GROUP&quot; |



