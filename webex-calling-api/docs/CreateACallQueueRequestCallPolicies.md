<!--  Copyright 2025 Cisco Systems Inc.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.-->


# CreateACallQueueRequestCallPolicies

Policy controlling how calls are routed to `agents`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**routingType** | [**RoutingTypeEnum**](#RoutingTypeEnum) | Call routing type to use to dispatch calls to agents. The routing type should be &#x60;SKILL_BASED&#x60; if you want to assign skill level to &#x60;agents&#x60;. Only certain &#x60;policy&#x60; are allowed in &#x60;SKILL_BASED&#x60; type. |  |
|**policy** | [**PolicyEnum**](#PolicyEnum) | Call routing policy to use to dispatch calls to &#x60;agents&#x60;. |  |
|**callBounce** | [**CreateACallQueueRequestCallPoliciesCallBounce**](CreateACallQueueRequestCallPoliciesCallBounce.md) |  |  |
|**distinctiveRing** | [**CreateACallQueueRequestCallPoliciesDistinctiveRing**](CreateACallQueueRequestCallPoliciesDistinctiveRing.md) |  |  |



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
| CIRCULAR2 | &quot;CIRCULAR&quot; |



