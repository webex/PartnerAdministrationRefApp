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
import org.openapitools.client.model.ReadCallInterceptSettingsForAVirtualLine200ResponseIncoming;
import org.openapitools.client.model.ReadCallInterceptSettingsForAVirtualLine200ResponseOutgoing;

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
 * ReadCallInterceptSettingsForAVirtualLine200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class ReadCallInterceptSettingsForAVirtualLine200Response {
  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_INCOMING = "incoming";
  @SerializedName(SERIALIZED_NAME_INCOMING)
  private ReadCallInterceptSettingsForAVirtualLine200ResponseIncoming incoming;

  public static final String SERIALIZED_NAME_OUTGOING = "outgoing";
  @SerializedName(SERIALIZED_NAME_OUTGOING)
  private ReadCallInterceptSettingsForAVirtualLine200ResponseOutgoing outgoing;

  public ReadCallInterceptSettingsForAVirtualLine200Response() {
  }

  public ReadCallInterceptSettingsForAVirtualLine200Response enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * &#x60;true&#x60; if call intercept is enabled.
   * @return enabled
   */
  @javax.annotation.Nonnull
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public ReadCallInterceptSettingsForAVirtualLine200Response incoming(ReadCallInterceptSettingsForAVirtualLine200ResponseIncoming incoming) {
    this.incoming = incoming;
    return this;
  }

  /**
   * Get incoming
   * @return incoming
   */
  @javax.annotation.Nonnull
  public ReadCallInterceptSettingsForAVirtualLine200ResponseIncoming getIncoming() {
    return incoming;
  }

  public void setIncoming(ReadCallInterceptSettingsForAVirtualLine200ResponseIncoming incoming) {
    this.incoming = incoming;
  }


  public ReadCallInterceptSettingsForAVirtualLine200Response outgoing(ReadCallInterceptSettingsForAVirtualLine200ResponseOutgoing outgoing) {
    this.outgoing = outgoing;
    return this;
  }

  /**
   * Get outgoing
   * @return outgoing
   */
  @javax.annotation.Nonnull
  public ReadCallInterceptSettingsForAVirtualLine200ResponseOutgoing getOutgoing() {
    return outgoing;
  }

  public void setOutgoing(ReadCallInterceptSettingsForAVirtualLine200ResponseOutgoing outgoing) {
    this.outgoing = outgoing;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadCallInterceptSettingsForAVirtualLine200Response readCallInterceptSettingsForAVirtualLine200Response = (ReadCallInterceptSettingsForAVirtualLine200Response) o;
    return Objects.equals(this.enabled, readCallInterceptSettingsForAVirtualLine200Response.enabled) &&
        Objects.equals(this.incoming, readCallInterceptSettingsForAVirtualLine200Response.incoming) &&
        Objects.equals(this.outgoing, readCallInterceptSettingsForAVirtualLine200Response.outgoing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, incoming, outgoing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadCallInterceptSettingsForAVirtualLine200Response {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    incoming: ").append(toIndentedString(incoming)).append("\n");
    sb.append("    outgoing: ").append(toIndentedString(outgoing)).append("\n");
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
    openapiFields.add("incoming");
    openapiFields.add("outgoing");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("enabled");
    openapiRequiredFields.add("incoming");
    openapiRequiredFields.add("outgoing");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReadCallInterceptSettingsForAVirtualLine200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReadCallInterceptSettingsForAVirtualLine200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReadCallInterceptSettingsForAVirtualLine200Response is not found in the empty JSON string", ReadCallInterceptSettingsForAVirtualLine200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReadCallInterceptSettingsForAVirtualLine200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReadCallInterceptSettingsForAVirtualLine200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReadCallInterceptSettingsForAVirtualLine200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `incoming`
      ReadCallInterceptSettingsForAVirtualLine200ResponseIncoming.validateJsonElement(jsonObj.get("incoming"));
      // validate the required field `outgoing`
      ReadCallInterceptSettingsForAVirtualLine200ResponseOutgoing.validateJsonElement(jsonObj.get("outgoing"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReadCallInterceptSettingsForAVirtualLine200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReadCallInterceptSettingsForAVirtualLine200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReadCallInterceptSettingsForAVirtualLine200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReadCallInterceptSettingsForAVirtualLine200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ReadCallInterceptSettingsForAVirtualLine200Response>() {
           @Override
           public void write(JsonWriter out, ReadCallInterceptSettingsForAVirtualLine200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReadCallInterceptSettingsForAVirtualLine200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReadCallInterceptSettingsForAVirtualLine200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReadCallInterceptSettingsForAVirtualLine200Response
   * @throws IOException if the JSON string is invalid with respect to ReadCallInterceptSettingsForAVirtualLine200Response
   */
  public static ReadCallInterceptSettingsForAVirtualLine200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReadCallInterceptSettingsForAVirtualLine200Response.class);
  }

  /**
   * Convert an instance of ReadCallInterceptSettingsForAVirtualLine200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

