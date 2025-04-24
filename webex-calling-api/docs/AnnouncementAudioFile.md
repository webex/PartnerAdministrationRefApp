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


# AnnouncementAudioFile


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the Announcement file. |  [optional] |
|**name** | **String** | Name of the announcement file. &#x60;name&#x60;, &#x60;mediaFileType&#x60;, &#x60;level&#x60; are mandatory if &#x60;id&#x60; is not provided for uploading an announcement. |  [optional] |
|**mediaFileType** | **String** | Media file type of announcement file. |  [optional] |
|**level** | [**LevelEnum**](#LevelEnum) | The level at which this announcement exists. |  [optional] |



## Enum: LevelEnum

| Name | Value |
|---- | -----|
| LOCATION | &quot;LOCATION&quot; |
| ORGANIZATION | &quot;ORGANIZATION&quot; |
| ENTITY | &quot;ENTITY&quot; |



