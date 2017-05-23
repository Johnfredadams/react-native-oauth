package com.github.scribejava.apis;

import android.util.Log;

import java.lang.reflect.Constructor;

import com.github.scribejava.core.builder.api.DefaultApi20;
import com.github.scribejava.core.extractors.OAuth2AccessTokenExtractor;
import com.github.scribejava.core.extractors.TokenExtractor;
import com.github.scribejava.core.model.OAuth2AccessToken;
import com.github.scribejava.core.model.Verb;

public class CustomApi extends DefaultApi20 {

    protected CustomApi() {
    }

    private static class InstanceHolder(cfg) {
        CustomApi capi = CustomApi.class.getConstructor(CustomApi.class).newInstance(cfg);
        private static final CustomApi INSTANCE = capi;
    }

    public static CustomApi instance(cfg) {
        return InstanceHolder(cfg).INSTANCE;
    }

    @Override
    public Verb getAccessTokenVerb() {
        return Verb.POST;
    }

    @Override
    public String getAccessTokenEndpoint() {
        return "http://auth.klemi.co/oauth/token";
    }

    @Override
    protected String getAuthorizationBaseUrl() {
        return "http://auth.klemi.co/oauth/authorize";
    }
}