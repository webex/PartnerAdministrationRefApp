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


# CallForwardRulesObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique ID for the rule. |  |
|**name** | **String** | Unique name of rule. |  |
|**callsFrom** | **String** | Comma-separated list of incoming call numbers that, when matched, will not be forwarded. A Limit of 12 numbers is allowed. Use &#x60;Any private Number&#x60; in the comma-separated value to indicate rules that match incoming calls from a private number. Use &#x60;Any unavailable number&#x60; in the comma-separated value to match incoming calls from an unavailable number. |  [optional] |
|**callsTo** | **String** | Comma-separated list of the types of numbers being matched for incoming call destination. |  [optional] |
|**forwardTo** | **String** | Number to which calls will be forwarded if the rule is of type \&quot;Forward To\&quot; and the incoming call is matched. |  [optional] |
|**enabled** | **Boolean** | Reflects if rule is enabled. |  [optional] |



