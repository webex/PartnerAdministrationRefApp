

# GetPagingGroupObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier for the paging group. |  |
|**enabled** | **Boolean** | Whether or not the paging group is enabled. |  |
|**name** | **String** | Unique name for the paging group. Minimum length is 1. Maximum length is 30. |  |
|**phoneNumber** | **String** | Paging group phone number. Minimum length is 1. Maximum length is 23. Either &#x60;phoneNumber&#x60; or &#x60;extension&#x60; is mandatory. |  [optional] |
|**extension** | **String** | Paging group extension. Minimum length is 2. Maximum length is 10. Either &#x60;phoneNumber&#x60; or &#x60;extension&#x60; is mandatory. |  [optional] |
|**tollFreeNumber** | **Boolean** | Flag to indicate toll free number. |  [optional] |
|**language** | **String** | Paging language. Minimum length is 1. Maximum length is 40. |  |
|**languageCode** | **String** | Language code. |  |
|**firstName** | **String** | First name that displays when a group page is performed. Minimum length is 1. Maximum length is 64. |  |
|**lastName** | **String** | Last name that displays when a group page is performed. Minimum length is 1. Maximum length is 64. |  |
|**originatorCallerIdEnabled** | **Boolean** | Determines what is shown on target users caller ID when a group page is performed. If true shows page originator ID. |  |
|**originators** | **List&lt;Object&gt;** | An array of people, workspaces and virtual lines ID&#39;s who may originate pages to this paging group. |  [optional] |
|**targets** | **List&lt;Object&gt;** | An array of people, workspaces and virtual lines ID&#39;s that are added to paging group as paging call targets. |  [optional] |



