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
import org.openapitools.client.model.ReadTheListOfCallPickups200ResponseCallPickupsInner;

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
 * ReadTheListOfCallPickups200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class ReadTheListOfCallPickups200Response {
  public static final String SERIALIZED_NAME_CALL_PICKUPS = "callPickups";
  @SerializedName(SERIALIZED_NAME_CALL_PICKUPS)
  private List<ReadTheListOfCallPickups200ResponseCallPickupsInner> callPickups = new ArrayList<>();

  public ReadTheListOfCallPickups200Response() {
  }

  public ReadTheListOfCallPickups200Response callPickups(List<ReadTheListOfCallPickups200ResponseCallPickupsInner> callPickups) {
    this.callPickups = callPickups;
    return this;
  }

  public ReadTheListOfCallPickups200Response addCallPickupsItem(ReadTheListOfCallPickups200ResponseCallPickupsInner callPickupsItem) {
    if (this.callPickups == null) {
      this.callPickups = new ArrayList<>();
    }
    this.callPickups.add(callPickupsItem);
    return this;
  }

  /**
   * Array of call pickups.
   * @return callPickups
   */
  @javax.annotation.Nonnull
  public List<ReadTheListOfCallPickups200ResponseCallPickupsInner> getCallPickups() {
    return callPickups;
  }

  public void setCallPickups(List<ReadTheListOfCallPickups200ResponseCallPickupsInner> callPickups) {
    this.callPickups = callPickups;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadTheListOfCallPickups200Response readTheListOfCallPickups200Response = (ReadTheListOfCallPickups200Response) o;
    return Objects.equals(this.callPickups, readTheListOfCallPickups200Response.callPickups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callPickups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadTheListOfCallPickups200Response {\n");
    sb.append("    callPickups: ").append(toIndentedString(callPickups)).append("\n");
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
    openapiFields.add("callPickups");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("callPickups");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReadTheListOfCallPickups200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReadTheListOfCallPickups200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReadTheListOfCallPickups200Response is not found in the empty JSON string", ReadTheListOfCallPickups200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReadTheListOfCallPickups200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReadTheListOfCallPickups200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReadTheListOfCallPickups200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("callPickups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `callPickups` to be an array in the JSON string but got `%s`", jsonObj.get("callPickups").toString()));
      }

      JsonArray jsonArraycallPickups = jsonObj.getAsJsonArray("callPickups");
      // validate the required field `callPickups` (array)
      for (int i = 0; i < jsonArraycallPickups.size(); i++) {
        ReadTheListOfCallPickups200ResponseCallPickupsInner.validateJsonElement(jsonArraycallPickups.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReadTheListOfCallPickups200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReadTheListOfCallPickups200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReadTheListOfCallPickups200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReadTheListOfCallPickups200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ReadTheListOfCallPickups200Response>() {
           @Override
           public void write(JsonWriter out, ReadTheListOfCallPickups200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReadTheListOfCallPickups200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReadTheListOfCallPickups200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReadTheListOfCallPickups200Response
   * @throws IOException if the JSON string is invalid with respect to ReadTheListOfCallPickups200Response
   */
  public static ReadTheListOfCallPickups200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReadTheListOfCallPickups200Response.class);
  }

  /**
   * Convert an instance of ReadTheListOfCallPickups200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

