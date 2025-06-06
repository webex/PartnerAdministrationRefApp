// Copyright 2025 Cisco Systems Inc.
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.

/*
 * All Webex calling API
 * Webex calling API specifications
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatusErrorsInner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Directory sync status
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus {
  public static final String SERIALIZED_NAME_LAST_SYNC_START_TIME = "lastSyncStartTime";
  @SerializedName(SERIALIZED_NAME_LAST_SYNC_START_TIME)
  private String lastSyncStartTime;

  public static final String SERIALIZED_NAME_LAST_SYNC_END_TIME = "lastSyncEndTime";
  @SerializedName(SERIALIZED_NAME_LAST_SYNC_END_TIME)
  private String lastSyncEndTime;

  public static final String SERIALIZED_NAME_SYNC_STATUS = "syncStatus";
  @SerializedName(SERIALIZED_NAME_SYNC_STATUS)
  private String syncStatus;

  public static final String SERIALIZED_NAME_USERS_ADDED = "usersAdded";
  @SerializedName(SERIALIZED_NAME_USERS_ADDED)
  private BigDecimal usersAdded;

  public static final String SERIALIZED_NAME_USERS_UPDATED = "usersUpdated";
  @SerializedName(SERIALIZED_NAME_USERS_UPDATED)
  private BigDecimal usersUpdated;

  public static final String SERIALIZED_NAME_USERS_DELETED = "usersDeleted";
  @SerializedName(SERIALIZED_NAME_USERS_DELETED)
  private BigDecimal usersDeleted;

  public static final String SERIALIZED_NAME_MACHINES_ADDED = "machinesAdded";
  @SerializedName(SERIALIZED_NAME_MACHINES_ADDED)
  private BigDecimal machinesAdded;

  public static final String SERIALIZED_NAME_MACHINES_UPDATED = "machinesUpdated";
  @SerializedName(SERIALIZED_NAME_MACHINES_UPDATED)
  private BigDecimal machinesUpdated;

  public static final String SERIALIZED_NAME_MACHINES_DELETED = "machinesDeleted";
  @SerializedName(SERIALIZED_NAME_MACHINES_DELETED)
  private BigDecimal machinesDeleted;

  public static final String SERIALIZED_NAME_TOTAL_EXTERNAL_USERS_IN_C_I = "totalExternalUsersInCI";
  @SerializedName(SERIALIZED_NAME_TOTAL_EXTERNAL_USERS_IN_C_I)
  private BigDecimal totalExternalUsersInCI;

  public static final String SERIALIZED_NAME_TOTAL_EXTERNAL_MACHINES_IN_C_I = "totalExternalMachinesInCI";
  @SerializedName(SERIALIZED_NAME_TOTAL_EXTERNAL_MACHINES_IN_C_I)
  private BigDecimal totalExternalMachinesInCI;

  public static final String SERIALIZED_NAME_LAST_SUCCESSFUL_SYNC_TIME = "lastSuccessfulSyncTime";
  @SerializedName(SERIALIZED_NAME_LAST_SUCCESSFUL_SYNC_TIME)
  private String lastSuccessfulSyncTime;

  public static final String SERIALIZED_NAME_LAST_SYNC_TRACKING_ID = "lastSyncTrackingId";
  @SerializedName(SERIALIZED_NAME_LAST_SYNC_TRACKING_ID)
  private String lastSyncTrackingId;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatusErrorsInner> errors = new ArrayList<>();

  public static final String SERIALIZED_NAME_USER_CONTACTS_ADDED = "userContactsAdded";
  @SerializedName(SERIALIZED_NAME_USER_CONTACTS_ADDED)
  private BigDecimal userContactsAdded;

  public static final String SERIALIZED_NAME_USER_CONTACTS_UPDATED = "userContactsUpdated";
  @SerializedName(SERIALIZED_NAME_USER_CONTACTS_UPDATED)
  private BigDecimal userContactsUpdated;

  public static final String SERIALIZED_NAME_USER_CONTACTS_DELETED = "userContactsDeleted";
  @SerializedName(SERIALIZED_NAME_USER_CONTACTS_DELETED)
  private BigDecimal userContactsDeleted;

  public static final String SERIALIZED_NAME_ORG_CONTACTS_ADDED = "orgContactsAdded";
  @SerializedName(SERIALIZED_NAME_ORG_CONTACTS_ADDED)
  private BigDecimal orgContactsAdded;

  public static final String SERIALIZED_NAME_ORG_CONTACTS_UPDATED = "orgContactsUpdated";
  @SerializedName(SERIALIZED_NAME_ORG_CONTACTS_UPDATED)
  private BigDecimal orgContactsUpdated;

  public static final String SERIALIZED_NAME_ORG_CONTACTS_DELETED = "orgContactsDeleted";
  @SerializedName(SERIALIZED_NAME_ORG_CONTACTS_DELETED)
  private BigDecimal orgContactsDeleted;

  public static final String SERIALIZED_NAME_TOTAL_USER_CONTACTS_IN_CONTACT_SERVICE = "totalUserContactsInContactService";
  @SerializedName(SERIALIZED_NAME_TOTAL_USER_CONTACTS_IN_CONTACT_SERVICE)
  private BigDecimal totalUserContactsInContactService;

  public static final String SERIALIZED_NAME_TOTAL_ORG_CONTACTS_IN_CONTACT_SERVICE = "totalOrgContactsInContactService";
  @SerializedName(SERIALIZED_NAME_TOTAL_ORG_CONTACTS_IN_CONTACT_SERVICE)
  private BigDecimal totalOrgContactsInContactService;

  public ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus() {
  }

  public ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus lastSyncStartTime(String lastSyncStartTime) {
    this.lastSyncStartTime = lastSyncStartTime;
    return this;
  }

  /**
   * The start date and time of the last sync.
   * @return lastSyncStartTime
   */
  @javax.annotation.Nullable
  public String getLastSyncStartTime() {
    return lastSyncStartTime;
  }

  public void setLastSyncStartTime(String lastSyncStartTime) {
    this.lastSyncStartTime = lastSyncStartTime;
  }


  public ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus lastSyncEndTime(String lastSyncEndTime) {
    this.lastSyncEndTime = lastSyncEndTime;
    return this;
  }

  /**
   * The end date and time of the last sync.
   * @return lastSyncEndTime
   */
  @javax.annotation.Nullable
  public String getLastSyncEndTime() {
    return lastSyncEndTime;
  }

  public void setLastSyncEndTime(String lastSyncEndTime) {
    this.lastSyncEndTime = lastSyncEndTime;
  }


  public ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus syncStatus(String syncStatus) {
    this.syncStatus = syncStatus;
    return this;
  }

  /**
   * The sync status of the enterprise.
   * @return syncStatus
   */
  @javax.annotation.Nullable
  public String getSyncStatus() {
    return syncStatus;
  }

  public void setSyncStatus(String syncStatus) {
    this.syncStatus = syncStatus;
  }


  public ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus usersAdded(BigDecimal usersAdded) {
    this.usersAdded = usersAdded;
    return this;
  }

  /**
   * The number of users added to Common Identity (CI) in this sync.
   * @return usersAdded
   */
  @javax.annotation.Nullable
  public BigDecimal getUsersAdded() {
    return usersAdded;
  }

  public void setUsersAdded(BigDecimal usersAdded) {
    this.usersAdded = usersAdded;
  }


  public ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus usersUpdated(BigDecimal usersUpdated) {
    this.usersUpdated = usersUpdated;
    return this;
  }

  /**
   * The number of users updated in Common Identity (CI) in this sync.
   * @return usersUpdated
   */
  @javax.annotation.Nullable
  public BigDecimal getUsersUpdated() {
    return usersUpdated;
  }

  public void setUsersUpdated(BigDecimal usersUpdated) {
    this.usersUpdated = usersUpdated;
  }


  public ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus usersDeleted(BigDecimal usersDeleted) {
    this.usersDeleted = usersDeleted;
    return this;
  }

  /**
   * The number of users deleted from Common Identity (CI) in this sync.
   * @return usersDeleted
   */
  @javax.annotation.Nullable
  public BigDecimal getUsersDeleted() {
    return usersDeleted;
  }

  public void setUsersDeleted(BigDecimal usersDeleted) {
    this.usersDeleted = usersDeleted;
  }


  public ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus machinesAdded(BigDecimal machinesAdded) {
    this.machinesAdded = machinesAdded;
    return this;
  }

  /**
   * The number of machines added to Common Identity (CI) in this sync.
   * @return machinesAdded
   */
  @javax.annotation.Nullable
  public BigDecimal getMachinesAdded() {
    return machinesAdded;
  }

  public void setMachinesAdded(BigDecimal machinesAdded) {
    this.machinesAdded = machinesAdded;
  }


  public ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus machinesUpdated(BigDecimal machinesUpdated) {
    this.machinesUpdated = machinesUpdated;
    return this;
  }

  /**
   * The number of machines updated in Common Identity (CI) in this sync.
   * @return machinesUpdated
   */
  @javax.annotation.Nullable
  public BigDecimal getMachinesUpdated() {
    return machinesUpdated;
  }

  public void setMachinesUpdated(BigDecimal machinesUpdated) {
    this.machinesUpdated = machinesUpdated;
  }


  public ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus machinesDeleted(BigDecimal machinesDeleted) {
    this.machinesDeleted = machinesDeleted;
    return this;
  }

  /**
   * The number of machines deleted from Common Identity (CI) in this sync.
   * @return machinesDeleted
   */
  @javax.annotation.Nullable
  public BigDecimal getMachinesDeleted() {
    return machinesDeleted;
  }

  public void setMachinesDeleted(BigDecimal machinesDeleted) {
    this.machinesDeleted = machinesDeleted;
  }


  public ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus totalExternalUsersInCI(BigDecimal totalExternalUsersInCI) {
    this.totalExternalUsersInCI = totalExternalUsersInCI;
    return this;
  }

  /**
   * The number of total external users that have been added to CI across all syncs.
   * @return totalExternalUsersInCI
   */
  @javax.annotation.Nullable
  public BigDecimal getTotalExternalUsersInCI() {
    return totalExternalUsersInCI;
  }

  public void setTotalExternalUsersInCI(BigDecimal totalExternalUsersInCI) {
    this.totalExternalUsersInCI = totalExternalUsersInCI;
  }


  public ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus totalExternalMachinesInCI(BigDecimal totalExternalMachinesInCI) {
    this.totalExternalMachinesInCI = totalExternalMachinesInCI;
    return this;
  }

  /**
   * The number of total external machines that have been added to Common Identity (CI) across all syncs.
   * @return totalExternalMachinesInCI
   */
  @javax.annotation.Nullable
  public BigDecimal getTotalExternalMachinesInCI() {
    return totalExternalMachinesInCI;
  }

  public void setTotalExternalMachinesInCI(BigDecimal totalExternalMachinesInCI) {
    this.totalExternalMachinesInCI = totalExternalMachinesInCI;
  }


  public ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus lastSuccessfulSyncTime(String lastSuccessfulSyncTime) {
    this.lastSuccessfulSyncTime = lastSuccessfulSyncTime;
    return this;
  }

  /**
   * The date and time of the last successful sync.
   * @return lastSuccessfulSyncTime
   */
  @javax.annotation.Nullable
  public String getLastSuccessfulSyncTime() {
    return lastSuccessfulSyncTime;
  }

  public void setLastSuccessfulSyncTime(String lastSuccessfulSyncTime) {
    this.lastSuccessfulSyncTime = lastSuccessfulSyncTime;
  }


  public ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus lastSyncTrackingId(String lastSyncTrackingId) {
    this.lastSyncTrackingId = lastSyncTrackingId;
    return this;
  }

  /**
   * Unique tracking identifier.
   * @return lastSyncTrackingId
   */
  @javax.annotation.Nullable
  public String getLastSyncTrackingId() {
    return lastSyncTrackingId;
  }

  public void setLastSyncTrackingId(String lastSyncTrackingId) {
    this.lastSyncTrackingId = lastSyncTrackingId;
  }


  public ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus errors(List<ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatusErrorsInner> errors) {
    this.errors = errors;
    return this;
  }

  public ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus addErrorsItem(ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatusErrorsInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * List of errors that occurred during that last attempt to sync this BroadWorks enterprise. This list captures errors that occurred during *directory sync* of the BroadWorks enterprise, *after* the API has been accepted and 200 OK response returned. Any errors that occur during initial API request validation will be captured directly in error response with appropriate HTTP status code.
   * @return errors
   */
  @javax.annotation.Nullable
  public List<ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatusErrorsInner> getErrors() {
    return errors;
  }

  public void setErrors(List<ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatusErrorsInner> errors) {
    this.errors = errors;
  }


  public ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus userContactsAdded(BigDecimal userContactsAdded) {
    this.userContactsAdded = userContactsAdded;
    return this;
  }

  /**
   * The number of user contacts added to Contact service in this sync.
   * @return userContactsAdded
   */
  @javax.annotation.Nullable
  public BigDecimal getUserContactsAdded() {
    return userContactsAdded;
  }

  public void setUserContactsAdded(BigDecimal userContactsAdded) {
    this.userContactsAdded = userContactsAdded;
  }


  public ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus userContactsUpdated(BigDecimal userContactsUpdated) {
    this.userContactsUpdated = userContactsUpdated;
    return this;
  }

  /**
   * The number of user contacts updated in Contact service in this sync.
   * @return userContactsUpdated
   */
  @javax.annotation.Nullable
  public BigDecimal getUserContactsUpdated() {
    return userContactsUpdated;
  }

  public void setUserContactsUpdated(BigDecimal userContactsUpdated) {
    this.userContactsUpdated = userContactsUpdated;
  }


  public ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus userContactsDeleted(BigDecimal userContactsDeleted) {
    this.userContactsDeleted = userContactsDeleted;
    return this;
  }

  /**
   * The number of user contacts deleted from Contact service in this sync.
   * @return userContactsDeleted
   */
  @javax.annotation.Nullable
  public BigDecimal getUserContactsDeleted() {
    return userContactsDeleted;
  }

  public void setUserContactsDeleted(BigDecimal userContactsDeleted) {
    this.userContactsDeleted = userContactsDeleted;
  }


  public ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus orgContactsAdded(BigDecimal orgContactsAdded) {
    this.orgContactsAdded = orgContactsAdded;
    return this;
  }

  /**
   * The number of org contacts added to Contact service in this sync.
   * @return orgContactsAdded
   */
  @javax.annotation.Nullable
  public BigDecimal getOrgContactsAdded() {
    return orgContactsAdded;
  }

  public void setOrgContactsAdded(BigDecimal orgContactsAdded) {
    this.orgContactsAdded = orgContactsAdded;
  }


  public ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus orgContactsUpdated(BigDecimal orgContactsUpdated) {
    this.orgContactsUpdated = orgContactsUpdated;
    return this;
  }

  /**
   * The number of org contacts updated in Contact service in this sync.
   * @return orgContactsUpdated
   */
  @javax.annotation.Nullable
  public BigDecimal getOrgContactsUpdated() {
    return orgContactsUpdated;
  }

  public void setOrgContactsUpdated(BigDecimal orgContactsUpdated) {
    this.orgContactsUpdated = orgContactsUpdated;
  }


  public ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus orgContactsDeleted(BigDecimal orgContactsDeleted) {
    this.orgContactsDeleted = orgContactsDeleted;
    return this;
  }

  /**
   * The number of org contacts deleted from Contact service in this sync.
   * @return orgContactsDeleted
   */
  @javax.annotation.Nullable
  public BigDecimal getOrgContactsDeleted() {
    return orgContactsDeleted;
  }

  public void setOrgContactsDeleted(BigDecimal orgContactsDeleted) {
    this.orgContactsDeleted = orgContactsDeleted;
  }


  public ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus totalUserContactsInContactService(BigDecimal totalUserContactsInContactService) {
    this.totalUserContactsInContactService = totalUserContactsInContactService;
    return this;
  }

  /**
   * The total number of user contacts in Contact service.
   * @return totalUserContactsInContactService
   */
  @javax.annotation.Nullable
  public BigDecimal getTotalUserContactsInContactService() {
    return totalUserContactsInContactService;
  }

  public void setTotalUserContactsInContactService(BigDecimal totalUserContactsInContactService) {
    this.totalUserContactsInContactService = totalUserContactsInContactService;
  }


  public ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus totalOrgContactsInContactService(BigDecimal totalOrgContactsInContactService) {
    this.totalOrgContactsInContactService = totalOrgContactsInContactService;
    return this;
  }

  /**
   * The total number of org contacts in Contact service.
   * @return totalOrgContactsInContactService
   */
  @javax.annotation.Nullable
  public BigDecimal getTotalOrgContactsInContactService() {
    return totalOrgContactsInContactService;
  }

  public void setTotalOrgContactsInContactService(BigDecimal totalOrgContactsInContactService) {
    this.totalOrgContactsInContactService = totalOrgContactsInContactService;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus listBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus = (ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus) o;
    return Objects.equals(this.lastSyncStartTime, listBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus.lastSyncStartTime) &&
        Objects.equals(this.lastSyncEndTime, listBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus.lastSyncEndTime) &&
        Objects.equals(this.syncStatus, listBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus.syncStatus) &&
        Objects.equals(this.usersAdded, listBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus.usersAdded) &&
        Objects.equals(this.usersUpdated, listBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus.usersUpdated) &&
        Objects.equals(this.usersDeleted, listBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus.usersDeleted) &&
        Objects.equals(this.machinesAdded, listBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus.machinesAdded) &&
        Objects.equals(this.machinesUpdated, listBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus.machinesUpdated) &&
        Objects.equals(this.machinesDeleted, listBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus.machinesDeleted) &&
        Objects.equals(this.totalExternalUsersInCI, listBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus.totalExternalUsersInCI) &&
        Objects.equals(this.totalExternalMachinesInCI, listBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus.totalExternalMachinesInCI) &&
        Objects.equals(this.lastSuccessfulSyncTime, listBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus.lastSuccessfulSyncTime) &&
        Objects.equals(this.lastSyncTrackingId, listBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus.lastSyncTrackingId) &&
        Objects.equals(this.errors, listBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus.errors) &&
        Objects.equals(this.userContactsAdded, listBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus.userContactsAdded) &&
        Objects.equals(this.userContactsUpdated, listBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus.userContactsUpdated) &&
        Objects.equals(this.userContactsDeleted, listBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus.userContactsDeleted) &&
        Objects.equals(this.orgContactsAdded, listBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus.orgContactsAdded) &&
        Objects.equals(this.orgContactsUpdated, listBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus.orgContactsUpdated) &&
        Objects.equals(this.orgContactsDeleted, listBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus.orgContactsDeleted) &&
        Objects.equals(this.totalUserContactsInContactService, listBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus.totalUserContactsInContactService) &&
        Objects.equals(this.totalOrgContactsInContactService, listBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus.totalOrgContactsInContactService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastSyncStartTime, lastSyncEndTime, syncStatus, usersAdded, usersUpdated, usersDeleted, machinesAdded, machinesUpdated, machinesDeleted, totalExternalUsersInCI, totalExternalMachinesInCI, lastSuccessfulSyncTime, lastSyncTrackingId, errors, userContactsAdded, userContactsUpdated, userContactsDeleted, orgContactsAdded, orgContactsUpdated, orgContactsDeleted, totalUserContactsInContactService, totalOrgContactsInContactService);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus {\n");
    sb.append("    lastSyncStartTime: ").append(toIndentedString(lastSyncStartTime)).append("\n");
    sb.append("    lastSyncEndTime: ").append(toIndentedString(lastSyncEndTime)).append("\n");
    sb.append("    syncStatus: ").append(toIndentedString(syncStatus)).append("\n");
    sb.append("    usersAdded: ").append(toIndentedString(usersAdded)).append("\n");
    sb.append("    usersUpdated: ").append(toIndentedString(usersUpdated)).append("\n");
    sb.append("    usersDeleted: ").append(toIndentedString(usersDeleted)).append("\n");
    sb.append("    machinesAdded: ").append(toIndentedString(machinesAdded)).append("\n");
    sb.append("    machinesUpdated: ").append(toIndentedString(machinesUpdated)).append("\n");
    sb.append("    machinesDeleted: ").append(toIndentedString(machinesDeleted)).append("\n");
    sb.append("    totalExternalUsersInCI: ").append(toIndentedString(totalExternalUsersInCI)).append("\n");
    sb.append("    totalExternalMachinesInCI: ").append(toIndentedString(totalExternalMachinesInCI)).append("\n");
    sb.append("    lastSuccessfulSyncTime: ").append(toIndentedString(lastSuccessfulSyncTime)).append("\n");
    sb.append("    lastSyncTrackingId: ").append(toIndentedString(lastSyncTrackingId)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    userContactsAdded: ").append(toIndentedString(userContactsAdded)).append("\n");
    sb.append("    userContactsUpdated: ").append(toIndentedString(userContactsUpdated)).append("\n");
    sb.append("    userContactsDeleted: ").append(toIndentedString(userContactsDeleted)).append("\n");
    sb.append("    orgContactsAdded: ").append(toIndentedString(orgContactsAdded)).append("\n");
    sb.append("    orgContactsUpdated: ").append(toIndentedString(orgContactsUpdated)).append("\n");
    sb.append("    orgContactsDeleted: ").append(toIndentedString(orgContactsDeleted)).append("\n");
    sb.append("    totalUserContactsInContactService: ").append(toIndentedString(totalUserContactsInContactService)).append("\n");
    sb.append("    totalOrgContactsInContactService: ").append(toIndentedString(totalOrgContactsInContactService)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("lastSyncStartTime");
    openapiFields.add("lastSyncEndTime");
    openapiFields.add("syncStatus");
    openapiFields.add("usersAdded");
    openapiFields.add("usersUpdated");
    openapiFields.add("usersDeleted");
    openapiFields.add("machinesAdded");
    openapiFields.add("machinesUpdated");
    openapiFields.add("machinesDeleted");
    openapiFields.add("totalExternalUsersInCI");
    openapiFields.add("totalExternalMachinesInCI");
    openapiFields.add("lastSuccessfulSyncTime");
    openapiFields.add("lastSyncTrackingId");
    openapiFields.add("errors");
    openapiFields.add("userContactsAdded");
    openapiFields.add("userContactsUpdated");
    openapiFields.add("userContactsDeleted");
    openapiFields.add("orgContactsAdded");
    openapiFields.add("orgContactsUpdated");
    openapiFields.add("orgContactsDeleted");
    openapiFields.add("totalUserContactsInContactService");
    openapiFields.add("totalOrgContactsInContactService");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus is not found in the empty JSON string", ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("lastSyncStartTime") != null && !jsonObj.get("lastSyncStartTime").isJsonNull()) && !jsonObj.get("lastSyncStartTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastSyncStartTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastSyncStartTime").toString()));
      }
      if ((jsonObj.get("lastSyncEndTime") != null && !jsonObj.get("lastSyncEndTime").isJsonNull()) && !jsonObj.get("lastSyncEndTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastSyncEndTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastSyncEndTime").toString()));
      }
      if ((jsonObj.get("syncStatus") != null && !jsonObj.get("syncStatus").isJsonNull()) && !jsonObj.get("syncStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `syncStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("syncStatus").toString()));
      }
      if ((jsonObj.get("lastSuccessfulSyncTime") != null && !jsonObj.get("lastSuccessfulSyncTime").isJsonNull()) && !jsonObj.get("lastSuccessfulSyncTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastSuccessfulSyncTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastSuccessfulSyncTime").toString()));
      }
      if ((jsonObj.get("lastSyncTrackingId") != null && !jsonObj.get("lastSyncTrackingId").isJsonNull()) && !jsonObj.get("lastSyncTrackingId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastSyncTrackingId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastSyncTrackingId").toString()));
      }
      if (jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonNull()) {
        JsonArray jsonArrayerrors = jsonObj.getAsJsonArray("errors");
        if (jsonArrayerrors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("errors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
          }

          // validate the optional field `errors` (array)
          for (int i = 0; i < jsonArrayerrors.size(); i++) {
            ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatusErrorsInner.validateJsonElement(jsonArrayerrors.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus>() {
           @Override
           public void write(JsonWriter out, ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus
   * @throws IOException if the JSON string is invalid with respect to ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus
   */
  public static ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus.class);
  }

  /**
   * Convert an instance of ListBroadWorksEnterprises200ResponseBroadworksDirectorySyncDirectorySyncStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

