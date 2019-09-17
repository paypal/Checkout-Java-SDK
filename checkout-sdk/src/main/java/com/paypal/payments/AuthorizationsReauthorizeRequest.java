// This class was generated on Wed, 11 Sep 2019 17:50:29 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// AuthorizationsReauthorizeRequest.java
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
 * Reauthorizes an authorized PayPal account payment, by ID. To ensure that funds are still available, reauthorize a payment after its initial three-day honor period expires. You can reauthorize a payment only once from days four to 29.<br/><br/>If 30 days have transpired since the date of the original authorization, you must create an authorized payment instead of reauthorizing the original authorized payment.<br/><br/>A reauthorized payment itself has a new honor period of three days.<br/><br/>You can reauthorize an authorized payment once for up to 115% of the original authorized amount, not to exceed an increase of $75 USD.<br/><br/>Supports only the `amount` request parameter.<blockquote><strong>Note:</strong> This request is currently not supported for Partner use cases.</blockquote>
 */
public class AuthorizationsReauthorizeRequest extends HttpRequest<Authorization> {

    public AuthorizationsReauthorizeRequest(String authorizationId) {
        super("/v2/payments/authorizations/{authorization_id}/reauthorize?", "POST", Authorization.class);
        try {
            path(path().replace("{authorization_id}", URLEncoder.encode(String.valueOf(authorizationId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    public AuthorizationsReauthorizeRequest authorization(String authorization) {
        header("Authorization", String.valueOf(authorization));
        return this;
    }
    
    public AuthorizationsReauthorizeRequest contentType(String contentType) {
        header("Content-Type", String.valueOf(contentType));
        return this;
    }
    
    public AuthorizationsReauthorizeRequest payPalRequestId(String payPalRequestId) {
        header("PayPal-Request-Id", String.valueOf(payPalRequestId));
        return this;
    }
    
    public AuthorizationsReauthorizeRequest prefer(String prefer) {
        header("Prefer", String.valueOf(prefer));
        return this;
    }
    
    

    public AuthorizationsReauthorizeRequest requestBody(ReauthorizeRequest reauthorizeRequest) {
        super.requestBody(reauthorizeRequest);
        return this;
    }
}
