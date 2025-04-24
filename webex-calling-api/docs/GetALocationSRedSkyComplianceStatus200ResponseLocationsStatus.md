

# GetALocationSRedSkyComplianceStatus200ResponseLocationsStatus

Object that contains the `state`, `id`, and `name` for the `locationId` in the request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**state** | [**StateEnum**](#StateEnum) | Configuration stage that was last completed for the location in the request. The order of precedence is &#x60;LOCATION_SETUP&#x60;, &#x60;ALERTS&#x60;, &#x60;NETWORK_ELEMENTS&#x60;, &#x60;ROUTING_ENABLE&#x60;. |  [optional] |
|**count** | **BigDecimal** | Total count of the &#x60;locations&#x60; list. |  [optional] |
|**locations** | **List&lt;Object&gt;** | Object that contains the &#x60;id&#x60; and the &#x60;name&#x60; for the location in the request. |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| OPTED_OUT | &quot;OPTED_OUT&quot; |
| EXEMPTED | &quot;EXEMPTED&quot; |
| LOCATION_SETUP | &quot;LOCATION_SETUP&quot; |
| ALERTS | &quot;ALERTS&quot; |
| NETWORK_ELEMENTS | &quot;NETWORK_ELEMENTS&quot; |
| ROUTING_ENABLE | &quot;ROUTING_ENABLE&quot; |
| COMPLIANT | &quot;COMPLIANT&quot; |
| LOCATION_SETUP2 | &quot;LOCATION_SETUP&quot; |



