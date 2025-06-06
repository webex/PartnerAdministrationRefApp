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
 * RetrieveAPersonSApplicationServicesSettings200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class RetrieveAPersonSApplicationServicesSettings200Response {
  public static final String SERIALIZED_NAME_RING_DEVICES_FOR_CLICK_TO_DIAL_CALLS_ENABLED = "ringDevicesForClickToDialCallsEnabled";
  @SerializedName(SERIALIZED_NAME_RING_DEVICES_FOR_CLICK_TO_DIAL_CALLS_ENABLED)
  private Boolean ringDevicesForClickToDialCallsEnabled;

  public static final String SERIALIZED_NAME_RING_DEVICES_FOR_GROUP_PAGE_ENABLED = "ringDevicesForGroupPageEnabled";
  @SerializedName(SERIALIZED_NAME_RING_DEVICES_FOR_GROUP_PAGE_ENABLED)
  private Boolean ringDevicesForGroupPageEnabled;

  public static final String SERIALIZED_NAME_RING_DEVICES_FOR_CALL_PARK_ENABLED = "ringDevicesForCallParkEnabled";
  @SerializedName(SERIALIZED_NAME_RING_DEVICES_FOR_CALL_PARK_ENABLED)
  private Boolean ringDevicesForCallParkEnabled;

  public static final String SERIALIZED_NAME_BROWSER_CLIENT_ENABLED = "browserClientEnabled";
  @SerializedName(SERIALIZED_NAME_BROWSER_CLIENT_ENABLED)
  private Boolean browserClientEnabled;

  public static final String SERIALIZED_NAME_BROWSER_CLIENT_ID = "browserClientId";
  @SerializedName(SERIALIZED_NAME_BROWSER_CLIENT_ID)
  private String browserClientId;

  public static final String SERIALIZED_NAME_DESKTOP_CLIENT_ENABLED = "desktopClientEnabled";
  @SerializedName(SERIALIZED_NAME_DESKTOP_CLIENT_ENABLED)
  private Boolean desktopClientEnabled;

  public static final String SERIALIZED_NAME_DESKTOP_CLIENT_ID = "desktopClientId";
  @SerializedName(SERIALIZED_NAME_DESKTOP_CLIENT_ID)
  private String desktopClientId;

  public static final String SERIALIZED_NAME_TABLET_CLIENT_ENABLED = "tabletClientEnabled";
  @SerializedName(SERIALIZED_NAME_TABLET_CLIENT_ENABLED)
  private Boolean tabletClientEnabled;

  public static final String SERIALIZED_NAME_MOBILE_CLIENT_ENABLED = "mobileClientEnabled";
  @SerializedName(SERIALIZED_NAME_MOBILE_CLIENT_ENABLED)
  private Boolean mobileClientEnabled;

  public static final String SERIALIZED_NAME_AVAILABLE_LINE_COUNT = "availableLineCount";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_LINE_COUNT)
  private BigDecimal availableLineCount;

  public RetrieveAPersonSApplicationServicesSettings200Response() {
  }

  public RetrieveAPersonSApplicationServicesSettings200Response ringDevicesForClickToDialCallsEnabled(Boolean ringDevicesForClickToDialCallsEnabled) {
    this.ringDevicesForClickToDialCallsEnabled = ringDevicesForClickToDialCallsEnabled;
    return this;
  }

  /**
   * When &#x60;true&#x60;, indicates to ring devices for outbound Click to Dial calls.
   * @return ringDevicesForClickToDialCallsEnabled
   */
  @javax.annotation.Nonnull
  public Boolean getRingDevicesForClickToDialCallsEnabled() {
    return ringDevicesForClickToDialCallsEnabled;
  }

  public void setRingDevicesForClickToDialCallsEnabled(Boolean ringDevicesForClickToDialCallsEnabled) {
    this.ringDevicesForClickToDialCallsEnabled = ringDevicesForClickToDialCallsEnabled;
  }


  public RetrieveAPersonSApplicationServicesSettings200Response ringDevicesForGroupPageEnabled(Boolean ringDevicesForGroupPageEnabled) {
    this.ringDevicesForGroupPageEnabled = ringDevicesForGroupPageEnabled;
    return this;
  }

  /**
   * When &#x60;true&#x60;, indicates to ring devices for inbound Group Pages.
   * @return ringDevicesForGroupPageEnabled
   */
  @javax.annotation.Nonnull
  public Boolean getRingDevicesForGroupPageEnabled() {
    return ringDevicesForGroupPageEnabled;
  }

  public void setRingDevicesForGroupPageEnabled(Boolean ringDevicesForGroupPageEnabled) {
    this.ringDevicesForGroupPageEnabled = ringDevicesForGroupPageEnabled;
  }


  public RetrieveAPersonSApplicationServicesSettings200Response ringDevicesForCallParkEnabled(Boolean ringDevicesForCallParkEnabled) {
    this.ringDevicesForCallParkEnabled = ringDevicesForCallParkEnabled;
    return this;
  }

  /**
   * When &#x60;true&#x60;, indicates to ring devices for Call Park recalled.
   * @return ringDevicesForCallParkEnabled
   */
  @javax.annotation.Nonnull
  public Boolean getRingDevicesForCallParkEnabled() {
    return ringDevicesForCallParkEnabled;
  }

  public void setRingDevicesForCallParkEnabled(Boolean ringDevicesForCallParkEnabled) {
    this.ringDevicesForCallParkEnabled = ringDevicesForCallParkEnabled;
  }


  public RetrieveAPersonSApplicationServicesSettings200Response browserClientEnabled(Boolean browserClientEnabled) {
    this.browserClientEnabled = browserClientEnabled;
    return this;
  }

  /**
   * Indicates that the browser Webex Calling application is enabled for use.
   * @return browserClientEnabled
   */
  @javax.annotation.Nonnull
  public Boolean getBrowserClientEnabled() {
    return browserClientEnabled;
  }

  public void setBrowserClientEnabled(Boolean browserClientEnabled) {
    this.browserClientEnabled = browserClientEnabled;
  }


  public RetrieveAPersonSApplicationServicesSettings200Response browserClientId(String browserClientId) {
    this.browserClientId = browserClientId;
    return this;
  }

  /**
   * Device ID of WebRTC client. Returns only if &#x60;browserClientEnabled&#x60; is true.
   * @return browserClientId
   */
  @javax.annotation.Nullable
  public String getBrowserClientId() {
    return browserClientId;
  }

  public void setBrowserClientId(String browserClientId) {
    this.browserClientId = browserClientId;
  }


  public RetrieveAPersonSApplicationServicesSettings200Response desktopClientEnabled(Boolean desktopClientEnabled) {
    this.desktopClientEnabled = desktopClientEnabled;
    return this;
  }

  /**
   * Indicates that the desktop Webex Calling application is enabled for use.
   * @return desktopClientEnabled
   */
  @javax.annotation.Nonnull
  public Boolean getDesktopClientEnabled() {
    return desktopClientEnabled;
  }

  public void setDesktopClientEnabled(Boolean desktopClientEnabled) {
    this.desktopClientEnabled = desktopClientEnabled;
  }


  public RetrieveAPersonSApplicationServicesSettings200Response desktopClientId(String desktopClientId) {
    this.desktopClientId = desktopClientId;
    return this;
  }

  /**
   * Device ID of Desktop client. Returns only if &#x60;desktopClientEnabled&#x60; is true.
   * @return desktopClientId
   */
  @javax.annotation.Nullable
  public String getDesktopClientId() {
    return desktopClientId;
  }

  public void setDesktopClientId(String desktopClientId) {
    this.desktopClientId = desktopClientId;
  }


  public RetrieveAPersonSApplicationServicesSettings200Response tabletClientEnabled(Boolean tabletClientEnabled) {
    this.tabletClientEnabled = tabletClientEnabled;
    return this;
  }

  /**
   * Indicates that the tablet Webex Calling application is enabled for use.
   * @return tabletClientEnabled
   */
  @javax.annotation.Nonnull
  public Boolean getTabletClientEnabled() {
    return tabletClientEnabled;
  }

  public void setTabletClientEnabled(Boolean tabletClientEnabled) {
    this.tabletClientEnabled = tabletClientEnabled;
  }


  public RetrieveAPersonSApplicationServicesSettings200Response mobileClientEnabled(Boolean mobileClientEnabled) {
    this.mobileClientEnabled = mobileClientEnabled;
    return this;
  }

  /**
   * Indicates that the mobile Webex Calling application is enabled for use.
   * @return mobileClientEnabled
   */
  @javax.annotation.Nonnull
  public Boolean getMobileClientEnabled() {
    return mobileClientEnabled;
  }

  public void setMobileClientEnabled(Boolean mobileClientEnabled) {
    this.mobileClientEnabled = mobileClientEnabled;
  }


  public RetrieveAPersonSApplicationServicesSettings200Response availableLineCount(BigDecimal availableLineCount) {
    this.availableLineCount = availableLineCount;
    return this;
  }

  /**
   * Number of available device licenses for assigning devices/apps.
   * @return availableLineCount
   */
  @javax.annotation.Nonnull
  public BigDecimal getAvailableLineCount() {
    return availableLineCount;
  }

  public void setAvailableLineCount(BigDecimal availableLineCount) {
    this.availableLineCount = availableLineCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveAPersonSApplicationServicesSettings200Response retrieveAPersonSApplicationServicesSettings200Response = (RetrieveAPersonSApplicationServicesSettings200Response) o;
    return Objects.equals(this.ringDevicesForClickToDialCallsEnabled, retrieveAPersonSApplicationServicesSettings200Response.ringDevicesForClickToDialCallsEnabled) &&
        Objects.equals(this.ringDevicesForGroupPageEnabled, retrieveAPersonSApplicationServicesSettings200Response.ringDevicesForGroupPageEnabled) &&
        Objects.equals(this.ringDevicesForCallParkEnabled, retrieveAPersonSApplicationServicesSettings200Response.ringDevicesForCallParkEnabled) &&
        Objects.equals(this.browserClientEnabled, retrieveAPersonSApplicationServicesSettings200Response.browserClientEnabled) &&
        Objects.equals(this.browserClientId, retrieveAPersonSApplicationServicesSettings200Response.browserClientId) &&
        Objects.equals(this.desktopClientEnabled, retrieveAPersonSApplicationServicesSettings200Response.desktopClientEnabled) &&
        Objects.equals(this.desktopClientId, retrieveAPersonSApplicationServicesSettings200Response.desktopClientId) &&
        Objects.equals(this.tabletClientEnabled, retrieveAPersonSApplicationServicesSettings200Response.tabletClientEnabled) &&
        Objects.equals(this.mobileClientEnabled, retrieveAPersonSApplicationServicesSettings200Response.mobileClientEnabled) &&
        Objects.equals(this.availableLineCount, retrieveAPersonSApplicationServicesSettings200Response.availableLineCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ringDevicesForClickToDialCallsEnabled, ringDevicesForGroupPageEnabled, ringDevicesForCallParkEnabled, browserClientEnabled, browserClientId, desktopClientEnabled, desktopClientId, tabletClientEnabled, mobileClientEnabled, availableLineCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveAPersonSApplicationServicesSettings200Response {\n");
    sb.append("    ringDevicesForClickToDialCallsEnabled: ").append(toIndentedString(ringDevicesForClickToDialCallsEnabled)).append("\n");
    sb.append("    ringDevicesForGroupPageEnabled: ").append(toIndentedString(ringDevicesForGroupPageEnabled)).append("\n");
    sb.append("    ringDevicesForCallParkEnabled: ").append(toIndentedString(ringDevicesForCallParkEnabled)).append("\n");
    sb.append("    browserClientEnabled: ").append(toIndentedString(browserClientEnabled)).append("\n");
    sb.append("    browserClientId: ").append(toIndentedString(browserClientId)).append("\n");
    sb.append("    desktopClientEnabled: ").append(toIndentedString(desktopClientEnabled)).append("\n");
    sb.append("    desktopClientId: ").append(toIndentedString(desktopClientId)).append("\n");
    sb.append("    tabletClientEnabled: ").append(toIndentedString(tabletClientEnabled)).append("\n");
    sb.append("    mobileClientEnabled: ").append(toIndentedString(mobileClientEnabled)).append("\n");
    sb.append("    availableLineCount: ").append(toIndentedString(availableLineCount)).append("\n");
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
    openapiFields.add("ringDevicesForClickToDialCallsEnabled");
    openapiFields.add("ringDevicesForGroupPageEnabled");
    openapiFields.add("ringDevicesForCallParkEnabled");
    openapiFields.add("browserClientEnabled");
    openapiFields.add("browserClientId");
    openapiFields.add("desktopClientEnabled");
    openapiFields.add("desktopClientId");
    openapiFields.add("tabletClientEnabled");
    openapiFields.add("mobileClientEnabled");
    openapiFields.add("availableLineCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ringDevicesForClickToDialCallsEnabled");
    openapiRequiredFields.add("ringDevicesForGroupPageEnabled");
    openapiRequiredFields.add("ringDevicesForCallParkEnabled");
    openapiRequiredFields.add("browserClientEnabled");
    openapiRequiredFields.add("desktopClientEnabled");
    openapiRequiredFields.add("tabletClientEnabled");
    openapiRequiredFields.add("mobileClientEnabled");
    openapiRequiredFields.add("availableLineCount");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RetrieveAPersonSApplicationServicesSettings200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RetrieveAPersonSApplicationServicesSettings200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetrieveAPersonSApplicationServicesSettings200Response is not found in the empty JSON string", RetrieveAPersonSApplicationServicesSettings200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RetrieveAPersonSApplicationServicesSettings200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RetrieveAPersonSApplicationServicesSettings200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RetrieveAPersonSApplicationServicesSettings200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("browserClientId") != null && !jsonObj.get("browserClientId").isJsonNull()) && !jsonObj.get("browserClientId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `browserClientId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("browserClientId").toString()));
      }
      if ((jsonObj.get("desktopClientId") != null && !jsonObj.get("desktopClientId").isJsonNull()) && !jsonObj.get("desktopClientId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `desktopClientId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("desktopClientId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RetrieveAPersonSApplicationServicesSettings200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetrieveAPersonSApplicationServicesSettings200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetrieveAPersonSApplicationServicesSettings200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetrieveAPersonSApplicationServicesSettings200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<RetrieveAPersonSApplicationServicesSettings200Response>() {
           @Override
           public void write(JsonWriter out, RetrieveAPersonSApplicationServicesSettings200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RetrieveAPersonSApplicationServicesSettings200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RetrieveAPersonSApplicationServicesSettings200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RetrieveAPersonSApplicationServicesSettings200Response
   * @throws IOException if the JSON string is invalid with respect to RetrieveAPersonSApplicationServicesSettings200Response
   */
  public static RetrieveAPersonSApplicationServicesSettings200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetrieveAPersonSApplicationServicesSettings200Response.class);
  }

  /**
   * Convert an instance of RetrieveAPersonSApplicationServicesSettings200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

