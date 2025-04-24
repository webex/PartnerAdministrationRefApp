

# GetTheVirtualLineSEmergencyCallbackSettings200ResponseLocationMemberInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phoneNumber** | **String** | A unique identifier for the location member&#39;s PSTN phone number. |  [optional] |
|**firstName** | **String** | First name for the location member. |  [optional] |
|**lastName** | **String** | Last name for the location member. This field will always return \&quot;.\&quot; when &#x60;effectiveLevel&#x60; is &#x60;DIRECT_LINE&#x60; or &#x60;LOCATION_MEMBER_NUMBER&#x60;, and the selected member is a place. |  [optional] |
|**memberId** | **String** | Member ID of user/place/virtual line within the location. |  [optional] |
|**effectiveLevel** | [**EffectiveLevelEnum**](#EffectiveLevelEnum) | The source from which the emergency calling line ID (CLID) is selected for an actual emergency call, applying fallback rules as necessary. |  |
|**effectiveValue** | **String** | Contains the location-level emergency callback number if valid. If not, contains the user&#39;s main number if valid. |  [optional] |
|**quality** | [**QualityEnum**](#QualityEnum) | Used to represent whether a number is a recommended ECBN. |  |
|**memberType** | [**MemberTypeEnum**](#MemberTypeEnum) | Type of the member. |  [optional] |



## Enum: EffectiveLevelEnum

| Name | Value |
|---- | -----|
| DIRECT_LINE | &quot;DIRECT_LINE&quot; |
| LOCATION_ECBN | &quot;LOCATION_ECBN&quot; |
| LOCATION_NUMBER | &quot;LOCATION_NUMBER&quot; |
| LOCATION_MEMBER_NUMBER | &quot;LOCATION_MEMBER_NUMBER&quot; |
| NONE | &quot;None&quot; |
| LOCATION_NUMBER2 | &quot;LOCATION_NUMBER&quot; |



## Enum: QualityEnum

| Name | Value |
|---- | -----|
| RECOMMENDED | &quot;RECOMMENDED&quot; |
| NOT_RECOMMENDED | &quot;NOT_RECOMMENDED&quot; |
| INVALID | &quot;INVALID&quot; |
| RECOMMENDED2 | &quot;RECOMMENDED&quot; |



## Enum: MemberTypeEnum

| Name | Value |
|---- | -----|
| PEOPLE | &quot;PEOPLE&quot; |
| PLACE | &quot;PLACE&quot; |
| VIRTUAL_LINE | &quot;VIRTUAL_LINE&quot; |
| VIRTUAL_LINE2 | &quot;VIRTUAL_LINE&quot; |



