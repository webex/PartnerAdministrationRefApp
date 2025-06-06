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



# RecordingObjectWithDirectDownloadLinks


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier for recording. |  |
|**topic** | **String** | The recording&#39;s topic. |  |
|**createTime** | **String** | The date and time recording was created in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) compliant format. Please note that it&#39;s not the time the record button was clicked in meeting but the time the recording file was generated offline. |  |
|**timeRecorded** | **String** | The date and time recording started in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) compliant format. It indicates when the record button was clicked in the meeting. |  |
|**format** | [**FormatEnum**](#FormatEnum) |  |  |
|**serviceType** | [**ServiceTypeEnum**](#ServiceTypeEnum) |  |  |
|**durationSeconds** | **BigDecimal** | The duration of the recording in seconds. |  |
|**sizeBytes** | **BigDecimal** | The size of the recording file in bytes. |  |
|**temporaryDirectDownloadLinks** | [**GetRecordingDetails200ResponseTemporaryDirectDownloadLinks**](GetRecordingDetails200ResponseTemporaryDirectDownloadLinks.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**ownerId** | **String** | Webex UUID for recording owner/host. |  |
|**ownerEmail** | **String** | Webex email for recording owner/host. |  |
|**ownerType** | [**OwnerTypeEnum**](#OwnerTypeEnum) |  |  |
|**storageRegion** | **String** | Storage location for recording within Webex datacenters. |  |
|**serviceData** | [**ListRecordingsForComplianceOfficer200ResponseItemsInnerServiceData**](ListRecordingsForComplianceOfficer200ResponseItemsInnerServiceData.md) |  |  [optional] |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| MP3 | &quot;MP3&quot; |



## Enum: ServiceTypeEnum

| Name | Value |
|---- | -----|
| CALLING | &quot;calling&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;available&quot; |
| DELETED | &quot;deleted&quot; |



## Enum: OwnerTypeEnum

| Name | Value |
|---- | -----|
| USER | &quot;user&quot; |
| PLACE | &quot;place&quot; |
| VIRTUAL_LINE | &quot;virtualLine&quot; |



