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
import org.openapitools.client.model.GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInnerLinesInner;

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
 * GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_ACCESS_CODE = "accessCode";
  @SerializedName(SERIALIZED_NAME_ACCESS_CODE)
  private String accessCode;

  public static final String SERIALIZED_NAME_LINES = "lines";
  @SerializedName(SERIALIZED_NAME_LINES)
  private List<GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInnerLinesInner> lines = new ArrayList<>();

  public GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner() {
  }

  public GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the DECT handset.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Display name of the DECT handset.
   * @return displayName
   */
  @javax.annotation.Nonnull
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner accessCode(String accessCode) {
    this.accessCode = accessCode;
    return this;
  }

  /**
   * Access code for the DECT handset.
   * @return accessCode
   */
  @javax.annotation.Nonnull
  public String getAccessCode() {
    return accessCode;
  }

  public void setAccessCode(String accessCode) {
    this.accessCode = accessCode;
  }


  public GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner lines(List<GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInnerLinesInner> lines) {
    this.lines = lines;
    return this;
  }

  public GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner addLinesItem(GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInnerLinesInner linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<>();
    }
    this.lines.add(linesItem);
    return this;
  }

  /**
   * Details of the handset member lines registered with the base station. The maximum number of lines supported is 2.
   * @return lines
   */
  @javax.annotation.Nonnull
  public List<GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInnerLinesInner> getLines() {
    return lines;
  }

  public void setLines(List<GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInnerLinesInner> lines) {
    this.lines = lines;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner getTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner = (GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner) o;
    return Objects.equals(this.id, getTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner.id) &&
        Objects.equals(this.displayName, getTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner.displayName) &&
        Objects.equals(this.accessCode, getTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner.accessCode) &&
        Objects.equals(this.lines, getTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner.lines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName, accessCode, lines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
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
    openapiFields.add("displayName");
    openapiFields.add("accessCode");
    openapiFields.add("lines");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("displayName");
    openapiRequiredFields.add("accessCode");
    openapiRequiredFields.add("lines");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner is not found in the empty JSON string", GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if (!jsonObj.get("accessCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accessCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accessCode").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("lines").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `lines` to be an array in the JSON string but got `%s`", jsonObj.get("lines").toString()));
      }

      JsonArray jsonArraylines = jsonObj.getAsJsonArray("lines");
      // validate the required field `lines` (array)
      for (int i = 0; i < jsonArraylines.size(); i++) {
        GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInnerLinesInner.validateJsonElement(jsonArraylines.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner>() {
           @Override
           public void write(JsonWriter out, GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner
   * @throws IOException if the JSON string is invalid with respect to GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner
   */
  public static GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner.class);
  }

  /**
   * Convert an instance of GetTheDetailsOfASpecificDECTNetworkBaseStation200ResponseHandsetsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

