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
 * GetRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class GetRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData {
  public static final String SERIALIZED_NAME_ANNOUNCEMENT_FILENAME = "announcementFilename";
  @SerializedName(SERIALIZED_NAME_ANNOUNCEMENT_FILENAME)
  private String announcementFilename;

  public static final String SERIALIZED_NAME_ANNOUNCEMENT_TIMESTAMP = "announcementTimestamp";
  @SerializedName(SERIALIZED_NAME_ANNOUNCEMENT_TIMESTAMP)
  private String announcementTimestamp;

  public static final String SERIALIZED_NAME_ANNOUNCEMENT_PARTICIPANTS = "announcementParticipants";
  @SerializedName(SERIALIZED_NAME_ANNOUNCEMENT_PARTICIPANTS)
  private List<String> announcementParticipants = new ArrayList<>();

  public static final String SERIALIZED_NAME_ANNOUNCEMENT_TYPE = "announcementType";
  @SerializedName(SERIALIZED_NAME_ANNOUNCEMENT_TYPE)
  private String announcementType;

  public GetRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData() {
  }

  public GetRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData announcementFilename(String announcementFilename) {
    this.announcementFilename = announcementFilename;
    return this;
  }

  /**
   * Get announcementFilename
   * @return announcementFilename
   */
  @javax.annotation.Nullable
  public String getAnnouncementFilename() {
    return announcementFilename;
  }

  public void setAnnouncementFilename(String announcementFilename) {
    this.announcementFilename = announcementFilename;
  }


  public GetRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData announcementTimestamp(String announcementTimestamp) {
    this.announcementTimestamp = announcementTimestamp;
    return this;
  }

  /**
   * Get announcementTimestamp
   * @return announcementTimestamp
   */
  @javax.annotation.Nullable
  public String getAnnouncementTimestamp() {
    return announcementTimestamp;
  }

  public void setAnnouncementTimestamp(String announcementTimestamp) {
    this.announcementTimestamp = announcementTimestamp;
  }


  public GetRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData announcementParticipants(List<String> announcementParticipants) {
    this.announcementParticipants = announcementParticipants;
    return this;
  }

  public GetRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData addAnnouncementParticipantsItem(String announcementParticipantsItem) {
    if (this.announcementParticipants == null) {
      this.announcementParticipants = new ArrayList<>();
    }
    this.announcementParticipants.add(announcementParticipantsItem);
    return this;
  }

  /**
   * Get announcementParticipants
   * @return announcementParticipants
   */
  @javax.annotation.Nullable
  public List<String> getAnnouncementParticipants() {
    return announcementParticipants;
  }

  public void setAnnouncementParticipants(List<String> announcementParticipants) {
    this.announcementParticipants = announcementParticipants;
  }


  public GetRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData announcementType(String announcementType) {
    this.announcementType = announcementType;
    return this;
  }

  /**
   * Get announcementType
   * @return announcementType
   */
  @javax.annotation.Nullable
  public String getAnnouncementType() {
    return announcementType;
  }

  public void setAnnouncementType(String announcementType) {
    this.announcementType = announcementType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData getRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData = (GetRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData) o;
    return Objects.equals(this.announcementFilename, getRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData.announcementFilename) &&
        Objects.equals(this.announcementTimestamp, getRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData.announcementTimestamp) &&
        Objects.equals(this.announcementParticipants, getRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData.announcementParticipants) &&
        Objects.equals(this.announcementType, getRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData.announcementType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(announcementFilename, announcementTimestamp, announcementParticipants, announcementType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData {\n");
    sb.append("    announcementFilename: ").append(toIndentedString(announcementFilename)).append("\n");
    sb.append("    announcementTimestamp: ").append(toIndentedString(announcementTimestamp)).append("\n");
    sb.append("    announcementParticipants: ").append(toIndentedString(announcementParticipants)).append("\n");
    sb.append("    announcementType: ").append(toIndentedString(announcementType)).append("\n");
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
    openapiFields.add("announcementFilename");
    openapiFields.add("announcementTimestamp");
    openapiFields.add("announcementParticipants");
    openapiFields.add("announcementType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData is not found in the empty JSON string", GetRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("announcementFilename") != null && !jsonObj.get("announcementFilename").isJsonNull()) && !jsonObj.get("announcementFilename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `announcementFilename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("announcementFilename").toString()));
      }
      if ((jsonObj.get("announcementTimestamp") != null && !jsonObj.get("announcementTimestamp").isJsonNull()) && !jsonObj.get("announcementTimestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `announcementTimestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("announcementTimestamp").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("announcementParticipants") != null && !jsonObj.get("announcementParticipants").isJsonNull() && !jsonObj.get("announcementParticipants").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `announcementParticipants` to be an array in the JSON string but got `%s`", jsonObj.get("announcementParticipants").toString()));
      }
      if ((jsonObj.get("announcementType") != null && !jsonObj.get("announcementType").isJsonNull()) && !jsonObj.get("announcementType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `announcementType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("announcementType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData.class));

       return (TypeAdapter<T>) new TypeAdapter<GetRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData>() {
           @Override
           public void write(JsonWriter out, GetRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData
   * @throws IOException if the JSON string is invalid with respect to GetRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData
   */
  public static GetRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData.class);
  }

  /**
   * Convert an instance of GetRecordingMetadata200ResponseServiceDataCallActivityInnerAnnouncementData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

