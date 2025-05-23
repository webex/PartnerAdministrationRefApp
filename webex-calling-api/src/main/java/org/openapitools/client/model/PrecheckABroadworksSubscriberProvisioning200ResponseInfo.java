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
 * A list of &#x60;ProvisioningPreCheckResponseInfo&#x60; objects.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class PrecheckABroadworksSubscriberProvisioning200ResponseInfo {
  public static final String SERIALIZED_NAME_INFO_CODE = "infoCode";
  @SerializedName(SERIALIZED_NAME_INFO_CODE)
  private BigDecimal infoCode;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public PrecheckABroadworksSubscriberProvisioning200ResponseInfo() {
  }

  public PrecheckABroadworksSubscriberProvisioning200ResponseInfo infoCode(BigDecimal infoCode) {
    this.infoCode = infoCode;
    return this;
  }

  /**
   * Provisioning Precheck &#x60;infoCode&#x60;.
   * @return infoCode
   */
  @javax.annotation.Nullable
  public BigDecimal getInfoCode() {
    return infoCode;
  }

  public void setInfoCode(BigDecimal infoCode) {
    this.infoCode = infoCode;
  }


  public PrecheckABroadworksSubscriberProvisioning200ResponseInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A textual description of the &#x60;infoCode&#x60;.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrecheckABroadworksSubscriberProvisioning200ResponseInfo precheckABroadworksSubscriberProvisioning200ResponseInfo = (PrecheckABroadworksSubscriberProvisioning200ResponseInfo) o;
    return Objects.equals(this.infoCode, precheckABroadworksSubscriberProvisioning200ResponseInfo.infoCode) &&
        Objects.equals(this.description, precheckABroadworksSubscriberProvisioning200ResponseInfo.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infoCode, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrecheckABroadworksSubscriberProvisioning200ResponseInfo {\n");
    sb.append("    infoCode: ").append(toIndentedString(infoCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    openapiFields.add("infoCode");
    openapiFields.add("description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PrecheckABroadworksSubscriberProvisioning200ResponseInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PrecheckABroadworksSubscriberProvisioning200ResponseInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PrecheckABroadworksSubscriberProvisioning200ResponseInfo is not found in the empty JSON string", PrecheckABroadworksSubscriberProvisioning200ResponseInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PrecheckABroadworksSubscriberProvisioning200ResponseInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PrecheckABroadworksSubscriberProvisioning200ResponseInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PrecheckABroadworksSubscriberProvisioning200ResponseInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PrecheckABroadworksSubscriberProvisioning200ResponseInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PrecheckABroadworksSubscriberProvisioning200ResponseInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PrecheckABroadworksSubscriberProvisioning200ResponseInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<PrecheckABroadworksSubscriberProvisioning200ResponseInfo>() {
           @Override
           public void write(JsonWriter out, PrecheckABroadworksSubscriberProvisioning200ResponseInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PrecheckABroadworksSubscriberProvisioning200ResponseInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PrecheckABroadworksSubscriberProvisioning200ResponseInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PrecheckABroadworksSubscriberProvisioning200ResponseInfo
   * @throws IOException if the JSON string is invalid with respect to PrecheckABroadworksSubscriberProvisioning200ResponseInfo
   */
  public static PrecheckABroadworksSubscriberProvisioning200ResponseInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PrecheckABroadworksSubscriberProvisioning200ResponseInfo.class);
  }

  /**
   * Convert an instance of PrecheckABroadworksSubscriberProvisioning200ResponseInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

