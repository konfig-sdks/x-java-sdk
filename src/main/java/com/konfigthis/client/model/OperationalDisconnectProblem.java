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
import com.konfigthis.client.model.ClientDisconnectedProblem;
import com.konfigthis.client.model.ClientForbiddenProblem;
import com.konfigthis.client.model.ConflictProblem;
import com.konfigthis.client.model.ConnectionExceptionProblem;
import com.konfigthis.client.model.DisallowedResourceProblem;
import com.konfigthis.client.model.DuplicateRuleProblem;
import com.konfigthis.client.model.FieldUnauthorizedProblem;
import com.konfigthis.client.model.GenericProblem;
import com.konfigthis.client.model.InvalidRequestProblem;
import com.konfigthis.client.model.InvalidRuleProblem;
import com.konfigthis.client.model.NonCompliantRulesProblem;
import com.konfigthis.client.model.Oauth1PermissionsProblem;
import com.konfigthis.client.model.OperationalDisconnectProblem;
import com.konfigthis.client.model.Problem;
import com.konfigthis.client.model.ResourceNotFoundProblem;
import com.konfigthis.client.model.ResourceUnauthorizedProblem;
import com.konfigthis.client.model.ResourceUnavailableProblem;
import com.konfigthis.client.model.RulesCapProblem;
import com.konfigthis.client.model.UnsupportedAuthenticationProblem;
import com.konfigthis.client.model.UsageCapExceededProblem;
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
 * You have been disconnected for operational reasons.
 */
@ApiModel(description = "You have been disconnected for operational reasons.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OperationalDisconnectProblem extends Problem {
  /**
   * Gets or Sets disconnectType
   */
  @JsonAdapter(DisconnectTypeEnum.Adapter.class)
 public enum DisconnectTypeEnum {
    OPERATIONALDISCONNECT("OperationalDisconnect"),
    
    UPSTREAMOPERATIONALDISCONNECT("UpstreamOperationalDisconnect"),
    
    FORCEDISCONNECT("ForceDisconnect"),
    
    UPSTREAMUNCLEANDISCONNECT("UpstreamUncleanDisconnect"),
    
    SLOWREADER("SlowReader"),
    
    INTERNALERROR("InternalError"),
    
    CLIENTAPPLICATIONSTATEDEGRADED("ClientApplicationStateDegraded"),
    
    INVALIDRULES("InvalidRules");

    private String value;

    DisconnectTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DisconnectTypeEnum fromValue(String value) {
      for (DisconnectTypeEnum b : DisconnectTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DisconnectTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DisconnectTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DisconnectTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DisconnectTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DISCONNECT_TYPE = "disconnect_type";
  @SerializedName(SERIALIZED_NAME_DISCONNECT_TYPE)
  private DisconnectTypeEnum disconnectType;

  public OperationalDisconnectProblem() {
    this.type = this.getClass().getSimpleName();
  }

  public OperationalDisconnectProblem disconnectType(DisconnectTypeEnum disconnectType) {
    
    
    
    
    this.disconnectType = disconnectType;
    return this;
  }

   /**
   * Get disconnectType
   * @return disconnectType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DisconnectTypeEnum getDisconnectType() {
    return disconnectType;
  }


  public void setDisconnectType(DisconnectTypeEnum disconnectType) {
    
    
    
    this.disconnectType = disconnectType;
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
   * @return the OperationalDisconnectProblem instance itself
   */
  public OperationalDisconnectProblem putAdditionalProperty(String key, Object value) {
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
    OperationalDisconnectProblem operationalDisconnectProblem = (OperationalDisconnectProblem) o;
    return Objects.equals(this.disconnectType, operationalDisconnectProblem.disconnectType)&&
        Objects.equals(this.additionalProperties, operationalDisconnectProblem.additionalProperties) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disconnectType, super.hashCode(), additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalDisconnectProblem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("detail");
    openapiFields.add("status");
    openapiFields.add("type");
    openapiFields.add("disconnect_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OperationalDisconnectProblem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OperationalDisconnectProblem.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OperationalDisconnectProblem is not found in the empty JSON string", OperationalDisconnectProblem.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OperationalDisconnectProblem.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OperationalDisconnectProblem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OperationalDisconnectProblem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OperationalDisconnectProblem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OperationalDisconnectProblem.class));

       return (TypeAdapter<T>) new TypeAdapter<OperationalDisconnectProblem>() {
           @Override
           public void write(JsonWriter out, OperationalDisconnectProblem value) throws IOException {
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
           public OperationalDisconnectProblem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OperationalDisconnectProblem instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OperationalDisconnectProblem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OperationalDisconnectProblem
  * @throws IOException if the JSON string is invalid with respect to OperationalDisconnectProblem
  */
  public static OperationalDisconnectProblem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OperationalDisconnectProblem.class);
  }

 /**
  * Convert an instance of OperationalDisconnectProblem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

