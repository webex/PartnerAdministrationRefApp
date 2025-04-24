

# GetADialPlan200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for the dial plan. |  |
|**name** | **String** | A unique name for the dial plan. |  |
|**routeId** | **String** | ID of route type associated with the dial plan. |  |
|**routeName** | **String** | Name of route type associated with the dial plan. |  |
|**routeType** | [**RouteTypeEnum**](#RouteTypeEnum) | Route Type associated with the dial plan. |  |
|**customer** | [**GetADialPlan200ResponseCustomer**](GetADialPlan200ResponseCustomer.md) |  |  |



## Enum: RouteTypeEnum

| Name | Value |
|---- | -----|
| ROUTE_GROUP | &quot;ROUTE_GROUP&quot; |
| TRUNK | &quot;TRUNK&quot; |



