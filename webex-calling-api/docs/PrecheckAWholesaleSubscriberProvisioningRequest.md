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
# Copyright 2025 Cisco Systems Inc.
#
# Permission is hereby granted, free of charge, to any person obtaining a copy
# of this software and associated documentation files (the "Software"), to deal
# in the Software without restriction, including without limitation the rights
# to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
# copies of the Software, and to permit persons to whom the Software is
# furnished to do so, subject to the following conditions:
#
# The above copyright notice and this permission notice shall be included in
# all copies or substantial portions of the Software.
#
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
# THE SOFTWARE.



# PrecheckAWholesaleSubscriberProvisioningRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**provisioningId** | **String** | This Provisioning ID defines how this wholesale subscriber is to be provisioned for Cisco Webex Services.  Each Customer template has its unique provisioning ID. This ID is displayed under the chosen customer template on Cisco Webex Control Hub. |  [optional] |
|**customerId** | **String** | ID of the Provisioned Customer for Webex Wholesale. |  [optional] |
|**email** | **String** | The email address of the subscriber. |  |
|**_package** | [**PackageEnum**](#PackageEnum) | The Webex Wholesale package to be assigned to the subscriber. **NOTE:** This parameter will be deprecated soon. Please  use &#x60;packages&#x60; instead. |  [optional] |
|**packages** | **List&lt;Object&gt;** | The complete list of Webex Wholesale packages assigned to the subscriber. Currently accepts only one package in the list. |  [optional] |
|**provisioningParameters** | [**PrecheckAWholesaleSubscriberProvisioningRequestProvisioningParameters**](PrecheckAWholesaleSubscriberProvisioningRequestProvisioningParameters.md) |  |  [optional] |
|**customerInfo** | [**PrecheckAWholesaleSubscriberProvisioningRequestCustomerInfo**](PrecheckAWholesaleSubscriberProvisioningRequestCustomerInfo.md) |  |  [optional] |



## Enum: PackageEnum

| Name | Value |
|---- | -----|
| WEBEX_CALLING | &quot;webex_calling&quot; |
| WEBEX_MEETINGS | &quot;webex_meetings&quot; |
| WEBEX_SUITE | &quot;webex_suite&quot; |
| WEBEX_VOICE | &quot;webex_voice&quot; |
| CX_ESSENTIALS | &quot;cx_essentials&quot; |



