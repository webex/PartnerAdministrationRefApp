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



# PlaceSelectiveRejectCallCriteriaPost


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scheduleName** | **String** | Name of the location&#39;s schedule which determines when the selective reject is in effect. |  |
|**scheduleType** | **ScheduleTypeSelection** |  |  |
|**scheduleLevel** | **PlaceScheduleLevel** |  |  |
|**callsFrom** | **SelectiveRejectCallCallsFromType** |  |  |
|**anonymousCallersEnabled** | **Boolean** | When &#x60;true&#x60;, enables calls from anonymous callers. Value for this attribute is required if &#x60;callsFrom&#x60; is &#x60;SELECT_PHONE_NUMBERS&#x60;. |  [optional] |
|**unavailableCallersEnabled** | **Boolean** | When &#x60;true&#x60;, enables calls even if callers are unavailable. Value for this attribute is required if &#x60;callsFrom&#x60; is &#x60;SELECT_PHONE_NUMBERS&#x60;. |  [optional] |
|**phoneNumbers** | **List&lt;Object&gt;** | the list of phone numbers that will checked against incoming calls for a match. Value for this attribute is required if &#x60;callsFrom&#x60; is &#x60;SELECT_PHONE_NUMBERS&#x60;. |  [optional] |
|**rejectEnabled** | **Boolean** | Choose to reject (if &#x60;rejectEnabled&#x60; &#x3D; &#x60;true&#x60;) or not to reject (if &#x60;rejectEnabled&#x60; &#x3D; &#x60;false&#x60;) the calls that fit within these parameters. |  |



