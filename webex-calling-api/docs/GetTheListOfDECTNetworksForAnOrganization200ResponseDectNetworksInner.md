

# GetTheListOfDECTNetworksForAnOrganization200ResponseDectNetworksInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for the DECT network. |  |
|**name** | **String** | Name of the DECT network. This should be unique across the location. |  |
|**displayName** | **String** | DECT network name displayed on the handset. |  [optional] |
|**chainId** | **BigDecimal** | Chain ID of the DECT network. |  |
|**model** | [**ModelEnum**](#ModelEnum) | Base station model deployed in the DECT network. |  |
|**defaultAccessCodeEnabled** | **Boolean** | Default access code is enabled. If true, the default access code is mandatory. If false, auto-generated access code is used. |  |
|**defaultAccessCode** | **String** | Default access code for the DECT network. The default access code should be unique within the same location to avoid the handset accidentally registering with base stations from different DECT networks in range. This is mandatory when &#x60;defaultAccessCodeEnabled&#x60; is true. |  |
|**numberOfBaseStations** | **BigDecimal** | Number of base stations in the DECT network. |  |
|**numberOfHandsetsAssigned** | **BigDecimal** | Number of handsets assigned to the DECT network. |  |
|**numberOfLines** | **BigDecimal** | Number of lines in the DECT network. |  |
|**location** | [**GetTheListOfDECTNetworksForAnOrganization200ResponseDectNetworksInnerLocation**](GetTheListOfDECTNetworksForAnOrganization200ResponseDectNetworksInnerLocation.md) |  |  |



## Enum: ModelEnum

| Name | Value |
|---- | -----|
| DBS210 | &quot;DMS Cisco DBS210&quot; |
| DBS110 | &quot;DMS Cisco DBS110&quot; |
| DBS2102 | &quot;DMS Cisco DBS210&quot; |



