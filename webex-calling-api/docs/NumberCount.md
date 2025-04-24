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



# NumberCount


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assigned** | **BigDecimal** | Count of phone numbers that are in the assigned state. |  [optional] |
|**unAssigned** | **BigDecimal** | Count of phone numbers which are in the un-assigned state. |  [optional] |
|**inActive** | **BigDecimal** | Count of phone numbers which are inactive. |  [optional] |
|**extensionOnly** | **BigDecimal** | Count of extensions only without phone number. |  [optional] |
|**tollFreeNumbers** | **BigDecimal** | Count of the toll free numbers. |  [optional] |
|**total** | **BigDecimal** | Total phone numbers and extensions available. |  [optional] |
|**mobileNumber** | **BigDecimal** | Count of phone numbers of type &#x60;MOBILE_NUMBER&#x60; only without &#x60;PSTN_NUMBER&#x60; and extension. |  [optional] |
|**serviceNumber** | **BigDecimal** | Count of phone numbers with &#x60;includedTelephonyTypes&#x60; as &#x60;PSTN_NUMBER&#x60; and &#x60;isServiceNumber&#x60; value as &#x60;true&#x60;. |  [optional] |



