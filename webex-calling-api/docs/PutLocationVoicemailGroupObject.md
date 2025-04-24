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



# PutLocationVoicemailGroupObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Set the name of the voicemail group. |  [optional] |
|**phoneNumber** | **String** | Set voicemail group phone number. |  [optional] |
|**extension** | **BigDecimal** | Set unique voicemail group extension number. |  [optional] |
|**firstName** | **String** | Set the voicemail group caller ID first name. |  [optional] |
|**lastName** | **String** | Set the voicemail group called ID last name. |  [optional] |
|**enabled** | **Boolean** | Set to &#x60;true&#x60; to enable the voicemail group. |  [optional] |
|**passcode** | **BigDecimal** | Set passcode to access voicemail group when calling. |  [optional] |
|**languageCode** | **String** | Language code for the voicemail group audio announcement. |  [optional] |
|**greeting** | [**GreetingEnum**](#GreetingEnum) | Voicemail group greeting type. |  [optional] |
|**greetingDescription** | **String** | CUSTOM greeting for previously uploaded. |  [optional] |
|**messageStorage** | [**PutLocationVoicemailGroupObjectMessageStorage**](PutLocationVoicemailGroupObjectMessageStorage.md) |  |  [optional] |
|**notifications** | [**PutLocationVoicemailGroupObjectNotifications**](PutLocationVoicemailGroupObjectNotifications.md) |  |  [optional] |
|**faxMessage** | [**PutLocationVoicemailGroupObjectFaxMessage**](PutLocationVoicemailGroupObjectFaxMessage.md) |  |  [optional] |
|**transferToNumber** | [**PutLocationVoicemailGroupObjectTransferToNumber**](PutLocationVoicemailGroupObjectTransferToNumber.md) |  |  [optional] |
|**emailCopyOfMessage** | [**PutLocationVoicemailGroupObjectEmailCopyOfMessage**](PutLocationVoicemailGroupObjectEmailCopyOfMessage.md) |  |  [optional] |



## Enum: GreetingEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;DEFAULT&quot; |
| CUSTOM | &quot;CUSTOM&quot; |



