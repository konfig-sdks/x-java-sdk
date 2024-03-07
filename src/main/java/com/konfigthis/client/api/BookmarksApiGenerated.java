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

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.BookmarkAddRequest;
import com.konfigthis.client.model.BookmarkMutationResponse;
import com.konfigthis.client.model.Error;
import com.konfigthis.client.model.Get2UsersIdBookmarksResponse;
import com.konfigthis.client.model.Problem;
import java.util.Set;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class BookmarksApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BookmarksApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public BookmarksApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call addTweetCall(String id, BookmarkAddRequest bookmarkAddRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = bookmarkAddRequest;

        // create path and map variables
        String localVarPath = "/2/users/{id}/bookmarks"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json",
            "application/problem+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "OAuth2UserToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addTweetValidateBeforeCall(String id, BookmarkAddRequest bookmarkAddRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling addTweet(Async)");
        }

        // verify the required parameter 'bookmarkAddRequest' is set
        if (bookmarkAddRequest == null) {
            throw new ApiException("Missing the required parameter 'bookmarkAddRequest' when calling addTweet(Async)");
        }

        return addTweetCall(id, bookmarkAddRequest, _callback);

    }


    private ApiResponse<BookmarkMutationResponse> addTweetWithHttpInfo(String id, BookmarkAddRequest bookmarkAddRequest) throws ApiException {
        okhttp3.Call localVarCall = addTweetValidateBeforeCall(id, bookmarkAddRequest, null);
        Type localVarReturnType = new TypeToken<BookmarkMutationResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call addTweetAsync(String id, BookmarkAddRequest bookmarkAddRequest, final ApiCallback<BookmarkMutationResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = addTweetValidateBeforeCall(id, bookmarkAddRequest, _callback);
        Type localVarReturnType = new TypeToken<BookmarkMutationResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class AddTweetRequestBuilder {
        private final String tweetId;
        private final String id;

        private AddTweetRequestBuilder(String tweetId, String id) {
            this.tweetId = tweetId;
            this.id = id;
        }

        /**
         * Build call for addTweet
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request has succeeded. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            BookmarkAddRequest bookmarkAddRequest = buildBodyParams();
            return addTweetCall(id, bookmarkAddRequest, _callback);
        }

        private BookmarkAddRequest buildBodyParams() {
            BookmarkAddRequest bookmarkAddRequest = new BookmarkAddRequest();
            bookmarkAddRequest.tweetId(this.tweetId);
            return bookmarkAddRequest;
        }

        /**
         * Execute addTweet request
         * @return BookmarkMutationResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request has succeeded. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
         </table>
         */
        public BookmarkMutationResponse execute() throws ApiException {
            BookmarkAddRequest bookmarkAddRequest = buildBodyParams();
            ApiResponse<BookmarkMutationResponse> localVarResp = addTweetWithHttpInfo(id, bookmarkAddRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute addTweet request with HTTP info returned
         * @return ApiResponse&lt;BookmarkMutationResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request has succeeded. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<BookmarkMutationResponse> executeWithHttpInfo() throws ApiException {
            BookmarkAddRequest bookmarkAddRequest = buildBodyParams();
            return addTweetWithHttpInfo(id, bookmarkAddRequest);
        }

        /**
         * Execute addTweet request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request has succeeded. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<BookmarkMutationResponse> _callback) throws ApiException {
            BookmarkAddRequest bookmarkAddRequest = buildBodyParams();
            return addTweetAsync(id, bookmarkAddRequest, _callback);
        }
    }

    /**
     * Add Tweet to Bookmarks
     * Adds a Tweet (ID in the body) to the requesting User&#39;s (in the path) bookmarks
     * @param id The ID of the authenticated source User for whom to add bookmarks. (required)
     * @param bookmarkAddRequest  (required)
     * @return AddTweetRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request has succeeded. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://developer.twitter.com/en/docs/twitter-api/tweets/bookmarks/api-reference/post-users-id-bookmarks">Add Tweet to Bookmarks Documentation</a>
     */
    public AddTweetRequestBuilder addTweet(String tweetId, String id) throws IllegalArgumentException {
        if (tweetId == null) throw new IllegalArgumentException("\"tweetId\" is required but got null");
            

        if (id == null) throw new IllegalArgumentException("\"id\" is required but got null");
            

        return new AddTweetRequestBuilder(tweetId, id);
    }
    private okhttp3.Call getUserBookmarksCall(String id, Integer maxResults, String paginationToken, Set<String> tweetFields, Set<String> expansions, Set<String> mediaFields, Set<String> pollFields, Set<String> userFields, Set<String> placeFields, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2/users/{id}/bookmarks"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (maxResults != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("max_results", maxResults));
        }

        if (paginationToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pagination_token", paginationToken));
        }

        if (tweetFields != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "tweet.fields", tweetFields));
        }

        if (expansions != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "expansions", expansions));
        }

        if (mediaFields != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "media.fields", mediaFields));
        }

        if (pollFields != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "poll.fields", pollFields));
        }

        if (userFields != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "user.fields", userFields));
        }

        if (placeFields != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "place.fields", placeFields));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/problem+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "OAuth2UserToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getUserBookmarksValidateBeforeCall(String id, Integer maxResults, String paginationToken, Set<String> tweetFields, Set<String> expansions, Set<String> mediaFields, Set<String> pollFields, Set<String> userFields, Set<String> placeFields, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getUserBookmarks(Async)");
        }

        return getUserBookmarksCall(id, maxResults, paginationToken, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields, _callback);

    }


    private ApiResponse<Get2UsersIdBookmarksResponse> getUserBookmarksWithHttpInfo(String id, Integer maxResults, String paginationToken, Set<String> tweetFields, Set<String> expansions, Set<String> mediaFields, Set<String> pollFields, Set<String> userFields, Set<String> placeFields) throws ApiException {
        okhttp3.Call localVarCall = getUserBookmarksValidateBeforeCall(id, maxResults, paginationToken, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields, null);
        Type localVarReturnType = new TypeToken<Get2UsersIdBookmarksResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getUserBookmarksAsync(String id, Integer maxResults, String paginationToken, Set<String> tweetFields, Set<String> expansions, Set<String> mediaFields, Set<String> pollFields, Set<String> userFields, Set<String> placeFields, final ApiCallback<Get2UsersIdBookmarksResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUserBookmarksValidateBeforeCall(id, maxResults, paginationToken, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields, _callback);
        Type localVarReturnType = new TypeToken<Get2UsersIdBookmarksResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetUserBookmarksRequestBuilder {
        private final String id;
        private Integer maxResults;
        private String paginationToken;
        private Set<String> tweetFields;
        private Set<String> expansions;
        private Set<String> mediaFields;
        private Set<String> pollFields;
        private Set<String> userFields;
        private Set<String> placeFields;

        private GetUserBookmarksRequestBuilder(String id) {
            this.id = id;
        }

        /**
         * Set maxResults
         * @param maxResults The maximum number of results. (optional)
         * @return GetUserBookmarksRequestBuilder
         */
        public GetUserBookmarksRequestBuilder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        
        /**
         * Set paginationToken
         * @param paginationToken This parameter is used to get the next &#39;page&#39; of results. (optional)
         * @return GetUserBookmarksRequestBuilder
         */
        public GetUserBookmarksRequestBuilder paginationToken(String paginationToken) {
            this.paginationToken = paginationToken;
            return this;
        }
        
        /**
         * Set tweetFields
         * @param tweetFields A comma separated list of Tweet fields to display. (optional)
         * @return GetUserBookmarksRequestBuilder
         */
        public GetUserBookmarksRequestBuilder tweetFields(Set<String> tweetFields) {
            this.tweetFields = tweetFields;
            return this;
        }
        
        /**
         * Set expansions
         * @param expansions A comma separated list of fields to expand. (optional)
         * @return GetUserBookmarksRequestBuilder
         */
        public GetUserBookmarksRequestBuilder expansions(Set<String> expansions) {
            this.expansions = expansions;
            return this;
        }
        
        /**
         * Set mediaFields
         * @param mediaFields A comma separated list of Media fields to display. (optional)
         * @return GetUserBookmarksRequestBuilder
         */
        public GetUserBookmarksRequestBuilder mediaFields(Set<String> mediaFields) {
            this.mediaFields = mediaFields;
            return this;
        }
        
        /**
         * Set pollFields
         * @param pollFields A comma separated list of Poll fields to display. (optional)
         * @return GetUserBookmarksRequestBuilder
         */
        public GetUserBookmarksRequestBuilder pollFields(Set<String> pollFields) {
            this.pollFields = pollFields;
            return this;
        }
        
        /**
         * Set userFields
         * @param userFields A comma separated list of User fields to display. (optional)
         * @return GetUserBookmarksRequestBuilder
         */
        public GetUserBookmarksRequestBuilder userFields(Set<String> userFields) {
            this.userFields = userFields;
            return this;
        }
        
        /**
         * Set placeFields
         * @param placeFields A comma separated list of Place fields to display. (optional)
         * @return GetUserBookmarksRequestBuilder
         */
        public GetUserBookmarksRequestBuilder placeFields(Set<String> placeFields) {
            this.placeFields = placeFields;
            return this;
        }
        
        /**
         * Build call for getUserBookmarks
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request has succeeded. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getUserBookmarksCall(id, maxResults, paginationToken, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields, _callback);
        }


        /**
         * Execute getUserBookmarks request
         * @return Get2UsersIdBookmarksResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request has succeeded. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
         </table>
         */
        public Get2UsersIdBookmarksResponse execute() throws ApiException {
            ApiResponse<Get2UsersIdBookmarksResponse> localVarResp = getUserBookmarksWithHttpInfo(id, maxResults, paginationToken, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getUserBookmarks request with HTTP info returned
         * @return ApiResponse&lt;Get2UsersIdBookmarksResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request has succeeded. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Get2UsersIdBookmarksResponse> executeWithHttpInfo() throws ApiException {
            return getUserBookmarksWithHttpInfo(id, maxResults, paginationToken, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields);
        }

        /**
         * Execute getUserBookmarks request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request has succeeded. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Get2UsersIdBookmarksResponse> _callback) throws ApiException {
            return getUserBookmarksAsync(id, maxResults, paginationToken, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields, _callback);
        }
    }

    /**
     * Bookmarks by User
     * Returns Tweet objects that have been bookmarked by the requesting User
     * @param id The ID of the authenticated source User for whom to return results. (required)
     * @return GetUserBookmarksRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request has succeeded. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://developer.twitter.com/en/docs/twitter-api/tweets/bookmarks/api-reference/get-users-id-bookmarks">Bookmarks by User Documentation</a>
     */
    public GetUserBookmarksRequestBuilder getUserBookmarks(String id) throws IllegalArgumentException {
        if (id == null) throw new IllegalArgumentException("\"id\" is required but got null");
            

        return new GetUserBookmarksRequestBuilder(id);
    }
    private okhttp3.Call removeTweetCall(String id, String tweetId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2/users/{id}/bookmarks/{tweet_id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()))
            .replace("{" + "tweet_id" + "}", localVarApiClient.escapeString(tweetId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json",
            "application/problem+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "OAuth2UserToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call removeTweetValidateBeforeCall(String id, String tweetId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling removeTweet(Async)");
        }

        // verify the required parameter 'tweetId' is set
        if (tweetId == null) {
            throw new ApiException("Missing the required parameter 'tweetId' when calling removeTweet(Async)");
        }

        return removeTweetCall(id, tweetId, _callback);

    }


    private ApiResponse<BookmarkMutationResponse> removeTweetWithHttpInfo(String id, String tweetId) throws ApiException {
        okhttp3.Call localVarCall = removeTweetValidateBeforeCall(id, tweetId, null);
        Type localVarReturnType = new TypeToken<BookmarkMutationResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call removeTweetAsync(String id, String tweetId, final ApiCallback<BookmarkMutationResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = removeTweetValidateBeforeCall(id, tweetId, _callback);
        Type localVarReturnType = new TypeToken<BookmarkMutationResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class RemoveTweetRequestBuilder {
        private final String id;
        private final String tweetId;

        private RemoveTweetRequestBuilder(String id, String tweetId) {
            this.id = id;
            this.tweetId = tweetId;
        }

        /**
         * Build call for removeTweet
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request has succeeded. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return removeTweetCall(id, tweetId, _callback);
        }


        /**
         * Execute removeTweet request
         * @return BookmarkMutationResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request has succeeded. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
         </table>
         */
        public BookmarkMutationResponse execute() throws ApiException {
            ApiResponse<BookmarkMutationResponse> localVarResp = removeTweetWithHttpInfo(id, tweetId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute removeTweet request with HTTP info returned
         * @return ApiResponse&lt;BookmarkMutationResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request has succeeded. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<BookmarkMutationResponse> executeWithHttpInfo() throws ApiException {
            return removeTweetWithHttpInfo(id, tweetId);
        }

        /**
         * Execute removeTweet request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request has succeeded. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<BookmarkMutationResponse> _callback) throws ApiException {
            return removeTweetAsync(id, tweetId, _callback);
        }
    }

    /**
     * Remove a bookmarked Tweet
     * Removes a Tweet from the requesting User&#39;s bookmarked Tweets.
     * @param id The ID of the authenticated source User whose bookmark is to be removed. (required)
     * @param tweetId The ID of the Tweet that the source User is removing from bookmarks. (required)
     * @return RemoveTweetRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request has succeeded. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://developer.twitter.com/en/docs/twitter-api/tweets/bookmarks/api-reference/delete-users-id-bookmarks-tweet_id">Remove a bookmarked Tweet Documentation</a>
     */
    public RemoveTweetRequestBuilder removeTweet(String id, String tweetId) throws IllegalArgumentException {
        if (id == null) throw new IllegalArgumentException("\"id\" is required but got null");
            

        if (tweetId == null) throw new IllegalArgumentException("\"tweetId\" is required but got null");
            

        return new RemoveTweetRequestBuilder(id, tweetId);
    }
}
