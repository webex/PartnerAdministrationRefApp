

# GetAWorkspaceEmergencyCallbackNumber200ResponseLocationMemberInfo

Data relevant to the user/place/virtual line selected for ECBN.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phoneNumber** | **String** | The callback phone number that is associated with member configured for the location ECBN. |  [optional] |
|**firstName** | **String** | First name of a user. |  |
|**lastName** | **String** | Last name of the user or location member or &#x60;.&#x60;. |  |
|**memberId** | **String** | Member ID of user/place/virtual line within the location. |  [optional] |
|**effectiveLevel** | [**EffectiveLevelEnum**](#EffectiveLevelEnum) | The source from which the emergency calling line ID (CLID) is selected for an actual emergency call, applying fallback rules as necessary. |  [optional] |
|**effectiveValue** | **String** | The field contains the valid ECBN number at the location level, or the user&#39;s main number if valid, defaulting to the location&#39;s main number if both are unavailable. |  [optional] |
|**quality** | [**QualityEnum**](#QualityEnum) | Used to represent whether a number is a recommended ECBN. |  [optional] |
|**memberType** | [**MemberTypeEnum**](#MemberTypeEnum) | Type of the member. |  [optional] |



## Enum: EffectiveLevelEnum

| Name | Value |
|---- | -----|
| DIRECT_LINE | &quot;DIRECT_LINE&quot; |
| LOCATION_ECBN | &quot;LOCATION_ECBN&quot; |
| LOCATION_NUMBER | &quot;LOCATION_NUMBER&quot; |
| LOCATION_MEMBER_NUMBER | &quot;LOCATION_MEMBER_NUMBER&quot; |
| NONE | &quot;None&quot; |
| LOCATION_MEMBER_NUMBER2 | &quot;LOCATION_MEMBER_NUMBER&quot; |



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
| PLACE2 | &quot;PLACE&quot; |



