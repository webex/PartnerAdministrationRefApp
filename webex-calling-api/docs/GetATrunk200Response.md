

# GetATrunk200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | A unique name for the trunk. |  |
|**customer** | [**GetATrunk200ResponseCustomer**](GetATrunk200ResponseCustomer.md) |  |  |
|**location** | [**ReadTheListOfTrunks200ResponseTrunksInnerLocation**](ReadTheListOfTrunks200ResponseTrunksInnerLocation.md) |  |  [optional] |
|**otgDtgId** | **String** | Unique Outgoing and Destination trunk group associated with the dial plan. |  [optional] |
|**linePort** | **String** | The Line/Port identifies a device endpoint in standalone mode or a SIP URI public identity in IMS mode. |  [optional] |
|**locationsUsingTrunk** | **List&lt;Object&gt;** | Locations using trunk. |  [optional] |
|**pilotUserId** | **String** | User ID. |  [optional] |
|**outboundProxy** | **Object** | Contains the body of the HTTP response received following the request to Console API and will not be set if the response has no body. |  [optional] |
|**sipAuthenticationUserName** | **String** | User&#39;s authentication service information. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Device status. |  |
|**errorCodes** | **List&lt;Object&gt;** | Error codes. |  [optional] |
|**responseStatus** | [**GetATrunk200ResponseResponseStatus**](GetATrunk200ResponseResponseStatus.md) |  |  [optional] |
|**dualIdentitySupportEnabled** | **Boolean** | Determines the behavior of the From and PAI headers on outbound calls. |  [optional] |
|**trunkType** | [**TrunkTypeEnum**](#TrunkTypeEnum) | Trunk Type associated with the trunk. |  |
|**deviceType** | **String** | Device type assosiated with trunk. |  [optional] |
|**address** | **String** | FQDN or SRV address. Required to create a static certificate-based trunk. |  [optional] |
|**domain** | **String** | Domain name. Required to create a static certificate based trunk. |  [optional] |
|**port** | **BigDecimal** | FQDN port. Required to create a static certificate-based trunk. |  |
|**maxConcurrentCalls** | **BigDecimal** | Max Concurrent call. Required to create a static certificate based trunk. |  [optional] |
|**isRestrictedToDedicatedInstance** | **Boolean** | Flag to indicate if the trunk is restricted to a dedicated instance. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ONLINE | &quot;ONLINE&quot; |
| OFFLINE | &quot;OFFLINE&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



## Enum: TrunkTypeEnum

| Name | Value |
|---- | -----|
| REGISTERING | &quot;REGISTERING&quot; |
| CERTIFICATE_BASED | &quot;CERTIFICATE_BASED&quot; |



