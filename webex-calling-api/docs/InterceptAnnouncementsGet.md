

# InterceptAnnouncementsGet


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**greeting** | [**GreetingEnum**](#GreetingEnum) | Indicates that a system default message will be placed when incoming calls are intercepted. |  |
|**filename** | **String** | Filename of the custom greeting; this is an empty string if no custom greeting has been uploaded. |  [optional] |
|**newNumber** | [**InterceptNumberGet**](InterceptNumberGet.md) |  |  |
|**zeroTransfer** | [**InterceptNumberGet**](InterceptNumberGet.md) |  |  |



## Enum: GreetingEnum

| Name | Value |
|---- | -----|
| CUSTOM | &quot;CUSTOM&quot; |
| DEFAULT | &quot;DEFAULT&quot; |



