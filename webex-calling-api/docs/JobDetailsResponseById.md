

# JobDetailsResponseById


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Job name. |  |
|**id** | **String** | Unique identifier of the job. |  |
|**trackingId** | **String** | Unique identifier to track the flow of HTTP requests. |  |
|**sourceUserId** | **String** | Unique identifier to identify which user has run the job. |  |
|**sourceCustomerId** | **String** | Unique identifier to identify the customer who has run the job. |  |
|**targetCustomerId** | **String** | Unique identifier to identify the customer for which the job was run. |  |
|**instanceId** | **BigDecimal** | Unique identifier to identify the instance of the job. |  |
|**jobExecutionStatus** | **List&lt;Object&gt;** | Displays the most recent step&#39;s execution status. Contains execution statuses of all the steps involved in the execution of the job. |  [optional] |
|**latestExecutionStatus** | **String** | Indicates the most recent status (&#x60;STARTING&#x60;,&#x60;STARTED&#x60;,&#x60;COMPLETED&#x60;,&#x60;FAILED&#x60;) of the job at the time of invocation. |  |
|**latestExecutionExitCode** | [**LatestExecutionExitCodeEnum**](#LatestExecutionExitCodeEnum) | Most recent exit code of the job at the time of invocation. |  [optional] |
|**counts** | [**CountObject**](CountObject.md) |  |  |
|**csvFile** | **String** | Reference ID for the file that holds the errors and impacts. |  [optional] |
|**csvFileExpiryTime** | **String** | Date and time with seconds, the file expires in UTC format. |  [optional] |
|**fileFormat** | **String** | &#39;text/csv&#39;,  Format of the file generated. |  [optional] |
|**csvFileDownloadUrl** | **String** | URL to the CSV file containing errors and impacts. |  [optional] |



## Enum: LatestExecutionExitCodeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;UNKNOWN&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| STOPPED | &quot;STOPPED&quot; |
| COMPLETED_WITH_ERRORS | &quot;COMPLETED_WITH_ERRORS&quot; |



