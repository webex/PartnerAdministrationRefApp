

# GetRecordingDetails200ResponseTemporaryDirectDownloadLinks

The download links for MP3, audio of the recording without HTML page rendering in browser or HTTP redirect. This attribute is not available if the user is not a [Compliance Officer](/docs/compliance#compliance) and **Prevent Downloading** has been turned on for the recording being requested. The Prevent Downloading option can be viewed and set on page when editing a recording. Note that there are various products in [Webex Suite](https://www.cisco.com/c/en/us/products/conferencing/product_comparison.html) such as \"Webex Meetings\", \"Webex Training\" and \"Webex Events\".

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**audioDownloadLink** | **String** | The download link for recording audio file without HTML page rendering in browser or HTTP redirect.  Expires 3 hours after the API request. |  [optional] |
|**transcriptDownloadLink** | **String** | The download link for recording transcript file without HTML page rendering in browser or HTTP redirect.  Expires 3 hours after the API request. |  [optional] |
|**expiration** | **String** | The date and time when &#x60;recordingDownloadLink&#x60;, &#x60;audioDownloadLink&#x60;, and &#x60;transcriptDownloadLink&#x60; expire in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) compliant format. |  [optional] |



