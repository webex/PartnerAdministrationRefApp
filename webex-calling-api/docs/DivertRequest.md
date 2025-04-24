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


# DivertRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callId** | **String** | The call identifier of the call to divert. |  |
|**destination** | **String** | The destination to divert the call to. If toVoicemail is false, destination is required. The destination can be digits or a URI. Some examples for destination include: &#x60;1234&#x60;, &#x60;2223334444&#x60;, &#x60;+12223334444&#x60;, &#x60;*73&#x60;, &#x60;tel:+12223334444&#x60;, &#x60;user@company.domain&#x60;, &#x60;sip:user@company.domain&#x60; |  [optional] |
|**toVoicemail** | **Boolean** | If set to true, the call is diverted to voicemail. If no destination is specified, the call is diverted to the user&#39;s own voicemail. If a destination is specified, the call is diverted to the specified user&#39;s voicemail. |  [optional] |



