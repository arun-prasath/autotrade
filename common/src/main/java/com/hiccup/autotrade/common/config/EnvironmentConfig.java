package com.hiccup.autotrade.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Used for obtaining environment variables that can be used across the
 * application
 * 
 * @author Arun Prasath
 */
@Component
public class EnvironmentConfig {

    @Value("${autotrade_authorizationCodeUrl}")
    private String authorizationCodeUrl;

    @Value("${autotrade_accessTokenUrl}")
    private String accessTokenUrl;

    @Value("${autotrade_api_key}")
    private String apiKey;

    @Value("${autotrade_api_secret}")
    private String apiSecret;

    public String getAuthorizationCodeUrl() {
        return authorizationCodeUrl;
    }

    public String getAccessTokenUrl() {
        return this.accessTokenUrl;
    }

    public String getApiKey() {
        return this.apiKey;
    }

    public String getApiSecret() {
        return this.apiSecret;
    }
}
