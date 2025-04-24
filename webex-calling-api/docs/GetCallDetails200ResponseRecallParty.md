

# GetCallDetails200ResponseRecallParty

If the type is park, contains the details of where the call was parked. For example, if user A parks a call against user B and A is recalled for the park, then this field contains B's information in A's incoming call details. Only present when the type is park.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The party&#39;s name. Only present when the name is available and privacy is not enabled. |  [optional] |
|**number** | **String** | The party&#39;s number. Only present when the number is available and privacy is not enabled. The number can be digits or a URI. Some examples for number include: &#x60;1234&#x60;, &#x60;2223334444&#x60;, &#x60;+12223334444&#x60;, &#x60;*73&#x60;, &#x60;user@company.domain&#x60; |  [optional] |
|**personId** | **String** | The party&#39;s person ID. Only present when the person ID is available and privacy is not enabled. |  [optional] |
|**placeId** | **String** | The party&#39;s place ID. Only present when the place ID is available and privacy is not enabled. |  [optional] |
|**privacyEnabled** | **Boolean** | Indicates whether privacy is enabled for the name, number and personId/placeId. |  |
|**callType** | [**CallTypeEnum**](#CallTypeEnum) | The call type for the party. |  |



## Enum: CallTypeEnum

| Name | Value |
|---- | -----|
| LOCATION | &quot;location&quot; |
| ORGANIZATION | &quot;organization&quot; |
| EXTERNAL | &quot;external&quot; |
| EMERGENCY | &quot;emergency&quot; |
| REPAIR | &quot;repair&quot; |
| OTHER | &quot;other&quot; |



