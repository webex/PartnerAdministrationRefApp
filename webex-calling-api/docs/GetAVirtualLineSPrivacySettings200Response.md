

# GetAVirtualLineSPrivacySettings200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**aaExtensionDialingEnabled** | **Boolean** | When &#x60;true&#x60; auto attendant extension dialing will be enabled. |  [optional] |
|**aaNamingDialingEnabled** | **Boolean** | When &#x60;true&#x60; auto attendant dialing by first or last name will be enabled. |  [optional] |
|**enablePhoneStatusDirectoryPrivacy** | **Boolean** | When &#x60;true&#x60; phone status directory privacy will be enabled. |  [optional] |
|**enablePhoneStatusPickupBargeInPrivacy** | **Boolean** | When &#x60;true&#x60; privacy is enforced for call pickup and barge-in. Only members specified by &#x60;monitoringAgents&#x60; can pickup or barge-in on the call. |  [optional] |
|**monitoringAgents** | [**List&lt;GetAPersonSPrivacySettings200ResponseMonitoringAgentsInner&gt;**](GetAPersonSPrivacySettings200ResponseMonitoringAgentsInner.md) | List of people that are being monitored. |  [optional] |



