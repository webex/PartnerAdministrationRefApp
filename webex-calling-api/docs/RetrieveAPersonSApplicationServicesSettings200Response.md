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



# RetrieveAPersonSApplicationServicesSettings200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ringDevicesForClickToDialCallsEnabled** | **Boolean** | When &#x60;true&#x60;, indicates to ring devices for outbound Click to Dial calls. |  |
|**ringDevicesForGroupPageEnabled** | **Boolean** | When &#x60;true&#x60;, indicates to ring devices for inbound Group Pages. |  |
|**ringDevicesForCallParkEnabled** | **Boolean** | When &#x60;true&#x60;, indicates to ring devices for Call Park recalled. |  |
|**browserClientEnabled** | **Boolean** | Indicates that the browser Webex Calling application is enabled for use. |  |
|**browserClientId** | **String** | Device ID of WebRTC client. Returns only if &#x60;browserClientEnabled&#x60; is true. |  [optional] |
|**desktopClientEnabled** | **Boolean** | Indicates that the desktop Webex Calling application is enabled for use. |  |
|**desktopClientId** | **String** | Device ID of Desktop client. Returns only if &#x60;desktopClientEnabled&#x60; is true. |  [optional] |
|**tabletClientEnabled** | **Boolean** | Indicates that the tablet Webex Calling application is enabled for use. |  |
|**mobileClientEnabled** | **Boolean** | Indicates that the mobile Webex Calling application is enabled for use. |  |
|**availableLineCount** | **BigDecimal** | Number of available device licenses for assigning devices/apps. |  |



