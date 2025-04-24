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



# PersonPrimaryAvailableNumberObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phoneNumber** | **String** | A unique identifier for the phone number. |  |
|**state** | [**STATE**](STATE.md) | Phone number&#39;s state. |  |
|**isMainNumber** | **Boolean** | Indicates if the phone number is used as a location CLID. |  |
|**telephonyType** | [**TelephonyTypeEnum**](#TelephonyTypeEnum) | Indicates the telephony type for the number. |  |
|**mobileNetwork** | **String** | Mobile Network for the number if the number&#39;s &#x60;telephonyType&#x60; is &#x60;MOBILE_NUMBER&#x60;. |  [optional] |
|**routingProfile** | **String** | Routing Profile for the number if the number&#39;s &#x60;telephonyType&#x60; is &#x60;MOBILE_NUMBER&#x60;. |  [optional] |
|**isServiceNumber** | **Boolean** | If &#x60;true&#x60;, the phone number is a service number; otherwise, it is a standard number. Service numbers are high-utilization or high-concurrency PSTN phone numbers that are neither mobile nor toll-free. |  |



## Enum: TelephonyTypeEnum

| Name | Value |
|---- | -----|
| PSTN_NUMBER | &quot;PSTN_NUMBER&quot; |
| MOBILE_NUMBER | &quot;MOBILE_NUMBER&quot; |



