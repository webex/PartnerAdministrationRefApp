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


# ComplianceStatusLocationStatusObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**state** | [**GetComplianceStatusResponseLocationStateEnum**](GetComplianceStatusResponseLocationStateEnum.md) | Configuration stage that was last completed for the location in the request. The order of precedence is &#x60;LOCATION_SETUP&#x60;, &#x60;ALERTS&#x60;, &#x60;NETWORK_ELEMENTS&#x60;, &#x60;ROUTING_ENABLE&#x60;. |  [optional] |
|**count** | **BigDecimal** | Total count of the &#x60;locations&#x60; list. |  [optional] |
|**locations** | **List&lt;Object&gt;** | Object that contains the &#x60;id&#x60; and the &#x60;name&#x60; for the location in the request. |  [optional] |



