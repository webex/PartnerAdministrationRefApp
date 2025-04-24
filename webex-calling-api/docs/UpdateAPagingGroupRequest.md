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



# UpdateAPagingGroupRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** | Whether or not the paging group is enabled. |  [optional] |
|**name** | **String** | Unique name for the paging group. Minimum length is 1. Maximum length is 30. |  [optional] |
|**phoneNumber** | **String** | Paging group phone number. Minimum length is 1. Maximum length is 23.  Either &#x60;phoneNumber&#x60; or &#x60;extension&#x60; is mandatory. |  [optional] |
|**extension** | **String** | Paging group extension. Minimum length is 2. Maximum length is 10.  Either &#x60;phoneNumber&#x60; or &#x60;extension&#x60; is mandatory. |  [optional] |
|**languageCode** | **String** | Language code. |  [optional] |
|**firstName** | **String** | First name to be shown when calls are forwarded out of this paging group. Defaults to \&quot;.\&quot;. |  [optional] |
|**lastName** | **String** | Last name to be shown when calls are forwarded out of this paging group. Defaults to the phone number if set, otherwise defaults to call group name. |  [optional] |
|**originatorCallerIdEnabled** | **Boolean** | Determines what is shown on target users caller ID when a group page is performed. If true shows page originator ID. |  [optional] |
|**originators** | **List&lt;Object&gt;** | An array of people and/or workspaces, who may originate pages to this paging group. |  [optional] |
|**targets** | **List&lt;Object&gt;** | People, including workspaces, that are added to paging group as paging call targets. |  [optional] |



