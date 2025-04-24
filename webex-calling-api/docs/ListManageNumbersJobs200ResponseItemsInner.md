

# ListManageNumbersJobs200ResponseItemsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Job name. |  |
|**id** | **String** | Unique identifier of the job. |  |
|**jobType** | **String** | Job type. |  |
|**trackingId** | **String** | Unique identifier to track the flow of HTTP requests. |  |
|**sourceUserId** | **String** | Unique identifier to identify which user has run the job. |  |
|**sourceCustomerId** | **String** | Unique identifier to identify the customer who has run the job. |  |
|**targetCustomerId** | **String** | Unique identifier to identify the customer for which the job was run. |  |
|**instanceId** | **BigDecimal** | Unique identifier to identify the instance of the job. |  |
|**jobExecutionStatus** | **List&lt;Object&gt;** | Displays the most recent step&#39;s execution status. Contains execution statuses of all the steps involved in the execution of the job. |  [optional] |
|**latestExecutionStatus** | **String** | Indicates the most recent status (STARTING, STARTED, COMPLETED, FAILED) of the job at the time of invocation. |  |
|**latestExecutionExitCode** | [**LatestExecutionExitCodeEnum**](#LatestExecutionExitCodeEnum) | Most recent exit code of the job at the time of invocation. |  [optional] |
|**operationType** | **String** | Indicates operation type that was carried out. |  |
|**sourceLocationId** | **String** | Unique location identifier for which the job was run. |  |
|**targetLocationId** | **String** | Unique location identifier for which the numbers have been moved. |  |
|**counts** | [**ListManageNumbersJobs200ResponseItemsInnerCounts**](ListManageNumbersJobs200ResponseItemsInnerCounts.md) |  |  |



## Enum: LatestExecutionExitCodeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;UNKNOWN&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| STOPPED | &quot;STOPPED&quot; |
| COMPLETED_WITH_ERRORS | &quot;COMPLETED_WITH_ERRORS&quot; |



