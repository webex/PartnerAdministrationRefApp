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



# WorkspaceUpdateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**displayName** | **String** | A friendly name for the workspace. |  [optional] |
|**locationId** | **String** | Location associated with the workspace. Must be provided when the &#x60;floorId&#x60; is set. |  [optional] |
|**workspaceLocationId** | **String** | Legacy workspace location ID associated with the workspace. Prefer &#x60;locationId&#x60;. |  [optional] |
|**floorId** | **String** | Floor associated with the workspace. |  [optional] |
|**capacity** | **BigDecimal** | How many people the workspace is suitable for. If set, must be 0 or higher. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type that best describes the workspace. |  [optional] |
|**calendar** | [**WorkspaceUpdateRequestCalendar**](WorkspaceUpdateRequestCalendar.md) |  |  [optional] |
|**sipAddress** | **String** | The &#x60;sipAddress&#x60; field can only be provided when calling type is &#x60;thirdPartySipCalling&#x60;. |  [optional] |
|**calling** | [**WorkspaceUpdateRequestCalling**](WorkspaceUpdateRequestCalling.md) |  |  [optional] |
|**notes** | **String** | Notes associated to the workspace. |  [optional] |
|**hotdeskingStatus** | [**HotdeskingStatusEnum**](#HotdeskingStatusEnum) | Hot desking status of the workspace. |  [optional] |
|**deviceHostedMeetings** | [**WorkspaceCreationRequestDeviceHostedMeetings**](WorkspaceCreationRequestDeviceHostedMeetings.md) |  |  [optional] |
|**indoorNavigation** | [**UpdateAWorkspaceRequestIndoorNavigation**](UpdateAWorkspaceRequestIndoorNavigation.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NOT_SET | &quot;notSet&quot; |
| FOCUS | &quot;focus&quot; |
| HUDDLE | &quot;huddle&quot; |
| MEETING_ROOM | &quot;meetingRoom&quot; |
| OPEN | &quot;open&quot; |
| DESK | &quot;desk&quot; |
| OTHER | &quot;other&quot; |



## Enum: HotdeskingStatusEnum

| Name | Value |
|---- | -----|
| ON | &quot;on&quot; |
| OFF | &quot;off&quot; |



