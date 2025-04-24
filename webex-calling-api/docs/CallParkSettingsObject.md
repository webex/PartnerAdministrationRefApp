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


# CallParkSettingsObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ringPattern** | [**RingPatternEnum**](#RingPatternEnum) | Ring pattern for when this callpark is called. |  |
|**recallTime** | **BigDecimal** | Amount of time within 30 and 600 seconds the Call Park will be parked. If the call isn&#39;t picked up within the set time, then the call will be recalled based on the Call Park Recall setting. |  [optional] |
|**huntWaitTime** | **BigDecimal** | Amount of time within 30 and 600 seconds the Call Park will be parked. If the call isn&#39;t picked up, the call will revert back to the hunt group (after the person who parked the call is alerted). |  [optional] |



## Enum: RingPatternEnum

| Name | Value |
|---- | -----|
| NORMAL | &quot;NORMAL&quot; |
| LONG_LONG | &quot;LONG_LONG&quot; |
| SHORT_SHORT_LONG | &quot;SHORT_SHORT_LONG&quot; |
| SHORT_LONG_SHORT | &quot;SHORT_LONG_SHORT&quot; |



