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
# Copyright 2025 Cisco Systems Inc.
#
# Permission is hereby granted, free of charge, to any person obtaining a copy
# of this software and associated documentation files (the "Software"), to deal
# in the Software without restriction, including without limitation the rights
# to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
# copies of the Software, and to permit persons to whom the Software is
# furnished to do so, subject to the following conditions:
#
# The above copyright notice and this permission notice shall be included in
# all copies or substantial portions of the Software.
#
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
# THE SOFTWARE.



# ProvisionAWholesaleCustomerRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**provisioningId** | **String** | This Provisioning ID defines how this customer is to be provisioned for Webex Services.  Each Customer Template will have their own unique Provisioning ID. This ID will be displayed under the chosen Customer Template on [Webex Control Hub](https://admin.webex.com). |  |
|**packages** | **List&lt;Object&gt;** | The complete list of Webex Wholesale packages to be assigned to the customer. |  |
|**orgId** | **String** | The organization ID of the enterprise in Webex. Mandatory for existing customers. |  [optional] |
|**externalId** | **String** | External ID of the Wholesale customer. |  |
|**address** | [**ProvisionAWholesaleCustomerRequestAddress**](ProvisionAWholesaleCustomerRequestAddress.md) |  |  |
|**customerInfo** | [**ProvisionAWholesaleCustomerRequestCustomerInfo**](ProvisionAWholesaleCustomerRequestCustomerInfo.md) |  |  [optional] |
|**provisioningParameters** | [**ProvisionAWholesaleCustomerRequestProvisioningParameters**](ProvisionAWholesaleCustomerRequestProvisioningParameters.md) |  |  [optional] |
|**subPartnerAdminEmail** | **String** | The email of the sub partner organization admin. |  [optional] |



