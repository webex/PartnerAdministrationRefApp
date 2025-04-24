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



# ProvisionABroadWorksSubscriberRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**provisioningId** | **String** | This Provisioning ID defines how this subscriber is to be provisioned for Webex Services.  Each Customer Template will have their own unique Provisioning ID. This ID will be displayed under the chosen Customer Template on Webex Partner Hub. |  |
|**userId** | **String** | The user ID of the subscriber on BroadWorks. |  |
|**spEnterpriseId** | **String** | The Service Provider supplied unique identifier for the subscriber&#39;s enterprise. |  |
|**firstName** | **String** | The first name of the subscriber. |  |
|**lastName** | **String** | The last name of the subscriber. |  |
|**_package** | [**PackageEnum**](#PackageEnum) | The Webex for BroadWorks package to be assigned to the subscriber. |  |
|**primaryPhoneNumber** | **String** | The primary phone number configured against the subscriber on BroadWorks. |  [optional] |
|**mobilePhoneNumber** | **String** | The mobile phone number configured against the subscriber on BroadWorks. Any empty value on update will remove the already configured mobile phone number. |  [optional] |
|**extension** | **String** | The extension number configured against the subscriber on BroadWorks. |  [optional] |
|**email** | **String** | The email address of the subscriber (mandatory for the trusted email provisioning flow). |  [optional] |
|**language** | **String** | The {ISO-639-1}_{ISO-3166} or {ISO-639-1} locale or language code used as preferred language for organization and Webex Meeting Sites. Refer to the [help page](https://www.cisco.com/content/en/us/td/docs/voice_ip_comm/cloudCollaboration/wx4bwks/Solution_Guide/wbxbw_b_solution-guide/wbxbw_b_SolutionGuide-PDF_chapter_01.html#Cisco_Reference.dita_f10351e1-f775-418d-a700-ec8487e0a33b) for more information. |  [optional] |
|**timezone** | **String** | The time zone associated with the subscriber. Refer to the [Webex Meetings Site Timezone](/docs/api/guides/webex-for-broadworks-developers-guide#webex-meetings-site-timezone) section of the [Webex for BroadWorks](/docs/api/guides/webex-for-broadworks-developers-guide) guide for more information. |  [optional] |



## Enum: PackageEnum

| Name | Value |
|---- | -----|
| SOFTPHONE | &quot;softphone&quot; |
| BASIC | &quot;basic&quot; |
| STANDARD | &quot;standard&quot; |
| PREMIUM | &quot;premium&quot; |



