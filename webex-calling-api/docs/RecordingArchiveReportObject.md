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



# RecordingArchiveReportObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**archiveId** | **String** | A unique identifier for the meeting archive summary. |  [optional] |
|**serviceType** | [**ServiceTypeEnum**](#ServiceTypeEnum) | Recording achrive report&#39;s service-type. |  [optional] |
|**title** | **String** | Meeting title. |  [optional] |
|**start** | **String** | Start time for meeting in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) compliant format. |  [optional] |
|**end** | **String** | End time for a meeting in ISO 8601 compliant format. |  [optional] |
|**hostDisplayName** | **String** | Display name for the meeting host. |  [optional] |
|**hostEmail** | **String** | Email address for the meeting host. |  [optional] |
|**participants** | **List&lt;Object&gt;** | The participants of the meeting archive. |  [optional] |
|**chats** | **List&lt;Object&gt;** | The chats of the meeting archive. |  [optional] |
|**polls** | **List&lt;Object&gt;** | The polls of the meeting archive. |  [optional] |
|**qas** | **List&lt;Object&gt;** | Meeting meeting archive&#39;s Q and A. |  [optional] |
|**systemInfos** | **List&lt;Object&gt;** | The system Information of the meeting archive, which can be only supported when serviceType is &#x60;SupportCenter&#x60;. |  [optional] |



## Enum: ServiceTypeEnum

| Name | Value |
|---- | -----|
| MEETING_CENTER | &quot;MeetingCenter&quot; |
| EVENT_CENTER | &quot;EventCenter&quot; |
| TRAINING_CENTER | &quot;TrainingCenter&quot; |
| SUPPORT_CENTER | &quot;SupportCenter&quot; |



