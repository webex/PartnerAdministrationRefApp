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



# TestCallRouting200ResponseCallSourceInfo

Only returned when `originatorNumber` is specified in the request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callSourceType** | [**CallSourceTypeEnum**](#CallSourceTypeEnum) | Type of call source. |  |
|**routeListName** | **String** | Name of a route list.  When &#x60;originatorType&#x60; is &#x60;trunk&#x60;, &#x60;originatorId&#x60; is a valid trunk and the trunk belongs to a route group which is assigned to a route list with the name &#x60;routeListA&#x60; and also &#x60;originatorNumber&#x60; is a number assigned to &#x60;routeListA&#x60;, then &#x60;routeListA&#x60; is returned here. This element is returned when &#x60;callSourceType&#x60; is &#x60;ROUTE_LIST&#x60;. |  [optional] |
|**routeListId** | **String** | Unique identifier for the route list. |  [optional] |
|**dialPlanName** | **String** | Name of a dial plan. When &#x60;originatorType&#x60; is &#x60;trunk&#x60;, &#x60;originatorId&#x60; is a valid trunk with the name &#x60;trunkA&#x60;, &#x60;trunkA&#x60; belongs to a route group which is assigned to a route list with the name &#x60;routeListA&#x60;, &#x60;trunkA&#x60; is also assigned to &#x60;dialPlanA&#x60; as routing choice, &#x60;dialPlanA&#x60; has &#x60;dialPattern&#x60; xxxx assigned. If the &#x60;originatorNumber&#x60; matches the &#x60;dialPattern&#x60; &#x60;xxxx&#x60;, &#x60;dialPlanA&#x60; is returned. This element is returned when &#x60;callSourceType&#x60; is &#x60;DIAL_PATTERN&#x60;. |  [optional] |
|**dialPattern** | **String** | Pattern given to a dial plan. When &#x60;originatorType&#x60; is &#x60;trunk&#x60;, &#x60;originatorId&#x60; is a valid trunk with the name &#x60;trunkA&#x60;, &#x60;trunkA&#x60; belongs to a route group which is assigned to a route list with the name &#x60;routeListA&#x60;, &#x60;trunkA&#x60; is also assigned to &#x60;dialPlanA&#x60; as routing choice, &#x60;dialPlanA&#x60; has &#x60;dialPattern&#x60; &#x60;xxxx&#x60; assigned. If the &#x60;originatorNumber&#x60; matches the &#x60;dialPattern&#x60; &#x60;xxxx&#x60;, &#x60;dialPattern&#x60; &#x60;xxxx&#x60; is returned. This element is returned when &#x60;callSourceType&#x60; is &#x60;DIAL_PATTERN&#x60;. |  [optional] |
|**dialPlanId** | **String** | Unique identifier for dial plan. |  [optional] |



## Enum: CallSourceTypeEnum

| Name | Value |
|---- | -----|
| ROUTE_LIST | &quot;ROUTE_LIST&quot; |
| DIAL_PATTERN | &quot;DIAL_PATTERN&quot; |
| UNKOWN_EXTENSION | &quot;UNKOWN_EXTENSION&quot; |
| UNKOWN_NUMBER | &quot;UNKOWN_NUMBER&quot; |
| DIAL_PATTERN2 | &quot;DIAL_PATTERN&quot; |



