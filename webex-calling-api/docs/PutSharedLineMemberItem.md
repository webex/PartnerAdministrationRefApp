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



# PutSharedLineMemberItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for the person or workspace. |  |
|**port** | **BigDecimal** | Device port number assigned to person or workspace. |  |
|**t38FaxCompressionEnabledBacktickTrueBacktick** | **Boolean** | T.38 Fax Compression setting. Valid only for ATA Devices. Overrides user level compression options. |  [optional] |
|**primaryOwner** | **String** | If &#x60;true&#x60; the person or the workspace is the owner of the device. Points to primary line/port of the device. |  |
|**lineType** | [**LineType**](LineType.md) | Indicates if the line is acting as a primary line or a shared line for this device. |  |
|**lineWeight** | **BigDecimal** | Number of lines that have been configured for the person on the device. |  |
|**hotlineEnabled** | **Boolean** | Configure this line to automatically call a predefined number whenever taken off-hook. Once enabled, the line can only make calls to the predefined number set in &#x60;hotlineDestination&#x60;. |  |
|**hotlineDestination** | **String** | Preconfigured number for the hotline. Required only if &#x60;hotlineEnabled&#x60; is set to &#x60;true&#x60;. |  |
|**allowCallDeclineEnabled** | **Boolean** | Set how a device behaves when a call is declined. When set to &#x60;true&#x60;, a call decline request is extended to all the endpoints on the device. When set to &#x60;false&#x60;, a call decline request is only declined at the current endpoint. |  |
|**lineLabel** | **String** | Device line label. |  [optional] |



