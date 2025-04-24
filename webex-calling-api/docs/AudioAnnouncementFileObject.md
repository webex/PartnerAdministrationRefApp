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


# AudioAnnouncementFileObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier for the [announcement](/docs/api/v1/features-announcement-repository). &#x60;name&#x60;, &#x60;mediaFileType&#x60;, &#x60;level&#x60; are mandatory if &#x60;id&#x60; is not provided for uploading an announcement. If all four fields are provided, file with given &#x60;id&#x60; is used and other fields are ignored. |  [optional] |
|**fileName** | **String** | Audio announcement file name. |  [optional] |
|**mediaFileType** | [**MediaFileTypeEnum**](#MediaFileTypeEnum) | Audio announcement file type. |  [optional] |
|**level** | [**LevelEnum**](#LevelEnum) | Audio announcement file type location. |  [optional] |



## Enum: MediaFileTypeEnum

| Name | Value |
|---- | -----|
| WAV | &quot;WAV&quot; |



## Enum: LevelEnum

| Name | Value |
|---- | -----|
| ORGANIZATION | &quot;ORGANIZATION&quot; |
| LOCATION | &quot;LOCATION&quot; |



