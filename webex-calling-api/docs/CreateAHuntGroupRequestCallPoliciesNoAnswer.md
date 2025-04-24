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


# CreateAHuntGroupRequestCallPoliciesNoAnswer

Settings for when the call into the hunt group is not answered.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nextAgentEnabled** | **Boolean** | If enabled, advance to next agent after the &#x60;nextAgentRings&#x60; has occurred. |  |
|**nextAgentRings** | **BigDecimal** | Number of rings before call will be forwarded if unanswered and &#x60;nextAgentEnabled&#x60; is true. |  |
|**forwardEnabled** | **Boolean** | If &#x60;true&#x60;, forwards unanswered calls to the destination after the number of rings occurs. |  |
|**numberOfRings** | **BigDecimal** | Number of rings before forwarding calls if &#x60;forwardEnabled&#x60; is true. |  |
|**destination** | **String** | Destination if &#x60;forwardEnabled&#x60; is True. |  [optional] |
|**destinationVoicemailEnabled** | **Boolean** | If &#x60;forwardEnabled&#x60; is true, enables and disables sending incoming to destination number&#39;s voicemail if the destination is an internal phone number and that number has the voicemail service enabled. |  |



