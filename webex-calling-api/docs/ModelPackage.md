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



# ModelPackage


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | [**NameEnum**](#NameEnum) | The Webex Wholesale Packages assigned to the customer. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The provisioning status of the a particular package. |  [optional] |
|**warnings** | **List&lt;Object&gt;** | List of warnings that occurred during that last attempt to provision/update this customer.   *Note:*  + This list captures errors that occurred during *asynchronous or background* provisioning of the customer, *after* the API has been accepted and 202 response returned.  + Any errors that occur during initial API request validation will be captured directly in error response with appropriate HTTP status code. |  [optional] |
|**errors** | **List&lt;Object&gt;** | List of errors that occurred during that last attempt to provision/update this customer.   *Note:*  + This list captures errors that occurred during *asynchronous or background* provisioning of the customer, *after* the API has been accepted and 202 response returned.  + Any errors that occur during initial API request validation will be captured directly in error response with appropriate HTTP status code. |  [optional] |



## Enum: NameEnum

| Name | Value |
|---- | -----|
| COMMON_AREA_CALLING | &quot;common_area_calling&quot; |
| WEBEX_CALLING | &quot;webex_calling&quot; |
| WEBEX_MEETINGS | &quot;webex_meetings&quot; |
| WEBEX_SUITE | &quot;webex_suite&quot; |
| WEBEX_VOICE | &quot;webex_voice&quot; |
| CX_ESSENTIALS | &quot;cx_essentials&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PROVISIONED | &quot;provisioned&quot; |
| PROVISIONING | &quot;provisioning&quot; |
| DELETING | &quot;deleting&quot; |
| ERROR | &quot;error&quot; |



