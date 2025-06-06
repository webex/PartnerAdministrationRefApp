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
import java.math.BigDecimal;
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
 * MeetingRecordingArchiveParticipant
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class MeetingRecordingArchiveParticipant {
  public static final String SERIALIZED_NAME_CORRELATION_ID = "correlationId";
  @SerializedName(SERIALIZED_NAME_CORRELATION_ID)
  private BigDecimal correlationId;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_JOINED_TIME = "joinedTime";
  @SerializedName(SERIALIZED_NAME_JOINED_TIME)
  private String joinedTime;

  public static final String SERIALIZED_NAME_LEFT_TIME = "leftTime";
  @SerializedName(SERIALIZED_NAME_LEFT_TIME)
  private String leftTime;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public MeetingRecordingArchiveParticipant() {
  }

  public MeetingRecordingArchiveParticipant correlationId(BigDecimal correlationId) {
    this.correlationId = correlationId;
    return this;
  }

  /**
   * An internal ID that is associated with each join.
   * @return correlationId
   */
  @javax.annotation.Nullable
  public BigDecimal getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(BigDecimal correlationId) {
    this.correlationId = correlationId;
  }


  public MeetingRecordingArchiveParticipant displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Display name for the meeting participant.
   * @return displayName
   */
  @javax.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public MeetingRecordingArchiveParticipant joinedTime(String joinedTime) {
    this.joinedTime = joinedTime;
    return this;
  }

  /**
   * The time the participant joined the meeting.
   * @return joinedTime
   */
  @javax.annotation.Nullable
  public String getJoinedTime() {
    return joinedTime;
  }

  public void setJoinedTime(String joinedTime) {
    this.joinedTime = joinedTime;
  }


  public MeetingRecordingArchiveParticipant leftTime(String leftTime) {
    this.leftTime = leftTime;
    return this;
  }

  /**
   * The time the participant left the meeting.
   * @return leftTime
   */
  @javax.annotation.Nullable
  public String getLeftTime() {
    return leftTime;
  }

  public void setLeftTime(String leftTime) {
    this.leftTime = leftTime;
  }


  public MeetingRecordingArchiveParticipant email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email address for the meeting participant.
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeetingRecordingArchiveParticipant meetingRecordingArchiveParticipant = (MeetingRecordingArchiveParticipant) o;
    return Objects.equals(this.correlationId, meetingRecordingArchiveParticipant.correlationId) &&
        Objects.equals(this.displayName, meetingRecordingArchiveParticipant.displayName) &&
        Objects.equals(this.joinedTime, meetingRecordingArchiveParticipant.joinedTime) &&
        Objects.equals(this.leftTime, meetingRecordingArchiveParticipant.leftTime) &&
        Objects.equals(this.email, meetingRecordingArchiveParticipant.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correlationId, displayName, joinedTime, leftTime, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeetingRecordingArchiveParticipant {\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    joinedTime: ").append(toIndentedString(joinedTime)).append("\n");
    sb.append("    leftTime: ").append(toIndentedString(leftTime)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
    openapiFields.add("correlationId");
    openapiFields.add("displayName");
    openapiFields.add("joinedTime");
    openapiFields.add("leftTime");
    openapiFields.add("email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MeetingRecordingArchiveParticipant
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MeetingRecordingArchiveParticipant.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MeetingRecordingArchiveParticipant is not found in the empty JSON string", MeetingRecordingArchiveParticipant.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MeetingRecordingArchiveParticipant.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MeetingRecordingArchiveParticipant` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("joinedTime") != null && !jsonObj.get("joinedTime").isJsonNull()) && !jsonObj.get("joinedTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `joinedTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("joinedTime").toString()));
      }
      if ((jsonObj.get("leftTime") != null && !jsonObj.get("leftTime").isJsonNull()) && !jsonObj.get("leftTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `leftTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("leftTime").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MeetingRecordingArchiveParticipant.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MeetingRecordingArchiveParticipant' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MeetingRecordingArchiveParticipant> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MeetingRecordingArchiveParticipant.class));

       return (TypeAdapter<T>) new TypeAdapter<MeetingRecordingArchiveParticipant>() {
           @Override
           public void write(JsonWriter out, MeetingRecordingArchiveParticipant value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MeetingRecordingArchiveParticipant read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MeetingRecordingArchiveParticipant given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MeetingRecordingArchiveParticipant
   * @throws IOException if the JSON string is invalid with respect to MeetingRecordingArchiveParticipant
   */
  public static MeetingRecordingArchiveParticipant fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MeetingRecordingArchiveParticipant.class);
  }

  /**
   * Convert an instance of MeetingRecordingArchiveParticipant to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

