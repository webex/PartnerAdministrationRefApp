

# GetLocationComplianceStatusResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orgStatus** | [**OrgStatusEnum**](OrgStatusEnum.md) | The RedSky account configuration status for the organization. |  |
|**complianceStatus** | [**ComplianceStatusResponseEnum**](ComplianceStatusResponseEnum.md) | The RedSky account&#39;s compliance status. |  |
|**companyId** | **String** | The RedSky held token from the secret response. |  [optional] |
|**redSkyOrgId** | **String** | The RedSky organization ID for the organization which can be found in the RedSky portal. |  [optional] |
|**adminExists** | **Boolean** | &#x60;true&#x60; if an Admin has been created in RedSky. |  [optional] |
|**locationsStatus** | [**ComplianceStatusLocationStatusObject**](ComplianceStatusLocationStatusObject.md) |  |  [optional] |



