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


# CallInterceptPutIncomingAnnouncements

Settings related to how incoming calls are handled when the intercept feature is enabled.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**greeting** | [**GreetingEnum**](#GreetingEnum) | &#x60;DEFAULT&#x60; indicates that a system default message will be placed when incoming calls are intercepted. |  [optional] |
|**newNumber** | [**CallInterceptPutIncomingAnnouncementsNewNumber**](CallInterceptPutIncomingAnnouncementsNewNumber.md) |  |  [optional] |
|**zeroTransfer** | [**CallInterceptPutIncomingAnnouncementsZeroTransfer**](CallInterceptPutIncomingAnnouncementsZeroTransfer.md) |  |  [optional] |



## Enum: GreetingEnum

| Name | Value |
|---- | -----|
| CUSTOM | &quot;CUSTOM&quot; |
| DEFAULT | &quot;DEFAULT&quot; |



