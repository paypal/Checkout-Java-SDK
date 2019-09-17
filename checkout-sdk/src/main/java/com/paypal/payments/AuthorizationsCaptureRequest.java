// This class was generated on Wed, 11 Sep 2019 17:50:29 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// AuthorizationsCaptureRequest.java
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
 * Captures an authorized payment, by ID.
 */
public class AuthorizationsCaptureRequest extends HttpRequest<Capture> {

    public AuthorizationsCaptureRequest(String authorizationId) {
        super("/v2/payments/authorizations/{authorization_id}/capture?", "POST", Capture.class);
        try {
            path(path().replace("{authorization_id}", URLEncoder.encode(String.valueOf(authorizationId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    public AuthorizationsCaptureRequest authorization(String authorization) {
        header("Authorization", String.valueOf(authorization));
        return this;
    }
    
    public AuthorizationsCaptureRequest contentType(String contentType) {
        header("Content-Type", String.valueOf(contentType));
        return this;
    }
    
    public AuthorizationsCaptureRequest payPalRequestId(String payPalRequestId) {
        header("PayPal-Request-Id", String.valueOf(payPalRequestId));
        return this;
    }
    
    public AuthorizationsCaptureRequest prefer(String prefer) {
        header("Prefer", String.valueOf(prefer));
        return this;
    }
    
    

    public AuthorizationsCaptureRequest requestBody(CaptureRequest capture) {
        super.requestBody(capture);
        return this;
    }
}
