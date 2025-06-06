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
import org.openapitools.client.model.UpdateCallForwardingSettingsForAHuntGroupRequestCallForwardingAlways;
import org.openapitools.client.model.UpdateCallForwardingSettingsForAHuntGroupRequestCallForwardingSelective;

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
 * Settings related to &#x60;Always&#x60;, &#x60;Busy&#x60;, and &#x60;No Answer&#x60; call forwarding.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class UpdateCallForwardingSettingsForAHuntGroupRequestCallForwarding {
  public static final String SERIALIZED_NAME_ALWAYS = "always";
  @SerializedName(SERIALIZED_NAME_ALWAYS)
  private UpdateCallForwardingSettingsForAHuntGroupRequestCallForwardingAlways always;

  public static final String SERIALIZED_NAME_SELECTIVE = "selective";
  @SerializedName(SERIALIZED_NAME_SELECTIVE)
  private UpdateCallForwardingSettingsForAHuntGroupRequestCallForwardingSelective selective;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<Object> rules = new ArrayList<>();

  public UpdateCallForwardingSettingsForAHuntGroupRequestCallForwarding() {
  }

  public UpdateCallForwardingSettingsForAHuntGroupRequestCallForwarding always(UpdateCallForwardingSettingsForAHuntGroupRequestCallForwardingAlways always) {
    this.always = always;
    return this;
  }

  /**
   * Get always
   * @return always
   */
  @javax.annotation.Nullable
  public UpdateCallForwardingSettingsForAHuntGroupRequestCallForwardingAlways getAlways() {
    return always;
  }

  public void setAlways(UpdateCallForwardingSettingsForAHuntGroupRequestCallForwardingAlways always) {
    this.always = always;
  }


  public UpdateCallForwardingSettingsForAHuntGroupRequestCallForwarding selective(UpdateCallForwardingSettingsForAHuntGroupRequestCallForwardingSelective selective) {
    this.selective = selective;
    return this;
  }

  /**
   * Get selective
   * @return selective
   */
  @javax.annotation.Nullable
  public UpdateCallForwardingSettingsForAHuntGroupRequestCallForwardingSelective getSelective() {
    return selective;
  }

  public void setSelective(UpdateCallForwardingSettingsForAHuntGroupRequestCallForwardingSelective selective) {
    this.selective = selective;
  }


  public UpdateCallForwardingSettingsForAHuntGroupRequestCallForwarding rules(List<Object> rules) {
    this.rules = rules;
    return this;
  }

  public UpdateCallForwardingSettingsForAHuntGroupRequestCallForwarding addRulesItem(Object rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

  /**
   * Rules for selectively forwarding calls.
   * @return rules
   */
  @javax.annotation.Nullable
  public List<Object> getRules() {
    return rules;
  }

  public void setRules(List<Object> rules) {
    this.rules = rules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCallForwardingSettingsForAHuntGroupRequestCallForwarding updateCallForwardingSettingsForAHuntGroupRequestCallForwarding = (UpdateCallForwardingSettingsForAHuntGroupRequestCallForwarding) o;
    return Objects.equals(this.always, updateCallForwardingSettingsForAHuntGroupRequestCallForwarding.always) &&
        Objects.equals(this.selective, updateCallForwardingSettingsForAHuntGroupRequestCallForwarding.selective) &&
        Objects.equals(this.rules, updateCallForwardingSettingsForAHuntGroupRequestCallForwarding.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(always, selective, rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCallForwardingSettingsForAHuntGroupRequestCallForwarding {\n");
    sb.append("    always: ").append(toIndentedString(always)).append("\n");
    sb.append("    selective: ").append(toIndentedString(selective)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
    openapiFields.add("always");
    openapiFields.add("selective");
    openapiFields.add("rules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateCallForwardingSettingsForAHuntGroupRequestCallForwarding
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateCallForwardingSettingsForAHuntGroupRequestCallForwarding.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateCallForwardingSettingsForAHuntGroupRequestCallForwarding is not found in the empty JSON string", UpdateCallForwardingSettingsForAHuntGroupRequestCallForwarding.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateCallForwardingSettingsForAHuntGroupRequestCallForwarding.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateCallForwardingSettingsForAHuntGroupRequestCallForwarding` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `always`
      if (jsonObj.get("always") != null && !jsonObj.get("always").isJsonNull()) {
        UpdateCallForwardingSettingsForAHuntGroupRequestCallForwardingAlways.validateJsonElement(jsonObj.get("always"));
      }
      // validate the optional field `selective`
      if (jsonObj.get("selective") != null && !jsonObj.get("selective").isJsonNull()) {
        UpdateCallForwardingSettingsForAHuntGroupRequestCallForwardingSelective.validateJsonElement(jsonObj.get("selective"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("rules") != null && !jsonObj.get("rules").isJsonNull() && !jsonObj.get("rules").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `rules` to be an array in the JSON string but got `%s`", jsonObj.get("rules").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateCallForwardingSettingsForAHuntGroupRequestCallForwarding.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateCallForwardingSettingsForAHuntGroupRequestCallForwarding' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateCallForwardingSettingsForAHuntGroupRequestCallForwarding> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateCallForwardingSettingsForAHuntGroupRequestCallForwarding.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateCallForwardingSettingsForAHuntGroupRequestCallForwarding>() {
           @Override
           public void write(JsonWriter out, UpdateCallForwardingSettingsForAHuntGroupRequestCallForwarding value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateCallForwardingSettingsForAHuntGroupRequestCallForwarding read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateCallForwardingSettingsForAHuntGroupRequestCallForwarding given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateCallForwardingSettingsForAHuntGroupRequestCallForwarding
   * @throws IOException if the JSON string is invalid with respect to UpdateCallForwardingSettingsForAHuntGroupRequestCallForwarding
   */
  public static UpdateCallForwardingSettingsForAHuntGroupRequestCallForwarding fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateCallForwardingSettingsForAHuntGroupRequestCallForwarding.class);
  }

  /**
   * Convert an instance of UpdateCallForwardingSettingsForAHuntGroupRequestCallForwarding to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

