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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.UpdateAWholesaleSubscriberRequestProvisioningParameters;

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
 * UpdateAWholesaleSubscriberRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class UpdateAWholesaleSubscriberRequest {
  /**
   * The Webex Wholesale package to be assigned to the subscriber. **NOTE:** This parameter will be deprecated soon. Please  use &#x60;packages&#x60; instead.
   */
  @JsonAdapter(PackageEnum.Adapter.class)
  public enum PackageEnum {
    WEBEX_CALLING("webex_calling"),
    
    WEBEX_MEETINGS("webex_meetings"),
    
    WEBEX_SUITE("webex_suite"),
    
    WEBEX_VOICE("webex_voice"),
    
    CX_ESSENTIALS("cx_essentials");

    private String value;

    PackageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PackageEnum fromValue(String value) {
      for (PackageEnum b : PackageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PackageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PackageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PackageEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PackageEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PackageEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PACKAGE = "package";
  @SerializedName(SERIALIZED_NAME_PACKAGE)
  private PackageEnum _package;

  public static final String SERIALIZED_NAME_PACKAGES = "packages";
  @SerializedName(SERIALIZED_NAME_PACKAGES)
  private List<Object> packages = new ArrayList<>();

  public static final String SERIALIZED_NAME_PROVISIONING_PARAMETERS = "provisioningParameters";
  @SerializedName(SERIALIZED_NAME_PROVISIONING_PARAMETERS)
  private UpdateAWholesaleSubscriberRequestProvisioningParameters provisioningParameters;

  public UpdateAWholesaleSubscriberRequest() {
  }

  public UpdateAWholesaleSubscriberRequest _package(PackageEnum _package) {
    this._package = _package;
    return this;
  }

  /**
   * The Webex Wholesale package to be assigned to the subscriber. **NOTE:** This parameter will be deprecated soon. Please  use &#x60;packages&#x60; instead.
   * @return _package
   */
  @javax.annotation.Nullable
  public PackageEnum getPackage() {
    return _package;
  }

  public void setPackage(PackageEnum _package) {
    this._package = _package;
  }


  public UpdateAWholesaleSubscriberRequest packages(List<Object> packages) {
    this.packages = packages;
    return this;
  }

  public UpdateAWholesaleSubscriberRequest addPackagesItem(Object packagesItem) {
    if (this.packages == null) {
      this.packages = new ArrayList<>();
    }
    this.packages.add(packagesItem);
    return this;
  }

  /**
   * The complete list of Webex Wholesale packages assigned to the subscriber. Currently accepts only one package in the list.
   * @return packages
   */
  @javax.annotation.Nullable
  public List<Object> getPackages() {
    return packages;
  }

  public void setPackages(List<Object> packages) {
    this.packages = packages;
  }


  public UpdateAWholesaleSubscriberRequest provisioningParameters(UpdateAWholesaleSubscriberRequestProvisioningParameters provisioningParameters) {
    this.provisioningParameters = provisioningParameters;
    return this;
  }

  /**
   * Get provisioningParameters
   * @return provisioningParameters
   */
  @javax.annotation.Nullable
  public UpdateAWholesaleSubscriberRequestProvisioningParameters getProvisioningParameters() {
    return provisioningParameters;
  }

  public void setProvisioningParameters(UpdateAWholesaleSubscriberRequestProvisioningParameters provisioningParameters) {
    this.provisioningParameters = provisioningParameters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAWholesaleSubscriberRequest updateAWholesaleSubscriberRequest = (UpdateAWholesaleSubscriberRequest) o;
    return Objects.equals(this._package, updateAWholesaleSubscriberRequest._package) &&
        Objects.equals(this.packages, updateAWholesaleSubscriberRequest.packages) &&
        Objects.equals(this.provisioningParameters, updateAWholesaleSubscriberRequest.provisioningParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_package, packages, provisioningParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAWholesaleSubscriberRequest {\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
    sb.append("    provisioningParameters: ").append(toIndentedString(provisioningParameters)).append("\n");
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
    openapiFields.add("package");
    openapiFields.add("packages");
    openapiFields.add("provisioningParameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateAWholesaleSubscriberRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateAWholesaleSubscriberRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateAWholesaleSubscriberRequest is not found in the empty JSON string", UpdateAWholesaleSubscriberRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateAWholesaleSubscriberRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateAWholesaleSubscriberRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("package") != null && !jsonObj.get("package").isJsonNull()) && !jsonObj.get("package").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `package` to be a primitive type in the JSON string but got `%s`", jsonObj.get("package").toString()));
      }
      // validate the optional field `package`
      if (jsonObj.get("package") != null && !jsonObj.get("package").isJsonNull()) {
        PackageEnum.validateJsonElement(jsonObj.get("package"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("packages") != null && !jsonObj.get("packages").isJsonNull() && !jsonObj.get("packages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `packages` to be an array in the JSON string but got `%s`", jsonObj.get("packages").toString()));
      }
      // validate the optional field `provisioningParameters`
      if (jsonObj.get("provisioningParameters") != null && !jsonObj.get("provisioningParameters").isJsonNull()) {
        UpdateAWholesaleSubscriberRequestProvisioningParameters.validateJsonElement(jsonObj.get("provisioningParameters"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateAWholesaleSubscriberRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateAWholesaleSubscriberRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateAWholesaleSubscriberRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateAWholesaleSubscriberRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateAWholesaleSubscriberRequest>() {
           @Override
           public void write(JsonWriter out, UpdateAWholesaleSubscriberRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateAWholesaleSubscriberRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateAWholesaleSubscriberRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateAWholesaleSubscriberRequest
   * @throws IOException if the JSON string is invalid with respect to UpdateAWholesaleSubscriberRequest
   */
  public static UpdateAWholesaleSubscriberRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateAWholesaleSubscriberRequest.class);
  }

  /**
   * Convert an instance of UpdateAWholesaleSubscriberRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

