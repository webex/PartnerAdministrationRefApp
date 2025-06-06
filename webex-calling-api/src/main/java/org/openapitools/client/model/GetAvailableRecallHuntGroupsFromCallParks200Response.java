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
import org.openapitools.client.model.GetAvailableRecallHuntGroupsFromCallParks200ResponseHuntGroupsInner;

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
 * GetAvailableRecallHuntGroupsFromCallParks200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class GetAvailableRecallHuntGroupsFromCallParks200Response {
  public static final String SERIALIZED_NAME_HUNT_GROUPS = "huntGroups";
  @SerializedName(SERIALIZED_NAME_HUNT_GROUPS)
  private List<GetAvailableRecallHuntGroupsFromCallParks200ResponseHuntGroupsInner> huntGroups = new ArrayList<>();

  public GetAvailableRecallHuntGroupsFromCallParks200Response() {
  }

  public GetAvailableRecallHuntGroupsFromCallParks200Response huntGroups(List<GetAvailableRecallHuntGroupsFromCallParks200ResponseHuntGroupsInner> huntGroups) {
    this.huntGroups = huntGroups;
    return this;
  }

  public GetAvailableRecallHuntGroupsFromCallParks200Response addHuntGroupsItem(GetAvailableRecallHuntGroupsFromCallParks200ResponseHuntGroupsInner huntGroupsItem) {
    if (this.huntGroups == null) {
      this.huntGroups = new ArrayList<>();
    }
    this.huntGroups.add(huntGroupsItem);
    return this;
  }

  /**
   * Array of available recall hunt groups.
   * @return huntGroups
   */
  @javax.annotation.Nonnull
  public List<GetAvailableRecallHuntGroupsFromCallParks200ResponseHuntGroupsInner> getHuntGroups() {
    return huntGroups;
  }

  public void setHuntGroups(List<GetAvailableRecallHuntGroupsFromCallParks200ResponseHuntGroupsInner> huntGroups) {
    this.huntGroups = huntGroups;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAvailableRecallHuntGroupsFromCallParks200Response getAvailableRecallHuntGroupsFromCallParks200Response = (GetAvailableRecallHuntGroupsFromCallParks200Response) o;
    return Objects.equals(this.huntGroups, getAvailableRecallHuntGroupsFromCallParks200Response.huntGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(huntGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAvailableRecallHuntGroupsFromCallParks200Response {\n");
    sb.append("    huntGroups: ").append(toIndentedString(huntGroups)).append("\n");
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
    openapiFields.add("huntGroups");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("huntGroups");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetAvailableRecallHuntGroupsFromCallParks200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetAvailableRecallHuntGroupsFromCallParks200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAvailableRecallHuntGroupsFromCallParks200Response is not found in the empty JSON string", GetAvailableRecallHuntGroupsFromCallParks200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetAvailableRecallHuntGroupsFromCallParks200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetAvailableRecallHuntGroupsFromCallParks200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetAvailableRecallHuntGroupsFromCallParks200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("huntGroups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `huntGroups` to be an array in the JSON string but got `%s`", jsonObj.get("huntGroups").toString()));
      }

      JsonArray jsonArrayhuntGroups = jsonObj.getAsJsonArray("huntGroups");
      // validate the required field `huntGroups` (array)
      for (int i = 0; i < jsonArrayhuntGroups.size(); i++) {
        GetAvailableRecallHuntGroupsFromCallParks200ResponseHuntGroupsInner.validateJsonElement(jsonArrayhuntGroups.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetAvailableRecallHuntGroupsFromCallParks200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAvailableRecallHuntGroupsFromCallParks200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAvailableRecallHuntGroupsFromCallParks200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAvailableRecallHuntGroupsFromCallParks200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAvailableRecallHuntGroupsFromCallParks200Response>() {
           @Override
           public void write(JsonWriter out, GetAvailableRecallHuntGroupsFromCallParks200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetAvailableRecallHuntGroupsFromCallParks200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetAvailableRecallHuntGroupsFromCallParks200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetAvailableRecallHuntGroupsFromCallParks200Response
   * @throws IOException if the JSON string is invalid with respect to GetAvailableRecallHuntGroupsFromCallParks200Response
   */
  public static GetAvailableRecallHuntGroupsFromCallParks200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAvailableRecallHuntGroupsFromCallParks200Response.class);
  }

  /**
   * Convert an instance of GetAvailableRecallHuntGroupsFromCallParks200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

