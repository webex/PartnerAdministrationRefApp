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


# EventLongDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name for the event. |  |
|**startDate** | **String** | Start date of the event, or first occurrence if repeating, in the format of &#x60;YYYY-MM-DD&#x60;.  This field is required if the &#x60;allDayEnabled&#x60; field is present. |  |
|**endDate** | **String** | End date of the event, or first occurrence if repeating, in the format of &#x60;YYYY-MM-DD&#x60;.  This field is required if the &#x60;allDayEnabled&#x60; field is present. |  |
|**startTime** | **String** | Start time of the event in the format of &#x60;HH:MM&#x60; (24 hours format).  This field is required if the &#x60;allDayEnabled&#x60; field is false or omitted. |  |
|**endTime** | **String** | End time of the event in the format of &#x60;HH:MM&#x60; (24 hours format).  This field is required if the &#x60;allDayEnabled&#x60; field is false or omitted. |  |
|**allDayEnabled** | **Boolean** | True if it is all-day event. |  [optional] |
|**recurrence** | [**EventLongDetailsRecurrence**](EventLongDetailsRecurrence.md) |  |  [optional] |



