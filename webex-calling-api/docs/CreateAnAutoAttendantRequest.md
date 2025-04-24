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


# CreateAnAutoAttendantRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Unique name for the auto attendant. |  |
|**phoneNumber** | **String** | Auto attendant phone number.  Either &#x60;phoneNumber&#x60; or &#x60;extension&#x60; is mandatory. |  [optional] |
|**extension** | **String** | Auto attendant extension.  Either &#x60;phoneNumber&#x60; or &#x60;extension&#x60; is mandatory. |  [optional] |
|**firstName** | **String** | First name defined for an auto attendant. |  [optional] |
|**lastName** | **String** | Last name defined for an auto attendant. |  [optional] |
|**alternateNumbers** | **List&lt;Object&gt;** | Alternate numbers defined for the auto attendant. |  [optional] |
|**languageCode** | **String** | Announcement language code for the auto attendant. |  [optional] |
|**businessSchedule** | **String** | Business hours defined for the auto attendant. |  |
|**holidaySchedule** | **String** | Holiday defined for the auto attendant. |  [optional] |
|**extensionDialing** | [**ExtensionDialingEnum**](#ExtensionDialingEnum) | Extension dialing setting. If the values are not set default will be set as &#x60;ENTERPRISE&#x60;. |  [optional] |
|**nameDialing** | [**NameDialingEnum**](#NameDialingEnum) | Name dialing setting. If the values are not set default will be set as &#x60;ENTERPRISE&#x60;. |  [optional] |
|**timeZone** | **String** | Time zone defined for the auto attendant. |  [optional] |
|**businessHoursMenu** | [**UpdateAnAutoAttendantRequestBusinessHoursMenu**](UpdateAnAutoAttendantRequestBusinessHoursMenu.md) |  |  |
|**afterHoursMenu** | [**UpdateAnAutoAttendantRequestAfterHoursMenu**](UpdateAnAutoAttendantRequestAfterHoursMenu.md) |  |  |



## Enum: ExtensionDialingEnum

| Name | Value |
|---- | -----|
| ENTERPRISE | &quot;ENTERPRISE&quot; |
| GROUP | &quot;GROUP&quot; |



## Enum: NameDialingEnum

| Name | Value |
|---- | -----|
| ENTERPRISE | &quot;ENTERPRISE&quot; |
| GROUP | &quot;GROUP&quot; |



