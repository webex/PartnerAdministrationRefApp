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


# CreateAHuntGroupRequestCallPoliciesBusinessContinuityRedirect

Settings for sending calls to a specified destination if the phone is not connected to the network for any reason, such as a power outage, failed internet connection, or wiring problem.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** | If &#x60;true&#x60;, unreachable, unanswered calls are diverted to a defined phone number. For persons with only a mobile device, calls won&#39;t be diverted if there is a network outage. |  [optional] |
|**destination** | **String** | Destination for business continuity redirect. |  [optional] |
|**destinationVoicemailEnabled** | **Boolean** | The enabled or disabled state of sending diverted incoming calls to the &#x60;destination&#x60; number&#39;s voicemail if the &#x60;destination&#x60; is an internal phone number and that number has the voicemail service enabled. |  [optional] |



