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
import org.openapitools.client.model.ListBroadWorksEnterprises200ResponseBroadworksDirectorySync;

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
 * ListBroadWorksEnterprises200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class ListBroadWorksEnterprises200Response {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ORG_ID = "orgId";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  private String orgId;

  public static final String SERIALIZED_NAME_PROVISIONING_ID = "provisioningId";
  @SerializedName(SERIALIZED_NAME_PROVISIONING_ID)
  private String provisioningId;

  public static final String SERIALIZED_NAME_SP_ENTERPRISE_ID = "spEnterpriseId";
  @SerializedName(SERIALIZED_NAME_SP_ENTERPRISE_ID)
  private String spEnterpriseId;

  public static final String SERIALIZED_NAME_BROADWORKS_DIRECTORY_SYNC = "broadworksDirectorySync";
  @SerializedName(SERIALIZED_NAME_BROADWORKS_DIRECTORY_SYNC)
  private ListBroadWorksEnterprises200ResponseBroadworksDirectorySync broadworksDirectorySync;

  public ListBroadWorksEnterprises200Response() {
  }

  public ListBroadWorksEnterprises200Response id(String id) {
    this.id = id;
    return this;
  }

  /**
   * A unique Cisco identifier for the enterprise.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public ListBroadWorksEnterprises200Response orgId(String orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * The Organization ID of the enterprise on Webex.
   * @return orgId
   */
  @javax.annotation.Nullable
  public String getOrgId() {
    return orgId;
  }

  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }


  public ListBroadWorksEnterprises200Response provisioningId(String provisioningId) {
    this.provisioningId = provisioningId;
    return this;
  }

  /**
   * The Provisioning ID associated with the enterprise.
   * @return provisioningId
   */
  @javax.annotation.Nullable
  public String getProvisioningId() {
    return provisioningId;
  }

  public void setProvisioningId(String provisioningId) {
    this.provisioningId = provisioningId;
  }


  public ListBroadWorksEnterprises200Response spEnterpriseId(String spEnterpriseId) {
    this.spEnterpriseId = spEnterpriseId;
    return this;
  }

  /**
   * The Service Provider supplied unique identifier for the subscriber&#39;s enterprise.
   * @return spEnterpriseId
   */
  @javax.annotation.Nullable
  public String getSpEnterpriseId() {
    return spEnterpriseId;
  }

  public void setSpEnterpriseId(String spEnterpriseId) {
    this.spEnterpriseId = spEnterpriseId;
  }


  public ListBroadWorksEnterprises200Response broadworksDirectorySync(ListBroadWorksEnterprises200ResponseBroadworksDirectorySync broadworksDirectorySync) {
    this.broadworksDirectorySync = broadworksDirectorySync;
    return this;
  }

  /**
   * Get broadworksDirectorySync
   * @return broadworksDirectorySync
   */
  @javax.annotation.Nullable
  public ListBroadWorksEnterprises200ResponseBroadworksDirectorySync getBroadworksDirectorySync() {
    return broadworksDirectorySync;
  }

  public void setBroadworksDirectorySync(ListBroadWorksEnterprises200ResponseBroadworksDirectorySync broadworksDirectorySync) {
    this.broadworksDirectorySync = broadworksDirectorySync;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListBroadWorksEnterprises200Response listBroadWorksEnterprises200Response = (ListBroadWorksEnterprises200Response) o;
    return Objects.equals(this.id, listBroadWorksEnterprises200Response.id) &&
        Objects.equals(this.orgId, listBroadWorksEnterprises200Response.orgId) &&
        Objects.equals(this.provisioningId, listBroadWorksEnterprises200Response.provisioningId) &&
        Objects.equals(this.spEnterpriseId, listBroadWorksEnterprises200Response.spEnterpriseId) &&
        Objects.equals(this.broadworksDirectorySync, listBroadWorksEnterprises200Response.broadworksDirectorySync);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orgId, provisioningId, spEnterpriseId, broadworksDirectorySync);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListBroadWorksEnterprises200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    provisioningId: ").append(toIndentedString(provisioningId)).append("\n");
    sb.append("    spEnterpriseId: ").append(toIndentedString(spEnterpriseId)).append("\n");
    sb.append("    broadworksDirectorySync: ").append(toIndentedString(broadworksDirectorySync)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("orgId");
    openapiFields.add("provisioningId");
    openapiFields.add("spEnterpriseId");
    openapiFields.add("broadworksDirectorySync");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListBroadWorksEnterprises200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListBroadWorksEnterprises200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListBroadWorksEnterprises200Response is not found in the empty JSON string", ListBroadWorksEnterprises200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListBroadWorksEnterprises200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListBroadWorksEnterprises200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("orgId") != null && !jsonObj.get("orgId").isJsonNull()) && !jsonObj.get("orgId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orgId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orgId").toString()));
      }
      if ((jsonObj.get("provisioningId") != null && !jsonObj.get("provisioningId").isJsonNull()) && !jsonObj.get("provisioningId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `provisioningId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("provisioningId").toString()));
      }
      if ((jsonObj.get("spEnterpriseId") != null && !jsonObj.get("spEnterpriseId").isJsonNull()) && !jsonObj.get("spEnterpriseId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spEnterpriseId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spEnterpriseId").toString()));
      }
      // validate the optional field `broadworksDirectorySync`
      if (jsonObj.get("broadworksDirectorySync") != null && !jsonObj.get("broadworksDirectorySync").isJsonNull()) {
        ListBroadWorksEnterprises200ResponseBroadworksDirectorySync.validateJsonElement(jsonObj.get("broadworksDirectorySync"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListBroadWorksEnterprises200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListBroadWorksEnterprises200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListBroadWorksEnterprises200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListBroadWorksEnterprises200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ListBroadWorksEnterprises200Response>() {
           @Override
           public void write(JsonWriter out, ListBroadWorksEnterprises200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListBroadWorksEnterprises200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListBroadWorksEnterprises200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListBroadWorksEnterprises200Response
   * @throws IOException if the JSON string is invalid with respect to ListBroadWorksEnterprises200Response
   */
  public static ListBroadWorksEnterprises200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListBroadWorksEnterprises200Response.class);
  }

  /**
   * Convert an instance of ListBroadWorksEnterprises200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

