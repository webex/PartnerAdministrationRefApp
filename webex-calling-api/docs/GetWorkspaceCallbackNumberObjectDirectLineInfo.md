

# GetWorkspaceCallbackNumberObjectDirectLineInfo

Data relevant to the ECBN for this user/location/virtual line.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phoneNumber** | **String** | The callback phone number that is associated with the direct line. |  [optional] |
|**firstName** | **String** | First name of a user. |  |
|**lastName** | **String** | Last name of a user. |  |
|**effectiveLevel** | [**ECBNDirectLineEffectiveLevelType**](ECBNDirectLineEffectiveLevelType.md) | The source from which the emergency calling line ID (CLID) is selected for an actual emergency call, applying fallback rules as necessary. |  [optional] |
|**effectiveValue** | **String** | The field contains the valid ECBN number at the location level, or the user&#39;s main number if valid, defaulting to the location&#39;s main number if both are unavailable. |  [optional] |
|**quality** | [**ECBNQualityType**](ECBNQualityType.md) | Used to represent whether a number is a recommended ECBN. |  [optional] |



