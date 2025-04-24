

# GetWorkspaceCallbackNumberObjectLocationMemberInfo

Data relevant to the user/place/virtual line selected for ECBN.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phoneNumber** | **String** | The callback phone number that is associated with member configured for the location ECBN. |  [optional] |
|**firstName** | **String** | First name of a user. |  |
|**lastName** | **String** | Last name of the user or location member or &#x60;.&#x60;. |  |
|**memberId** | **String** | Member ID of user/place/virtual line within the location. |  [optional] |
|**effectiveLevel** | [**LocationMemberInfoEffectiveLevelType**](LocationMemberInfoEffectiveLevelType.md) | The source from which the emergency calling line ID (CLID) is selected for an actual emergency call, applying fallback rules as necessary. |  [optional] |
|**effectiveValue** | **String** | The field contains the valid ECBN number at the location level, or the user&#39;s main number if valid, defaulting to the location&#39;s main number if both are unavailable. |  [optional] |
|**quality** | [**ECBNQualityType**](ECBNQualityType.md) | Used to represent whether a number is a recommended ECBN. |  [optional] |
|**memberType** | [**MemberType**](MemberType.md) | Type of the member. |  [optional] |



