

# GetPhoneNumbersForAnOrganizationWithGivenCriterias200ResponseCount

Count of phone numbers categorized by type or their states, such as assigned or unassigned.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assigned** | **BigDecimal** | Count of phone numbers that are in the assigned state. |  [optional] |
|**unAssigned** | **BigDecimal** | Count of phone numbers which are in the un-assigned state. |  [optional] |
|**inActive** | **BigDecimal** | Count of phone numbers which are inactive. |  [optional] |
|**extensionOnly** | **BigDecimal** | Count of extensions only without phone number. |  [optional] |
|**tollFreeNumbers** | **BigDecimal** | Count of the toll free numbers. |  [optional] |
|**total** | **BigDecimal** | Total phone numbers and extensions available. |  [optional] |
|**mobileNumber** | **BigDecimal** | Count of phone numbers of type &#x60;MOBILE_NUMBER&#x60; only without &#x60;PSTN_NUMBER&#x60; and extension. |  [optional] |
|**serviceNumber** | **BigDecimal** | Count of phone numbers with &#x60;includedTelephonyTypes&#x60; as &#x60;PSTN_NUMBER&#x60; and &#x60;isServiceNumber&#x60; value as &#x60;true&#x60;. |  [optional] |



