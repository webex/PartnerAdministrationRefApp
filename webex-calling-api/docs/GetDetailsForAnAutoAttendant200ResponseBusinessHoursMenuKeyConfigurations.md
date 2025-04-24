

# GetDetailsForAnAutoAttendant200ResponseBusinessHoursMenuKeyConfigurations

Key configurations defined for the auto attendant.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | [**KeyEnum**](#KeyEnum) | Key assigned to specific menu configuration. |  |
|**action** | [**ActionEnum**](#ActionEnum) | Action assigned to specific menu key configuration. |  |
|**description** | **String** | The description of each menu key. |  [optional] |
|**value** | **String** | Value based on actions. |  [optional] |
|**audioAnnouncementFile** | [**GetDetailsForAnAutoAttendant200ResponseBusinessHoursMenuKeyConfigurationsAudioAnnouncementFile**](GetDetailsForAnAutoAttendant200ResponseBusinessHoursMenuKeyConfigurationsAudioAnnouncementFile.md) |  |  [optional] |



## Enum: KeyEnum

| Name | Value |
|---- | -----|
| _0 | &quot;0&quot; |
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |
| _3 | &quot;3&quot; |
| _4 | &quot;4&quot; |
| _5 | &quot;5&quot; |
| _6 | &quot;6&quot; |
| _7 | &quot;7&quot; |
| _8 | &quot;8&quot; |
| _9 | &quot;9&quot; |
| HASH | &quot;#&quot; |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| PLAY_ANNOUNCEMENT | &quot;PLAY_ANNOUNCEMENT&quot; |
| TRANSFER_WITH_PROMPT | &quot;TRANSFER_WITH_PROMPT&quot; |
| TRANSFER_WITHOUT_PROMPT | &quot;TRANSFER_WITHOUT_PROMPT&quot; |
| TRANSFER_TO_OPERATOR | &quot;TRANSFER_TO_OPERATOR&quot; |
| TRANSFER_TO_MAILBOX | &quot;TRANSFER_TO_MAILBOX&quot; |
| NAME_DIALING | &quot;NAME_DIALING&quot; |
| EXTENSION_DIALING | &quot;EXTENSION_DIALING&quot; |
| REPEAT_MENU | &quot;REPEAT_MENU&quot; |
| EXIT | &quot;EXIT&quot; |



