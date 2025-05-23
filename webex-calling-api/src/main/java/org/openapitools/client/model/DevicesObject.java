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
import org.openapitools.client.model.DeviceActivationStates;
import org.openapitools.client.model.DeviceOwner;
import org.openapitools.client.model.LineType;

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
 * DevicesObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class DevicesObject {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private List<Object> description = new ArrayList<>();

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_MAC = "mac";
  @SerializedName(SERIALIZED_NAME_MAC)
  private String mac;

  public static final String SERIALIZED_NAME_PRIMARY_OWNER = "primaryOwner";
  @SerializedName(SERIALIZED_NAME_PRIMARY_OWNER)
  private Boolean primaryOwner;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private LineType type;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private DeviceOwner owner;

  public static final String SERIALIZED_NAME_ACTIVATION_STATE = "activationState";
  @SerializedName(SERIALIZED_NAME_ACTIVATION_STATE)
  private DeviceActivationStates activationState;

  public DevicesObject() {
  }

  public DevicesObject id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for a device.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public DevicesObject description(List<Object> description) {
    this.description = description;
    return this;
  }

  public DevicesObject addDescriptionItem(Object descriptionItem) {
    if (this.description == null) {
      this.description = new ArrayList<>();
    }
    this.description.add(descriptionItem);
    return this;
  }

  /**
   * Comma separated array of tags used to describe device.
   * @return description
   */
  @javax.annotation.Nullable
  public List<Object> getDescription() {
    return description;
  }

  public void setDescription(List<Object> description) {
    this.description = description;
  }


  public DevicesObject model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Identifier for device model.
   * @return model
   */
  @javax.annotation.Nonnull
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }


  public DevicesObject mac(String mac) {
    this.mac = mac;
    return this;
  }

  /**
   * MAC address of device.
   * @return mac
   */
  @javax.annotation.Nullable
  public String getMac() {
    return mac;
  }

  public void setMac(String mac) {
    this.mac = mac;
  }


  public DevicesObject primaryOwner(Boolean primaryOwner) {
    this.primaryOwner = primaryOwner;
    return this;
  }

  /**
   * Indicates whether the person or the workspace is the owner of the device and points to a primary Line/Port of the device.
   * @return primaryOwner
   */
  @javax.annotation.Nonnull
  public Boolean getPrimaryOwner() {
    return primaryOwner;
  }

  public void setPrimaryOwner(Boolean primaryOwner) {
    this.primaryOwner = primaryOwner;
  }


  public DevicesObject type(LineType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public LineType getType() {
    return type;
  }

  public void setType(LineType type) {
    this.type = type;
  }


  public DevicesObject owner(DeviceOwner owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @javax.annotation.Nonnull
  public DeviceOwner getOwner() {
    return owner;
  }

  public void setOwner(DeviceOwner owner) {
    this.owner = owner;
  }


  public DevicesObject activationState(DeviceActivationStates activationState) {
    this.activationState = activationState;
    return this;
  }

  /**
   * Get activationState
   * @return activationState
   */
  @javax.annotation.Nonnull
  public DeviceActivationStates getActivationState() {
    return activationState;
  }

  public void setActivationState(DeviceActivationStates activationState) {
    this.activationState = activationState;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DevicesObject devicesObject = (DevicesObject) o;
    return Objects.equals(this.id, devicesObject.id) &&
        Objects.equals(this.description, devicesObject.description) &&
        Objects.equals(this.model, devicesObject.model) &&
        Objects.equals(this.mac, devicesObject.mac) &&
        Objects.equals(this.primaryOwner, devicesObject.primaryOwner) &&
        Objects.equals(this.type, devicesObject.type) &&
        Objects.equals(this.owner, devicesObject.owner) &&
        Objects.equals(this.activationState, devicesObject.activationState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, model, mac, primaryOwner, type, owner, activationState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DevicesObject {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
    sb.append("    primaryOwner: ").append(toIndentedString(primaryOwner)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    activationState: ").append(toIndentedString(activationState)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("model");
    openapiFields.add("mac");
    openapiFields.add("primaryOwner");
    openapiFields.add("type");
    openapiFields.add("owner");
    openapiFields.add("activationState");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("model");
    openapiRequiredFields.add("primaryOwner");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("owner");
    openapiRequiredFields.add("activationState");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DevicesObject
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DevicesObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DevicesObject is not found in the empty JSON string", DevicesObject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DevicesObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DevicesObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DevicesObject.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull() && !jsonObj.get("description").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be an array in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
      }
      if ((jsonObj.get("mac") != null && !jsonObj.get("mac").isJsonNull()) && !jsonObj.get("mac").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mac` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mac").toString()));
      }
      // validate the required field `type`
      LineType.validateJsonElement(jsonObj.get("type"));
      // validate the required field `owner`
      DeviceOwner.validateJsonElement(jsonObj.get("owner"));
      // validate the required field `activationState`
      DeviceActivationStates.validateJsonElement(jsonObj.get("activationState"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DevicesObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DevicesObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DevicesObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DevicesObject.class));

       return (TypeAdapter<T>) new TypeAdapter<DevicesObject>() {
           @Override
           public void write(JsonWriter out, DevicesObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DevicesObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DevicesObject given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DevicesObject
   * @throws IOException if the JSON string is invalid with respect to DevicesObject
   */
  public static DevicesObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DevicesObject.class);
  }

  /**
   * Convert an instance of DevicesObject to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

