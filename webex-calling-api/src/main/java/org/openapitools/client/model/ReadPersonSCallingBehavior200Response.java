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
 * ReadPersonSCallingBehavior200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class ReadPersonSCallingBehavior200Response {
  /**
   * The current Calling Behavior setting for the person. If &#x60;null&#x60;, the effective Calling Behavior will be the Organization&#39;s current default.
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

  /**
   * The effective Calling Behavior setting for the person, will be the organization&#39;s default Calling Behavior if the user&#39;s &#x60;behaviorType&#x60; is set to &#x60;null&#x60;.
   */
  @JsonAdapter(EffectiveBehaviorTypeEnum.Adapter.class)
  public enum EffectiveBehaviorTypeEnum {
    NATIVE_WEBEX_TEAMS_CALLING("NATIVE_WEBEX_TEAMS_CALLING"),
    
    CALL_WITH_APP_REGISTERED_FOR_CISCOTEL("CALL_WITH_APP_REGISTERED_FOR_CISCOTEL"),
    
    CALL_WITH_APP_REGISTERED_FOR_TEL("CALL_WITH_APP_REGISTERED_FOR_TEL"),
    
    CALL_WITH_APP_REGISTERED_FOR_WEBEXCALLTEL("CALL_WITH_APP_REGISTERED_FOR_WEBEXCALLTEL"),
    
    NATIVE_SIP_CALL_TO_UCM("NATIVE_SIP_CALL_TO_UCM");

    private String value;

    EffectiveBehaviorTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EffectiveBehaviorTypeEnum fromValue(String value) {
      for (EffectiveBehaviorTypeEnum b : EffectiveBehaviorTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EffectiveBehaviorTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EffectiveBehaviorTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EffectiveBehaviorTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EffectiveBehaviorTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      EffectiveBehaviorTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_EFFECTIVE_BEHAVIOR_TYPE = "effectiveBehaviorType";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_BEHAVIOR_TYPE)
  private EffectiveBehaviorTypeEnum effectiveBehaviorType;

  public static final String SERIALIZED_NAME_PROFILE_ID = "profileId";
  @SerializedName(SERIALIZED_NAME_PROFILE_ID)
  private String profileId;

  public ReadPersonSCallingBehavior200Response() {
  }

  public ReadPersonSCallingBehavior200Response behaviorType(BehaviorTypeEnum behaviorType) {
    this.behaviorType = behaviorType;
    return this;
  }

  /**
   * The current Calling Behavior setting for the person. If &#x60;null&#x60;, the effective Calling Behavior will be the Organization&#39;s current default.
   * @return behaviorType
   */
  @javax.annotation.Nonnull
  public BehaviorTypeEnum getBehaviorType() {
    return behaviorType;
  }

  public void setBehaviorType(BehaviorTypeEnum behaviorType) {
    this.behaviorType = behaviorType;
  }


  public ReadPersonSCallingBehavior200Response effectiveBehaviorType(EffectiveBehaviorTypeEnum effectiveBehaviorType) {
    this.effectiveBehaviorType = effectiveBehaviorType;
    return this;
  }

  /**
   * The effective Calling Behavior setting for the person, will be the organization&#39;s default Calling Behavior if the user&#39;s &#x60;behaviorType&#x60; is set to &#x60;null&#x60;.
   * @return effectiveBehaviorType
   */
  @javax.annotation.Nonnull
  public EffectiveBehaviorTypeEnum getEffectiveBehaviorType() {
    return effectiveBehaviorType;
  }

  public void setEffectiveBehaviorType(EffectiveBehaviorTypeEnum effectiveBehaviorType) {
    this.effectiveBehaviorType = effectiveBehaviorType;
  }


  public ReadPersonSCallingBehavior200Response profileId(String profileId) {
    this.profileId = profileId;
    return this;
  }

  /**
   * The UC Manager Profile ID.
   * @return profileId
   */
  @javax.annotation.Nonnull
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
    ReadPersonSCallingBehavior200Response readPersonSCallingBehavior200Response = (ReadPersonSCallingBehavior200Response) o;
    return Objects.equals(this.behaviorType, readPersonSCallingBehavior200Response.behaviorType) &&
        Objects.equals(this.effectiveBehaviorType, readPersonSCallingBehavior200Response.effectiveBehaviorType) &&
        Objects.equals(this.profileId, readPersonSCallingBehavior200Response.profileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(behaviorType, effectiveBehaviorType, profileId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadPersonSCallingBehavior200Response {\n");
    sb.append("    behaviorType: ").append(toIndentedString(behaviorType)).append("\n");
    sb.append("    effectiveBehaviorType: ").append(toIndentedString(effectiveBehaviorType)).append("\n");
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
    openapiFields.add("effectiveBehaviorType");
    openapiFields.add("profileId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("behaviorType");
    openapiRequiredFields.add("effectiveBehaviorType");
    openapiRequiredFields.add("profileId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReadPersonSCallingBehavior200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReadPersonSCallingBehavior200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReadPersonSCallingBehavior200Response is not found in the empty JSON string", ReadPersonSCallingBehavior200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReadPersonSCallingBehavior200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReadPersonSCallingBehavior200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReadPersonSCallingBehavior200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("behaviorType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `behaviorType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("behaviorType").toString()));
      }
      // validate the required field `behaviorType`
      BehaviorTypeEnum.validateJsonElement(jsonObj.get("behaviorType"));
      if (!jsonObj.get("effectiveBehaviorType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effectiveBehaviorType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effectiveBehaviorType").toString()));
      }
      // validate the required field `effectiveBehaviorType`
      EffectiveBehaviorTypeEnum.validateJsonElement(jsonObj.get("effectiveBehaviorType"));
      if (!jsonObj.get("profileId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profileId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profileId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReadPersonSCallingBehavior200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReadPersonSCallingBehavior200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReadPersonSCallingBehavior200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReadPersonSCallingBehavior200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ReadPersonSCallingBehavior200Response>() {
           @Override
           public void write(JsonWriter out, ReadPersonSCallingBehavior200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReadPersonSCallingBehavior200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReadPersonSCallingBehavior200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReadPersonSCallingBehavior200Response
   * @throws IOException if the JSON string is invalid with respect to ReadPersonSCallingBehavior200Response
   */
  public static ReadPersonSCallingBehavior200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReadPersonSCallingBehavior200Response.class);
  }

  /**
   * Convert an instance of ReadPersonSCallingBehavior200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

