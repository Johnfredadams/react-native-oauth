package com.github.scribejava.apis;

import android.util.Log;

import com.github.scribejava.core.builder.api.DefaultApi20;
import com.github.scribejava.core.extractors.OAuth2AccessTokenExtractor;
import com.github.scribejava.core.extractors.TokenExtractor;
import com.github.scribejava.core.model.OAuth2AccessToken;
import com.github.scribejava.core.model.Verb;

public class KlemiApi extends DefaultApi20 {

    protected KlemiApi() {
    }

    private static class InstanceHolder {
        private static final KlemiApi INSTANCE = new KlemiApi();
    }

    public static KlemiApi instance() {
        return InstanceHolder.INSTANCE;
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