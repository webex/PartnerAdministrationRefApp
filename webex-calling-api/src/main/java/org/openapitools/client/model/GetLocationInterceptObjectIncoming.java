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
import org.openapitools.client.model.GetLocationInterceptObjectIncomingAnnouncements;

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
 * Inbound call details.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class GetLocationInterceptObjectIncoming {
  /**
   * Select inbound call options.
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
  private GetLocationInterceptObjectIncomingAnnouncements announcements;

  public GetLocationInterceptObjectIncoming() {
  }

  public GetLocationInterceptObjectIncoming type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Select inbound call options.
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  public GetLocationInterceptObjectIncoming voicemailEnabled(Boolean voicemailEnabled) {
    this.voicemailEnabled = voicemailEnabled;
    return this;
  }

  /**
   * Enable/disable to route voice mail.
   * @return voicemailEnabled
   */
  @javax.annotation.Nullable
  public Boolean getVoicemailEnabled() {
    return voicemailEnabled;
  }

  public void setVoicemailEnabled(Boolean voicemailEnabled) {
    this.voicemailEnabled = voicemailEnabled;
  }


  public GetLocationInterceptObjectIncoming announcements(GetLocationInterceptObjectIncomingAnnouncements announcements) {
    this.announcements = announcements;
    return this;
  }

  /**
   * Get announcements
   * @return announcements
   */
  @javax.annotation.Nullable
  public GetLocationInterceptObjectIncomingAnnouncements getAnnouncements() {
    return announcements;
  }

  public void setAnnouncements(GetLocationInterceptObjectIncomingAnnouncements announcements) {
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
    GetLocationInterceptObjectIncoming getLocationInterceptObjectIncoming = (GetLocationInterceptObjectIncoming) o;
    return Objects.equals(this.type, getLocationInterceptObjectIncoming.type) &&
        Objects.equals(this.voicemailEnabled, getLocationInterceptObjectIncoming.voicemailEnabled) &&
        Objects.equals(this.announcements, getLocationInterceptObjectIncoming.announcements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, voicemailEnabled, announcements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLocationInterceptObjectIncoming {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to GetLocationInterceptObjectIncoming
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetLocationInterceptObjectIncoming.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetLocationInterceptObjectIncoming is not found in the empty JSON string", GetLocationInterceptObjectIncoming.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetLocationInterceptObjectIncoming.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetLocationInterceptObjectIncoming` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
        GetLocationInterceptObjectIncomingAnnouncements.validateJsonElement(jsonObj.get("announcements"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetLocationInterceptObjectIncoming.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetLocationInterceptObjectIncoming' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetLocationInterceptObjectIncoming> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetLocationInterceptObjectIncoming.class));

       return (TypeAdapter<T>) new TypeAdapter<GetLocationInterceptObjectIncoming>() {
           @Override
           public void write(JsonWriter out, GetLocationInterceptObjectIncoming value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetLocationInterceptObjectIncoming read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetLocationInterceptObjectIncoming given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetLocationInterceptObjectIncoming
   * @throws IOException if the JSON string is invalid with respect to GetLocationInterceptObjectIncoming
   */
  public static GetLocationInterceptObjectIncoming fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetLocationInterceptObjectIncoming.class);
  }

  /**
   * Convert an instance of GetLocationInterceptObjectIncoming to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

