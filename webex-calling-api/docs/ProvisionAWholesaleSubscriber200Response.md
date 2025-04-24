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



# ProvisionAWholesaleSubscriber200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique Cisco identifier for the subscriber. |  [optional] |
|**personId** | **String** | The person id of the subscriber used in the /people API. Only presented when status is &#x60;provisioned&#x60;. |  [optional] |
|**email** | **String** | The email address of the subscriber. |  [optional] |
|**customerId** | **String** | A unique identifier for the customer. |  [optional] |
|**externalCustomerId** | **String** | External ID of the Wholesale customer. |  [optional] |
|**_package** | [**PackageEnum**](#PackageEnum) | The Webex Wholesale Package assigned to the subscriber. |  [optional] |
|**packages** | **List&lt;Object&gt;** | The list of Webex Wholesale packages assigned to the subscriber. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The provisioning status of the user. |  [optional] |
|**errors** | **List&lt;Object&gt;** | List of errors that occurred during that last attempt to provision/update this subscriber.   *Note:*  + This list captures errors that occurred during provisioning of the subscriber.  + Any errors that occur during initial API request validation will be captured directly in error response with appropriate HTTP status code. |  [optional] |
|**created** | **String** | The date and time the subscriber was provisioned. |  [optional] |
|**lastStatusChange** | **String** | The date and time the provisioning status of the subscriber last changed. |  [optional] |



## Enum: PackageEnum

| Name | Value |
|---- | -----|
| WEBEX_CALLING | &quot;webex_calling&quot; |
| WEBEX_MEETINGS | &quot;webex_meetings&quot; |
| WEBEX_SUITE | &quot;webex_suite&quot; |
| WEBEX_VOICE | &quot;webex_voice&quot; |
| CX_ESSENTIALS | &quot;cx_essentials&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PROVISIONED | &quot;provisioned&quot; |
| PENDING_USER_MIGRATION | &quot;pending_user_migration&quot; |



