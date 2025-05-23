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
import org.openapitools.client.model.RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMemberNumbersInner;

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
 * RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  /**
   * Indicates whether the type is &#x60;PEOPLE&#x60;, &#x60;PLACE&#x60; or &#x60;VIRTUAL_LINE&#x60;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PEOPLE("PEOPLE"),
    
    PLACE("PLACE"),
    
    VIRTUAL_LINE("VIRTUAL_LINE");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_NUMBERS = "numbers";
  @SerializedName(SERIALIZED_NAME_NUMBERS)
  private List<RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMemberNumbersInner> numbers = new ArrayList<>();

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_LOCATION_ID = "locationId";
  @SerializedName(SERIALIZED_NAME_LOCATION_ID)
  private String locationId;

  public RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember() {
  }

  public RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier of the monitored person.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The last name of the monitored person, place or virtual line.
   * @return lastName
   */
  @javax.annotation.Nonnull
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The first name of the monitored person, place or virtual line.
   * @return firstName
   */
  @javax.annotation.Nonnull
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name of the monitored person, place or virtual line.
   * @return displayName
   */
  @javax.annotation.Nonnull
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Indicates whether the type is &#x60;PEOPLE&#x60;, &#x60;PLACE&#x60; or &#x60;VIRTUAL_LINE&#x60;.
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  public RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address of the monitored person, place or virtual line.
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember numbers(List<RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMemberNumbersInner> numbers) {
    this.numbers = numbers;
    return this;
  }

  public RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember addNumbersItem(RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMemberNumbersInner numbersItem) {
    if (this.numbers == null) {
      this.numbers = new ArrayList<>();
    }
    this.numbers.add(numbersItem);
    return this;
  }

  /**
   * The list of phone numbers of the monitored person, place or virtual line.
   * @return numbers
   */
  @javax.annotation.Nonnull
  public List<RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMemberNumbersInner> getNumbers() {
    return numbers;
  }

  public void setNumbers(List<RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMemberNumbersInner> numbers) {
    this.numbers = numbers;
  }


  public RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember location(String location) {
    this.location = location;
    return this;
  }

  /**
   * The location name where the call park extension is.
   * @return location
   */
  @javax.annotation.Nonnull
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  public RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * The ID for the location.
   * @return locationId
   */
  @javax.annotation.Nonnull
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember retrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember = (RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember) o;
    return Objects.equals(this.id, retrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember.id) &&
        Objects.equals(this.lastName, retrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember.lastName) &&
        Objects.equals(this.firstName, retrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember.firstName) &&
        Objects.equals(this.displayName, retrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember.displayName) &&
        Objects.equals(this.type, retrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember.type) &&
        Objects.equals(this.email, retrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember.email) &&
        Objects.equals(this.numbers, retrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember.numbers) &&
        Objects.equals(this.location, retrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember.location) &&
        Objects.equals(this.locationId, retrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember.locationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lastName, firstName, displayName, type, email, numbers, location, locationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    numbers: ").append(toIndentedString(numbers)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
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
    openapiFields.add("lastName");
    openapiFields.add("firstName");
    openapiFields.add("displayName");
    openapiFields.add("type");
    openapiFields.add("email");
    openapiFields.add("numbers");
    openapiFields.add("location");
    openapiFields.add("locationId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("lastName");
    openapiRequiredFields.add("firstName");
    openapiRequiredFields.add("displayName");
    openapiRequiredFields.add("numbers");
    openapiRequiredFields.add("location");
    openapiRequiredFields.add("locationId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember is not found in the empty JSON string", RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if (!jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if (!jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("numbers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `numbers` to be an array in the JSON string but got `%s`", jsonObj.get("numbers").toString()));
      }

      JsonArray jsonArraynumbers = jsonObj.getAsJsonArray("numbers");
      // validate the required field `numbers` (array)
      for (int i = 0; i < jsonArraynumbers.size(); i++) {
        RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMemberNumbersInner.validateJsonElement(jsonArraynumbers.get(i));
      };
      if (!jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if (!jsonObj.get("locationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember.class));

       return (TypeAdapter<T>) new TypeAdapter<RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember>() {
           @Override
           public void write(JsonWriter out, RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember
   * @throws IOException if the JSON string is invalid with respect to RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember
   */
  public static RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember.class);
  }

  /**
   * Convert an instance of RetrieveAPersonSMonitoringSettings200ResponseMonitoredElementsInnerMember to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

