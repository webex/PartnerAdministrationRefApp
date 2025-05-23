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
 * VirtualExtensionRange
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class VirtualExtensionRange {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public static final String SERIALIZED_NAME_PATTERN = "pattern";
  @SerializedName(SERIALIZED_NAME_PATTERN)
  private String pattern;

  public static final String SERIALIZED_NAME_LOCATION_NAME = "locationName";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public static final String SERIALIZED_NAME_LOCATION_ID = "locationId";
  @SerializedName(SERIALIZED_NAME_LOCATION_ID)
  private String locationId;

  public static final String SERIALIZED_NAME_TRUNK_NAME = "trunkName";
  @SerializedName(SERIALIZED_NAME_TRUNK_NAME)
  private String trunkName;

  public static final String SERIALIZED_NAME_TRUNK_ID = "trunkId";
  @SerializedName(SERIALIZED_NAME_TRUNK_ID)
  private String trunkId;

  public static final String SERIALIZED_NAME_ROUTE_GROUP_NAME = "routeGroupName";
  @SerializedName(SERIALIZED_NAME_ROUTE_GROUP_NAME)
  private String routeGroupName;

  public static final String SERIALIZED_NAME_ROUTE_GROUP_ID = "routeGroupId";
  @SerializedName(SERIALIZED_NAME_ROUTE_GROUP_ID)
  private String routeGroupId;

  public static final String SERIALIZED_NAME_TRUNK_LOCATION_NAME = "trunkLocationName";
  @SerializedName(SERIALIZED_NAME_TRUNK_LOCATION_NAME)
  private String trunkLocationName;

  public static final String SERIALIZED_NAME_TRUNK_LOCATION_ID = "trunkLocationId";
  @SerializedName(SERIALIZED_NAME_TRUNK_LOCATION_ID)
  private String trunkLocationId;

  public VirtualExtensionRange() {
  }

  public VirtualExtensionRange id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for virtual extension range.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public VirtualExtensionRange name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the virtual extension range.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public VirtualExtensionRange prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  /**
   * Prefix that the virtual extension range is associated with (Note: Standard mode must have leading &#39;+&#39; in prefix; BCD/Enhanced mode can have any valid prefix).
   * @return prefix
   */
  @javax.annotation.Nonnull
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public VirtualExtensionRange pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

  /**
   * Pattern associated with the virtual extension range.
   * @return pattern
   */
  @javax.annotation.Nonnull
  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }


  public VirtualExtensionRange locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * Location name if the virtual extension range is at the location level, empty if it is at the customer level.
   * @return locationName
   */
  @javax.annotation.Nullable
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }


  public VirtualExtensionRange locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * Location ID if the virtual extension range is at the location level, empty if it is at customer level.
   * @return locationId
   */
  @javax.annotation.Nullable
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }


  public VirtualExtensionRange trunkName(String trunkName) {
    this.trunkName = trunkName;
    return this;
  }

  /**
   * Name of the trunk.
   * @return trunkName
   */
  @javax.annotation.Nullable
  public String getTrunkName() {
    return trunkName;
  }

  public void setTrunkName(String trunkName) {
    this.trunkName = trunkName;
  }


  public VirtualExtensionRange trunkId(String trunkId) {
    this.trunkId = trunkId;
    return this;
  }

  /**
   * Unique identifier of the trunk.
   * @return trunkId
   */
  @javax.annotation.Nullable
  public String getTrunkId() {
    return trunkId;
  }

  public void setTrunkId(String trunkId) {
    this.trunkId = trunkId;
  }


  public VirtualExtensionRange routeGroupName(String routeGroupName) {
    this.routeGroupName = routeGroupName;
    return this;
  }

  /**
   * Name of the route group.
   * @return routeGroupName
   */
  @javax.annotation.Nullable
  public String getRouteGroupName() {
    return routeGroupName;
  }

  public void setRouteGroupName(String routeGroupName) {
    this.routeGroupName = routeGroupName;
  }


  public VirtualExtensionRange routeGroupId(String routeGroupId) {
    this.routeGroupId = routeGroupId;
    return this;
  }

  /**
   * Unique identifier of the route group.
   * @return routeGroupId
   */
  @javax.annotation.Nullable
  public String getRouteGroupId() {
    return routeGroupId;
  }

  public void setRouteGroupId(String routeGroupId) {
    this.routeGroupId = routeGroupId;
  }


  public VirtualExtensionRange trunkLocationName(String trunkLocationName) {
    this.trunkLocationName = trunkLocationName;
    return this;
  }

  /**
   * Location of the trunk; required if &#x60;trunkName&#x60; is returned.
   * @return trunkLocationName
   */
  @javax.annotation.Nullable
  public String getTrunkLocationName() {
    return trunkLocationName;
  }

  public void setTrunkLocationName(String trunkLocationName) {
    this.trunkLocationName = trunkLocationName;
  }


  public VirtualExtensionRange trunkLocationId(String trunkLocationId) {
    this.trunkLocationId = trunkLocationId;
    return this;
  }

  /**
   * Location ID of the trunk; required if &#x60;trunkName&#x60; is returned.
   * @return trunkLocationId
   */
  @javax.annotation.Nullable
  public String getTrunkLocationId() {
    return trunkLocationId;
  }

  public void setTrunkLocationId(String trunkLocationId) {
    this.trunkLocationId = trunkLocationId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualExtensionRange virtualExtensionRange = (VirtualExtensionRange) o;
    return Objects.equals(this.id, virtualExtensionRange.id) &&
        Objects.equals(this.name, virtualExtensionRange.name) &&
        Objects.equals(this.prefix, virtualExtensionRange.prefix) &&
        Objects.equals(this.pattern, virtualExtensionRange.pattern) &&
        Objects.equals(this.locationName, virtualExtensionRange.locationName) &&
        Objects.equals(this.locationId, virtualExtensionRange.locationId) &&
        Objects.equals(this.trunkName, virtualExtensionRange.trunkName) &&
        Objects.equals(this.trunkId, virtualExtensionRange.trunkId) &&
        Objects.equals(this.routeGroupName, virtualExtensionRange.routeGroupName) &&
        Objects.equals(this.routeGroupId, virtualExtensionRange.routeGroupId) &&
        Objects.equals(this.trunkLocationName, virtualExtensionRange.trunkLocationName) &&
        Objects.equals(this.trunkLocationId, virtualExtensionRange.trunkLocationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, prefix, pattern, locationName, locationId, trunkName, trunkId, routeGroupName, routeGroupId, trunkLocationName, trunkLocationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualExtensionRange {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    trunkName: ").append(toIndentedString(trunkName)).append("\n");
    sb.append("    trunkId: ").append(toIndentedString(trunkId)).append("\n");
    sb.append("    routeGroupName: ").append(toIndentedString(routeGroupName)).append("\n");
    sb.append("    routeGroupId: ").append(toIndentedString(routeGroupId)).append("\n");
    sb.append("    trunkLocationName: ").append(toIndentedString(trunkLocationName)).append("\n");
    sb.append("    trunkLocationId: ").append(toIndentedString(trunkLocationId)).append("\n");
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
    openapiFields.add("prefix");
    openapiFields.add("pattern");
    openapiFields.add("locationName");
    openapiFields.add("locationId");
    openapiFields.add("trunkName");
    openapiFields.add("trunkId");
    openapiFields.add("routeGroupName");
    openapiFields.add("routeGroupId");
    openapiFields.add("trunkLocationName");
    openapiFields.add("trunkLocationId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("prefix");
    openapiRequiredFields.add("pattern");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VirtualExtensionRange
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VirtualExtensionRange.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VirtualExtensionRange is not found in the empty JSON string", VirtualExtensionRange.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VirtualExtensionRange.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VirtualExtensionRange` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VirtualExtensionRange.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("prefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prefix").toString()));
      }
      if (!jsonObj.get("pattern").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pattern` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pattern").toString()));
      }
      if ((jsonObj.get("locationName") != null && !jsonObj.get("locationName").isJsonNull()) && !jsonObj.get("locationName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationName").toString()));
      }
      if ((jsonObj.get("locationId") != null && !jsonObj.get("locationId").isJsonNull()) && !jsonObj.get("locationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationId").toString()));
      }
      if ((jsonObj.get("trunkName") != null && !jsonObj.get("trunkName").isJsonNull()) && !jsonObj.get("trunkName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trunkName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trunkName").toString()));
      }
      if ((jsonObj.get("trunkId") != null && !jsonObj.get("trunkId").isJsonNull()) && !jsonObj.get("trunkId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trunkId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trunkId").toString()));
      }
      if ((jsonObj.get("routeGroupName") != null && !jsonObj.get("routeGroupName").isJsonNull()) && !jsonObj.get("routeGroupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `routeGroupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("routeGroupName").toString()));
      }
      if ((jsonObj.get("routeGroupId") != null && !jsonObj.get("routeGroupId").isJsonNull()) && !jsonObj.get("routeGroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `routeGroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("routeGroupId").toString()));
      }
      if ((jsonObj.get("trunkLocationName") != null && !jsonObj.get("trunkLocationName").isJsonNull()) && !jsonObj.get("trunkLocationName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trunkLocationName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trunkLocationName").toString()));
      }
      if ((jsonObj.get("trunkLocationId") != null && !jsonObj.get("trunkLocationId").isJsonNull()) && !jsonObj.get("trunkLocationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trunkLocationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trunkLocationId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VirtualExtensionRange.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VirtualExtensionRange' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VirtualExtensionRange> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VirtualExtensionRange.class));

       return (TypeAdapter<T>) new TypeAdapter<VirtualExtensionRange>() {
           @Override
           public void write(JsonWriter out, VirtualExtensionRange value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VirtualExtensionRange read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of VirtualExtensionRange given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VirtualExtensionRange
   * @throws IOException if the JSON string is invalid with respect to VirtualExtensionRange
   */
  public static VirtualExtensionRange fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VirtualExtensionRange.class);
  }

  /**
   * Convert an instance of VirtualExtensionRange to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

