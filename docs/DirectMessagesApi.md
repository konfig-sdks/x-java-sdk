# DirectMessagesApi

All URIs are relative to *https://api.twitter.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewDmConversation**](DirectMessagesApi.md#createNewDmConversation) | **POST** /2/dm_conversations | Create a new DM Conversation |
| [**getDmEvents**](DirectMessagesApi.md#getDmEvents) | **GET** /2/dm_conversations/with/{participant_id}/dm_events | Get DM Events for a DM Conversation |
| [**getDmEvents_0**](DirectMessagesApi.md#getDmEvents_0) | **GET** /2/dm_conversations/{id}/dm_events | Get DM Events for a DM Conversation |
| [**getRecentDmEvents**](DirectMessagesApi.md#getRecentDmEvents) | **GET** /2/dm_events | Get recent DM Events |
| [**sendNewMessageToDmConversation**](DirectMessagesApi.md#sendNewMessageToDmConversation) | **POST** /2/dm_conversations/{dm_conversation_id}/messages | Send a new message to a DM Conversation |
| [**sendNewMessageToUser**](DirectMessagesApi.md#sendNewMessageToUser) | **POST** /2/dm_conversations/with/{participant_id}/messages | Send a new message to a user |


<a name="createNewDmConversation"></a>
# **createNewDmConversation**
> CreateDmEventResponse createNewDmConversation().createDmConversationRequest(createDmConversationRequest).execute();

Create a new DM Conversation

Creates a new DM Conversation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DirectMessagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.twitter.com";
    
    // Configure OAuth2 access token for authorization: OAuth2UserToken
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    X client = new X(configuration);
    String conversationType = "Group"; // The conversation type that is being created.
    TACreateMessageRequest message = new TACreateMessageRequest();
    List<String> participantIds = Arrays.asList(); // Participants for the DM Conversation.
    try {
      CreateDmEventResponse result = client
              .directMessages
              .createNewDmConversation(conversationType, message, participantIds)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectMessagesApi#createNewDmConversation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateDmEventResponse> response = client
              .directMessages
              .createNewDmConversation(conversationType, message, participantIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectMessagesApi#createNewDmConversation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createDmConversationRequest** | [**CreateDmConversationRequest**](CreateDmConversationRequest.md)|  | [optional] |

### Return type

[**CreateDmEventResponse**](CreateDmEventResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="getDmEvents"></a>
# **getDmEvents**
> Get2DmConversationsWithParticipantIdDmEventsResponse getDmEvents(participantId).maxResults(maxResults).paginationToken(paginationToken).eventTypes(eventTypes).dmEventFields(dmEventFields).expansions(expansions).mediaFields(mediaFields).userFields(userFields).tweetFields(tweetFields).execute();

Get DM Events for a DM Conversation

Returns DM Events for a DM Conversation

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DirectMessagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.twitter.com";
    
    // Configure OAuth2 access token for authorization: OAuth2UserToken
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    X client = new X(configuration);
    String participantId = "participantId_example"; // The ID of the participant user for the One to One DM conversation.
    Integer maxResults = 100; // The maximum number of results.
    String paginationToken = "paginationToken_example"; // This parameter is used to get a specified 'page' of results.
    Set<String> eventTypes = Arrays.asList(); // The set of event_types to include in the results.
    Set<String> dmEventFields = Arrays.asList(); // A comma separated list of DmEvent fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> mediaFields = Arrays.asList(); // A comma separated list of Media fields to display.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    try {
      Get2DmConversationsWithParticipantIdDmEventsResponse result = client
              .directMessages
              .getDmEvents(participantId)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
              .eventTypes(eventTypes)
              .dmEventFields(dmEventFields)
              .expansions(expansions)
              .mediaFields(mediaFields)
              .userFields(userFields)
              .tweetFields(tweetFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getIncludes());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectMessagesApi#getDmEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2DmConversationsWithParticipantIdDmEventsResponse> response = client
              .directMessages
              .getDmEvents(participantId)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
              .eventTypes(eventTypes)
              .dmEventFields(dmEventFields)
              .expansions(expansions)
              .mediaFields(mediaFields)
              .userFields(userFields)
              .tweetFields(tweetFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectMessagesApi#getDmEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **participantId** | **String**| The ID of the participant user for the One to One DM conversation. | |
| **maxResults** | **Integer**| The maximum number of results. | [optional] [default to 100] |
| **paginationToken** | **String**| This parameter is used to get a specified &#39;page&#39; of results. | [optional] |
| **eventTypes** | [**Set&lt;String&gt;**](String.md)| The set of event_types to include in the results. | [optional] [enum: MessageCreate, ParticipantsJoin, ParticipantsLeave] |
| **dmEventFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of DmEvent fields to display. | [optional] [enum: attachments, created_at, dm_conversation_id, event_type, id, participant_ids, referenced_tweets, sender_id, text] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, participant_ids, referenced_tweets.id, sender_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2DmConversationsWithParticipantIdDmEventsResponse**](Get2DmConversationsWithParticipantIdDmEventsResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="getDmEvents_0"></a>
# **getDmEvents_0**
> Get2DmConversationsIdDmEventsResponse getDmEvents_0(id).maxResults(maxResults).paginationToken(paginationToken).eventTypes(eventTypes).dmEventFields(dmEventFields).expansions(expansions).mediaFields(mediaFields).userFields(userFields).tweetFields(tweetFields).execute();

Get DM Events for a DM Conversation

Returns DM Events for a DM Conversation

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DirectMessagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.twitter.com";
    
    // Configure OAuth2 access token for authorization: OAuth2UserToken
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    X client = new X(configuration);
    String id = "id_example"; // The DM Conversation ID.
    Integer maxResults = 100; // The maximum number of results.
    String paginationToken = "paginationToken_example"; // This parameter is used to get a specified 'page' of results.
    Set<String> eventTypes = Arrays.asList(); // The set of event_types to include in the results.
    Set<String> dmEventFields = Arrays.asList(); // A comma separated list of DmEvent fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> mediaFields = Arrays.asList(); // A comma separated list of Media fields to display.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    try {
      Get2DmConversationsIdDmEventsResponse result = client
              .directMessages
              .getDmEvents_0(id)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
              .eventTypes(eventTypes)
              .dmEventFields(dmEventFields)
              .expansions(expansions)
              .mediaFields(mediaFields)
              .userFields(userFields)
              .tweetFields(tweetFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getIncludes());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectMessagesApi#getDmEvents_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2DmConversationsIdDmEventsResponse> response = client
              .directMessages
              .getDmEvents_0(id)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
              .eventTypes(eventTypes)
              .dmEventFields(dmEventFields)
              .expansions(expansions)
              .mediaFields(mediaFields)
              .userFields(userFields)
              .tweetFields(tweetFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectMessagesApi#getDmEvents_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The DM Conversation ID. | |
| **maxResults** | **Integer**| The maximum number of results. | [optional] [default to 100] |
| **paginationToken** | **String**| This parameter is used to get a specified &#39;page&#39; of results. | [optional] |
| **eventTypes** | [**Set&lt;String&gt;**](String.md)| The set of event_types to include in the results. | [optional] [enum: MessageCreate, ParticipantsJoin, ParticipantsLeave] |
| **dmEventFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of DmEvent fields to display. | [optional] [enum: attachments, created_at, dm_conversation_id, event_type, id, participant_ids, referenced_tweets, sender_id, text] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, participant_ids, referenced_tweets.id, sender_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2DmConversationsIdDmEventsResponse**](Get2DmConversationsIdDmEventsResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="getRecentDmEvents"></a>
# **getRecentDmEvents**
> Get2DmEventsResponse getRecentDmEvents().maxResults(maxResults).paginationToken(paginationToken).eventTypes(eventTypes).dmEventFields(dmEventFields).expansions(expansions).mediaFields(mediaFields).userFields(userFields).tweetFields(tweetFields).execute();

Get recent DM Events

Returns recent DM Events across DM conversations

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DirectMessagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.twitter.com";
    
    // Configure OAuth2 access token for authorization: OAuth2UserToken
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    X client = new X(configuration);
    Integer maxResults = 100; // The maximum number of results.
    String paginationToken = "paginationToken_example"; // This parameter is used to get a specified 'page' of results.
    Set<String> eventTypes = Arrays.asList(); // The set of event_types to include in the results.
    Set<String> dmEventFields = Arrays.asList(); // A comma separated list of DmEvent fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> mediaFields = Arrays.asList(); // A comma separated list of Media fields to display.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    try {
      Get2DmEventsResponse result = client
              .directMessages
              .getRecentDmEvents()
              .maxResults(maxResults)
              .paginationToken(paginationToken)
              .eventTypes(eventTypes)
              .dmEventFields(dmEventFields)
              .expansions(expansions)
              .mediaFields(mediaFields)
              .userFields(userFields)
              .tweetFields(tweetFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getIncludes());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectMessagesApi#getRecentDmEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2DmEventsResponse> response = client
              .directMessages
              .getRecentDmEvents()
              .maxResults(maxResults)
              .paginationToken(paginationToken)
              .eventTypes(eventTypes)
              .dmEventFields(dmEventFields)
              .expansions(expansions)
              .mediaFields(mediaFields)
              .userFields(userFields)
              .tweetFields(tweetFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectMessagesApi#getRecentDmEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **maxResults** | **Integer**| The maximum number of results. | [optional] [default to 100] |
| **paginationToken** | **String**| This parameter is used to get a specified &#39;page&#39; of results. | [optional] |
| **eventTypes** | [**Set&lt;String&gt;**](String.md)| The set of event_types to include in the results. | [optional] [enum: MessageCreate, ParticipantsJoin, ParticipantsLeave] |
| **dmEventFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of DmEvent fields to display. | [optional] [enum: attachments, created_at, dm_conversation_id, event_type, id, participant_ids, referenced_tweets, sender_id, text] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, participant_ids, referenced_tweets.id, sender_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2DmEventsResponse**](Get2DmEventsResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="sendNewMessageToDmConversation"></a>
# **sendNewMessageToDmConversation**
> CreateDmEventResponse sendNewMessageToDmConversation(dmConversationId).body(body).execute();

Send a new message to a DM Conversation

Creates a new message for a DM Conversation specified by DM Conversation ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DirectMessagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.twitter.com";
    
    // Configure OAuth2 access token for authorization: OAuth2UserToken
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    X client = new X(configuration);
    String dmConversationId = "dmConversationId_example"; // The DM Conversation ID.
    List<CreateTextMessageRequestAttachmentsInner> attachments = Arrays.asList(); // Attachments to a DM Event.
    String text = "text_example"; // Text of the message.
    try {
      CreateDmEventResponse result = client
              .directMessages
              .sendNewMessageToDmConversation(dmConversationId)
              .attachments(attachments)
              .text(text)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectMessagesApi#sendNewMessageToDmConversation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateDmEventResponse> response = client
              .directMessages
              .sendNewMessageToDmConversation(dmConversationId)
              .attachments(attachments)
              .text(text)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectMessagesApi#sendNewMessageToDmConversation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dmConversationId** | **String**| The DM Conversation ID. | |
| **body** | **TACreateMessageRequest**|  | [optional] |

### Return type

[**CreateDmEventResponse**](CreateDmEventResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="sendNewMessageToUser"></a>
# **sendNewMessageToUser**
> CreateDmEventResponse sendNewMessageToUser(participantId).body(body).execute();

Send a new message to a user

Creates a new message for a DM Conversation with a participant user by ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DirectMessagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.twitter.com";
    
    // Configure OAuth2 access token for authorization: OAuth2UserToken
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    X client = new X(configuration);
    String participantId = "participantId_example"; // The ID of the recipient user that will receive the DM.
    List<CreateTextMessageRequestAttachmentsInner> attachments = Arrays.asList(); // Attachments to a DM Event.
    String text = "text_example"; // Text of the message.
    try {
      CreateDmEventResponse result = client
              .directMessages
              .sendNewMessageToUser(participantId)
              .attachments(attachments)
              .text(text)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectMessagesApi#sendNewMessageToUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateDmEventResponse> response = client
              .directMessages
              .sendNewMessageToUser(participantId)
              .attachments(attachments)
              .text(text)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectMessagesApi#sendNewMessageToUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **participantId** | **String**| The ID of the recipient user that will receive the DM. | |
| **body** | **TACreateMessageRequest**|  | [optional] |

### Return type

[**CreateDmEventResponse**](CreateDmEventResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

