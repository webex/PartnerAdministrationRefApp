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
import java.math.BigDecimal;
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
 * PostPersonPlaceVirtualLineCallQueueObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class PostPersonPlaceVirtualLineCallQueueObject {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private String weight;

  public static final String SERIALIZED_NAME_SKILL_LEVEL = "skillLevel";
  @SerializedName(SERIALIZED_NAME_SKILL_LEVEL)
  private BigDecimal skillLevel;

  public PostPersonPlaceVirtualLineCallQueueObject() {
  }

  public PostPersonPlaceVirtualLineCallQueueObject id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of person, workspace or virtual line.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public PostPersonPlaceVirtualLineCallQueueObject weight(String weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Weight of person, workspace or virtual line. Only applied when call policy is &#x60;WEIGHTED&#x60;.
   * @return weight
   */
  @javax.annotation.Nullable
  public String getWeight() {
    return weight;
  }

  public void setWeight(String weight) {
    this.weight = weight;
  }


  public PostPersonPlaceVirtualLineCallQueueObject skillLevel(BigDecimal skillLevel) {
    this.skillLevel = skillLevel;
    return this;
  }

  /**
   * Skill level of person, workspace or virtual line. Only applied when call routing type is &#x60;SKILL_BASED&#x60;.
   * @return skillLevel
   */
  @javax.annotation.Nullable
  public BigDecimal getSkillLevel() {
    return skillLevel;
  }

  public void setSkillLevel(BigDecimal skillLevel) {
    this.skillLevel = skillLevel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPersonPlaceVirtualLineCallQueueObject postPersonPlaceVirtualLineCallQueueObject = (PostPersonPlaceVirtualLineCallQueueObject) o;
    return Objects.equals(this.id, postPersonPlaceVirtualLineCallQueueObject.id) &&
        Objects.equals(this.weight, postPersonPlaceVirtualLineCallQueueObject.weight) &&
        Objects.equals(this.skillLevel, postPersonPlaceVirtualLineCallQueueObject.skillLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, weight, skillLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPersonPlaceVirtualLineCallQueueObject {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    skillLevel: ").append(toIndentedString(skillLevel)).append("\n");
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
    openapiFields.add("weight");
    openapiFields.add("skillLevel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PostPersonPlaceVirtualLineCallQueueObject
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PostPersonPlaceVirtualLineCallQueueObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PostPersonPlaceVirtualLineCallQueueObject is not found in the empty JSON string", PostPersonPlaceVirtualLineCallQueueObject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PostPersonPlaceVirtualLineCallQueueObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PostPersonPlaceVirtualLineCallQueueObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PostPersonPlaceVirtualLineCallQueueObject.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("weight") != null && !jsonObj.get("weight").isJsonNull()) && !jsonObj.get("weight").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `weight` to be a primitive type in the JSON string but got `%s`", jsonObj.get("weight").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PostPersonPlaceVirtualLineCallQueueObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PostPersonPlaceVirtualLineCallQueueObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PostPersonPlaceVirtualLineCallQueueObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PostPersonPlaceVirtualLineCallQueueObject.class));

       return (TypeAdapter<T>) new TypeAdapter<PostPersonPlaceVirtualLineCallQueueObject>() {
           @Override
           public void write(JsonWriter out, PostPersonPlaceVirtualLineCallQueueObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PostPersonPlaceVirtualLineCallQueueObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PostPersonPlaceVirtualLineCallQueueObject given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PostPersonPlaceVirtualLineCallQueueObject
   * @throws IOException if the JSON string is invalid with respect to PostPersonPlaceVirtualLineCallQueueObject
   */
  public static PostPersonPlaceVirtualLineCallQueueObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PostPersonPlaceVirtualLineCallQueueObject.class);
  }

  /**
   * Convert an instance of PostPersonPlaceVirtualLineCallQueueObject to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

