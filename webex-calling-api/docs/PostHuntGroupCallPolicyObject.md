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



# PostHuntGroupCallPolicyObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**policy** | [**HuntPolicySelection**](HuntPolicySelection.md) | Call routing policy used to dispatch calls to agents. |  |
|**waitingEnabled** | **Boolean** | If &#x60;false&#x60;, then the option is treated as \&quot;Advance when busy\&quot;. The hunt group won&#39;t ring agents when they&#39;re on a call and advances to the next agent. If a hunt group agent has call waiting enabled and the call is advanced to them, the call waits until that hunt group agent isn&#39;t busy. |  [optional] |
|**groupBusyEnabled** | **Boolean** | If &#x60;true&#x60;, the hunt group busy status will be set to busy. All new calls will get busy treatment. If &#x60;busyRedirect&#x60; is enabled, the calls are routed to the destination specified in &#x60;busyRedirect&#x60;. |  [optional] |
|**allowMembersToControlGroupBusyEnabled** | **Boolean** | If true, agents can change the hunt group busy status. |  [optional] |
|**noAnswer** | [**PostHuntGroupCallPolicyObjectNoAnswer**](PostHuntGroupCallPolicyObjectNoAnswer.md) |  |  |
|**busyRedirect** | [**GetHuntGroupCallPolicyObjectBusyRedirect**](GetHuntGroupCallPolicyObjectBusyRedirect.md) |  |  [optional] |
|**businessContinuityRedirect** | [**GetHuntGroupCallPolicyObjectBusinessContinuityRedirect**](GetHuntGroupCallPolicyObjectBusinessContinuityRedirect.md) |  |  [optional] |
|**businessContinuity** | [**GetHuntGroupCallPolicyObjectBusinessContinuity**](GetHuntGroupCallPolicyObjectBusinessContinuity.md) |  |  |



