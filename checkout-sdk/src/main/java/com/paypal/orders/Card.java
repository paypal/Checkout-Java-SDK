// This class was generated on Tue, 04 Dec 2018 17:38:27 PST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// Card.java
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
 * The payment card to use to fund a payment. Can be a credit or debit card.
 */
@Model
public class Card {

    // Required default constructor
    public Card() {}

	/**
	* The portable international postal address. Maps to [AddressValidationMetadata](https://github.com/googlei18n/libaddressinput/wiki/AddressValidationMetadata) and HTML 5.1 [Autofilling form controls: the autocomplete attribute](https://www.w3.org/TR/html51/sec-forms.html#autofilling-form-controls-the-autocomplete-attribute).
	*/
	@SerializedName("billing_address")
	private AddressPortable billingAddress;

	public AddressPortable billingAddress() { return billingAddress; }
	
	public Card billingAddress(AddressPortable billingAddress) {
	    this.billingAddress = billingAddress;
	    return this;
	}

	/**
	* The card network or brand. Applies to credit, debit, gift, and payment cards.
	*/
	@SerializedName("card_type")
	private String cardType;

	public String cardType() { return cardType; }
	
	public Card cardType(String cardType) {
	    this.cardType = cardType;
	    return this;
	}

	/**
	* REQUIRED
	* The year and month, in ISO-8601 `YYYY-MM` date format. See [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("expiry")
	private String expiry;

	public String expiry() { return expiry; }
	
	public Card expiry(String expiry) {
	    this.expiry = expiry;
	    return this;
	}

	/**
	* The PayPal-generated ID for the card.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Card id(String id) {
	    this.id = id;
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
	* The card holder's name as it appears on the card.
	*/
	@SerializedName("name")
	private String name;

	public String name() { return name; }
	
	public Card name(String name) {
	    this.name = name;
	    return this;
	}

	/**
	* REQUIRED
	* The primary account number (PAN) for the payment card.
	*/
	@SerializedName("number")
	private String number;

	public String number() { return number; }
	
	public Card number(String number) {
	    this.number = number;
	    return this;
	}

	/**
	* The three- or four-digit security code of the card. Also known as the CVV, CVC, CVN, CVE, or CID.
	*/
	@SerializedName("security_code")
	private String securityCode;

	public String securityCode() { return securityCode; }
	
	public Card securityCode(String securityCode) {
	    this.securityCode = securityCode;
	    return this;
	}
}
