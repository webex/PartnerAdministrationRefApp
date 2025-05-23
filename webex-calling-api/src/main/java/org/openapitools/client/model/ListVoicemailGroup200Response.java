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
import org.openapitools.client.model.ListVoicemailGroup200ResponseVoicemailGroupsInner;

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
 * ListVoicemailGroup200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class ListVoicemailGroup200Response {
  public static final String SERIALIZED_NAME_VOICEMAIL_GROUPS = "voicemailGroups";
  @SerializedName(SERIALIZED_NAME_VOICEMAIL_GROUPS)
  private List<ListVoicemailGroup200ResponseVoicemailGroupsInner> voicemailGroups = new ArrayList<>();

  public ListVoicemailGroup200Response() {
  }

  public ListVoicemailGroup200Response voicemailGroups(List<ListVoicemailGroup200ResponseVoicemailGroupsInner> voicemailGroups) {
    this.voicemailGroups = voicemailGroups;
    return this;
  }

  public ListVoicemailGroup200Response addVoicemailGroupsItem(ListVoicemailGroup200ResponseVoicemailGroupsInner voicemailGroupsItem) {
    if (this.voicemailGroups == null) {
      this.voicemailGroups = new ArrayList<>();
    }
    this.voicemailGroups.add(voicemailGroupsItem);
    return this;
  }

  /**
   * Array of VoicemailGroups.
   * @return voicemailGroups
   */
  @javax.annotation.Nonnull
  public List<ListVoicemailGroup200ResponseVoicemailGroupsInner> getVoicemailGroups() {
    return voicemailGroups;
  }

  public void setVoicemailGroups(List<ListVoicemailGroup200ResponseVoicemailGroupsInner> voicemailGroups) {
    this.voicemailGroups = voicemailGroups;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListVoicemailGroup200Response listVoicemailGroup200Response = (ListVoicemailGroup200Response) o;
    return Objects.equals(this.voicemailGroups, listVoicemailGroup200Response.voicemailGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(voicemailGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListVoicemailGroup200Response {\n");
    sb.append("    voicemailGroups: ").append(toIndentedString(voicemailGroups)).append("\n");
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
    openapiFields.add("voicemailGroups");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("voicemailGroups");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListVoicemailGroup200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListVoicemailGroup200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListVoicemailGroup200Response is not found in the empty JSON string", ListVoicemailGroup200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListVoicemailGroup200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListVoicemailGroup200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListVoicemailGroup200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("voicemailGroups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `voicemailGroups` to be an array in the JSON string but got `%s`", jsonObj.get("voicemailGroups").toString()));
      }

      JsonArray jsonArrayvoicemailGroups = jsonObj.getAsJsonArray("voicemailGroups");
      // validate the required field `voicemailGroups` (array)
      for (int i = 0; i < jsonArrayvoicemailGroups.size(); i++) {
        ListVoicemailGroup200ResponseVoicemailGroupsInner.validateJsonElement(jsonArrayvoicemailGroups.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListVoicemailGroup200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListVoicemailGroup200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListVoicemailGroup200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListVoicemailGroup200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ListVoicemailGroup200Response>() {
           @Override
           public void write(JsonWriter out, ListVoicemailGroup200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListVoicemailGroup200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListVoicemailGroup200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListVoicemailGroup200Response
   * @throws IOException if the JSON string is invalid with respect to ListVoicemailGroup200Response
   */
  public static ListVoicemailGroup200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListVoicemailGroup200Response.class);
  }

  /**
   * Convert an instance of ListVoicemailGroup200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

