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


# CreateAWholesaleBillingReportRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**billingStartDate** | **String** | The &#x60;startDate&#x60; (&#x60;YYYY-MM-DD&#x60;) for which the partner requests the billing report. |  |
|**billingEndDate** | **String** | The &#x60;endDate&#x60; (&#x60;YYYY-MM-DD&#x60;) for which the partner requests the billing report. |  |
|**type** | **String** | Create report of the given type, &#x60;PARTNER&#x60;, &#x60;CUSTOMER&#x60;, or &#x60;USER&#x60;. Default: &#x60;PARTNER&#x60;. |  [optional] |
|**subPartnerOrgId** | **String** | The Organization ID of the sub partner on Cisco Webex. |  [optional] |



