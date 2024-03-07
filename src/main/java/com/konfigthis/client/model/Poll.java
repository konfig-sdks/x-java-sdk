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
import com.konfigthis.client.model.PollOption;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * Represent a Poll attached to a Tweet.
 */
@ApiModel(description = "Represent a Poll attached to a Tweet.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Poll {
  public static final String SERIALIZED_NAME_DURATION_MINUTES = "duration_minutes";
  @SerializedName(SERIALIZED_NAME_DURATION_MINUTES)
  private Integer durationMinutes;

  public static final String SERIALIZED_NAME_END_DATETIME = "end_datetime";
  @SerializedName(SERIALIZED_NAME_END_DATETIME)
  private OffsetDateTime endDatetime;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<PollOption> options = new ArrayList<>();

  /**
   * Gets or Sets votingStatus
   */
  @JsonAdapter(VotingStatusEnum.Adapter.class)
 public enum VotingStatusEnum {
    OPEN("open"),
    
    CLOSED("closed");

    private String value;

    VotingStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VotingStatusEnum fromValue(String value) {
      for (VotingStatusEnum b : VotingStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VotingStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VotingStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VotingStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VotingStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VOTING_STATUS = "voting_status";
  @SerializedName(SERIALIZED_NAME_VOTING_STATUS)
  private VotingStatusEnum votingStatus;

  public Poll() {
  }

  public Poll durationMinutes(Integer durationMinutes) {
    if (durationMinutes != null && durationMinutes < 5) {
      throw new IllegalArgumentException("Invalid value for durationMinutes. Must be greater than or equal to 5.");
    }
    if (durationMinutes != null && durationMinutes > 10080) {
      throw new IllegalArgumentException("Invalid value for durationMinutes. Must be less than or equal to 10080.");
    }
    
    
    this.durationMinutes = durationMinutes;
    return this;
  }

   /**
   * Get durationMinutes
   * minimum: 5
   * maximum: 10080
   * @return durationMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDurationMinutes() {
    return durationMinutes;
  }


  public void setDurationMinutes(Integer durationMinutes) {
    if (durationMinutes != null && durationMinutes < 5) {
      throw new IllegalArgumentException("Invalid value for durationMinutes. Must be greater than or equal to 5.");
    }
    if (durationMinutes != null && durationMinutes > 10080) {
      throw new IllegalArgumentException("Invalid value for durationMinutes. Must be less than or equal to 10080.");
    }
    
    this.durationMinutes = durationMinutes;
  }


  public Poll endDatetime(OffsetDateTime endDatetime) {
    
    
    
    
    this.endDatetime = endDatetime;
    return this;
  }

   /**
   * Get endDatetime
   * @return endDatetime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEndDatetime() {
    return endDatetime;
  }


  public void setEndDatetime(OffsetDateTime endDatetime) {
    
    
    
    this.endDatetime = endDatetime;
  }


  public Poll id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of this poll.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1365059861688410112", required = true, value = "Unique identifier of this poll.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public Poll options(List<PollOption> options) {
    
    
    
    
    this.options = options;
    return this;
  }

  public Poll addOptionsItem(PollOption optionsItem) {
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<PollOption> getOptions() {
    return options;
  }


  public void setOptions(List<PollOption> options) {
    
    
    
    this.options = options;
  }


  public Poll votingStatus(VotingStatusEnum votingStatus) {
    
    
    
    
    this.votingStatus = votingStatus;
    return this;
  }

   /**
   * Get votingStatus
   * @return votingStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VotingStatusEnum getVotingStatus() {
    return votingStatus;
  }


  public void setVotingStatus(VotingStatusEnum votingStatus) {
    
    
    
    this.votingStatus = votingStatus;
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
   * @return the Poll instance itself
   */
  public Poll putAdditionalProperty(String key, Object value) {
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
    Poll poll = (Poll) o;
    return Objects.equals(this.durationMinutes, poll.durationMinutes) &&
        Objects.equals(this.endDatetime, poll.endDatetime) &&
        Objects.equals(this.id, poll.id) &&
        Objects.equals(this.options, poll.options) &&
        Objects.equals(this.votingStatus, poll.votingStatus)&&
        Objects.equals(this.additionalProperties, poll.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(durationMinutes, endDatetime, id, options, votingStatus, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Poll {\n");
    sb.append("    durationMinutes: ").append(toIndentedString(durationMinutes)).append("\n");
    sb.append("    endDatetime: ").append(toIndentedString(endDatetime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    votingStatus: ").append(toIndentedString(votingStatus)).append("\n");
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
    openapiFields.add("duration_minutes");
    openapiFields.add("end_datetime");
    openapiFields.add("id");
    openapiFields.add("options");
    openapiFields.add("voting_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("options");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Poll
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Poll.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Poll is not found in the empty JSON string", Poll.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Poll.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("options").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `options` to be an array in the JSON string but got `%s`", jsonObj.get("options").toString()));
      }

      JsonArray jsonArrayoptions = jsonObj.getAsJsonArray("options");
      // validate the required field `options` (array)
      for (int i = 0; i < jsonArrayoptions.size(); i++) {
        PollOption.validateJsonObject(jsonArrayoptions.get(i).getAsJsonObject());
      };
      if ((jsonObj.get("voting_status") != null && !jsonObj.get("voting_status").isJsonNull()) && !jsonObj.get("voting_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voting_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voting_status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Poll.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Poll' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Poll> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Poll.class));

       return (TypeAdapter<T>) new TypeAdapter<Poll>() {
           @Override
           public void write(JsonWriter out, Poll value) throws IOException {
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
           public Poll read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Poll instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Poll given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Poll
  * @throws IOException if the JSON string is invalid with respect to Poll
  */
  public static Poll fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Poll.class);
  }

 /**
  * Convert an instance of Poll to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

