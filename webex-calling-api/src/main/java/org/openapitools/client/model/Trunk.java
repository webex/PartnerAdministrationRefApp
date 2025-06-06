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
import org.openapitools.client.model.Location;
import org.openapitools.client.model.TrunkType;

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
 * Trunk
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class Trunk {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private Location location;

  public static final String SERIALIZED_NAME_IN_USE = "inUse";
  @SerializedName(SERIALIZED_NAME_IN_USE)
  private Boolean inUse;

  public static final String SERIALIZED_NAME_TRUNK_TYPE = "trunkType";
  @SerializedName(SERIALIZED_NAME_TRUNK_TYPE)
  private TrunkType trunkType;

  public static final String SERIALIZED_NAME_IS_RESTRICTED_TO_DEDICATED_INSTANCE = "isRestrictedToDedicatedInstance";
  @SerializedName(SERIALIZED_NAME_IS_RESTRICTED_TO_DEDICATED_INSTANCE)
  private Boolean isRestrictedToDedicatedInstance;

  public Trunk() {
  }

  public Trunk id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the trunk.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Trunk name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A unique name for the trunk.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Trunk location(Location location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  @javax.annotation.Nullable
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }


  public Trunk inUse(Boolean inUse) {
    this.inUse = inUse;
    return this;
  }

  /**
   * Trunk in use flag.
   * @return inUse
   */
  @javax.annotation.Nullable
  public Boolean getInUse() {
    return inUse;
  }

  public void setInUse(Boolean inUse) {
    this.inUse = inUse;
  }


  public Trunk trunkType(TrunkType trunkType) {
    this.trunkType = trunkType;
    return this;
  }

  /**
   * Get trunkType
   * @return trunkType
   */
  @javax.annotation.Nullable
  public TrunkType getTrunkType() {
    return trunkType;
  }

  public void setTrunkType(TrunkType trunkType) {
    this.trunkType = trunkType;
  }


  public Trunk isRestrictedToDedicatedInstance(Boolean isRestrictedToDedicatedInstance) {
    this.isRestrictedToDedicatedInstance = isRestrictedToDedicatedInstance;
    return this;
  }

  /**
   * Flag to indicate if the trunk is restricted to a dedicated instance.
   * @return isRestrictedToDedicatedInstance
   */
  @javax.annotation.Nullable
  public Boolean getIsRestrictedToDedicatedInstance() {
    return isRestrictedToDedicatedInstance;
  }

  public void setIsRestrictedToDedicatedInstance(Boolean isRestrictedToDedicatedInstance) {
    this.isRestrictedToDedicatedInstance = isRestrictedToDedicatedInstance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Trunk trunk = (Trunk) o;
    return Objects.equals(this.id, trunk.id) &&
        Objects.equals(this.name, trunk.name) &&
        Objects.equals(this.location, trunk.location) &&
        Objects.equals(this.inUse, trunk.inUse) &&
        Objects.equals(this.trunkType, trunk.trunkType) &&
        Objects.equals(this.isRestrictedToDedicatedInstance, trunk.isRestrictedToDedicatedInstance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, location, inUse, trunkType, isRestrictedToDedicatedInstance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trunk {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    inUse: ").append(toIndentedString(inUse)).append("\n");
    sb.append("    trunkType: ").append(toIndentedString(trunkType)).append("\n");
    sb.append("    isRestrictedToDedicatedInstance: ").append(toIndentedString(isRestrictedToDedicatedInstance)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("location");
    openapiFields.add("inUse");
    openapiFields.add("trunkType");
    openapiFields.add("isRestrictedToDedicatedInstance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Trunk
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Trunk.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Trunk is not found in the empty JSON string", Trunk.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Trunk.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Trunk` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Trunk.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        Location.validateJsonElement(jsonObj.get("location"));
      }
      // validate the optional field `trunkType`
      if (jsonObj.get("trunkType") != null && !jsonObj.get("trunkType").isJsonNull()) {
        TrunkType.validateJsonElement(jsonObj.get("trunkType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Trunk.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Trunk' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Trunk> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Trunk.class));

       return (TypeAdapter<T>) new TypeAdapter<Trunk>() {
           @Override
           public void write(JsonWriter out, Trunk value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Trunk read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Trunk given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Trunk
   * @throws IOException if the JSON string is invalid with respect to Trunk
   */
  public static Trunk fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Trunk.class);
  }

  /**
   * Convert an instance of Trunk to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

