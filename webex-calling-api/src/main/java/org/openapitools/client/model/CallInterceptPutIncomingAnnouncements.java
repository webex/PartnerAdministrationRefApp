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
import org.openapitools.client.model.CallInterceptPutIncomingAnnouncementsNewNumber;
import org.openapitools.client.model.CallInterceptPutIncomingAnnouncementsZeroTransfer;

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
public class CallInterceptPutIncomingAnnouncements {
  /**
   * &#x60;DEFAULT&#x60; indicates that a system default message will be placed when incoming calls are intercepted.
   */
  @JsonAdapter(GreetingEnum.Adapter.class)
  public enum GreetingEnum {
    CUSTOM("CUSTOM"),
    
    DEFAULT("DEFAULT");

    private String value;

    GreetingEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GreetingEnum fromValue(String value) {
      for (GreetingEnum b : GreetingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<GreetingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GreetingEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GreetingEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return GreetingEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      GreetingEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_GREETING = "greeting";
  @SerializedName(SERIALIZED_NAME_GREETING)
  private GreetingEnum greeting;

  public static final String SERIALIZED_NAME_NEW_NUMBER = "newNumber";
  @SerializedName(SERIALIZED_NAME_NEW_NUMBER)
  private CallInterceptPutIncomingAnnouncementsNewNumber newNumber;

  public static final String SERIALIZED_NAME_ZERO_TRANSFER = "zeroTransfer";
  @SerializedName(SERIALIZED_NAME_ZERO_TRANSFER)
  private CallInterceptPutIncomingAnnouncementsZeroTransfer zeroTransfer;

  public CallInterceptPutIncomingAnnouncements() {
  }

  public CallInterceptPutIncomingAnnouncements greeting(GreetingEnum greeting) {
    this.greeting = greeting;
    return this;
  }

  /**
   * &#x60;DEFAULT&#x60; indicates that a system default message will be placed when incoming calls are intercepted.
   * @return greeting
   */
  @javax.annotation.Nullable
  public GreetingEnum getGreeting() {
    return greeting;
  }

  public void setGreeting(GreetingEnum greeting) {
    this.greeting = greeting;
  }


  public CallInterceptPutIncomingAnnouncements newNumber(CallInterceptPutIncomingAnnouncementsNewNumber newNumber) {
    this.newNumber = newNumber;
    return this;
  }

  /**
   * Get newNumber
   * @return newNumber
   */
  @javax.annotation.Nullable
  public CallInterceptPutIncomingAnnouncementsNewNumber getNewNumber() {
    return newNumber;
  }

  public void setNewNumber(CallInterceptPutIncomingAnnouncementsNewNumber newNumber) {
    this.newNumber = newNumber;
  }


  public CallInterceptPutIncomingAnnouncements zeroTransfer(CallInterceptPutIncomingAnnouncementsZeroTransfer zeroTransfer) {
    this.zeroTransfer = zeroTransfer;
    return this;
  }

  /**
   * Get zeroTransfer
   * @return zeroTransfer
   */
  @javax.annotation.Nullable
  public CallInterceptPutIncomingAnnouncementsZeroTransfer getZeroTransfer() {
    return zeroTransfer;
  }

  public void setZeroTransfer(CallInterceptPutIncomingAnnouncementsZeroTransfer zeroTransfer) {
    this.zeroTransfer = zeroTransfer;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallInterceptPutIncomingAnnouncements callInterceptPutIncomingAnnouncements = (CallInterceptPutIncomingAnnouncements) o;
    return Objects.equals(this.greeting, callInterceptPutIncomingAnnouncements.greeting) &&
        Objects.equals(this.newNumber, callInterceptPutIncomingAnnouncements.newNumber) &&
        Objects.equals(this.zeroTransfer, callInterceptPutIncomingAnnouncements.zeroTransfer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(greeting, newNumber, zeroTransfer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallInterceptPutIncomingAnnouncements {\n");
    sb.append("    greeting: ").append(toIndentedString(greeting)).append("\n");
    sb.append("    newNumber: ").append(toIndentedString(newNumber)).append("\n");
    sb.append("    zeroTransfer: ").append(toIndentedString(zeroTransfer)).append("\n");
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
    openapiFields.add("greeting");
    openapiFields.add("newNumber");
    openapiFields.add("zeroTransfer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CallInterceptPutIncomingAnnouncements
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CallInterceptPutIncomingAnnouncements.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CallInterceptPutIncomingAnnouncements is not found in the empty JSON string", CallInterceptPutIncomingAnnouncements.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CallInterceptPutIncomingAnnouncements.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CallInterceptPutIncomingAnnouncements` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("greeting") != null && !jsonObj.get("greeting").isJsonNull()) && !jsonObj.get("greeting").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `greeting` to be a primitive type in the JSON string but got `%s`", jsonObj.get("greeting").toString()));
      }
      // validate the optional field `greeting`
      if (jsonObj.get("greeting") != null && !jsonObj.get("greeting").isJsonNull()) {
        GreetingEnum.validateJsonElement(jsonObj.get("greeting"));
      }
      // validate the optional field `newNumber`
      if (jsonObj.get("newNumber") != null && !jsonObj.get("newNumber").isJsonNull()) {
        CallInterceptPutIncomingAnnouncementsNewNumber.validateJsonElement(jsonObj.get("newNumber"));
      }
      // validate the optional field `zeroTransfer`
      if (jsonObj.get("zeroTransfer") != null && !jsonObj.get("zeroTransfer").isJsonNull()) {
        CallInterceptPutIncomingAnnouncementsZeroTransfer.validateJsonElement(jsonObj.get("zeroTransfer"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CallInterceptPutIncomingAnnouncements.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CallInterceptPutIncomingAnnouncements' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CallInterceptPutIncomingAnnouncements> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CallInterceptPutIncomingAnnouncements.class));

       return (TypeAdapter<T>) new TypeAdapter<CallInterceptPutIncomingAnnouncements>() {
           @Override
           public void write(JsonWriter out, CallInterceptPutIncomingAnnouncements value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CallInterceptPutIncomingAnnouncements read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CallInterceptPutIncomingAnnouncements given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CallInterceptPutIncomingAnnouncements
   * @throws IOException if the JSON string is invalid with respect to CallInterceptPutIncomingAnnouncements
   */
  public static CallInterceptPutIncomingAnnouncements fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CallInterceptPutIncomingAnnouncements.class);
  }

  /**
   * Convert an instance of CallInterceptPutIncomingAnnouncements to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

