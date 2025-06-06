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
 * FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FILE_NAME = "fileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_FILE_SIZE = "fileSize";
  @SerializedName(SERIALIZED_NAME_FILE_SIZE)
  private String fileSize;

  public static final String SERIALIZED_NAME_MEDIA_FILE_TYPE = "mediaFileType";
  @SerializedName(SERIALIZED_NAME_MEDIA_FILE_TYPE)
  private String mediaFileType;

  public static final String SERIALIZED_NAME_LAST_UPDATED = "lastUpdated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private String lastUpdated;

  public static final String SERIALIZED_NAME_FEATURE_REFERENCE_COUNT = "featureReferenceCount";
  @SerializedName(SERIALIZED_NAME_FEATURE_REFERENCE_COUNT)
  private BigDecimal featureReferenceCount;

  public static final String SERIALIZED_NAME_FEATURE_REFERENCES = "featureReferences";
  @SerializedName(SERIALIZED_NAME_FEATURE_REFERENCES)
  private List<Object> featureReferences = new ArrayList<>();

  public FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response() {
  }

  public FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the announcement.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the announcement.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * File name of the uploaded binary announcement greeting.
   * @return fileName
   */
  @javax.annotation.Nullable
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response fileSize(String fileSize) {
    this.fileSize = fileSize;
    return this;
  }

  /**
   * Size of the file in kilobytes.
   * @return fileSize
   */
  @javax.annotation.Nonnull
  public String getFileSize() {
    return fileSize;
  }

  public void setFileSize(String fileSize) {
    this.fileSize = fileSize;
  }


  public FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response mediaFileType(String mediaFileType) {
    this.mediaFileType = mediaFileType;
    return this;
  }

  /**
   * Media file type of the announcement file.
   * @return mediaFileType
   */
  @javax.annotation.Nonnull
  public String getMediaFileType() {
    return mediaFileType;
  }

  public void setMediaFileType(String mediaFileType) {
    this.mediaFileType = mediaFileType;
  }


  public FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response lastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * Last updated timestamp (in UTC format) of the announcement.
   * @return lastUpdated
   */
  @javax.annotation.Nonnull
  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  public FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response featureReferenceCount(BigDecimal featureReferenceCount) {
    this.featureReferenceCount = featureReferenceCount;
    return this;
  }

  /**
   * Reference count of the call features this announcement is assigned to.
   * @return featureReferenceCount
   */
  @javax.annotation.Nonnull
  public BigDecimal getFeatureReferenceCount() {
    return featureReferenceCount;
  }

  public void setFeatureReferenceCount(BigDecimal featureReferenceCount) {
    this.featureReferenceCount = featureReferenceCount;
  }


  public FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response featureReferences(List<Object> featureReferences) {
    this.featureReferences = featureReferences;
    return this;
  }

  public FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response addFeatureReferencesItem(Object featureReferencesItem) {
    if (this.featureReferences == null) {
      this.featureReferences = new ArrayList<>();
    }
    this.featureReferences.add(featureReferencesItem);
    return this;
  }

  /**
   * Call features referenced by this announcement.
   * @return featureReferences
   */
  @javax.annotation.Nullable
  public List<Object> getFeatureReferences() {
    return featureReferences;
  }

  public void setFeatureReferences(List<Object> featureReferences) {
    this.featureReferences = featureReferences;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response fetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response = (FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response) o;
    return Objects.equals(this.id, fetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response.id) &&
        Objects.equals(this.name, fetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response.name) &&
        Objects.equals(this.fileName, fetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response.fileName) &&
        Objects.equals(this.fileSize, fetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response.fileSize) &&
        Objects.equals(this.mediaFileType, fetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response.mediaFileType) &&
        Objects.equals(this.lastUpdated, fetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response.lastUpdated) &&
        Objects.equals(this.featureReferenceCount, fetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response.featureReferenceCount) &&
        Objects.equals(this.featureReferences, fetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response.featureReferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, fileName, fileSize, mediaFileType, lastUpdated, featureReferenceCount, featureReferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    mediaFileType: ").append(toIndentedString(mediaFileType)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    featureReferenceCount: ").append(toIndentedString(featureReferenceCount)).append("\n");
    sb.append("    featureReferences: ").append(toIndentedString(featureReferences)).append("\n");
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
    openapiFields.add("fileName");
    openapiFields.add("fileSize");
    openapiFields.add("mediaFileType");
    openapiFields.add("lastUpdated");
    openapiFields.add("featureReferenceCount");
    openapiFields.add("featureReferences");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("fileSize");
    openapiRequiredFields.add("mediaFileType");
    openapiRequiredFields.add("lastUpdated");
    openapiRequiredFields.add("featureReferenceCount");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response is not found in the empty JSON string", FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response.openapiRequiredFields) {
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
      if ((jsonObj.get("fileName") != null && !jsonObj.get("fileName").isJsonNull()) && !jsonObj.get("fileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileName").toString()));
      }
      if (!jsonObj.get("fileSize").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileSize` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileSize").toString()));
      }
      if (!jsonObj.get("mediaFileType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mediaFileType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mediaFileType").toString()));
      }
      if (!jsonObj.get("lastUpdated").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastUpdated` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastUpdated").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("featureReferences") != null && !jsonObj.get("featureReferences").isJsonNull() && !jsonObj.get("featureReferences").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `featureReferences` to be an array in the JSON string but got `%s`", jsonObj.get("featureReferences").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response>() {
           @Override
           public void write(JsonWriter out, FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response
   * @throws IOException if the JSON string is invalid with respect to FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response
   */
  public static FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response.class);
  }

  /**
   * Convert an instance of FetchDetailsOfABinaryAnnouncementGreetingAtTheOrganizationLevel200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

