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


# AutoAttendantCallForwardAvailableNumberObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phoneNumber** | **String** | A unique identifier for the PSTN phone number. |  [optional] |
|**extension** | **String** | Extension for a PSTN phone number. |  [optional] |
|**state** | [**STATE**](STATE.md) | Phone number&#39;s state. |  |
|**isMainNumber** | **Boolean** | If &#x60;true&#x60;, the phone number is used as a location CLID. |  |
|**tollFreeNumber** | **Boolean** | If &#x60;true&#x60;, the phone number is a toll-free number. |  |
|**telephonyType** | [**TelephonyType**](TelephonyType.md) | The telephony type for the number. |  |
|**isServiceNumber** | **Boolean** | If &#x60;true&#x60;, the phone number is a service number; otherwise, it is a standard number. Service numbers are high-utilization or high-concurrency PSTN phone numbers that are neither mobile nor toll-free. |  |
|**owner** | [**HuntGroupCallForwardAvailableNumberObjectOwner**](HuntGroupCallForwardAvailableNumberObjectOwner.md) |  |  [optional] |



