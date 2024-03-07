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


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.BlockUserMutationResponse;
import com.konfigthis.client.model.BlockUserRequest;
import com.konfigthis.client.model.Error;
import com.konfigthis.client.model.Get2ListsIdFollowersResponse;
import com.konfigthis.client.model.Get2ListsIdMembersResponse;
import com.konfigthis.client.model.Get2TweetsIdLikingUsersResponse;
import com.konfigthis.client.model.Get2TweetsIdRetweetedByResponse;
import com.konfigthis.client.model.Get2UsersByResponse;
import com.konfigthis.client.model.Get2UsersByUsernameUsernameResponse;
import com.konfigthis.client.model.Get2UsersIdBlockingResponse;
import com.konfigthis.client.model.Get2UsersIdFollowersResponse;
import com.konfigthis.client.model.Get2UsersIdFollowingResponse;
import com.konfigthis.client.model.Get2UsersIdMutingResponse;
import com.konfigthis.client.model.Get2UsersIdResponse;
import com.konfigthis.client.model.Get2UsersMeResponse;
import com.konfigthis.client.model.Get2UsersResponse;
import com.konfigthis.client.model.MuteUserMutationResponse;
import com.konfigthis.client.model.MuteUserRequest;
import com.konfigthis.client.model.Problem;
import java.util.Set;
import com.konfigthis.client.model.UsersFollowingCreateRequest;
import com.konfigthis.client.model.UsersFollowingCreateResponse;
import com.konfigthis.client.model.UsersFollowingDeleteResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
@Disabled
public class UsersApiTest {

