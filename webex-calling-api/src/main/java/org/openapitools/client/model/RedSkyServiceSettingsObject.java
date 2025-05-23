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
 * RedSkyServiceSettingsObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class RedSkyServiceSettingsObject {
  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_COMPANY_ID = "companyId";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private String companyId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_EXTERNAL_TENANT_ENABLED = "externalTenantEnabled";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_TENANT_ENABLED)
  private Boolean externalTenantEnabled;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public RedSkyServiceSettingsObject() {
  }

  public RedSkyServiceSettingsObject enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * &#x60;true&#x60; if the service is enabled.
   * @return enabled
   */
  @javax.annotation.Nonnull
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public RedSkyServiceSettingsObject companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * The RedSky company ID, which can be retrieved from the RedSky portal.
   * @return companyId
   */
  @javax.annotation.Nullable
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }


  public RedSkyServiceSettingsObject secret(String secret) {
    this.secret = secret;
    return this;
  }

  /**
   * The company secret key, which can be found in the RedSky portal.
   * @return secret
   */
  @javax.annotation.Nullable
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }


  public RedSkyServiceSettingsObject externalTenantEnabled(Boolean externalTenantEnabled) {
    this.externalTenantEnabled = externalTenantEnabled;
    return this;
  }

  /**
   * &#x60;true&#x60; if the RedSky reseller customer is not under a Cisco account.
   * @return externalTenantEnabled
   */
  @javax.annotation.Nullable
  public Boolean getExternalTenantEnabled() {
    return externalTenantEnabled;
  }

  public void setExternalTenantEnabled(Boolean externalTenantEnabled) {
    this.externalTenantEnabled = externalTenantEnabled;
  }


  public RedSkyServiceSettingsObject email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email for the RedSky account. &#x60;email&#x60; is required if &#x60;externalTenantEnabled&#x60; is true.
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public RedSkyServiceSettingsObject password(String password) {
    this.password = password;
    return this;
  }

  /**
   * The password for the RedSky account. &#x60;password&#x60; is required if &#x60;externalTenantEnabled&#x60; is true.
   * @return password
   */
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedSkyServiceSettingsObject redSkyServiceSettingsObject = (RedSkyServiceSettingsObject) o;
    return Objects.equals(this.enabled, redSkyServiceSettingsObject.enabled) &&
        Objects.equals(this.companyId, redSkyServiceSettingsObject.companyId) &&
        Objects.equals(this.secret, redSkyServiceSettingsObject.secret) &&
        Objects.equals(this.externalTenantEnabled, redSkyServiceSettingsObject.externalTenantEnabled) &&
        Objects.equals(this.email, redSkyServiceSettingsObject.email) &&
        Objects.equals(this.password, redSkyServiceSettingsObject.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, companyId, secret, externalTenantEnabled, email, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedSkyServiceSettingsObject {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    externalTenantEnabled: ").append(toIndentedString(externalTenantEnabled)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
    openapiFields.add("enabled");
    openapiFields.add("companyId");
    openapiFields.add("secret");
    openapiFields.add("externalTenantEnabled");
    openapiFields.add("email");
    openapiFields.add("password");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("enabled");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RedSkyServiceSettingsObject
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RedSkyServiceSettingsObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RedSkyServiceSettingsObject is not found in the empty JSON string", RedSkyServiceSettingsObject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RedSkyServiceSettingsObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RedSkyServiceSettingsObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RedSkyServiceSettingsObject.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("companyId") != null && !jsonObj.get("companyId").isJsonNull()) && !jsonObj.get("companyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyId").toString()));
      }
      if ((jsonObj.get("secret") != null && !jsonObj.get("secret").isJsonNull()) && !jsonObj.get("secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secret").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RedSkyServiceSettingsObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RedSkyServiceSettingsObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RedSkyServiceSettingsObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RedSkyServiceSettingsObject.class));

       return (TypeAdapter<T>) new TypeAdapter<RedSkyServiceSettingsObject>() {
           @Override
           public void write(JsonWriter out, RedSkyServiceSettingsObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RedSkyServiceSettingsObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RedSkyServiceSettingsObject given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RedSkyServiceSettingsObject
   * @throws IOException if the JSON string is invalid with respect to RedSkyServiceSettingsObject
   */
  public static RedSkyServiceSettingsObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RedSkyServiceSettingsObject.class);
  }

  /**
   * Convert an instance of RedSkyServiceSettingsObject to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

