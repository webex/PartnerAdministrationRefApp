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
import org.openapitools.client.model.ProvisionAWholesaleCustomerRequestProvisioningParametersCalling;
import org.openapitools.client.model.ProvisionAWholesaleCustomerRequestProvisioningParametersMeetings;

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
 * ProvisionAWholesaleCustomerRequestProvisioningParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class ProvisionAWholesaleCustomerRequestProvisioningParameters {
  public static final String SERIALIZED_NAME_CALLING = "calling";
  @SerializedName(SERIALIZED_NAME_CALLING)
  private ProvisionAWholesaleCustomerRequestProvisioningParametersCalling calling;

  public static final String SERIALIZED_NAME_MEETINGS = "meetings";
  @SerializedName(SERIALIZED_NAME_MEETINGS)
  private ProvisionAWholesaleCustomerRequestProvisioningParametersMeetings meetings;

  public ProvisionAWholesaleCustomerRequestProvisioningParameters() {
  }

  public ProvisionAWholesaleCustomerRequestProvisioningParameters calling(ProvisionAWholesaleCustomerRequestProvisioningParametersCalling calling) {
    this.calling = calling;
    return this;
  }

  /**
   * Get calling
   * @return calling
   */
  @javax.annotation.Nullable
  public ProvisionAWholesaleCustomerRequestProvisioningParametersCalling getCalling() {
    return calling;
  }

  public void setCalling(ProvisionAWholesaleCustomerRequestProvisioningParametersCalling calling) {
    this.calling = calling;
  }


  public ProvisionAWholesaleCustomerRequestProvisioningParameters meetings(ProvisionAWholesaleCustomerRequestProvisioningParametersMeetings meetings) {
    this.meetings = meetings;
    return this;
  }

  /**
   * Get meetings
   * @return meetings
   */
  @javax.annotation.Nullable
  public ProvisionAWholesaleCustomerRequestProvisioningParametersMeetings getMeetings() {
    return meetings;
  }

  public void setMeetings(ProvisionAWholesaleCustomerRequestProvisioningParametersMeetings meetings) {
    this.meetings = meetings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvisionAWholesaleCustomerRequestProvisioningParameters provisionAWholesaleCustomerRequestProvisioningParameters = (ProvisionAWholesaleCustomerRequestProvisioningParameters) o;
    return Objects.equals(this.calling, provisionAWholesaleCustomerRequestProvisioningParameters.calling) &&
        Objects.equals(this.meetings, provisionAWholesaleCustomerRequestProvisioningParameters.meetings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calling, meetings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvisionAWholesaleCustomerRequestProvisioningParameters {\n");
    sb.append("    calling: ").append(toIndentedString(calling)).append("\n");
    sb.append("    meetings: ").append(toIndentedString(meetings)).append("\n");
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
    openapiFields.add("calling");
    openapiFields.add("meetings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProvisionAWholesaleCustomerRequestProvisioningParameters
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProvisionAWholesaleCustomerRequestProvisioningParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProvisionAWholesaleCustomerRequestProvisioningParameters is not found in the empty JSON string", ProvisionAWholesaleCustomerRequestProvisioningParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProvisionAWholesaleCustomerRequestProvisioningParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProvisionAWholesaleCustomerRequestProvisioningParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `calling`
      if (jsonObj.get("calling") != null && !jsonObj.get("calling").isJsonNull()) {
        ProvisionAWholesaleCustomerRequestProvisioningParametersCalling.validateJsonElement(jsonObj.get("calling"));
      }
      // validate the optional field `meetings`
      if (jsonObj.get("meetings") != null && !jsonObj.get("meetings").isJsonNull()) {
        ProvisionAWholesaleCustomerRequestProvisioningParametersMeetings.validateJsonElement(jsonObj.get("meetings"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProvisionAWholesaleCustomerRequestProvisioningParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProvisionAWholesaleCustomerRequestProvisioningParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProvisionAWholesaleCustomerRequestProvisioningParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProvisionAWholesaleCustomerRequestProvisioningParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<ProvisionAWholesaleCustomerRequestProvisioningParameters>() {
           @Override
           public void write(JsonWriter out, ProvisionAWholesaleCustomerRequestProvisioningParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProvisionAWholesaleCustomerRequestProvisioningParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProvisionAWholesaleCustomerRequestProvisioningParameters given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProvisionAWholesaleCustomerRequestProvisioningParameters
   * @throws IOException if the JSON string is invalid with respect to ProvisionAWholesaleCustomerRequestProvisioningParameters
   */
  public static ProvisionAWholesaleCustomerRequestProvisioningParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProvisionAWholesaleCustomerRequestProvisioningParameters.class);
  }

  /**
   * Convert an instance of ProvisionAWholesaleCustomerRequestProvisioningParameters to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

