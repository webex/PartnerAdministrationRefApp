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
 * ReadCallerIDSettingsForAPerson200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class ReadCallerIDSettingsForAPerson200Response {
  public static final String SERIALIZED_NAME_TYPES = "types";
  @SerializedName(SERIALIZED_NAME_TYPES)
  private List<Object> types = new ArrayList<>();

  /**
   * Which type of outgoing Caller ID will be used. This setting is for the number portion.
   */
  @JsonAdapter(SelectedEnum.Adapter.class)
  public enum SelectedEnum {
    DIRECT_LINE("DIRECT_LINE"),
    
    LOCATION_NUMBER("LOCATION_NUMBER"),
    
    CUSTOM("CUSTOM");

    private String value;

    SelectedEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SelectedEnum fromValue(String value) {
      for (SelectedEnum b : SelectedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SelectedEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SelectedEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SelectedEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SelectedEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SelectedEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SELECTED = "selected";
  @SerializedName(SERIALIZED_NAME_SELECTED)
  private SelectedEnum selected;

  public static final String SERIALIZED_NAME_DIRECT_NUMBER = "directNumber";
  @SerializedName(SERIALIZED_NAME_DIRECT_NUMBER)
  private String directNumber;

  public static final String SERIALIZED_NAME_EXTENSION_NUMBER = "extensionNumber";
  @SerializedName(SERIALIZED_NAME_EXTENSION_NUMBER)
  private String extensionNumber;

  public static final String SERIALIZED_NAME_LOCATION_NUMBER = "locationNumber";
  @SerializedName(SERIALIZED_NAME_LOCATION_NUMBER)
  private String locationNumber;

  public static final String SERIALIZED_NAME_TOLL_FREE_LOCATION_NUMBER = "tollFreeLocationNumber";
  @SerializedName(SERIALIZED_NAME_TOLL_FREE_LOCATION_NUMBER)
  private Boolean tollFreeLocationNumber;

  public static final String SERIALIZED_NAME_CUSTOM_NUMBER = "customNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOM_NUMBER)
  private String customNumber;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_BLOCK_IN_FORWARD_CALLS_ENABLED = "blockInForwardCallsEnabled";
  @SerializedName(SERIALIZED_NAME_BLOCK_IN_FORWARD_CALLS_ENABLED)
  private Boolean blockInForwardCallsEnabled;

  /**
   * Designates which type of External Caller ID Name policy is used. Default is &#x60;DIRECT_LINE&#x60;.
   */
  @JsonAdapter(ExternalCallerIdNamePolicyEnum.Adapter.class)
  public enum ExternalCallerIdNamePolicyEnum {
    DIRECT_LINE("DIRECT_LINE"),
    
    LOCATION("LOCATION"),
    
    OTHER("OTHER");

    private String value;

    ExternalCallerIdNamePolicyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExternalCallerIdNamePolicyEnum fromValue(String value) {
      for (ExternalCallerIdNamePolicyEnum b : ExternalCallerIdNamePolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ExternalCallerIdNamePolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExternalCallerIdNamePolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExternalCallerIdNamePolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ExternalCallerIdNamePolicyEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ExternalCallerIdNamePolicyEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_EXTERNAL_CALLER_ID_NAME_POLICY = "externalCallerIdNamePolicy";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_CALLER_ID_NAME_POLICY)
  private ExternalCallerIdNamePolicyEnum externalCallerIdNamePolicy;

  public static final String SERIALIZED_NAME_CUSTOM_EXTERNAL_CALLER_ID_NAME = "customExternalCallerIdName";
  @SerializedName(SERIALIZED_NAME_CUSTOM_EXTERNAL_CALLER_ID_NAME)
  private String customExternalCallerIdName;

  public static final String SERIALIZED_NAME_LOCATION_EXTERNAL_CALLER_ID_NAME = "locationExternalCallerIdName";
  @SerializedName(SERIALIZED_NAME_LOCATION_EXTERNAL_CALLER_ID_NAME)
  private String locationExternalCallerIdName;

  public static final String SERIALIZED_NAME_ADDITIONAL_EXTERNAL_CALLER_ID_DIRECT_LINE_ENABLED = "additionalExternalCallerIdDirectLineEnabled";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_EXTERNAL_CALLER_ID_DIRECT_LINE_ENABLED)
  private Boolean additionalExternalCallerIdDirectLineEnabled;

  public static final String SERIALIZED_NAME_ADDITIONAL_EXTERNAL_CALLER_ID_LOCATION_NUMBER_ENABLED = "additionalExternalCallerIdLocationNumberEnabled";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_EXTERNAL_CALLER_ID_LOCATION_NUMBER_ENABLED)
  private Boolean additionalExternalCallerIdLocationNumberEnabled;

  public static final String SERIALIZED_NAME_ADDITIONAL_EXTERNAL_CALLER_ID_CUSTOM_NUMBER = "additionalExternalCallerIdCustomNumber";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_EXTERNAL_CALLER_ID_CUSTOM_NUMBER)
  private String additionalExternalCallerIdCustomNumber;

  public ReadCallerIDSettingsForAPerson200Response() {
  }

  public ReadCallerIDSettingsForAPerson200Response types(List<Object> types) {
    this.types = types;
    return this;
  }

  public ReadCallerIDSettingsForAPerson200Response addTypesItem(Object typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

  /**
   * Allowed types for the &#x60;selected&#x60; field. This field is read-only and cannot be modified.
   * @return types
   */
  @javax.annotation.Nonnull
  public List<Object> getTypes() {
    return types;
  }

  public void setTypes(List<Object> types) {
    this.types = types;
  }


  public ReadCallerIDSettingsForAPerson200Response selected(SelectedEnum selected) {
    this.selected = selected;
    return this;
  }

  /**
   * Which type of outgoing Caller ID will be used. This setting is for the number portion.
   * @return selected
   */
  @javax.annotation.Nonnull
  public SelectedEnum getSelected() {
    return selected;
  }

  public void setSelected(SelectedEnum selected) {
    this.selected = selected;
  }


  public ReadCallerIDSettingsForAPerson200Response directNumber(String directNumber) {
    this.directNumber = directNumber;
    return this;
  }

  /**
   * Direct number which will be shown if &#x60;DIRECT_LINE&#x60; is selected.
   * @return directNumber
   */
  @javax.annotation.Nullable
  public String getDirectNumber() {
    return directNumber;
  }

  public void setDirectNumber(String directNumber) {
    this.directNumber = directNumber;
  }


  public ReadCallerIDSettingsForAPerson200Response extensionNumber(String extensionNumber) {
    this.extensionNumber = extensionNumber;
    return this;
  }

  /**
   * Extension number of the person.
   * @return extensionNumber
   */
  @javax.annotation.Nullable
  public String getExtensionNumber() {
    return extensionNumber;
  }

  public void setExtensionNumber(String extensionNumber) {
    this.extensionNumber = extensionNumber;
  }


  public ReadCallerIDSettingsForAPerson200Response locationNumber(String locationNumber) {
    this.locationNumber = locationNumber;
    return this;
  }

  /**
   * Location number which will be shown if &#x60;LOCATION_NUMBER&#x60; is selected.
   * @return locationNumber
   */
  @javax.annotation.Nullable
  public String getLocationNumber() {
    return locationNumber;
  }

  public void setLocationNumber(String locationNumber) {
    this.locationNumber = locationNumber;
  }


  public ReadCallerIDSettingsForAPerson200Response tollFreeLocationNumber(Boolean tollFreeLocationNumber) {
    this.tollFreeLocationNumber = tollFreeLocationNumber;
    return this;
  }

  /**
   * Flag to indicate if the location number is toll-free number.
   * @return tollFreeLocationNumber
   */
  @javax.annotation.Nonnull
  public Boolean getTollFreeLocationNumber() {
    return tollFreeLocationNumber;
  }

  public void setTollFreeLocationNumber(Boolean tollFreeLocationNumber) {
    this.tollFreeLocationNumber = tollFreeLocationNumber;
  }


  public ReadCallerIDSettingsForAPerson200Response customNumber(String customNumber) {
    this.customNumber = customNumber;
    return this;
  }

  /**
   * Custom number which will be shown if CUSTOM is selected. This value must be a number from the person&#39;s location or from another location with the same country, PSTN provider, and zone (only applicable for India locations) as the person&#39;s location.
   * @return customNumber
   */
  @javax.annotation.Nullable
  public String getCustomNumber() {
    return customNumber;
  }

  public void setCustomNumber(String customNumber) {
    this.customNumber = customNumber;
  }


  public ReadCallerIDSettingsForAPerson200Response firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Person&#39;s Caller ID first name.  Characters of &#x60;%&#x60;,  &#x60;+&#x60;, &#x60;&#x60;, &#x60;\&quot;&#x60; and Unicode characters are not allowed.
   * @return firstName
   */
  @javax.annotation.Nonnull
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public ReadCallerIDSettingsForAPerson200Response lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Person&#39;s Caller ID last name.  Characters of &#x60;%&#x60;,  &#x60;+&#x60;, &#x60;&#x60;, &#x60;\&quot;&#x60; and Unicode characters are not allowed.
   * @return lastName
   */
  @javax.annotation.Nonnull
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public ReadCallerIDSettingsForAPerson200Response blockInForwardCallsEnabled(Boolean blockInForwardCallsEnabled) {
    this.blockInForwardCallsEnabled = blockInForwardCallsEnabled;
    return this;
  }

  /**
   * Block this person&#39;s identity when receiving a call.
   * @return blockInForwardCallsEnabled
   */
  @javax.annotation.Nonnull
  public Boolean getBlockInForwardCallsEnabled() {
    return blockInForwardCallsEnabled;
  }

  public void setBlockInForwardCallsEnabled(Boolean blockInForwardCallsEnabled) {
    this.blockInForwardCallsEnabled = blockInForwardCallsEnabled;
  }


  public ReadCallerIDSettingsForAPerson200Response externalCallerIdNamePolicy(ExternalCallerIdNamePolicyEnum externalCallerIdNamePolicy) {
    this.externalCallerIdNamePolicy = externalCallerIdNamePolicy;
    return this;
  }

  /**
   * Designates which type of External Caller ID Name policy is used. Default is &#x60;DIRECT_LINE&#x60;.
   * @return externalCallerIdNamePolicy
   */
  @javax.annotation.Nullable
  public ExternalCallerIdNamePolicyEnum getExternalCallerIdNamePolicy() {
    return externalCallerIdNamePolicy;
  }

  public void setExternalCallerIdNamePolicy(ExternalCallerIdNamePolicyEnum externalCallerIdNamePolicy) {
    this.externalCallerIdNamePolicy = externalCallerIdNamePolicy;
  }


  public ReadCallerIDSettingsForAPerson200Response customExternalCallerIdName(String customExternalCallerIdName) {
    this.customExternalCallerIdName = customExternalCallerIdName;
    return this;
  }

  /**
   * Custom external caller ID name which will be shown if external caller ID name policy is &#x60;OTHER&#x60;.
   * @return customExternalCallerIdName
   */
  @javax.annotation.Nullable
  public String getCustomExternalCallerIdName() {
    return customExternalCallerIdName;
  }

  public void setCustomExternalCallerIdName(String customExternalCallerIdName) {
    this.customExternalCallerIdName = customExternalCallerIdName;
  }


  public ReadCallerIDSettingsForAPerson200Response locationExternalCallerIdName(String locationExternalCallerIdName) {
    this.locationExternalCallerIdName = locationExternalCallerIdName;
    return this;
  }

  /**
   * Location&#39;s external caller ID name which will be shown if external caller ID name policy is &#x60;LOCATION&#x60;.
   * @return locationExternalCallerIdName
   */
  @javax.annotation.Nonnull
  public String getLocationExternalCallerIdName() {
    return locationExternalCallerIdName;
  }

  public void setLocationExternalCallerIdName(String locationExternalCallerIdName) {
    this.locationExternalCallerIdName = locationExternalCallerIdName;
  }


  public ReadCallerIDSettingsForAPerson200Response additionalExternalCallerIdDirectLineEnabled(Boolean additionalExternalCallerIdDirectLineEnabled) {
    this.additionalExternalCallerIdDirectLineEnabled = additionalExternalCallerIdDirectLineEnabled;
    return this;
  }

  /**
   * Flag to indicate the person&#39;s direct line number is available as an additional external caller ID for the person.
   * @return additionalExternalCallerIdDirectLineEnabled
   */
  @javax.annotation.Nullable
  public Boolean getAdditionalExternalCallerIdDirectLineEnabled() {
    return additionalExternalCallerIdDirectLineEnabled;
  }

  public void setAdditionalExternalCallerIdDirectLineEnabled(Boolean additionalExternalCallerIdDirectLineEnabled) {
    this.additionalExternalCallerIdDirectLineEnabled = additionalExternalCallerIdDirectLineEnabled;
  }


  public ReadCallerIDSettingsForAPerson200Response additionalExternalCallerIdLocationNumberEnabled(Boolean additionalExternalCallerIdLocationNumberEnabled) {
    this.additionalExternalCallerIdLocationNumberEnabled = additionalExternalCallerIdLocationNumberEnabled;
    return this;
  }

  /**
   * Flag to indicate the location main number is available as an additional external caller ID for the person.
   * @return additionalExternalCallerIdLocationNumberEnabled
   */
  @javax.annotation.Nullable
  public Boolean getAdditionalExternalCallerIdLocationNumberEnabled() {
    return additionalExternalCallerIdLocationNumberEnabled;
  }

  public void setAdditionalExternalCallerIdLocationNumberEnabled(Boolean additionalExternalCallerIdLocationNumberEnabled) {
    this.additionalExternalCallerIdLocationNumberEnabled = additionalExternalCallerIdLocationNumberEnabled;
  }


  public ReadCallerIDSettingsForAPerson200Response additionalExternalCallerIdCustomNumber(String additionalExternalCallerIdCustomNumber) {
    this.additionalExternalCallerIdCustomNumber = additionalExternalCallerIdCustomNumber;
    return this;
  }

  /**
   * The custom number available as an additional external caller ID for the person. This value must be a number from the person&#39;s location or from another location with the same country, PSTN provider, and zone (only applicable for India locations) as the person&#39;s location.
   * @return additionalExternalCallerIdCustomNumber
   */
  @javax.annotation.Nullable
  public String getAdditionalExternalCallerIdCustomNumber() {
    return additionalExternalCallerIdCustomNumber;
  }

  public void setAdditionalExternalCallerIdCustomNumber(String additionalExternalCallerIdCustomNumber) {
    this.additionalExternalCallerIdCustomNumber = additionalExternalCallerIdCustomNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadCallerIDSettingsForAPerson200Response readCallerIDSettingsForAPerson200Response = (ReadCallerIDSettingsForAPerson200Response) o;
    return Objects.equals(this.types, readCallerIDSettingsForAPerson200Response.types) &&
        Objects.equals(this.selected, readCallerIDSettingsForAPerson200Response.selected) &&
        Objects.equals(this.directNumber, readCallerIDSettingsForAPerson200Response.directNumber) &&
        Objects.equals(this.extensionNumber, readCallerIDSettingsForAPerson200Response.extensionNumber) &&
        Objects.equals(this.locationNumber, readCallerIDSettingsForAPerson200Response.locationNumber) &&
        Objects.equals(this.tollFreeLocationNumber, readCallerIDSettingsForAPerson200Response.tollFreeLocationNumber) &&
        Objects.equals(this.customNumber, readCallerIDSettingsForAPerson200Response.customNumber) &&
        Objects.equals(this.firstName, readCallerIDSettingsForAPerson200Response.firstName) &&
        Objects.equals(this.lastName, readCallerIDSettingsForAPerson200Response.lastName) &&
        Objects.equals(this.blockInForwardCallsEnabled, readCallerIDSettingsForAPerson200Response.blockInForwardCallsEnabled) &&
        Objects.equals(this.externalCallerIdNamePolicy, readCallerIDSettingsForAPerson200Response.externalCallerIdNamePolicy) &&
        Objects.equals(this.customExternalCallerIdName, readCallerIDSettingsForAPerson200Response.customExternalCallerIdName) &&
        Objects.equals(this.locationExternalCallerIdName, readCallerIDSettingsForAPerson200Response.locationExternalCallerIdName) &&
        Objects.equals(this.additionalExternalCallerIdDirectLineEnabled, readCallerIDSettingsForAPerson200Response.additionalExternalCallerIdDirectLineEnabled) &&
        Objects.equals(this.additionalExternalCallerIdLocationNumberEnabled, readCallerIDSettingsForAPerson200Response.additionalExternalCallerIdLocationNumberEnabled) &&
        Objects.equals(this.additionalExternalCallerIdCustomNumber, readCallerIDSettingsForAPerson200Response.additionalExternalCallerIdCustomNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(types, selected, directNumber, extensionNumber, locationNumber, tollFreeLocationNumber, customNumber, firstName, lastName, blockInForwardCallsEnabled, externalCallerIdNamePolicy, customExternalCallerIdName, locationExternalCallerIdName, additionalExternalCallerIdDirectLineEnabled, additionalExternalCallerIdLocationNumberEnabled, additionalExternalCallerIdCustomNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadCallerIDSettingsForAPerson200Response {\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
    sb.append("    directNumber: ").append(toIndentedString(directNumber)).append("\n");
    sb.append("    extensionNumber: ").append(toIndentedString(extensionNumber)).append("\n");
    sb.append("    locationNumber: ").append(toIndentedString(locationNumber)).append("\n");
    sb.append("    tollFreeLocationNumber: ").append(toIndentedString(tollFreeLocationNumber)).append("\n");
    sb.append("    customNumber: ").append(toIndentedString(customNumber)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    blockInForwardCallsEnabled: ").append(toIndentedString(blockInForwardCallsEnabled)).append("\n");
    sb.append("    externalCallerIdNamePolicy: ").append(toIndentedString(externalCallerIdNamePolicy)).append("\n");
    sb.append("    customExternalCallerIdName: ").append(toIndentedString(customExternalCallerIdName)).append("\n");
    sb.append("    locationExternalCallerIdName: ").append(toIndentedString(locationExternalCallerIdName)).append("\n");
    sb.append("    additionalExternalCallerIdDirectLineEnabled: ").append(toIndentedString(additionalExternalCallerIdDirectLineEnabled)).append("\n");
    sb.append("    additionalExternalCallerIdLocationNumberEnabled: ").append(toIndentedString(additionalExternalCallerIdLocationNumberEnabled)).append("\n");
    sb.append("    additionalExternalCallerIdCustomNumber: ").append(toIndentedString(additionalExternalCallerIdCustomNumber)).append("\n");
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
    openapiFields.add("types");
    openapiFields.add("selected");
    openapiFields.add("directNumber");
    openapiFields.add("extensionNumber");
    openapiFields.add("locationNumber");
    openapiFields.add("tollFreeLocationNumber");
    openapiFields.add("customNumber");
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("blockInForwardCallsEnabled");
    openapiFields.add("externalCallerIdNamePolicy");
    openapiFields.add("customExternalCallerIdName");
    openapiFields.add("locationExternalCallerIdName");
    openapiFields.add("additionalExternalCallerIdDirectLineEnabled");
    openapiFields.add("additionalExternalCallerIdLocationNumberEnabled");
    openapiFields.add("additionalExternalCallerIdCustomNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("types");
    openapiRequiredFields.add("selected");
    openapiRequiredFields.add("tollFreeLocationNumber");
    openapiRequiredFields.add("firstName");
    openapiRequiredFields.add("lastName");
    openapiRequiredFields.add("blockInForwardCallsEnabled");
    openapiRequiredFields.add("locationExternalCallerIdName");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReadCallerIDSettingsForAPerson200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReadCallerIDSettingsForAPerson200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReadCallerIDSettingsForAPerson200Response is not found in the empty JSON string", ReadCallerIDSettingsForAPerson200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReadCallerIDSettingsForAPerson200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReadCallerIDSettingsForAPerson200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReadCallerIDSettingsForAPerson200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("types") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `types` to be an array in the JSON string but got `%s`", jsonObj.get("types").toString()));
      }
      if (!jsonObj.get("selected").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `selected` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selected").toString()));
      }
      // validate the required field `selected`
      SelectedEnum.validateJsonElement(jsonObj.get("selected"));
      if ((jsonObj.get("directNumber") != null && !jsonObj.get("directNumber").isJsonNull()) && !jsonObj.get("directNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `directNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("directNumber").toString()));
      }
      if ((jsonObj.get("extensionNumber") != null && !jsonObj.get("extensionNumber").isJsonNull()) && !jsonObj.get("extensionNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extensionNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extensionNumber").toString()));
      }
      if ((jsonObj.get("locationNumber") != null && !jsonObj.get("locationNumber").isJsonNull()) && !jsonObj.get("locationNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationNumber").toString()));
      }
      if ((jsonObj.get("customNumber") != null && !jsonObj.get("customNumber").isJsonNull()) && !jsonObj.get("customNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customNumber").toString()));
      }
      if (!jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if (!jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("externalCallerIdNamePolicy") != null && !jsonObj.get("externalCallerIdNamePolicy").isJsonNull()) && !jsonObj.get("externalCallerIdNamePolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalCallerIdNamePolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalCallerIdNamePolicy").toString()));
      }
      // validate the optional field `externalCallerIdNamePolicy`
      if (jsonObj.get("externalCallerIdNamePolicy") != null && !jsonObj.get("externalCallerIdNamePolicy").isJsonNull()) {
        ExternalCallerIdNamePolicyEnum.validateJsonElement(jsonObj.get("externalCallerIdNamePolicy"));
      }
      if ((jsonObj.get("customExternalCallerIdName") != null && !jsonObj.get("customExternalCallerIdName").isJsonNull()) && !jsonObj.get("customExternalCallerIdName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customExternalCallerIdName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customExternalCallerIdName").toString()));
      }
      if (!jsonObj.get("locationExternalCallerIdName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationExternalCallerIdName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationExternalCallerIdName").toString()));
      }
      if ((jsonObj.get("additionalExternalCallerIdCustomNumber") != null && !jsonObj.get("additionalExternalCallerIdCustomNumber").isJsonNull()) && !jsonObj.get("additionalExternalCallerIdCustomNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `additionalExternalCallerIdCustomNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("additionalExternalCallerIdCustomNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReadCallerIDSettingsForAPerson200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReadCallerIDSettingsForAPerson200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReadCallerIDSettingsForAPerson200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReadCallerIDSettingsForAPerson200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ReadCallerIDSettingsForAPerson200Response>() {
           @Override
           public void write(JsonWriter out, ReadCallerIDSettingsForAPerson200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReadCallerIDSettingsForAPerson200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReadCallerIDSettingsForAPerson200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReadCallerIDSettingsForAPerson200Response
   * @throws IOException if the JSON string is invalid with respect to ReadCallerIDSettingsForAPerson200Response
   */
  public static ReadCallerIDSettingsForAPerson200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReadCallerIDSettingsForAPerson200Response.class);
  }

  /**
   * Convert an instance of ReadCallerIDSettingsForAPerson200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

