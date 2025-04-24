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



# PlaceSelectiveForwardCallCriteriaPost


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**forwardToPhoneNumber** | **String** | Phone number to forward calls to during this schedule. |  [optional] |
|**destinationVoicemailEnabled** | **Boolean** | Enables forwarding for all calls to voicemail. This option is only available for internal phone numbers or extensions. |  [optional] |
|**scheduleName** | **String** | Name of the location&#39;s schedule which determines when the selective forward is in effect. |  [optional] |
|**scheduleType** | **ScheduleTypeSelection** |  |  [optional] |
|**scheduleLevel** | **PlaceScheduleLevel** |  |  [optional] |
|**callsFrom** | **CallsFromType** |  |  |
|**anonymousCallersEnabled** | **Boolean** | When &#x60;true&#x60;, enables selective forward to calls from anonymous callers. |  [optional] |
|**unavailableCallersEnabled** | **Boolean** | When &#x60;true&#x60;, enables selective forward to calls if the callers are unavailable. |  [optional] |
|**numbers** | **List&lt;Object&gt;** | List of phone numbers checked against incoming calls for a match. |  [optional] |
|**forwardEnabled** | **Boolean** | Indicates whether the calls, that fit within these parameters, will be forwarded (if forwardEnabled &#x3D; &#x60;true&#x60;) or not (if forwardEnabled &#x3D; &#x60;false&#x60;). |  [optional] |



