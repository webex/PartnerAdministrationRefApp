

# GetAPersonSEmergencyCallbackNumber200ResponseDirectLineInfo

Data relevant to the ECBN for this user/location/virtual line.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phoneNumber** | **String** | The callback phone number that is associated with the direct line. |  [optional] |
|**firstName** | **String** | First name of the user. |  |
|**lastName** | **String** | Last name of the user. |  |
|**effectiveLevel** | [**EffectiveLevelEnum**](#EffectiveLevelEnum) | The source from which the emergency calling line ID (CLID) is selected for an actual emergency call, applying fallback rules as necessary. |  [optional] |
|**effectiveValue** | **String** | The field contains the valid ECBN number at the location level, or the user&#39;s main number if valid, defaulting to the location&#39;s main number if both are unavailable. |  [optional] |
|**quality** | [**QualityEnum**](#QualityEnum) | Used to represent whether a number is a recommended ECBN. |  [optional] |



## Enum: EffectiveLevelEnum

| Name | Value |
|---- | -----|
| DIRECT_LINE | &quot;DIRECT_LINE&quot; |
| LOCATION_ECBN | &quot;LOCATION_ECBN&quot; |
| LOCATION_NUMBER | &quot;LOCATION_NUMBER&quot; |
| NONE | &quot;None&quot; |
| DIRECT_LINE2 | &quot;DIRECT_LINE&quot; |



## Enum: QualityEnum

| Name | Value |
|---- | -----|
| RECOMMENDED | &quot;RECOMMENDED&quot; |
| NOT_RECOMMENDED | &quot;NOT_RECOMMENDED&quot; |
| INVALID | &quot;INVALID&quot; |
| RECOMMENDED2 | &quot;RECOMMENDED&quot; |



