

# GetSharedLineMemberItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for the member. |  |
|**firstName** | **String** | First name of person or workspace. |  |
|**lastName** | **String** | Last name of person or workspace. |  |
|**phoneNumber** | **String** | Phone number of a person or workspace. Currently, E.164 format is not supported. This will be supported in the future update. |  [optional] |
|**extension** | **String** | Phone extension of a person or workspace. |  [optional] |
|**routingPrefix** | **String** | Routing prefix of location. |  [optional] |
|**esn** | **String** | Routing prefix + extension of a person or workspace. |  [optional] |
|**port** | **BigDecimal** | Device port number assigned to a person or workspace. |  |
|**t38FaxCompressionEnabledBacktickTrueBacktick** | **Boolean** | T.38 Fax Compression setting. Valid only for ATA Devices. Overrides user level compression options. |  [optional] |
|**primaryOwner** | **String** | If &#x60;true&#x60; the person or the workspace is the owner of the device. Points to primary line/port of the device. |  |
|**lineType** | [**LineType**](LineType.md) | Indicates if the line is acting as a primary line or a shared line for this device. |  |
|**lineWeight** | **BigDecimal** | Number of lines that have been configured for the person on the device. |  |
|**hostIP** | **String** | Registration home IP for the line port. |  [optional] |
|**remoteIP** | **String** | Registration remote IP for the line port. |  [optional] |
|**hotlineEnabled** | **Boolean** | Configure this line to automatically call a predefined number whenever taken off-hook. Once enabled, the line can only make calls to the predefined number set in hotlineDestination. |  |
|**hotlineDestination** | **String** | Preconfigured number for the hotline. Required only if &#x60;hotlineEnabled&#x60; is set to &#x60;true&#x60;. |  |
|**allowCallDeclineEnabled** | **Boolean** | Set how a device behaves when a call is declined. When set to &#x60;true&#x60;, a call decline request is extended to all the endpoints on the device. When set to &#x60;false&#x60;, a call decline request is only declined at the current endpoint. |  |
|**lineLabel** | **String** | Device line label. |  [optional] |
|**memberType** | **UserType** |  |  |
|**location** | [**Location**](Location.md) |  |  [optional] |



