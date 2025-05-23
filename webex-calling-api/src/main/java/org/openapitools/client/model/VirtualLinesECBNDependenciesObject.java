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
 * VirtualLinesECBNDependenciesObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class VirtualLinesECBNDependenciesObject {
  public static final String SERIALIZED_NAME_IS_LOCATION_ECBN_DEFAULT = "isLocationEcbnDefault";
  @SerializedName(SERIALIZED_NAME_IS_LOCATION_ECBN_DEFAULT)
  private Boolean isLocationEcbnDefault;

  public static final String SERIALIZED_NAME_IS_SELF_ECBN_DEFAULT = "isSelfEcbnDefault";
  @SerializedName(SERIALIZED_NAME_IS_SELF_ECBN_DEFAULT)
  private Boolean isSelfEcbnDefault;

  public static final String SERIALIZED_NAME_DEPENDENT_MEMBER_COUNT = "dependentMemberCount";
  @SerializedName(SERIALIZED_NAME_DEPENDENT_MEMBER_COUNT)
  private BigDecimal dependentMemberCount;

  public VirtualLinesECBNDependenciesObject() {
  }

  public VirtualLinesECBNDependenciesObject isLocationEcbnDefault(Boolean isLocationEcbnDefault) {
    this.isLocationEcbnDefault = isLocationEcbnDefault;
    return this;
  }

  /**
   * &#x60;true&#x60; if it is the default emergency callback number for the location.
   * @return isLocationEcbnDefault
   */
  @javax.annotation.Nonnull
  public Boolean getIsLocationEcbnDefault() {
    return isLocationEcbnDefault;
  }

  public void setIsLocationEcbnDefault(Boolean isLocationEcbnDefault) {
    this.isLocationEcbnDefault = isLocationEcbnDefault;
  }


  public VirtualLinesECBNDependenciesObject isSelfEcbnDefault(Boolean isSelfEcbnDefault) {
    this.isSelfEcbnDefault = isSelfEcbnDefault;
    return this;
  }

  /**
   * Default emergency callback number for the virtual line if &#x60;true&#x60;.
   * @return isSelfEcbnDefault
   */
  @javax.annotation.Nonnull
  public Boolean getIsSelfEcbnDefault() {
    return isSelfEcbnDefault;
  }

  public void setIsSelfEcbnDefault(Boolean isSelfEcbnDefault) {
    this.isSelfEcbnDefault = isSelfEcbnDefault;
  }


  public VirtualLinesECBNDependenciesObject dependentMemberCount(BigDecimal dependentMemberCount) {
    this.dependentMemberCount = dependentMemberCount;
    return this;
  }

  /**
   * Number of members using this virtual line as their emergency callback number.
   * @return dependentMemberCount
   */
  @javax.annotation.Nonnull
  public BigDecimal getDependentMemberCount() {
    return dependentMemberCount;
  }

  public void setDependentMemberCount(BigDecimal dependentMemberCount) {
    this.dependentMemberCount = dependentMemberCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualLinesECBNDependenciesObject virtualLinesECBNDependenciesObject = (VirtualLinesECBNDependenciesObject) o;
    return Objects.equals(this.isLocationEcbnDefault, virtualLinesECBNDependenciesObject.isLocationEcbnDefault) &&
        Objects.equals(this.isSelfEcbnDefault, virtualLinesECBNDependenciesObject.isSelfEcbnDefault) &&
        Objects.equals(this.dependentMemberCount, virtualLinesECBNDependenciesObject.dependentMemberCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isLocationEcbnDefault, isSelfEcbnDefault, dependentMemberCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualLinesECBNDependenciesObject {\n");
    sb.append("    isLocationEcbnDefault: ").append(toIndentedString(isLocationEcbnDefault)).append("\n");
    sb.append("    isSelfEcbnDefault: ").append(toIndentedString(isSelfEcbnDefault)).append("\n");
    sb.append("    dependentMemberCount: ").append(toIndentedString(dependentMemberCount)).append("\n");
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
    openapiFields.add("isLocationEcbnDefault");
    openapiFields.add("isSelfEcbnDefault");
    openapiFields.add("dependentMemberCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("isLocationEcbnDefault");
    openapiRequiredFields.add("isSelfEcbnDefault");
    openapiRequiredFields.add("dependentMemberCount");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VirtualLinesECBNDependenciesObject
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VirtualLinesECBNDependenciesObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VirtualLinesECBNDependenciesObject is not found in the empty JSON string", VirtualLinesECBNDependenciesObject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VirtualLinesECBNDependenciesObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VirtualLinesECBNDependenciesObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VirtualLinesECBNDependenciesObject.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VirtualLinesECBNDependenciesObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VirtualLinesECBNDependenciesObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VirtualLinesECBNDependenciesObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VirtualLinesECBNDependenciesObject.class));

       return (TypeAdapter<T>) new TypeAdapter<VirtualLinesECBNDependenciesObject>() {
           @Override
           public void write(JsonWriter out, VirtualLinesECBNDependenciesObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VirtualLinesECBNDependenciesObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of VirtualLinesECBNDependenciesObject given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VirtualLinesECBNDependenciesObject
   * @throws IOException if the JSON string is invalid with respect to VirtualLinesECBNDependenciesObject
   */
  public static VirtualLinesECBNDependenciesObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VirtualLinesECBNDependenciesObject.class);
  }

  /**
   * Convert an instance of VirtualLinesECBNDependenciesObject to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

