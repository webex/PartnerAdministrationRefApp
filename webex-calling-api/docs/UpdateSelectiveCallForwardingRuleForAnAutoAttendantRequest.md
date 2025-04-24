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



# UpdateSelectiveCallForwardingRuleForAnAutoAttendantRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Unique name for the selective rule in the auto attendant. |  |
|**enabled** | **Boolean** | Reflects if rule is enabled. |  [optional] |
|**businessSchedule** | **String** | Name of the location&#39;s business schedule which determines when this selective call forwarding rule is in effect. |  [optional] |
|**holidaySchedule** | **String** | Name of the location&#39;s holiday schedule which determines when this selective call forwarding rule is in effect. |  [optional] |
|**forwardTo** | [**CreateASelectiveCallForwardingRuleForAnAutoAttendantRequestForwardTo**](CreateASelectiveCallForwardingRuleForAnAutoAttendantRequestForwardTo.md) |  |  [optional] |
|**callsFrom** | [**UpdateSelectiveCallForwardingRuleForAnAutoAttendantRequestCallsFrom**](UpdateSelectiveCallForwardingRuleForAnAutoAttendantRequestCallsFrom.md) |  |  [optional] |
|**callsTo** | [**CreateASelectiveCallForwardingRuleForAHuntGroupRequestCallsTo**](CreateASelectiveCallForwardingRuleForAHuntGroupRequestCallsTo.md) |  |  [optional] |



