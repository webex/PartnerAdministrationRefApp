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
import org.openapitools.client.model.GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInnerOwner;

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
 * GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner {
  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  /**
   * Phone number&#39;s state.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE"),
    
    ACTIVE2("ACTIVE");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StateEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_IS_MAIN_NUMBER = "isMainNumber";
  @SerializedName(SERIALIZED_NAME_IS_MAIN_NUMBER)
  private Boolean isMainNumber;

  public static final String SERIALIZED_NAME_TOLL_FREE_NUMBER = "tollFreeNumber";
  @SerializedName(SERIALIZED_NAME_TOLL_FREE_NUMBER)
  private Boolean tollFreeNumber;

  /**
   * The telephony type for the number.
   */
  @JsonAdapter(TelephonyTypeEnum.Adapter.class)
  public enum TelephonyTypeEnum {
    NUMBER("PSTN_NUMBER"),
    
    NUMBER2("PSTN_NUMBER");

    private String value;

    TelephonyTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TelephonyTypeEnum fromValue(String value) {
      for (TelephonyTypeEnum b : TelephonyTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TelephonyTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TelephonyTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TelephonyTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TelephonyTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TelephonyTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TELEPHONY_TYPE = "telephonyType";
  @SerializedName(SERIALIZED_NAME_TELEPHONY_TYPE)
  private TelephonyTypeEnum telephonyType;

  public static final String SERIALIZED_NAME_IS_SERVICE_NUMBER = "isServiceNumber";
  @SerializedName(SERIALIZED_NAME_IS_SERVICE_NUMBER)
  private Boolean isServiceNumber;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInnerOwner owner;

  public GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner() {
  }

  public GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * A unique identifier for the phone number.
   * @return phoneNumber
   */
  @javax.annotation.Nonnull
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Phone number&#39;s state.
   * @return state
   */
  @javax.annotation.Nonnull
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }


  public GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner isMainNumber(Boolean isMainNumber) {
    this.isMainNumber = isMainNumber;
    return this;
  }

  /**
   * If &#x60;true&#x60;, the phone number is used as a location CLID.
   * @return isMainNumber
   */
  @javax.annotation.Nonnull
  public Boolean getIsMainNumber() {
    return isMainNumber;
  }

  public void setIsMainNumber(Boolean isMainNumber) {
    this.isMainNumber = isMainNumber;
  }


  public GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner tollFreeNumber(Boolean tollFreeNumber) {
    this.tollFreeNumber = tollFreeNumber;
    return this;
  }

  /**
   * If &#x60;true&#x60;, the phone number is a toll-free number.
   * @return tollFreeNumber
   */
  @javax.annotation.Nonnull
  public Boolean getTollFreeNumber() {
    return tollFreeNumber;
  }

  public void setTollFreeNumber(Boolean tollFreeNumber) {
    this.tollFreeNumber = tollFreeNumber;
  }


  public GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner telephonyType(TelephonyTypeEnum telephonyType) {
    this.telephonyType = telephonyType;
    return this;
  }

  /**
   * The telephony type for the number.
   * @return telephonyType
   */
  @javax.annotation.Nonnull
  public TelephonyTypeEnum getTelephonyType() {
    return telephonyType;
  }

  public void setTelephonyType(TelephonyTypeEnum telephonyType) {
    this.telephonyType = telephonyType;
  }


  public GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner isServiceNumber(Boolean isServiceNumber) {
    this.isServiceNumber = isServiceNumber;
    return this;
  }

  /**
   * If &#x60;true&#x60;, the phone number is a service number; otherwise, it is a standard number. Service numbers are high-utilization or high-concurrency PSTN phone numbers that are neither mobile nor toll-free.
   * @return isServiceNumber
   */
  @javax.annotation.Nonnull
  public Boolean getIsServiceNumber() {
    return isServiceNumber;
  }

  public void setIsServiceNumber(Boolean isServiceNumber) {
    this.isServiceNumber = isServiceNumber;
  }


  public GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner owner(GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInnerOwner owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @javax.annotation.Nullable
  public GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInnerOwner getOwner() {
    return owner;
  }

  public void setOwner(GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInnerOwner owner) {
    this.owner = owner;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner getWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner = (GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner) o;
    return Objects.equals(this.phoneNumber, getWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner.phoneNumber) &&
        Objects.equals(this.state, getWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner.state) &&
        Objects.equals(this.isMainNumber, getWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner.isMainNumber) &&
        Objects.equals(this.tollFreeNumber, getWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner.tollFreeNumber) &&
        Objects.equals(this.telephonyType, getWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner.telephonyType) &&
        Objects.equals(this.isServiceNumber, getWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner.isServiceNumber) &&
        Objects.equals(this.owner, getWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, state, isMainNumber, tollFreeNumber, telephonyType, isServiceNumber, owner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner {\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    isMainNumber: ").append(toIndentedString(isMainNumber)).append("\n");
    sb.append("    tollFreeNumber: ").append(toIndentedString(tollFreeNumber)).append("\n");
    sb.append("    telephonyType: ").append(toIndentedString(telephonyType)).append("\n");
    sb.append("    isServiceNumber: ").append(toIndentedString(isServiceNumber)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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
    openapiFields.add("phoneNumber");
    openapiFields.add("state");
    openapiFields.add("isMainNumber");
    openapiFields.add("tollFreeNumber");
    openapiFields.add("telephonyType");
    openapiFields.add("isServiceNumber");
    openapiFields.add("owner");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("phoneNumber");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("isMainNumber");
    openapiRequiredFields.add("tollFreeNumber");
    openapiRequiredFields.add("telephonyType");
    openapiRequiredFields.add("isServiceNumber");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner is not found in the empty JSON string", GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("phoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumber").toString()));
      }
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the required field `state`
      StateEnum.validateJsonElement(jsonObj.get("state"));
      if (!jsonObj.get("telephonyType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `telephonyType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("telephonyType").toString()));
      }
      // validate the required field `telephonyType`
      TelephonyTypeEnum.validateJsonElement(jsonObj.get("telephonyType"));
      // validate the optional field `owner`
      if (jsonObj.get("owner") != null && !jsonObj.get("owner").isJsonNull()) {
        GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInnerOwner.validateJsonElement(jsonObj.get("owner"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner>() {
           @Override
           public void write(JsonWriter out, GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner
   * @throws IOException if the JSON string is invalid with respect to GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner
   */
  public static GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner.class);
  }

  /**
   * Convert an instance of GetWorkspaceECBNAvailablePhoneNumbers200ResponsePhoneNumbersInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

