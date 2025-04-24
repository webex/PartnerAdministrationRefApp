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



# TestCallRouting200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callSourceInfo** | [**TestCallRouting200ResponseCallSourceInfo**](TestCallRouting200ResponseCallSourceInfo.md) |  |  [optional] |
|**destinationType** | [**DestinationTypeEnum**](#DestinationTypeEnum) | Destination type for the call. |  |
|**routingAddress** | **String** | FAC code if &#x60;destinationType&#x60; is FAC. The routing address will be returned for all other destination types. |  |
|**outsideAccessCode** | **String** | Outside access code. |  [optional] |
|**isRejected** | **Boolean** | &#x60;true&#x60; if the call would be rejected. |  |
|**callingLineID** | **String** | Calling line ID (CLID) configured for the calling user. |  [optional] |
|**routingProfile** | **String** | Routing profile that is used to route network calls. |  [optional] |
|**hostedAgent** | [**TestCallRouting200ResponseHostedAgent**](TestCallRouting200ResponseHostedAgent.md) |  |  [optional] |
|**hostedFeature** | [**TestCallRouting200ResponseHostedFeature**](TestCallRouting200ResponseHostedFeature.md) |  |  [optional] |
|**pbxUser** | [**TestCallRouting200ResponsePbxUser**](TestCallRouting200ResponsePbxUser.md) |  |  [optional] |
|**pstnNumber** | [**TestCallRouting200ResponsePstnNumber**](TestCallRouting200ResponsePstnNumber.md) |  |  [optional] |
|**virtualExtension** | [**TestCallRouting200ResponseVirtualExtension**](TestCallRouting200ResponseVirtualExtension.md) |  |  [optional] |
|**virtualExtensionRange** | [**TestCallRouting200ResponseVirtualExtensionRange**](TestCallRouting200ResponseVirtualExtensionRange.md) |  |  [optional] |
|**routeList** | [**TestCallRouting200ResponseRouteList**](TestCallRouting200ResponseRouteList.md) |  |  [optional] |
|**featureAccessCode** | [**TestCallRouting200ResponseFeatureAccessCode**](TestCallRouting200ResponseFeatureAccessCode.md) |  |  [optional] |
|**emergency** | [**TestCallRouting200ResponseEmergency**](TestCallRouting200ResponseEmergency.md) |  |  [optional] |
|**repair** | [**TestCallRouting200ResponseRepair**](TestCallRouting200ResponseRepair.md) |  |  [optional] |
|**unknownExtension** | [**TestCallRouting200ResponseUnknownExtension**](TestCallRouting200ResponseUnknownExtension.md) |  |  [optional] |
|**unknownNumber** | [**TestCallRouting200ResponseUnknownNumber**](TestCallRouting200ResponseUnknownNumber.md) |  |  [optional] |
|**appliedServices** | **List&lt;Object&gt;** | Returned if any origin is configured with intercept details, outgoing permissions by type, or translation pattern. |  [optional] |



## Enum: DestinationTypeEnum

| Name | Value |
|---- | -----|
| HOSTED_AGENT | &quot;HOSTED_AGENT&quot; |
| HOSTED_FEATURE | &quot;HOSTED_FEATURE&quot; |
| PBX_USER | &quot;PBX_USER&quot; |
| PSTN_NUMBER | &quot;PSTN_NUMBER&quot; |
| VIRTUAL_EXTENSION | &quot;VIRTUAL_EXTENSION&quot; |
| VIRTUAL_EXTENSION_RANGE | &quot;VIRTUAL_EXTENSION_RANGE&quot; |
| ROUTE_LIST | &quot;ROUTE_LIST&quot; |
| FAC | &quot;FAC&quot; |
| EMERGENCY | &quot;EMERGENCY&quot; |
| REPAIR | &quot;REPAIR&quot; |
| UNKNOWN_EXTENSION | &quot;UNKNOWN_EXTENSION&quot; |
| UNKNOWN_NUMBER | &quot;UNKNOWN_NUMBER&quot; |
| HOSTED_AGENT2 | &quot;HOSTED_AGENT&quot; |



