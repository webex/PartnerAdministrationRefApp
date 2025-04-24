

# GetComplianceStatusResponseRedSkyClientLocation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for the location. |  |
|**name** | **String** | Name of the location. |  |
|**state** | [**GetComplianceStatusResponseLocationStateEnum**](GetComplianceStatusResponseLocationStateEnum.md) | Configuration stage that was last completed for the specified location. The order of precedence is &#x60;LOCATION_SETUP&#x60;, &#x60;ALERTS&#x60;, &#x60;NETWORK_ELEMENTS&#x60;, &#x60;ROUTING_ENABLE&#x60;. If at least one location is &#x60;LOCATION_SETUP&#x60;, then &#x60;locationState&#x60; will be set to &#x60;LOCATION_SETUP&#x60;. Otherwise, &#x60;locationState&#x60; will check for the next precedence option and at least one location should have that option. |  [optional] |



