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
import java.util.Arrays;

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
 * WorkspaceResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class WorkspaceResponse {
  public static final String SERIALIZED_NAME_PROVISIONING_ID = "provisioningId";
  @SerializedName(SERIALIZED_NAME_PROVISIONING_ID)
  private String provisioningId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_SP_ENTERPRISE_ID = "spEnterpriseId";
  @SerializedName(SERIALIZED_NAME_SP_ENTERPRISE_ID)
  private String spEnterpriseId;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_PRIMARY_PHONE_NUMBER = "primaryPhoneNumber";
  @SerializedName(SERIALIZED_NAME_PRIMARY_PHONE_NUMBER)
  private String primaryPhoneNumber;

  public static final String SERIALIZED_NAME_EXTENSION = "extension";
  @SerializedName(SERIALIZED_NAME_EXTENSION)
  private String extension;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private String created;

  public WorkspaceResponse() {
  }

  public WorkspaceResponse provisioningId(String provisioningId) {
    this.provisioningId = provisioningId;
    return this;
  }

  /**
   * Provisioning ID that defines how this workspace is to be provisioned for Cisco Webex Services. Each Customer Template will have their own unique Provisioning ID. This ID will be displayed under the chosen Customer Template on Cisco Webex Control Hub.
   * @return provisioningId
   */
  @javax.annotation.Nullable
  public String getProvisioningId() {
    return provisioningId;
  }

  public void setProvisioningId(String provisioningId) {
    this.provisioningId = provisioningId;
  }


  public WorkspaceResponse userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The user ID of the workspace on BroadWorks.
   * @return userId
   */
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public WorkspaceResponse spEnterpriseId(String spEnterpriseId) {
    this.spEnterpriseId = spEnterpriseId;
    return this;
  }

  /**
   * The Service Provider supplied unique identifier for the workspace&#39;s enterprise.
   * @return spEnterpriseId
   */
  @javax.annotation.Nullable
  public String getSpEnterpriseId() {
    return spEnterpriseId;
  }

  public void setSpEnterpriseId(String spEnterpriseId) {
    this.spEnterpriseId = spEnterpriseId;
  }


  public WorkspaceResponse displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name of the workspace.
   * @return displayName
   */
  @javax.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public WorkspaceResponse primaryPhoneNumber(String primaryPhoneNumber) {
    this.primaryPhoneNumber = primaryPhoneNumber;
    return this;
  }

  /**
   * The primary phone number configured against the workspace on BroadWorks.
   * @return primaryPhoneNumber
   */
  @javax.annotation.Nullable
  public String getPrimaryPhoneNumber() {
    return primaryPhoneNumber;
  }

  public void setPrimaryPhoneNumber(String primaryPhoneNumber) {
    this.primaryPhoneNumber = primaryPhoneNumber;
  }


  public WorkspaceResponse extension(String extension) {
    this.extension = extension;
    return this;
  }

  /**
   * The extension number configured against the workspace on BroadWorks.
   * @return extension
   */
  @javax.annotation.Nullable
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }


  public WorkspaceResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * A unique Cisco identifier for the workspace.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public WorkspaceResponse created(String created) {
    this.created = created;
    return this;
  }

  /**
   * The date and time the workspace was provisioned.
   * @return created
   */
  @javax.annotation.Nullable
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceResponse workspaceResponse = (WorkspaceResponse) o;
    return Objects.equals(this.provisioningId, workspaceResponse.provisioningId) &&
        Objects.equals(this.userId, workspaceResponse.userId) &&
        Objects.equals(this.spEnterpriseId, workspaceResponse.spEnterpriseId) &&
        Objects.equals(this.displayName, workspaceResponse.displayName) &&
        Objects.equals(this.primaryPhoneNumber, workspaceResponse.primaryPhoneNumber) &&
        Objects.equals(this.extension, workspaceResponse.extension) &&
        Objects.equals(this.id, workspaceResponse.id) &&
        Objects.equals(this.created, workspaceResponse.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provisioningId, userId, spEnterpriseId, displayName, primaryPhoneNumber, extension, id, created);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceResponse {\n");
    sb.append("    provisioningId: ").append(toIndentedString(provisioningId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    spEnterpriseId: ").append(toIndentedString(spEnterpriseId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    primaryPhoneNumber: ").append(toIndentedString(primaryPhoneNumber)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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
    openapiFields.add("provisioningId");
    openapiFields.add("userId");
    openapiFields.add("spEnterpriseId");
    openapiFields.add("displayName");
    openapiFields.add("primaryPhoneNumber");
    openapiFields.add("extension");
    openapiFields.add("id");
    openapiFields.add("created");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WorkspaceResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkspaceResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkspaceResponse is not found in the empty JSON string", WorkspaceResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkspaceResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkspaceResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("provisioningId") != null && !jsonObj.get("provisioningId").isJsonNull()) && !jsonObj.get("provisioningId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `provisioningId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("provisioningId").toString()));
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if ((jsonObj.get("spEnterpriseId") != null && !jsonObj.get("spEnterpriseId").isJsonNull()) && !jsonObj.get("spEnterpriseId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spEnterpriseId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spEnterpriseId").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("primaryPhoneNumber") != null && !jsonObj.get("primaryPhoneNumber").isJsonNull()) && !jsonObj.get("primaryPhoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primaryPhoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primaryPhoneNumber").toString()));
      }
      if ((jsonObj.get("extension") != null && !jsonObj.get("extension").isJsonNull()) && !jsonObj.get("extension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extension").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("created") != null && !jsonObj.get("created").isJsonNull()) && !jsonObj.get("created").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkspaceResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkspaceResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkspaceResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkspaceResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkspaceResponse>() {
           @Override
           public void write(JsonWriter out, WorkspaceResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkspaceResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WorkspaceResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WorkspaceResponse
   * @throws IOException if the JSON string is invalid with respect to WorkspaceResponse
   */
  public static WorkspaceResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkspaceResponse.class);
  }

  /**
   * Convert an instance of WorkspaceResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

