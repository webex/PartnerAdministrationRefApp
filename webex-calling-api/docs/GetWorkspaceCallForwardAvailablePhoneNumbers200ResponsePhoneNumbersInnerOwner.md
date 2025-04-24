

# GetWorkspaceCallForwardAvailablePhoneNumbers200ResponsePhoneNumbersInnerOwner

Owner details for the phone number.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the owner to which the PSTN Phone number is assigned. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the PSTN phone number&#39;s owner. |  |
|**firstName** | **String** | First name of the PSTN phone number&#39;s owner. This field will be present only when the owner &#x60;type&#x60; is &#x60;PEOPLE&#x60; or &#x60;VIRTUAL_LINE&#x60;. |  [optional] |
|**lastName** | **String** | Last name of the PSTN phone number&#39;s owner. This field will be present only when the owner &#x60;type&#x60; is &#x60;PEOPLE&#x60; or &#x60;VIRTUAL_LINE&#x60;. |  [optional] |
|**displayName** | **String** | Display name of the PSTN phone number&#39;s owner. This field will be present except when the owner &#x60;type&#x60; is &#x60;PEOPLE&#x60; or &#x60;VIRTUAL_LINE&#x60;. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PLACE | &quot;PLACE&quot; |
| PEOPLE | &quot;PEOPLE&quot; |
| VIRTUAL_LINE | &quot;VIRTUAL_LINE&quot; |
| AUTO_ATTENDANT | &quot;AUTO_ATTENDANT&quot; |
| CALL_QUEUE | &quot;CALL_QUEUE&quot; |
| GROUP_PAGING | &quot;GROUP_PAGING&quot; |
| HUNT_GROUP | &quot;HUNT_GROUP&quot; |
| VOICE_MESSAGING | &quot;VOICE_MESSAGING&quot; |
| OFFICE_ANYWHERE | &quot;OFFICE_ANYWHERE&quot; |
| CONTACT_CENTER_LINK | &quot;CONTACT_CENTER_LINK&quot; |
| CONTACT_CENTER_ADAPTER | &quot;CONTACT_CENTER_ADAPTER&quot; |
| ROUTE_LIST | &quot;ROUTE_LIST&quot; |
| VOICEMAIL_GROUP | &quot;VOICEMAIL_GROUP&quot; |
| COLLABORATE_BRIDGE | &quot;COLLABORATE_BRIDGE&quot; |
| PEOPLE2 | &quot;PEOPLE&quot; |



