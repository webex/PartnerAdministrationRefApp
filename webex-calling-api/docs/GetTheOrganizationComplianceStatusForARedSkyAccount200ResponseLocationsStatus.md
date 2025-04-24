

# GetTheOrganizationComplianceStatusForARedSkyAccount200ResponseLocationsStatus

Object that contains a list of locations, the `count` for the location list, and the `state` for the location that has completed the least amount of setup. Available if at least one location is exists.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**state** | [**StateEnum**](#StateEnum) | Configuration stage that was last completed. The order of precedence is &#x60;LOCATION_SETUP&#x60;, &#x60;ALERTS&#x60;, &#x60;NETWORK_ELEMENTS&#x60;, &#x60;ROUTING_ENABLE&#x60;. If at least one location is &#x60;LOCATION_SETUP&#x60;, then &#x60;locationState&#x60; will be set to &#x60;LOCATION_SETUP&#x60;. Otherwise, &#x60;locationState&#x60; will check for the next precedence option and at least one location should have that option. |  [optional] |
|**count** | **BigDecimal** | Total count of locations available in the organization. |  [optional] |
|**locations** | **List&lt;Object&gt;** | List of locations that have completed the least amount of setup. Only 4 locations are included in this list. |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| LOCATION_SETUP | &quot;LOCATION_SETUP&quot; |
| ALERTS | &quot;ALERTS&quot; |
| NETWORK_ELEMENTS | &quot;NETWORK_ELEMENTS&quot; |
| ROUTING_ENABLE | &quot;ROUTING_ENABLE&quot; |
| LOCATION_SETUP2 | &quot;LOCATION_SETUP&quot; |



