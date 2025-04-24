

# GetALocationSRedSkyComplianceStatus200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orgStatus** | [**OrgStatusEnum**](#OrgStatusEnum) | The RedSky account configuration status for the organization. |  |
|**complianceStatus** | [**ComplianceStatusEnum**](#ComplianceStatusEnum) | The RedSky account&#39;s compliance status. |  |
|**companyId** | **String** | The RedSky held token from the secret response. |  [optional] |
|**redSkyOrgId** | **String** | The RedSky organization ID for the organization which can be found in the RedSky portal. |  [optional] |
|**adminExists** | **Boolean** | &#x60;true&#x60; if an Admin has been created in RedSky. |  [optional] |
|**locationsStatus** | [**GetALocationSRedSkyComplianceStatus200ResponseLocationsStatus**](GetALocationSRedSkyComplianceStatus200ResponseLocationsStatus.md) |  |  [optional] |



## Enum: OrgStatusEnum

| Name | Value |
|---- | -----|
| INITIALISE | &quot;INITIALISE&quot; |
| ENABLED | &quot;ENABLED&quot; |
| OPTED_OUT | &quot;OPTED_OUT&quot; |
| INITIALISE2 | &quot;INITIALISE&quot; |



## Enum: ComplianceStatusEnum

| Name | Value |
|---- | -----|
| OPTED_OUT | &quot;OPTED_OUT&quot; |
| EXEMPTED | &quot;EXEMPTED&quot; |
| NON_COMPLIANT | &quot;NON_COMPLIANT&quot; |
| COMPLIANT | &quot;COMPLIANT&quot; |
| NON_COMPLIANT2 | &quot;NON_COMPLIANT&quot; |



