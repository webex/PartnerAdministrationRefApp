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
import org.openapitools.client.model.PrecheckABroadworksSubscriberProvisioningRequestCustomerInfo;

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
 * PrecheckABroadworksSubscriberProvisioningRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class PrecheckABroadworksSubscriberProvisioningRequest {
  public static final String SERIALIZED_NAME_PROVISIONING_ID = "provisioningId";
  @SerializedName(SERIALIZED_NAME_PROVISIONING_ID)
  private String provisioningId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_SP_ENTERPRISE_ID = "spEnterpriseId";
  @SerializedName(SERIALIZED_NAME_SP_ENTERPRISE_ID)
  private String spEnterpriseId;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  /**
   * The Webex for BroadWorks package to be assigned to the subscriber.
   */
  @JsonAdapter(PackageEnum.Adapter.class)
  public enum PackageEnum {
    SOFTPHONE("softphone"),
    
    BASIC("basic"),
    
    STANDARD("standard"),
    
    PREMIUM("premium");

    private String value;

    PackageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PackageEnum fromValue(String value) {
      for (PackageEnum b : PackageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PackageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PackageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PackageEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PackageEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PackageEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PACKAGE = "package";
  @SerializedName(SERIALIZED_NAME_PACKAGE)
  private PackageEnum _package;

  public static final String SERIALIZED_NAME_PRIMARY_PHONE_NUMBER = "primaryPhoneNumber";
  @SerializedName(SERIALIZED_NAME_PRIMARY_PHONE_NUMBER)
  private String primaryPhoneNumber;

  public static final String SERIALIZED_NAME_MOBILE_PHONE_NUMBER = "mobilePhoneNumber";
  @SerializedName(SERIALIZED_NAME_MOBILE_PHONE_NUMBER)
  private String mobilePhoneNumber;

  public static final String SERIALIZED_NAME_EXTENSION = "extension";
  @SerializedName(SERIALIZED_NAME_EXTENSION)
  private String extension;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_CUSTOMER_INFO = "customerInfo";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_INFO)
  private PrecheckABroadworksSubscriberProvisioningRequestCustomerInfo customerInfo;

  public PrecheckABroadworksSubscriberProvisioningRequest() {
  }

  public PrecheckABroadworksSubscriberProvisioningRequest provisioningId(String provisioningId) {
    this.provisioningId = provisioningId;
    return this;
  }

  /**
   * Provisioning ID that defines how this subscriber is to be provisioned for Cisco Webex Services. Each Customer Template has its unique Provisioning ID. This ID will be displayed under the chosen Customer Template on Cisco Webex Control Hub.
   * @return provisioningId
   */
  @javax.annotation.Nullable
  public String getProvisioningId() {
    return provisioningId;
  }

  public void setProvisioningId(String provisioningId) {
    this.provisioningId = provisioningId;
  }


  public PrecheckABroadworksSubscriberProvisioningRequest userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The user ID of the Broadworks subscriber.
   * @return userId
   */
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public PrecheckABroadworksSubscriberProvisioningRequest spEnterpriseId(String spEnterpriseId) {
    this.spEnterpriseId = spEnterpriseId;
    return this;
  }

  /**
   * The Service Provider supplied unique identifier for the subscriber&#39;s enterprise.
   * @return spEnterpriseId
   */
  @javax.annotation.Nullable
  public String getSpEnterpriseId() {
    return spEnterpriseId;
  }

  public void setSpEnterpriseId(String spEnterpriseId) {
    this.spEnterpriseId = spEnterpriseId;
  }


  public PrecheckABroadworksSubscriberProvisioningRequest firstName(String firstName) {
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


  public PrecheckABroadworksSubscriberProvisioningRequest lastName(String lastName) {
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


  public PrecheckABroadworksSubscriberProvisioningRequest _package(PackageEnum _package) {
    this._package = _package;
    return this;
  }

  /**
   * The Webex for BroadWorks package to be assigned to the subscriber.
   * @return _package
   */
  @javax.annotation.Nullable
  public PackageEnum getPackage() {
    return _package;
  }

  public void setPackage(PackageEnum _package) {
    this._package = _package;
  }


  public PrecheckABroadworksSubscriberProvisioningRequest primaryPhoneNumber(String primaryPhoneNumber) {
    this.primaryPhoneNumber = primaryPhoneNumber;
    return this;
  }

  /**
   * The primary phone number configured for the subscriber on BroadWorks.
   * @return primaryPhoneNumber
   */
  @javax.annotation.Nullable
  public String getPrimaryPhoneNumber() {
    return primaryPhoneNumber;
  }

  public void setPrimaryPhoneNumber(String primaryPhoneNumber) {
    this.primaryPhoneNumber = primaryPhoneNumber;
  }


  public PrecheckABroadworksSubscriberProvisioningRequest mobilePhoneNumber(String mobilePhoneNumber) {
    this.mobilePhoneNumber = mobilePhoneNumber;
    return this;
  }

  /**
   * The mobile phone number configured against the subscriber on BroadWorks.
   * @return mobilePhoneNumber
   */
  @javax.annotation.Nullable
  public String getMobilePhoneNumber() {
    return mobilePhoneNumber;
  }

  public void setMobilePhoneNumber(String mobilePhoneNumber) {
    this.mobilePhoneNumber = mobilePhoneNumber;
  }


  public PrecheckABroadworksSubscriberProvisioningRequest extension(String extension) {
    this.extension = extension;
    return this;
  }

  /**
   * The extension number configured against the subscriber on BroadWorks.
   * @return extension
   */
  @javax.annotation.Nullable
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }


  public PrecheckABroadworksSubscriberProvisioningRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address of the subscriber.
   * @return email
   */
  @javax.annotation.Nonnull
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public PrecheckABroadworksSubscriberProvisioningRequest language(String language) {
    this.language = language;
    return this;
  }

  /**
   * The ISO 639-1 language code associated with the subscriber. Reserved for future use. Any value currently specified will be ignored during subscriber provisioning.
   * @return language
   */
  @javax.annotation.Nullable
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  public PrecheckABroadworksSubscriberProvisioningRequest timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * The time zone associated with the subscriber. Refer to the [Webex Meetings Site Timezone](/docs/api/guides/webex-for-broadworks-developers-guide#webex-meetings-site-timezone) section of the [Webex for BroadWorks](/docs/api/guides/webex-for-broadworks-developers-guide) guide for more information.
   * @return timezone
   */
  @javax.annotation.Nullable
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public PrecheckABroadworksSubscriberProvisioningRequest customerInfo(PrecheckABroadworksSubscriberProvisioningRequestCustomerInfo customerInfo) {
    this.customerInfo = customerInfo;
    return this;
  }

  /**
   * Get customerInfo
   * @return customerInfo
   */
  @javax.annotation.Nullable
  public PrecheckABroadworksSubscriberProvisioningRequestCustomerInfo getCustomerInfo() {
    return customerInfo;
  }

  public void setCustomerInfo(PrecheckABroadworksSubscriberProvisioningRequestCustomerInfo customerInfo) {
    this.customerInfo = customerInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrecheckABroadworksSubscriberProvisioningRequest precheckABroadworksSubscriberProvisioningRequest = (PrecheckABroadworksSubscriberProvisioningRequest) o;
    return Objects.equals(this.provisioningId, precheckABroadworksSubscriberProvisioningRequest.provisioningId) &&
        Objects.equals(this.userId, precheckABroadworksSubscriberProvisioningRequest.userId) &&
        Objects.equals(this.spEnterpriseId, precheckABroadworksSubscriberProvisioningRequest.spEnterpriseId) &&
        Objects.equals(this.firstName, precheckABroadworksSubscriberProvisioningRequest.firstName) &&
        Objects.equals(this.lastName, precheckABroadworksSubscriberProvisioningRequest.lastName) &&
        Objects.equals(this._package, precheckABroadworksSubscriberProvisioningRequest._package) &&
        Objects.equals(this.primaryPhoneNumber, precheckABroadworksSubscriberProvisioningRequest.primaryPhoneNumber) &&
        Objects.equals(this.mobilePhoneNumber, precheckABroadworksSubscriberProvisioningRequest.mobilePhoneNumber) &&
        Objects.equals(this.extension, precheckABroadworksSubscriberProvisioningRequest.extension) &&
        Objects.equals(this.email, precheckABroadworksSubscriberProvisioningRequest.email) &&
        Objects.equals(this.language, precheckABroadworksSubscriberProvisioningRequest.language) &&
        Objects.equals(this.timezone, precheckABroadworksSubscriberProvisioningRequest.timezone) &&
        Objects.equals(this.customerInfo, precheckABroadworksSubscriberProvisioningRequest.customerInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provisioningId, userId, spEnterpriseId, firstName, lastName, _package, primaryPhoneNumber, mobilePhoneNumber, extension, email, language, timezone, customerInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrecheckABroadworksSubscriberProvisioningRequest {\n");
    sb.append("    provisioningId: ").append(toIndentedString(provisioningId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    spEnterpriseId: ").append(toIndentedString(spEnterpriseId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    primaryPhoneNumber: ").append(toIndentedString(primaryPhoneNumber)).append("\n");
    sb.append("    mobilePhoneNumber: ").append(toIndentedString(mobilePhoneNumber)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    customerInfo: ").append(toIndentedString(customerInfo)).append("\n");
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
    openapiFields.add("provisioningId");
    openapiFields.add("userId");
    openapiFields.add("spEnterpriseId");
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("package");
    openapiFields.add("primaryPhoneNumber");
    openapiFields.add("mobilePhoneNumber");
    openapiFields.add("extension");
    openapiFields.add("email");
    openapiFields.add("language");
    openapiFields.add("timezone");
    openapiFields.add("customerInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("email");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PrecheckABroadworksSubscriberProvisioningRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PrecheckABroadworksSubscriberProvisioningRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PrecheckABroadworksSubscriberProvisioningRequest is not found in the empty JSON string", PrecheckABroadworksSubscriberProvisioningRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PrecheckABroadworksSubscriberProvisioningRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PrecheckABroadworksSubscriberProvisioningRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PrecheckABroadworksSubscriberProvisioningRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("provisioningId") != null && !jsonObj.get("provisioningId").isJsonNull()) && !jsonObj.get("provisioningId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `provisioningId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("provisioningId").toString()));
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if ((jsonObj.get("spEnterpriseId") != null && !jsonObj.get("spEnterpriseId").isJsonNull()) && !jsonObj.get("spEnterpriseId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spEnterpriseId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spEnterpriseId").toString()));
      }
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("package") != null && !jsonObj.get("package").isJsonNull()) && !jsonObj.get("package").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `package` to be a primitive type in the JSON string but got `%s`", jsonObj.get("package").toString()));
      }
      // validate the optional field `package`
      if (jsonObj.get("package") != null && !jsonObj.get("package").isJsonNull()) {
        PackageEnum.validateJsonElement(jsonObj.get("package"));
      }
      if ((jsonObj.get("primaryPhoneNumber") != null && !jsonObj.get("primaryPhoneNumber").isJsonNull()) && !jsonObj.get("primaryPhoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primaryPhoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primaryPhoneNumber").toString()));
      }
      if ((jsonObj.get("mobilePhoneNumber") != null && !jsonObj.get("mobilePhoneNumber").isJsonNull()) && !jsonObj.get("mobilePhoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobilePhoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobilePhoneNumber").toString()));
      }
      if ((jsonObj.get("extension") != null && !jsonObj.get("extension").isJsonNull()) && !jsonObj.get("extension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extension").toString()));
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if ((jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonNull()) && !jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
      // validate the optional field `customerInfo`
      if (jsonObj.get("customerInfo") != null && !jsonObj.get("customerInfo").isJsonNull()) {
        PrecheckABroadworksSubscriberProvisioningRequestCustomerInfo.validateJsonElement(jsonObj.get("customerInfo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PrecheckABroadworksSubscriberProvisioningRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PrecheckABroadworksSubscriberProvisioningRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PrecheckABroadworksSubscriberProvisioningRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PrecheckABroadworksSubscriberProvisioningRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PrecheckABroadworksSubscriberProvisioningRequest>() {
           @Override
           public void write(JsonWriter out, PrecheckABroadworksSubscriberProvisioningRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PrecheckABroadworksSubscriberProvisioningRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PrecheckABroadworksSubscriberProvisioningRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PrecheckABroadworksSubscriberProvisioningRequest
   * @throws IOException if the JSON string is invalid with respect to PrecheckABroadworksSubscriberProvisioningRequest
   */
  public static PrecheckABroadworksSubscriberProvisioningRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PrecheckABroadworksSubscriberProvisioningRequest.class);
  }

  /**
   * Convert an instance of PrecheckABroadworksSubscriberProvisioningRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

