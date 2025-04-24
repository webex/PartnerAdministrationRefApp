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


# ComplianceStatusResponseLocationStatusObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**state** | [**UpdateComplianceStatusResponseLocationStateEnum**](UpdateComplianceStatusResponseLocationStateEnum.md) | Configuration stage that was last completed. The order of precedence is &#x60;LOCATION_SETUP&#x60;, &#x60;ALERTS&#x60;, &#x60;NETWORK_ELEMENTS&#x60;, &#x60;ROUTING_ENABLE&#x60;. If at least one location is &#x60;LOCATION_SETUP&#x60;, then &#x60;locationState&#x60; will be set to &#x60;LOCATION_SETUP&#x60;. Otherwise, &#x60;locationState&#x60; will check for the next precedence option and at least one location should have that option. |  [optional] |
|**count** | **BigDecimal** | Total count of locations available in the organization. |  [optional] |
|**locations** | **List&lt;Object&gt;** | List of locations that have completed the least amount of setup. Only 4 locations are included in this list. |  [optional] |



