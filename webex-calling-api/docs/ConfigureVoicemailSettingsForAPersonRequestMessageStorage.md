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


# ConfigureVoicemailSettingsForAPersonRequestMessageStorage


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mwiEnabled** | **Boolean** | When &#x60;true&#x60; desktop phone will indicate there are new voicemails. |  [optional] |
|**storageType** | [**StorageTypeEnum**](#StorageTypeEnum) | Designates which type of voicemail message storage is used. |  [optional] |
|**externalEmail** | **String** | External email address to which the new voicemail audio will be sent. |  [optional] |



## Enum: StorageTypeEnum

| Name | Value |
|---- | -----|
| INTERNAL | &quot;INTERNAL&quot; |
| EXTERNAL | &quot;EXTERNAL&quot; |



