# BookmarksApi

All URIs are relative to *https://api.twitter.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addTweet**](BookmarksApi.md#addTweet) | **POST** /2/users/{id}/bookmarks | Add Tweet to Bookmarks |
| [**getUserBookmarks**](BookmarksApi.md#getUserBookmarks) | **GET** /2/users/{id}/bookmarks | Bookmarks by User |
| [**removeTweet**](BookmarksApi.md#removeTweet) | **DELETE** /2/users/{id}/bookmarks/{tweet_id} | Remove a bookmarked Tweet |


<a name="addTweet"></a>
# **addTweet**
> BookmarkMutationResponse addTweet(id, bookmarkAddRequest).execute();

Add Tweet to Bookmarks

Adds a Tweet (ID in the body) to the requesting User&#39;s (in the path) bookmarks

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BookmarksApi;
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
    String id = "id_example"; // The ID of the authenticated source User for whom to add bookmarks.
    try {
      BookmarkMutationResponse result = client
              .bookmarks
              .addTweet(tweetId, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling BookmarksApi#addTweet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BookmarkMutationResponse> response = client
              .bookmarks
              .addTweet(tweetId, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BookmarksApi#addTweet");
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
| **id** | **String**| The ID of the authenticated source User for whom to add bookmarks. | |
| **bookmarkAddRequest** | [**BookmarkAddRequest**](BookmarkAddRequest.md)|  | |

### Return type

[**BookmarkMutationResponse**](BookmarkMutationResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="getUserBookmarks"></a>
# **getUserBookmarks**
> Get2UsersIdBookmarksResponse getUserBookmarks(id).maxResults(maxResults).paginationToken(paginationToken).tweetFields(tweetFields).expansions(expansions).mediaFields(mediaFields).pollFields(pollFields).userFields(userFields).placeFields(placeFields).execute();

Bookmarks by User

Returns Tweet objects that have been bookmarked by the requesting User

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BookmarksApi;
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
    String id = "id_example"; // The ID of the authenticated source User for whom to return results.
    Integer maxResults = 56; // The maximum number of results.
    String paginationToken = "paginationToken_example"; // This parameter is used to get the next 'page' of results.
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> mediaFields = Arrays.asList(); // A comma separated list of Media fields to display.
    Set<String> pollFields = Arrays.asList(); // A comma separated list of Poll fields to display.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> placeFields = Arrays.asList(); // A comma separated list of Place fields to display.
    try {
      Get2UsersIdBookmarksResponse result = client
              .bookmarks
              .getUserBookmarks(id)
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
      System.err.println("Exception when calling BookmarksApi#getUserBookmarks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2UsersIdBookmarksResponse> response = client
              .bookmarks
              .getUserBookmarks(id)
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
      System.err.println("Exception when calling BookmarksApi#getUserBookmarks");
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
| **id** | **String**| The ID of the authenticated source User for whom to return results. | |
| **maxResults** | **Integer**| The maximum number of results. | [optional] |
| **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. | [optional] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, attachments.poll_ids, author_id, edit_history_tweet_ids, entities.mentions.username, geo.place_id, in_reply_to_user_id, referenced_tweets.id, referenced_tweets.id.author_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: duration_minutes, end_datetime, id, options, voting_status] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: contained_within, country, country_code, full_name, geo, id, name, place_type] |

### Return type

[**Get2UsersIdBookmarksResponse**](Get2UsersIdBookmarksResponse.md)

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

<a name="removeTweet"></a>
# **removeTweet**
> BookmarkMutationResponse removeTweet(id, tweetId).execute();

Remove a bookmarked Tweet

Removes a Tweet from the requesting User&#39;s bookmarked Tweets.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BookmarksApi;
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
    String id = "id_example"; // The ID of the authenticated source User whose bookmark is to be removed.
    String tweetId = "tweetId_example"; // The ID of the Tweet that the source User is removing from bookmarks.
    try {
      BookmarkMutationResponse result = client
              .bookmarks
              .removeTweet(id, tweetId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling BookmarksApi#removeTweet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BookmarkMutationResponse> response = client
              .bookmarks
              .removeTweet(id, tweetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BookmarksApi#removeTweet");
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
| **id** | **String**| The ID of the authenticated source User whose bookmark is to be removed. | |
| **tweetId** | **String**| The ID of the Tweet that the source User is removing from bookmarks. | |

### Return type

[**BookmarkMutationResponse**](BookmarkMutationResponse.md)

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

