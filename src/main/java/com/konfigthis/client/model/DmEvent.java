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
import com.konfigthis.client.model.DmEventAttachments;
import com.konfigthis.client.model.DmEventReferencedTweetsInner;
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
 * DmEvent
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DmEvent {
  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private DmEventAttachments attachments;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DM_CONVERSATION_ID = "dm_conversation_id";
  @SerializedName(SERIALIZED_NAME_DM_CONVERSATION_ID)
  private String dmConversationId;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "event_type";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PARTICIPANT_IDS = "participant_ids";
  @SerializedName(SERIALIZED_NAME_PARTICIPANT_IDS)
  private List<String> participantIds = null;

  public static final String SERIALIZED_NAME_REFERENCED_TWEETS = "referenced_tweets";
  @SerializedName(SERIALIZED_NAME_REFERENCED_TWEETS)
  private List<DmEventReferencedTweetsInner> referencedTweets = null;

  public static final String SERIALIZED_NAME_SENDER_ID = "sender_id";
  @SerializedName(SERIALIZED_NAME_SENDER_ID)
  private String senderId;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public DmEvent() {
  }

  public DmEvent attachments(DmEventAttachments attachments) {
    
    
    
    
    this.attachments = attachments;
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DmEventAttachments getAttachments() {
    return attachments;
  }


  public void setAttachments(DmEventAttachments attachments) {
    
    
    
    this.attachments = attachments;
  }


  public DmEvent createdAt(OffsetDateTime createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public DmEvent dmConversationId(String dmConversationId) {
    
    
    
    
    this.dmConversationId = dmConversationId;
    return this;
  }

   /**
   * Unique identifier of a DM conversation. This can either be a numeric string, or a pair of numeric strings separated by a &#39;-&#39; character in the case of one-on-one DM Conversations.
   * @return dmConversationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123123123-456456456", value = "Unique identifier of a DM conversation. This can either be a numeric string, or a pair of numeric strings separated by a '-' character in the case of one-on-one DM Conversations.")

  public String getDmConversationId() {
    return dmConversationId;
  }


  public void setDmConversationId(String dmConversationId) {
    
    
    
    this.dmConversationId = dmConversationId;
  }


  public DmEvent eventType(String eventType) {
    
    
    
    
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "MessageCreate", required = true, value = "")

  public String getEventType() {
    return eventType;
  }


  public void setEventType(String eventType) {
    
    
    
    this.eventType = eventType;
  }


  public DmEvent id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of a DM Event.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1146654567674912769", required = true, value = "Unique identifier of a DM Event.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public DmEvent participantIds(List<String> participantIds) {
    
    
    
    
    this.participantIds = participantIds;
    return this;
  }

  public DmEvent addParticipantIdsItem(String participantIdsItem) {
    if (this.participantIds == null) {
      this.participantIds = new ArrayList<>();
    }
    this.participantIds.add(participantIdsItem);
    return this;
  }

   /**
   * A list of participants for a ParticipantsJoin or ParticipantsLeave event_type.
   * @return participantIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of participants for a ParticipantsJoin or ParticipantsLeave event_type.")

  public List<String> getParticipantIds() {
    return participantIds;
  }


  public void setParticipantIds(List<String> participantIds) {
    
    
    
    this.participantIds = participantIds;
  }


  public DmEvent referencedTweets(List<DmEventReferencedTweetsInner> referencedTweets) {
    
    
    
    
    this.referencedTweets = referencedTweets;
    return this;
  }

  public DmEvent addReferencedTweetsItem(DmEventReferencedTweetsInner referencedTweetsItem) {
    if (this.referencedTweets == null) {
      this.referencedTweets = new ArrayList<>();
    }
    this.referencedTweets.add(referencedTweetsItem);
    return this;
  }

   /**
   * A list of Tweets this DM refers to.
   * @return referencedTweets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of Tweets this DM refers to.")

  public List<DmEventReferencedTweetsInner> getReferencedTweets() {
    return referencedTweets;
  }


  public void setReferencedTweets(List<DmEventReferencedTweetsInner> referencedTweets) {
    
    
    
    this.referencedTweets = referencedTweets;
  }


  public DmEvent senderId(String senderId) {
    
    
    
    
    this.senderId = senderId;
    return this;
  }

   /**
   * Unique identifier of this User. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.
   * @return senderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2244994945", value = "Unique identifier of this User. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.")

  public String getSenderId() {
    return senderId;
  }


  public void setSenderId(String senderId) {
    
    
    
    this.senderId = senderId;
  }


  public DmEvent text(String text) {
    
    
    
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    
    
    
    this.text = text;
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
   * @return the DmEvent instance itself
   */
  public DmEvent putAdditionalProperty(String key, Object value) {
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
    DmEvent dmEvent = (DmEvent) o;
    return Objects.equals(this.attachments, dmEvent.attachments) &&
        Objects.equals(this.createdAt, dmEvent.createdAt) &&
        Objects.equals(this.dmConversationId, dmEvent.dmConversationId) &&
        Objects.equals(this.eventType, dmEvent.eventType) &&
        Objects.equals(this.id, dmEvent.id) &&
        Objects.equals(this.participantIds, dmEvent.participantIds) &&
        Objects.equals(this.referencedTweets, dmEvent.referencedTweets) &&
        Objects.equals(this.senderId, dmEvent.senderId) &&
        Objects.equals(this.text, dmEvent.text)&&
        Objects.equals(this.additionalProperties, dmEvent.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachments, createdAt, dmConversationId, eventType, id, participantIds, referencedTweets, senderId, text, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DmEvent {\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    dmConversationId: ").append(toIndentedString(dmConversationId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    participantIds: ").append(toIndentedString(participantIds)).append("\n");
    sb.append("    referencedTweets: ").append(toIndentedString(referencedTweets)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
    openapiFields.add("attachments");
    openapiFields.add("created_at");
    openapiFields.add("dm_conversation_id");
    openapiFields.add("event_type");
    openapiFields.add("id");
    openapiFields.add("participant_ids");
    openapiFields.add("referenced_tweets");
    openapiFields.add("sender_id");
    openapiFields.add("text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("event_type");
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DmEvent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DmEvent.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DmEvent is not found in the empty JSON string", DmEvent.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DmEvent.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `attachments`
      if (jsonObj.get("attachments") != null && !jsonObj.get("attachments").isJsonNull()) {
        DmEventAttachments.validateJsonObject(jsonObj.getAsJsonObject("attachments"));
      }
      if ((jsonObj.get("dm_conversation_id") != null && !jsonObj.get("dm_conversation_id").isJsonNull()) && !jsonObj.get("dm_conversation_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dm_conversation_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dm_conversation_id").toString()));
      }
      if (!jsonObj.get("event_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event_type").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("participant_ids") != null && !jsonObj.get("participant_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `participant_ids` to be an array in the JSON string but got `%s`", jsonObj.get("participant_ids").toString()));
      }
      if (jsonObj.get("referenced_tweets") != null && !jsonObj.get("referenced_tweets").isJsonNull()) {
        JsonArray jsonArrayreferencedTweets = jsonObj.getAsJsonArray("referenced_tweets");
        if (jsonArrayreferencedTweets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("referenced_tweets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `referenced_tweets` to be an array in the JSON string but got `%s`", jsonObj.get("referenced_tweets").toString()));
          }

          // validate the optional field `referenced_tweets` (array)
          for (int i = 0; i < jsonArrayreferencedTweets.size(); i++) {
            DmEventReferencedTweetsInner.validateJsonObject(jsonArrayreferencedTweets.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("sender_id") != null && !jsonObj.get("sender_id").isJsonNull()) && !jsonObj.get("sender_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sender_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sender_id").toString()));
      }
      if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DmEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DmEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DmEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DmEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<DmEvent>() {
           @Override
           public void write(JsonWriter out, DmEvent value) throws IOException {
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
           public DmEvent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DmEvent instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DmEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DmEvent
  * @throws IOException if the JSON string is invalid with respect to DmEvent
  */
  public static DmEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DmEvent.class);
  }

 /**
  * Convert an instance of DmEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
