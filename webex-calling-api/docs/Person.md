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



# Person


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier for the person. |  [optional] |
|**emails** | **List&lt;Object&gt;** | The email addresses of the person. |  [optional] |
|**phoneNumbers** | [**List&lt;PersonPhoneNumbersInner&gt;**](PersonPhoneNumbersInner.md) | Phone numbers for the person. |  [optional] |
|**extension** | **String** | The Webex Calling extension for the person. Only applies to a person with a Webex Calling license. |  [optional] |
|**locationId** | **String** | The ID of the location for this person retrieved from BroadCloud. |  [optional] |
|**displayName** | **String** | The full name of the person. |  [optional] |
|**nickName** | **String** | The nickname of the person if configured. If no nickname is configured for the person, this field will not be present. |  [optional] |
|**firstName** | **String** | The first name of the person. |  [optional] |
|**lastName** | **String** | The last name of the person. |  [optional] |
|**avatar** | **String** | The URL to the person&#39;s avatar in PNG format. |  [optional] |
|**orgId** | **String** | The ID of the organization to which this person belongs. |  [optional] |
|**roles** | **List&lt;Object&gt;** | An array of role strings representing the roles to which this admin user belongs. |  [optional] |
|**licenses** | **List&lt;Object&gt;** | An array of license strings allocated to this person. |  [optional] |
|**department** | **String** | The business department the user belongs to. |  [optional] |
|**manager** | **String** | A manager identifier. |  [optional] |
|**managerId** | **String** | Person ID of the manager. |  [optional] |
|**title** | **String** | The person&#39;s title. |  [optional] |
|**addresses** | [**List&lt;PersonAddressesInner&gt;**](PersonAddressesInner.md) | A person&#39;s addresses. |  [optional] |
|**created** | **String** | The date and time the person was created. |  [optional] |
|**lastModified** | **String** | The date and time the person was last changed. |  [optional] |
|**timezone** | **String** | The time zone of the person if configured. If no timezone is configured on the account, this field will not be present. |  [optional] |
|**lastActivity** | **String** | The date and time of the person&#39;s last activity within Webex. This will only be returned for people within your organization or an organization you manage. Presence information will not be shown if the authenticated user has [disabled status sharing](https://help.webex.com/nkzs6wl/). |  [optional] |
|**siteUrls** | **List&lt;Object&gt;** | One or several site names where this user has a role (host or attendee). |  [optional] |
|**sipAddresses** | [**List&lt;PersonSipAddressesInner&gt;**](PersonSipAddressesInner.md) | The user&#39;s SIP addresses. Read-only. |  [optional] |
|**xmppFederationJid** | **String** | Identifier for intra-domain federation with other XMPP based messenger systems. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The current presence status of the person. This will only be returned for people within your organization or an organization you manage. Presence information will not be shown if the authenticated user has [disabled status sharing](https://help.webex.com/nkzs6wl/). Presence status is different from Control Hub&#39;s \&quot;Last Service Access Time\&quot; which indicates the last time an oAuth token was issued for this user. |  [optional] |
|**invitePending** | [**InvitePendingEnum**](#InvitePendingEnum) | Whether or not an invite is pending for the user to complete account activation. This property is only returned if the authenticated user is an admin user for the person&#39;s organization. |  [optional] |
|**loginEnabled** | [**LoginEnabledEnum**](#LoginEnabledEnum) | Whether or not the user is allowed to use Webex. This property is only returned if the authenticated user is an admin user for the person&#39;s organization. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of person account, such as person or bot. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| CALL | &quot;call&quot; |
| DO_NOT_DISTURB | &quot;DoNotDisturb&quot; |
| INACTIVE | &quot;inactive&quot; |
| MEETING | &quot;meeting&quot; |
| OUT_OF_OFFICE | &quot;OutOfOffice&quot; |
| PENDING | &quot;pending&quot; |
| PRESENTING | &quot;presenting&quot; |
| UNKNOWN | &quot;unknown&quot; |



## Enum: InvitePendingEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: LoginEnabledEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PERSON | &quot;person&quot; |
| BOT | &quot;bot&quot; |
| APPUSER | &quot;appuser&quot; |



