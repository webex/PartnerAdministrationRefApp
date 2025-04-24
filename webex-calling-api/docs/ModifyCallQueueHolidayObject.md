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



# ModifyCallQueueHolidayObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**holidayServiceEnabled** | **Boolean** | Enable or Disable the call queue holiday service routing policy. |  |
|**action** | [**ActionEnum**](#ActionEnum) | Specifies call processing action type. |  |
|**holidayScheduleLevel** | [**HolidayScheduleLevelEnum**](#HolidayScheduleLevelEnum) | Specifies whether the schedule mentioned in &#x60;holidayScheduleName&#x60; is org or location specific. (Must be from &#x60;holidaySchedules&#x60; list) |  |
|**holidayScheduleName** | **String** | Name of the schedule configured for a holiday service as one of from &#x60;holidaySchedules&#x60; list. |  [optional] |
|**transferPhoneNumber** | **String** | Call gets transferred to this number when action is set to &#x60;TRANSFER&#x60;. This can also be an extension. |  [optional] |
|**playAnnouncementBeforeEnabled** | **Boolean** | Specifies if an announcement plays to callers before applying the action. |  |
|**audioMessageSelection** | [**AudioMessageSelectionEnum**](#AudioMessageSelectionEnum) | Specifies what type of announcement to be played. |  |
|**audioFiles** | **List&lt;Object&gt;** | List of pre-configured Announcement Audio Files when &#x60;audioMessageSelection&#x60; is &#x60;CUSTOM&#x60;. |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| BUSY | &quot;BUSY&quot; |
| TRANSFER | &quot;TRANSFER&quot; |



## Enum: HolidayScheduleLevelEnum

| Name | Value |
|---- | -----|
| LOCATION | &quot;LOCATION&quot; |
| ORGANIZATION | &quot;ORGANIZATION&quot; |



## Enum: AudioMessageSelectionEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;DEFAULT&quot; |
| CUSTOM | &quot;CUSTOM&quot; |



