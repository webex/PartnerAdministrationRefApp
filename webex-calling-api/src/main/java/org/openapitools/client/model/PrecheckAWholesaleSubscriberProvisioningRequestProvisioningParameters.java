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
 * PrecheckAWholesaleSubscriberProvisioningRequestProvisioningParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class PrecheckAWholesaleSubscriberProvisioningRequestProvisioningParameters {
  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_PRIMARY_PHONE_NUMBER = "primaryPhoneNumber";
  @SerializedName(SERIALIZED_NAME_PRIMARY_PHONE_NUMBER)
  private String primaryPhoneNumber;

  public static final String SERIALIZED_NAME_EXTENSION = "extension";
  @SerializedName(SERIALIZED_NAME_EXTENSION)
  private String extension;

  public static final String SERIALIZED_NAME_LOCATION_ID = "locationId";
  @SerializedName(SERIALIZED_NAME_LOCATION_ID)
  private String locationId;

  public PrecheckAWholesaleSubscriberProvisioningRequestProvisioningParameters() {
  }

  public PrecheckAWholesaleSubscriberProvisioningRequestProvisioningParameters firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The first name of the subscriber.
   * @return firstName
   */
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public PrecheckAWholesaleSubscriberProvisioningRequestProvisioningParameters lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The last name of the subscriber.
   * @return lastName
   */
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public PrecheckAWholesaleSubscriberProvisioningRequestProvisioningParameters primaryPhoneNumber(String primaryPhoneNumber) {
    this.primaryPhoneNumber = primaryPhoneNumber;
    return this;
  }

  /**
   * The primary phone number configured for the subscriber.
   * @return primaryPhoneNumber
   */
  @javax.annotation.Nullable
  public String getPrimaryPhoneNumber() {
    return primaryPhoneNumber;
  }

  public void setPrimaryPhoneNumber(String primaryPhoneNumber) {
    this.primaryPhoneNumber = primaryPhoneNumber;
  }


  public PrecheckAWholesaleSubscriberProvisioningRequestProvisioningParameters extension(String extension) {
    this.extension = extension;
    return this;
  }

  /**
   * The extension configured for the subscriber. An extension, primary phone number or both must be supplied when creating a subscriber.
   * @return extension
   */
  @javax.annotation.Nullable
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }


  public PrecheckAWholesaleSubscriberProvisioningRequestProvisioningParameters locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * A unique identifier for the location. This ID should be retrieved via the Locations API - List Locations.
   * @return locationId
   */
  @javax.annotation.Nullable
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
    PrecheckAWholesaleSubscriberProvisioningRequestProvisioningParameters precheckAWholesaleSubscriberProvisioningRequestProvisioningParameters = (PrecheckAWholesaleSubscriberProvisioningRequestProvisioningParameters) o;
    return Objects.equals(this.firstName, precheckAWholesaleSubscriberProvisioningRequestProvisioningParameters.firstName) &&
        Objects.equals(this.lastName, precheckAWholesaleSubscriberProvisioningRequestProvisioningParameters.lastName) &&
        Objects.equals(this.primaryPhoneNumber, precheckAWholesaleSubscriberProvisioningRequestProvisioningParameters.primaryPhoneNumber) &&
        Objects.equals(this.extension, precheckAWholesaleSubscriberProvisioningRequestProvisioningParameters.extension) &&
        Objects.equals(this.locationId, precheckAWholesaleSubscriberProvisioningRequestProvisioningParameters.locationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, primaryPhoneNumber, extension, locationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrecheckAWholesaleSubscriberProvisioningRequestProvisioningParameters {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    primaryPhoneNumber: ").append(toIndentedString(primaryPhoneNumber)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
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
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("primaryPhoneNumber");
    openapiFields.add("extension");
    openapiFields.add("locationId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PrecheckAWholesaleSubscriberProvisioningRequestProvisioningParameters
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PrecheckAWholesaleSubscriberProvisioningRequestProvisioningParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PrecheckAWholesaleSubscriberProvisioningRequestProvisioningParameters is not found in the empty JSON string", PrecheckAWholesaleSubscriberProvisioningRequestProvisioningParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PrecheckAWholesaleSubscriberProvisioningRequestProvisioningParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PrecheckAWholesaleSubscriberProvisioningRequestProvisioningParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("primaryPhoneNumber") != null && !jsonObj.get("primaryPhoneNumber").isJsonNull()) && !jsonObj.get("primaryPhoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primaryPhoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primaryPhoneNumber").toString()));
      }
      if ((jsonObj.get("extension") != null && !jsonObj.get("extension").isJsonNull()) && !jsonObj.get("extension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extension").toString()));
      }
      if ((jsonObj.get("locationId") != null && !jsonObj.get("locationId").isJsonNull()) && !jsonObj.get("locationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PrecheckAWholesaleSubscriberProvisioningRequestProvisioningParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PrecheckAWholesaleSubscriberProvisioningRequestProvisioningParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PrecheckAWholesaleSubscriberProvisioningRequestProvisioningParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PrecheckAWholesaleSubscriberProvisioningRequestProvisioningParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<PrecheckAWholesaleSubscriberProvisioningRequestProvisioningParameters>() {
           @Override
           public void write(JsonWriter out, PrecheckAWholesaleSubscriberProvisioningRequestProvisioningParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PrecheckAWholesaleSubscriberProvisioningRequestProvisioningParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PrecheckAWholesaleSubscriberProvisioningRequestProvisioningParameters given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PrecheckAWholesaleSubscriberProvisioningRequestProvisioningParameters
   * @throws IOException if the JSON string is invalid with respect to PrecheckAWholesaleSubscriberProvisioningRequestProvisioningParameters
   */
  public static PrecheckAWholesaleSubscriberProvisioningRequestProvisioningParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PrecheckAWholesaleSubscriberProvisioningRequestProvisioningParameters.class);
  }

  /**
   * Convert an instance of PrecheckAWholesaleSubscriberProvisioningRequestProvisioningParameters to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

