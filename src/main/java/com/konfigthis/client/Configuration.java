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


package com.konfigthis.client;

@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Configuration {
    private static ApiClient defaultApiClient = new ApiClient();
    public boolean verifyingSsl = true;
    public String host = "https://api.twitter.com";
    public String tokenUrl = "https://api.twitter.com/2/oauth2/token";
    public String token;
    public String accessToken;

    /**
     * Get the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @return Default API client
     */
    public static ApiClient getDefaultApiClient() {
        return defaultApiClient;
    }

    /**
     * Set the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @param apiClient API client
     */
    public static void setDefaultApiClient(ApiClient apiClient) {
        defaultApiClient = apiClient;
    }
}
