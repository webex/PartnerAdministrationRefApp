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
 * GetRecordingAuditReportDetails200ResponseItemsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class GetRecordingAuditReportDetails200ResponseItemsInner {
  public static final String SERIALIZED_NAME_RECORDING_ID = "recordingId";
  @SerializedName(SERIALIZED_NAME_RECORDING_ID)
  private String recordingId;

  public static final String SERIALIZED_NAME_TOPIC = "topic";
  @SerializedName(SERIALIZED_NAME_TOPIC)
  private String topic;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ACCESS_TIME = "accessTime";
  @SerializedName(SERIALIZED_NAME_ACCESS_TIME)
  private String accessTime;

  public static final String SERIALIZED_NAME_VIEWED = "viewed";
  @SerializedName(SERIALIZED_NAME_VIEWED)
  private Boolean viewed;

  public static final String SERIALIZED_NAME_DOWNLOADED = "downloaded";
  @SerializedName(SERIALIZED_NAME_DOWNLOADED)
  private Boolean downloaded;

  public GetRecordingAuditReportDetails200ResponseItemsInner() {
  }

  public GetRecordingAuditReportDetails200ResponseItemsInner recordingId(String recordingId) {
    this.recordingId = recordingId;
    return this;
  }

  /**
   * A unique identifier for the recording.
   * @return recordingId
   */
  @javax.annotation.Nullable
  public String getRecordingId() {
    return recordingId;
  }

  public void setRecordingId(String recordingId) {
    this.recordingId = recordingId;
  }


  public GetRecordingAuditReportDetails200ResponseItemsInner topic(String topic) {
    this.topic = topic;
    return this;
  }

  /**
   * The recording&#39;s topic.
   * @return topic
   */
  @javax.annotation.Nullable
  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }


  public GetRecordingAuditReportDetails200ResponseItemsInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the person who accessed the recording.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public GetRecordingAuditReportDetails200ResponseItemsInner email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address of the person who accessed the recording.
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public GetRecordingAuditReportDetails200ResponseItemsInner accessTime(String accessTime) {
    this.accessTime = accessTime;
    return this;
  }

  /**
   * The date and time the recording was accessed in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) compliant format.
   * @return accessTime
   */
  @javax.annotation.Nullable
  public String getAccessTime() {
    return accessTime;
  }

  public void setAccessTime(String accessTime) {
    this.accessTime = accessTime;
  }


  public GetRecordingAuditReportDetails200ResponseItemsInner viewed(Boolean viewed) {
    this.viewed = viewed;
    return this;
  }

  /**
   * Whether or not the recording was viewed by the person.
   * @return viewed
   */
  @javax.annotation.Nullable
  public Boolean getViewed() {
    return viewed;
  }

  public void setViewed(Boolean viewed) {
    this.viewed = viewed;
  }


  public GetRecordingAuditReportDetails200ResponseItemsInner downloaded(Boolean downloaded) {
    this.downloaded = downloaded;
    return this;
  }

  /**
   * Whether or not the recording was downloaded by the person.
   * @return downloaded
   */
  @javax.annotation.Nullable
  public Boolean getDownloaded() {
    return downloaded;
  }

  public void setDownloaded(Boolean downloaded) {
    this.downloaded = downloaded;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecordingAuditReportDetails200ResponseItemsInner getRecordingAuditReportDetails200ResponseItemsInner = (GetRecordingAuditReportDetails200ResponseItemsInner) o;
    return Objects.equals(this.recordingId, getRecordingAuditReportDetails200ResponseItemsInner.recordingId) &&
        Objects.equals(this.topic, getRecordingAuditReportDetails200ResponseItemsInner.topic) &&
        Objects.equals(this.name, getRecordingAuditReportDetails200ResponseItemsInner.name) &&
        Objects.equals(this.email, getRecordingAuditReportDetails200ResponseItemsInner.email) &&
        Objects.equals(this.accessTime, getRecordingAuditReportDetails200ResponseItemsInner.accessTime) &&
        Objects.equals(this.viewed, getRecordingAuditReportDetails200ResponseItemsInner.viewed) &&
        Objects.equals(this.downloaded, getRecordingAuditReportDetails200ResponseItemsInner.downloaded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordingId, topic, name, email, accessTime, viewed, downloaded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecordingAuditReportDetails200ResponseItemsInner {\n");
    sb.append("    recordingId: ").append(toIndentedString(recordingId)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    accessTime: ").append(toIndentedString(accessTime)).append("\n");
    sb.append("    viewed: ").append(toIndentedString(viewed)).append("\n");
    sb.append("    downloaded: ").append(toIndentedString(downloaded)).append("\n");
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
    openapiFields.add("recordingId");
    openapiFields.add("topic");
    openapiFields.add("name");
    openapiFields.add("email");
    openapiFields.add("accessTime");
    openapiFields.add("viewed");
    openapiFields.add("downloaded");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetRecordingAuditReportDetails200ResponseItemsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetRecordingAuditReportDetails200ResponseItemsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetRecordingAuditReportDetails200ResponseItemsInner is not found in the empty JSON string", GetRecordingAuditReportDetails200ResponseItemsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetRecordingAuditReportDetails200ResponseItemsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetRecordingAuditReportDetails200ResponseItemsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("recordingId") != null && !jsonObj.get("recordingId").isJsonNull()) && !jsonObj.get("recordingId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recordingId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recordingId").toString()));
      }
      if ((jsonObj.get("topic") != null && !jsonObj.get("topic").isJsonNull()) && !jsonObj.get("topic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `topic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("topic").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("accessTime") != null && !jsonObj.get("accessTime").isJsonNull()) && !jsonObj.get("accessTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accessTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accessTime").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetRecordingAuditReportDetails200ResponseItemsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetRecordingAuditReportDetails200ResponseItemsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetRecordingAuditReportDetails200ResponseItemsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetRecordingAuditReportDetails200ResponseItemsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetRecordingAuditReportDetails200ResponseItemsInner>() {
           @Override
           public void write(JsonWriter out, GetRecordingAuditReportDetails200ResponseItemsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetRecordingAuditReportDetails200ResponseItemsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetRecordingAuditReportDetails200ResponseItemsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetRecordingAuditReportDetails200ResponseItemsInner
   * @throws IOException if the JSON string is invalid with respect to GetRecordingAuditReportDetails200ResponseItemsInner
   */
  public static GetRecordingAuditReportDetails200ResponseItemsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetRecordingAuditReportDetails200ResponseItemsInner.class);
  }

  /**
   * Convert an instance of GetRecordingAuditReportDetails200ResponseItemsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

