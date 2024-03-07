<div align="center">

[![Visit X](./header.png)](https://developer.x.com)

# [X](https://developer.x.com)

Twitter API v2 available endpoints

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=X&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>x-java-sdk</artifactId>
  <version>2.62</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:x-java-sdk:2.62"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/x-java-sdk-2.62.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api.twitter.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BookmarksApi* | [**addTweet**](docs/BookmarksApi.md#addTweet) | **POST** /2/users/{id}/bookmarks | Add Tweet to Bookmarks
*BookmarksApi* | [**getUserBookmarks**](docs/BookmarksApi.md#getUserBookmarks) | **GET** /2/users/{id}/bookmarks | Bookmarks by User
*BookmarksApi* | [**removeTweet**](docs/BookmarksApi.md#removeTweet) | **DELETE** /2/users/{id}/bookmarks/{tweet_id} | Remove a bookmarked Tweet
*ComplianceApi* | [**createJob**](docs/ComplianceApi.md#createJob) | **POST** /2/compliance/jobs | Create compliance job
*ComplianceApi* | [**getJobById**](docs/ComplianceApi.md#getJobById) | **GET** /2/compliance/jobs/{id} | Get Compliance Job
*ComplianceApi* | [**listJobs**](docs/ComplianceApi.md#listJobs) | **GET** /2/compliance/jobs | List Compliance Jobs
*ComplianceApi* | [**streamData**](docs/ComplianceApi.md#streamData) | **GET** /2/tweets/compliance/stream | Tweets Compliance stream
*ComplianceApi* | [**streamTweetsLabelEvents**](docs/ComplianceApi.md#streamTweetsLabelEvents) | **GET** /2/tweets/label/stream | Tweets Label stream
*ComplianceApi* | [**streamUsersData**](docs/ComplianceApi.md#streamUsersData) | **GET** /2/users/compliance/stream | Users Compliance stream
*DirectMessagesApi* | [**createNewDmConversation**](docs/DirectMessagesApi.md#createNewDmConversation) | **POST** /2/dm_conversations | Create a new DM Conversation
*DirectMessagesApi* | [**getDmEvents**](docs/DirectMessagesApi.md#getDmEvents) | **GET** /2/dm_conversations/with/{participant_id}/dm_events | Get DM Events for a DM Conversation
*DirectMessagesApi* | [**getDmEvents_0**](docs/DirectMessagesApi.md#getDmEvents_0) | **GET** /2/dm_conversations/{id}/dm_events | Get DM Events for a DM Conversation
*DirectMessagesApi* | [**getRecentDmEvents**](docs/DirectMessagesApi.md#getRecentDmEvents) | **GET** /2/dm_events | Get recent DM Events
*DirectMessagesApi* | [**sendNewMessageToDmConversation**](docs/DirectMessagesApi.md#sendNewMessageToDmConversation) | **POST** /2/dm_conversations/{dm_conversation_id}/messages | Send a new message to a DM Conversation
*DirectMessagesApi* | [**sendNewMessageToUser**](docs/DirectMessagesApi.md#sendNewMessageToUser) | **POST** /2/dm_conversations/with/{participant_id}/messages | Send a new message to a user
*GeneralApi* | [**getOpenApiSpec**](docs/GeneralApi.md#getOpenApiSpec) | **GET** /2/openapi.json | Returns the OpenAPI Specification document.
*ListsApi* | [**addMember**](docs/ListsApi.md#addMember) | **POST** /2/lists/{id}/members | Add a List member
*ListsApi* | [**createNewList**](docs/ListsApi.md#createNewList) | **POST** /2/lists | Create List
*ListsApi* | [**deleteOwnedList**](docs/ListsApi.md#deleteOwnedList) | **DELETE** /2/lists/{id} | Delete List
*ListsApi* | [**followList**](docs/ListsApi.md#followList) | **POST** /2/users/{id}/followed_lists | Follow a List
*ListsApi* | [**getFollowed**](docs/ListsApi.md#getFollowed) | **GET** /2/users/{id}/followed_lists | Get User&#39;s Followed Lists
*ListsApi* | [**getUserMemberships**](docs/ListsApi.md#getUserMemberships) | **GET** /2/users/{id}/list_memberships | Get a User&#39;s List Memberships
*ListsApi* | [**getUserOwnedLists**](docs/ListsApi.md#getUserOwnedLists) | **GET** /2/users/{id}/owned_lists | Get a User&#39;s Owned Lists.
*ListsApi* | [**getUserPinnedLists**](docs/ListsApi.md#getUserPinnedLists) | **GET** /2/users/{id}/pinned_lists | Get a User&#39;s Pinned Lists
*ListsApi* | [**lookupByListId**](docs/ListsApi.md#lookupByListId) | **GET** /2/lists/{id} | List lookup by List ID.
*ListsApi* | [**pinList**](docs/ListsApi.md#pinList) | **POST** /2/users/{id}/pinned_lists | Pin a List
*ListsApi* | [**removeMember**](docs/ListsApi.md#removeMember) | **DELETE** /2/lists/{id}/members/{user_id} | Remove a List member
*ListsApi* | [**unfollowList**](docs/ListsApi.md#unfollowList) | **DELETE** /2/users/{id}/followed_lists/{list_id} | Unfollow a List
*ListsApi* | [**unpinList**](docs/ListsApi.md#unpinList) | **DELETE** /2/users/{id}/pinned_lists/{list_id} | Unpin a List
*ListsApi* | [**updateOwnedList**](docs/ListsApi.md#updateOwnedList) | **PUT** /2/lists/{id} | Update List.
*SpacesApi* | [**findMatchingSpaces**](docs/SpacesApi.md#findMatchingSpaces) | **GET** /2/spaces/search | Search for Spaces
*SpacesApi* | [**getBuyersList**](docs/SpacesApi.md#getBuyersList) | **GET** /2/spaces/{id}/buyers | Retrieve the list of Users who purchased a ticket to the given space
*SpacesApi* | [**getTweets**](docs/SpacesApi.md#getTweets) | **GET** /2/spaces/{id}/tweets | Retrieve Tweets from a Space.
*SpacesApi* | [**lookupByCreatorIds**](docs/SpacesApi.md#lookupByCreatorIds) | **GET** /2/spaces/by/creator_ids | Space lookup by their creators
*SpacesApi* | [**lookupSpaceById**](docs/SpacesApi.md#lookupSpaceById) | **GET** /2/spaces/{id} | Space lookup by Space ID
*SpacesApi* | [**lookupSpaceIds**](docs/SpacesApi.md#lookupSpaceIds) | **GET** /2/spaces | Space lookup up Space IDs
*TweetsApi* | [**addOrDeleteRules**](docs/TweetsApi.md#addOrDeleteRules) | **POST** /2/tweets/search/stream/rules | Add/Delete rules
*TweetsApi* | [**createTweet**](docs/TweetsApi.md#createTweet) | **POST** /2/tweets | Creation of a Tweet
*TweetsApi* | [**deleteById**](docs/TweetsApi.md#deleteById) | **DELETE** /2/tweets/{id} | Tweet delete by Tweet ID
*TweetsApi* | [**getBuyersList**](docs/TweetsApi.md#getBuyersList) | **GET** /2/spaces/{id}/buyers | Retrieve the list of Users who purchased a ticket to the given space
*TweetsApi* | [**getFilteredStream**](docs/TweetsApi.md#getFilteredStream) | **GET** /2/tweets/search/stream | Filtered stream
*TweetsApi* | [**getFirehoseStream**](docs/TweetsApi.md#getFirehoseStream) | **GET** /2/tweets/firehose/stream | Firehose stream
*TweetsApi* | [**getLikedTweets**](docs/TweetsApi.md#getLikedTweets) | **GET** /2/users/{id}/liked_tweets | Returns Tweet objects liked by the provided User ID
*TweetsApi* | [**getMentionsById**](docs/TweetsApi.md#getMentionsById) | **GET** /2/users/{id}/mentions | User mention timeline by User ID
*TweetsApi* | [**getQuoteTweets**](docs/TweetsApi.md#getQuoteTweets) | **GET** /2/tweets/{id}/quote_tweets | Retrieve Tweets that quote a Tweet.
*TweetsApi* | [**getRecentTweetCounts**](docs/TweetsApi.md#getRecentTweetCounts) | **GET** /2/tweets/counts/recent | Recent search counts
*TweetsApi* | [**getRecentTweets**](docs/TweetsApi.md#getRecentTweets) | **GET** /2/tweets/search/recent | Recent search
*TweetsApi* | [**getTweetCounts**](docs/TweetsApi.md#getTweetCounts) | **GET** /2/tweets/counts/all | Full archive search counts
*TweetsApi* | [**getTweets**](docs/TweetsApi.md#getTweets) | **GET** /2/spaces/{id}/tweets | Retrieve Tweets from a Space.
*TweetsApi* | [**getUserHomeTimeline**](docs/TweetsApi.md#getUserHomeTimeline) | **GET** /2/users/{id}/timelines/reverse_chronological | User home timeline by User ID
*TweetsApi* | [**hideReply**](docs/TweetsApi.md#hideReply) | **PUT** /2/tweets/{tweet_id}/hidden | Hide replies
*TweetsApi* | [**likeTweet**](docs/TweetsApi.md#likeTweet) | **POST** /2/users/{id}/likes | Causes the User (in the path) to like the specified Tweet
*TweetsApi* | [**listByListId**](docs/TweetsApi.md#listByListId) | **GET** /2/lists/{id}/tweets | List Tweets timeline by List ID.
*TweetsApi* | [**listByUserId**](docs/TweetsApi.md#listByUserId) | **GET** /2/users/{id}/tweets | User Tweets timeline by User ID
*TweetsApi* | [**lookupById**](docs/TweetsApi.md#lookupById) | **GET** /2/tweets/{id} | Tweet lookup by Tweet ID
*TweetsApi* | [**lookupByTweetIds**](docs/TweetsApi.md#lookupByTweetIds) | **GET** /2/tweets | Tweet lookup by Tweet IDs
*TweetsApi* | [**retweetTweetById**](docs/TweetsApi.md#retweetTweetById) | **POST** /2/users/{id}/retweets | Causes the User (in the path) to retweet the specified Tweet.
*TweetsApi* | [**searchAll**](docs/TweetsApi.md#searchAll) | **GET** /2/tweets/search/all | Full-archive search
*TweetsApi* | [**searchStreamRules**](docs/TweetsApi.md#searchStreamRules) | **GET** /2/tweets/search/stream/rules | Rules lookup
*TweetsApi* | [**streamSample**](docs/TweetsApi.md#streamSample) | **GET** /2/tweets/sample/stream | Sample stream
*TweetsApi* | [**streamSample10**](docs/TweetsApi.md#streamSample10) | **GET** /2/tweets/sample10/stream | Sample 10% stream
*TweetsApi* | [**unlikeTweetById**](docs/TweetsApi.md#unlikeTweetById) | **DELETE** /2/users/{id}/likes/{tweet_id} | Causes the User (in the path) to unlike the specified Tweet
*TweetsApi* | [**unretweetById**](docs/TweetsApi.md#unretweetById) | **DELETE** /2/users/{id}/retweets/{source_tweet_id} | Causes the User (in the path) to unretweet the specified Tweet
*UsersApi* | [**blockUserById**](docs/UsersApi.md#blockUserById) | **POST** /2/users/{id}/blocking | Block User by User ID
*UsersApi* | [**followUser**](docs/UsersApi.md#followUser) | **POST** /2/users/{id}/following | Follow User
*UsersApi* | [**getBlockedUsers**](docs/UsersApi.md#getBlockedUsers) | **GET** /2/users/{id}/blocking | Returns User objects that are blocked by provided User ID
*UsersApi* | [**getFollowersById**](docs/UsersApi.md#getFollowersById) | **GET** /2/users/{id}/followers | Followers by User ID
*UsersApi* | [**getFollowersByListId**](docs/UsersApi.md#getFollowersByListId) | **GET** /2/lists/{id}/followers | Returns User objects that follow a List by the provided List ID
*UsersApi* | [**getFollowingUsers**](docs/UsersApi.md#getFollowingUsers) | **GET** /2/users/{id}/following | Following by User ID
*UsersApi* | [**getMembersByListId**](docs/UsersApi.md#getMembersByListId) | **GET** /2/lists/{id}/members | Returns User objects that are members of a List by the provided List ID.
*UsersApi* | [**getMutedUsersById**](docs/UsersApi.md#getMutedUsersById) | **GET** /2/users/{id}/muting | Returns User objects that are muted by the provided User ID
*UsersApi* | [**getRetweetedByTweetIdUsers**](docs/UsersApi.md#getRetweetedByTweetIdUsers) | **GET** /2/tweets/{id}/retweeted_by | Returns User objects that have retweeted the provided Tweet ID
*UsersApi* | [**listLikingUsers**](docs/UsersApi.md#listLikingUsers) | **GET** /2/tweets/{id}/liking_users | Returns User objects that have liked the provided Tweet ID
*UsersApi* | [**lookupById**](docs/UsersApi.md#lookupById) | **GET** /2/users/{id} | User lookup by ID
*UsersApi* | [**lookupByIds**](docs/UsersApi.md#lookupByIds) | **GET** /2/users | User lookup by IDs
*UsersApi* | [**lookupByUsername**](docs/UsersApi.md#lookupByUsername) | **GET** /2/users/by/username/{username} | User lookup by username
*UsersApi* | [**lookupByUsernames**](docs/UsersApi.md#lookupByUsernames) | **GET** /2/users/by | User lookup by usernames
*UsersApi* | [**lookupMe**](docs/UsersApi.md#lookupMe) | **GET** /2/users/me | User lookup me
*UsersApi* | [**muteUserById**](docs/UsersApi.md#muteUserById) | **POST** /2/users/{id}/muting | Mute User by User ID.
*UsersApi* | [**unblockUserById**](docs/UsersApi.md#unblockUserById) | **DELETE** /2/users/{source_user_id}/blocking/{target_user_id} | Unblock User by User ID
*UsersApi* | [**unfollowUser**](docs/UsersApi.md#unfollowUser) | **DELETE** /2/users/{source_user_id}/following/{target_user_id} | Unfollow User
*UsersApi* | [**unmuteByUserId**](docs/UsersApi.md#unmuteByUserId) | **DELETE** /2/users/{source_user_id}/muting/{target_user_id} | Unmute User by User ID


## Documentation for Models

 - [AddOrDeleteRulesResponse](docs/AddOrDeleteRulesResponse.md)
 - [AddRulesRequest](docs/AddRulesRequest.md)
 - [AnimatedGif](docs/AnimatedGif.md)
 - [AnimatedGifAllOf](docs/AnimatedGifAllOf.md)
 - [BlockUserMutationResponse](docs/BlockUserMutationResponse.md)
 - [BlockUserMutationResponseData](docs/BlockUserMutationResponseData.md)
 - [BlockUserRequest](docs/BlockUserRequest.md)
 - [BookmarkAddRequest](docs/BookmarkAddRequest.md)
 - [BookmarkMutationResponse](docs/BookmarkMutationResponse.md)
 - [BookmarkMutationResponseData](docs/BookmarkMutationResponseData.md)
 - [CashtagEntity](docs/CashtagEntity.md)
 - [CashtagFields](docs/CashtagFields.md)
 - [ClientForbiddenProblem](docs/ClientForbiddenProblem.md)
 - [ClientForbiddenProblemAllOf](docs/ClientForbiddenProblemAllOf.md)
 - [ComplianceJob](docs/ComplianceJob.md)
 - [ComplianceJobStatus](docs/ComplianceJobStatus.md)
 - [ComplianceJobType](docs/ComplianceJobType.md)
 - [ConnectionExceptionProblem](docs/ConnectionExceptionProblem.md)
 - [ConnectionExceptionProblemAllOf](docs/ConnectionExceptionProblemAllOf.md)
 - [ContextAnnotation](docs/ContextAnnotation.md)
 - [ContextAnnotationDomainFields](docs/ContextAnnotationDomainFields.md)
 - [ContextAnnotationEntityFields](docs/ContextAnnotationEntityFields.md)
 - [CreateAttachmentsMessageRequest](docs/CreateAttachmentsMessageRequest.md)
 - [CreateComplianceJobRequest](docs/CreateComplianceJobRequest.md)
 - [CreateComplianceJobResponse](docs/CreateComplianceJobResponse.md)
 - [CreateDmConversationRequest](docs/CreateDmConversationRequest.md)
 - [CreateDmEventResponse](docs/CreateDmEventResponse.md)
 - [CreateDmEventResponseData](docs/CreateDmEventResponseData.md)
 - [CreateTextMessageRequest](docs/CreateTextMessageRequest.md)
 - [CreateTextMessageRequestAttachmentsInner](docs/CreateTextMessageRequestAttachmentsInner.md)
 - [DeleteRulesRequest](docs/DeleteRulesRequest.md)
 - [DeleteRulesRequestDelete](docs/DeleteRulesRequestDelete.md)
 - [DisallowedResourceProblem](docs/DisallowedResourceProblem.md)
 - [DisallowedResourceProblemAllOf](docs/DisallowedResourceProblemAllOf.md)
 - [DmEvent](docs/DmEvent.md)
 - [DmEventAttachments](docs/DmEventAttachments.md)
 - [DmEventReferencedTweetsInner](docs/DmEventReferencedTweetsInner.md)
 - [DmMediaAttachment](docs/DmMediaAttachment.md)
 - [DuplicateRuleProblem](docs/DuplicateRuleProblem.md)
 - [DuplicateRuleProblemAllOf](docs/DuplicateRuleProblemAllOf.md)
 - [EntityIndicesInclusiveExclusive](docs/EntityIndicesInclusiveExclusive.md)
 - [EntityIndicesInclusiveInclusive](docs/EntityIndicesInclusiveInclusive.md)
 - [Error](docs/Error.md)
 - [Expansions](docs/Expansions.md)
 - [FieldUnauthorizedProblem](docs/FieldUnauthorizedProblem.md)
 - [FieldUnauthorizedProblemAllOf](docs/FieldUnauthorizedProblemAllOf.md)
 - [FilteredStreamingTweetResponse](docs/FilteredStreamingTweetResponse.md)
 - [FilteredStreamingTweetResponseMatchingRulesInner](docs/FilteredStreamingTweetResponseMatchingRulesInner.md)
 - [FullTextEntities](docs/FullTextEntities.md)
 - [FullTextEntitiesAnnotationsInner](docs/FullTextEntitiesAnnotationsInner.md)
 - [FullTextEntitiesAnnotationsInnerAllOf](docs/FullTextEntitiesAnnotationsInnerAllOf.md)
 - [Geo](docs/Geo.md)
 - [Get2ComplianceJobsIdResponse](docs/Get2ComplianceJobsIdResponse.md)
 - [Get2ComplianceJobsResponse](docs/Get2ComplianceJobsResponse.md)
 - [Get2ComplianceJobsResponseMeta](docs/Get2ComplianceJobsResponseMeta.md)
 - [Get2DmConversationsIdDmEventsResponse](docs/Get2DmConversationsIdDmEventsResponse.md)
 - [Get2DmConversationsIdDmEventsResponseMeta](docs/Get2DmConversationsIdDmEventsResponseMeta.md)
 - [Get2DmConversationsWithParticipantIdDmEventsResponse](docs/Get2DmConversationsWithParticipantIdDmEventsResponse.md)
 - [Get2DmEventsResponse](docs/Get2DmEventsResponse.md)
 - [Get2ListsIdFollowersResponse](docs/Get2ListsIdFollowersResponse.md)
 - [Get2ListsIdMembersResponse](docs/Get2ListsIdMembersResponse.md)
 - [Get2ListsIdResponse](docs/Get2ListsIdResponse.md)
 - [Get2ListsIdTweetsResponse](docs/Get2ListsIdTweetsResponse.md)
 - [Get2SpacesByCreatorIdsResponse](docs/Get2SpacesByCreatorIdsResponse.md)
 - [Get2SpacesIdBuyersResponse](docs/Get2SpacesIdBuyersResponse.md)
 - [Get2SpacesIdResponse](docs/Get2SpacesIdResponse.md)
 - [Get2SpacesIdTweetsResponse](docs/Get2SpacesIdTweetsResponse.md)
 - [Get2SpacesResponse](docs/Get2SpacesResponse.md)
 - [Get2SpacesSearchResponse](docs/Get2SpacesSearchResponse.md)
 - [Get2TweetsCountsAllResponse](docs/Get2TweetsCountsAllResponse.md)
 - [Get2TweetsCountsAllResponseMeta](docs/Get2TweetsCountsAllResponseMeta.md)
 - [Get2TweetsCountsRecentResponse](docs/Get2TweetsCountsRecentResponse.md)
 - [Get2TweetsFirehoseStreamResponse](docs/Get2TweetsFirehoseStreamResponse.md)
 - [Get2TweetsIdLikingUsersResponse](docs/Get2TweetsIdLikingUsersResponse.md)
 - [Get2TweetsIdQuoteTweetsResponse](docs/Get2TweetsIdQuoteTweetsResponse.md)
 - [Get2TweetsIdQuoteTweetsResponseMeta](docs/Get2TweetsIdQuoteTweetsResponseMeta.md)
 - [Get2TweetsIdResponse](docs/Get2TweetsIdResponse.md)
 - [Get2TweetsIdRetweetedByResponse](docs/Get2TweetsIdRetweetedByResponse.md)
 - [Get2TweetsResponse](docs/Get2TweetsResponse.md)
 - [Get2TweetsSample10StreamResponse](docs/Get2TweetsSample10StreamResponse.md)
 - [Get2TweetsSampleStreamResponse](docs/Get2TweetsSampleStreamResponse.md)
 - [Get2TweetsSearchAllResponse](docs/Get2TweetsSearchAllResponse.md)
 - [Get2TweetsSearchAllResponseMeta](docs/Get2TweetsSearchAllResponseMeta.md)
 - [Get2TweetsSearchRecentResponse](docs/Get2TweetsSearchRecentResponse.md)
 - [Get2TweetsSearchStreamResponse](docs/Get2TweetsSearchStreamResponse.md)
 - [Get2UsersByResponse](docs/Get2UsersByResponse.md)
 - [Get2UsersByUsernameUsernameResponse](docs/Get2UsersByUsernameUsernameResponse.md)
 - [Get2UsersIdBlockingResponse](docs/Get2UsersIdBlockingResponse.md)
 - [Get2UsersIdBookmarksResponse](docs/Get2UsersIdBookmarksResponse.md)
 - [Get2UsersIdFollowedListsResponse](docs/Get2UsersIdFollowedListsResponse.md)
 - [Get2UsersIdFollowersResponse](docs/Get2UsersIdFollowersResponse.md)
 - [Get2UsersIdFollowingResponse](docs/Get2UsersIdFollowingResponse.md)
 - [Get2UsersIdLikedTweetsResponse](docs/Get2UsersIdLikedTweetsResponse.md)
 - [Get2UsersIdListMembershipsResponse](docs/Get2UsersIdListMembershipsResponse.md)
 - [Get2UsersIdMentionsResponse](docs/Get2UsersIdMentionsResponse.md)
 - [Get2UsersIdMentionsResponseMeta](docs/Get2UsersIdMentionsResponseMeta.md)
 - [Get2UsersIdMutingResponse](docs/Get2UsersIdMutingResponse.md)
 - [Get2UsersIdOwnedListsResponse](docs/Get2UsersIdOwnedListsResponse.md)
 - [Get2UsersIdPinnedListsResponse](docs/Get2UsersIdPinnedListsResponse.md)
 - [Get2UsersIdResponse](docs/Get2UsersIdResponse.md)
 - [Get2UsersIdTimelinesReverseChronologicalResponse](docs/Get2UsersIdTimelinesReverseChronologicalResponse.md)
 - [Get2UsersIdTweetsResponse](docs/Get2UsersIdTweetsResponse.md)
 - [Get2UsersMeResponse](docs/Get2UsersMeResponse.md)
 - [Get2UsersResponse](docs/Get2UsersResponse.md)
 - [HashtagEntity](docs/HashtagEntity.md)
 - [HashtagFields](docs/HashtagFields.md)
 - [InvalidRequestProblem](docs/InvalidRequestProblem.md)
 - [InvalidRequestProblemAllOf](docs/InvalidRequestProblemAllOf.md)
 - [InvalidRequestProblemAllOfErrors](docs/InvalidRequestProblemAllOfErrors.md)
 - [List](docs/List.md)
 - [ListAddUserRequest](docs/ListAddUserRequest.md)
 - [ListCreateRequest](docs/ListCreateRequest.md)
 - [ListCreateResponse](docs/ListCreateResponse.md)
 - [ListCreateResponseData](docs/ListCreateResponseData.md)
 - [ListDeleteResponse](docs/ListDeleteResponse.md)
 - [ListDeleteResponseData](docs/ListDeleteResponseData.md)
 - [ListFollowedRequest](docs/ListFollowedRequest.md)
 - [ListFollowedResponse](docs/ListFollowedResponse.md)
 - [ListFollowedResponseData](docs/ListFollowedResponseData.md)
 - [ListMutateResponse](docs/ListMutateResponse.md)
 - [ListMutateResponseData](docs/ListMutateResponseData.md)
 - [ListPinnedRequest](docs/ListPinnedRequest.md)
 - [ListPinnedResponse](docs/ListPinnedResponse.md)
 - [ListPinnedResponseData](docs/ListPinnedResponseData.md)
 - [ListUnpinResponse](docs/ListUnpinResponse.md)
 - [ListUpdateRequest](docs/ListUpdateRequest.md)
 - [ListUpdateResponse](docs/ListUpdateResponse.md)
 - [ListUpdateResponseData](docs/ListUpdateResponseData.md)
 - [Media](docs/Media.md)
 - [MentionEntity](docs/MentionEntity.md)
 - [MentionFields](docs/MentionFields.md)
 - [MuteUserMutationResponse](docs/MuteUserMutationResponse.md)
 - [MuteUserMutationResponseData](docs/MuteUserMutationResponseData.md)
 - [MuteUserRequest](docs/MuteUserRequest.md)
 - [OperationalDisconnectProblem](docs/OperationalDisconnectProblem.md)
 - [OperationalDisconnectProblemAllOf](docs/OperationalDisconnectProblemAllOf.md)
 - [Photo](docs/Photo.md)
 - [PhotoAllOf](docs/PhotoAllOf.md)
 - [Place](docs/Place.md)
 - [PlaceType](docs/PlaceType.md)
 - [Point](docs/Point.md)
 - [Poll](docs/Poll.md)
 - [PollOption](docs/PollOption.md)
 - [Problem](docs/Problem.md)
 - [ReplySettings](docs/ReplySettings.md)
 - [ResourceNotFoundProblem](docs/ResourceNotFoundProblem.md)
 - [ResourceNotFoundProblemAllOf](docs/ResourceNotFoundProblemAllOf.md)
 - [ResourceUnauthorizedProblem](docs/ResourceUnauthorizedProblem.md)
 - [ResourceUnauthorizedProblemAllOf](docs/ResourceUnauthorizedProblemAllOf.md)
 - [ResourceUnavailableProblem](docs/ResourceUnavailableProblem.md)
 - [ResourceUnavailableProblemAllOf](docs/ResourceUnavailableProblemAllOf.md)
 - [Rule](docs/Rule.md)
 - [RuleNoId](docs/RuleNoId.md)
 - [RulesLookupResponse](docs/RulesLookupResponse.md)
 - [RulesResponseMetadata](docs/RulesResponseMetadata.md)
 - [SearchCount](docs/SearchCount.md)
 - [Space](docs/Space.md)
 - [SpaceTopicsInner](docs/SpaceTopicsInner.md)
 - [StreamingTweetResponse](docs/StreamingTweetResponse.md)
 - [TACreateMessageRequest](docs/TACreateMessageRequest.md)
 - [Topic](docs/Topic.md)
 - [Tweet](docs/Tweet.md)
 - [TweetAttachments](docs/TweetAttachments.md)
 - [TweetComplianceSchema](docs/TweetComplianceSchema.md)
 - [TweetComplianceSchemaTweet](docs/TweetComplianceSchemaTweet.md)
 - [TweetCreateRequest](docs/TweetCreateRequest.md)
 - [TweetCreateRequestGeo](docs/TweetCreateRequestGeo.md)
 - [TweetCreateRequestMedia](docs/TweetCreateRequestMedia.md)
 - [TweetCreateRequestPoll](docs/TweetCreateRequestPoll.md)
 - [TweetCreateRequestReply](docs/TweetCreateRequestReply.md)
 - [TweetCreateResponse](docs/TweetCreateResponse.md)
 - [TweetCreateResponseData](docs/TweetCreateResponseData.md)
 - [TweetDeleteComplianceSchema](docs/TweetDeleteComplianceSchema.md)
 - [TweetDeleteResponse](docs/TweetDeleteResponse.md)
 - [TweetDeleteResponseData](docs/TweetDeleteResponseData.md)
 - [TweetDropComplianceSchema](docs/TweetDropComplianceSchema.md)
 - [TweetEditComplianceObjectSchema](docs/TweetEditComplianceObjectSchema.md)
 - [TweetEditComplianceSchema](docs/TweetEditComplianceSchema.md)
 - [TweetEditControls](docs/TweetEditControls.md)
 - [TweetGeo](docs/TweetGeo.md)
 - [TweetHideRequest](docs/TweetHideRequest.md)
 - [TweetHideResponse](docs/TweetHideResponse.md)
 - [TweetHideResponseData](docs/TweetHideResponseData.md)
 - [TweetNonPublicMetrics](docs/TweetNonPublicMetrics.md)
 - [TweetNotice](docs/TweetNotice.md)
 - [TweetNoticeSchema](docs/TweetNoticeSchema.md)
 - [TweetOrganicMetrics](docs/TweetOrganicMetrics.md)
 - [TweetPromotedMetrics](docs/TweetPromotedMetrics.md)
 - [TweetPublicMetrics](docs/TweetPublicMetrics.md)
 - [TweetReferencedTweetsInner](docs/TweetReferencedTweetsInner.md)
 - [TweetTakedownComplianceSchema](docs/TweetTakedownComplianceSchema.md)
 - [TweetUndropComplianceSchema](docs/TweetUndropComplianceSchema.md)
 - [TweetUnviewable](docs/TweetUnviewable.md)
 - [TweetUnviewableSchema](docs/TweetUnviewableSchema.md)
 - [TweetWithheld](docs/TweetWithheld.md)
 - [TweetWithheldComplianceSchema](docs/TweetWithheldComplianceSchema.md)
 - [UrlEntity](docs/UrlEntity.md)
 - [UrlFields](docs/UrlFields.md)
 - [UrlImage](docs/UrlImage.md)
 - [UsageCapExceededProblem](docs/UsageCapExceededProblem.md)
 - [UsageCapExceededProblemAllOf](docs/UsageCapExceededProblemAllOf.md)
 - [User](docs/User.md)
 - [UserComplianceSchema](docs/UserComplianceSchema.md)
 - [UserComplianceSchemaUser](docs/UserComplianceSchemaUser.md)
 - [UserDeleteComplianceSchema](docs/UserDeleteComplianceSchema.md)
 - [UserEntities](docs/UserEntities.md)
 - [UserEntitiesUrl](docs/UserEntitiesUrl.md)
 - [UserProfileModificationComplianceSchema](docs/UserProfileModificationComplianceSchema.md)
 - [UserProfileModificationObjectSchema](docs/UserProfileModificationObjectSchema.md)
 - [UserProtectComplianceSchema](docs/UserProtectComplianceSchema.md)
 - [UserPublicMetrics](docs/UserPublicMetrics.md)
 - [UserScrubGeoObjectSchema](docs/UserScrubGeoObjectSchema.md)
 - [UserScrubGeoSchema](docs/UserScrubGeoSchema.md)
 - [UserSuspendComplianceSchema](docs/UserSuspendComplianceSchema.md)
 - [UserTakedownComplianceSchema](docs/UserTakedownComplianceSchema.md)
 - [UserUndeleteComplianceSchema](docs/UserUndeleteComplianceSchema.md)
 - [UserUnprotectComplianceSchema](docs/UserUnprotectComplianceSchema.md)
 - [UserUnsuspendComplianceSchema](docs/UserUnsuspendComplianceSchema.md)
 - [UserWithheld](docs/UserWithheld.md)
 - [UserWithheldComplianceSchema](docs/UserWithheldComplianceSchema.md)
 - [UsersFollowingCreateRequest](docs/UsersFollowingCreateRequest.md)
 - [UsersFollowingCreateResponse](docs/UsersFollowingCreateResponse.md)
 - [UsersFollowingCreateResponseData](docs/UsersFollowingCreateResponseData.md)
 - [UsersFollowingDeleteResponse](docs/UsersFollowingDeleteResponse.md)
 - [UsersLikesCreateRequest](docs/UsersLikesCreateRequest.md)
 - [UsersLikesCreateResponse](docs/UsersLikesCreateResponse.md)
 - [UsersLikesCreateResponseData](docs/UsersLikesCreateResponseData.md)
 - [UsersLikesDeleteResponse](docs/UsersLikesDeleteResponse.md)
 - [UsersRetweetsCreateRequest](docs/UsersRetweetsCreateRequest.md)
 - [UsersRetweetsCreateResponse](docs/UsersRetweetsCreateResponse.md)
 - [UsersRetweetsCreateResponseData](docs/UsersRetweetsCreateResponseData.md)
 - [UsersRetweetsDeleteResponse](docs/UsersRetweetsDeleteResponse.md)
 - [Variant](docs/Variant.md)
 - [Video](docs/Video.md)
 - [VideoAllOf](docs/VideoAllOf.md)
 - [VideoAllOfNonPublicMetrics](docs/VideoAllOfNonPublicMetrics.md)
 - [VideoAllOfOrganicMetrics](docs/VideoAllOfOrganicMetrics.md)
 - [VideoAllOfPromotedMetrics](docs/VideoAllOfPromotedMetrics.md)
 - [VideoAllOfPublicMetrics](docs/VideoAllOfPublicMetrics.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
