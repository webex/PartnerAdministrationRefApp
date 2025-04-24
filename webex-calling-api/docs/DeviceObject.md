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


# DeviceObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for a device. |  |
|**description** | **List&lt;Object&gt;** | Comma separated array of tags used to describe device. |  [optional] |
|**model** | **String** | Identifier for device model. |  |
|**mac** | **String** | MAC address of device. |  [optional] |
|**primaryOwner** | **Boolean** | Indicates whether the person or the workspace is the owner of the device and points to a primary Line/Port of the device. |  |
|**type** | **LineType** |  |  |
|**owner** | [**DeviceOwner**](DeviceOwner.md) |  |  |
|**activationState** | **DeviceActivationStates** |  |  |
|**location** | [**DeviceObjectLocation**](DeviceObjectLocation.md) |  |  |



