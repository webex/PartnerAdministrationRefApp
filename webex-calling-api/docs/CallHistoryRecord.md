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


# CallHistoryRecord


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **CallHistoryRecordTypeEnum** |  |  |
|**name** | **String** | The name of the called/calling party. Only present when the name is available and privacy is not enabled. |  [optional] |
|**number** | **String** | The number of the called/calling party. Only present when the number is available and privacy is not enabled. The number can be digits or a URI. Some examples for number include: &#x60;1234&#x60;, &#x60;2223334444&#x60;, &#x60;+12223334444&#x60;, &#x60;*73&#x60;, &#x60;user@company.domain&#x60; |  [optional] |
|**privacyEnabled** | **Boolean** | Indicates whether privacy is enabled for the name and number. |  |
|**time** | **String** | The date and time the call history record was created. For a placed call history record, this is when the call was placed. For a missed call history record, this is when the call was disconnected. For a received call history record, this is when the call was answered. |  |



