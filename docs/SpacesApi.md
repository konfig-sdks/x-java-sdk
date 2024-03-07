# SpacesApi

All URIs are relative to *https://api.twitter.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**findMatchingSpaces**](SpacesApi.md#findMatchingSpaces) | **GET** /2/spaces/search | Search for Spaces |
| [**getBuyersList**](SpacesApi.md#getBuyersList) | **GET** /2/spaces/{id}/buyers | Retrieve the list of Users who purchased a ticket to the given space |
| [**getTweets**](SpacesApi.md#getTweets) | **GET** /2/spaces/{id}/tweets | Retrieve Tweets from a Space. |
| [**lookupByCreatorIds**](SpacesApi.md#lookupByCreatorIds) | **GET** /2/spaces/by/creator_ids | Space lookup by their creators |
| [**lookupSpaceById**](SpacesApi.md#lookupSpaceById) | **GET** /2/spaces/{id} | Space lookup by Space ID |
| [**lookupSpaceIds**](SpacesApi.md#lookupSpaceIds) | **GET** /2/spaces | Space lookup up Space IDs |


<a name="findMatchingSpaces"></a>
# **findMatchingSpaces**
> Get2SpacesSearchResponse findMatchingSpaces(query).state(state).maxResults(maxResults).spaceFields(spaceFields).expansions(expansions).userFields(userFields).topicFields(topicFields).execute();

Search for Spaces

Returns Spaces that match the provided query.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SpacesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.twitter.com";
    
    // Configure HTTP bearer authorization: BearerToken
    configuration.token = "BEARER TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2UserToken
    configuration.accessToken = "YOUR ACCESS TOKEN";
    X client = new X(configuration);
    String query = "crypto"; // The search query.
    String state = "live"; // The state of Spaces to search for.
    Integer maxResults = 100; // The number of results to return.
    Set<String> spaceFields = Arrays.asList(); // A comma separated list of Space fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> topicFields = Arrays.asList(); // A comma separated list of Topic fields to display.
    try {
      Get2SpacesSearchResponse result = client
              .spaces
              .findMatchingSpaces(query)
              .state(state)
              .maxResults(maxResults)
              .spaceFields(spaceFields)
              .expansions(expansions)
              .userFields(userFields)
              .topicFields(topicFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getIncludes());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#findMatchingSpaces");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2SpacesSearchResponse> response = client
              .spaces
              .findMatchingSpaces(query)
              .state(state)
              .maxResults(maxResults)
              .spaceFields(spaceFields)
              .expansions(expansions)
              .userFields(userFields)
              .topicFields(topicFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#findMatchingSpaces");
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
| **query** | **String**| The search query. | |
| **state** | **String**| The state of Spaces to search for. | [optional] [default to all] [enum: live, scheduled, all] |
| **maxResults** | **Integer**| The number of results to return. | [optional] [default to 100] |
| **spaceFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Space fields to display. | [optional] [enum: created_at, creator_id, ended_at, host_ids, id, invited_user_ids, is_ticketed, lang, participant_count, scheduled_start, speaker_ids, started_at, state, subscriber_count, title, topic_ids, updated_at] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: creator_id, host_ids, invited_user_ids, speaker_ids, topic_ids] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **topicFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Topic fields to display. | [optional] [enum: description, id, name] |

### Return type

[**Get2SpacesSearchResponse**](Get2SpacesSearchResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="getBuyersList"></a>
# **getBuyersList**
> Get2SpacesIdBuyersResponse getBuyersList(id).paginationToken(paginationToken).maxResults(maxResults).userFields(userFields).expansions(expansions).tweetFields(tweetFields).execute();

Retrieve the list of Users who purchased a ticket to the given space

Retrieves the list of Users who purchased a ticket to the given space

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SpacesApi;
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
    String id = "1SLjjRYNejbKM"; // The ID of the Space to be retrieved.
    String paginationToken = "paginationToken_example"; // This parameter is used to get a specified 'page' of results.
    Integer maxResults = 100; // The maximum number of results.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    try {
      Get2SpacesIdBuyersResponse result = client
              .spaces
              .getBuyersList(id)
              .paginationToken(paginationToken)
              .maxResults(maxResults)
              .userFields(userFields)
              .expansions(expansions)
              .tweetFields(tweetFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getIncludes());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#getBuyersList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2SpacesIdBuyersResponse> response = client
              .spaces
              .getBuyersList(id)
              .paginationToken(paginationToken)
              .maxResults(maxResults)
              .userFields(userFields)
              .expansions(expansions)
              .tweetFields(tweetFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#getBuyersList");
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
| **id** | **String**| The ID of the Space to be retrieved. | |
| **paginationToken** | **String**| This parameter is used to get a specified &#39;page&#39; of results. | [optional] |
| **maxResults** | **Integer**| The maximum number of results. | [optional] [default to 100] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2SpacesIdBuyersResponse**](Get2SpacesIdBuyersResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="getTweets"></a>
# **getTweets**
> Get2SpacesIdTweetsResponse getTweets(id).maxResults(maxResults).tweetFields(tweetFields).expansions(expansions).mediaFields(mediaFields).pollFields(pollFields).userFields(userFields).placeFields(placeFields).execute();

Retrieve Tweets from a Space.

Retrieves Tweets shared in the specified Space.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SpacesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.twitter.com";
    
    // Configure HTTP bearer authorization: BearerToken
    configuration.token = "BEARER TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2UserToken
    configuration.accessToken = "YOUR ACCESS TOKEN";
    X client = new X(configuration);
    String id = "1SLjjRYNejbKM"; // The ID of the Space to be retrieved.
    Integer maxResults = 100; // The number of Tweets to fetch from the provided space. If not provided, the value will default to the maximum of 100.
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> mediaFields = Arrays.asList(); // A comma separated list of Media fields to display.
    Set<String> pollFields = Arrays.asList(); // A comma separated list of Poll fields to display.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> placeFields = Arrays.asList(); // A comma separated list of Place fields to display.
    try {
      Get2SpacesIdTweetsResponse result = client
              .spaces
              .getTweets(id)
              .maxResults(maxResults)
              .tweetFields(tweetFields)
              .expansions(expansions)
              .mediaFields(mediaFields)
              .pollFields(pollFields)
              .userFields(userFields)
              .placeFields(placeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getIncludes());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#getTweets");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2SpacesIdTweetsResponse> response = client
              .spaces
              .getTweets(id)
              .maxResults(maxResults)
              .tweetFields(tweetFields)
              .expansions(expansions)
              .mediaFields(mediaFields)
              .pollFields(pollFields)
              .userFields(userFields)
              .placeFields(placeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#getTweets");
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
| **id** | **String**| The ID of the Space to be retrieved. | |
| **maxResults** | **Integer**| The number of Tweets to fetch from the provided space. If not provided, the value will default to the maximum of 100. | [optional] [default to 100] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, attachments.poll_ids, author_id, edit_history_tweet_ids, entities.mentions.username, geo.place_id, in_reply_to_user_id, referenced_tweets.id, referenced_tweets.id.author_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: duration_minutes, end_datetime, id, options, voting_status] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: contained_within, country, country_code, full_name, geo, id, name, place_type] |

### Return type

[**Get2SpacesIdTweetsResponse**](Get2SpacesIdTweetsResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="lookupByCreatorIds"></a>
# **lookupByCreatorIds**
> Get2SpacesByCreatorIdsResponse lookupByCreatorIds(userIds).spaceFields(spaceFields).expansions(expansions).userFields(userFields).topicFields(topicFields).execute();

Space lookup by their creators

Returns a variety of information about the Spaces created by the provided User IDs

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SpacesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.twitter.com";
    
    // Configure HTTP bearer authorization: BearerToken
    configuration.token = "BEARER TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2UserToken
    configuration.accessToken = "YOUR ACCESS TOKEN";
    X client = new X(configuration);
    List<String> userIds = Arrays.asList(); // The IDs of Users to search through.
    Set<String> spaceFields = Arrays.asList(); // A comma separated list of Space fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> topicFields = Arrays.asList(); // A comma separated list of Topic fields to display.
    try {
      Get2SpacesByCreatorIdsResponse result = client
              .spaces
              .lookupByCreatorIds(userIds)
              .spaceFields(spaceFields)
              .expansions(expansions)
              .userFields(userFields)
              .topicFields(topicFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getIncludes());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#lookupByCreatorIds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2SpacesByCreatorIdsResponse> response = client
              .spaces
              .lookupByCreatorIds(userIds)
              .spaceFields(spaceFields)
              .expansions(expansions)
              .userFields(userFields)
              .topicFields(topicFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#lookupByCreatorIds");
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
| **userIds** | [**List&lt;String&gt;**](String.md)| The IDs of Users to search through. | |
| **spaceFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Space fields to display. | [optional] [enum: created_at, creator_id, ended_at, host_ids, id, invited_user_ids, is_ticketed, lang, participant_count, scheduled_start, speaker_ids, started_at, state, subscriber_count, title, topic_ids, updated_at] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: creator_id, host_ids, invited_user_ids, speaker_ids, topic_ids] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **topicFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Topic fields to display. | [optional] [enum: description, id, name] |

### Return type

[**Get2SpacesByCreatorIdsResponse**](Get2SpacesByCreatorIdsResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="lookupSpaceById"></a>
# **lookupSpaceById**
> Get2SpacesIdResponse lookupSpaceById(id).spaceFields(spaceFields).expansions(expansions).userFields(userFields).topicFields(topicFields).execute();

Space lookup by Space ID

Returns a variety of information about the Space specified by the requested ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SpacesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.twitter.com";
    
    // Configure HTTP bearer authorization: BearerToken
    configuration.token = "BEARER TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2UserToken
    configuration.accessToken = "YOUR ACCESS TOKEN";
    X client = new X(configuration);
    String id = "1SLjjRYNejbKM"; // The ID of the Space to be retrieved.
    Set<String> spaceFields = Arrays.asList(); // A comma separated list of Space fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> topicFields = Arrays.asList(); // A comma separated list of Topic fields to display.
    try {
      Get2SpacesIdResponse result = client
              .spaces
              .lookupSpaceById(id)
              .spaceFields(spaceFields)
              .expansions(expansions)
              .userFields(userFields)
              .topicFields(topicFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getIncludes());
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#lookupSpaceById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2SpacesIdResponse> response = client
              .spaces
              .lookupSpaceById(id)
              .spaceFields(spaceFields)
              .expansions(expansions)
              .userFields(userFields)
              .topicFields(topicFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#lookupSpaceById");
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
| **id** | **String**| The ID of the Space to be retrieved. | |
| **spaceFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Space fields to display. | [optional] [enum: created_at, creator_id, ended_at, host_ids, id, invited_user_ids, is_ticketed, lang, participant_count, scheduled_start, speaker_ids, started_at, state, subscriber_count, title, topic_ids, updated_at] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: creator_id, host_ids, invited_user_ids, speaker_ids, topic_ids] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **topicFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Topic fields to display. | [optional] [enum: description, id, name] |

### Return type

[**Get2SpacesIdResponse**](Get2SpacesIdResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="lookupSpaceIds"></a>
# **lookupSpaceIds**
> Get2SpacesResponse lookupSpaceIds(ids).spaceFields(spaceFields).expansions(expansions).userFields(userFields).topicFields(topicFields).execute();

Space lookup up Space IDs

Returns a variety of information about the Spaces specified by the requested IDs

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SpacesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.twitter.com";
    
    // Configure HTTP bearer authorization: BearerToken
    configuration.token = "BEARER TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2UserToken
    configuration.accessToken = "YOUR ACCESS TOKEN";
    X client = new X(configuration);
    List<String> ids = Arrays.asList(); // The list of Space IDs to return.
    Set<String> spaceFields = Arrays.asList(); // A comma separated list of Space fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> topicFields = Arrays.asList(); // A comma separated list of Topic fields to display.
    try {
      Get2SpacesResponse result = client
              .spaces
              .lookupSpaceIds(ids)
              .spaceFields(spaceFields)
              .expansions(expansions)
              .userFields(userFields)
              .topicFields(topicFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getIncludes());
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#lookupSpaceIds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2SpacesResponse> response = client
              .spaces
              .lookupSpaceIds(ids)
              .spaceFields(spaceFields)
              .expansions(expansions)
              .userFields(userFields)
              .topicFields(topicFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#lookupSpaceIds");
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
| **ids** | [**List&lt;String&gt;**](String.md)| The list of Space IDs to return. | |
| **spaceFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Space fields to display. | [optional] [enum: created_at, creator_id, ended_at, host_ids, id, invited_user_ids, is_ticketed, lang, participant_count, scheduled_start, speaker_ids, started_at, state, subscriber_count, title, topic_ids, updated_at] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: creator_id, host_ids, invited_user_ids, speaker_ids, topic_ids] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **topicFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Topic fields to display. | [optional] [enum: description, id, name] |

### Return type

[**Get2SpacesResponse**](Get2SpacesResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

