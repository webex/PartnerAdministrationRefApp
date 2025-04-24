

# GetReportDetails200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for the report. |  [optional] |
|**title** | **String** | Name of the template to which this report belongs. |  [optional] |
|**service** | **String** | The service to which the report belongs. |  [optional] |
|**startDate** | **String** | The data in this report belongs to dates greater than or equal to this. |  [optional] |
|**endDate** | **String** | The data in this report belongs to dates smaller than or equal to this. |  [optional] |
|**siteList** | **String** | The site to which this report belongs to. This only exists if the report belongs to service &#x60;Webex&#x60;. |  [optional] |
|**created** | **String** | Time of creation for this report. |  [optional] |
|**createdBy** | **String** | The person who created the report. |  [optional] |
|**scheduledFrom** | **String** | Whether this report was scheduled from API or Control Hub. |  [optional] |
|**status** | **String** | Completion status of this report. |  [optional] |
|**downloadURL** | **String** | The link from which the report can be downloaded. |  [optional] |



