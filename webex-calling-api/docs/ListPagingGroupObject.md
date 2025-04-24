

# ListPagingGroupObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier for the paging group. |  |
|**name** | **String** | Unique name for the paging group. Minimum length is 1. Maximum length is 30. |  |
|**phoneNumber** | **String** | Paging group phone number. Minimum length is 1. Maximum length is 23. Either &#x60;phoneNumber&#x60; or &#x60;extension&#x60; is mandatory. |  [optional] |
|**extension** | **String** | Paging group extension. Minimum length is 2. Maximum length is 10. Either &#x60;phoneNumber&#x60; or &#x60;extension&#x60; is mandatory. |  [optional] |
|**routingPrefix** | **String** | Routing prefix of location. |  [optional] |
|**esn** | **String** | Routing prefix + extension of a person or workspace. |  [optional] |
|**locationName** | **String** | Name of location for paging group. |  |
|**locationId** | **String** | Id of location for paging group. |  |
|**tollFreeNumber** | **Boolean** | Flag to indicate toll free number. |  |



