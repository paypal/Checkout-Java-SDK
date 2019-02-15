// This class was generated on Fri, 15 Feb 2019 14:59:09 PST by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// PaymentSource.java
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
