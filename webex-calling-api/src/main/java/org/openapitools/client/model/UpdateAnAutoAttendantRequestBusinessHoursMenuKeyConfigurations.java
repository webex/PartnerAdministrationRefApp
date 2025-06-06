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
import org.openapitools.client.model.UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurationsAudioAnnouncementFile;

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
 * Key configurations defined for the auto attendant.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations {
  /**
   * Key assigned to specific menu configuration.
   */
  @JsonAdapter(KeyEnum.Adapter.class)
  public enum KeyEnum {
    _0("0"),
    
    _1("1"),
    
    _2("2"),
    
    _3("3"),
    
    _4("4"),
    
    _5("5"),
    
    _6("6"),
    
    _7("7"),
    
    _8("8"),
    
    _9("9"),
    
    HASH("#");

    private String value;

    KeyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KeyEnum fromValue(String value) {
      for (KeyEnum b : KeyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<KeyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KeyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KeyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return KeyEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      KeyEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private KeyEnum key;

  /**
   * Action assigned to specific menu key configuration.
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    PLAY_ANNOUNCEMENT("PLAY_ANNOUNCEMENT"),
    
    TRANSFER_WITH_PROMPT("TRANSFER_WITH_PROMPT"),
    
    TRANSFER_WITHOUT_PROMPT("TRANSFER_WITHOUT_PROMPT"),
    
    TRANSFER_TO_OPERATOR("TRANSFER_TO_OPERATOR"),
    
    TRANSFER_TO_MAILBOX("TRANSFER_TO_MAILBOX"),
    
    NAME_DIALING("NAME_DIALING"),
    
    EXTENSION_DIALING("EXTENSION_DIALING"),
    
    REPEAT_MENU("REPEAT_MENU"),
    
    EXIT("EXIT");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ActionEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ActionEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private ActionEnum action;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_AUDIO_ANNOUNCEMENT_FILE = "audioAnnouncementFile";
  @SerializedName(SERIALIZED_NAME_AUDIO_ANNOUNCEMENT_FILE)
  private UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurationsAudioAnnouncementFile audioAnnouncementFile;

  public UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations() {
  }

  public UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations key(KeyEnum key) {
    this.key = key;
    return this;
  }

  /**
   * Key assigned to specific menu configuration.
   * @return key
   */
  @javax.annotation.Nonnull
  public KeyEnum getKey() {
    return key;
  }

  public void setKey(KeyEnum key) {
    this.key = key;
  }


  public UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations action(ActionEnum action) {
    this.action = action;
    return this;
  }

  /**
   * Action assigned to specific menu key configuration.
   * @return action
   */
  @javax.annotation.Nonnull
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }


  public UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of each menu key.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Value based on actions.
   * @return value
   */
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations audioAnnouncementFile(UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurationsAudioAnnouncementFile audioAnnouncementFile) {
    this.audioAnnouncementFile = audioAnnouncementFile;
    return this;
  }

  /**
   * Get audioAnnouncementFile
   * @return audioAnnouncementFile
   */
  @javax.annotation.Nullable
  public UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurationsAudioAnnouncementFile getAudioAnnouncementFile() {
    return audioAnnouncementFile;
  }

  public void setAudioAnnouncementFile(UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurationsAudioAnnouncementFile audioAnnouncementFile) {
    this.audioAnnouncementFile = audioAnnouncementFile;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations updateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations = (UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations) o;
    return Objects.equals(this.key, updateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations.key) &&
        Objects.equals(this.action, updateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations.action) &&
        Objects.equals(this.description, updateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations.description) &&
        Objects.equals(this.value, updateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations.value) &&
        Objects.equals(this.audioAnnouncementFile, updateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations.audioAnnouncementFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, action, description, value, audioAnnouncementFile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    audioAnnouncementFile: ").append(toIndentedString(audioAnnouncementFile)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("action");
    openapiFields.add("description");
    openapiFields.add("value");
    openapiFields.add("audioAnnouncementFile");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("key");
    openapiRequiredFields.add("action");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations is not found in the empty JSON string", UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      // validate the required field `key`
      KeyEnum.validateJsonElement(jsonObj.get("key"));
      if (!jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      // validate the required field `action`
      ActionEnum.validateJsonElement(jsonObj.get("action"));
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      // validate the optional field `audioAnnouncementFile`
      if (jsonObj.get("audioAnnouncementFile") != null && !jsonObj.get("audioAnnouncementFile").isJsonNull()) {
        UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurationsAudioAnnouncementFile.validateJsonElement(jsonObj.get("audioAnnouncementFile"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations>() {
           @Override
           public void write(JsonWriter out, UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations
   * @throws IOException if the JSON string is invalid with respect to UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations
   */
  public static UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations.class);
  }

  /**
   * Convert an instance of UpdateAnAutoAttendantRequestBusinessHoursMenuKeyConfigurations to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

