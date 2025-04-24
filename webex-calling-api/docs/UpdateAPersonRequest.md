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



# UpdateAPersonRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**emails** | **List&lt;Object&gt;** | The email addresses of the person. Only one email address is allowed per person. |  [optional] |
|**phoneNumbers** | [**List&lt;CreateAPersonRequestPhoneNumbersInner&gt;**](CreateAPersonRequestPhoneNumbersInner.md) | Phone numbers for the person. Can only be set for Webex Calling. Needs a Webex Calling license. |  [optional] |
|**extension** | **String** | Webex Calling extension of the person. This is only settable for a person with a Webex Calling license. |  [optional] |
|**locationId** | **String** | The ID of the location for this person. |  [optional] |
|**displayName** | **String** | The full name of the person. |  |
|**firstName** | **String** | The first name of the person. |  [optional] |
|**lastName** | **String** | The last name of the person. |  [optional] |
|**nickName** | **String** | The nickname of the person if configured. This cannot be overwritten and instead will be set to the firstName automatically in update requests. |  [optional] |
|**avatar** | **String** | The URL to the person&#39;s avatar in PNG format. |  [optional] |
|**orgId** | **String** | The ID of the organization to which this person belongs. |  [optional] |
|**roles** | **List&lt;Object&gt;** | An array of role strings representing the roles to which this admin user belongs. |  [optional] |
|**licenses** | **List&lt;Object&gt;** | An array of license strings allocated to this person. |  [optional] |
|**department** | **String** | The business department the user belongs to. |  [optional] |
|**manager** | **String** | A manager identifier. |  [optional] |
|**managerId** | **String** | Person ID of the manager. |  [optional] |
|**title** | **String** | The person&#39;s title. |  [optional] |
|**addresses** | [**List&lt;CreateAPersonRequestAddressesInner&gt;**](CreateAPersonRequestAddressesInner.md) | A person&#39;s addresses. |  [optional] |
|**siteUrls** | **List&lt;Object&gt;** | One or several site names where this user has a role (host or attendee). Append &#x60;#attendee&#x60; to the site name to designate the attendee role on that site. |  [optional] |
|**loginEnabled** | **Boolean** | Whether or not the user is allowed to use Webex. This property is only accessible if the authenticated user is an admin user for the person&#39;s organization. |  [optional] |



