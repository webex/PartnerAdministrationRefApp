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
 * GetCallParkExtensionObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class GetCallParkExtensionObject {
  public static final String SERIALIZED_NAME_EXTENSION = "extension";
  @SerializedName(SERIALIZED_NAME_EXTENSION)
  private String extension;

  public static final String SERIALIZED_NAME_ROUTING_PREFIX = "routingPrefix";
  @SerializedName(SERIALIZED_NAME_ROUTING_PREFIX)
  private String routingPrefix;

  public static final String SERIALIZED_NAME_ESN = "esn";
  @SerializedName(SERIALIZED_NAME_ESN)
  private String esn;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public GetCallParkExtensionObject() {
  }

  public GetCallParkExtensionObject extension(String extension) {
    this.extension = extension;
    return this;
  }

  /**
   * The extension for the call park extension.
   * @return extension
   */
  @javax.annotation.Nonnull
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }


  public GetCallParkExtensionObject routingPrefix(String routingPrefix) {
    this.routingPrefix = routingPrefix;
    return this;
  }

  /**
   * Routing prefix of location.
   * @return routingPrefix
   */
  @javax.annotation.Nullable
  public String getRoutingPrefix() {
    return routingPrefix;
  }

  public void setRoutingPrefix(String routingPrefix) {
    this.routingPrefix = routingPrefix;
  }


  public GetCallParkExtensionObject esn(String esn) {
    this.esn = esn;
    return this;
  }

  /**
   * Routing prefix + extension of a person or workspace.
   * @return esn
   */
  @javax.annotation.Nullable
  public String getEsn() {
    return esn;
  }

  public void setEsn(String esn) {
    this.esn = esn;
  }


  public GetCallParkExtensionObject name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Unique name for the call park extension.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCallParkExtensionObject getCallParkExtensionObject = (GetCallParkExtensionObject) o;
    return Objects.equals(this.extension, getCallParkExtensionObject.extension) &&
        Objects.equals(this.routingPrefix, getCallParkExtensionObject.routingPrefix) &&
        Objects.equals(this.esn, getCallParkExtensionObject.esn) &&
        Objects.equals(this.name, getCallParkExtensionObject.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, routingPrefix, esn, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCallParkExtensionObject {\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    routingPrefix: ").append(toIndentedString(routingPrefix)).append("\n");
    sb.append("    esn: ").append(toIndentedString(esn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("extension");
    openapiFields.add("routingPrefix");
    openapiFields.add("esn");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("extension");
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetCallParkExtensionObject
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetCallParkExtensionObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetCallParkExtensionObject is not found in the empty JSON string", GetCallParkExtensionObject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetCallParkExtensionObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetCallParkExtensionObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetCallParkExtensionObject.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("extension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extension").toString()));
      }
      if ((jsonObj.get("routingPrefix") != null && !jsonObj.get("routingPrefix").isJsonNull()) && !jsonObj.get("routingPrefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `routingPrefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("routingPrefix").toString()));
      }
      if ((jsonObj.get("esn") != null && !jsonObj.get("esn").isJsonNull()) && !jsonObj.get("esn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `esn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("esn").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetCallParkExtensionObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetCallParkExtensionObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetCallParkExtensionObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetCallParkExtensionObject.class));

       return (TypeAdapter<T>) new TypeAdapter<GetCallParkExtensionObject>() {
           @Override
           public void write(JsonWriter out, GetCallParkExtensionObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetCallParkExtensionObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetCallParkExtensionObject given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetCallParkExtensionObject
   * @throws IOException if the JSON string is invalid with respect to GetCallParkExtensionObject
   */
  public static GetCallParkExtensionObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetCallParkExtensionObject.class);
  }

  /**
   * Convert an instance of GetCallParkExtensionObject to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

