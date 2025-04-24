

# ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus

Directory sync status

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lastSyncStartTime** | **String** | The start date and time of the last sync. |  [optional] |
|**lastSyncEndTime** | **String** | The end date and time of the last sync. |  [optional] |
|**syncStatus** | **String** | The sync status of the enterprise. |  [optional] |
|**usersAdded** | **BigDecimal** | The number of users added to Common Identity (CI) in this sync. |  [optional] |
|**usersUpdated** | **BigDecimal** | The number of users updated in Common Identity (CI) in this sync. |  [optional] |
|**usersDeleted** | **BigDecimal** | The number of users deleted from Common Identity (CI) in this sync. |  [optional] |
|**machinesAdded** | **BigDecimal** | The number of machines added to Common Identity (CI) in this sync. |  [optional] |
|**machinesUpdated** | **BigDecimal** | The number of machines updated in Common Identity (CI) in this sync. |  [optional] |
|**machinesDeleted** | **BigDecimal** | The number of machines deleted from Common Identity (CI) in this sync. |  [optional] |
|**totalExternalUsersInCI** | **BigDecimal** | The number of total external users that have been added to CI across all syncs. |  [optional] |
|**totalExternalMachinesInCI** | **BigDecimal** | The number of total external machines that have been added to Common Identity (CI) across all syncs. |  [optional] |
|**lastSuccessfulSyncTime** | **String** | The date and time of the last successful sync. |  [optional] |
|**lastSyncTrackingId** | **String** | Unique tracking identifier. |  [optional] |
|**errors** | [**List&lt;ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatusErrorsInner&gt;**](ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatusErrorsInner.md) | List of errors that occurred during that last attempt to sync this BroadWorks enterprise. This list captures errors that occurred during *directory sync* of the BroadWorks enterprise, *after* the API has been accepted and 200 OK response returned. Any errors that occur during initial API request validation will be captured directly in error response with appropriate HTTP status code. |  [optional] |
|**userContactsAdded** | **BigDecimal** | The number of user contacts added to Contact service in this sync. |  [optional] |
|**userContactsUpdated** | **BigDecimal** | The number of user contacts updated in Contact service in this sync. |  [optional] |
|**userContactsDeleted** | **BigDecimal** | The number of user contacts deleted from Contact service in this sync. |  [optional] |
|**orgContactsAdded** | **BigDecimal** | The number of org contacts added to Contact service in this sync. |  [optional] |
|**orgContactsUpdated** | **BigDecimal** | The number of org contacts updated in Contact service in this sync. |  [optional] |
|**orgContactsDeleted** | **BigDecimal** | The number of org contacts deleted from Contact service in this sync. |  [optional] |
|**totalUserContactsInContactService** | **BigDecimal** | The total number of user contacts in Contact service. |  [optional] |
|**totalOrgContactsInContactService** | **BigDecimal** | The total number of org contacts in Contact service. |  [optional] |



