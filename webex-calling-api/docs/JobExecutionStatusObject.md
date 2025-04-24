

# JobExecutionStatusObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **BigDecimal** | Unique identifier that identifies each instance of the job. |  |
|**startTime** | **String** | The date and time with seconds, the job has started in UTC format. |  [optional] |
|**endTime** | **String** | The date and time with seconds, the job has ended in UTC format. |  [optional] |
|**lastUpdated** | **String** | The date and time with seconds, the job has last updated in UTC format post one of the step execution completion. |  [optional] |
|**statusMessage** | **String** | Displays status for overall steps that are part of the job. |  [optional] |
|**exitCode** | **String** | Exit Code for a job. |  [optional] |
|**createdTime** | **String** | The date and time with seconds, the job has created in UTC format. |  [optional] |
|**timeElapsed** | **String** | Time lapsed in seconds since the job execution started. |  [optional] |
|**stepExecutionStatuses** | [**List&lt;StepExecutionStatusesObject&gt;**](StepExecutionStatusesObject.md) | Status of each step within a job. |  [optional] |



