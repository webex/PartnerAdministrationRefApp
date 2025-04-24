

# IncomingPermissionSetting


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**useCustomEnabled** | **Boolean** | When true, indicates that this virtual line uses the specified calling permissions for receiving inbound calls rather than the organizational defaults. |  |
|**externalTransfer** | [**ExternalTransferEnum**](#ExternalTransferEnum) | Specifies the transfer behavior for incoming, external calls. |  |
|**internalCallsEnabled** | **Boolean** | Internal calls are allowed to be received. |  |
|**collectCallsEnabled** | **Boolean** | Collect calls are allowed to be received. |  |



## Enum: ExternalTransferEnum

| Name | Value |
|---- | -----|
| ALLOW_ALL_EXTERNAL | &quot;ALLOW_ALL_EXTERNAL&quot; |
| ALLOW_ONLY_TRANSFERRED_EXTERNAL | &quot;ALLOW_ONLY_TRANSFERRED_EXTERNAL&quot; |
| BLOCK_ALL_EXTERNAL | &quot;BLOCK_ALL_EXTERNAL&quot; |



