<!--  Copyright 2025 Cisco Systems Inc.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.-->
# Copyright 2025 Cisco Systems Inc.
#
# Permission is hereby granted, free of charge, to any person obtaining a copy
# of this software and associated documentation files (the "Software"), to deal
# in the Software without restriction, including without limitation the rights
# to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
# copies of the Software, and to permit persons to whom the Software is
# furnished to do so, subject to the following conditions:
#
# The above copyright notice and this permission notice shall be included in
# all copies or substantial portions of the Software.
#
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
# THE SOFTWARE.



# UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations

Key configurations defined for the auto attendant.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | [**KeyEnum**](#KeyEnum) | Key assigned to specific menu configuration. |  |
|**action** | [**ActionEnum**](#ActionEnum) | Action assigned to specific menu key configuration. |  |
|**description** | **String** | The description of each menu key. |  [optional] |
|**value** | **String** | Value based on actions. |  [optional] |
|**audioAnnouncementFile** | [**UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurationsAudioAnnouncementFile**](UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurationsAudioAnnouncementFile.md) |  |  [optional] |



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



