# TweetsApi

All URIs are relative to *https://api.twitter.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addOrDeleteRules**](TweetsApi.md#addOrDeleteRules) | **POST** /2/tweets/search/stream/rules | Add/Delete rules |
| [**createTweet**](TweetsApi.md#createTweet) | **POST** /2/tweets | Creation of a Tweet |
| [**deleteById**](TweetsApi.md#deleteById) | **DELETE** /2/tweets/{id} | Tweet delete by Tweet ID |
| [**getBuyersList**](TweetsApi.md#getBuyersList) | **GET** /2/spaces/{id}/buyers | Retrieve the list of Users who purchased a ticket to the given space |
| [**getFilteredStream**](TweetsApi.md#getFilteredStream) | **GET** /2/tweets/search/stream | Filtered stream |
| [**getFirehoseStream**](TweetsApi.md#getFirehoseStream) | **GET** /2/tweets/firehose/stream | Firehose stream |
| [**getLikedTweets**](TweetsApi.md#getLikedTweets) | **GET** /2/users/{id}/liked_tweets | Returns Tweet objects liked by the provided User ID |
| [**getMentionsById**](TweetsApi.md#getMentionsById) | **GET** /2/users/{id}/mentions | User mention timeline by User ID |
| [**getQuoteTweets**](TweetsApi.md#getQuoteTweets) | **GET** /2/tweets/{id}/quote_tweets | Retrieve Tweets that quote a Tweet. |
| [**getRecentTweetCounts**](TweetsApi.md#getRecentTweetCounts) | **GET** /2/tweets/counts/recent | Recent search counts |
| [**getRecentTweets**](TweetsApi.md#getRecentTweets) | **GET** /2/tweets/search/recent | Recent search |
| [**getTweetCounts**](TweetsApi.md#getTweetCounts) | **GET** /2/tweets/counts/all | Full archive search counts |
| [**getTweets**](TweetsApi.md#getTweets) | **GET** /2/spaces/{id}/tweets | Retrieve Tweets from a Space. |
| [**getUserHomeTimeline**](TweetsApi.md#getUserHomeTimeline) | **GET** /2/users/{id}/timelines/reverse_chronological | User home timeline by User ID |
| [**hideReply**](TweetsApi.md#hideReply) | **PUT** /2/tweets/{tweet_id}/hidden | Hide replies |
| [**likeTweet**](TweetsApi.md#likeTweet) | **POST** /2/users/{id}/likes | Causes the User (in the path) to like the specified Tweet |
| [**listByListId**](TweetsApi.md#listByListId) | **GET** /2/lists/{id}/tweets | List Tweets timeline by List ID. |
| [**listByUserId**](TweetsApi.md#listByUserId) | **GET** /2/users/{id}/tweets | User Tweets timeline by User ID |
| [**lookupById**](TweetsApi.md#lookupById) | **GET** /2/tweets/{id} | Tweet lookup by Tweet ID |
| [**lookupByTweetIds**](TweetsApi.md#lookupByTweetIds) | **GET** /2/tweets | Tweet lookup by Tweet IDs |
| [**retweetTweetById**](TweetsApi.md#retweetTweetById) | **POST** /2/users/{id}/retweets | Causes the User (in the path) to retweet the specified Tweet. |
| [**searchAll**](TweetsApi.md#searchAll) | **GET** /2/tweets/search/all | Full-archive search |
| [**searchStreamRules**](TweetsApi.md#searchStreamRules) | **GET** /2/tweets/search/stream/rules | Rules lookup |
| [**streamSample**](TweetsApi.md#streamSample) | **GET** /2/tweets/sample/stream | Sample stream |
| [**streamSample10**](TweetsApi.md#streamSample10) | **GET** /2/tweets/sample10/stream | Sample 10% stream |
| [**unlikeTweetById**](TweetsApi.md#unlikeTweetById) | **DELETE** /2/users/{id}/likes/{tweet_id} | Causes the User (in the path) to unlike the specified Tweet |
| [**unretweetById**](TweetsApi.md#unretweetById) | **DELETE** /2/users/{id}/retweets/{source_tweet_id} | Causes the User (in the path) to unretweet the specified Tweet |


<a name="addOrDeleteRules"></a>
# **addOrDeleteRules**
> AddOrDeleteRulesResponse addOrDeleteRules(body).dryRun(dryRun).execute();

Add/Delete rules

Add or delete rules from a User&#39;s active rule set. Users can provide unique, optionally tagged rules to add. Users can delete their entire rule set or a subset specified by rule ids or values.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TweetsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.twitter.com";
    
    // Configure HTTP bearer authorization: BearerToken
    configuration.token = "BEARER TOKEN";
    X client = new X(configuration);
    Boolean dryRun = true; // Dry Run can be used with both the add and delete action, with the expected result given, but without actually taking any action in the system (meaning the end state will always be as it was when the request was submitted). This is particularly useful to validate rule changes.
    try {
      AddOrDeleteRulesResponse result = client
              .tweets
              .addOrDeleteRules()
              .dryRun(dryRun)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#addOrDeleteRules");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AddOrDeleteRulesResponse> response = client
              .tweets
              .addOrDeleteRules()
              .dryRun(dryRun)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#addOrDeleteRules");
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
| **body** | **Object**|  | |
| **dryRun** | **Boolean**| Dry Run can be used with both the add and delete action, with the expected result given, but without actually taking any action in the system (meaning the end state will always be as it was when the request was submitted). This is particularly useful to validate rule changes. | [optional] |

### Return type

[**AddOrDeleteRulesResponse**](AddOrDeleteRulesResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="createTweet"></a>
# **createTweet**
> TweetCreateResponse createTweet(tweetCreateRequest).execute();

Creation of a Tweet

Causes the User to create a Tweet under the authorized account.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TweetsApi;
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
    String cardUri = "cardUri_example"; // Card Uri Parameter. This is mutually exclusive from Quote Tweet Id, Poll, Media, and Direct Message Deep Link.
    String directMessageDeepLink = "directMessageDeepLink_example"; // Link to take the conversation from the public timeline to a private Direct Message.
    Boolean forSuperFollowersOnly = false; // Exclusive Tweet for super followers.
    TweetCreateRequestGeo geo = new TweetCreateRequestGeo();
    TweetCreateRequestMedia media = new TweetCreateRequestMedia();
    Boolean nullcast = false; // Nullcasted (promoted-only) Tweets do not appear in the public timeline and are not served to followers.
    TweetCreateRequestPoll poll = new TweetCreateRequestPoll();
    String quoteTweetId = "quoteTweetId_example"; // Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.
    TweetCreateRequestReply reply = new TweetCreateRequestReply();
    String replySettings = "following"; // Settings to indicate who can reply to the Tweet.
    String text = "text_example"; // The content of the Tweet.
    try {
      TweetCreateResponse result = client
              .tweets
              .createTweet()
              .cardUri(cardUri)
              .directMessageDeepLink(directMessageDeepLink)
              .forSuperFollowersOnly(forSuperFollowersOnly)
              .geo(geo)
              .media(media)
              .nullcast(nullcast)
              .poll(poll)
              .quoteTweetId(quoteTweetId)
              .reply(reply)
              .replySettings(replySettings)
              .text(text)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#createTweet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TweetCreateResponse> response = client
              .tweets
              .createTweet()
              .cardUri(cardUri)
              .directMessageDeepLink(directMessageDeepLink)
              .forSuperFollowersOnly(forSuperFollowersOnly)
              .geo(geo)
              .media(media)
              .nullcast(nullcast)
              .poll(poll)
              .quoteTweetId(quoteTweetId)
              .reply(reply)
              .replySettings(replySettings)
              .text(text)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#createTweet");
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
| **tweetCreateRequest** | [**TweetCreateRequest**](TweetCreateRequest.md)|  | |

### Return type

[**TweetCreateResponse**](TweetCreateResponse.md)

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

<a name="deleteById"></a>
# **deleteById**
> TweetDeleteResponse deleteById(id).execute();

Tweet delete by Tweet ID

Delete specified Tweet (in the path) by ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TweetsApi;
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
    String id = "id_example"; // The ID of the Tweet to be deleted.
    try {
      TweetDeleteResponse result = client
              .tweets
              .deleteById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TweetDeleteResponse> response = client
              .tweets
              .deleteById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#deleteById");
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
| **id** | **String**| The ID of the Tweet to be deleted. | |

### Return type

[**TweetDeleteResponse**](TweetDeleteResponse.md)

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
import com.konfigthis.client.api.TweetsApi;
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
              .tweets
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
      System.err.println("Exception when calling TweetsApi#getBuyersList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2SpacesIdBuyersResponse> response = client
              .tweets
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
      System.err.println("Exception when calling TweetsApi#getBuyersList");
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

<a name="getFilteredStream"></a>
# **getFilteredStream**
> FilteredStreamingTweetResponse getFilteredStream().backfillMinutes(backfillMinutes).startTime(startTime).endTime(endTime).tweetFields(tweetFields).expansions(expansions).mediaFields(mediaFields).pollFields(pollFields).userFields(userFields).placeFields(placeFields).execute();

Filtered stream

Streams Tweets matching the stream&#39;s active rule set.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TweetsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.twitter.com";
    
    // Configure HTTP bearer authorization: BearerToken
    configuration.token = "BEARER TOKEN";
    X client = new X(configuration);
    Integer backfillMinutes = 56; // The number of minutes of backfill requested.
    OffsetDateTime startTime = OffsetDateTime.parse("2021-02-01T18:40:40.000Z"); // YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided.
    OffsetDateTime endTime = OffsetDateTime.parse("2021-02-14T18:40:40.000Z"); // YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided.
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> mediaFields = Arrays.asList(); // A comma separated list of Media fields to display.
    Set<String> pollFields = Arrays.asList(); // A comma separated list of Poll fields to display.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> placeFields = Arrays.asList(); // A comma separated list of Place fields to display.
    try {
      FilteredStreamingTweetResponse result = client
              .tweets
              .getFilteredStream()
              .backfillMinutes(backfillMinutes)
              .startTime(startTime)
              .endTime(endTime)
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
      System.out.println(result.getMatchingRules());
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#getFilteredStream");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FilteredStreamingTweetResponse> response = client
              .tweets
              .getFilteredStream()
              .backfillMinutes(backfillMinutes)
              .startTime(startTime)
              .endTime(endTime)
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
      System.err.println("Exception when calling TweetsApi#getFilteredStream");
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
| **backfillMinutes** | **Integer**| The number of minutes of backfill requested. | [optional] |
| **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. | [optional] |
| **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. | [optional] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, attachments.poll_ids, author_id, edit_history_tweet_ids, entities.mentions.username, geo.place_id, in_reply_to_user_id, referenced_tweets.id, referenced_tweets.id.author_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: duration_minutes, end_datetime, id, options, voting_status] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: contained_within, country, country_code, full_name, geo, id, name, place_type] |

### Return type

[**FilteredStreamingTweetResponse**](FilteredStreamingTweetResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="getFirehoseStream"></a>
# **getFirehoseStream**
> StreamingTweetResponse getFirehoseStream(partition).backfillMinutes(backfillMinutes).startTime(startTime).endTime(endTime).tweetFields(tweetFields).expansions(expansions).mediaFields(mediaFields).pollFields(pollFields).userFields(userFields).placeFields(placeFields).execute();

Firehose stream

Streams 100% of public Tweets.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TweetsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.twitter.com";
    
    // Configure HTTP bearer authorization: BearerToken
    configuration.token = "BEARER TOKEN";
    X client = new X(configuration);
    Integer partition = 56; // The partition number.
    Integer backfillMinutes = 56; // The number of minutes of backfill requested.
    OffsetDateTime startTime = OffsetDateTime.parse("2021-02-14T18:40:40.000Z"); // YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp to which the Tweets will be provided.
    OffsetDateTime endTime = OffsetDateTime.parse("2021-02-14T18:40:40.000Z"); // YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided.
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> mediaFields = Arrays.asList(); // A comma separated list of Media fields to display.
    Set<String> pollFields = Arrays.asList(); // A comma separated list of Poll fields to display.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> placeFields = Arrays.asList(); // A comma separated list of Place fields to display.
    try {
      StreamingTweetResponse result = client
              .tweets
              .getFirehoseStream(partition)
              .backfillMinutes(backfillMinutes)
              .startTime(startTime)
              .endTime(endTime)
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
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#getFirehoseStream");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StreamingTweetResponse> response = client
              .tweets
              .getFirehoseStream(partition)
              .backfillMinutes(backfillMinutes)
              .startTime(startTime)
              .endTime(endTime)
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
      System.err.println("Exception when calling TweetsApi#getFirehoseStream");
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
| **partition** | **Integer**| The partition number. | |
| **backfillMinutes** | **Integer**| The number of minutes of backfill requested. | [optional] |
| **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp to which the Tweets will be provided. | [optional] |
| **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. | [optional] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, attachments.poll_ids, author_id, edit_history_tweet_ids, entities.mentions.username, geo.place_id, in_reply_to_user_id, referenced_tweets.id, referenced_tweets.id.author_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: duration_minutes, end_datetime, id, options, voting_status] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: contained_within, country, country_code, full_name, geo, id, name, place_type] |

### Return type

[**StreamingTweetResponse**](StreamingTweetResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="getLikedTweets"></a>
# **getLikedTweets**
> Get2UsersIdLikedTweetsResponse getLikedTweets(id).maxResults(maxResults).paginationToken(paginationToken).tweetFields(tweetFields).expansions(expansions).mediaFields(mediaFields).pollFields(pollFields).userFields(userFields).placeFields(placeFields).execute();

Returns Tweet objects liked by the provided User ID

Returns a list of Tweets liked by the provided User ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TweetsApi;
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
    String id = "2244994945"; // The ID of the User to lookup.
    Integer maxResults = 56; // The maximum number of results.
    String paginationToken = "paginationToken_example"; // This parameter is used to get the next 'page' of results.
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> mediaFields = Arrays.asList(); // A comma separated list of Media fields to display.
    Set<String> pollFields = Arrays.asList(); // A comma separated list of Poll fields to display.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> placeFields = Arrays.asList(); // A comma separated list of Place fields to display.
    try {
      Get2UsersIdLikedTweetsResponse result = client
              .tweets
              .getLikedTweets(id)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
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
      System.err.println("Exception when calling TweetsApi#getLikedTweets");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2UsersIdLikedTweetsResponse> response = client
              .tweets
              .getLikedTweets(id)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
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
      System.err.println("Exception when calling TweetsApi#getLikedTweets");
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
| **id** | **String**| The ID of the User to lookup. | |
| **maxResults** | **Integer**| The maximum number of results. | [optional] |
| **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. | [optional] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, attachments.poll_ids, author_id, edit_history_tweet_ids, entities.mentions.username, geo.place_id, in_reply_to_user_id, referenced_tweets.id, referenced_tweets.id.author_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: duration_minutes, end_datetime, id, options, voting_status] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: contained_within, country, country_code, full_name, geo, id, name, place_type] |

### Return type

[**Get2UsersIdLikedTweetsResponse**](Get2UsersIdLikedTweetsResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="getMentionsById"></a>
# **getMentionsById**
> Get2UsersIdMentionsResponse getMentionsById(id).sinceId(sinceId).untilId(untilId).maxResults(maxResults).paginationToken(paginationToken).startTime(startTime).endTime(endTime).tweetFields(tweetFields).expansions(expansions).mediaFields(mediaFields).pollFields(pollFields).userFields(userFields).placeFields(placeFields).execute();

User mention timeline by User ID

Returns Tweet objects that mention username associated to the provided User ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TweetsApi;
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
    String id = "2244994945"; // The ID of the User to lookup.
    String sinceId = "sinceId_example"; // The minimum Tweet ID to be included in the result set. This parameter takes precedence over start_time if both are specified.
    String untilId = "1346889436626259968"; // The maximum Tweet ID to be included in the result set. This parameter takes precedence over end_time if both are specified.
    Integer maxResults = 56; // The maximum number of results.
    String paginationToken = "paginationToken_example"; // This parameter is used to get the next 'page' of results.
    OffsetDateTime startTime = OffsetDateTime.parse("2021-02-01T18:40:40.000Z"); // YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. The since_id parameter takes precedence if it is also specified.
    OffsetDateTime endTime = OffsetDateTime.parse("2021-02-14T18:40:40.000Z"); // YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. The until_id parameter takes precedence if it is also specified.
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> mediaFields = Arrays.asList(); // A comma separated list of Media fields to display.
    Set<String> pollFields = Arrays.asList(); // A comma separated list of Poll fields to display.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> placeFields = Arrays.asList(); // A comma separated list of Place fields to display.
    try {
      Get2UsersIdMentionsResponse result = client
              .tweets
              .getMentionsById(id)
              .sinceId(sinceId)
              .untilId(untilId)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
              .startTime(startTime)
              .endTime(endTime)
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
      System.err.println("Exception when calling TweetsApi#getMentionsById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2UsersIdMentionsResponse> response = client
              .tweets
              .getMentionsById(id)
              .sinceId(sinceId)
              .untilId(untilId)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
              .startTime(startTime)
              .endTime(endTime)
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
      System.err.println("Exception when calling TweetsApi#getMentionsById");
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
| **id** | **String**| The ID of the User to lookup. | |
| **sinceId** | **String**| The minimum Tweet ID to be included in the result set. This parameter takes precedence over start_time if both are specified. | [optional] |
| **untilId** | **String**| The maximum Tweet ID to be included in the result set. This parameter takes precedence over end_time if both are specified. | [optional] |
| **maxResults** | **Integer**| The maximum number of results. | [optional] |
| **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. | [optional] |
| **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. The since_id parameter takes precedence if it is also specified. | [optional] |
| **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. The until_id parameter takes precedence if it is also specified. | [optional] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, attachments.poll_ids, author_id, edit_history_tweet_ids, entities.mentions.username, geo.place_id, in_reply_to_user_id, referenced_tweets.id, referenced_tweets.id.author_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: duration_minutes, end_datetime, id, options, voting_status] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: contained_within, country, country_code, full_name, geo, id, name, place_type] |

### Return type

[**Get2UsersIdMentionsResponse**](Get2UsersIdMentionsResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="getQuoteTweets"></a>
# **getQuoteTweets**
> Get2TweetsIdQuoteTweetsResponse getQuoteTweets(id).maxResults(maxResults).paginationToken(paginationToken).exclude(exclude).tweetFields(tweetFields).expansions(expansions).mediaFields(mediaFields).pollFields(pollFields).userFields(userFields).placeFields(placeFields).execute();

Retrieve Tweets that quote a Tweet.

Returns a variety of information about each Tweet that quotes the Tweet specified by the requested ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TweetsApi;
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
    String id = "id_example"; // A single Tweet ID.
    Integer maxResults = 10; // The maximum number of results to be returned.
    String paginationToken = "paginationToken_example"; // This parameter is used to get a specified 'page' of results.
    Set<String> exclude = Arrays.asList(); // The set of entities to exclude (e.g. 'replies' or 'retweets').
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> mediaFields = Arrays.asList(); // A comma separated list of Media fields to display.
    Set<String> pollFields = Arrays.asList(); // A comma separated list of Poll fields to display.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> placeFields = Arrays.asList(); // A comma separated list of Place fields to display.
    try {
      Get2TweetsIdQuoteTweetsResponse result = client
              .tweets
              .getQuoteTweets(id)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
              .exclude(exclude)
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
      System.err.println("Exception when calling TweetsApi#getQuoteTweets");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2TweetsIdQuoteTweetsResponse> response = client
              .tweets
              .getQuoteTweets(id)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
              .exclude(exclude)
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
      System.err.println("Exception when calling TweetsApi#getQuoteTweets");
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
| **id** | **String**| A single Tweet ID. | |
| **maxResults** | **Integer**| The maximum number of results to be returned. | [optional] [default to 10] |
| **paginationToken** | **String**| This parameter is used to get a specified &#39;page&#39; of results. | [optional] |
| **exclude** | [**Set&lt;String&gt;**](String.md)| The set of entities to exclude (e.g. &#39;replies&#39; or &#39;retweets&#39;). | [optional] [enum: replies, retweets] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, attachments.poll_ids, author_id, edit_history_tweet_ids, entities.mentions.username, geo.place_id, in_reply_to_user_id, referenced_tweets.id, referenced_tweets.id.author_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: duration_minutes, end_datetime, id, options, voting_status] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: contained_within, country, country_code, full_name, geo, id, name, place_type] |

### Return type

[**Get2TweetsIdQuoteTweetsResponse**](Get2TweetsIdQuoteTweetsResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="getRecentTweetCounts"></a>
# **getRecentTweetCounts**
> Get2TweetsCountsRecentResponse getRecentTweetCounts(query).startTime(startTime).endTime(endTime).sinceId(sinceId).untilId(untilId).nextToken(nextToken).paginationToken(paginationToken).granularity(granularity).searchCountFields(searchCountFields).execute();

Recent search counts

Returns Tweet Counts from the last 7 days that match a search query.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TweetsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.twitter.com";
    
    // Configure HTTP bearer authorization: BearerToken
    configuration.token = "BEARER TOKEN";
    X client = new X(configuration);
    String query = "(from:TwitterDev OR from:TwitterAPI) has:media -is:retweet"; // One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length.
    OffsetDateTime startTime = OffsetDateTime.now(); // YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp (from most recent 7 days) from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute).
    OffsetDateTime endTime = OffsetDateTime.now(); // YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute).
    String sinceId = "sinceId_example"; // Returns results with a Tweet ID greater than (that is, more recent than) the specified ID.
    String untilId = "untilId_example"; // Returns results with a Tweet ID less than (that is, older than) the specified ID.
    String nextToken = "nextToken_example"; // This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
    String paginationToken = "paginationToken_example"; // This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
    String granularity = "minute"; // The granularity for the search counts results.
    Set<String> searchCountFields = Arrays.asList(); // A comma separated list of SearchCount fields to display.
    try {
      Get2TweetsCountsRecentResponse result = client
              .tweets
              .getRecentTweetCounts(query)
              .startTime(startTime)
              .endTime(endTime)
              .sinceId(sinceId)
              .untilId(untilId)
              .nextToken(nextToken)
              .paginationToken(paginationToken)
              .granularity(granularity)
              .searchCountFields(searchCountFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#getRecentTweetCounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2TweetsCountsRecentResponse> response = client
              .tweets
              .getRecentTweetCounts(query)
              .startTime(startTime)
              .endTime(endTime)
              .sinceId(sinceId)
              .untilId(untilId)
              .nextToken(nextToken)
              .paginationToken(paginationToken)
              .granularity(granularity)
              .searchCountFields(searchCountFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#getRecentTweetCounts");
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
| **query** | **String**| One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length. | |
| **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp (from most recent 7 days) from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute). | [optional] |
| **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute). | [optional] |
| **sinceId** | **String**| Returns results with a Tweet ID greater than (that is, more recent than) the specified ID. | [optional] |
| **untilId** | **String**| Returns results with a Tweet ID less than (that is, older than) the specified ID. | [optional] |
| **nextToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional] |
| **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional] |
| **granularity** | **String**| The granularity for the search counts results. | [optional] [default to hour] [enum: minute, hour, day] |
| **searchCountFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of SearchCount fields to display. | [optional] [enum: end, start, tweet_count] |

### Return type

[**Get2TweetsCountsRecentResponse**](Get2TweetsCountsRecentResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="getRecentTweets"></a>
# **getRecentTweets**
> Get2TweetsSearchRecentResponse getRecentTweets(query).startTime(startTime).endTime(endTime).sinceId(sinceId).untilId(untilId).maxResults(maxResults).nextToken(nextToken).paginationToken(paginationToken).sortOrder(sortOrder).tweetFields(tweetFields).expansions(expansions).mediaFields(mediaFields).pollFields(pollFields).userFields(userFields).placeFields(placeFields).execute();

Recent search

Returns Tweets from the last 7 days that match a search query.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TweetsApi;
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
    String query = "(from:TwitterDev OR from:TwitterAPI) has:media -is:retweet"; // One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length.
    OffsetDateTime startTime = OffsetDateTime.now(); // YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute).
    OffsetDateTime endTime = OffsetDateTime.now(); // YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute).
    String sinceId = "sinceId_example"; // Returns results with a Tweet ID greater than (that is, more recent than) the specified ID.
    String untilId = "untilId_example"; // Returns results with a Tweet ID less than (that is, older than) the specified ID.
    Integer maxResults = 10; // The maximum number of search results to be returned by a request.
    String nextToken = "nextToken_example"; // This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
    String paginationToken = "paginationToken_example"; // This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
    String sortOrder = "recency"; // This order in which to return results.
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> mediaFields = Arrays.asList(); // A comma separated list of Media fields to display.
    Set<String> pollFields = Arrays.asList(); // A comma separated list of Poll fields to display.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> placeFields = Arrays.asList(); // A comma separated list of Place fields to display.
    try {
      Get2TweetsSearchRecentResponse result = client
              .tweets
              .getRecentTweets(query)
              .startTime(startTime)
              .endTime(endTime)
              .sinceId(sinceId)
              .untilId(untilId)
              .maxResults(maxResults)
              .nextToken(nextToken)
              .paginationToken(paginationToken)
              .sortOrder(sortOrder)
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
      System.err.println("Exception when calling TweetsApi#getRecentTweets");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2TweetsSearchRecentResponse> response = client
              .tweets
              .getRecentTweets(query)
              .startTime(startTime)
              .endTime(endTime)
              .sinceId(sinceId)
              .untilId(untilId)
              .maxResults(maxResults)
              .nextToken(nextToken)
              .paginationToken(paginationToken)
              .sortOrder(sortOrder)
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
      System.err.println("Exception when calling TweetsApi#getRecentTweets");
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
| **query** | **String**| One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length. | |
| **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute). | [optional] |
| **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute). | [optional] |
| **sinceId** | **String**| Returns results with a Tweet ID greater than (that is, more recent than) the specified ID. | [optional] |
| **untilId** | **String**| Returns results with a Tweet ID less than (that is, older than) the specified ID. | [optional] |
| **maxResults** | **Integer**| The maximum number of search results to be returned by a request. | [optional] [default to 10] |
| **nextToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional] |
| **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional] |
| **sortOrder** | **String**| This order in which to return results. | [optional] [enum: recency, relevancy] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, attachments.poll_ids, author_id, edit_history_tweet_ids, entities.mentions.username, geo.place_id, in_reply_to_user_id, referenced_tweets.id, referenced_tweets.id.author_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: duration_minutes, end_datetime, id, options, voting_status] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: contained_within, country, country_code, full_name, geo, id, name, place_type] |

### Return type

[**Get2TweetsSearchRecentResponse**](Get2TweetsSearchRecentResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="getTweetCounts"></a>
# **getTweetCounts**
> Get2TweetsCountsAllResponse getTweetCounts(query).startTime(startTime).endTime(endTime).sinceId(sinceId).untilId(untilId).nextToken(nextToken).paginationToken(paginationToken).granularity(granularity).searchCountFields(searchCountFields).execute();

Full archive search counts

Returns Tweet Counts that match a search query.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TweetsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.twitter.com";
    
    // Configure HTTP bearer authorization: BearerToken
    configuration.token = "BEARER TOKEN";
    X client = new X(configuration);
    String query = "(from:TwitterDev OR from:TwitterAPI) has:media -is:retweet"; // One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length.
    OffsetDateTime startTime = OffsetDateTime.now(); // YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp (from most recent 7 days) from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute).
    OffsetDateTime endTime = OffsetDateTime.now(); // YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute).
    String sinceId = "sinceId_example"; // Returns results with a Tweet ID greater than (that is, more recent than) the specified ID.
    String untilId = "untilId_example"; // Returns results with a Tweet ID less than (that is, older than) the specified ID.
    String nextToken = "nextToken_example"; // This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
    String paginationToken = "paginationToken_example"; // This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
    String granularity = "minute"; // The granularity for the search counts results.
    Set<String> searchCountFields = Arrays.asList(); // A comma separated list of SearchCount fields to display.
    try {
      Get2TweetsCountsAllResponse result = client
              .tweets
              .getTweetCounts(query)
              .startTime(startTime)
              .endTime(endTime)
              .sinceId(sinceId)
              .untilId(untilId)
              .nextToken(nextToken)
              .paginationToken(paginationToken)
              .granularity(granularity)
              .searchCountFields(searchCountFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#getTweetCounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2TweetsCountsAllResponse> response = client
              .tweets
              .getTweetCounts(query)
              .startTime(startTime)
              .endTime(endTime)
              .sinceId(sinceId)
              .untilId(untilId)
              .nextToken(nextToken)
              .paginationToken(paginationToken)
              .granularity(granularity)
              .searchCountFields(searchCountFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#getTweetCounts");
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
| **query** | **String**| One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length. | |
| **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp (from most recent 7 days) from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute). | [optional] |
| **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute). | [optional] |
| **sinceId** | **String**| Returns results with a Tweet ID greater than (that is, more recent than) the specified ID. | [optional] |
| **untilId** | **String**| Returns results with a Tweet ID less than (that is, older than) the specified ID. | [optional] |
| **nextToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional] |
| **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional] |
| **granularity** | **String**| The granularity for the search counts results. | [optional] [default to hour] [enum: minute, hour, day] |
| **searchCountFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of SearchCount fields to display. | [optional] [enum: end, start, tweet_count] |

### Return type

[**Get2TweetsCountsAllResponse**](Get2TweetsCountsAllResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

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
import com.konfigthis.client.api.TweetsApi;
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
              .tweets
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
      System.err.println("Exception when calling TweetsApi#getTweets");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2SpacesIdTweetsResponse> response = client
              .tweets
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
      System.err.println("Exception when calling TweetsApi#getTweets");
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

<a name="getUserHomeTimeline"></a>
# **getUserHomeTimeline**
> Get2UsersIdTimelinesReverseChronologicalResponse getUserHomeTimeline(id).sinceId(sinceId).untilId(untilId).maxResults(maxResults).paginationToken(paginationToken).exclude(exclude).startTime(startTime).endTime(endTime).tweetFields(tweetFields).expansions(expansions).mediaFields(mediaFields).pollFields(pollFields).userFields(userFields).placeFields(placeFields).execute();

User home timeline by User ID

Returns Tweet objects that appears in the provided User ID&#39;s home timeline

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TweetsApi;
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
    String id = "id_example"; // The ID of the authenticated source User to list Reverse Chronological Timeline Tweets of.
    String sinceId = "791775337160081409"; // The minimum Tweet ID to be included in the result set. This parameter takes precedence over start_time if both are specified.
    String untilId = "1346889436626259968"; // The maximum Tweet ID to be included in the result set. This parameter takes precedence over end_time if both are specified.
    Integer maxResults = 56; // The maximum number of results.
    String paginationToken = "paginationToken_example"; // This parameter is used to get the next 'page' of results.
    Set<String> exclude = Arrays.asList(); // The set of entities to exclude (e.g. 'replies' or 'retweets').
    OffsetDateTime startTime = OffsetDateTime.parse("2021-02-01T18:40:40.000Z"); // YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. The since_id parameter takes precedence if it is also specified.
    OffsetDateTime endTime = OffsetDateTime.parse("2021-02-14T18:40:40.000Z"); // YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. The until_id parameter takes precedence if it is also specified.
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> mediaFields = Arrays.asList(); // A comma separated list of Media fields to display.
    Set<String> pollFields = Arrays.asList(); // A comma separated list of Poll fields to display.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> placeFields = Arrays.asList(); // A comma separated list of Place fields to display.
    try {
      Get2UsersIdTimelinesReverseChronologicalResponse result = client
              .tweets
              .getUserHomeTimeline(id)
              .sinceId(sinceId)
              .untilId(untilId)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
              .exclude(exclude)
              .startTime(startTime)
              .endTime(endTime)
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
      System.err.println("Exception when calling TweetsApi#getUserHomeTimeline");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2UsersIdTimelinesReverseChronologicalResponse> response = client
              .tweets
              .getUserHomeTimeline(id)
              .sinceId(sinceId)
              .untilId(untilId)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
              .exclude(exclude)
              .startTime(startTime)
              .endTime(endTime)
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
      System.err.println("Exception when calling TweetsApi#getUserHomeTimeline");
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
| **id** | **String**| The ID of the authenticated source User to list Reverse Chronological Timeline Tweets of. | |
| **sinceId** | **String**| The minimum Tweet ID to be included in the result set. This parameter takes precedence over start_time if both are specified. | [optional] |
| **untilId** | **String**| The maximum Tweet ID to be included in the result set. This parameter takes precedence over end_time if both are specified. | [optional] |
| **maxResults** | **Integer**| The maximum number of results. | [optional] |
| **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. | [optional] |
| **exclude** | [**Set&lt;String&gt;**](String.md)| The set of entities to exclude (e.g. &#39;replies&#39; or &#39;retweets&#39;). | [optional] [enum: replies, retweets] |
| **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. The since_id parameter takes precedence if it is also specified. | [optional] |
| **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. The until_id parameter takes precedence if it is also specified. | [optional] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, attachments.poll_ids, author_id, edit_history_tweet_ids, entities.mentions.username, geo.place_id, in_reply_to_user_id, referenced_tweets.id, referenced_tweets.id.author_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: duration_minutes, end_datetime, id, options, voting_status] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: contained_within, country, country_code, full_name, geo, id, name, place_type] |

### Return type

[**Get2UsersIdTimelinesReverseChronologicalResponse**](Get2UsersIdTimelinesReverseChronologicalResponse.md)

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

<a name="hideReply"></a>
# **hideReply**
> TweetHideResponse hideReply(tweetId).tweetHideRequest(tweetHideRequest).execute();

Hide replies

Hides or unhides a reply to an owned conversation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TweetsApi;
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
    Boolean hidden = true;
    String tweetId = "tweetId_example"; // The ID of the reply that you want to hide or unhide.
    try {
      TweetHideResponse result = client
              .tweets
              .hideReply(hidden, tweetId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#hideReply");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TweetHideResponse> response = client
              .tweets
              .hideReply(hidden, tweetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#hideReply");
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
| **tweetId** | **String**| The ID of the reply that you want to hide or unhide. | |
| **tweetHideRequest** | [**TweetHideRequest**](TweetHideRequest.md)|  | [optional] |

### Return type

[**TweetHideResponse**](TweetHideResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="likeTweet"></a>
# **likeTweet**
> UsersLikesCreateResponse likeTweet(id).usersLikesCreateRequest(usersLikesCreateRequest).execute();

Causes the User (in the path) to like the specified Tweet

Causes the User (in the path) to like the specified Tweet. The User in the path must match the User context authorizing the request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TweetsApi;
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
    String tweetId = "tweetId_example"; // Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.
    String id = "id_example"; // The ID of the authenticated source User that is requesting to like the Tweet.
    try {
      UsersLikesCreateResponse result = client
              .tweets
              .likeTweet(tweetId, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#likeTweet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersLikesCreateResponse> response = client
              .tweets
              .likeTweet(tweetId, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#likeTweet");
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
| **id** | **String**| The ID of the authenticated source User that is requesting to like the Tweet. | |
| **usersLikesCreateRequest** | [**UsersLikesCreateRequest**](UsersLikesCreateRequest.md)|  | [optional] |

### Return type

[**UsersLikesCreateResponse**](UsersLikesCreateResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="listByListId"></a>
# **listByListId**
> Get2ListsIdTweetsResponse listByListId(id).maxResults(maxResults).paginationToken(paginationToken).tweetFields(tweetFields).expansions(expansions).mediaFields(mediaFields).pollFields(pollFields).userFields(userFields).placeFields(placeFields).execute();

List Tweets timeline by List ID.

Returns a list of Tweets associated with the provided List ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TweetsApi;
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
    String id = "id_example"; // The ID of the List.
    Integer maxResults = 100; // The maximum number of results.
    String paginationToken = "paginationToken_example"; // This parameter is used to get the next 'page' of results.
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> mediaFields = Arrays.asList(); // A comma separated list of Media fields to display.
    Set<String> pollFields = Arrays.asList(); // A comma separated list of Poll fields to display.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> placeFields = Arrays.asList(); // A comma separated list of Place fields to display.
    try {
      Get2ListsIdTweetsResponse result = client
              .tweets
              .listByListId(id)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
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
      System.err.println("Exception when calling TweetsApi#listByListId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2ListsIdTweetsResponse> response = client
              .tweets
              .listByListId(id)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
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
      System.err.println("Exception when calling TweetsApi#listByListId");
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
| **id** | **String**| The ID of the List. | |
| **maxResults** | **Integer**| The maximum number of results. | [optional] [default to 100] |
| **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. | [optional] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, attachments.poll_ids, author_id, edit_history_tweet_ids, entities.mentions.username, geo.place_id, in_reply_to_user_id, referenced_tweets.id, referenced_tweets.id.author_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: duration_minutes, end_datetime, id, options, voting_status] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: contained_within, country, country_code, full_name, geo, id, name, place_type] |

### Return type

[**Get2ListsIdTweetsResponse**](Get2ListsIdTweetsResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="listByUserId"></a>
# **listByUserId**
> Get2UsersIdTweetsResponse listByUserId(id).sinceId(sinceId).untilId(untilId).maxResults(maxResults).paginationToken(paginationToken).exclude(exclude).startTime(startTime).endTime(endTime).tweetFields(tweetFields).expansions(expansions).mediaFields(mediaFields).pollFields(pollFields).userFields(userFields).placeFields(placeFields).execute();

User Tweets timeline by User ID

Returns a list of Tweets authored by the provided User ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TweetsApi;
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
    String id = "2244994945"; // The ID of the User to lookup.
    String sinceId = "791775337160081409"; // The minimum Tweet ID to be included in the result set. This parameter takes precedence over start_time if both are specified.
    String untilId = "1346889436626259968"; // The maximum Tweet ID to be included in the result set. This parameter takes precedence over end_time if both are specified.
    Integer maxResults = 56; // The maximum number of results.
    String paginationToken = "paginationToken_example"; // This parameter is used to get the next 'page' of results.
    Set<String> exclude = Arrays.asList(); // The set of entities to exclude (e.g. 'replies' or 'retweets').
    OffsetDateTime startTime = OffsetDateTime.parse("2021-02-01T18:40:40.000Z"); // YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. The since_id parameter takes precedence if it is also specified.
    OffsetDateTime endTime = OffsetDateTime.parse("2021-02-14T18:40:40.000Z"); // YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. The until_id parameter takes precedence if it is also specified.
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> mediaFields = Arrays.asList(); // A comma separated list of Media fields to display.
    Set<String> pollFields = Arrays.asList(); // A comma separated list of Poll fields to display.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> placeFields = Arrays.asList(); // A comma separated list of Place fields to display.
    try {
      Get2UsersIdTweetsResponse result = client
              .tweets
              .listByUserId(id)
              .sinceId(sinceId)
              .untilId(untilId)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
              .exclude(exclude)
              .startTime(startTime)
              .endTime(endTime)
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
      System.err.println("Exception when calling TweetsApi#listByUserId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2UsersIdTweetsResponse> response = client
              .tweets
              .listByUserId(id)
              .sinceId(sinceId)
              .untilId(untilId)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
              .exclude(exclude)
              .startTime(startTime)
              .endTime(endTime)
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
      System.err.println("Exception when calling TweetsApi#listByUserId");
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
| **id** | **String**| The ID of the User to lookup. | |
| **sinceId** | **String**| The minimum Tweet ID to be included in the result set. This parameter takes precedence over start_time if both are specified. | [optional] |
| **untilId** | **String**| The maximum Tweet ID to be included in the result set. This parameter takes precedence over end_time if both are specified. | [optional] |
| **maxResults** | **Integer**| The maximum number of results. | [optional] |
| **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. | [optional] |
| **exclude** | [**Set&lt;String&gt;**](String.md)| The set of entities to exclude (e.g. &#39;replies&#39; or &#39;retweets&#39;). | [optional] [enum: replies, retweets] |
| **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. The since_id parameter takes precedence if it is also specified. | [optional] |
| **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. The until_id parameter takes precedence if it is also specified. | [optional] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, attachments.poll_ids, author_id, edit_history_tweet_ids, entities.mentions.username, geo.place_id, in_reply_to_user_id, referenced_tweets.id, referenced_tweets.id.author_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: duration_minutes, end_datetime, id, options, voting_status] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: contained_within, country, country_code, full_name, geo, id, name, place_type] |

### Return type

[**Get2UsersIdTweetsResponse**](Get2UsersIdTweetsResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="lookupById"></a>
# **lookupById**
> Get2TweetsIdResponse lookupById(id).tweetFields(tweetFields).expansions(expansions).mediaFields(mediaFields).pollFields(pollFields).userFields(userFields).placeFields(placeFields).execute();

Tweet lookup by Tweet ID

Returns a variety of information about the Tweet specified by the requested ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TweetsApi;
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
    String id = "id_example"; // A single Tweet ID.
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> mediaFields = Arrays.asList(); // A comma separated list of Media fields to display.
    Set<String> pollFields = Arrays.asList(); // A comma separated list of Poll fields to display.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> placeFields = Arrays.asList(); // A comma separated list of Place fields to display.
    try {
      Get2TweetsIdResponse result = client
              .tweets
              .lookupById(id)
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
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#lookupById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2TweetsIdResponse> response = client
              .tweets
              .lookupById(id)
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
      System.err.println("Exception when calling TweetsApi#lookupById");
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
| **id** | **String**| A single Tweet ID. | |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, attachments.poll_ids, author_id, edit_history_tweet_ids, entities.mentions.username, geo.place_id, in_reply_to_user_id, referenced_tweets.id, referenced_tweets.id.author_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: duration_minutes, end_datetime, id, options, voting_status] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: contained_within, country, country_code, full_name, geo, id, name, place_type] |

### Return type

[**Get2TweetsIdResponse**](Get2TweetsIdResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="lookupByTweetIds"></a>
# **lookupByTweetIds**
> Get2TweetsResponse lookupByTweetIds(ids).tweetFields(tweetFields).expansions(expansions).mediaFields(mediaFields).pollFields(pollFields).userFields(userFields).placeFields(placeFields).execute();

Tweet lookup by Tweet IDs

Returns a variety of information about the Tweet specified by the requested ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TweetsApi;
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
    List<String> ids = Arrays.asList(); // A comma separated list of Tweet IDs. Up to 100 are allowed in a single request.
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> mediaFields = Arrays.asList(); // A comma separated list of Media fields to display.
    Set<String> pollFields = Arrays.asList(); // A comma separated list of Poll fields to display.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> placeFields = Arrays.asList(); // A comma separated list of Place fields to display.
    try {
      Get2TweetsResponse result = client
              .tweets
              .lookupByTweetIds(ids)
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
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#lookupByTweetIds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2TweetsResponse> response = client
              .tweets
              .lookupByTweetIds(ids)
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
      System.err.println("Exception when calling TweetsApi#lookupByTweetIds");
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
| **ids** | [**List&lt;String&gt;**](String.md)| A comma separated list of Tweet IDs. Up to 100 are allowed in a single request. | |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, attachments.poll_ids, author_id, edit_history_tweet_ids, entities.mentions.username, geo.place_id, in_reply_to_user_id, referenced_tweets.id, referenced_tweets.id.author_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: duration_minutes, end_datetime, id, options, voting_status] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: contained_within, country, country_code, full_name, geo, id, name, place_type] |

### Return type

[**Get2TweetsResponse**](Get2TweetsResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="retweetTweetById"></a>
# **retweetTweetById**
> UsersRetweetsCreateResponse retweetTweetById(id).usersRetweetsCreateRequest(usersRetweetsCreateRequest).execute();

Causes the User (in the path) to retweet the specified Tweet.

Causes the User (in the path) to retweet the specified Tweet. The User in the path must match the User context authorizing the request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TweetsApi;
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
    String tweetId = "tweetId_example"; // Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.
    String id = "id_example"; // The ID of the authenticated source User that is requesting to retweet the Tweet.
    try {
      UsersRetweetsCreateResponse result = client
              .tweets
              .retweetTweetById(tweetId, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#retweetTweetById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersRetweetsCreateResponse> response = client
              .tweets
              .retweetTweetById(tweetId, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#retweetTweetById");
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
| **id** | **String**| The ID of the authenticated source User that is requesting to retweet the Tweet. | |
| **usersRetweetsCreateRequest** | [**UsersRetweetsCreateRequest**](UsersRetweetsCreateRequest.md)|  | [optional] |

### Return type

[**UsersRetweetsCreateResponse**](UsersRetweetsCreateResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="searchAll"></a>
# **searchAll**
> Get2TweetsSearchAllResponse searchAll(query).startTime(startTime).endTime(endTime).sinceId(sinceId).untilId(untilId).maxResults(maxResults).nextToken(nextToken).paginationToken(paginationToken).sortOrder(sortOrder).tweetFields(tweetFields).expansions(expansions).mediaFields(mediaFields).pollFields(pollFields).userFields(userFields).placeFields(placeFields).execute();

Full-archive search

Returns Tweets that match a search query.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TweetsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.twitter.com";
    
    // Configure HTTP bearer authorization: BearerToken
    configuration.token = "BEARER TOKEN";
    X client = new X(configuration);
    String query = "(from:TwitterDev OR from:TwitterAPI) has:media -is:retweet"; // One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length.
    OffsetDateTime startTime = OffsetDateTime.now(); // YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute).
    OffsetDateTime endTime = OffsetDateTime.now(); // YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute).
    String sinceId = "sinceId_example"; // Returns results with a Tweet ID greater than (that is, more recent than) the specified ID.
    String untilId = "untilId_example"; // Returns results with a Tweet ID less than (that is, older than) the specified ID.
    Integer maxResults = 10; // The maximum number of search results to be returned by a request.
    String nextToken = "nextToken_example"; // This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
    String paginationToken = "paginationToken_example"; // This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
    String sortOrder = "recency"; // This order in which to return results.
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> mediaFields = Arrays.asList(); // A comma separated list of Media fields to display.
    Set<String> pollFields = Arrays.asList(); // A comma separated list of Poll fields to display.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> placeFields = Arrays.asList(); // A comma separated list of Place fields to display.
    try {
      Get2TweetsSearchAllResponse result = client
              .tweets
              .searchAll(query)
              .startTime(startTime)
              .endTime(endTime)
              .sinceId(sinceId)
              .untilId(untilId)
              .maxResults(maxResults)
              .nextToken(nextToken)
              .paginationToken(paginationToken)
              .sortOrder(sortOrder)
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
      System.err.println("Exception when calling TweetsApi#searchAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2TweetsSearchAllResponse> response = client
              .tweets
              .searchAll(query)
              .startTime(startTime)
              .endTime(endTime)
              .sinceId(sinceId)
              .untilId(untilId)
              .maxResults(maxResults)
              .nextToken(nextToken)
              .paginationToken(paginationToken)
              .sortOrder(sortOrder)
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
      System.err.println("Exception when calling TweetsApi#searchAll");
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
| **query** | **String**| One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length. | |
| **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute). | [optional] |
| **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute). | [optional] |
| **sinceId** | **String**| Returns results with a Tweet ID greater than (that is, more recent than) the specified ID. | [optional] |
| **untilId** | **String**| Returns results with a Tweet ID less than (that is, older than) the specified ID. | [optional] |
| **maxResults** | **Integer**| The maximum number of search results to be returned by a request. | [optional] [default to 10] |
| **nextToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional] |
| **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional] |
| **sortOrder** | **String**| This order in which to return results. | [optional] [enum: recency, relevancy] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, attachments.poll_ids, author_id, edit_history_tweet_ids, entities.mentions.username, geo.place_id, in_reply_to_user_id, referenced_tweets.id, referenced_tweets.id.author_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: duration_minutes, end_datetime, id, options, voting_status] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: contained_within, country, country_code, full_name, geo, id, name, place_type] |

### Return type

[**Get2TweetsSearchAllResponse**](Get2TweetsSearchAllResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="searchStreamRules"></a>
# **searchStreamRules**
> RulesLookupResponse searchStreamRules().ids(ids).maxResults(maxResults).paginationToken(paginationToken).execute();

Rules lookup

Returns rules from a User&#39;s active rule set. Users can fetch all of their rules or a subset, specified by the provided rule ids.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TweetsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.twitter.com";
    
    // Configure HTTP bearer authorization: BearerToken
    configuration.token = "BEARER TOKEN";
    X client = new X(configuration);
    List<String> ids = Arrays.asList(); // A comma-separated list of Rule IDs.
    Integer maxResults = 1000; // The maximum number of results.
    String paginationToken = "paginationToken_example"; // This value is populated by passing the 'next_token' returned in a request to paginate through results.
    try {
      RulesLookupResponse result = client
              .tweets
              .searchStreamRules()
              .ids(ids)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#searchStreamRules");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RulesLookupResponse> response = client
              .tweets
              .searchStreamRules()
              .ids(ids)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#searchStreamRules");
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
| **ids** | [**List&lt;String&gt;**](String.md)| A comma-separated list of Rule IDs. | [optional] |
| **maxResults** | **Integer**| The maximum number of results. | [optional] [default to 1000] |
| **paginationToken** | **String**| This value is populated by passing the &#39;next_token&#39; returned in a request to paginate through results. | [optional] |

### Return type

[**RulesLookupResponse**](RulesLookupResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="streamSample"></a>
# **streamSample**
> StreamingTweetResponse streamSample().backfillMinutes(backfillMinutes).tweetFields(tweetFields).expansions(expansions).mediaFields(mediaFields).pollFields(pollFields).userFields(userFields).placeFields(placeFields).execute();

Sample stream

Streams a deterministic 1% of public Tweets.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TweetsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.twitter.com";
    
    // Configure HTTP bearer authorization: BearerToken
    configuration.token = "BEARER TOKEN";
    X client = new X(configuration);
    Integer backfillMinutes = 56; // The number of minutes of backfill requested.
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> mediaFields = Arrays.asList(); // A comma separated list of Media fields to display.
    Set<String> pollFields = Arrays.asList(); // A comma separated list of Poll fields to display.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> placeFields = Arrays.asList(); // A comma separated list of Place fields to display.
    try {
      StreamingTweetResponse result = client
              .tweets
              .streamSample()
              .backfillMinutes(backfillMinutes)
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
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#streamSample");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StreamingTweetResponse> response = client
              .tweets
              .streamSample()
              .backfillMinutes(backfillMinutes)
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
      System.err.println("Exception when calling TweetsApi#streamSample");
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
| **backfillMinutes** | **Integer**| The number of minutes of backfill requested. | [optional] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, attachments.poll_ids, author_id, edit_history_tweet_ids, entities.mentions.username, geo.place_id, in_reply_to_user_id, referenced_tweets.id, referenced_tweets.id.author_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: duration_minutes, end_datetime, id, options, voting_status] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: contained_within, country, country_code, full_name, geo, id, name, place_type] |

### Return type

[**StreamingTweetResponse**](StreamingTweetResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="streamSample10"></a>
# **streamSample10**
> Get2TweetsSample10StreamResponse streamSample10(partition).backfillMinutes(backfillMinutes).startTime(startTime).endTime(endTime).tweetFields(tweetFields).expansions(expansions).mediaFields(mediaFields).pollFields(pollFields).userFields(userFields).placeFields(placeFields).execute();

Sample 10% stream

Streams a deterministic 10% of public Tweets.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TweetsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.twitter.com";
    
    // Configure HTTP bearer authorization: BearerToken
    configuration.token = "BEARER TOKEN";
    X client = new X(configuration);
    Integer partition = 56; // The partition number.
    Integer backfillMinutes = 56; // The number of minutes of backfill requested.
    OffsetDateTime startTime = OffsetDateTime.parse("2021-02-14T18:40:40.000Z"); // YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp to which the Tweets will be provided.
    OffsetDateTime endTime = OffsetDateTime.parse("2021-02-14T18:40:40.000Z"); // YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided.
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> mediaFields = Arrays.asList(); // A comma separated list of Media fields to display.
    Set<String> pollFields = Arrays.asList(); // A comma separated list of Poll fields to display.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> placeFields = Arrays.asList(); // A comma separated list of Place fields to display.
    try {
      Get2TweetsSample10StreamResponse result = client
              .tweets
              .streamSample10(partition)
              .backfillMinutes(backfillMinutes)
              .startTime(startTime)
              .endTime(endTime)
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
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#streamSample10");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2TweetsSample10StreamResponse> response = client
              .tweets
              .streamSample10(partition)
              .backfillMinutes(backfillMinutes)
              .startTime(startTime)
              .endTime(endTime)
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
      System.err.println("Exception when calling TweetsApi#streamSample10");
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
| **partition** | **Integer**| The partition number. | |
| **backfillMinutes** | **Integer**| The number of minutes of backfill requested. | [optional] |
| **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp to which the Tweets will be provided. | [optional] |
| **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. | [optional] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, attachments.poll_ids, author_id, edit_history_tweet_ids, entities.mentions.username, geo.place_id, in_reply_to_user_id, referenced_tweets.id, referenced_tweets.id.author_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: duration_minutes, end_datetime, id, options, voting_status] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: contained_within, country, country_code, full_name, geo, id, name, place_type] |

### Return type

[**Get2TweetsSample10StreamResponse**](Get2TweetsSample10StreamResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="unlikeTweetById"></a>
# **unlikeTweetById**
> UsersLikesDeleteResponse unlikeTweetById(id, tweetId).execute();

Causes the User (in the path) to unlike the specified Tweet

Causes the User (in the path) to unlike the specified Tweet. The User must match the User context authorizing the request

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TweetsApi;
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
    String id = "id_example"; // The ID of the authenticated source User that is requesting to unlike the Tweet.
    String tweetId = "tweetId_example"; // The ID of the Tweet that the User is requesting to unlike.
    try {
      UsersLikesDeleteResponse result = client
              .tweets
              .unlikeTweetById(id, tweetId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#unlikeTweetById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersLikesDeleteResponse> response = client
              .tweets
              .unlikeTweetById(id, tweetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#unlikeTweetById");
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
| **id** | **String**| The ID of the authenticated source User that is requesting to unlike the Tweet. | |
| **tweetId** | **String**| The ID of the Tweet that the User is requesting to unlike. | |

### Return type

[**UsersLikesDeleteResponse**](UsersLikesDeleteResponse.md)

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

<a name="unretweetById"></a>
# **unretweetById**
> UsersRetweetsDeleteResponse unretweetById(id, sourceTweetId).execute();

Causes the User (in the path) to unretweet the specified Tweet

Causes the User (in the path) to unretweet the specified Tweet. The User must match the User context authorizing the request

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TweetsApi;
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
    String id = "id_example"; // The ID of the authenticated source User that is requesting to retweet the Tweet.
    String sourceTweetId = "sourceTweetId_example"; // The ID of the Tweet that the User is requesting to unretweet.
    try {
      UsersRetweetsDeleteResponse result = client
              .tweets
              .unretweetById(id, sourceTweetId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#unretweetById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersRetweetsDeleteResponse> response = client
              .tweets
              .unretweetById(id, sourceTweetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#unretweetById");
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
| **id** | **String**| The ID of the authenticated source User that is requesting to retweet the Tweet. | |
| **sourceTweetId** | **String**| The ID of the Tweet that the User is requesting to unretweet. | |

### Return type

[**UsersRetweetsDeleteResponse**](UsersRetweetsDeleteResponse.md)

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

