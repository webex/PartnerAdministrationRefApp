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
import org.openapitools.client.model.StepExecutionStatusesObject;

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
 * JobExecutionStatusObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class JobExecutionStatusObject {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private BigDecimal id;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_LAST_UPDATED = "lastUpdated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private String lastUpdated;

  public static final String SERIALIZED_NAME_STATUS_MESSAGE = "statusMessage";
  @SerializedName(SERIALIZED_NAME_STATUS_MESSAGE)
  private String statusMessage;

  public static final String SERIALIZED_NAME_EXIT_CODE = "exitCode";
  @SerializedName(SERIALIZED_NAME_EXIT_CODE)
  private String exitCode;

  public static final String SERIALIZED_NAME_CREATED_TIME = "createdTime";
  @SerializedName(SERIALIZED_NAME_CREATED_TIME)
  private String createdTime;

  public static final String SERIALIZED_NAME_TIME_ELAPSED = "timeElapsed";
  @SerializedName(SERIALIZED_NAME_TIME_ELAPSED)
  private String timeElapsed;

  public static final String SERIALIZED_NAME_STEP_EXECUTION_STATUSES = "stepExecutionStatuses";
  @SerializedName(SERIALIZED_NAME_STEP_EXECUTION_STATUSES)
  private List<StepExecutionStatusesObject> stepExecutionStatuses = new ArrayList<>();

  public JobExecutionStatusObject() {
  }

  public JobExecutionStatusObject id(BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier that identifies each instance of the job.
   * @return id
   */
  @javax.annotation.Nonnull
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }


  public JobExecutionStatusObject startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * The date and time with seconds, the job has started in UTC format.
   * @return startTime
   */
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public JobExecutionStatusObject endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The date and time with seconds, the job has ended in UTC format.
   * @return endTime
   */
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public JobExecutionStatusObject lastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * The date and time with seconds, the job has last updated in UTC format post one of the step execution completion.
   * @return lastUpdated
   */
  @javax.annotation.Nullable
  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  public JobExecutionStatusObject statusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  /**
   * Displays status for overall steps that are part of the job.
   * @return statusMessage
   */
  @javax.annotation.Nullable
  public String getStatusMessage() {
    return statusMessage;
  }

  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }


  public JobExecutionStatusObject exitCode(String exitCode) {
    this.exitCode = exitCode;
    return this;
  }

  /**
   * Exit Code for a job.
   * @return exitCode
   */
  @javax.annotation.Nullable
  public String getExitCode() {
    return exitCode;
  }

  public void setExitCode(String exitCode) {
    this.exitCode = exitCode;
  }


  public JobExecutionStatusObject createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * The date and time with seconds, the job has created in UTC format.
   * @return createdTime
   */
  @javax.annotation.Nullable
  public String getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }


  public JobExecutionStatusObject timeElapsed(String timeElapsed) {
    this.timeElapsed = timeElapsed;
    return this;
  }

  /**
   * Time lapsed in seconds since the job execution started.
   * @return timeElapsed
   */
  @javax.annotation.Nullable
  public String getTimeElapsed() {
    return timeElapsed;
  }

  public void setTimeElapsed(String timeElapsed) {
    this.timeElapsed = timeElapsed;
  }


  public JobExecutionStatusObject stepExecutionStatuses(List<StepExecutionStatusesObject> stepExecutionStatuses) {
    this.stepExecutionStatuses = stepExecutionStatuses;
    return this;
  }

  public JobExecutionStatusObject addStepExecutionStatusesItem(StepExecutionStatusesObject stepExecutionStatusesItem) {
    if (this.stepExecutionStatuses == null) {
      this.stepExecutionStatuses = new ArrayList<>();
    }
    this.stepExecutionStatuses.add(stepExecutionStatusesItem);
    return this;
  }

  /**
   * Status of each step within a job.
   * @return stepExecutionStatuses
   */
  @javax.annotation.Nullable
  public List<StepExecutionStatusesObject> getStepExecutionStatuses() {
    return stepExecutionStatuses;
  }

  public void setStepExecutionStatuses(List<StepExecutionStatusesObject> stepExecutionStatuses) {
    this.stepExecutionStatuses = stepExecutionStatuses;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobExecutionStatusObject jobExecutionStatusObject = (JobExecutionStatusObject) o;
    return Objects.equals(this.id, jobExecutionStatusObject.id) &&
        Objects.equals(this.startTime, jobExecutionStatusObject.startTime) &&
        Objects.equals(this.endTime, jobExecutionStatusObject.endTime) &&
        Objects.equals(this.lastUpdated, jobExecutionStatusObject.lastUpdated) &&
        Objects.equals(this.statusMessage, jobExecutionStatusObject.statusMessage) &&
        Objects.equals(this.exitCode, jobExecutionStatusObject.exitCode) &&
        Objects.equals(this.createdTime, jobExecutionStatusObject.createdTime) &&
        Objects.equals(this.timeElapsed, jobExecutionStatusObject.timeElapsed) &&
        Objects.equals(this.stepExecutionStatuses, jobExecutionStatusObject.stepExecutionStatuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, startTime, endTime, lastUpdated, statusMessage, exitCode, createdTime, timeElapsed, stepExecutionStatuses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobExecutionStatusObject {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    exitCode: ").append(toIndentedString(exitCode)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    timeElapsed: ").append(toIndentedString(timeElapsed)).append("\n");
    sb.append("    stepExecutionStatuses: ").append(toIndentedString(stepExecutionStatuses)).append("\n");
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
    openapiFields.add("startTime");
    openapiFields.add("endTime");
    openapiFields.add("lastUpdated");
    openapiFields.add("statusMessage");
    openapiFields.add("exitCode");
    openapiFields.add("createdTime");
    openapiFields.add("timeElapsed");
    openapiFields.add("stepExecutionStatuses");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to JobExecutionStatusObject
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!JobExecutionStatusObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobExecutionStatusObject is not found in the empty JSON string", JobExecutionStatusObject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!JobExecutionStatusObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JobExecutionStatusObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : JobExecutionStatusObject.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("startTime") != null && !jsonObj.get("startTime").isJsonNull()) && !jsonObj.get("startTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startTime").toString()));
      }
      if ((jsonObj.get("endTime") != null && !jsonObj.get("endTime").isJsonNull()) && !jsonObj.get("endTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endTime").toString()));
      }
      if ((jsonObj.get("lastUpdated") != null && !jsonObj.get("lastUpdated").isJsonNull()) && !jsonObj.get("lastUpdated").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastUpdated` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastUpdated").toString()));
      }
      if ((jsonObj.get("statusMessage") != null && !jsonObj.get("statusMessage").isJsonNull()) && !jsonObj.get("statusMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusMessage").toString()));
      }
      if ((jsonObj.get("exitCode") != null && !jsonObj.get("exitCode").isJsonNull()) && !jsonObj.get("exitCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exitCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exitCode").toString()));
      }
      if ((jsonObj.get("createdTime") != null && !jsonObj.get("createdTime").isJsonNull()) && !jsonObj.get("createdTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdTime").toString()));
      }
      if ((jsonObj.get("timeElapsed") != null && !jsonObj.get("timeElapsed").isJsonNull()) && !jsonObj.get("timeElapsed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeElapsed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeElapsed").toString()));
      }
      if (jsonObj.get("stepExecutionStatuses") != null && !jsonObj.get("stepExecutionStatuses").isJsonNull()) {
        JsonArray jsonArraystepExecutionStatuses = jsonObj.getAsJsonArray("stepExecutionStatuses");
        if (jsonArraystepExecutionStatuses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("stepExecutionStatuses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `stepExecutionStatuses` to be an array in the JSON string but got `%s`", jsonObj.get("stepExecutionStatuses").toString()));
          }

          // validate the optional field `stepExecutionStatuses` (array)
          for (int i = 0; i < jsonArraystepExecutionStatuses.size(); i++) {
            StepExecutionStatusesObject.validateJsonElement(jsonArraystepExecutionStatuses.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JobExecutionStatusObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobExecutionStatusObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobExecutionStatusObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobExecutionStatusObject.class));

       return (TypeAdapter<T>) new TypeAdapter<JobExecutionStatusObject>() {
           @Override
           public void write(JsonWriter out, JobExecutionStatusObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JobExecutionStatusObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of JobExecutionStatusObject given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of JobExecutionStatusObject
   * @throws IOException if the JSON string is invalid with respect to JobExecutionStatusObject
   */
  public static JobExecutionStatusObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobExecutionStatusObject.class);
  }

  /**
   * Convert an instance of JobExecutionStatusObject to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

