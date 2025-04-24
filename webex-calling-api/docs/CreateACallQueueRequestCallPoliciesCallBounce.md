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


# CreateACallQueueRequestCallPoliciesCallBounce

Settings for when the call into the hunt group is not answered.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callBounceEnabled** | **Boolean** | If enabled, bounce calls after the set number of rings. |  [optional] |
|**callBounceMaxRings** | **BigDecimal** | Number of rings after which to bounce call, if &#x60;callBounce&#x60; is enabled. |  [optional] |
|**agentUnavailableEnabled** | **Boolean** | Bounce if agent becomes unavailable. |  [optional] |
|**alertAgentEnabled** | **Boolean** | Alert agent if call on hold more than &#x60;alertAgentMaxSeconds&#x60;. |  [optional] |
|**alertAgentMaxSeconds** | **BigDecimal** | Number of second after which to alert agent if &#x60;alertAgentEnabled&#x60;. |  [optional] |
|**callBounceOnHoldEnabled** | **Boolean** | Bounce if call on hold more than &#x60;callBounceMaxSeconds&#x60;. |  [optional] |
|**callBounceOnHoldMaxSeconds** | **BigDecimal** | Number of second after which to bounce if &#x60;callBounceEnabled&#x60;. |  [optional] |



