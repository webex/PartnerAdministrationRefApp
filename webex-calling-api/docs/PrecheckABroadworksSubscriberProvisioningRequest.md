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



# PrecheckABroadworksSubscriberProvisioningRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**provisioningId** | **String** | Provisioning ID that defines how this subscriber is to be provisioned for Cisco Webex Services. Each Customer Template has its unique Provisioning ID. This ID will be displayed under the chosen Customer Template on Cisco Webex Control Hub. |  [optional] |
|**userId** | **String** | The user ID of the Broadworks subscriber. |  [optional] |
|**spEnterpriseId** | **String** | The Service Provider supplied unique identifier for the subscriber&#39;s enterprise. |  [optional] |
|**firstName** | **String** | The first name of the subscriber. |  [optional] |
|**lastName** | **String** | The last name of the subscriber. |  [optional] |
|**_package** | [**PackageEnum**](#PackageEnum) | The Webex for BroadWorks package to be assigned to the subscriber. |  [optional] |
|**primaryPhoneNumber** | **String** | The primary phone number configured for the subscriber on BroadWorks. |  [optional] |
|**mobilePhoneNumber** | **String** | The mobile phone number configured against the subscriber on BroadWorks. |  [optional] |
|**extension** | **String** | The extension number configured against the subscriber on BroadWorks. |  [optional] |
|**email** | **String** | The email address of the subscriber. |  |
|**language** | **String** | The ISO 639-1 language code associated with the subscriber. Reserved for future use. Any value currently specified will be ignored during subscriber provisioning. |  [optional] |
|**timezone** | **String** | The time zone associated with the subscriber. Refer to the [Webex Meetings Site Timezone](/docs/api/guides/webex-for-broadworks-developers-guide#webex-meetings-site-timezone) section of the [Webex for BroadWorks](/docs/api/guides/webex-for-broadworks-developers-guide) guide for more information. |  [optional] |
|**customerInfo** | [**PrecheckABroadworksSubscriberProvisioningRequestCustomerInfo**](PrecheckABroadworksSubscriberProvisioningRequestCustomerInfo.md) |  |  [optional] |



## Enum: PackageEnum

| Name | Value |
|---- | -----|
| SOFTPHONE | &quot;softphone&quot; |
| BASIC | &quot;basic&quot; |
| STANDARD | &quot;standard&quot; |
| PREMIUM | &quot;premium&quot; |



