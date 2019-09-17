// This class was generated on Wed, 11 Sep 2019 17:50:29 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// RefundsGetRequest.java
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
 * Shows details for a refund, by ID.
 */
public class RefundsGetRequest extends HttpRequest<Refund> {

    public RefundsGetRequest(String refundId) {
        super("/v2/payments/refunds/{refund_id}?", "GET", Refund.class);
        try {
            path(path().replace("{refund_id}", URLEncoder.encode(String.valueOf(refundId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    public RefundsGetRequest authorization(String authorization) {
        header("Authorization", String.valueOf(authorization));
        return this;
    }
    
    public RefundsGetRequest contentType(String contentType) {
        header("Content-Type", String.valueOf(contentType));
        return this;
    }
    
    
}
