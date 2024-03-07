package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://api.twitter.com";
        
        // Configure HTTP bearer authorization: BearerToken
        configuration.token = "BEARER TOKEN";
        
        // Configure OAuth2 access token for authorization: OAuth2UserToken
        configuration.accessToken = "YOUR ACCESS TOKEN";
        
        X client = new X(configuration);
        assertNotNull(client);
    }
}
