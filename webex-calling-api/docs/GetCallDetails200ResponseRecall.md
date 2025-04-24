

# GetCallDetails200ResponseRecall

The recall details for the incoming call. Only present when the incoming call is for a recall.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of recall the incoming call is for. Park is the only type of recall currently supported but additional values may be added in the future. |  |
|**party** | [**GetCallDetails200ResponseRecallParty**](GetCallDetails200ResponseRecallParty.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PARK | &quot;park&quot; |



