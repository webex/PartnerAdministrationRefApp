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
 * ConfigureAPersonSCallingBehaviorRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class ConfigureAPersonSCallingBehaviorRequest {
  /**
   * The new Calling Behavior setting for the person (case-insensitive). If &#x60;null&#x60;, the effective Calling Behavior will be the Organization&#39;s current default.
   */
  @JsonAdapter(BehaviorTypeEnum.Adapter.class)
  public enum BehaviorTypeEnum {
    NATIVE_WEBEX_TEAMS_CALLING("NATIVE_WEBEX_TEAMS_CALLING"),
    
    CALL_WITH_APP_REGISTERED_FOR_CISCOTEL("CALL_WITH_APP_REGISTERED_FOR_CISCOTEL"),
    
    CALL_WITH_APP_REGISTERED_FOR_TEL("CALL_WITH_APP_REGISTERED_FOR_TEL"),
    
    CALL_WITH_APP_REGISTERED_FOR_WEBEXCALLTEL("CALL_WITH_APP_REGISTERED_FOR_WEBEXCALLTEL"),
    
    NATIVE_SIP_CALL_TO_UCM("NATIVE_SIP_CALL_TO_UCM"),
    
    NULL("null");

    private String value;

    BehaviorTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BehaviorTypeEnum fromValue(String value) {
      for (BehaviorTypeEnum b : BehaviorTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BehaviorTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BehaviorTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BehaviorTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BehaviorTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      BehaviorTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_BEHAVIOR_TYPE = "behaviorType";
  @SerializedName(SERIALIZED_NAME_BEHAVIOR_TYPE)
  private BehaviorTypeEnum behaviorType;

  public static final String SERIALIZED_NAME_PROFILE_ID = "profileId";
  @SerializedName(SERIALIZED_NAME_PROFILE_ID)
  private String profileId;

  public ConfigureAPersonSCallingBehaviorRequest() {
  }

  public ConfigureAPersonSCallingBehaviorRequest behaviorType(BehaviorTypeEnum behaviorType) {
    this.behaviorType = behaviorType;
    return this;
  }

  /**
   * The new Calling Behavior setting for the person (case-insensitive). If &#x60;null&#x60;, the effective Calling Behavior will be the Organization&#39;s current default.
   * @return behaviorType
   */
  @javax.annotation.Nullable
  public BehaviorTypeEnum getBehaviorType() {
    return behaviorType;
  }

  public void setBehaviorType(BehaviorTypeEnum behaviorType) {
    this.behaviorType = behaviorType;
  }


  public ConfigureAPersonSCallingBehaviorRequest profileId(String profileId) {
    this.profileId = profileId;
    return this;
  }

  /**
   * The UC Manager Profile ID. Specifying null results in the organizational default being applied. In addition, when &#x60;behaviorType&#x60; is set to &#x60;CALL_WITH_APP_REGISTERED_FOR_CISCOTEL&#x60;, then the profile ID value will be cleared irrespective of any value being passed.
   * @return profileId
   */
  @javax.annotation.Nullable
  public String getProfileId() {
    return profileId;
  }

  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigureAPersonSCallingBehaviorRequest configureAPersonSCallingBehaviorRequest = (ConfigureAPersonSCallingBehaviorRequest) o;
    return Objects.equals(this.behaviorType, configureAPersonSCallingBehaviorRequest.behaviorType) &&
        Objects.equals(this.profileId, configureAPersonSCallingBehaviorRequest.profileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(behaviorType, profileId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigureAPersonSCallingBehaviorRequest {\n");
    sb.append("    behaviorType: ").append(toIndentedString(behaviorType)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
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
    openapiFields.add("behaviorType");
    openapiFields.add("profileId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ConfigureAPersonSCallingBehaviorRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConfigureAPersonSCallingBehaviorRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConfigureAPersonSCallingBehaviorRequest is not found in the empty JSON string", ConfigureAPersonSCallingBehaviorRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConfigureAPersonSCallingBehaviorRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConfigureAPersonSCallingBehaviorRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("behaviorType") != null && !jsonObj.get("behaviorType").isJsonNull()) && !jsonObj.get("behaviorType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `behaviorType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("behaviorType").toString()));
      }
      // validate the optional field `behaviorType`
      if (jsonObj.get("behaviorType") != null && !jsonObj.get("behaviorType").isJsonNull()) {
        BehaviorTypeEnum.validateJsonElement(jsonObj.get("behaviorType"));
      }
      if ((jsonObj.get("profileId") != null && !jsonObj.get("profileId").isJsonNull()) && !jsonObj.get("profileId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profileId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profileId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConfigureAPersonSCallingBehaviorRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConfigureAPersonSCallingBehaviorRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConfigureAPersonSCallingBehaviorRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConfigureAPersonSCallingBehaviorRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ConfigureAPersonSCallingBehaviorRequest>() {
           @Override
           public void write(JsonWriter out, ConfigureAPersonSCallingBehaviorRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConfigureAPersonSCallingBehaviorRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ConfigureAPersonSCallingBehaviorRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ConfigureAPersonSCallingBehaviorRequest
   * @throws IOException if the JSON string is invalid with respect to ConfigureAPersonSCallingBehaviorRequest
   */
  public static ConfigureAPersonSCallingBehaviorRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConfigureAPersonSCallingBehaviorRequest.class);
  }

  /**
   * Convert an instance of ConfigureAPersonSCallingBehaviorRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

