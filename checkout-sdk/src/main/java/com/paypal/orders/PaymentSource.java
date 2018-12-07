// This class was generated on Tue, 04 Dec 2018 17:38:27 PST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// PaymentSource.java
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
 * The payment source definition.
 */
@Model
public class PaymentSource {

    // Required default constructor
    public PaymentSource() {}

	/**
	* The payment card to use to fund a payment. Can be a credit or debit card.
	*/
	@SerializedName("card")
	private Card card;

	public Card card() { return card; }
	
	public PaymentSource card(Card card) {
	    this.card = card;
	    return this;
	}

	/**
	* The tokenized payment source to fund a payment.
	*/
	@SerializedName("token")
	private Token token;

	public Token token() { return token; }
	
	public PaymentSource token(Token token) {
	    this.token = token;
	    return this;
	}
}