    private static UsersApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new UsersApi(apiClient);
    }

    /**
     * Block User by User ID
     *
     * Causes the User (in the path) to block the target User. The User (in the path) must match the User context authorizing the request
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void blockUserByIdTest() throws ApiException {
        String targetUserId = null;
        String id = null;
        BlockUserMutationResponse response = api.blockUserById(targetUserId, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Follow User
     *
     * Causes the User(in the path) to follow, or “request to follow” for protected Users, the target User. The User(in the path) must match the User context authorizing the request
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void followUserTest() throws ApiException {
        String targetUserId = null;
        String id = null;
        UsersFollowingCreateResponse response = api.followUser(targetUserId, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns User objects that are blocked by provided User ID
     *
     * Returns a list of Users that are blocked by the provided User ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBlockedUsersTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        String paginationToken = null;
        Set<String> userFields = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
        Get2UsersIdBlockingResponse response = api.getBlockedUsers(id)
                .maxResults(maxResults)
                .paginationToken(paginationToken)
                .userFields(userFields)
                .expansions(expansions)
                .tweetFields(tweetFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Followers by User ID
     *
     * Returns a list of Users who are followers of the specified User ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFollowersByIdTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        String paginationToken = null;
        Set<String> userFields = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
        Get2UsersIdFollowersResponse response = api.getFollowersById(id)
                .maxResults(maxResults)
                .paginationToken(paginationToken)
                .userFields(userFields)
                .expansions(expansions)
                .tweetFields(tweetFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns User objects that follow a List by the provided List ID
     *
     * Returns a list of Users that follow a List by the provided List ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFollowersByListIdTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        String paginationToken = null;
        Set<String> userFields = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
        Get2ListsIdFollowersResponse response = api.getFollowersByListId(id)
                .maxResults(maxResults)
                .paginationToken(paginationToken)
                .userFields(userFields)
                .expansions(expansions)
                .tweetFields(tweetFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Following by User ID
     *
     * Returns a list of Users that are being followed by the provided User ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFollowingUsersTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        String paginationToken = null;
        Set<String> userFields = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
        Get2UsersIdFollowingResponse response = api.getFollowingUsers(id)
                .maxResults(maxResults)
                .paginationToken(paginationToken)
                .userFields(userFields)
                .expansions(expansions)
                .tweetFields(tweetFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns User objects that are members of a List by the provided List ID.
     *
     * Returns a list of Users that are members of a List by the provided List ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMembersByListIdTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        String paginationToken = null;
        Set<String> userFields = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
        Get2ListsIdMembersResponse response = api.getMembersByListId(id)
                .maxResults(maxResults)
                .paginationToken(paginationToken)
                .userFields(userFields)
                .expansions(expansions)
                .tweetFields(tweetFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns User objects that are muted by the provided User ID
     *
     * Returns a list of Users that are muted by the provided User ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMutedUsersByIdTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        String paginationToken = null;
        Set<String> userFields = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
        Get2UsersIdMutingResponse response = api.getMutedUsersById(id)
                .maxResults(maxResults)
                .paginationToken(paginationToken)
                .userFields(userFields)
                .expansions(expansions)
                .tweetFields(tweetFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns User objects that have retweeted the provided Tweet ID
     *
     * Returns a list of Users that have retweeted the provided Tweet ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRetweetedByTweetIdUsersTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        String paginationToken = null;
        Set<String> userFields = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
        Get2TweetsIdRetweetedByResponse response = api.getRetweetedByTweetIdUsers(id)
                .maxResults(maxResults)
                .paginationToken(paginationToken)
                .userFields(userFields)
                .expansions(expansions)
                .tweetFields(tweetFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns User objects that have liked the provided Tweet ID
     *
     * Returns a list of Users that have liked the provided Tweet ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listLikingUsersTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        String paginationToken = null;
        Set<String> userFields = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
        Get2TweetsIdLikingUsersResponse response = api.listLikingUsers(id)
                .maxResults(maxResults)
                .paginationToken(paginationToken)
                .userFields(userFields)
                .expansions(expansions)
                .tweetFields(tweetFields)
                .execute();
        // TODO: test validations
    }

    /**
     * User lookup by ID
     *
     * This endpoint returns information about a User. Specify User by ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void lookupByIdTest() throws ApiException {
        String id = null;
        Set<String> userFields = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
        Get2UsersIdResponse response = api.lookupById(id)
                .userFields(userFields)
                .expansions(expansions)
                .tweetFields(tweetFields)
                .execute();
        // TODO: test validations
    }

    /**
     * User lookup by IDs
     *
     * This endpoint returns information about Users. Specify Users by their ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void lookupByIdsTest() throws ApiException {
        List<String> ids = null;
        Set<String> userFields = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
        Get2UsersResponse response = api.lookupByIds(ids)
                .userFields(userFields)
                .expansions(expansions)
                .tweetFields(tweetFields)
                .execute();
        // TODO: test validations
    }

    /**
     * User lookup by username
     *
     * This endpoint returns information about a User. Specify User by username.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void lookupByUsernameTest() throws ApiException {
        String username = null;
        Set<String> userFields = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
        Get2UsersByUsernameUsernameResponse response = api.lookupByUsername(username)
                .userFields(userFields)
                .expansions(expansions)
                .tweetFields(tweetFields)
                .execute();
        // TODO: test validations
    }

    /**
     * User lookup by usernames
     *
     * This endpoint returns information about Users. Specify Users by their username.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void lookupByUsernamesTest() throws ApiException {
        List<String> usernames = null;
        Set<String> userFields = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
        Get2UsersByResponse response = api.lookupByUsernames(usernames)
                .userFields(userFields)
                .expansions(expansions)
                .tweetFields(tweetFields)
                .execute();
        // TODO: test validations
    }

    /**
     * User lookup me
     *
     * This endpoint returns information about the requesting User.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void lookupMeTest() throws ApiException {
        Set<String> userFields = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
        Get2UsersMeResponse response = api.lookupMe()
                .userFields(userFields)
                .expansions(expansions)
                .tweetFields(tweetFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Mute User by User ID.
     *
     * Causes the User (in the path) to mute the target User. The User (in the path) must match the User context authorizing the request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void muteUserByIdTest() throws ApiException {
        String targetUserId = null;
        String id = null;
        MuteUserMutationResponse response = api.muteUserById(targetUserId, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Unblock User by User ID
     *
     * Causes the source User to unblock the target User. The source User must match the User context authorizing the request
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unblockUserByIdTest() throws ApiException {
        String sourceUserId = null;
        String targetUserId = null;
        BlockUserMutationResponse response = api.unblockUserById(sourceUserId, targetUserId)
                .execute();
        // TODO: test validations
    }

    /**
     * Unfollow User
     *
     * Causes the source User to unfollow the target User. The source User must match the User context authorizing the request
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unfollowUserTest() throws ApiException {
        String sourceUserId = null;
        String targetUserId = null;
        UsersFollowingDeleteResponse response = api.unfollowUser(sourceUserId, targetUserId)
                .execute();
        // TODO: test validations
    }

    /**
     * Unmute User by User ID
     *
     * Causes the source User to unmute the target User. The source User must match the User context authorizing the request
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unmuteByUserIdTest() throws ApiException {
        String sourceUserId = null;
        String targetUserId = null;
        MuteUserMutationResponse response = api.unmuteByUserId(sourceUserId, targetUserId)
                .execute();
        // TODO: test validations
    }

}
