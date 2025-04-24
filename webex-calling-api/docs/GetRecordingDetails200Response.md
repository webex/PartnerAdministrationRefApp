

# GetRecordingDetails200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier for recording. |  |
|**topic** | **String** | The recording&#39;s topic. |  |
|**createTime** | **String** | The date and time recording was created in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) compliant format. Please note that it&#39;s not the time the record button was clicked in meeting but the time the recording file was generated offline. |  |
|**timeRecorded** | **String** | The date and time recording started in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) compliant format. It indicates when the record button was clicked in the meeting. |  |
|**format** | [**FormatEnum**](#FormatEnum) |  |  |
|**serviceType** | [**ServiceTypeEnum**](#ServiceTypeEnum) |  |  |
|**durationSeconds** | **BigDecimal** | The duration of the recording in seconds. |  |
|**sizeBytes** | **BigDecimal** | The size of the recording file in bytes. |  |
|**temporaryDirectDownloadLinks** | [**GetRecordingDetails200ResponseTemporaryDirectDownloadLinks**](GetRecordingDetails200ResponseTemporaryDirectDownloadLinks.md) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**ownerId** | **String** | Webex UUID for recording owner/host. |  |
|**ownerEmail** | **String** | Webex email for recording owner/host. |  |
|**ownerType** | [**OwnerTypeEnum**](#OwnerTypeEnum) |  |  |
|**storageRegion** | **String** | Storage location for recording within Webex datacenters. |  |
|**serviceData** | [**ListRecordingsForComplianceOfficer200ResponseItemsInnerServiceData**](ListRecordingsForComplianceOfficer200ResponseItemsInnerServiceData.md) |  |  |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| MP3 | &quot;MP3&quot; |



## Enum: ServiceTypeEnum

| Name | Value |
|---- | -----|
| CALLING | &quot;calling&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;available&quot; |
| DELETED | &quot;deleted&quot; |



## Enum: OwnerTypeEnum

| Name | Value |
|---- | -----|
| USER | &quot;user&quot; |
| PLACE | &quot;place&quot; |
| VIRTUAL_LINE | &quot;virtualLine&quot; |



