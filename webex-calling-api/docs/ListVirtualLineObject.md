

# ListVirtualLineObject


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
|**number** | [**ListVirtualLineObjectNumber**](ListVirtualLineObjectNumber.md) |  |  |
|**location** | [**ListVirtualLineObjectLocation**](ListVirtualLineObjectLocation.md) |  |  |
|**numberOfDevicesAssigned** | **BigDecimal** | Number of devices assigned to a virtual line. |  |
|**billingPlan** | **String** | Type of billing plan. |  [optional] |



## Enum: ExternalCallerIdNamePolicyEnum

| Name | Value |
|---- | -----|
| DIRECT_LINE | &quot;DIRECT_LINE&quot; |
| LOCATION | &quot;LOCATION&quot; |
| OTHER | &quot;OTHER&quot; |



