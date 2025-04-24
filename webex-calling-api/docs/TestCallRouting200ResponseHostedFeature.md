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



# TestCallRouting200ResponseHostedFeature

Returned when `destinationType` is `HOSTED_FEATURE`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Type of the service identified as call destination. |  |
|**name** | **String** | Name of the service identified as call destination. |  |
|**id** | **String** | Unique identifier of the service identified as call destination. |  |
|**locationName** | **String** | Name of the location with which the service is associated. |  |
|**locationId** | **String** | Unique identifier for the location of the service. |  |
|**phoneNumber** | **String** | Phone number of the service. |  [optional] |
|**extension** | **String** | Extension of the service. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AUTO_ATTENDANT | &quot;AUTO_ATTENDANT&quot; |
| BROADWORKS_ANYWHERE | &quot;BROADWORKS_ANYWHERE&quot; |
| CALL_QUEUE | &quot;CALL_QUEUE&quot; |
| CONTACT_CENTER_LINK | &quot;CONTACT_CENTER_LINK&quot; |
| GROUP_PAGING | &quot;GROUP_PAGING&quot; |
| HUNT_GROUP | &quot;HUNT_GROUP&quot; |
| VOICE_MESSAGING | &quot;VOICE_MESSAGING&quot; |
| VOICE_MAIL_GROUP | &quot;VOICE_MAIL_GROUP&quot; |
| AUTO_ATTENDANT2 | &quot;AUTO_ATTENDANT&quot; |



