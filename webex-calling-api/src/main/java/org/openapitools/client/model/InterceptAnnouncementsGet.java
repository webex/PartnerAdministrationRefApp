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
import org.openapitools.client.model.InterceptNumberGet;

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
 * InterceptAnnouncementsGet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class InterceptAnnouncementsGet {
  /**
   * Indicates that a system default message will be placed when incoming calls are intercepted.
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

  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename;

  public static final String SERIALIZED_NAME_NEW_NUMBER = "newNumber";
  @SerializedName(SERIALIZED_NAME_NEW_NUMBER)
  private InterceptNumberGet newNumber;

  public static final String SERIALIZED_NAME_ZERO_TRANSFER = "zeroTransfer";
  @SerializedName(SERIALIZED_NAME_ZERO_TRANSFER)
  private InterceptNumberGet zeroTransfer;

  public InterceptAnnouncementsGet() {
  }

  public InterceptAnnouncementsGet greeting(GreetingEnum greeting) {
    this.greeting = greeting;
    return this;
  }

  /**
   * Indicates that a system default message will be placed when incoming calls are intercepted.
   * @return greeting
   */
  @javax.annotation.Nonnull
  public GreetingEnum getGreeting() {
    return greeting;
  }

  public void setGreeting(GreetingEnum greeting) {
    this.greeting = greeting;
  }


  public InterceptAnnouncementsGet filename(String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * Filename of the custom greeting; this is an empty string if no custom greeting has been uploaded.
   * @return filename
   */
  @javax.annotation.Nullable
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }


  public InterceptAnnouncementsGet newNumber(InterceptNumberGet newNumber) {
    this.newNumber = newNumber;
    return this;
  }

  /**
   * Get newNumber
   * @return newNumber
   */
  @javax.annotation.Nonnull
  public InterceptNumberGet getNewNumber() {
    return newNumber;
  }

  public void setNewNumber(InterceptNumberGet newNumber) {
    this.newNumber = newNumber;
  }


  public InterceptAnnouncementsGet zeroTransfer(InterceptNumberGet zeroTransfer) {
    this.zeroTransfer = zeroTransfer;
    return this;
  }

  /**
   * Get zeroTransfer
   * @return zeroTransfer
   */
  @javax.annotation.Nonnull
  public InterceptNumberGet getZeroTransfer() {
    return zeroTransfer;
  }

  public void setZeroTransfer(InterceptNumberGet zeroTransfer) {
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
    InterceptAnnouncementsGet interceptAnnouncementsGet = (InterceptAnnouncementsGet) o;
    return Objects.equals(this.greeting, interceptAnnouncementsGet.greeting) &&
        Objects.equals(this.filename, interceptAnnouncementsGet.filename) &&
        Objects.equals(this.newNumber, interceptAnnouncementsGet.newNumber) &&
        Objects.equals(this.zeroTransfer, interceptAnnouncementsGet.zeroTransfer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(greeting, filename, newNumber, zeroTransfer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterceptAnnouncementsGet {\n");
    sb.append("    greeting: ").append(toIndentedString(greeting)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
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
    openapiFields.add("filename");
    openapiFields.add("newNumber");
    openapiFields.add("zeroTransfer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("greeting");
    openapiRequiredFields.add("newNumber");
    openapiRequiredFields.add("zeroTransfer");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InterceptAnnouncementsGet
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InterceptAnnouncementsGet.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InterceptAnnouncementsGet is not found in the empty JSON string", InterceptAnnouncementsGet.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InterceptAnnouncementsGet.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InterceptAnnouncementsGet` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InterceptAnnouncementsGet.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("greeting").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `greeting` to be a primitive type in the JSON string but got `%s`", jsonObj.get("greeting").toString()));
      }
      // validate the required field `greeting`
      GreetingEnum.validateJsonElement(jsonObj.get("greeting"));
      if ((jsonObj.get("filename") != null && !jsonObj.get("filename").isJsonNull()) && !jsonObj.get("filename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filename").toString()));
      }
      // validate the required field `newNumber`
      InterceptNumberGet.validateJsonElement(jsonObj.get("newNumber"));
      // validate the required field `zeroTransfer`
      InterceptNumberGet.validateJsonElement(jsonObj.get("zeroTransfer"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InterceptAnnouncementsGet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InterceptAnnouncementsGet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InterceptAnnouncementsGet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InterceptAnnouncementsGet.class));

       return (TypeAdapter<T>) new TypeAdapter<InterceptAnnouncementsGet>() {
           @Override
           public void write(JsonWriter out, InterceptAnnouncementsGet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InterceptAnnouncementsGet read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InterceptAnnouncementsGet given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InterceptAnnouncementsGet
   * @throws IOException if the JSON string is invalid with respect to InterceptAnnouncementsGet
   */
  public static InterceptAnnouncementsGet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InterceptAnnouncementsGet.class);
  }

  /**
   * Convert an instance of InterceptAnnouncementsGet to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

