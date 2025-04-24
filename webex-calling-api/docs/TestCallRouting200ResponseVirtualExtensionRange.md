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



# TestCallRouting200ResponseVirtualExtensionRange

Returned when `destinationType` is `VIRTUAL_EXTENSION_RANGE`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for virtual extension range. |  |
|**name** | **String** | Name of the virtual extension range. |  [optional] |
|**prefix** | **String** | Prefix that the virtual extension range is associated with (Note: Standard mode must have leading &#39;+&#39; in prefix; BCD/Enhanced mode can have any valid prefix). |  |
|**pattern** | **String** | Pattern associated with the virtual extension range. |  |
|**locationName** | **String** | Location name if the virtual extension range is at the location level, empty if it is at the customer level. |  [optional] |
|**locationId** | **String** | Location ID if the virtual extension range is at the location level, empty if it is at customer level. |  [optional] |
|**trunkName** | **String** | Name of the trunk. |  [optional] |
|**trunkId** | **String** | Unique identifier of the trunk. |  [optional] |
|**routeGroupName** | **String** | Name of the route group. |  [optional] |
|**routeGroupId** | **String** | Unique identifier of the route group. |  [optional] |
|**trunkLocationName** | **String** | Location of the trunk; required if &#x60;trunkName&#x60; is returned. |  [optional] |
|**trunkLocationId** | **String** | Location ID of the trunk; required if &#x60;trunkName&#x60; is returned. |  [optional] |



