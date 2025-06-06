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
import org.openapitools.client.model.CreateACallParkRequestRecall;

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
 * CreateACallParkRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-13T15:45:43.258095Z[Europe/Dublin]", comments = "Generator version: 7.9.0")
public class CreateACallParkRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RECALL = "recall";
  @SerializedName(SERIALIZED_NAME_RECALL)
  private CreateACallParkRequestRecall recall;

  public static final String SERIALIZED_NAME_AGENTS = "agents";
  @SerializedName(SERIALIZED_NAME_AGENTS)
  private List<Object> agents = new ArrayList<>();

  public static final String SERIALIZED_NAME_PARK_ON_AGENTS_ENABLED = "parkOnAgentsEnabled";
  @SerializedName(SERIALIZED_NAME_PARK_ON_AGENTS_ENABLED)
  private Boolean parkOnAgentsEnabled;

  public static final String SERIALIZED_NAME_CALL_PARK_EXTENSIONS = "callParkExtensions";
  @SerializedName(SERIALIZED_NAME_CALL_PARK_EXTENSIONS)
  private List<Object> callParkExtensions = new ArrayList<>();

  public CreateACallParkRequest() {
  }

  public CreateACallParkRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Unique name for the call park. The maximum length is 80.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CreateACallParkRequest recall(CreateACallParkRequestRecall recall) {
    this.recall = recall;
    return this;
  }

  /**
   * Get recall
   * @return recall
   */
  @javax.annotation.Nonnull
  public CreateACallParkRequestRecall getRecall() {
    return recall;
  }

  public void setRecall(CreateACallParkRequestRecall recall) {
    this.recall = recall;
  }


  public CreateACallParkRequest agents(List<Object> agents) {
    this.agents = agents;
    return this;
  }

  public CreateACallParkRequest addAgentsItem(Object agentsItem) {
    if (this.agents == null) {
      this.agents = new ArrayList<>();
    }
    this.agents.add(agentsItem);
    return this;
  }

  /**
   * Array of ID strings of people, workspaces and virtual lines that are added to the call park.
   * @return agents
   */
  @javax.annotation.Nullable
  public List<Object> getAgents() {
    return agents;
  }

  public void setAgents(List<Object> agents) {
    this.agents = agents;
  }


  public CreateACallParkRequest parkOnAgentsEnabled(Boolean parkOnAgentsEnabled) {
    this.parkOnAgentsEnabled = parkOnAgentsEnabled;
    return this;
  }

  /**
   * Whether or not the calls will be parked on agents as a destination.
   * @return parkOnAgentsEnabled
   */
  @javax.annotation.Nullable
  public Boolean getParkOnAgentsEnabled() {
    return parkOnAgentsEnabled;
  }

  public void setParkOnAgentsEnabled(Boolean parkOnAgentsEnabled) {
    this.parkOnAgentsEnabled = parkOnAgentsEnabled;
  }


  public CreateACallParkRequest callParkExtensions(List<Object> callParkExtensions) {
    this.callParkExtensions = callParkExtensions;
    return this;
  }

  public CreateACallParkRequest addCallParkExtensionsItem(Object callParkExtensionsItem) {
    if (this.callParkExtensions == null) {
      this.callParkExtensions = new ArrayList<>();
    }
    this.callParkExtensions.add(callParkExtensionsItem);
    return this;
  }

  /**
   * Array of ID strings of call park extensions assigned to a call park.
   * @return callParkExtensions
   */
  @javax.annotation.Nullable
  public List<Object> getCallParkExtensions() {
    return callParkExtensions;
  }

  public void setCallParkExtensions(List<Object> callParkExtensions) {
    this.callParkExtensions = callParkExtensions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateACallParkRequest createACallParkRequest = (CreateACallParkRequest) o;
    return Objects.equals(this.name, createACallParkRequest.name) &&
        Objects.equals(this.recall, createACallParkRequest.recall) &&
        Objects.equals(this.agents, createACallParkRequest.agents) &&
        Objects.equals(this.parkOnAgentsEnabled, createACallParkRequest.parkOnAgentsEnabled) &&
        Objects.equals(this.callParkExtensions, createACallParkRequest.callParkExtensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, recall, agents, parkOnAgentsEnabled, callParkExtensions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateACallParkRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    recall: ").append(toIndentedString(recall)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    parkOnAgentsEnabled: ").append(toIndentedString(parkOnAgentsEnabled)).append("\n");
    sb.append("    callParkExtensions: ").append(toIndentedString(callParkExtensions)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("recall");
    openapiFields.add("agents");
    openapiFields.add("parkOnAgentsEnabled");
    openapiFields.add("callParkExtensions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("recall");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateACallParkRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateACallParkRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateACallParkRequest is not found in the empty JSON string", CreateACallParkRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateACallParkRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateACallParkRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateACallParkRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `recall`
      CreateACallParkRequestRecall.validateJsonElement(jsonObj.get("recall"));
      // ensure the optional json data is an array if present
      if (jsonObj.get("agents") != null && !jsonObj.get("agents").isJsonNull() && !jsonObj.get("agents").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `agents` to be an array in the JSON string but got `%s`", jsonObj.get("agents").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("callParkExtensions") != null && !jsonObj.get("callParkExtensions").isJsonNull() && !jsonObj.get("callParkExtensions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `callParkExtensions` to be an array in the JSON string but got `%s`", jsonObj.get("callParkExtensions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateACallParkRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateACallParkRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateACallParkRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateACallParkRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateACallParkRequest>() {
           @Override
           public void write(JsonWriter out, CreateACallParkRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateACallParkRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateACallParkRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateACallParkRequest
   * @throws IOException if the JSON string is invalid with respect to CreateACallParkRequest
   */
  public static CreateACallParkRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateACallParkRequest.class);
  }

  /**
   * Convert an instance of CreateACallParkRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

