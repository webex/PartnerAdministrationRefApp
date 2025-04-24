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


# ConfigureCallerIDSettingsForAPersonRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**selected** | [**SelectedEnum**](#SelectedEnum) | Which type of outgoing Caller ID will be used. This setting is for the number portion. |  |
|**customNumber** | **String** | Custom number which will be shown if CUSTOM is selected. This value must be a number from the person&#39;s location or from another location with the same country, PSTN provider, and zone (only applicable for India locations) as the person&#39;s location. |  [optional] |
|**firstName** | **String** | Person&#39;s Caller ID first name.  Characters of &#x60;%&#x60;,  &#x60;+&#x60;, &#x60;&#x60;, &#x60;\&quot;&#x60; and Unicode characters are not allowed. |  [optional] |
|**lastName** | **String** | Person&#39;s Caller ID last name.  Characters of &#x60;%&#x60;,  &#x60;+&#x60;, &#x60;&#x60;, &#x60;\&quot;&#x60; and Unicode characters are not allowed. |  [optional] |
|**blockInForwardCallsEnabled** | **Boolean** | Block this person&#39;s identity when receiving a call. |  [optional] |
|**externalCallerIdNamePolicy** | [**ExternalCallerIdNamePolicyEnum**](#ExternalCallerIdNamePolicyEnum) | Designates which type of External Caller Id Name policy is used. Default is &#x60;DIRECT_LINE&#x60;. |  [optional] |
|**customExternalCallerIdName** | **String** | Custom external caller ID name which will be shown if external caller ID name policy is &#x60;OTHER&#x60;. |  [optional] |
|**additionalExternalCallerIdDirectLineEnabled** | **Boolean** | To set the person&#39;s direct line number as additional external caller ID. |  [optional] |
|**additionalExternalCallerIdLocationNumberEnabled** | **Boolean** | To set the Location main number as additional external caller ID for the person. |  [optional] |
|**additionalExternalCallerIdCustomNumber** | **String** | To set a custom number as additional external caller ID for the person. This value must be a number from the person&#39;s location or from another location with the same country, PSTN provider, and zone (only applicable for India locations) as the person&#39;s location. |  [optional] |



## Enum: SelectedEnum

| Name | Value |
|---- | -----|
| DIRECT_LINE | &quot;DIRECT_LINE&quot; |
| LOCATION_NUMBER | &quot;LOCATION_NUMBER&quot; |
| CUSTOM | &quot;CUSTOM&quot; |



## Enum: ExternalCallerIdNamePolicyEnum

| Name | Value |
|---- | -----|
| DIRECT_LINE | &quot;DIRECT_LINE&quot; |
| LOCATION | &quot;LOCATION&quot; |
| OTHER | &quot;OTHER&quot; |



