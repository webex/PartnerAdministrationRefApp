

# GetTheVirtualLineSEmergencyCallbackSettings200ResponseLocationECBNInfo

Data relevant to the user/place/virtual line selected for ECBN for this location.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phoneNumber** | **String** | The callback phone number that is associated with the location&#39;s ECBN configuration. |  [optional] |
|**firstName** | **String** | First name for the location. This field will be populated with group name when the &#x60;effectiveLevel&#x60; is &#x60;LOCATION_ECBN&#x60; or &#x60;LOCATION_NUMBER&#x60;. |  [optional] |
|**lastName** | **String** | This field contains the location member&#39;s last name when the &#x60;effectiveLevel&#x60; is &#x60;LOCATION_ECBN&#x60;, the location is using a location member number, and the selected member is a user. This field will always return \&quot;.\&quot; when the &#x60;effectiveLevel&#x60; is &#x60;LOCATION_ECBN&#x60;, the location is using the location member number, and the selected member is a place. |  [optional] |
|**effectiveLevel** | [**EffectiveLevelEnum**](#EffectiveLevelEnum) | The source from which the emergency calling line ID (CLID) is selected for an actual emergency call, applying fallback rules as necessary. |  |
|**effectiveValue** | **String** | Contains the location-level emergency callback number if valid. If not, contains the user&#39;s main number if valid. |  [optional] |
|**quality** | [**QualityEnum**](#QualityEnum) | Used to represent whether a number is a recommended ECBN. |  |



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



