

# GetListOfDevicesAssignedForAVirtualLine200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**devices** | **List&lt;Object&gt;** | List of devices assigned to a virtual line. |  [optional] |
|**availableEndpointType** | [**AvailableEndpointTypeEnum**](#AvailableEndpointTypeEnum) | Indicates to which line a device can be assigned. |  |
|**maxDeviceCount** | **BigDecimal** | Maximum number of devices a virtual line can be assigned to. |  |



## Enum: AvailableEndpointTypeEnum

| Name | Value |
|---- | -----|
| PRIMARY | &quot;PRIMARY&quot; |
| SHARED_CALL_APPEARANCE | &quot;SHARED_CALL_APPEARANCE&quot; |



