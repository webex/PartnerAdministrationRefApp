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



# TestCallRoutingPostResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callSourceInfo** | [**CallSourceInfo**](CallSourceInfo.md) |  |  [optional] |
|**destinationType** | [**CallDestinationType**](CallDestinationType.md) | Destination type for the call. |  |
|**routingAddress** | **String** | FAC code if &#x60;destinationType&#x60; is FAC. The routing address will be returned for all other destination types. |  |
|**outsideAccessCode** | **String** | Outside access code. |  [optional] |
|**isRejected** | **Boolean** | &#x60;true&#x60; if the call would be rejected. |  |
|**callingLineID** | **String** | Calling line ID (CLID) configured for the calling user. |  [optional] |
|**routingProfile** | **String** | Routing profile that is used to route network calls. |  [optional] |
|**hostedAgent** | [**HostedAgent**](HostedAgent.md) |  |  [optional] |
|**hostedFeature** | [**HostedFeature**](HostedFeature.md) |  |  [optional] |
|**pbxUser** | [**PbxUser**](PbxUser.md) |  |  [optional] |
|**pstnNumber** | [**PstnNumber**](PstnNumber.md) |  |  [optional] |
|**virtualExtension** | [**VirtualExtension**](VirtualExtension.md) |  |  [optional] |
|**virtualExtensionRange** | [**VirtualExtensionRange**](VirtualExtensionRange.md) |  |  [optional] |
|**routeList** | [**RouteList**](RouteList.md) |  |  [optional] |
|**featureAccessCode** | [**FeatureAccessCode**](FeatureAccessCode.md) |  |  [optional] |
|**emergency** | [**Emergency**](Emergency.md) |  |  [optional] |
|**repair** | [**Repair**](Repair.md) |  |  [optional] |
|**unknownExtension** | [**UnknownExtension**](UnknownExtension.md) |  |  [optional] |
|**unknownNumber** | [**UnknownNumber**](UnknownNumber.md) |  |  [optional] |
|**appliedServices** | **List&lt;Object&gt;** | Returned if any origin is configured with intercept details, outgoing permissions by type, or translation pattern. |  [optional] |



