// This class was generated on Wed, 11 Sep 2019 17:50:29 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// CapturesRefundRequest.java
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
 * Refunds a captured payment, by ID. For a full refund, include an empty payload in the JSON request body. For a partial refund, include an <code>amount</code> object in the JSON request body.
 */
public class CapturesRefundRequest extends HttpRequest<Refund> {

    public CapturesRefundRequest(String captureId) {
        super("/v2/payments/captures/{capture_id}/refund?", "POST", Refund.class);
        try {
            path(path().replace("{capture_id}", URLEncoder.encode(String.valueOf(captureId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    public CapturesRefundRequest authorization(String authorization) {
        header("Authorization", String.valueOf(authorization));
        return this;
    }
    
    public CapturesRefundRequest contentType(String contentType) {
        header("Content-Type", String.valueOf(contentType));
        return this;
    }
    
    public CapturesRefundRequest payPalAuthAssertion(String payPalAuthAssertion) {
        header("PayPal-Auth-Assertion", String.valueOf(payPalAuthAssertion));
        return this;
    }
    
    public CapturesRefundRequest payPalRequestId(String payPalRequestId) {
        header("PayPal-Request-Id", String.valueOf(payPalRequestId));
        return this;
    }
    
    public CapturesRefundRequest prefer(String prefer) {
        header("Prefer", String.valueOf(prefer));
        return this;
    }
    
    

    public CapturesRefundRequest requestBody(RefundRequest refundRequest) {
        super.requestBody(refundRequest);
        return this;
    }
}
