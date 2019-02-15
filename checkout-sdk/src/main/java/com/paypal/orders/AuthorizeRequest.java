// This class was generated on Fri, 15 Feb 2019 14:59:09 PST by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// AuthorizeRequest.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data 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
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The authorize an order request.
 */
@Model
public class AuthorizeRequest {

    // Required default constructor
    public AuthorizeRequest() {}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("amount")
	private Money amount;

	public Money amount() { return amount; }
	
	public AuthorizeRequest amount(Money amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The payment source definition.
	*/
	@SerializedName("payment_source")
	private PaymentSource paymentSource;

	public PaymentSource paymentSource() { return paymentSource; }
	
	public AuthorizeRequest paymentSource(PaymentSource paymentSource) {
	    this.paymentSource = paymentSource;
	    return this;
	}

	/**
	* The API caller-provided external ID for the purchase unit. Required for multiple purchase units.
	*/
	@SerializedName("reference_id")
	private String referenceId;

	public String referenceId() { return referenceId; }
	
	public AuthorizeRequest referenceId(String referenceId) {
	    this.referenceId = referenceId;
	    return this;
	}
}
