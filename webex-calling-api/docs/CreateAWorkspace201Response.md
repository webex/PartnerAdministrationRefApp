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


# CreateAWorkspace201Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for the Workspace. |  [optional] |
|**orgId** | **String** | &#x60;OrgId&#x60; associated with the workspace. |  [optional] |
|**locationId** | **String** | Location associated with the workspace (ID to use for the [/locations API](/docs/api/v1/locations)). |  [optional] |
|**workspaceLocationId** | **String** | Legacy workspace location ID associated with the workspace. Prefer &#x60;locationId&#x60;. |  [optional] |
|**floorId** | **String** | Floor associated with the workspace. |  [optional] |
|**displayName** | **String** | A friendly name for the workspace. |  [optional] |
|**capacity** | **BigDecimal** | How many people the workspace is suitable for. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The workspace type. |  [optional] |
|**sipAddress** | **String** | &#x60;SipUrl&#x60; to call all the devices associated with the workspace. |  [optional] |
|**created** | **String** | The date and time that the workspace was registered, in ISO8601 format. |  [optional] |
|**calling** | [**CreateAWorkspace201ResponseCalling**](CreateAWorkspace201ResponseCalling.md) |  |  [optional] |
|**notes** | **String** | Notes associated to the workspace. |  [optional] |
|**hotdeskingStatus** | [**HotdeskingStatusEnum**](#HotdeskingStatusEnum) | Hot desking status of the workspace. |  [optional] |
|**supportedDevices** | [**SupportedDevicesEnum**](#SupportedDevicesEnum) | The supported devices for the workspace. Default is &#x60;collaborationDevices&#x60;. |  [optional] |
|**calendar** | [**CreateAWorkspace201ResponseCalendar**](CreateAWorkspace201ResponseCalendar.md) |  |  [optional] |
|**deviceHostedMeetings** | [**CreateAWorkspace201ResponseDeviceHostedMeetings**](CreateAWorkspace201ResponseDeviceHostedMeetings.md) |  |  [optional] |
|**devicePlatform** | [**DevicePlatformEnum**](#DevicePlatformEnum) | The device platform. |  [optional] |
|**indoorNavigation** | [**CreateAWorkspaceRequestIndoorNavigation**](CreateAWorkspaceRequestIndoorNavigation.md) |  |  [optional] |



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



## Enum: SupportedDevicesEnum

| Name | Value |
|---- | -----|
| COLLABORATION_DEVICES | &quot;collaborationDevices&quot; |
| PHONES | &quot;phones&quot; |



## Enum: DevicePlatformEnum

| Name | Value |
|---- | -----|
| CISCO | &quot;cisco&quot; |
| MICROSOFT_TEAMS_ROOM | &quot;microsoftTeamsRoom&quot; |



