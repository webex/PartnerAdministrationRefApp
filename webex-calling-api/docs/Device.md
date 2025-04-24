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


# Device


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier for the device. |  [optional] |
|**displayName** | **String** | A friendly name for the device. |  [optional] |
|**placeId** | **String** | The placeId field has been deprecated. Please use workspaceId instead. |  [optional] |
|**workspaceId** | **String** | The workspace associated with the device. |  [optional] |
|**personId** | **String** | The person associated with the device. |  [optional] |
|**orgId** | **String** | The organization associated with the device. |  [optional] |
|**capabilities** | **List&lt;Object&gt;** | The capabilities of the device. |  [optional] |
|**permissions** | **List&lt;Object&gt;** | The permissions the user has for this device. For example, &#x60;xapi&#x60; means this user is entitled to using the &#x60;xapi&#x60; against this device. |  [optional] |
|**connectionStatus** | [**DeviceConnectionStatus**](DeviceConnectionStatus.md) | The connection status of the device. |  [optional] |
|**product** | **String** | The product name. A display friendly version of the device&#39;s &#x60;model&#x60;. |  [optional] |
|**type** | **String** | The product type. |  [optional] |
|**tags** | **List&lt;Object&gt;** | Tags assigned to the device. |  [optional] |
|**ip** | **String** | The current IP address of the device. |  [optional] |
|**activeInterface** | [**NetworkConnectivityType**](NetworkConnectivityType.md) | The current network connectivty for the device. |  [optional] |
|**mac** | **String** | The unique address for the network adapter. |  [optional] |
|**primarySipUrl** | **String** | The primary SIP address to dial this device. |  [optional] |
|**sipUrls** | **List&lt;Object&gt;** | All SIP addresses to dial this device. |  [optional] |
|**serial** | **String** | Serial number for the device. |  [optional] |
|**software** | **String** | The operating system name data and version tag. |  [optional] |
|**upgradeChannel** | **String** | The upgrade channel the device is assigned to. |  [optional] |
|**created** | **String** | The date and time that the device was registered, in ISO8601 format. |  |
|**locationId** | **String** | The location associated with the device. |  [optional] |
|**workspaceLocationId** | **String** | The workspace location associated with the device. Deprecated, prefer &#x60;locationId&#x60;. |  [optional] |
|**errorCodes** | **List&lt;Object&gt;** | Error codes coming from the device. |  [optional] |
|**firstSeen** | **String** | Timestamp of the first time device sent a status post. |  [optional] |
|**lastSeen** | **String** | Timestamp of the last time device sent a status post. |  [optional] |
|**managedBy** | [**ManagedBy**](ManagedBy.md) | Entity managing the device configuration. |  [optional] |
|**devicePlatform** | [**DevicePlatform**](DevicePlatform.md) | The device platform. |  [optional] |



