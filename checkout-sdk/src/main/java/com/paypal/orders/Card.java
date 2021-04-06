// This class was generated on Thu, 16 May 2019 09:53:44 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// Card.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data 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
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.paypal.http.annotations.*;
/**
 * The payment card to use to fund a payment. Can be a credit or debit card.
 */
@Model
public class Card {

    // Required default constructor
    public Card() {}

	/**
	* The card network or brand. Applies to credit, debit, gift, and payment cards.
	*/
	@SerializedName("type")
	private String cardType;

	public String cardType() { return cardType; }

	public Card cardType(String cardType) {
	    this.cardType = cardType;
	    return this;
	}

	/**
	* The last digits of the payment card.
	*/
	@SerializedName("last_digits")
	private String lastDigits;

	public String lastDigits() { return lastDigits; }

	public Card lastDigits(String lastDigits) {
	    this.lastDigits = lastDigits;
	    return this;
	}

	/**
	* The three- or four-digit security code of the card. Also known as the CVV, CVC, CVN, CVE, or CID.
	*/
	@SerializedName("brand")
	private String brand;

	public String brand() { return brand; }

	public Card brand(String brand) {
	    this.brand = brand;
	    return this;
	}

	/**
	 * Results of Authentication such as 3D Secure.
	 */
	@SerializedName("authentication_result")
	private AuthenticationResponse authenticationResponse;

	public AuthenticationResponse authenticationResponse() { return authenticationResponse; }

	public Card authenticationResponse(AuthenticationResponse authenticationResponse) {
		this.authenticationResponse = authenticationResponse;
		return this;
	}
}
