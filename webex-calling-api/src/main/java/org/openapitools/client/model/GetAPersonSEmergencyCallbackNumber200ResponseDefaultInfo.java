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
 * Gives Emergency Callback Number effective value when none of the above is assigned or some other value is set behind the scene.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class GetAPersonSEmergencyCallbackNumber200ResponseDefaultInfo {
  public static final String SERIALIZED_NAME_EFFECTIVE_VALUE = "effectiveValue";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_VALUE)
  private String effectiveValue;

  /**
   * Used to represent whether a number is a recommended ECBN.
   */
  @JsonAdapter(QualityEnum.Adapter.class)
  public enum QualityEnum {
    RECOMMENDED("RECOMMENDED"),
    
    NOT_RECOMMENDED("NOT_RECOMMENDED"),
    
    INVALID("INVALID"),
    
    RECOMMENDED2("RECOMMENDED");

    private String value;

    QualityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static QualityEnum fromValue(String value) {
      for (QualityEnum b : QualityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<QualityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final QualityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public QualityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return QualityEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      QualityEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_QUALITY = "quality";
  @SerializedName(SERIALIZED_NAME_QUALITY)
  private QualityEnum quality;

  public GetAPersonSEmergencyCallbackNumber200ResponseDefaultInfo() {
  }

  public GetAPersonSEmergencyCallbackNumber200ResponseDefaultInfo effectiveValue(String effectiveValue) {
    this.effectiveValue = effectiveValue;
    return this;
  }

  /**
   * The field contains the ECBN number.
   * @return effectiveValue
   */
  @javax.annotation.Nullable
  public String getEffectiveValue() {
    return effectiveValue;
  }

  public void setEffectiveValue(String effectiveValue) {
    this.effectiveValue = effectiveValue;
  }


  public GetAPersonSEmergencyCallbackNumber200ResponseDefaultInfo quality(QualityEnum quality) {
    this.quality = quality;
    return this;
  }

  /**
   * Used to represent whether a number is a recommended ECBN.
   * @return quality
   */
  @javax.annotation.Nullable
  public QualityEnum getQuality() {
    return quality;
  }

  public void setQuality(QualityEnum quality) {
    this.quality = quality;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAPersonSEmergencyCallbackNumber200ResponseDefaultInfo getAPersonSEmergencyCallbackNumber200ResponseDefaultInfo = (GetAPersonSEmergencyCallbackNumber200ResponseDefaultInfo) o;
    return Objects.equals(this.effectiveValue, getAPersonSEmergencyCallbackNumber200ResponseDefaultInfo.effectiveValue) &&
        Objects.equals(this.quality, getAPersonSEmergencyCallbackNumber200ResponseDefaultInfo.quality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectiveValue, quality);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAPersonSEmergencyCallbackNumber200ResponseDefaultInfo {\n");
    sb.append("    effectiveValue: ").append(toIndentedString(effectiveValue)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
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
    openapiFields.add("effectiveValue");
    openapiFields.add("quality");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetAPersonSEmergencyCallbackNumber200ResponseDefaultInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetAPersonSEmergencyCallbackNumber200ResponseDefaultInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAPersonSEmergencyCallbackNumber200ResponseDefaultInfo is not found in the empty JSON string", GetAPersonSEmergencyCallbackNumber200ResponseDefaultInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetAPersonSEmergencyCallbackNumber200ResponseDefaultInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetAPersonSEmergencyCallbackNumber200ResponseDefaultInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("effectiveValue") != null && !jsonObj.get("effectiveValue").isJsonNull()) && !jsonObj.get("effectiveValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effectiveValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effectiveValue").toString()));
      }
      if ((jsonObj.get("quality") != null && !jsonObj.get("quality").isJsonNull()) && !jsonObj.get("quality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quality").toString()));
      }
      // validate the optional field `quality`
      if (jsonObj.get("quality") != null && !jsonObj.get("quality").isJsonNull()) {
        QualityEnum.validateJsonElement(jsonObj.get("quality"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetAPersonSEmergencyCallbackNumber200ResponseDefaultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAPersonSEmergencyCallbackNumber200ResponseDefaultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAPersonSEmergencyCallbackNumber200ResponseDefaultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAPersonSEmergencyCallbackNumber200ResponseDefaultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAPersonSEmergencyCallbackNumber200ResponseDefaultInfo>() {
           @Override
           public void write(JsonWriter out, GetAPersonSEmergencyCallbackNumber200ResponseDefaultInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetAPersonSEmergencyCallbackNumber200ResponseDefaultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetAPersonSEmergencyCallbackNumber200ResponseDefaultInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetAPersonSEmergencyCallbackNumber200ResponseDefaultInfo
   * @throws IOException if the JSON string is invalid with respect to GetAPersonSEmergencyCallbackNumber200ResponseDefaultInfo
   */
  public static GetAPersonSEmergencyCallbackNumber200ResponseDefaultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAPersonSEmergencyCallbackNumber200ResponseDefaultInfo.class);
  }

  /**
   * Convert an instance of GetAPersonSEmergencyCallbackNumber200ResponseDefaultInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

