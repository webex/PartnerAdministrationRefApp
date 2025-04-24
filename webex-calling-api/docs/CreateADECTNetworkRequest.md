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


# CreateADECTNetworkRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the DECT network. Min and max length supported for the DECT network name are 1 and 40 respectively. |  |
|**displayName** | **String** | Add a default name (11 characters max) to display for all handsets. If left blank, the default name will be an indexed number followed by the DECT network name. |  [optional] |
|**model** | [**ModelEnum**](#ModelEnum) | Select a device model type depending on the number of base stations and handset lines needed in the DECT network.  The corresponding device model display name sometimes called the product name, can also be used to specify the model. |  |
|**defaultAccessCodeEnabled** | **Boolean** | If set to true, need to provide a default access code that will be shared for all users in this network to pair their lines to the next available handset. Otherwise, each user will get a unique 4-digit access code that will be auto-generated. Note: There is currently no public API to retrieve the auto generated access codes for handsets. Use Control Hub instead. |  |
|**defaultAccessCode** | **String** | If &#x60;defaultAccessCodeEnabled&#x60; is set to true, then provide a default access code that needs to be a 4-numeric digit. The access code should be unique to the DECT network for the location. |  |



## Enum: ModelEnum

| Name | Value |
|---- | -----|
| DMS_CISCO_DBS110 | &quot;DMS Cisco DBS110&quot; |
| CISCO_DECT_110_BASE | &quot;Cisco DECT 110 Base&quot; |
| DMS_CISCO_DBS210 | &quot;DMS Cisco DBS210&quot; |
| CISCO_DECT_210_BASE | &quot;Cisco DECT 210 Base&quot; |



