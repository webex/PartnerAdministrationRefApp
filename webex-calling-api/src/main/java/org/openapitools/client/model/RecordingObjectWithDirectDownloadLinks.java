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
import org.openapitools.client.model.GetRecordingDetails200ResponseTemporaryDirectDownloadLinks;
import org.openapitools.client.model.ListRecordingsForComplianceOfficer200ResponseItemsInnerServiceData;

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
 * RecordingObjectWithDirectDownloadLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class RecordingObjectWithDirectDownloadLinks {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TOPIC = "topic";
  @SerializedName(SERIALIZED_NAME_TOPIC)
  private String topic;

  public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_TIME_RECORDED = "timeRecorded";
  @SerializedName(SERIALIZED_NAME_TIME_RECORDED)
  private String timeRecorded;

  /**
   * Gets or Sets format
   */
  @JsonAdapter(FormatEnum.Adapter.class)
  public enum FormatEnum {
    MP3("MP3");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FormatEnum fromValue(String value) {
      for (FormatEnum b : FormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FormatEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      FormatEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private FormatEnum format;

  /**
   * Gets or Sets serviceType
   */
  @JsonAdapter(ServiceTypeEnum.Adapter.class)
  public enum ServiceTypeEnum {
    CALLING("calling");

    private String value;

    ServiceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ServiceTypeEnum fromValue(String value) {
      for (ServiceTypeEnum b : ServiceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ServiceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ServiceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ServiceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ServiceTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ServiceTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SERVICE_TYPE = "serviceType";
  @SerializedName(SERIALIZED_NAME_SERVICE_TYPE)
  private ServiceTypeEnum serviceType;

  public static final String SERIALIZED_NAME_DURATION_SECONDS = "durationSeconds";
  @SerializedName(SERIALIZED_NAME_DURATION_SECONDS)
  private BigDecimal durationSeconds;

  public static final String SERIALIZED_NAME_SIZE_BYTES = "sizeBytes";
  @SerializedName(SERIALIZED_NAME_SIZE_BYTES)
  private BigDecimal sizeBytes;

  public static final String SERIALIZED_NAME_TEMPORARY_DIRECT_DOWNLOAD_LINKS = "temporaryDirectDownloadLinks";
  @SerializedName(SERIALIZED_NAME_TEMPORARY_DIRECT_DOWNLOAD_LINKS)
  private GetRecordingDetails200ResponseTemporaryDirectDownloadLinks temporaryDirectDownloadLinks;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    AVAILABLE("available"),
    
    DELETED("deleted");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_OWNER_ID = "ownerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_OWNER_EMAIL = "ownerEmail";
  @SerializedName(SERIALIZED_NAME_OWNER_EMAIL)
  private String ownerEmail;

  /**
   * Gets or Sets ownerType
   */
  @JsonAdapter(OwnerTypeEnum.Adapter.class)
  public enum OwnerTypeEnum {
    USER("user"),
    
    PLACE("place"),
    
    VIRTUAL_LINE("virtualLine");

    private String value;

    OwnerTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OwnerTypeEnum fromValue(String value) {
      for (OwnerTypeEnum b : OwnerTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OwnerTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OwnerTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OwnerTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OwnerTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      OwnerTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_OWNER_TYPE = "ownerType";
  @SerializedName(SERIALIZED_NAME_OWNER_TYPE)
  private OwnerTypeEnum ownerType;

  public static final String SERIALIZED_NAME_STORAGE_REGION = "storageRegion";
  @SerializedName(SERIALIZED_NAME_STORAGE_REGION)
  private String storageRegion;

  public static final String SERIALIZED_NAME_SERVICE_DATA = "serviceData";
  @SerializedName(SERIALIZED_NAME_SERVICE_DATA)
  private ListRecordingsForComplianceOfficer200ResponseItemsInnerServiceData serviceData;

  public RecordingObjectWithDirectDownloadLinks() {
  }

  public RecordingObjectWithDirectDownloadLinks id(String id) {
    this.id = id;
    return this;
  }

  /**
   * A unique identifier for recording.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public RecordingObjectWithDirectDownloadLinks topic(String topic) {
    this.topic = topic;
    return this;
  }

  /**
   * The recording&#39;s topic.
   * @return topic
   */
  @javax.annotation.Nonnull
  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }


  public RecordingObjectWithDirectDownloadLinks createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The date and time recording was created in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) compliant format. Please note that it&#39;s not the time the record button was clicked in meeting but the time the recording file was generated offline.
   * @return createTime
   */
  @javax.annotation.Nonnull
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public RecordingObjectWithDirectDownloadLinks timeRecorded(String timeRecorded) {
    this.timeRecorded = timeRecorded;
    return this;
  }

  /**
   * The date and time recording started in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) compliant format. It indicates when the record button was clicked in the meeting.
   * @return timeRecorded
   */
  @javax.annotation.Nonnull
  public String getTimeRecorded() {
    return timeRecorded;
  }

  public void setTimeRecorded(String timeRecorded) {
    this.timeRecorded = timeRecorded;
  }


  public RecordingObjectWithDirectDownloadLinks format(FormatEnum format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
   */
  @javax.annotation.Nonnull
  public FormatEnum getFormat() {
    return format;
  }

  public void setFormat(FormatEnum format) {
    this.format = format;
  }


  public RecordingObjectWithDirectDownloadLinks serviceType(ServiceTypeEnum serviceType) {
    this.serviceType = serviceType;
    return this;
  }

  /**
   * Get serviceType
   * @return serviceType
   */
  @javax.annotation.Nonnull
  public ServiceTypeEnum getServiceType() {
    return serviceType;
  }

  public void setServiceType(ServiceTypeEnum serviceType) {
    this.serviceType = serviceType;
  }


  public RecordingObjectWithDirectDownloadLinks durationSeconds(BigDecimal durationSeconds) {
    this.durationSeconds = durationSeconds;
    return this;
  }

  /**
   * The duration of the recording in seconds.
   * @return durationSeconds
   */
  @javax.annotation.Nonnull
  public BigDecimal getDurationSeconds() {
    return durationSeconds;
  }

  public void setDurationSeconds(BigDecimal durationSeconds) {
    this.durationSeconds = durationSeconds;
  }


  public RecordingObjectWithDirectDownloadLinks sizeBytes(BigDecimal sizeBytes) {
    this.sizeBytes = sizeBytes;
    return this;
  }

  /**
   * The size of the recording file in bytes.
   * @return sizeBytes
   */
  @javax.annotation.Nonnull
  public BigDecimal getSizeBytes() {
    return sizeBytes;
  }

  public void setSizeBytes(BigDecimal sizeBytes) {
    this.sizeBytes = sizeBytes;
  }


  public RecordingObjectWithDirectDownloadLinks temporaryDirectDownloadLinks(GetRecordingDetails200ResponseTemporaryDirectDownloadLinks temporaryDirectDownloadLinks) {
    this.temporaryDirectDownloadLinks = temporaryDirectDownloadLinks;
    return this;
  }

  /**
   * Get temporaryDirectDownloadLinks
   * @return temporaryDirectDownloadLinks
   */
  @javax.annotation.Nullable
  public GetRecordingDetails200ResponseTemporaryDirectDownloadLinks getTemporaryDirectDownloadLinks() {
    return temporaryDirectDownloadLinks;
  }

  public void setTemporaryDirectDownloadLinks(GetRecordingDetails200ResponseTemporaryDirectDownloadLinks temporaryDirectDownloadLinks) {
    this.temporaryDirectDownloadLinks = temporaryDirectDownloadLinks;
  }


  public RecordingObjectWithDirectDownloadLinks status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public RecordingObjectWithDirectDownloadLinks ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * Webex UUID for recording owner/host.
   * @return ownerId
   */
  @javax.annotation.Nonnull
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  public RecordingObjectWithDirectDownloadLinks ownerEmail(String ownerEmail) {
    this.ownerEmail = ownerEmail;
    return this;
  }

  /**
   * Webex email for recording owner/host.
   * @return ownerEmail
   */
  @javax.annotation.Nonnull
  public String getOwnerEmail() {
    return ownerEmail;
  }

  public void setOwnerEmail(String ownerEmail) {
    this.ownerEmail = ownerEmail;
  }


  public RecordingObjectWithDirectDownloadLinks ownerType(OwnerTypeEnum ownerType) {
    this.ownerType = ownerType;
    return this;
  }

  /**
   * Get ownerType
   * @return ownerType
   */
  @javax.annotation.Nonnull
  public OwnerTypeEnum getOwnerType() {
    return ownerType;
  }

  public void setOwnerType(OwnerTypeEnum ownerType) {
    this.ownerType = ownerType;
  }


  public RecordingObjectWithDirectDownloadLinks storageRegion(String storageRegion) {
    this.storageRegion = storageRegion;
    return this;
  }

  /**
   * Storage location for recording within Webex datacenters.
   * @return storageRegion
   */
  @javax.annotation.Nonnull
  public String getStorageRegion() {
    return storageRegion;
  }

  public void setStorageRegion(String storageRegion) {
    this.storageRegion = storageRegion;
  }


  public RecordingObjectWithDirectDownloadLinks serviceData(ListRecordingsForComplianceOfficer200ResponseItemsInnerServiceData serviceData) {
    this.serviceData = serviceData;
    return this;
  }

  /**
   * Get serviceData
   * @return serviceData
   */
  @javax.annotation.Nullable
  public ListRecordingsForComplianceOfficer200ResponseItemsInnerServiceData getServiceData() {
    return serviceData;
  }

  public void setServiceData(ListRecordingsForComplianceOfficer200ResponseItemsInnerServiceData serviceData) {
    this.serviceData = serviceData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingObjectWithDirectDownloadLinks recordingObjectWithDirectDownloadLinks = (RecordingObjectWithDirectDownloadLinks) o;
    return Objects.equals(this.id, recordingObjectWithDirectDownloadLinks.id) &&
        Objects.equals(this.topic, recordingObjectWithDirectDownloadLinks.topic) &&
        Objects.equals(this.createTime, recordingObjectWithDirectDownloadLinks.createTime) &&
        Objects.equals(this.timeRecorded, recordingObjectWithDirectDownloadLinks.timeRecorded) &&
        Objects.equals(this.format, recordingObjectWithDirectDownloadLinks.format) &&
        Objects.equals(this.serviceType, recordingObjectWithDirectDownloadLinks.serviceType) &&
        Objects.equals(this.durationSeconds, recordingObjectWithDirectDownloadLinks.durationSeconds) &&
        Objects.equals(this.sizeBytes, recordingObjectWithDirectDownloadLinks.sizeBytes) &&
        Objects.equals(this.temporaryDirectDownloadLinks, recordingObjectWithDirectDownloadLinks.temporaryDirectDownloadLinks) &&
        Objects.equals(this.status, recordingObjectWithDirectDownloadLinks.status) &&
        Objects.equals(this.ownerId, recordingObjectWithDirectDownloadLinks.ownerId) &&
        Objects.equals(this.ownerEmail, recordingObjectWithDirectDownloadLinks.ownerEmail) &&
        Objects.equals(this.ownerType, recordingObjectWithDirectDownloadLinks.ownerType) &&
        Objects.equals(this.storageRegion, recordingObjectWithDirectDownloadLinks.storageRegion) &&
        Objects.equals(this.serviceData, recordingObjectWithDirectDownloadLinks.serviceData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, topic, createTime, timeRecorded, format, serviceType, durationSeconds, sizeBytes, temporaryDirectDownloadLinks, status, ownerId, ownerEmail, ownerType, storageRegion, serviceData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingObjectWithDirectDownloadLinks {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    timeRecorded: ").append(toIndentedString(timeRecorded)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
    sb.append("    sizeBytes: ").append(toIndentedString(sizeBytes)).append("\n");
    sb.append("    temporaryDirectDownloadLinks: ").append(toIndentedString(temporaryDirectDownloadLinks)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    ownerEmail: ").append(toIndentedString(ownerEmail)).append("\n");
    sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
    sb.append("    storageRegion: ").append(toIndentedString(storageRegion)).append("\n");
    sb.append("    serviceData: ").append(toIndentedString(serviceData)).append("\n");
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
    openapiFields.add("topic");
    openapiFields.add("createTime");
    openapiFields.add("timeRecorded");
    openapiFields.add("format");
    openapiFields.add("serviceType");
    openapiFields.add("durationSeconds");
    openapiFields.add("sizeBytes");
    openapiFields.add("temporaryDirectDownloadLinks");
    openapiFields.add("status");
    openapiFields.add("ownerId");
    openapiFields.add("ownerEmail");
    openapiFields.add("ownerType");
    openapiFields.add("storageRegion");
    openapiFields.add("serviceData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("topic");
    openapiRequiredFields.add("createTime");
    openapiRequiredFields.add("timeRecorded");
    openapiRequiredFields.add("format");
    openapiRequiredFields.add("serviceType");
    openapiRequiredFields.add("durationSeconds");
    openapiRequiredFields.add("sizeBytes");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("ownerId");
    openapiRequiredFields.add("ownerEmail");
    openapiRequiredFields.add("ownerType");
    openapiRequiredFields.add("storageRegion");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RecordingObjectWithDirectDownloadLinks
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RecordingObjectWithDirectDownloadLinks.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecordingObjectWithDirectDownloadLinks is not found in the empty JSON string", RecordingObjectWithDirectDownloadLinks.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RecordingObjectWithDirectDownloadLinks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecordingObjectWithDirectDownloadLinks` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RecordingObjectWithDirectDownloadLinks.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("topic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `topic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("topic").toString()));
      }
      if (!jsonObj.get("createTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createTime").toString()));
      }
      if (!jsonObj.get("timeRecorded").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeRecorded` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeRecorded").toString()));
      }
      if (!jsonObj.get("format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("format").toString()));
      }
      // validate the required field `format`
      FormatEnum.validateJsonElement(jsonObj.get("format"));
      if (!jsonObj.get("serviceType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceType").toString()));
      }
      // validate the required field `serviceType`
      ServiceTypeEnum.validateJsonElement(jsonObj.get("serviceType"));
      // validate the optional field `temporaryDirectDownloadLinks`
      if (jsonObj.get("temporaryDirectDownloadLinks") != null && !jsonObj.get("temporaryDirectDownloadLinks").isJsonNull()) {
        GetRecordingDetails200ResponseTemporaryDirectDownloadLinks.validateJsonElement(jsonObj.get("temporaryDirectDownloadLinks"));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the required field `status`
      StatusEnum.validateJsonElement(jsonObj.get("status"));
      if (!jsonObj.get("ownerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownerId").toString()));
      }
      if (!jsonObj.get("ownerEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownerEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownerEmail").toString()));
      }
      if (!jsonObj.get("ownerType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownerType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownerType").toString()));
      }
      // validate the required field `ownerType`
      OwnerTypeEnum.validateJsonElement(jsonObj.get("ownerType"));
      if (!jsonObj.get("storageRegion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storageRegion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storageRegion").toString()));
      }
      // validate the optional field `serviceData`
      if (jsonObj.get("serviceData") != null && !jsonObj.get("serviceData").isJsonNull()) {
        ListRecordingsForComplianceOfficer200ResponseItemsInnerServiceData.validateJsonElement(jsonObj.get("serviceData"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecordingObjectWithDirectDownloadLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecordingObjectWithDirectDownloadLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecordingObjectWithDirectDownloadLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecordingObjectWithDirectDownloadLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<RecordingObjectWithDirectDownloadLinks>() {
           @Override
           public void write(JsonWriter out, RecordingObjectWithDirectDownloadLinks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecordingObjectWithDirectDownloadLinks read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RecordingObjectWithDirectDownloadLinks given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RecordingObjectWithDirectDownloadLinks
   * @throws IOException if the JSON string is invalid with respect to RecordingObjectWithDirectDownloadLinks
   */
  public static RecordingObjectWithDirectDownloadLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecordingObjectWithDirectDownloadLinks.class);
  }

  /**
   * Convert an instance of RecordingObjectWithDirectDownloadLinks to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

