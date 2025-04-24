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



# TrunkGet


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | A unique name for the trunk. |  |
|**customer** | [**Customer**](Customer.md) |  |  |
|**location** | [**Location**](Location.md) |  |  [optional] |
|**otgDtgId** | **String** | Unique Outgoing and Destination trunk group associated with the dial plan. |  [optional] |
|**linePort** | **String** | The Line/Port identifies a device endpoint in standalone mode or a SIP URI public identity in IMS mode. |  [optional] |
|**locationsUsingTrunk** | **List&lt;Object&gt;** | Locations using trunk. |  [optional] |
|**pilotUserId** | **String** | User ID. |  [optional] |
|**outboundProxy** | **Object** | Contains the body of the HTTP response received following the request to Console API and will not be set if the response has no body. |  [optional] |
|**sipAuthenticationUserName** | **String** | User&#39;s authentication service information. |  [optional] |
|**status** | **DeviceStatus** |  |  |
|**errorCodes** | **List&lt;Object&gt;** | Error codes. |  [optional] |
|**responseStatus** | [**ResponseStatus**](ResponseStatus.md) |  |  [optional] |
|**dualIdentitySupportEnabled** | **Boolean** | Determines the behavior of the From and PAI headers on outbound calls. |  [optional] |
|**trunkType** | **TrunkType** |  |  |
|**deviceType** | **String** | Device type assosiated with trunk. |  [optional] |
|**address** | **String** | FQDN or SRV address. Required to create a static certificate-based trunk. |  [optional] |
|**domain** | **String** | Domain name. Required to create a static certificate based trunk. |  [optional] |
|**port** | **BigDecimal** | FQDN port. Required to create a static certificate-based trunk. |  |
|**maxConcurrentCalls** | **BigDecimal** | Max Concurrent call. Required to create a static certificate based trunk. |  [optional] |
|**isRestrictedToDedicatedInstance** | **Boolean** | Flag to indicate if the trunk is restricted to a dedicated instance. |  [optional] |



