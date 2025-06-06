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
 * ModifyUserMSTeamsSettingsObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class ModifyUserMSTeamsSettingsObject {
  /**
   * The enum value to be set to &#x60;HIDE_WEBEX_APP&#x60;.
   */
  @JsonAdapter(SettingNameEnum.Adapter.class)
  public enum SettingNameEnum {
    HIDE_WEBEX_APP("HIDE_WEBEX_APP");

    private String value;

    SettingNameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SettingNameEnum fromValue(String value) {
      for (SettingNameEnum b : SettingNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SettingNameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SettingNameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SettingNameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SettingNameEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SettingNameEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SETTING_NAME = "settingName";
  @SerializedName(SERIALIZED_NAME_SETTING_NAME)
  private SettingNameEnum settingName;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Boolean value;

  public ModifyUserMSTeamsSettingsObject() {
  }

  public ModifyUserMSTeamsSettingsObject settingName(SettingNameEnum settingName) {
    this.settingName = settingName;
    return this;
  }

  /**
   * The enum value to be set to &#x60;HIDE_WEBEX_APP&#x60;.
   * @return settingName
   */
  @javax.annotation.Nonnull
  public SettingNameEnum getSettingName() {
    return settingName;
  }

  public void setSettingName(SettingNameEnum settingName) {
    this.settingName = settingName;
  }


  public ModifyUserMSTeamsSettingsObject value(Boolean value) {
    this.value = value;
    return this;
  }

  /**
   * The boolean value to update the &#x60;HIDE_WEBEX_APP&#x60; setting, either &#x60;true&#x60; or &#x60;false&#x60;. Set to &#x60;null&#x60; to delete the &#x60;HIDE_WEBEX_APP&#x60; setting.
   * @return value
   */
  @javax.annotation.Nonnull
  public Boolean getValue() {
    return value;
  }

  public void setValue(Boolean value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyUserMSTeamsSettingsObject modifyUserMSTeamsSettingsObject = (ModifyUserMSTeamsSettingsObject) o;
    return Objects.equals(this.settingName, modifyUserMSTeamsSettingsObject.settingName) &&
        Objects.equals(this.value, modifyUserMSTeamsSettingsObject.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settingName, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyUserMSTeamsSettingsObject {\n");
    sb.append("    settingName: ").append(toIndentedString(settingName)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("settingName");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("settingName");
    openapiRequiredFields.add("value");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ModifyUserMSTeamsSettingsObject
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModifyUserMSTeamsSettingsObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModifyUserMSTeamsSettingsObject is not found in the empty JSON string", ModifyUserMSTeamsSettingsObject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModifyUserMSTeamsSettingsObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModifyUserMSTeamsSettingsObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModifyUserMSTeamsSettingsObject.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("settingName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settingName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settingName").toString()));
      }
      // validate the required field `settingName`
      SettingNameEnum.validateJsonElement(jsonObj.get("settingName"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModifyUserMSTeamsSettingsObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModifyUserMSTeamsSettingsObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModifyUserMSTeamsSettingsObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModifyUserMSTeamsSettingsObject.class));

       return (TypeAdapter<T>) new TypeAdapter<ModifyUserMSTeamsSettingsObject>() {
           @Override
           public void write(JsonWriter out, ModifyUserMSTeamsSettingsObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModifyUserMSTeamsSettingsObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ModifyUserMSTeamsSettingsObject given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ModifyUserMSTeamsSettingsObject
   * @throws IOException if the JSON string is invalid with respect to ModifyUserMSTeamsSettingsObject
   */
  public static ModifyUserMSTeamsSettingsObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModifyUserMSTeamsSettingsObject.class);
  }

  /**
   * Convert an instance of ModifyUserMSTeamsSettingsObject to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

