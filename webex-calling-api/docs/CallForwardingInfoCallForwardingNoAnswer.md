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


# CallForwardingInfoCallForwardingNoAnswer

Settings for forwarding which only occurs when you are away or not answering your phone.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** | \&quot;No Answer\&quot; call forwarding is enabled or disabled. |  |
|**destination** | **String** | Destination for \&quot;No Answer\&quot; call forwarding. |  [optional] |
|**numberOfRings** | **BigDecimal** | Number of rings before the call will be forwarded if unanswered. |  |
|**systemMaxNumberOfRings** | **BigDecimal** | System-wide maximum number of rings allowed for &#x60;numberOfRings&#x60; setting. |  |
|**destinationVoicemailEnabled** | **Boolean** | Indicates the enabled or disabled state of sending incoming calls to destination number&#39;s voicemail if the destination is an internal phone number and that number has the voicemail service enabled. |  |



