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
import org.openapitools.client.model.ComplianceStatusLocationStatusObject;
import org.openapitools.client.model.ComplianceStatusResponseEnum;
import org.openapitools.client.model.OrgStatusEnum;

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
 * GetLocationComplianceStatusResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class GetLocationComplianceStatusResponse {
  public static final String SERIALIZED_NAME_ORG_STATUS = "orgStatus";
  @SerializedName(SERIALIZED_NAME_ORG_STATUS)
  private OrgStatusEnum orgStatus;

  public static final String SERIALIZED_NAME_COMPLIANCE_STATUS = "complianceStatus";
  @SerializedName(SERIALIZED_NAME_COMPLIANCE_STATUS)
  private ComplianceStatusResponseEnum complianceStatus;

  public static final String SERIALIZED_NAME_COMPANY_ID = "companyId";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private String companyId;

  public static final String SERIALIZED_NAME_RED_SKY_ORG_ID = "redSkyOrgId";
  @SerializedName(SERIALIZED_NAME_RED_SKY_ORG_ID)
  private String redSkyOrgId;

  public static final String SERIALIZED_NAME_ADMIN_EXISTS = "adminExists";
  @SerializedName(SERIALIZED_NAME_ADMIN_EXISTS)
  private Boolean adminExists;

  public static final String SERIALIZED_NAME_LOCATIONS_STATUS = "locationsStatus";
  @SerializedName(SERIALIZED_NAME_LOCATIONS_STATUS)
  private ComplianceStatusLocationStatusObject locationsStatus;

  public GetLocationComplianceStatusResponse() {
  }

  public GetLocationComplianceStatusResponse orgStatus(OrgStatusEnum orgStatus) {
    this.orgStatus = orgStatus;
    return this;
  }

  /**
   * The RedSky account configuration status for the organization.
   * @return orgStatus
   */
  @javax.annotation.Nonnull
  public OrgStatusEnum getOrgStatus() {
    return orgStatus;
  }

  public void setOrgStatus(OrgStatusEnum orgStatus) {
    this.orgStatus = orgStatus;
  }


  public GetLocationComplianceStatusResponse complianceStatus(ComplianceStatusResponseEnum complianceStatus) {
    this.complianceStatus = complianceStatus;
    return this;
  }

  /**
   * The RedSky account&#39;s compliance status.
   * @return complianceStatus
   */
  @javax.annotation.Nonnull
  public ComplianceStatusResponseEnum getComplianceStatus() {
    return complianceStatus;
  }

  public void setComplianceStatus(ComplianceStatusResponseEnum complianceStatus) {
    this.complianceStatus = complianceStatus;
  }


  public GetLocationComplianceStatusResponse companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * The RedSky held token from the secret response.
   * @return companyId
   */
  @javax.annotation.Nullable
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }


  public GetLocationComplianceStatusResponse redSkyOrgId(String redSkyOrgId) {
    this.redSkyOrgId = redSkyOrgId;
    return this;
  }

  /**
   * The RedSky organization ID for the organization which can be found in the RedSky portal.
   * @return redSkyOrgId
   */
  @javax.annotation.Nullable
  public String getRedSkyOrgId() {
    return redSkyOrgId;
  }

  public void setRedSkyOrgId(String redSkyOrgId) {
    this.redSkyOrgId = redSkyOrgId;
  }


  public GetLocationComplianceStatusResponse adminExists(Boolean adminExists) {
    this.adminExists = adminExists;
    return this;
  }

  /**
   * &#x60;true&#x60; if an Admin has been created in RedSky.
   * @return adminExists
   */
  @javax.annotation.Nullable
  public Boolean getAdminExists() {
    return adminExists;
  }

  public void setAdminExists(Boolean adminExists) {
    this.adminExists = adminExists;
  }


  public GetLocationComplianceStatusResponse locationsStatus(ComplianceStatusLocationStatusObject locationsStatus) {
    this.locationsStatus = locationsStatus;
    return this;
  }

  /**
   * Get locationsStatus
   * @return locationsStatus
   */
  @javax.annotation.Nullable
  public ComplianceStatusLocationStatusObject getLocationsStatus() {
    return locationsStatus;
  }

  public void setLocationsStatus(ComplianceStatusLocationStatusObject locationsStatus) {
    this.locationsStatus = locationsStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLocationComplianceStatusResponse getLocationComplianceStatusResponse = (GetLocationComplianceStatusResponse) o;
    return Objects.equals(this.orgStatus, getLocationComplianceStatusResponse.orgStatus) &&
        Objects.equals(this.complianceStatus, getLocationComplianceStatusResponse.complianceStatus) &&
        Objects.equals(this.companyId, getLocationComplianceStatusResponse.companyId) &&
        Objects.equals(this.redSkyOrgId, getLocationComplianceStatusResponse.redSkyOrgId) &&
        Objects.equals(this.adminExists, getLocationComplianceStatusResponse.adminExists) &&
        Objects.equals(this.locationsStatus, getLocationComplianceStatusResponse.locationsStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgStatus, complianceStatus, companyId, redSkyOrgId, adminExists, locationsStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLocationComplianceStatusResponse {\n");
    sb.append("    orgStatus: ").append(toIndentedString(orgStatus)).append("\n");
    sb.append("    complianceStatus: ").append(toIndentedString(complianceStatus)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    redSkyOrgId: ").append(toIndentedString(redSkyOrgId)).append("\n");
    sb.append("    adminExists: ").append(toIndentedString(adminExists)).append("\n");
    sb.append("    locationsStatus: ").append(toIndentedString(locationsStatus)).append("\n");
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
    openapiFields.add("orgStatus");
    openapiFields.add("complianceStatus");
    openapiFields.add("companyId");
    openapiFields.add("redSkyOrgId");
    openapiFields.add("adminExists");
    openapiFields.add("locationsStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("orgStatus");
    openapiRequiredFields.add("complianceStatus");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetLocationComplianceStatusResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetLocationComplianceStatusResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetLocationComplianceStatusResponse is not found in the empty JSON string", GetLocationComplianceStatusResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetLocationComplianceStatusResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetLocationComplianceStatusResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetLocationComplianceStatusResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `orgStatus`
      OrgStatusEnum.validateJsonElement(jsonObj.get("orgStatus"));
      // validate the required field `complianceStatus`
      ComplianceStatusResponseEnum.validateJsonElement(jsonObj.get("complianceStatus"));
      if ((jsonObj.get("companyId") != null && !jsonObj.get("companyId").isJsonNull()) && !jsonObj.get("companyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyId").toString()));
      }
      if ((jsonObj.get("redSkyOrgId") != null && !jsonObj.get("redSkyOrgId").isJsonNull()) && !jsonObj.get("redSkyOrgId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redSkyOrgId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redSkyOrgId").toString()));
      }
      // validate the optional field `locationsStatus`
      if (jsonObj.get("locationsStatus") != null && !jsonObj.get("locationsStatus").isJsonNull()) {
        ComplianceStatusLocationStatusObject.validateJsonElement(jsonObj.get("locationsStatus"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetLocationComplianceStatusResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetLocationComplianceStatusResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetLocationComplianceStatusResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetLocationComplianceStatusResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetLocationComplianceStatusResponse>() {
           @Override
           public void write(JsonWriter out, GetLocationComplianceStatusResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetLocationComplianceStatusResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetLocationComplianceStatusResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetLocationComplianceStatusResponse
   * @throws IOException if the JSON string is invalid with respect to GetLocationComplianceStatusResponse
   */
  public static GetLocationComplianceStatusResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetLocationComplianceStatusResponse.class);
  }

  /**
   * Convert an instance of GetLocationComplianceStatusResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

