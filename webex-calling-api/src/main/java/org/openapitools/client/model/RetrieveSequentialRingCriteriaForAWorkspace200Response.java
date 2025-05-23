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
 * RetrieveSequentialRingCriteriaForAWorkspace200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class RetrieveSequentialRingCriteriaForAWorkspace200Response {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SCHEDULE_NAME = "scheduleName";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_NAME)
  private String scheduleName;

  /**
   * This indicates the type of schedule.
   */
  @JsonAdapter(ScheduleTypeEnum.Adapter.class)
  public enum ScheduleTypeEnum {
    HOLIDAYS("holidays"),
    
    BUSINESS_HOURS("businessHours");

    private String value;

    ScheduleTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScheduleTypeEnum fromValue(String value) {
      for (ScheduleTypeEnum b : ScheduleTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ScheduleTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScheduleTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScheduleTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ScheduleTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ScheduleTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SCHEDULE_TYPE = "scheduleType";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_TYPE)
  private ScheduleTypeEnum scheduleType;

  /**
   * This indicates the level of the schedule specified by &#x60;scheduleName&#x60;.
   */
  @JsonAdapter(ScheduleLevelEnum.Adapter.class)
  public enum ScheduleLevelEnum {
    GROUP("GROUP");

    private String value;

    ScheduleLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScheduleLevelEnum fromValue(String value) {
      for (ScheduleLevelEnum b : ScheduleLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ScheduleLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScheduleLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScheduleLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ScheduleLevelEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ScheduleLevelEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SCHEDULE_LEVEL = "scheduleLevel";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_LEVEL)
  private ScheduleLevelEnum scheduleLevel;

  /**
   * This indicates if criteria are applicable for calls from any phone number or selected phone numbers.
   */
  @JsonAdapter(CallsFromEnum.Adapter.class)
  public enum CallsFromEnum {
    SELECT_PHONE_NUMBERS("SELECT_PHONE_NUMBERS"),
    
    ANY_PHONE_NUMBER("ANY_PHONE_NUMBER");

    private String value;

    CallsFromEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CallsFromEnum fromValue(String value) {
      for (CallsFromEnum b : CallsFromEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CallsFromEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CallsFromEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CallsFromEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CallsFromEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      CallsFromEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CALLS_FROM = "callsFrom";
  @SerializedName(SERIALIZED_NAME_CALLS_FROM)
  private CallsFromEnum callsFrom;

  public static final String SERIALIZED_NAME_ANONYMOUS_CALLERS_ENABLED = "anonymousCallersEnabled";
  @SerializedName(SERIALIZED_NAME_ANONYMOUS_CALLERS_ENABLED)
  private Boolean anonymousCallersEnabled;

  public static final String SERIALIZED_NAME_UNAVAILABLE_CALLERS_ENABLED = "unavailableCallersEnabled";
  @SerializedName(SERIALIZED_NAME_UNAVAILABLE_CALLERS_ENABLED)
  private Boolean unavailableCallersEnabled;

  public static final String SERIALIZED_NAME_PHONE_NUMBERS = "phoneNumbers";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBERS)
  private List<Object> phoneNumbers = new ArrayList<>();

  public static final String SERIALIZED_NAME_RING_ENABLED = "ringEnabled";
  @SerializedName(SERIALIZED_NAME_RING_ENABLED)
  private Boolean ringEnabled;

  public RetrieveSequentialRingCriteriaForAWorkspace200Response() {
  }

  public RetrieveSequentialRingCriteriaForAWorkspace200Response id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for criteria.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public RetrieveSequentialRingCriteriaForAWorkspace200Response scheduleName(String scheduleName) {
    this.scheduleName = scheduleName;
    return this;
  }

  /**
   * Name of the location&#39;s schedule which determines when the sequential ring is in effect.
   * @return scheduleName
   */
  @javax.annotation.Nonnull
  public String getScheduleName() {
    return scheduleName;
  }

  public void setScheduleName(String scheduleName) {
    this.scheduleName = scheduleName;
  }


  public RetrieveSequentialRingCriteriaForAWorkspace200Response scheduleType(ScheduleTypeEnum scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }

  /**
   * This indicates the type of schedule.
   * @return scheduleType
   */
  @javax.annotation.Nonnull
  public ScheduleTypeEnum getScheduleType() {
    return scheduleType;
  }

  public void setScheduleType(ScheduleTypeEnum scheduleType) {
    this.scheduleType = scheduleType;
  }


  public RetrieveSequentialRingCriteriaForAWorkspace200Response scheduleLevel(ScheduleLevelEnum scheduleLevel) {
    this.scheduleLevel = scheduleLevel;
    return this;
  }

  /**
   * This indicates the level of the schedule specified by &#x60;scheduleName&#x60;.
   * @return scheduleLevel
   */
  @javax.annotation.Nonnull
  public ScheduleLevelEnum getScheduleLevel() {
    return scheduleLevel;
  }

  public void setScheduleLevel(ScheduleLevelEnum scheduleLevel) {
    this.scheduleLevel = scheduleLevel;
  }


  public RetrieveSequentialRingCriteriaForAWorkspace200Response callsFrom(CallsFromEnum callsFrom) {
    this.callsFrom = callsFrom;
    return this;
  }

  /**
   * This indicates if criteria are applicable for calls from any phone number or selected phone numbers.
   * @return callsFrom
   */
  @javax.annotation.Nonnull
  public CallsFromEnum getCallsFrom() {
    return callsFrom;
  }

  public void setCallsFrom(CallsFromEnum callsFrom) {
    this.callsFrom = callsFrom;
  }


  public RetrieveSequentialRingCriteriaForAWorkspace200Response anonymousCallersEnabled(Boolean anonymousCallersEnabled) {
    this.anonymousCallersEnabled = anonymousCallersEnabled;
    return this;
  }

  /**
   * When &#x60;true&#x60; incoming calls from private numbers are allowed. This is only applicable when &#x60;callsFrom&#x60; is set to &#x60;SELECT_PHONE_NUMBERS&#x60;.
   * @return anonymousCallersEnabled
   */
  @javax.annotation.Nullable
  public Boolean getAnonymousCallersEnabled() {
    return anonymousCallersEnabled;
  }

  public void setAnonymousCallersEnabled(Boolean anonymousCallersEnabled) {
    this.anonymousCallersEnabled = anonymousCallersEnabled;
  }


  public RetrieveSequentialRingCriteriaForAWorkspace200Response unavailableCallersEnabled(Boolean unavailableCallersEnabled) {
    this.unavailableCallersEnabled = unavailableCallersEnabled;
    return this;
  }

  /**
   * When &#x60;true&#x60; incoming calls from unavailable numbers are allowed. This is only applicable when &#x60;callsFrom&#x60; is set to &#x60;SELECT_PHONE_NUMBERS&#x60;.
   * @return unavailableCallersEnabled
   */
  @javax.annotation.Nullable
  public Boolean getUnavailableCallersEnabled() {
    return unavailableCallersEnabled;
  }

  public void setUnavailableCallersEnabled(Boolean unavailableCallersEnabled) {
    this.unavailableCallersEnabled = unavailableCallersEnabled;
  }


  public RetrieveSequentialRingCriteriaForAWorkspace200Response phoneNumbers(List<Object> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public RetrieveSequentialRingCriteriaForAWorkspace200Response addPhoneNumbersItem(Object phoneNumbersItem) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new ArrayList<>();
    }
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

  /**
   * When callsFrom is set to &#x60;SELECT_PHONE_NUMBERS&#x60;, indicates a list of incoming phone numbers for which the criteria apply.
   * @return phoneNumbers
   */
  @javax.annotation.Nullable
  public List<Object> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<Object> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  public RetrieveSequentialRingCriteriaForAWorkspace200Response ringEnabled(Boolean ringEnabled) {
    this.ringEnabled = ringEnabled;
    return this;
  }

  /**
   * When set to &#x60;true&#x60; sequential ringing is enabled for calls that meet the current criteria. Criteria with &#x60;ringEnabled&#x60; set to &#x60;false&#x60; take priority.
   * @return ringEnabled
   */
  @javax.annotation.Nonnull
  public Boolean getRingEnabled() {
    return ringEnabled;
  }

  public void setRingEnabled(Boolean ringEnabled) {
    this.ringEnabled = ringEnabled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveSequentialRingCriteriaForAWorkspace200Response retrieveSequentialRingCriteriaForAWorkspace200Response = (RetrieveSequentialRingCriteriaForAWorkspace200Response) o;
    return Objects.equals(this.id, retrieveSequentialRingCriteriaForAWorkspace200Response.id) &&
        Objects.equals(this.scheduleName, retrieveSequentialRingCriteriaForAWorkspace200Response.scheduleName) &&
        Objects.equals(this.scheduleType, retrieveSequentialRingCriteriaForAWorkspace200Response.scheduleType) &&
        Objects.equals(this.scheduleLevel, retrieveSequentialRingCriteriaForAWorkspace200Response.scheduleLevel) &&
        Objects.equals(this.callsFrom, retrieveSequentialRingCriteriaForAWorkspace200Response.callsFrom) &&
        Objects.equals(this.anonymousCallersEnabled, retrieveSequentialRingCriteriaForAWorkspace200Response.anonymousCallersEnabled) &&
        Objects.equals(this.unavailableCallersEnabled, retrieveSequentialRingCriteriaForAWorkspace200Response.unavailableCallersEnabled) &&
        Objects.equals(this.phoneNumbers, retrieveSequentialRingCriteriaForAWorkspace200Response.phoneNumbers) &&
        Objects.equals(this.ringEnabled, retrieveSequentialRingCriteriaForAWorkspace200Response.ringEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, scheduleName, scheduleType, scheduleLevel, callsFrom, anonymousCallersEnabled, unavailableCallersEnabled, phoneNumbers, ringEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveSequentialRingCriteriaForAWorkspace200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    scheduleName: ").append(toIndentedString(scheduleName)).append("\n");
    sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
    sb.append("    scheduleLevel: ").append(toIndentedString(scheduleLevel)).append("\n");
    sb.append("    callsFrom: ").append(toIndentedString(callsFrom)).append("\n");
    sb.append("    anonymousCallersEnabled: ").append(toIndentedString(anonymousCallersEnabled)).append("\n");
    sb.append("    unavailableCallersEnabled: ").append(toIndentedString(unavailableCallersEnabled)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    ringEnabled: ").append(toIndentedString(ringEnabled)).append("\n");
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
    openapiFields.add("scheduleName");
    openapiFields.add("scheduleType");
    openapiFields.add("scheduleLevel");
    openapiFields.add("callsFrom");
    openapiFields.add("anonymousCallersEnabled");
    openapiFields.add("unavailableCallersEnabled");
    openapiFields.add("phoneNumbers");
    openapiFields.add("ringEnabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("scheduleName");
    openapiRequiredFields.add("scheduleType");
    openapiRequiredFields.add("scheduleLevel");
    openapiRequiredFields.add("callsFrom");
    openapiRequiredFields.add("ringEnabled");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RetrieveSequentialRingCriteriaForAWorkspace200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RetrieveSequentialRingCriteriaForAWorkspace200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetrieveSequentialRingCriteriaForAWorkspace200Response is not found in the empty JSON string", RetrieveSequentialRingCriteriaForAWorkspace200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RetrieveSequentialRingCriteriaForAWorkspace200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RetrieveSequentialRingCriteriaForAWorkspace200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RetrieveSequentialRingCriteriaForAWorkspace200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("scheduleName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scheduleName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scheduleName").toString()));
      }
      if (!jsonObj.get("scheduleType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scheduleType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scheduleType").toString()));
      }
      // validate the required field `scheduleType`
      ScheduleTypeEnum.validateJsonElement(jsonObj.get("scheduleType"));
      if (!jsonObj.get("scheduleLevel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scheduleLevel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scheduleLevel").toString()));
      }
      // validate the required field `scheduleLevel`
      ScheduleLevelEnum.validateJsonElement(jsonObj.get("scheduleLevel"));
      if (!jsonObj.get("callsFrom").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callsFrom` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callsFrom").toString()));
      }
      // validate the required field `callsFrom`
      CallsFromEnum.validateJsonElement(jsonObj.get("callsFrom"));
      // ensure the optional json data is an array if present
      if (jsonObj.get("phoneNumbers") != null && !jsonObj.get("phoneNumbers").isJsonNull() && !jsonObj.get("phoneNumbers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumbers` to be an array in the JSON string but got `%s`", jsonObj.get("phoneNumbers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RetrieveSequentialRingCriteriaForAWorkspace200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetrieveSequentialRingCriteriaForAWorkspace200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetrieveSequentialRingCriteriaForAWorkspace200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetrieveSequentialRingCriteriaForAWorkspace200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<RetrieveSequentialRingCriteriaForAWorkspace200Response>() {
           @Override
           public void write(JsonWriter out, RetrieveSequentialRingCriteriaForAWorkspace200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RetrieveSequentialRingCriteriaForAWorkspace200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RetrieveSequentialRingCriteriaForAWorkspace200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RetrieveSequentialRingCriteriaForAWorkspace200Response
   * @throws IOException if the JSON string is invalid with respect to RetrieveSequentialRingCriteriaForAWorkspace200Response
   */
  public static RetrieveSequentialRingCriteriaForAWorkspace200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetrieveSequentialRingCriteriaForAWorkspace200Response.class);
  }

  /**
   * Convert an instance of RetrieveSequentialRingCriteriaForAWorkspace200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

