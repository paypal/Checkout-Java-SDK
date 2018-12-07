// This class was generated on Tue, 04 Dec 2018 17:38:27 PST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// AuthorizeRequest.java
// @version 0.1.0-dev+904328-dirty
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
 * The request to authorize an order.
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
