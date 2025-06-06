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



# RetrieveSelectiveAcceptCriteriaForAWorkspace200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for criteria. |  |
|**scheduleName** | **String** | Name of the location&#39;s schedule which determines when the selective accept is in effect. |  [optional] |
|**scheduleType** | [**ScheduleTypeEnum**](#ScheduleTypeEnum) | Indicates the schedule type whether &#x60;businessHours&#x60; or &#x60;holidays&#x60;. |  [optional] |
|**scheduleLevel** | [**ScheduleLevelEnum**](#ScheduleLevelEnum) | Indicates the schedule level i.e, Group. |  [optional] |
|**callsFrom** | [**CallsFromEnum**](#CallsFromEnum) | Indicates whether to apply the selective accept criteria for calls from Any Phone Number, Select Phone Numbers or Forwarded ones. |  |
|**anonymousCallersEnabled** | **Boolean** | When &#x60;true&#x60;, enables selective accept to calls from anonymous callers. |  [optional] |
|**unavailableCallersEnabled** | **Boolean** | When &#x60;true&#x60;, enables selective accept to calls if the callers are unavailable. |  [optional] |
|**phoneNumbers** | **List&lt;Object&gt;** | the list of phone numbers that will checked against incoming calls for a match. |  [optional] |
|**acceptEnabled** | **Boolean** | Indicates whether the calls, that fit within these parameters, will be accepted (if acceptEnabled &#x3D; &#x60;true&#x60;) or not (if acceptEnabled &#x3D; &#x60;false&#x60;). |  [optional] |



## Enum: ScheduleTypeEnum

| Name | Value |
|---- | -----|
| BUSINESS_HOURS | &quot;businessHours&quot; |
| HOLIDAYS | &quot;holidays&quot; |



## Enum: ScheduleLevelEnum

| Name | Value |
|---- | -----|
| GROUP | &quot;GROUP&quot; |



## Enum: CallsFromEnum

| Name | Value |
|---- | -----|
| ANY_PHONE_NUMBER | &quot;ANY_PHONE_NUMBER&quot; |
| SELECT_PHONE_NUMBERS | &quot;SELECT_PHONE_NUMBERS&quot; |
| FORWARDED | &quot;FORWARDED&quot; |



