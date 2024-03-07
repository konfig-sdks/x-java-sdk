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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * Get2TweetsSearchAllResponseMeta
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Get2TweetsSearchAllResponseMeta {
  public static final String SERIALIZED_NAME_NEWEST_ID = "newest_id";
  @SerializedName(SERIALIZED_NAME_NEWEST_ID)
  private String newestId;

  public static final String SERIALIZED_NAME_NEXT_TOKEN = "next_token";
  @SerializedName(SERIALIZED_NAME_NEXT_TOKEN)
  private String nextToken;

  public static final String SERIALIZED_NAME_OLDEST_ID = "oldest_id";
  @SerializedName(SERIALIZED_NAME_OLDEST_ID)
  private String oldestId;

  public static final String SERIALIZED_NAME_RESULT_COUNT = "result_count";
  @SerializedName(SERIALIZED_NAME_RESULT_COUNT)
  private Integer resultCount;

  public Get2TweetsSearchAllResponseMeta() {
  }

  public Get2TweetsSearchAllResponseMeta newestId(String newestId) {
    
    
    
    
    this.newestId = newestId;
    return this;
  }

   /**
   * The newest id in this response.
   * @return newestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The newest id in this response.")

  public String getNewestId() {
    return newestId;
  }


  public void setNewestId(String newestId) {
    
    
    
    this.newestId = newestId;
  }


  public Get2TweetsSearchAllResponseMeta nextToken(String nextToken) {
    
    
    if (nextToken != null && nextToken.length() < 1) {
      throw new IllegalArgumentException("Invalid value for nextToken. Length must be greater than or equal to 1.");
    }
    
    this.nextToken = nextToken;
    return this;
  }

   /**
   * The next token.
   * @return nextToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The next token.")

  public String getNextToken() {
    return nextToken;
  }


  public void setNextToken(String nextToken) {
    
    
    if (nextToken != null && nextToken.length() < 1) {
      throw new IllegalArgumentException("Invalid value for nextToken. Length must be greater than or equal to 1.");
    }
    this.nextToken = nextToken;
  }


  public Get2TweetsSearchAllResponseMeta oldestId(String oldestId) {
    
    
    
    
    this.oldestId = oldestId;
    return this;
  }

   /**
   * The oldest id in this response.
   * @return oldestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The oldest id in this response.")

  public String getOldestId() {
    return oldestId;
  }


  public void setOldestId(String oldestId) {
    
    
    
    this.oldestId = oldestId;
  }


  public Get2TweetsSearchAllResponseMeta resultCount(Integer resultCount) {
    
    
    
    
    this.resultCount = resultCount;
    return this;
  }

   /**
   * The number of results returned in this response.
   * @return resultCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of results returned in this response.")

  public Integer getResultCount() {
    return resultCount;
  }


  public void setResultCount(Integer resultCount) {
    
    
    
    this.resultCount = resultCount;
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
   * @return the Get2TweetsSearchAllResponseMeta instance itself
   */
  public Get2TweetsSearchAllResponseMeta putAdditionalProperty(String key, Object value) {
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
    Get2TweetsSearchAllResponseMeta get2TweetsSearchAllResponseMeta = (Get2TweetsSearchAllResponseMeta) o;
    return Objects.equals(this.newestId, get2TweetsSearchAllResponseMeta.newestId) &&
        Objects.equals(this.nextToken, get2TweetsSearchAllResponseMeta.nextToken) &&
        Objects.equals(this.oldestId, get2TweetsSearchAllResponseMeta.oldestId) &&
        Objects.equals(this.resultCount, get2TweetsSearchAllResponseMeta.resultCount)&&
        Objects.equals(this.additionalProperties, get2TweetsSearchAllResponseMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newestId, nextToken, oldestId, resultCount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Get2TweetsSearchAllResponseMeta {\n");
    sb.append("    newestId: ").append(toIndentedString(newestId)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    oldestId: ").append(toIndentedString(oldestId)).append("\n");
    sb.append("    resultCount: ").append(toIndentedString(resultCount)).append("\n");
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
    openapiFields.add("newest_id");
    openapiFields.add("next_token");
    openapiFields.add("oldest_id");
    openapiFields.add("result_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Get2TweetsSearchAllResponseMeta
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Get2TweetsSearchAllResponseMeta.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Get2TweetsSearchAllResponseMeta is not found in the empty JSON string", Get2TweetsSearchAllResponseMeta.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("newest_id") != null && !jsonObj.get("newest_id").isJsonNull()) && !jsonObj.get("newest_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `newest_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("newest_id").toString()));
      }
      if ((jsonObj.get("next_token") != null && !jsonObj.get("next_token").isJsonNull()) && !jsonObj.get("next_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next_token").toString()));
      }
      if ((jsonObj.get("oldest_id") != null && !jsonObj.get("oldest_id").isJsonNull()) && !jsonObj.get("oldest_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oldest_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oldest_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Get2TweetsSearchAllResponseMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Get2TweetsSearchAllResponseMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Get2TweetsSearchAllResponseMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Get2TweetsSearchAllResponseMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<Get2TweetsSearchAllResponseMeta>() {
           @Override
           public void write(JsonWriter out, Get2TweetsSearchAllResponseMeta value) throws IOException {
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
           public Get2TweetsSearchAllResponseMeta read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Get2TweetsSearchAllResponseMeta instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Get2TweetsSearchAllResponseMeta given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Get2TweetsSearchAllResponseMeta
  * @throws IOException if the JSON string is invalid with respect to Get2TweetsSearchAllResponseMeta
  */
  public static Get2TweetsSearchAllResponseMeta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Get2TweetsSearchAllResponseMeta.class);
  }

 /**
  * Convert an instance of Get2TweetsSearchAllResponseMeta to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

