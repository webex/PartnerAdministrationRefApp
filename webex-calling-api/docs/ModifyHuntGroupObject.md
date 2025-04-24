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



# ModifyHuntGroupObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** | Whether or not the hunt group is enabled. |  [optional] |
|**name** | **String** | Unique name for the hunt group. |  [optional] |
|**phoneNumber** | **String** | Primary phone number of the hunt group. |  [optional] |
|**extension** | **String** | Primary phone extension of the hunt group. |  [optional] |
|**distinctiveRing** | **Boolean** | Whether or not the hunt group has the distinctive ring option enabled. |  [optional] |
|**alternateNumbers** | **List&lt;Object&gt;** | The alternate numbers feature allows you to assign multiple phone numbers or extensions to a hunt group. Each number will reach the same greeting and each menu will function identically to the main number. The alternate numbers option enables you to have up to ten (10) phone numbers ring into the hunt group. |  [optional] |
|**languageCode** | **String** | Language code. |  [optional] |
|**firstName** | **String** | First name to be shown when calls are forwarded out of this hunt group. Defaults to &#x60;.&#x60;. |  [optional] |
|**lastName** | **String** | Last name to be shown when calls are forwarded out of this hunt group. Defaults to the phone number if set, otherwise defaults to call group name. |  [optional] |
|**timeZone** | **String** | Time zone for the hunt group. |  [optional] |
|**callPolicies** | [**PostHuntGroupCallPolicyObject**](PostHuntGroupCallPolicyObject.md) |  |  [optional] |
|**agents** | **List&lt;Object&gt;** | People, workspaces and virtual lines that are eligible to  receive calls. |  [optional] |
|**huntGroupCallerIdForOutgoingCallsEnabled** | **Boolean** | Enable the hunt group to be used as the caller ID when the agent places outgoing calls. When set to true the hunt group&#39;s caller ID will be used. |  [optional] |



