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
import org.openapitools.client.model.GetDetailsForAScheduleEvent200ResponseRecurrence;

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
 * GetDetailsForAScheduleEvent200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class GetDetailsForAScheduleEvent200Response {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_ALL_DAY_ENABLED = "allDayEnabled";
  @SerializedName(SERIALIZED_NAME_ALL_DAY_ENABLED)
  private Boolean allDayEnabled;

  public static final String SERIALIZED_NAME_RECURRENCE = "recurrence";
  @SerializedName(SERIALIZED_NAME_RECURRENCE)
  private GetDetailsForAScheduleEvent200ResponseRecurrence recurrence;

  public GetDetailsForAScheduleEvent200Response() {
  }

  public GetDetailsForAScheduleEvent200Response id(String id) {
    this.id = id;
    return this;
  }

  /**
   * A unique identifier for the schedule event.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public GetDetailsForAScheduleEvent200Response name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name for the event.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public GetDetailsForAScheduleEvent200Response startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start Date of Event.
   * @return startDate
   */
  @javax.annotation.Nonnull
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public GetDetailsForAScheduleEvent200Response endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * End Date of Event.
   * @return endDate
   */
  @javax.annotation.Nonnull
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public GetDetailsForAScheduleEvent200Response startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Start time of event.
   * @return startTime
   */
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public GetDetailsForAScheduleEvent200Response endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * End time of event.
   * @return endTime
   */
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public GetDetailsForAScheduleEvent200Response allDayEnabled(Boolean allDayEnabled) {
    this.allDayEnabled = allDayEnabled;
    return this;
  }

  /**
   * An indication of whether given event is an all-day event or not.
   * @return allDayEnabled
   */
  @javax.annotation.Nullable
  public Boolean getAllDayEnabled() {
    return allDayEnabled;
  }

  public void setAllDayEnabled(Boolean allDayEnabled) {
    this.allDayEnabled = allDayEnabled;
  }


  public GetDetailsForAScheduleEvent200Response recurrence(GetDetailsForAScheduleEvent200ResponseRecurrence recurrence) {
    this.recurrence = recurrence;
    return this;
  }

  /**
   * Get recurrence
   * @return recurrence
   */
  @javax.annotation.Nullable
  public GetDetailsForAScheduleEvent200ResponseRecurrence getRecurrence() {
    return recurrence;
  }

  public void setRecurrence(GetDetailsForAScheduleEvent200ResponseRecurrence recurrence) {
    this.recurrence = recurrence;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDetailsForAScheduleEvent200Response getDetailsForAScheduleEvent200Response = (GetDetailsForAScheduleEvent200Response) o;
    return Objects.equals(this.id, getDetailsForAScheduleEvent200Response.id) &&
        Objects.equals(this.name, getDetailsForAScheduleEvent200Response.name) &&
        Objects.equals(this.startDate, getDetailsForAScheduleEvent200Response.startDate) &&
        Objects.equals(this.endDate, getDetailsForAScheduleEvent200Response.endDate) &&
        Objects.equals(this.startTime, getDetailsForAScheduleEvent200Response.startTime) &&
        Objects.equals(this.endTime, getDetailsForAScheduleEvent200Response.endTime) &&
        Objects.equals(this.allDayEnabled, getDetailsForAScheduleEvent200Response.allDayEnabled) &&
        Objects.equals(this.recurrence, getDetailsForAScheduleEvent200Response.recurrence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, startDate, endDate, startTime, endTime, allDayEnabled, recurrence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDetailsForAScheduleEvent200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    allDayEnabled: ").append(toIndentedString(allDayEnabled)).append("\n");
    sb.append("    recurrence: ").append(toIndentedString(recurrence)).append("\n");
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
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("startTime");
    openapiFields.add("endTime");
    openapiFields.add("allDayEnabled");
    openapiFields.add("recurrence");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("startDate");
    openapiRequiredFields.add("endDate");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetDetailsForAScheduleEvent200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetDetailsForAScheduleEvent200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetDetailsForAScheduleEvent200Response is not found in the empty JSON string", GetDetailsForAScheduleEvent200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetDetailsForAScheduleEvent200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetDetailsForAScheduleEvent200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetDetailsForAScheduleEvent200Response.openapiRequiredFields) {
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
      if (!jsonObj.get("startDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startDate").toString()));
      }
      if (!jsonObj.get("endDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endDate").toString()));
      }
      if ((jsonObj.get("startTime") != null && !jsonObj.get("startTime").isJsonNull()) && !jsonObj.get("startTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startTime").toString()));
      }
      if ((jsonObj.get("endTime") != null && !jsonObj.get("endTime").isJsonNull()) && !jsonObj.get("endTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endTime").toString()));
      }
      // validate the optional field `recurrence`
      if (jsonObj.get("recurrence") != null && !jsonObj.get("recurrence").isJsonNull()) {
        GetDetailsForAScheduleEvent200ResponseRecurrence.validateJsonElement(jsonObj.get("recurrence"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetDetailsForAScheduleEvent200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetDetailsForAScheduleEvent200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetDetailsForAScheduleEvent200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetDetailsForAScheduleEvent200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetDetailsForAScheduleEvent200Response>() {
           @Override
           public void write(JsonWriter out, GetDetailsForAScheduleEvent200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetDetailsForAScheduleEvent200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetDetailsForAScheduleEvent200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetDetailsForAScheduleEvent200Response
   * @throws IOException if the JSON string is invalid with respect to GetDetailsForAScheduleEvent200Response
   */
  public static GetDetailsForAScheduleEvent200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetDetailsForAScheduleEvent200Response.class);
  }

  /**
   * Convert an instance of GetDetailsForAScheduleEvent200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

