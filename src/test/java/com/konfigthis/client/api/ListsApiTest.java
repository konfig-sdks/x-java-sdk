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
import com.konfigthis.client.model.Error;
import com.konfigthis.client.model.Get2ListsIdResponse;
import com.konfigthis.client.model.Get2UsersIdFollowedListsResponse;
import com.konfigthis.client.model.Get2UsersIdListMembershipsResponse;
import com.konfigthis.client.model.Get2UsersIdOwnedListsResponse;
import com.konfigthis.client.model.Get2UsersIdPinnedListsResponse;
import com.konfigthis.client.model.ListAddUserRequest;
import com.konfigthis.client.model.ListCreateRequest;
import com.konfigthis.client.model.ListCreateResponse;
import com.konfigthis.client.model.ListDeleteResponse;
import com.konfigthis.client.model.ListFollowedRequest;
import com.konfigthis.client.model.ListFollowedResponse;
import com.konfigthis.client.model.ListMutateResponse;
import com.konfigthis.client.model.ListPinnedRequest;
import com.konfigthis.client.model.ListPinnedResponse;
import com.konfigthis.client.model.ListUnpinResponse;
import com.konfigthis.client.model.ListUpdateRequest;
import com.konfigthis.client.model.ListUpdateResponse;
import com.konfigthis.client.model.Problem;
import java.util.Set;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ListsApi
 */
@Disabled
public class ListsApiTest {

    private static ListsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ListsApi(apiClient);
    }

    /**
     * Add a List member
     *
     * Causes a User to become a member of a List.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addMemberTest() throws ApiException {
        String userId = null;
        String id = null;
        ListMutateResponse response = api.addMember(userId, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Create List
     *
     * Creates a new List.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewListTest() throws ApiException {
        String name = null;
        String description = null;
        Boolean _private = null;
        ListCreateResponse response = api.createNewList(name)
                .description(description)
                ._private(_private)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete List
     *
     * Delete a List that you own.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteOwnedListTest() throws ApiException {
        String id = null;
        ListDeleteResponse response = api.deleteOwnedList(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Follow a List
     *
     * Causes a User to follow a List.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void followListTest() throws ApiException {
        String listId = null;
        String id = null;
        ListFollowedResponse response = api.followList(listId, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get User&#39;s Followed Lists
     *
     * Returns a User&#39;s followed Lists.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFollowedTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        String paginationToken = null;
        Set<String> listFields = null;
        Set<String> expansions = null;
        Set<String> userFields = null;
        Get2UsersIdFollowedListsResponse response = api.getFollowed(id)
                .maxResults(maxResults)
                .paginationToken(paginationToken)
                .listFields(listFields)
                .expansions(expansions)
                .userFields(userFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a User&#39;s List Memberships
     *
     * Get a User&#39;s List Memberships.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserMembershipsTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        String paginationToken = null;
        Set<String> listFields = null;
        Set<String> expansions = null;
        Set<String> userFields = null;
        Get2UsersIdListMembershipsResponse response = api.getUserMemberships(id)
                .maxResults(maxResults)
                .paginationToken(paginationToken)
                .listFields(listFields)
                .expansions(expansions)
                .userFields(userFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a User&#39;s Owned Lists.
     *
     * Get a User&#39;s Owned Lists.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserOwnedListsTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        String paginationToken = null;
        Set<String> listFields = null;
        Set<String> expansions = null;
        Set<String> userFields = null;
        Get2UsersIdOwnedListsResponse response = api.getUserOwnedLists(id)
                .maxResults(maxResults)
                .paginationToken(paginationToken)
                .listFields(listFields)
                .expansions(expansions)
                .userFields(userFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a User&#39;s Pinned Lists
     *
     * Get a User&#39;s Pinned Lists.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserPinnedListsTest() throws ApiException {
        String id = null;
        Set<String> listFields = null;
        Set<String> expansions = null;
        Set<String> userFields = null;
        Get2UsersIdPinnedListsResponse response = api.getUserPinnedLists(id)
                .listFields(listFields)
                .expansions(expansions)
                .userFields(userFields)
                .execute();
        // TODO: test validations
    }

    /**
     * List lookup by List ID.
     *
     * Returns a List.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void lookupByListIdTest() throws ApiException {
        String id = null;
        Set<String> listFields = null;
        Set<String> expansions = null;
        Set<String> userFields = null;
        Get2ListsIdResponse response = api.lookupByListId(id)
                .listFields(listFields)
                .expansions(expansions)
                .userFields(userFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Pin a List
     *
     * Causes a User to pin a List.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pinListTest() throws ApiException {
        String listId = null;
        String id = null;
        ListPinnedResponse response = api.pinList(listId, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove a List member
     *
     * Causes a User to be removed from the members of a List.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeMemberTest() throws ApiException {
        String id = null;
        String userId = null;
        ListMutateResponse response = api.removeMember(id, userId)
                .execute();
        // TODO: test validations
    }

    /**
     * Unfollow a List
     *
     * Causes a User to unfollow a List.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unfollowListTest() throws ApiException {
        String id = null;
        String listId = null;
        ListFollowedResponse response = api.unfollowList(id, listId)
                .execute();
        // TODO: test validations
    }

    /**
     * Unpin a List
     *
     * Causes a User to remove a pinned List.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unpinListTest() throws ApiException {
        String id = null;
        String listId = null;
        ListUnpinResponse response = api.unpinList(id, listId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update List.
     *
     * Update a List that you own.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateOwnedListTest() throws ApiException {
        String id = null;
        String description = null;
        String name = null;
        Boolean _private = null;
        ListUpdateResponse response = api.updateOwnedList(id)
                .description(description)
                .name(name)
                ._private(_private)
                .execute();
        // TODO: test validations
    }

}
