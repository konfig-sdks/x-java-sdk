/*
 * Twitter API v2
 * Twitter API v2 available endpoints
 *
 * The version of the OpenAPI document: 2.62
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.Expansions;
import com.konfigthis.client.model.Get2ComplianceJobsResponseMeta;
import com.konfigthis.client.model.Problem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * Get2UsersIdPinnedListsResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Get2UsersIdPinnedListsResponse {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<List> data = null;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<Problem> errors = null;

  public static final String SERIALIZED_NAME_INCLUDES = "includes";
  @SerializedName(SERIALIZED_NAME_INCLUDES)
  private Expansions includes;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private Get2ComplianceJobsResponseMeta meta;

  public Get2UsersIdPinnedListsResponse() {
  }

  public Get2UsersIdPinnedListsResponse data(List<List> data) {
    
    
    
    
    this.data = data;
    return this;
  }

  public Get2UsersIdPinnedListsResponse addDataItem(List dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<List> getData() {
    return data;
  }


  public void setData(List<List> data) {
    
    
    
    this.data = data;
  }


  public Get2UsersIdPinnedListsResponse errors(List<Problem> errors) {
    
    
    
    
    this.errors = errors;
    return this;
  }

  public Get2UsersIdPinnedListsResponse addErrorsItem(Problem errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Problem> getErrors() {
    return errors;
  }


  public void setErrors(List<Problem> errors) {
    
    
    
    this.errors = errors;
  }


  public Get2UsersIdPinnedListsResponse includes(Expansions includes) {
    
    
    
    
    this.includes = includes;
    return this;
  }

   /**
   * Get includes
   * @return includes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Expansions getIncludes() {
    return includes;
  }


  public void setIncludes(Expansions includes) {
    
    
    
    this.includes = includes;
  }


  public Get2UsersIdPinnedListsResponse meta(Get2ComplianceJobsResponseMeta meta) {
    
    
    
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Get2ComplianceJobsResponseMeta getMeta() {
    return meta;
  }


  public void setMeta(Get2ComplianceJobsResponseMeta meta) {
    
    
    
    this.meta = meta;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the Get2UsersIdPinnedListsResponse instance itself
   */
  public Get2UsersIdPinnedListsResponse putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Get2UsersIdPinnedListsResponse get2UsersIdPinnedListsResponse = (Get2UsersIdPinnedListsResponse) o;
    return Objects.equals(this.data, get2UsersIdPinnedListsResponse.data) &&
        Objects.equals(this.errors, get2UsersIdPinnedListsResponse.errors) &&
        Objects.equals(this.includes, get2UsersIdPinnedListsResponse.includes) &&
        Objects.equals(this.meta, get2UsersIdPinnedListsResponse.meta)&&
        Objects.equals(this.additionalProperties, get2UsersIdPinnedListsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errors, includes, meta, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Get2UsersIdPinnedListsResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    includes: ").append(toIndentedString(includes)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("errors");
    openapiFields.add("includes");
    openapiFields.add("meta");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Get2UsersIdPinnedListsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Get2UsersIdPinnedListsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Get2UsersIdPinnedListsResponse is not found in the empty JSON string", Get2UsersIdPinnedListsResponse.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
        if (jsonArraydata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
          }

          // validate the optional field `data` (array)
          for (int i = 0; i < jsonArraydata.size(); i++) {
            List.validateJsonObject(jsonArraydata.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonNull()) {
        JsonArray jsonArrayerrors = jsonObj.getAsJsonArray("errors");
        if (jsonArrayerrors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("errors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
          }

          // validate the optional field `errors` (array)
          for (int i = 0; i < jsonArrayerrors.size(); i++) {
            Problem.validateJsonObject(jsonArrayerrors.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `includes`
      if (jsonObj.get("includes") != null && !jsonObj.get("includes").isJsonNull()) {
        Expansions.validateJsonObject(jsonObj.getAsJsonObject("includes"));
      }
      // validate the optional field `meta`
      if (jsonObj.get("meta") != null && !jsonObj.get("meta").isJsonNull()) {
        Get2ComplianceJobsResponseMeta.validateJsonObject(jsonObj.getAsJsonObject("meta"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Get2UsersIdPinnedListsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Get2UsersIdPinnedListsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Get2UsersIdPinnedListsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Get2UsersIdPinnedListsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Get2UsersIdPinnedListsResponse>() {
           @Override
           public void write(JsonWriter out, Get2UsersIdPinnedListsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public Get2UsersIdPinnedListsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Get2UsersIdPinnedListsResponse instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Get2UsersIdPinnedListsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Get2UsersIdPinnedListsResponse
  * @throws IOException if the JSON string is invalid with respect to Get2UsersIdPinnedListsResponse
  */
  public static Get2UsersIdPinnedListsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Get2UsersIdPinnedListsResponse.class);
  }

 /**
  * Convert an instance of Get2UsersIdPinnedListsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
