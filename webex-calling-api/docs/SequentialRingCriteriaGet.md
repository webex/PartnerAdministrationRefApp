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



# SequentialRingCriteriaGet


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for criteria. |  |
|**scheduleName** | **String** | Name of the location&#39;s schedule which determines when the sequential ring is in effect. |  |
|**scheduleType** | [**ScheduleTypeEnum**](#ScheduleTypeEnum) | This indicates the type of schedule. |  |
|**scheduleLevel** | [**ScheduleLevelEnum**](#ScheduleLevelEnum) | This indicates the level of the schedule specified by &#x60;scheduleName&#x60;. |  |
|**callsFrom** | [**CallsFromEnum**](#CallsFromEnum) | This indicates if criteria are applicable for calls from any phone number or selected phone numbers. |  |
|**anonymousCallersEnabled** | **Boolean** | When &#x60;true&#x60; incoming calls from private numbers are allowed. This is only applicable when &#x60;callsFrom&#x60; is set to &#x60;SELECT_PHONE_NUMBERS&#x60;. |  [optional] |
|**unavailableCallersEnabled** | **Boolean** | When &#x60;true&#x60; incoming calls from unavailable numbers are allowed. This is only applicable when &#x60;callsFrom&#x60; is set to &#x60;SELECT_PHONE_NUMBERS&#x60;. |  [optional] |
|**phoneNumbers** | **List&lt;Object&gt;** | When callsFrom is set to &#x60;SELECT_PHONE_NUMBERS&#x60;, indicates a list of incoming phone numbers for which the criteria apply. |  [optional] |
|**ringEnabled** | **Boolean** | When set to &#x60;true&#x60; sequential ringing is enabled for calls that meet the current criteria. Criteria with &#x60;ringEnabled&#x60; set to &#x60;false&#x60; take priority. |  |



## Enum: ScheduleTypeEnum

| Name | Value |
|---- | -----|
| HOLIDAYS | &quot;holidays&quot; |
| BUSINESS_HOURS | &quot;businessHours&quot; |



## Enum: ScheduleLevelEnum

| Name | Value |
|---- | -----|
| GROUP | &quot;GROUP&quot; |



## Enum: CallsFromEnum

| Name | Value |
|---- | -----|
| SELECT_PHONE_NUMBERS | &quot;SELECT_PHONE_NUMBERS&quot; |
| ANY_PHONE_NUMBER | &quot;ANY_PHONE_NUMBER&quot; |



