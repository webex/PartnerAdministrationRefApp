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
import org.openapitools.client.model.UpdateAnAutoAttendantRequestAfterHoursMenu;
import org.openapitools.client.model.UpdateAnAutoAttendantRequestBusinessHoursMenu;

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
 * CreateAnAutoAttendantRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class CreateAnAutoAttendantRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_EXTENSION = "extension";
  @SerializedName(SERIALIZED_NAME_EXTENSION)
  private String extension;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_ALTERNATE_NUMBERS = "alternateNumbers";
  @SerializedName(SERIALIZED_NAME_ALTERNATE_NUMBERS)
  private List<Object> alternateNumbers = new ArrayList<>();

  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "languageCode";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private String languageCode;

  public static final String SERIALIZED_NAME_BUSINESS_SCHEDULE = "businessSchedule";
  @SerializedName(SERIALIZED_NAME_BUSINESS_SCHEDULE)
  private String businessSchedule;

  public static final String SERIALIZED_NAME_HOLIDAY_SCHEDULE = "holidaySchedule";
  @SerializedName(SERIALIZED_NAME_HOLIDAY_SCHEDULE)
  private String holidaySchedule;

  /**
   * Extension dialing setting. If the values are not set default will be set as &#x60;ENTERPRISE&#x60;.
   */
  @JsonAdapter(ExtensionDialingEnum.Adapter.class)
  public enum ExtensionDialingEnum {
    ENTERPRISE("ENTERPRISE"),
    
    GROUP("GROUP");

    private String value;

    ExtensionDialingEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExtensionDialingEnum fromValue(String value) {
      for (ExtensionDialingEnum b : ExtensionDialingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ExtensionDialingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExtensionDialingEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExtensionDialingEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ExtensionDialingEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ExtensionDialingEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_EXTENSION_DIALING = "extensionDialing";
  @SerializedName(SERIALIZED_NAME_EXTENSION_DIALING)
  private ExtensionDialingEnum extensionDialing;

  /**
   * Name dialing setting. If the values are not set default will be set as &#x60;ENTERPRISE&#x60;.
   */
  @JsonAdapter(NameDialingEnum.Adapter.class)
  public enum NameDialingEnum {
    ENTERPRISE("ENTERPRISE"),
    
    GROUP("GROUP");

    private String value;

    NameDialingEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NameDialingEnum fromValue(String value) {
      for (NameDialingEnum b : NameDialingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NameDialingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NameDialingEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NameDialingEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NameDialingEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      NameDialingEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_NAME_DIALING = "nameDialing";
  @SerializedName(SERIALIZED_NAME_NAME_DIALING)
  private NameDialingEnum nameDialing;

  public static final String SERIALIZED_NAME_TIME_ZONE = "timeZone";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE)
  private String timeZone;

  public static final String SERIALIZED_NAME_BUSINESS_HOURS_MENU = "businessHoursMenu";
  @SerializedName(SERIALIZED_NAME_BUSINESS_HOURS_MENU)
  private UpdateAnAutoAttendantRequestBusinessHoursMenu businessHoursMenu;

  public static final String SERIALIZED_NAME_AFTER_HOURS_MENU = "afterHoursMenu";
  @SerializedName(SERIALIZED_NAME_AFTER_HOURS_MENU)
  private UpdateAnAutoAttendantRequestAfterHoursMenu afterHoursMenu;

  public CreateAnAutoAttendantRequest() {
  }

  public CreateAnAutoAttendantRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Unique name for the auto attendant.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CreateAnAutoAttendantRequest phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Auto attendant phone number.  Either &#x60;phoneNumber&#x60; or &#x60;extension&#x60; is mandatory.
   * @return phoneNumber
   */
  @javax.annotation.Nullable
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public CreateAnAutoAttendantRequest extension(String extension) {
    this.extension = extension;
    return this;
  }

  /**
   * Auto attendant extension.  Either &#x60;phoneNumber&#x60; or &#x60;extension&#x60; is mandatory.
   * @return extension
   */
  @javax.annotation.Nullable
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }


  public CreateAnAutoAttendantRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name defined for an auto attendant.
   * @return firstName
   */
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public CreateAnAutoAttendantRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name defined for an auto attendant.
   * @return lastName
   */
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public CreateAnAutoAttendantRequest alternateNumbers(List<Object> alternateNumbers) {
    this.alternateNumbers = alternateNumbers;
    return this;
  }

  public CreateAnAutoAttendantRequest addAlternateNumbersItem(Object alternateNumbersItem) {
    if (this.alternateNumbers == null) {
      this.alternateNumbers = new ArrayList<>();
    }
    this.alternateNumbers.add(alternateNumbersItem);
    return this;
  }

  /**
   * Alternate numbers defined for the auto attendant.
   * @return alternateNumbers
   */
  @javax.annotation.Nullable
  public List<Object> getAlternateNumbers() {
    return alternateNumbers;
  }

  public void setAlternateNumbers(List<Object> alternateNumbers) {
    this.alternateNumbers = alternateNumbers;
  }


  public CreateAnAutoAttendantRequest languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * Announcement language code for the auto attendant.
   * @return languageCode
   */
  @javax.annotation.Nullable
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public CreateAnAutoAttendantRequest businessSchedule(String businessSchedule) {
    this.businessSchedule = businessSchedule;
    return this;
  }

  /**
   * Business hours defined for the auto attendant.
   * @return businessSchedule
   */
  @javax.annotation.Nonnull
  public String getBusinessSchedule() {
    return businessSchedule;
  }

  public void setBusinessSchedule(String businessSchedule) {
    this.businessSchedule = businessSchedule;
  }


  public CreateAnAutoAttendantRequest holidaySchedule(String holidaySchedule) {
    this.holidaySchedule = holidaySchedule;
    return this;
  }

  /**
   * Holiday defined for the auto attendant.
   * @return holidaySchedule
   */
  @javax.annotation.Nullable
  public String getHolidaySchedule() {
    return holidaySchedule;
  }

  public void setHolidaySchedule(String holidaySchedule) {
    this.holidaySchedule = holidaySchedule;
  }


  public CreateAnAutoAttendantRequest extensionDialing(ExtensionDialingEnum extensionDialing) {
    this.extensionDialing = extensionDialing;
    return this;
  }

  /**
   * Extension dialing setting. If the values are not set default will be set as &#x60;ENTERPRISE&#x60;.
   * @return extensionDialing
   */
  @javax.annotation.Nullable
  public ExtensionDialingEnum getExtensionDialing() {
    return extensionDialing;
  }

  public void setExtensionDialing(ExtensionDialingEnum extensionDialing) {
    this.extensionDialing = extensionDialing;
  }


  public CreateAnAutoAttendantRequest nameDialing(NameDialingEnum nameDialing) {
    this.nameDialing = nameDialing;
    return this;
  }

  /**
   * Name dialing setting. If the values are not set default will be set as &#x60;ENTERPRISE&#x60;.
   * @return nameDialing
   */
  @javax.annotation.Nullable
  public NameDialingEnum getNameDialing() {
    return nameDialing;
  }

  public void setNameDialing(NameDialingEnum nameDialing) {
    this.nameDialing = nameDialing;
  }


  public CreateAnAutoAttendantRequest timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Time zone defined for the auto attendant.
   * @return timeZone
   */
  @javax.annotation.Nullable
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  public CreateAnAutoAttendantRequest businessHoursMenu(UpdateAnAutoAttendantRequestBusinessHoursMenu businessHoursMenu) {
    this.businessHoursMenu = businessHoursMenu;
    return this;
  }

  /**
   * Get businessHoursMenu
   * @return businessHoursMenu
   */
  @javax.annotation.Nonnull
  public UpdateAnAutoAttendantRequestBusinessHoursMenu getBusinessHoursMenu() {
    return businessHoursMenu;
  }

  public void setBusinessHoursMenu(UpdateAnAutoAttendantRequestBusinessHoursMenu businessHoursMenu) {
    this.businessHoursMenu = businessHoursMenu;
  }


  public CreateAnAutoAttendantRequest afterHoursMenu(UpdateAnAutoAttendantRequestAfterHoursMenu afterHoursMenu) {
    this.afterHoursMenu = afterHoursMenu;
    return this;
  }

  /**
   * Get afterHoursMenu
   * @return afterHoursMenu
   */
  @javax.annotation.Nonnull
  public UpdateAnAutoAttendantRequestAfterHoursMenu getAfterHoursMenu() {
    return afterHoursMenu;
  }

  public void setAfterHoursMenu(UpdateAnAutoAttendantRequestAfterHoursMenu afterHoursMenu) {
    this.afterHoursMenu = afterHoursMenu;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAnAutoAttendantRequest createAnAutoAttendantRequest = (CreateAnAutoAttendantRequest) o;
    return Objects.equals(this.name, createAnAutoAttendantRequest.name) &&
        Objects.equals(this.phoneNumber, createAnAutoAttendantRequest.phoneNumber) &&
        Objects.equals(this.extension, createAnAutoAttendantRequest.extension) &&
        Objects.equals(this.firstName, createAnAutoAttendantRequest.firstName) &&
        Objects.equals(this.lastName, createAnAutoAttendantRequest.lastName) &&
        Objects.equals(this.alternateNumbers, createAnAutoAttendantRequest.alternateNumbers) &&
        Objects.equals(this.languageCode, createAnAutoAttendantRequest.languageCode) &&
        Objects.equals(this.businessSchedule, createAnAutoAttendantRequest.businessSchedule) &&
        Objects.equals(this.holidaySchedule, createAnAutoAttendantRequest.holidaySchedule) &&
        Objects.equals(this.extensionDialing, createAnAutoAttendantRequest.extensionDialing) &&
        Objects.equals(this.nameDialing, createAnAutoAttendantRequest.nameDialing) &&
        Objects.equals(this.timeZone, createAnAutoAttendantRequest.timeZone) &&
        Objects.equals(this.businessHoursMenu, createAnAutoAttendantRequest.businessHoursMenu) &&
        Objects.equals(this.afterHoursMenu, createAnAutoAttendantRequest.afterHoursMenu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, phoneNumber, extension, firstName, lastName, alternateNumbers, languageCode, businessSchedule, holidaySchedule, extensionDialing, nameDialing, timeZone, businessHoursMenu, afterHoursMenu);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAnAutoAttendantRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    alternateNumbers: ").append(toIndentedString(alternateNumbers)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    businessSchedule: ").append(toIndentedString(businessSchedule)).append("\n");
    sb.append("    holidaySchedule: ").append(toIndentedString(holidaySchedule)).append("\n");
    sb.append("    extensionDialing: ").append(toIndentedString(extensionDialing)).append("\n");
    sb.append("    nameDialing: ").append(toIndentedString(nameDialing)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    businessHoursMenu: ").append(toIndentedString(businessHoursMenu)).append("\n");
    sb.append("    afterHoursMenu: ").append(toIndentedString(afterHoursMenu)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("phoneNumber");
    openapiFields.add("extension");
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("alternateNumbers");
    openapiFields.add("languageCode");
    openapiFields.add("businessSchedule");
    openapiFields.add("holidaySchedule");
    openapiFields.add("extensionDialing");
    openapiFields.add("nameDialing");
    openapiFields.add("timeZone");
    openapiFields.add("businessHoursMenu");
    openapiFields.add("afterHoursMenu");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("businessSchedule");
    openapiRequiredFields.add("businessHoursMenu");
    openapiRequiredFields.add("afterHoursMenu");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateAnAutoAttendantRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateAnAutoAttendantRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateAnAutoAttendantRequest is not found in the empty JSON string", CreateAnAutoAttendantRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateAnAutoAttendantRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateAnAutoAttendantRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateAnAutoAttendantRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("phoneNumber") != null && !jsonObj.get("phoneNumber").isJsonNull()) && !jsonObj.get("phoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumber").toString()));
      }
      if ((jsonObj.get("extension") != null && !jsonObj.get("extension").isJsonNull()) && !jsonObj.get("extension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extension").toString()));
      }
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("alternateNumbers") != null && !jsonObj.get("alternateNumbers").isJsonNull() && !jsonObj.get("alternateNumbers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `alternateNumbers` to be an array in the JSON string but got `%s`", jsonObj.get("alternateNumbers").toString()));
      }
      if ((jsonObj.get("languageCode") != null && !jsonObj.get("languageCode").isJsonNull()) && !jsonObj.get("languageCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `languageCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("languageCode").toString()));
      }
      if (!jsonObj.get("businessSchedule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `businessSchedule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("businessSchedule").toString()));
      }
      if ((jsonObj.get("holidaySchedule") != null && !jsonObj.get("holidaySchedule").isJsonNull()) && !jsonObj.get("holidaySchedule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `holidaySchedule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("holidaySchedule").toString()));
      }
      if ((jsonObj.get("extensionDialing") != null && !jsonObj.get("extensionDialing").isJsonNull()) && !jsonObj.get("extensionDialing").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extensionDialing` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extensionDialing").toString()));
      }
      // validate the optional field `extensionDialing`
      if (jsonObj.get("extensionDialing") != null && !jsonObj.get("extensionDialing").isJsonNull()) {
        ExtensionDialingEnum.validateJsonElement(jsonObj.get("extensionDialing"));
      }
      if ((jsonObj.get("nameDialing") != null && !jsonObj.get("nameDialing").isJsonNull()) && !jsonObj.get("nameDialing").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nameDialing` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nameDialing").toString()));
      }
      // validate the optional field `nameDialing`
      if (jsonObj.get("nameDialing") != null && !jsonObj.get("nameDialing").isJsonNull()) {
        NameDialingEnum.validateJsonElement(jsonObj.get("nameDialing"));
      }
      if ((jsonObj.get("timeZone") != null && !jsonObj.get("timeZone").isJsonNull()) && !jsonObj.get("timeZone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeZone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeZone").toString()));
      }
      // validate the required field `businessHoursMenu`
      UpdateAnAutoAttendantRequestBusinessHoursMenu.validateJsonElement(jsonObj.get("businessHoursMenu"));
      // validate the required field `afterHoursMenu`
      UpdateAnAutoAttendantRequestAfterHoursMenu.validateJsonElement(jsonObj.get("afterHoursMenu"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateAnAutoAttendantRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateAnAutoAttendantRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateAnAutoAttendantRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateAnAutoAttendantRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateAnAutoAttendantRequest>() {
           @Override
           public void write(JsonWriter out, CreateAnAutoAttendantRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateAnAutoAttendantRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateAnAutoAttendantRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateAnAutoAttendantRequest
   * @throws IOException if the JSON string is invalid with respect to CreateAnAutoAttendantRequest
   */
  public static CreateAnAutoAttendantRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateAnAutoAttendantRequest.class);
  }

  /**
   * Convert an instance of CreateAnAutoAttendantRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

