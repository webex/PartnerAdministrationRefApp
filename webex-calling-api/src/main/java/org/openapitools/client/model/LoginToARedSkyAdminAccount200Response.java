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
 * LoginToARedSkyAdminAccount200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class LoginToARedSkyAdminAccount200Response {
  public static final String SERIALIZED_NAME_ACCOUNT_MATCH = "accountMatch";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_MATCH)
  private Boolean accountMatch;

  public static final String SERIALIZED_NAME_EXTERNAL_TENANT_ENABLED = "externalTenantEnabled";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_TENANT_ENABLED)
  private Boolean externalTenantEnabled;

  public static final String SERIALIZED_NAME_COMPANY_ID = "companyId";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private String companyId;

  public LoginToARedSkyAdminAccount200Response() {
  }

  public LoginToARedSkyAdminAccount200Response accountMatch(Boolean accountMatch) {
    this.accountMatch = accountMatch;
    return this;
  }

  /**
   * &#x60;true&#x60; if the old &#x60;companyId&#x60; secret is matched with the new &#x60;companyId&#x60; secret.
   * @return accountMatch
   */
  @javax.annotation.Nonnull
  public Boolean getAccountMatch() {
    return accountMatch;
  }

  public void setAccountMatch(Boolean accountMatch) {
    this.accountMatch = accountMatch;
  }


  public LoginToARedSkyAdminAccount200Response externalTenantEnabled(Boolean externalTenantEnabled) {
    this.externalTenantEnabled = externalTenantEnabled;
    return this;
  }

  /**
   * &#x60;true&#x60; if the RedSky reseller customer is not under a Cisco account.
   * @return externalTenantEnabled
   */
  @javax.annotation.Nonnull
  public Boolean getExternalTenantEnabled() {
    return externalTenantEnabled;
  }

  public void setExternalTenantEnabled(Boolean externalTenantEnabled) {
    this.externalTenantEnabled = externalTenantEnabled;
  }


  public LoginToARedSkyAdminAccount200Response companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * The RedSky held token from the secret response.
   * @return companyId
   */
  @javax.annotation.Nonnull
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginToARedSkyAdminAccount200Response loginToARedSkyAdminAccount200Response = (LoginToARedSkyAdminAccount200Response) o;
    return Objects.equals(this.accountMatch, loginToARedSkyAdminAccount200Response.accountMatch) &&
        Objects.equals(this.externalTenantEnabled, loginToARedSkyAdminAccount200Response.externalTenantEnabled) &&
        Objects.equals(this.companyId, loginToARedSkyAdminAccount200Response.companyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountMatch, externalTenantEnabled, companyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginToARedSkyAdminAccount200Response {\n");
    sb.append("    accountMatch: ").append(toIndentedString(accountMatch)).append("\n");
    sb.append("    externalTenantEnabled: ").append(toIndentedString(externalTenantEnabled)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
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
    openapiFields.add("accountMatch");
    openapiFields.add("externalTenantEnabled");
    openapiFields.add("companyId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accountMatch");
    openapiRequiredFields.add("externalTenantEnabled");
    openapiRequiredFields.add("companyId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LoginToARedSkyAdminAccount200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LoginToARedSkyAdminAccount200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoginToARedSkyAdminAccount200Response is not found in the empty JSON string", LoginToARedSkyAdminAccount200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LoginToARedSkyAdminAccount200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LoginToARedSkyAdminAccount200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LoginToARedSkyAdminAccount200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("companyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoginToARedSkyAdminAccount200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoginToARedSkyAdminAccount200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoginToARedSkyAdminAccount200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoginToARedSkyAdminAccount200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<LoginToARedSkyAdminAccount200Response>() {
           @Override
           public void write(JsonWriter out, LoginToARedSkyAdminAccount200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoginToARedSkyAdminAccount200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LoginToARedSkyAdminAccount200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LoginToARedSkyAdminAccount200Response
   * @throws IOException if the JSON string is invalid with respect to LoginToARedSkyAdminAccount200Response
   */
  public static LoginToARedSkyAdminAccount200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoginToARedSkyAdminAccount200Response.class);
  }

  /**
   * Convert an instance of LoginToARedSkyAdminAccount200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

