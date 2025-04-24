

# GetRecallHuntGroupObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**huntGroupId** | **String** | Alternate user which is a hunt group ID for call park recall alternate destination. |  [optional] |
|**huntGroupName** | **String** | Unique name for the hunt group. |  [optional] |
|**option** | [**OptionEnum**](#OptionEnum) | Call park recall options. |  |



## Enum: OptionEnum

| Name | Value |
|---- | -----|
| PARKING_USER_ONLY | &quot;ALERT_PARKING_USER_ONLY&quot; |
| PARKING_USER_FIRST_THEN_HUNT_GROUP | &quot;ALERT_PARKING_USER_FIRST_THEN_HUNT_GROUP&quot; |
| HUNT_GROUP_ONLY | &quot;ALERT_HUNT_GROUP_ONLY&quot; |



