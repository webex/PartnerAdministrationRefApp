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



# ReadTheListOfVirtualLines200ResponseVirtualLinesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier for the virtual line. |  |
|**lastName** | **String** | Last name for virtual line. |  |
|**firstName** | **String** | First name for virtual line. |  |
|**callerIdLastName** | **String** | &#x60;callerIdLastName&#x60; for virtual line. |  [optional] |
|**callerIdFirstName** | **String** | &#x60;callerIdFirstName&#x60; for virtual line. |  [optional] |
|**callerIdNumber** | **String** | &#x60;callerIdNumber&#x60; for virtual line. |  [optional] |
|**externalCallerIdNamePolicy** | [**ExternalCallerIdNamePolicyEnum**](#ExternalCallerIdNamePolicyEnum) | &#x60;externalCallerIdNamePolicy&#x60; for the virtual line. |  |
|**customExternalCallerIdName** | **String** | &#x60;customExternalCallerIdName&#x60; for virtual line. |  [optional] |
|**number** | [**ReadTheListOfVirtualLines200ResponseVirtualLinesInnerNumber**](ReadTheListOfVirtualLines200ResponseVirtualLinesInnerNumber.md) |  |  |
|**location** | [**ReadTheListOfVirtualLines200ResponseVirtualLinesInnerLocation**](ReadTheListOfVirtualLines200ResponseVirtualLinesInnerLocation.md) |  |  |
|**numberOfDevicesAssigned** | **BigDecimal** | Number of devices assigned to a virtual line. |  |
|**billingPlan** | **String** | Type of billing plan. |  [optional] |



## Enum: ExternalCallerIdNamePolicyEnum

| Name | Value |
|---- | -----|
| DIRECT_LINE | &quot;DIRECT_LINE&quot; |
| LOCATION | &quot;LOCATION&quot; |
| OTHER | &quot;OTHER&quot; |



