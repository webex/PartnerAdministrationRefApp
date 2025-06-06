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
import org.openapitools.client.model.GetLocationDetails200ResponseAddress;

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
 * GetLocationDetails200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class GetLocationDetails200Response {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ORG_ID = "orgId";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  private String orgId;

  public static final String SERIALIZED_NAME_TIME_ZONE = "timeZone";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE)
  private String timeZone;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private GetLocationDetails200ResponseAddress address;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private String latitude;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private String longitude;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public GetLocationDetails200Response() {
  }

  public GetLocationDetails200Response id(String id) {
    this.id = id;
    return this;
  }

  /**
   * A unique identifier for the location.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public GetLocationDetails200Response name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the location.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public GetLocationDetails200Response orgId(String orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * The ID of the organization to which this location belongs.
   * @return orgId
   */
  @javax.annotation.Nullable
  public String getOrgId() {
    return orgId;
  }

  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }


  public GetLocationDetails200Response timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Time zone associated with this location.
   * @return timeZone
   */
  @javax.annotation.Nonnull
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  public GetLocationDetails200Response address(GetLocationDetails200ResponseAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @javax.annotation.Nonnull
  public GetLocationDetails200ResponseAddress getAddress() {
    return address;
  }

  public void setAddress(GetLocationDetails200ResponseAddress address) {
    this.address = address;
  }


  public GetLocationDetails200Response latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Latitude
   * @return latitude
   */
  @javax.annotation.Nullable
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }


  public GetLocationDetails200Response longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Longitude
   * @return longitude
   */
  @javax.annotation.Nullable
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }


  public GetLocationDetails200Response notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Notes
   * @return notes
   */
  @javax.annotation.Nullable
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLocationDetails200Response getLocationDetails200Response = (GetLocationDetails200Response) o;
    return Objects.equals(this.id, getLocationDetails200Response.id) &&
        Objects.equals(this.name, getLocationDetails200Response.name) &&
        Objects.equals(this.orgId, getLocationDetails200Response.orgId) &&
        Objects.equals(this.timeZone, getLocationDetails200Response.timeZone) &&
        Objects.equals(this.address, getLocationDetails200Response.address) &&
        Objects.equals(this.latitude, getLocationDetails200Response.latitude) &&
        Objects.equals(this.longitude, getLocationDetails200Response.longitude) &&
        Objects.equals(this.notes, getLocationDetails200Response.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, orgId, timeZone, address, latitude, longitude, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLocationDetails200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
    openapiFields.add("orgId");
    openapiFields.add("timeZone");
    openapiFields.add("address");
    openapiFields.add("latitude");
    openapiFields.add("longitude");
    openapiFields.add("notes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("timeZone");
    openapiRequiredFields.add("address");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetLocationDetails200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetLocationDetails200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetLocationDetails200Response is not found in the empty JSON string", GetLocationDetails200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetLocationDetails200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetLocationDetails200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetLocationDetails200Response.openapiRequiredFields) {
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
      if ((jsonObj.get("orgId") != null && !jsonObj.get("orgId").isJsonNull()) && !jsonObj.get("orgId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orgId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orgId").toString()));
      }
      if (!jsonObj.get("timeZone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeZone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeZone").toString()));
      }
      // validate the required field `address`
      GetLocationDetails200ResponseAddress.validateJsonElement(jsonObj.get("address"));
      if ((jsonObj.get("latitude") != null && !jsonObj.get("latitude").isJsonNull()) && !jsonObj.get("latitude").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `latitude` to be a primitive type in the JSON string but got `%s`", jsonObj.get("latitude").toString()));
      }
      if ((jsonObj.get("longitude") != null && !jsonObj.get("longitude").isJsonNull()) && !jsonObj.get("longitude").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `longitude` to be a primitive type in the JSON string but got `%s`", jsonObj.get("longitude").toString()));
      }
      if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetLocationDetails200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetLocationDetails200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetLocationDetails200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetLocationDetails200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetLocationDetails200Response>() {
           @Override
           public void write(JsonWriter out, GetLocationDetails200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetLocationDetails200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetLocationDetails200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetLocationDetails200Response
   * @throws IOException if the JSON string is invalid with respect to GetLocationDetails200Response
   */
  public static GetLocationDetails200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetLocationDetails200Response.class);
  }

  /**
   * Convert an instance of GetLocationDetails200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

