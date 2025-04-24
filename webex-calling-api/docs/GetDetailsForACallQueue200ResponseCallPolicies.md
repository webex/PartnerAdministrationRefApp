

# GetDetailsForACallQueue200ResponseCallPolicies

Policy controlling how calls are routed to `agents`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**routingType** | [**RoutingTypeEnum**](#RoutingTypeEnum) | Call routing type to use to dispatch calls to agents. |  |
|**policy** | [**PolicyEnum**](#PolicyEnum) | Call routing policy to use to dispatch calls to agents. |  |
|**callBounce** | [**GetDetailsForACallQueue200ResponseCallPoliciesCallBounce**](GetDetailsForACallQueue200ResponseCallPoliciesCallBounce.md) |  |  |
|**distinctiveRing** | [**GetDetailsForACallQueue200ResponseCallPoliciesDistinctiveRing**](GetDetailsForACallQueue200ResponseCallPoliciesDistinctiveRing.md) |  |  |



## Enum: RoutingTypeEnum

| Name | Value |
|---- | -----|
| PRIORITY_BASED | &quot;PRIORITY_BASED&quot; |
| SKILL_BASED | &quot;SKILL_BASED&quot; |
| PRIORITY_BASED2 | &quot;PRIORITY_BASED&quot; |



## Enum: PolicyEnum

| Name | Value |
|---- | -----|
| CIRCULAR | &quot;CIRCULAR&quot; |
| REGULAR | &quot;REGULAR&quot; |
| SIMULTANEOUS | &quot;SIMULTANEOUS&quot; |
| UNIFORM | &quot;UNIFORM&quot; |
| WEIGHTED | &quot;WEIGHTED&quot; |
| UNIFORM2 | &quot;UNIFORM&quot; |



