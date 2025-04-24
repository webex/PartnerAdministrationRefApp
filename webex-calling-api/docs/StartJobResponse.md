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
# Copyright 2025 Cisco Systems Inc.
#
# Permission is hereby granted, free of charge, to any person obtaining a copy
# of this software and associated documentation files (the "Software"), to deal
# in the Software without restriction, including without limitation the rights
# to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
# copies of the Software, and to permit persons to whom the Software is
# furnished to do so, subject to the following conditions:
#
# The above copyright notice and this permission notice shall be included in
# all copies or substantial portions of the Software.
#
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
# THE SOFTWARE.



# StartJobResponse


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
|**counts** | [**CountObject**](CountObject.md) |  |  |



## Enum: LatestExecutionExitCodeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;UNKNOWN&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| STOPPED | &quot;STOPPED&quot; |
| COMPLETED_WITH_ERRORS | &quot;COMPLETED_WITH_ERRORS&quot; |



