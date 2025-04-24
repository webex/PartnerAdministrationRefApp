

# ListAutoAttendantObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier for the auto attendant. |  |
|**name** | **String** | Unique name for the auto attendant. |  |
|**locationName** | **String** | Name of location for auto attendant. |  |
|**locationId** | **String** | ID of location for auto attendant. |  |
|**phoneNumber** | **String** | Auto attendant phone number.  Either &#x60;phoneNumber&#x60; or &#x60;extension&#x60; is mandatory. |  [optional] |
|**extension** | **String** | Auto attendant extension.  Either &#x60;phoneNumber&#x60; or &#x60;extension&#x60; is mandatory. |  [optional] |
|**routingPrefix** | **String** | Routing prefix of location. |  [optional] |
|**esn** | **String** | Routing prefix + extension of a person or workspace. |  [optional] |
|**tollFreeNumber** | **Boolean** | Flag to indicate if auto attendant number is toll-free number. |  |



