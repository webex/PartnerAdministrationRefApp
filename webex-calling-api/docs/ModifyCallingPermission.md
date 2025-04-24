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



# ModifyCallingPermission


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callType** | [**CallTypeEnum**](#CallTypeEnum) | Indicates types for outgoing calls. |  [optional] |
|**action** | [**ActionEnum**](#ActionEnum) | Indicates permission for call types. |  [optional] |
|**transferEnabled** | **Boolean** | Indicate calling permission for call type enable status. |  [optional] |



## Enum: CallTypeEnum

| Name | Value |
|---- | -----|
| INTERNAL_CALL | &quot;INTERNAL_CALL&quot; |
| TOLL_FREE | &quot;TOLL_FREE&quot; |
| INTERNATIONAL | &quot;INTERNATIONAL&quot; |
| OPERATOR_ASSISTED | &quot;OPERATOR_ASSISTED&quot; |
| CHARGEABLE_DIRECTORY_ASSISTED | &quot;CHARGEABLE_DIRECTORY_ASSISTED&quot; |
| SPECIAL_SERVICES_I | &quot;SPECIAL_SERVICES_I&quot; |
| SPECIAL_SERVICES_II | &quot;SPECIAL_SERVICES_II&quot; |
| PREMIUM_SERVICES_I | &quot;PREMIUM_SERVICES_I&quot; |
| PREMIUM_SERVICES_II | &quot;PREMIUM_SERVICES_II&quot; |
| NATIONAL | &quot;NATIONAL&quot; |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| ALLOW | &quot;ALLOW&quot; |
| BLOCK | &quot;BLOCK&quot; |
| AUTH_CODE | &quot;AUTH_CODE&quot; |
| TRANSFER_NUMBER_1 | &quot;TRANSFER_NUMBER_1&quot; |
| TRANSFER_NUMBER_2 | &quot;TRANSFER_NUMBER_2&quot; |
| TRANSFER_NUMBER_3 | &quot;TRANSFER_NUMBER_3&quot; |



