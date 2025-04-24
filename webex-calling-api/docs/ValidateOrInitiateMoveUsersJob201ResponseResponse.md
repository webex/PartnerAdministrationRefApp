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



# ValidateOrInitiateMoveUsersJob201ResponseResponse

Contains the response for the user moves.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Job name. |  |
|**id** | **String** | Unique identifier of the job. |  |
|**trackingId** | **String** | Unique identifier to track the flow of HTTP requests. |  |
|**sourceUserId** | **String** | Unique identifier of the user who ran the job. |  |
|**sourceCustomerId** | **String** | Unique identifier of the customer who ran the job. |  |
|**targetCustomerId** | **String** | Unique identifier of the customer for whom the job was run. |  |
|**instanceId** | **BigDecimal** | Unique identifier of the job instance. |  |
|**jobExecutionStatus** | **List&lt;Object&gt;** | Most recent step&#39;s execution status, including statuses of all steps in the job execution. |  [optional] |
|**latestExecutionStatus** | [**LatestExecutionStatusEnum**](#LatestExecutionStatusEnum) | Most recent status of the job at the time of invocation. |  |
|**latestExecutionExitCode** | [**LatestExecutionExitCodeEnum**](#LatestExecutionExitCodeEnum) | Most recent exit code of the job at the time of invocation. |  [optional] |
|**counts** | [**ValidateOrInitiateMoveUsersJob201ResponseResponseCounts**](ValidateOrInitiateMoveUsersJob201ResponseResponseCounts.md) |  |  |



## Enum: LatestExecutionStatusEnum

| Name | Value |
|---- | -----|
| STARTING | &quot;STARTING&quot; |
| STARTED | &quot;STARTED&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |



## Enum: LatestExecutionExitCodeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;UNKNOWN&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| STOPPED | &quot;STOPPED&quot; |
| COMPLETED_WITH_ERRORS | &quot;COMPLETED_WITH_ERRORS&quot; |



