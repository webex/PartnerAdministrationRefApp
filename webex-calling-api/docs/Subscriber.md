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



# Subscriber


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique Cisco identifier for the subscriber. |  [optional] |
|**personId** | **String** | The Person Id of the subscriber on Webex. To be used when referencing this subscriber on other Webex APIs. Only presented when status is &#x60;provisioned&#x60;. |  [optional] |
|**userId** | **String** | The user ID of the subscriber on BroadWorks. |  [optional] |
|**spEnterpriseId** | **String** | The Service Provider supplied unique identifier for the subscriber&#39;s enterprise. |  [optional] |
|**firstName** | **String** | The first name of the subscriber. |  [optional] |
|**lastName** | **String** | The last name of the subscriber. |  [optional] |
|**email** | **String** | The email address of the subscriber. |  [optional] |
|**primaryPhoneNumber** | **String** | The primary phone number configured against the subscriber on BroadWorks. |  [optional] |
|**mobilePhoneNumber** | **String** | The mobile phone number configured against the subscriber on BroadWorks. |  [optional] |
|**extension** | **String** | The extension number configured against the subscriber on BroadWorks. |  [optional] |
|**_package** | [**PackageEnum**](#PackageEnum) | The Webex for BroadWorks Package assigned to the subscriber. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The provisioning status of the user. |  [optional] |
|**errors** | **List&lt;Object&gt;** | List of errors that occurred during that last attempt to provision/update this subscriber.   *Note:*  + This list captures errors that occurred during *asynchronous or background* provisioning of the subscriber, *after* the API has been accepted and 200 OK response returned.  + Any errors that occur during initial API request validation will be captured directly in error response with appropriate HTTP status code. |  [optional] |
|**created** | **String** | The date and time the subscriber was provisioned. |  [optional] |
|**lastStatusChange** | **String** | The date and time the provisioning status of the subscriber last changed. |  [optional] |
|**provisioningId** | **String** | This Provisioning ID associated with this subscriber. |  [optional] |
|**selfActivated** | **Boolean** | Indicates if the subscriber was self activated, rather than provisioned via these APIs. |  [optional] |



## Enum: PackageEnum

| Name | Value |
|---- | -----|
| SOFTPHONE | &quot;softphone&quot; |
| BASIC | &quot;basic&quot; |
| STANDARD | &quot;standard&quot; |
| PREMIUM | &quot;premium&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING_EMAIL_INPUT | &quot;pending_email_input&quot; |
| PENDING_EMAIL_VALIDATION | &quot;pending_email_validation&quot; |
| PENDING_USER_MIGRATION | &quot;pending_user_migration&quot; |
| PROVISIONING | &quot;provisioning&quot; |
| PROVISIONED | &quot;provisioned&quot; |
| UPDATING | &quot;updating&quot; |
| ERROR | &quot;error&quot; |



