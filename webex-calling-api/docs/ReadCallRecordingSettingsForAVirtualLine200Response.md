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



# ReadCallRecordingSettingsForAVirtualLine200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** | &#x60;true&#x60; if call recording is enabled. |  |
|**record** | [**RecordEnum**](#RecordEnum) | Call recording scenario. |  |
|**recordVoicemailEnabled** | **Boolean** | When &#x60;true&#x60;, voicemail messages are also recorded. |  |
|**notification** | [**ReadCallRecordingSettingsForAPerson200ResponseNotification**](ReadCallRecordingSettingsForAPerson200ResponseNotification.md) |  |  |
|**repeat** | [**ReadCallRecordingSettingsForAPerson200ResponseRepeat**](ReadCallRecordingSettingsForAPerson200ResponseRepeat.md) |  |  |
|**serviceProvider** | **String** | Name of the service provider providing call recording service. |  |
|**externalGroup** | **String** | Group utilized by the service provider providing call recording service. |  |
|**externalIdentifier** | **String** | Unique person identifier utilized by the service provider providing call recording service. |  |
|**startStopAnnouncement** | [**ReadCallRecordingSettingsForAPerson200ResponseStartStopAnnouncement**](ReadCallRecordingSettingsForAPerson200ResponseStartStopAnnouncement.md) |  |  |



## Enum: RecordEnum

| Name | Value |
|---- | -----|
| ALWAYS | &quot;Always&quot; |
| NEVER | &quot;Never&quot; |
| ALWAYS_WITH_PAUSE_RESUME | &quot;Always with Pause/Resume&quot; |
| ON_DEMAND_WITH_USER_INITIATED_START | &quot;On Demand with User Initiated Start&quot; |



