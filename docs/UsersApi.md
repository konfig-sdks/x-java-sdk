# UsersApi

All URIs are relative to *https://api.twitter.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**blockUserById**](UsersApi.md#blockUserById) | **POST** /2/users/{id}/blocking | Block User by User ID |
| [**followUser**](UsersApi.md#followUser) | **POST** /2/users/{id}/following | Follow User |
| [**getBlockedUsers**](UsersApi.md#getBlockedUsers) | **GET** /2/users/{id}/blocking | Returns User objects that are blocked by provided User ID |
| [**getFollowersById**](UsersApi.md#getFollowersById) | **GET** /2/users/{id}/followers | Followers by User ID |
| [**getFollowersByListId**](UsersApi.md#getFollowersByListId) | **GET** /2/lists/{id}/followers | Returns User objects that follow a List by the provided List ID |
| [**getFollowingUsers**](UsersApi.md#getFollowingUsers) | **GET** /2/users/{id}/following | Following by User ID |
| [**getMembersByListId**](UsersApi.md#getMembersByListId) | **GET** /2/lists/{id}/members | Returns User objects that are members of a List by the provided List ID. |
| [**getMutedUsersById**](UsersApi.md#getMutedUsersById) | **GET** /2/users/{id}/muting | Returns User objects that are muted by the provided User ID |
| [**getRetweetedByTweetIdUsers**](UsersApi.md#getRetweetedByTweetIdUsers) | **GET** /2/tweets/{id}/retweeted_by | Returns User objects that have retweeted the provided Tweet ID |
| [**listLikingUsers**](UsersApi.md#listLikingUsers) | **GET** /2/tweets/{id}/liking_users | Returns User objects that have liked the provided Tweet ID |
| [**lookupById**](UsersApi.md#lookupById) | **GET** /2/users/{id} | User lookup by ID |
| [**lookupByIds**](UsersApi.md#lookupByIds) | **GET** /2/users | User lookup by IDs |
| [**lookupByUsername**](UsersApi.md#lookupByUsername) | **GET** /2/users/by/username/{username} | User lookup by username |
| [**lookupByUsernames**](UsersApi.md#lookupByUsernames) | **GET** /2/users/by | User lookup by usernames |
| [**lookupMe**](UsersApi.md#lookupMe) | **GET** /2/users/me | User lookup me |
| [**muteUserById**](UsersApi.md#muteUserById) | **POST** /2/users/{id}/muting | Mute User by User ID. |
| [**unblockUserById**](UsersApi.md#unblockUserById) | **DELETE** /2/users/{source_user_id}/blocking/{target_user_id} | Unblock User by User ID |
| [**unfollowUser**](UsersApi.md#unfollowUser) | **DELETE** /2/users/{source_user_id}/following/{target_user_id} | Unfollow User |
| [**unmuteByUserId**](UsersApi.md#unmuteByUserId) | **DELETE** /2/users/{source_user_id}/muting/{target_user_id} | Unmute User by User ID |


<a name="blockUserById"></a>
# **blockUserById**
> BlockUserMutationResponse blockUserById(id, blockUserRequest).execute();

Block User by User ID

Causes the User (in the path) to block the target User. The User (in the path) must match the User context authorizing the request

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String targetUserId = "targetUserId_example"; // Unique identifier of this User. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.
    String id = "id_example"; // The ID of the authenticated source User that is requesting to block the target User.
    try {
      BlockUserMutationResponse result = client
              .users
              .blockUserById(targetUserId, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#blockUserById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BlockUserMutationResponse> response = client
              .users
              .blockUserById(targetUserId, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#blockUserById");
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
| **id** | **String**| The ID of the authenticated source User that is requesting to block the target User. | |
| **blockUserRequest** | [**BlockUserRequest**](BlockUserRequest.md)|  | |

### Return type

[**BlockUserMutationResponse**](BlockUserMutationResponse.md)

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

<a name="followUser"></a>
# **followUser**
> UsersFollowingCreateResponse followUser(id).usersFollowingCreateRequest(usersFollowingCreateRequest).execute();

Follow User

Causes the User(in the path) to follow, or “request to follow” for protected Users, the target User. The User(in the path) must match the User context authorizing the request

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String targetUserId = "targetUserId_example"; // Unique identifier of this User. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.
    String id = "id_example"; // The ID of the authenticated source User that is requesting to follow the target User.
    try {
      UsersFollowingCreateResponse result = client
              .users
              .followUser(targetUserId, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#followUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersFollowingCreateResponse> response = client
              .users
              .followUser(targetUserId, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#followUser");
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
| **id** | **String**| The ID of the authenticated source User that is requesting to follow the target User. | |
| **usersFollowingCreateRequest** | [**UsersFollowingCreateRequest**](UsersFollowingCreateRequest.md)|  | [optional] |

### Return type

[**UsersFollowingCreateResponse**](UsersFollowingCreateResponse.md)

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

<a name="getBlockedUsers"></a>
# **getBlockedUsers**
> Get2UsersIdBlockingResponse getBlockedUsers(id).maxResults(maxResults).paginationToken(paginationToken).userFields(userFields).expansions(expansions).tweetFields(tweetFields).execute();

Returns User objects that are blocked by provided User ID

Returns a list of Users that are blocked by the provided User ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String paginationToken = "paginationToken_example"; // This parameter is used to get a specified 'page' of results.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    try {
      Get2UsersIdBlockingResponse result = client
              .users
              .getBlockedUsers(id)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
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
      System.err.println("Exception when calling UsersApi#getBlockedUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2UsersIdBlockingResponse> response = client
              .users
              .getBlockedUsers(id)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
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
      System.err.println("Exception when calling UsersApi#getBlockedUsers");
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
| **paginationToken** | **String**| This parameter is used to get a specified &#39;page&#39; of results. | [optional] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2UsersIdBlockingResponse**](Get2UsersIdBlockingResponse.md)

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

<a name="getFollowersById"></a>
# **getFollowersById**
> Get2UsersIdFollowersResponse getFollowersById(id).maxResults(maxResults).paginationToken(paginationToken).userFields(userFields).expansions(expansions).tweetFields(tweetFields).execute();

Followers by User ID

Returns a list of Users who are followers of the specified User ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String paginationToken = "paginationToken_example"; // This parameter is used to get a specified 'page' of results.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    try {
      Get2UsersIdFollowersResponse result = client
              .users
              .getFollowersById(id)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
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
      System.err.println("Exception when calling UsersApi#getFollowersById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2UsersIdFollowersResponse> response = client
              .users
              .getFollowersById(id)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
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
      System.err.println("Exception when calling UsersApi#getFollowersById");
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
| **paginationToken** | **String**| This parameter is used to get a specified &#39;page&#39; of results. | [optional] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2UsersIdFollowersResponse**](Get2UsersIdFollowersResponse.md)

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

<a name="getFollowersByListId"></a>
# **getFollowersByListId**
> Get2ListsIdFollowersResponse getFollowersByListId(id).maxResults(maxResults).paginationToken(paginationToken).userFields(userFields).expansions(expansions).tweetFields(tweetFields).execute();

Returns User objects that follow a List by the provided List ID

Returns a list of Users that follow a List by the provided List ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String paginationToken = "paginationToken_example"; // This parameter is used to get a specified 'page' of results.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    try {
      Get2ListsIdFollowersResponse result = client
              .users
              .getFollowersByListId(id)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
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
      System.err.println("Exception when calling UsersApi#getFollowersByListId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2ListsIdFollowersResponse> response = client
              .users
              .getFollowersByListId(id)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
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
      System.err.println("Exception when calling UsersApi#getFollowersByListId");
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
| **paginationToken** | **String**| This parameter is used to get a specified &#39;page&#39; of results. | [optional] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2ListsIdFollowersResponse**](Get2ListsIdFollowersResponse.md)

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

<a name="getFollowingUsers"></a>
# **getFollowingUsers**
> Get2UsersIdFollowingResponse getFollowingUsers(id).maxResults(maxResults).paginationToken(paginationToken).userFields(userFields).expansions(expansions).tweetFields(tweetFields).execute();

Following by User ID

Returns a list of Users that are being followed by the provided User ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String paginationToken = "paginationToken_example"; // This parameter is used to get a specified 'page' of results.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    try {
      Get2UsersIdFollowingResponse result = client
              .users
              .getFollowingUsers(id)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
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
      System.err.println("Exception when calling UsersApi#getFollowingUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2UsersIdFollowingResponse> response = client
              .users
              .getFollowingUsers(id)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
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
      System.err.println("Exception when calling UsersApi#getFollowingUsers");
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
| **paginationToken** | **String**| This parameter is used to get a specified &#39;page&#39; of results. | [optional] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2UsersIdFollowingResponse**](Get2UsersIdFollowingResponse.md)

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

<a name="getMembersByListId"></a>
# **getMembersByListId**
> Get2ListsIdMembersResponse getMembersByListId(id).maxResults(maxResults).paginationToken(paginationToken).userFields(userFields).expansions(expansions).tweetFields(tweetFields).execute();

Returns User objects that are members of a List by the provided List ID.

Returns a list of Users that are members of a List by the provided List ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String paginationToken = "paginationToken_example"; // This parameter is used to get a specified 'page' of results.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    try {
      Get2ListsIdMembersResponse result = client
              .users
              .getMembersByListId(id)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
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
      System.err.println("Exception when calling UsersApi#getMembersByListId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2ListsIdMembersResponse> response = client
              .users
              .getMembersByListId(id)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
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
      System.err.println("Exception when calling UsersApi#getMembersByListId");
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
| **paginationToken** | **String**| This parameter is used to get a specified &#39;page&#39; of results. | [optional] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2ListsIdMembersResponse**](Get2ListsIdMembersResponse.md)

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

<a name="getMutedUsersById"></a>
# **getMutedUsersById**
> Get2UsersIdMutingResponse getMutedUsersById(id).maxResults(maxResults).paginationToken(paginationToken).userFields(userFields).expansions(expansions).tweetFields(tweetFields).execute();

Returns User objects that are muted by the provided User ID

Returns a list of Users that are muted by the provided User ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    Integer maxResults = 100; // The maximum number of results.
    String paginationToken = "paginationToken_example"; // This parameter is used to get the next 'page' of results.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    try {
      Get2UsersIdMutingResponse result = client
              .users
              .getMutedUsersById(id)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
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
      System.err.println("Exception when calling UsersApi#getMutedUsersById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2UsersIdMutingResponse> response = client
              .users
              .getMutedUsersById(id)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
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
      System.err.println("Exception when calling UsersApi#getMutedUsersById");
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
| **maxResults** | **Integer**| The maximum number of results. | [optional] [default to 100] |
| **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. | [optional] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2UsersIdMutingResponse**](Get2UsersIdMutingResponse.md)

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

<a name="getRetweetedByTweetIdUsers"></a>
# **getRetweetedByTweetIdUsers**
> Get2TweetsIdRetweetedByResponse getRetweetedByTweetIdUsers(id).maxResults(maxResults).paginationToken(paginationToken).userFields(userFields).expansions(expansions).tweetFields(tweetFields).execute();

Returns User objects that have retweeted the provided Tweet ID

Returns a list of Users that have retweeted the provided Tweet ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    Integer maxResults = 100; // The maximum number of results.
    String paginationToken = "paginationToken_example"; // This parameter is used to get the next 'page' of results.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    try {
      Get2TweetsIdRetweetedByResponse result = client
              .users
              .getRetweetedByTweetIdUsers(id)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
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
      System.err.println("Exception when calling UsersApi#getRetweetedByTweetIdUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2TweetsIdRetweetedByResponse> response = client
              .users
              .getRetweetedByTweetIdUsers(id)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
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
      System.err.println("Exception when calling UsersApi#getRetweetedByTweetIdUsers");
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
| **maxResults** | **Integer**| The maximum number of results. | [optional] [default to 100] |
| **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. | [optional] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2TweetsIdRetweetedByResponse**](Get2TweetsIdRetweetedByResponse.md)

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

<a name="listLikingUsers"></a>
# **listLikingUsers**
> Get2TweetsIdLikingUsersResponse listLikingUsers(id).maxResults(maxResults).paginationToken(paginationToken).userFields(userFields).expansions(expansions).tweetFields(tweetFields).execute();

Returns User objects that have liked the provided Tweet ID

Returns a list of Users that have liked the provided Tweet ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    Integer maxResults = 100; // The maximum number of results.
    String paginationToken = "paginationToken_example"; // This parameter is used to get the next 'page' of results.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    try {
      Get2TweetsIdLikingUsersResponse result = client
              .users
              .listLikingUsers(id)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
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
      System.err.println("Exception when calling UsersApi#listLikingUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2TweetsIdLikingUsersResponse> response = client
              .users
              .listLikingUsers(id)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
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
      System.err.println("Exception when calling UsersApi#listLikingUsers");
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
| **maxResults** | **Integer**| The maximum number of results. | [optional] [default to 100] |
| **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. | [optional] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2TweetsIdLikingUsersResponse**](Get2TweetsIdLikingUsersResponse.md)

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
> Get2UsersIdResponse lookupById(id).userFields(userFields).expansions(expansions).tweetFields(tweetFields).execute();

User lookup by ID

This endpoint returns information about a User. Specify User by ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    try {
      Get2UsersIdResponse result = client
              .users
              .lookupById(id)
              .userFields(userFields)
              .expansions(expansions)
              .tweetFields(tweetFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getIncludes());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#lookupById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2UsersIdResponse> response = client
              .users
              .lookupById(id)
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
      System.err.println("Exception when calling UsersApi#lookupById");
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
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2UsersIdResponse**](Get2UsersIdResponse.md)

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

<a name="lookupByIds"></a>
# **lookupByIds**
> Get2UsersResponse lookupByIds(ids).userFields(userFields).expansions(expansions).tweetFields(tweetFields).execute();

User lookup by IDs

This endpoint returns information about Users. Specify Users by their ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    List<String> ids = Arrays.asList(); // A list of User IDs, comma-separated. You can specify up to 100 IDs.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    try {
      Get2UsersResponse result = client
              .users
              .lookupByIds(ids)
              .userFields(userFields)
              .expansions(expansions)
              .tweetFields(tweetFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getIncludes());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#lookupByIds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2UsersResponse> response = client
              .users
              .lookupByIds(ids)
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
      System.err.println("Exception when calling UsersApi#lookupByIds");
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
| **ids** | [**List&lt;String&gt;**](String.md)| A list of User IDs, comma-separated. You can specify up to 100 IDs. | |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2UsersResponse**](Get2UsersResponse.md)

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

<a name="lookupByUsername"></a>
# **lookupByUsername**
> Get2UsersByUsernameUsernameResponse lookupByUsername(username).userFields(userFields).expansions(expansions).tweetFields(tweetFields).execute();

User lookup by username

This endpoint returns information about a User. Specify User by username.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String username = "TwitterDev"; // A username.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    try {
      Get2UsersByUsernameUsernameResponse result = client
              .users
              .lookupByUsername(username)
              .userFields(userFields)
              .expansions(expansions)
              .tweetFields(tweetFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getIncludes());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#lookupByUsername");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2UsersByUsernameUsernameResponse> response = client
              .users
              .lookupByUsername(username)
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
      System.err.println("Exception when calling UsersApi#lookupByUsername");
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
| **username** | **String**| A username. | |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2UsersByUsernameUsernameResponse**](Get2UsersByUsernameUsernameResponse.md)

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

<a name="lookupByUsernames"></a>
# **lookupByUsernames**
> Get2UsersByResponse lookupByUsernames(usernames).userFields(userFields).expansions(expansions).tweetFields(tweetFields).execute();

User lookup by usernames

This endpoint returns information about Users. Specify Users by their username.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    List<String> usernames = Arrays.asList(); // A list of usernames, comma-separated.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    try {
      Get2UsersByResponse result = client
              .users
              .lookupByUsernames(usernames)
              .userFields(userFields)
              .expansions(expansions)
              .tweetFields(tweetFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getIncludes());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#lookupByUsernames");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2UsersByResponse> response = client
              .users
              .lookupByUsernames(usernames)
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
      System.err.println("Exception when calling UsersApi#lookupByUsernames");
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
| **usernames** | [**List&lt;String&gt;**](String.md)| A list of usernames, comma-separated. | |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2UsersByResponse**](Get2UsersByResponse.md)

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

<a name="lookupMe"></a>
# **lookupMe**
> Get2UsersMeResponse lookupMe().userFields(userFields).expansions(expansions).tweetFields(tweetFields).execute();

User lookup me

This endpoint returns information about the requesting User.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // A comma separated list of Tweet fields to display.
    try {
      Get2UsersMeResponse result = client
              .users
              .lookupMe()
              .userFields(userFields)
              .expansions(expansions)
              .tweetFields(tweetFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getIncludes());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#lookupMe");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2UsersMeResponse> response = client
              .users
              .lookupMe()
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
      System.err.println("Exception when calling UsersApi#lookupMe");
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
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2UsersMeResponse**](Get2UsersMeResponse.md)

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

<a name="muteUserById"></a>
# **muteUserById**
> MuteUserMutationResponse muteUserById(id).muteUserRequest(muteUserRequest).execute();

Mute User by User ID.

Causes the User (in the path) to mute the target User. The User (in the path) must match the User context authorizing the request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String targetUserId = "targetUserId_example"; // Unique identifier of this User. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.
    String id = "id_example"; // The ID of the authenticated source User that is requesting to mute the target User.
    try {
      MuteUserMutationResponse result = client
              .users
              .muteUserById(targetUserId, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#muteUserById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MuteUserMutationResponse> response = client
              .users
              .muteUserById(targetUserId, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#muteUserById");
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
| **id** | **String**| The ID of the authenticated source User that is requesting to mute the target User. | |
| **muteUserRequest** | [**MuteUserRequest**](MuteUserRequest.md)|  | [optional] |

### Return type

[**MuteUserMutationResponse**](MuteUserMutationResponse.md)

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

<a name="unblockUserById"></a>
# **unblockUserById**
> BlockUserMutationResponse unblockUserById(sourceUserId, targetUserId).execute();

Unblock User by User ID

Causes the source User to unblock the target User. The source User must match the User context authorizing the request

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String sourceUserId = "sourceUserId_example"; // The ID of the authenticated source User that is requesting to unblock the target User.
    String targetUserId = "targetUserId_example"; // The ID of the User that the source User is requesting to unblock.
    try {
      BlockUserMutationResponse result = client
              .users
              .unblockUserById(sourceUserId, targetUserId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#unblockUserById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BlockUserMutationResponse> response = client
              .users
              .unblockUserById(sourceUserId, targetUserId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#unblockUserById");
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
| **sourceUserId** | **String**| The ID of the authenticated source User that is requesting to unblock the target User. | |
| **targetUserId** | **String**| The ID of the User that the source User is requesting to unblock. | |

### Return type

[**BlockUserMutationResponse**](BlockUserMutationResponse.md)

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

<a name="unfollowUser"></a>
# **unfollowUser**
> UsersFollowingDeleteResponse unfollowUser(sourceUserId, targetUserId).execute();

Unfollow User

Causes the source User to unfollow the target User. The source User must match the User context authorizing the request

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String sourceUserId = "sourceUserId_example"; // The ID of the authenticated source User that is requesting to unfollow the target User.
    String targetUserId = "targetUserId_example"; // The ID of the User that the source User is requesting to unfollow.
    try {
      UsersFollowingDeleteResponse result = client
              .users
              .unfollowUser(sourceUserId, targetUserId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#unfollowUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersFollowingDeleteResponse> response = client
              .users
              .unfollowUser(sourceUserId, targetUserId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#unfollowUser");
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
| **sourceUserId** | **String**| The ID of the authenticated source User that is requesting to unfollow the target User. | |
| **targetUserId** | **String**| The ID of the User that the source User is requesting to unfollow. | |

### Return type

[**UsersFollowingDeleteResponse**](UsersFollowingDeleteResponse.md)

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

<a name="unmuteByUserId"></a>
# **unmuteByUserId**
> MuteUserMutationResponse unmuteByUserId(sourceUserId, targetUserId).execute();

Unmute User by User ID

Causes the source User to unmute the target User. The source User must match the User context authorizing the request

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String sourceUserId = "sourceUserId_example"; // The ID of the authenticated source User that is requesting to unmute the target User.
    String targetUserId = "targetUserId_example"; // The ID of the User that the source User is requesting to unmute.
    try {
      MuteUserMutationResponse result = client
              .users
              .unmuteByUserId(sourceUserId, targetUserId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#unmuteByUserId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MuteUserMutationResponse> response = client
              .users
              .unmuteByUserId(sourceUserId, targetUserId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#unmuteByUserId");
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
| **sourceUserId** | **String**| The ID of the authenticated source User that is requesting to unmute the target User. | |
| **targetUserId** | **String**| The ID of the User that the source User is requesting to unmute. | |

### Return type

[**MuteUserMutationResponse**](MuteUserMutationResponse.md)

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

