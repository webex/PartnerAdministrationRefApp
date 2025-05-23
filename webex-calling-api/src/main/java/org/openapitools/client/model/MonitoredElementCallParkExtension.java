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
 * MonitoredElementCallParkExtension
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class MonitoredElementCallParkExtension {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EXTENSION = "extension";
  @SerializedName(SERIALIZED_NAME_EXTENSION)
  private String extension;

  public static final String SERIALIZED_NAME_ROUTING_PREFIX = "routingPrefix";
  @SerializedName(SERIALIZED_NAME_ROUTING_PREFIX)
  private String routingPrefix;

  public static final String SERIALIZED_NAME_ESN = "esn";
  @SerializedName(SERIALIZED_NAME_ESN)
  private String esn;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_LOCATION_ID = "locationId";
  @SerializedName(SERIALIZED_NAME_LOCATION_ID)
  private String locationId;

  public MonitoredElementCallParkExtension() {
  }

  public MonitoredElementCallParkExtension id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of call park extension.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public MonitoredElementCallParkExtension name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of call park extension.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public MonitoredElementCallParkExtension extension(String extension) {
    this.extension = extension;
    return this;
  }

  /**
   * Extension of call park extension.
   * @return extension
   */
  @javax.annotation.Nonnull
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }


  public MonitoredElementCallParkExtension routingPrefix(String routingPrefix) {
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


  public MonitoredElementCallParkExtension esn(String esn) {
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


  public MonitoredElementCallParkExtension location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Name of location for call park extension.
   * @return location
   */
  @javax.annotation.Nonnull
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  public MonitoredElementCallParkExtension locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * ID of location for call park extension.
   * @return locationId
   */
  @javax.annotation.Nonnull
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitoredElementCallParkExtension monitoredElementCallParkExtension = (MonitoredElementCallParkExtension) o;
    return Objects.equals(this.id, monitoredElementCallParkExtension.id) &&
        Objects.equals(this.name, monitoredElementCallParkExtension.name) &&
        Objects.equals(this.extension, monitoredElementCallParkExtension.extension) &&
        Objects.equals(this.routingPrefix, monitoredElementCallParkExtension.routingPrefix) &&
        Objects.equals(this.esn, monitoredElementCallParkExtension.esn) &&
        Objects.equals(this.location, monitoredElementCallParkExtension.location) &&
        Objects.equals(this.locationId, monitoredElementCallParkExtension.locationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, extension, routingPrefix, esn, location, locationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitoredElementCallParkExtension {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    routingPrefix: ").append(toIndentedString(routingPrefix)).append("\n");
    sb.append("    esn: ").append(toIndentedString(esn)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("extension");
    openapiFields.add("routingPrefix");
    openapiFields.add("esn");
    openapiFields.add("location");
    openapiFields.add("locationId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("extension");
    openapiRequiredFields.add("location");
    openapiRequiredFields.add("locationId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MonitoredElementCallParkExtension
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MonitoredElementCallParkExtension.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MonitoredElementCallParkExtension is not found in the empty JSON string", MonitoredElementCallParkExtension.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MonitoredElementCallParkExtension.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MonitoredElementCallParkExtension` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MonitoredElementCallParkExtension.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("extension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extension").toString()));
      }
      if ((jsonObj.get("routingPrefix") != null && !jsonObj.get("routingPrefix").isJsonNull()) && !jsonObj.get("routingPrefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `routingPrefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("routingPrefix").toString()));
      }
      if ((jsonObj.get("esn") != null && !jsonObj.get("esn").isJsonNull()) && !jsonObj.get("esn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `esn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("esn").toString()));
      }
      if (!jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if (!jsonObj.get("locationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MonitoredElementCallParkExtension.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MonitoredElementCallParkExtension' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MonitoredElementCallParkExtension> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MonitoredElementCallParkExtension.class));

       return (TypeAdapter<T>) new TypeAdapter<MonitoredElementCallParkExtension>() {
           @Override
           public void write(JsonWriter out, MonitoredElementCallParkExtension value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MonitoredElementCallParkExtension read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MonitoredElementCallParkExtension given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MonitoredElementCallParkExtension
   * @throws IOException if the JSON string is invalid with respect to MonitoredElementCallParkExtension
   */
  public static MonitoredElementCallParkExtension fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MonitoredElementCallParkExtension.class);
  }

  /**
   * Convert an instance of MonitoredElementCallParkExtension to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

