

# GetDetailsForACallPark200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier for the call park. |  |
|**name** | **String** | Unique name for the call park. The maximum length is 80. |  |
|**recall** | [**GetDetailsForACallPark200ResponseRecall**](GetDetailsForACallPark200ResponseRecall.md) |  |  |
|**agents** | **List&lt;Object&gt;** | People, workspaces and virtual lines that are eligible to receive calls. |  [optional] |
|**parkOnAgentsEnabled** | **Boolean** | Whether or not the calls will be parked on agents as a destination. |  |
|**callParkExtensions** | **List&lt;Object&gt;** | Array of call park extensions assigned to a call park. |  [optional] |



