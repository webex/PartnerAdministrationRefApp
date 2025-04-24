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



# RetrieveSequentialRingSettingsForAWorkspace200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** | When set to &#x60;true&#x60; sequential ring is enabled. |  |
|**ringBaseLocationFirstEnabled** | **Boolean** | When set to &#x60;true&#x60;, the webex calling primary line will ring first. |  |
|**baseLocationNumberOfRings** | **String** | The number of times the primary line will ring. |  |
|**continueIfBaseLocationIsBusyEnabled** | **Boolean** | When set to &#x60;true&#x60; and the primary line is busy, the system redirects calls to the numbers configured for sequential ringing. |  |
|**callsToVoicemailEnabled** | **Boolean** | When set to &#x60;true&#x60; calls are directed to voicemail. |  |
|**phoneNumbers** | [**List&lt;RetrieveSequentialRingSettingsForAWorkspace200ResponsePhoneNumbersInner&gt;**](RetrieveSequentialRingSettingsForAWorkspace200ResponsePhoneNumbersInner.md) | A list of up to five phone numbers to which calls will be directed. |  |
|**criteria** | [**List&lt;RetrieveSequentialRingSettingsForAWorkspace200ResponseCriteriaInner&gt;**](RetrieveSequentialRingSettingsForAWorkspace200ResponseCriteriaInner.md) | A list of criteria specifying conditions when sequential ringing is in effect. |  |



