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


# AnnouncementResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the announcement. |  |
|**name** | **String** | Name of the announcement. |  |
|**fileName** | **String** | File name of the uploaded binary announcement greeting. |  [optional] |
|**fileSize** | **String** | Size of the file in kilobytes. |  |
|**mediaFileType** | **String** | Media file type of the announcement file. |  |
|**lastUpdated** | **String** | Last updated timestamp (in UTC format) of the announcement. |  |
|**featureReferenceCount** | **BigDecimal** | Reference count of the call features this announcement is assigned to. |  |
|**featureReferences** | **List&lt;Object&gt;** | Call features referenced by this announcement. |  [optional] |



