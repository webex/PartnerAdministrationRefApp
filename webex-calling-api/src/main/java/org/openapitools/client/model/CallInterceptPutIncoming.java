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
import org.openapitools.client.model.CallInterceptPutIncomingAnnouncements;

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
 * Settings related to how incoming calls are handled when the intercept feature is enabled.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class CallInterceptPutIncoming {
  /**
   * &#x60;INTERCEPT_ALL&#x60; indicated incoming calls are intercepted.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    INTERCEPT_ALL("INTERCEPT_ALL"),
    
    ALLOW_ALL("ALLOW_ALL");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_VOICEMAIL_ENABLED = "voicemailEnabled";
  @SerializedName(SERIALIZED_NAME_VOICEMAIL_ENABLED)
  private Boolean voicemailEnabled;

  public static final String SERIALIZED_NAME_ANNOUNCEMENTS = "announcements";
  @SerializedName(SERIALIZED_NAME_ANNOUNCEMENTS)
  private CallInterceptPutIncomingAnnouncements announcements;

  public CallInterceptPutIncoming() {
  }

  public CallInterceptPutIncoming type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * &#x60;INTERCEPT_ALL&#x60; indicated incoming calls are intercepted.
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CallInterceptPutIncoming voicemailEnabled(Boolean voicemailEnabled) {
    this.voicemailEnabled = voicemailEnabled;
    return this;
  }

  /**
   * If &#x60;true&#x60;, the destination will be the virtual line&#39;s voicemail.
   * @return voicemailEnabled
   */
  @javax.annotation.Nullable
  public Boolean getVoicemailEnabled() {
    return voicemailEnabled;
  }

  public void setVoicemailEnabled(Boolean voicemailEnabled) {
    this.voicemailEnabled = voicemailEnabled;
  }


  public CallInterceptPutIncoming announcements(CallInterceptPutIncomingAnnouncements announcements) {
    this.announcements = announcements;
    return this;
  }

  /**
   * Get announcements
   * @return announcements
   */
  @javax.annotation.Nullable
  public CallInterceptPutIncomingAnnouncements getAnnouncements() {
    return announcements;
  }

  public void setAnnouncements(CallInterceptPutIncomingAnnouncements announcements) {
    this.announcements = announcements;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallInterceptPutIncoming callInterceptPutIncoming = (CallInterceptPutIncoming) o;
    return Objects.equals(this.type, callInterceptPutIncoming.type) &&
        Objects.equals(this.voicemailEnabled, callInterceptPutIncoming.voicemailEnabled) &&
        Objects.equals(this.announcements, callInterceptPutIncoming.announcements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, voicemailEnabled, announcements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallInterceptPutIncoming {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    voicemailEnabled: ").append(toIndentedString(voicemailEnabled)).append("\n");
    sb.append("    announcements: ").append(toIndentedString(announcements)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("voicemailEnabled");
    openapiFields.add("announcements");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CallInterceptPutIncoming
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CallInterceptPutIncoming.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CallInterceptPutIncoming is not found in the empty JSON string", CallInterceptPutIncoming.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CallInterceptPutIncoming.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CallInterceptPutIncoming` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
      // validate the optional field `announcements`
      if (jsonObj.get("announcements") != null && !jsonObj.get("announcements").isJsonNull()) {
        CallInterceptPutIncomingAnnouncements.validateJsonElement(jsonObj.get("announcements"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CallInterceptPutIncoming.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CallInterceptPutIncoming' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CallInterceptPutIncoming> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CallInterceptPutIncoming.class));

       return (TypeAdapter<T>) new TypeAdapter<CallInterceptPutIncoming>() {
           @Override
           public void write(JsonWriter out, CallInterceptPutIncoming value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CallInterceptPutIncoming read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CallInterceptPutIncoming given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CallInterceptPutIncoming
   * @throws IOException if the JSON string is invalid with respect to CallInterceptPutIncoming
   */
  public static CallInterceptPutIncoming fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CallInterceptPutIncoming.class);
  }

  /**
   * Convert an instance of CallInterceptPutIncoming to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

