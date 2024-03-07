# ListsApi

All URIs are relative to *https://api.twitter.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addMember**](ListsApi.md#addMember) | **POST** /2/lists/{id}/members | Add a List member |
| [**createNewList**](ListsApi.md#createNewList) | **POST** /2/lists | Create List |
| [**deleteOwnedList**](ListsApi.md#deleteOwnedList) | **DELETE** /2/lists/{id} | Delete List |
| [**followList**](ListsApi.md#followList) | **POST** /2/users/{id}/followed_lists | Follow a List |
| [**getFollowed**](ListsApi.md#getFollowed) | **GET** /2/users/{id}/followed_lists | Get User&#39;s Followed Lists |
| [**getUserMemberships**](ListsApi.md#getUserMemberships) | **GET** /2/users/{id}/list_memberships | Get a User&#39;s List Memberships |
| [**getUserOwnedLists**](ListsApi.md#getUserOwnedLists) | **GET** /2/users/{id}/owned_lists | Get a User&#39;s Owned Lists. |
| [**getUserPinnedLists**](ListsApi.md#getUserPinnedLists) | **GET** /2/users/{id}/pinned_lists | Get a User&#39;s Pinned Lists |
| [**lookupByListId**](ListsApi.md#lookupByListId) | **GET** /2/lists/{id} | List lookup by List ID. |
| [**pinList**](ListsApi.md#pinList) | **POST** /2/users/{id}/pinned_lists | Pin a List |
| [**removeMember**](ListsApi.md#removeMember) | **DELETE** /2/lists/{id}/members/{user_id} | Remove a List member |
| [**unfollowList**](ListsApi.md#unfollowList) | **DELETE** /2/users/{id}/followed_lists/{list_id} | Unfollow a List |
| [**unpinList**](ListsApi.md#unpinList) | **DELETE** /2/users/{id}/pinned_lists/{list_id} | Unpin a List |
| [**updateOwnedList**](ListsApi.md#updateOwnedList) | **PUT** /2/lists/{id} | Update List. |


<a name="addMember"></a>
# **addMember**
> ListMutateResponse addMember(id).listAddUserRequest(listAddUserRequest).execute();

Add a List member

Causes a User to become a member of a List.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String userId = "userId_example"; // Unique identifier of this User. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.
    String id = "id_example"; // The ID of the List for which to add a member.
    try {
      ListMutateResponse result = client
              .lists
              .addMember(userId, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#addMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListMutateResponse> response = client
              .lists
              .addMember(userId, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#addMember");
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
| **id** | **String**| The ID of the List for which to add a member. | |
| **listAddUserRequest** | [**ListAddUserRequest**](ListAddUserRequest.md)|  | [optional] |

### Return type

[**ListMutateResponse**](ListMutateResponse.md)

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

<a name="createNewList"></a>
# **createNewList**
> ListCreateResponse createNewList().listCreateRequest(listCreateRequest).execute();

Create List

Creates a new List.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String name = "name_example";
    String description = "description_example";
    Boolean _private = false;
    try {
      ListCreateResponse result = client
              .lists
              .createNewList(name)
              .description(description)
              ._private(_private)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#createNewList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListCreateResponse> response = client
              .lists
              .createNewList(name)
              .description(description)
              ._private(_private)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#createNewList");
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
| **listCreateRequest** | [**ListCreateRequest**](ListCreateRequest.md)|  | [optional] |

### Return type

[**ListCreateResponse**](ListCreateResponse.md)

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

<a name="deleteOwnedList"></a>
# **deleteOwnedList**
> ListDeleteResponse deleteOwnedList(id).execute();

Delete List

Delete a List that you own.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String id = "id_example"; // The ID of the List to delete.
    try {
      ListDeleteResponse result = client
              .lists
              .deleteOwnedList(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#deleteOwnedList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListDeleteResponse> response = client
              .lists
              .deleteOwnedList(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#deleteOwnedList");
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
| **id** | **String**| The ID of the List to delete. | |

### Return type

[**ListDeleteResponse**](ListDeleteResponse.md)

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

<a name="followList"></a>
# **followList**
> ListFollowedResponse followList(id).listFollowedRequest(listFollowedRequest).execute();

Follow a List

Causes a User to follow a List.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String listId = "listId_example"; // The unique identifier of this List.
    String id = "id_example"; // The ID of the authenticated source User that will follow the List.
    try {
      ListFollowedResponse result = client
              .lists
              .followList(listId, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#followList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListFollowedResponse> response = client
              .lists
              .followList(listId, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#followList");
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
| **id** | **String**| The ID of the authenticated source User that will follow the List. | |
| **listFollowedRequest** | [**ListFollowedRequest**](ListFollowedRequest.md)|  | [optional] |

### Return type

[**ListFollowedResponse**](ListFollowedResponse.md)

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

<a name="getFollowed"></a>
# **getFollowed**
> Get2UsersIdFollowedListsResponse getFollowed(id).maxResults(maxResults).paginationToken(paginationToken).listFields(listFields).expansions(expansions).userFields(userFields).execute();

Get User&#39;s Followed Lists

Returns a User&#39;s followed Lists.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    Integer maxResults = 100; // The maximum number of results.
    String paginationToken = "paginationToken_example"; // This parameter is used to get a specified 'page' of results.
    Set<String> listFields = Arrays.asList(); // A comma separated list of List fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    try {
      Get2UsersIdFollowedListsResponse result = client
              .lists
              .getFollowed(id)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
              .listFields(listFields)
              .expansions(expansions)
              .userFields(userFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getIncludes());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getFollowed");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2UsersIdFollowedListsResponse> response = client
              .lists
              .getFollowed(id)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
              .listFields(listFields)
              .expansions(expansions)
              .userFields(userFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getFollowed");
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
| **maxResults** | **Integer**| The maximum number of results. | [optional] [default to 100] |
| **paginationToken** | **String**| This parameter is used to get a specified &#39;page&#39; of results. | [optional] |
| **listFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of List fields to display. | [optional] [enum: created_at, description, follower_count, id, member_count, name, owner_id, private] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: owner_id] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |

### Return type

[**Get2UsersIdFollowedListsResponse**](Get2UsersIdFollowedListsResponse.md)

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

<a name="getUserMemberships"></a>
# **getUserMemberships**
> Get2UsersIdListMembershipsResponse getUserMemberships(id).maxResults(maxResults).paginationToken(paginationToken).listFields(listFields).expansions(expansions).userFields(userFields).execute();

Get a User&#39;s List Memberships

Get a User&#39;s List Memberships.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    Integer maxResults = 100; // The maximum number of results.
    String paginationToken = "paginationToken_example"; // This parameter is used to get a specified 'page' of results.
    Set<String> listFields = Arrays.asList(); // A comma separated list of List fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    try {
      Get2UsersIdListMembershipsResponse result = client
              .lists
              .getUserMemberships(id)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
              .listFields(listFields)
              .expansions(expansions)
              .userFields(userFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getIncludes());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getUserMemberships");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2UsersIdListMembershipsResponse> response = client
              .lists
              .getUserMemberships(id)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
              .listFields(listFields)
              .expansions(expansions)
              .userFields(userFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getUserMemberships");
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
| **maxResults** | **Integer**| The maximum number of results. | [optional] [default to 100] |
| **paginationToken** | **String**| This parameter is used to get a specified &#39;page&#39; of results. | [optional] |
| **listFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of List fields to display. | [optional] [enum: created_at, description, follower_count, id, member_count, name, owner_id, private] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: owner_id] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |

### Return type

[**Get2UsersIdListMembershipsResponse**](Get2UsersIdListMembershipsResponse.md)

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

<a name="getUserOwnedLists"></a>
# **getUserOwnedLists**
> Get2UsersIdOwnedListsResponse getUserOwnedLists(id).maxResults(maxResults).paginationToken(paginationToken).listFields(listFields).expansions(expansions).userFields(userFields).execute();

Get a User&#39;s Owned Lists.

Get a User&#39;s Owned Lists.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    Integer maxResults = 100; // The maximum number of results.
    String paginationToken = "paginationToken_example"; // This parameter is used to get a specified 'page' of results.
    Set<String> listFields = Arrays.asList(); // A comma separated list of List fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    try {
      Get2UsersIdOwnedListsResponse result = client
              .lists
              .getUserOwnedLists(id)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
              .listFields(listFields)
              .expansions(expansions)
              .userFields(userFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getIncludes());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getUserOwnedLists");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2UsersIdOwnedListsResponse> response = client
              .lists
              .getUserOwnedLists(id)
              .maxResults(maxResults)
              .paginationToken(paginationToken)
              .listFields(listFields)
              .expansions(expansions)
              .userFields(userFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getUserOwnedLists");
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
| **maxResults** | **Integer**| The maximum number of results. | [optional] [default to 100] |
| **paginationToken** | **String**| This parameter is used to get a specified &#39;page&#39; of results. | [optional] |
| **listFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of List fields to display. | [optional] [enum: created_at, description, follower_count, id, member_count, name, owner_id, private] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: owner_id] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |

### Return type

[**Get2UsersIdOwnedListsResponse**](Get2UsersIdOwnedListsResponse.md)

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

<a name="getUserPinnedLists"></a>
# **getUserPinnedLists**
> Get2UsersIdPinnedListsResponse getUserPinnedLists(id).listFields(listFields).expansions(expansions).userFields(userFields).execute();

Get a User&#39;s Pinned Lists

Get a User&#39;s Pinned Lists.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    Set<String> listFields = Arrays.asList(); // A comma separated list of List fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    try {
      Get2UsersIdPinnedListsResponse result = client
              .lists
              .getUserPinnedLists(id)
              .listFields(listFields)
              .expansions(expansions)
              .userFields(userFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getIncludes());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getUserPinnedLists");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2UsersIdPinnedListsResponse> response = client
              .lists
              .getUserPinnedLists(id)
              .listFields(listFields)
              .expansions(expansions)
              .userFields(userFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getUserPinnedLists");
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
| **listFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of List fields to display. | [optional] [enum: created_at, description, follower_count, id, member_count, name, owner_id, private] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: owner_id] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |

### Return type

[**Get2UsersIdPinnedListsResponse**](Get2UsersIdPinnedListsResponse.md)

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

<a name="lookupByListId"></a>
# **lookupByListId**
> Get2ListsIdResponse lookupByListId(id).listFields(listFields).expansions(expansions).userFields(userFields).execute();

List lookup by List ID.

Returns a List.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    Set<String> listFields = Arrays.asList(); // A comma separated list of List fields to display.
    Set<String> expansions = Arrays.asList(); // A comma separated list of fields to expand.
    Set<String> userFields = Arrays.asList(); // A comma separated list of User fields to display.
    try {
      Get2ListsIdResponse result = client
              .lists
              .lookupByListId(id)
              .listFields(listFields)
              .expansions(expansions)
              .userFields(userFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getIncludes());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#lookupByListId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2ListsIdResponse> response = client
              .lists
              .lookupByListId(id)
              .listFields(listFields)
              .expansions(expansions)
              .userFields(userFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#lookupByListId");
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
| **listFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of List fields to display. | [optional] [enum: created_at, description, follower_count, id, member_count, name, owner_id, private] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: owner_id] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, verified_type, withheld] |

### Return type

[**Get2ListsIdResponse**](Get2ListsIdResponse.md)

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

<a name="pinList"></a>
# **pinList**
> ListPinnedResponse pinList(id, listPinnedRequest).execute();

Pin a List

Causes a User to pin a List.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String listId = "listId_example"; // The unique identifier of this List.
    String id = "id_example"; // The ID of the authenticated source User that will pin the List.
    try {
      ListPinnedResponse result = client
              .lists
              .pinList(listId, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#pinList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListPinnedResponse> response = client
              .lists
              .pinList(listId, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#pinList");
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
| **id** | **String**| The ID of the authenticated source User that will pin the List. | |
| **listPinnedRequest** | [**ListPinnedRequest**](ListPinnedRequest.md)|  | |

### Return type

[**ListPinnedResponse**](ListPinnedResponse.md)

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

<a name="removeMember"></a>
# **removeMember**
> ListMutateResponse removeMember(id, userId).execute();

Remove a List member

Causes a User to be removed from the members of a List.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String id = "id_example"; // The ID of the List to remove a member.
    String userId = "userId_example"; // The ID of User that will be removed from the List.
    try {
      ListMutateResponse result = client
              .lists
              .removeMember(id, userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#removeMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListMutateResponse> response = client
              .lists
              .removeMember(id, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#removeMember");
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
| **id** | **String**| The ID of the List to remove a member. | |
| **userId** | **String**| The ID of User that will be removed from the List. | |

### Return type

[**ListMutateResponse**](ListMutateResponse.md)

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

<a name="unfollowList"></a>
# **unfollowList**
> ListFollowedResponse unfollowList(id, listId).execute();

Unfollow a List

Causes a User to unfollow a List.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String id = "id_example"; // The ID of the authenticated source User that will unfollow the List.
    String listId = "listId_example"; // The ID of the List to unfollow.
    try {
      ListFollowedResponse result = client
              .lists
              .unfollowList(id, listId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#unfollowList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListFollowedResponse> response = client
              .lists
              .unfollowList(id, listId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#unfollowList");
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
| **id** | **String**| The ID of the authenticated source User that will unfollow the List. | |
| **listId** | **String**| The ID of the List to unfollow. | |

### Return type

[**ListFollowedResponse**](ListFollowedResponse.md)

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

<a name="unpinList"></a>
# **unpinList**
> ListUnpinResponse unpinList(id, listId).execute();

Unpin a List

Causes a User to remove a pinned List.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String listId = "listId_example"; // The ID of the List to unpin.
    try {
      ListUnpinResponse result = client
              .lists
              .unpinList(id, listId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#unpinList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListUnpinResponse> response = client
              .lists
              .unpinList(id, listId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#unpinList");
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
| **listId** | **String**| The ID of the List to unpin. | |

### Return type

[**ListUnpinResponse**](ListUnpinResponse.md)

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

<a name="updateOwnedList"></a>
# **updateOwnedList**
> ListUpdateResponse updateOwnedList(id).listUpdateRequest(listUpdateRequest).execute();

Update List.

Update a List that you own.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String id = "id_example"; // The ID of the List to modify.
    String description = "description_example";
    String name = "name_example";
    Boolean _private = true;
    try {
      ListUpdateResponse result = client
              .lists
              .updateOwnedList(id)
              .description(description)
              .name(name)
              ._private(_private)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#updateOwnedList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListUpdateResponse> response = client
              .lists
              .updateOwnedList(id)
              .description(description)
              .name(name)
              ._private(_private)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#updateOwnedList");
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
| **id** | **String**| The ID of the List to modify. | |
| **listUpdateRequest** | [**ListUpdateRequest**](ListUpdateRequest.md)|  | [optional] |

### Return type

[**ListUpdateResponse**](ListUpdateResponse.md)

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

