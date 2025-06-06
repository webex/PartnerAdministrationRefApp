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


# ComplianceStatusResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orgStatus** | [**OrgStatusEnum**](OrgStatusEnum.md) | The RedSky account configuration status for the organization. |  |
|**complianceStatus** | [**ComplianceStatusResponseEnum**](ComplianceStatusResponseEnum.md) | The RedSky account&#39;s compliance status. |  |
|**companyId** | **String** | The RedSky held token from the secret response. |  [optional] |
|**redSkyOrgId** | **String** | The RedSky organization ID for the organization which can be found in the RedSky portal. |  [optional] |
|**adminExists** | **Boolean** | &#x60;true&#x60; if an Admin has been created in RedSky. |  [optional] |
|**locationsStatus** | [**ComplianceStatusResponseLocationStatusObject**](ComplianceStatusResponseLocationStatusObject.md) |  |  [optional] |



