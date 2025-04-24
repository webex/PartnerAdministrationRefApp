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


# CreateAVirtualLineRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstName** | **String** | First name defined for a virtual line. Minimum length is 1. Maximum length is 30. |  |
|**lastName** | **String** | Last name defined for a virtual line. Minimum length is 1. Maximum length is 30. |  |
|**displayName** | **String** | Display name defined for a virtual line. |  [optional] |
|**phoneNumber** | **String** | Phone number of a virtual line. Minimum length is 1. Maximum length is 23. Either &#x60;phoneNumber&#x60; or &#x60;extension&#x60; is mandatory. |  [optional] |
|**extension** | **String** | Extension of a virtual line. Minimum length is 2. Maximum length is 10. Either &#x60;phoneNumber&#x60; or &#x60;extension&#x60; is mandatory. |  [optional] |
|**locationId** | **String** | ID of location for virtual line. |  |
|**callerIdLastName** | **String** | Last name used in the Calling Line ID and for dial-by-name functions. Minimum length is 1. Maximum length is 30. |  [optional] |
|**callerIdFirstName** | **String** | First name used in the Calling Line ID and for dial-by-name functions. Minimum length is 1. Maximum length is 30. |  [optional] |
|**callerIdNumber** | **String** | Phone number to appear as the CLID for all calls. Minimum length is 1. Maximum length is 23. |  [optional] |



