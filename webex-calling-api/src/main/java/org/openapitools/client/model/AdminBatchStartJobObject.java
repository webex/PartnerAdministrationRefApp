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
 * AdminBatchStartJobObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class AdminBatchStartJobObject {
  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private String operation;

  public static final String SERIALIZED_NAME_TARGET_LOCATION_ID = "targetLocationId";
  @SerializedName(SERIALIZED_NAME_TARGET_LOCATION_ID)
  private String targetLocationId;

  public static final String SERIALIZED_NAME_NUMBER_USAGE_TYPE = "numberUsageType";
  @SerializedName(SERIALIZED_NAME_NUMBER_USAGE_TYPE)
  private String numberUsageType;

  public static final String SERIALIZED_NAME_NUMBER_LIST = "numberList";
  @SerializedName(SERIALIZED_NAME_NUMBER_LIST)
  private List<Object> numberList = new ArrayList<>();

  public AdminBatchStartJobObject() {
  }

  public AdminBatchStartJobObject operation(String operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Indicates the kind of operation to be carried out.
   * @return operation
   */
  @javax.annotation.Nonnull
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }


  public AdminBatchStartJobObject targetLocationId(String targetLocationId) {
    this.targetLocationId = targetLocationId;
    return this;
  }

  /**
   * Mandatory for a &#x60;MOVE&#x60; operation. The target location within organization where the unassigned numbers will be moved from the source location.
   * @return targetLocationId
   */
  @javax.annotation.Nullable
  public String getTargetLocationId() {
    return targetLocationId;
  }

  public void setTargetLocationId(String targetLocationId) {
    this.targetLocationId = targetLocationId;
  }


  public AdminBatchStartJobObject numberUsageType(String numberUsageType) {
    this.numberUsageType = numberUsageType;
    return this;
  }

  /**
   * Mandatory for &#x60;NUMBER_USAGE_CHANGE&#x60; operation. Indicates the number usage type.
   * @return numberUsageType
   */
  @javax.annotation.Nullable
  public String getNumberUsageType() {
    return numberUsageType;
  }

  public void setNumberUsageType(String numberUsageType) {
    this.numberUsageType = numberUsageType;
  }


  public AdminBatchStartJobObject numberList(List<Object> numberList) {
    this.numberList = numberList;
    return this;
  }

  public AdminBatchStartJobObject addNumberListItem(Object numberListItem) {
    if (this.numberList == null) {
      this.numberList = new ArrayList<>();
    }
    this.numberList.add(numberListItem);
    return this;
  }

  /**
   * Numbers on which to execute the operation.
   * @return numberList
   */
  @javax.annotation.Nonnull
  public List<Object> getNumberList() {
    return numberList;
  }

  public void setNumberList(List<Object> numberList) {
    this.numberList = numberList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminBatchStartJobObject adminBatchStartJobObject = (AdminBatchStartJobObject) o;
    return Objects.equals(this.operation, adminBatchStartJobObject.operation) &&
        Objects.equals(this.targetLocationId, adminBatchStartJobObject.targetLocationId) &&
        Objects.equals(this.numberUsageType, adminBatchStartJobObject.numberUsageType) &&
        Objects.equals(this.numberList, adminBatchStartJobObject.numberList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, targetLocationId, numberUsageType, numberList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminBatchStartJobObject {\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    targetLocationId: ").append(toIndentedString(targetLocationId)).append("\n");
    sb.append("    numberUsageType: ").append(toIndentedString(numberUsageType)).append("\n");
    sb.append("    numberList: ").append(toIndentedString(numberList)).append("\n");
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
    openapiFields.add("operation");
    openapiFields.add("targetLocationId");
    openapiFields.add("numberUsageType");
    openapiFields.add("numberList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("operation");
    openapiRequiredFields.add("numberList");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AdminBatchStartJobObject
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AdminBatchStartJobObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdminBatchStartJobObject is not found in the empty JSON string", AdminBatchStartJobObject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AdminBatchStartJobObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdminBatchStartJobObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AdminBatchStartJobObject.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("operation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation").toString()));
      }
      if ((jsonObj.get("targetLocationId") != null && !jsonObj.get("targetLocationId").isJsonNull()) && !jsonObj.get("targetLocationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetLocationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetLocationId").toString()));
      }
      if ((jsonObj.get("numberUsageType") != null && !jsonObj.get("numberUsageType").isJsonNull()) && !jsonObj.get("numberUsageType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `numberUsageType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("numberUsageType").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("numberList") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("numberList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `numberList` to be an array in the JSON string but got `%s`", jsonObj.get("numberList").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdminBatchStartJobObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdminBatchStartJobObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdminBatchStartJobObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdminBatchStartJobObject.class));

       return (TypeAdapter<T>) new TypeAdapter<AdminBatchStartJobObject>() {
           @Override
           public void write(JsonWriter out, AdminBatchStartJobObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdminBatchStartJobObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AdminBatchStartJobObject given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AdminBatchStartJobObject
   * @throws IOException if the JSON string is invalid with respect to AdminBatchStartJobObject
   */
  public static AdminBatchStartJobObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdminBatchStartJobObject.class);
  }

  /**
   * Convert an instance of AdminBatchStartJobObject to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

