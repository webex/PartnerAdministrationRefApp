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
import org.openapitools.client.model.CallForwardingPutBusinessContinuity;
import org.openapitools.client.model.CallForwardingPutCallForwarding;

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
 * CallForwardingPut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class CallForwardingPut {
  public static final String SERIALIZED_NAME_CALL_FORWARDING = "callForwarding";
  @SerializedName(SERIALIZED_NAME_CALL_FORWARDING)
  private CallForwardingPutCallForwarding callForwarding;

  public static final String SERIALIZED_NAME_BUSINESS_CONTINUITY = "businessContinuity";
  @SerializedName(SERIALIZED_NAME_BUSINESS_CONTINUITY)
  private CallForwardingPutBusinessContinuity businessContinuity;

  public CallForwardingPut() {
  }

  public CallForwardingPut callForwarding(CallForwardingPutCallForwarding callForwarding) {
    this.callForwarding = callForwarding;
    return this;
  }

  /**
   * Get callForwarding
   * @return callForwarding
   */
  @javax.annotation.Nullable
  public CallForwardingPutCallForwarding getCallForwarding() {
    return callForwarding;
  }

  public void setCallForwarding(CallForwardingPutCallForwarding callForwarding) {
    this.callForwarding = callForwarding;
  }


  public CallForwardingPut businessContinuity(CallForwardingPutBusinessContinuity businessContinuity) {
    this.businessContinuity = businessContinuity;
    return this;
  }

  /**
   * Get businessContinuity
   * @return businessContinuity
   */
  @javax.annotation.Nullable
  public CallForwardingPutBusinessContinuity getBusinessContinuity() {
    return businessContinuity;
  }

  public void setBusinessContinuity(CallForwardingPutBusinessContinuity businessContinuity) {
    this.businessContinuity = businessContinuity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallForwardingPut callForwardingPut = (CallForwardingPut) o;
    return Objects.equals(this.callForwarding, callForwardingPut.callForwarding) &&
        Objects.equals(this.businessContinuity, callForwardingPut.businessContinuity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callForwarding, businessContinuity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallForwardingPut {\n");
    sb.append("    callForwarding: ").append(toIndentedString(callForwarding)).append("\n");
    sb.append("    businessContinuity: ").append(toIndentedString(businessContinuity)).append("\n");
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
    openapiFields.add("callForwarding");
    openapiFields.add("businessContinuity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CallForwardingPut
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CallForwardingPut.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CallForwardingPut is not found in the empty JSON string", CallForwardingPut.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CallForwardingPut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CallForwardingPut` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `callForwarding`
      if (jsonObj.get("callForwarding") != null && !jsonObj.get("callForwarding").isJsonNull()) {
        CallForwardingPutCallForwarding.validateJsonElement(jsonObj.get("callForwarding"));
      }
      // validate the optional field `businessContinuity`
      if (jsonObj.get("businessContinuity") != null && !jsonObj.get("businessContinuity").isJsonNull()) {
        CallForwardingPutBusinessContinuity.validateJsonElement(jsonObj.get("businessContinuity"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CallForwardingPut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CallForwardingPut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CallForwardingPut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CallForwardingPut.class));

       return (TypeAdapter<T>) new TypeAdapter<CallForwardingPut>() {
           @Override
           public void write(JsonWriter out, CallForwardingPut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CallForwardingPut read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CallForwardingPut given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CallForwardingPut
   * @throws IOException if the JSON string is invalid with respect to CallForwardingPut
   */
  public static CallForwardingPut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CallForwardingPut.class);
  }

  /**
   * Convert an instance of CallForwardingPut to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

