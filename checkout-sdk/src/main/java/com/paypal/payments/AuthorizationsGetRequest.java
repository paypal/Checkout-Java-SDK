// This class was generated on Wed, 11 Sep 2019 17:50:29 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// AuthorizationsGetRequest.java
// @version 0.1.0-dev+8fcb5f
// @type request
// @data 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
// DO NOT EDIT
package com.paypal.payments;

import com.braintreepayments.http.*;
import java.util.*;
import java.util.stream.Collectors;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * Shows details for an authorized payment, by ID.
 */
public class AuthorizationsGetRequest extends HttpRequest<Authorization> {

    public AuthorizationsGetRequest(String authorizationId) {
        super("/v2/payments/authorizations/{authorization_id}?", "GET", Authorization.class);
        try {
            path(path().replace("{authorization_id}", URLEncoder.encode(String.valueOf(authorizationId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    public AuthorizationsGetRequest authorization(String authorization) {
        header("Authorization", String.valueOf(authorization));
        return this;
    }
    
    public AuthorizationsGetRequest contentType(String contentType) {
        header("Content-Type", String.valueOf(contentType));
        return this;
    }
    
    
}
