// This class was generated on Tue, 04 Dec 2018 17:38:27 PST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// Customer.java
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
 * The customer who approves and pays for the order. The customer is also known as the payer.
 */
@Model
public class Customer {

    // Required default constructor
    public Customer() {}

	/**
	* The portable international postal address. Maps to [AddressValidationMetadata](https://github.com/googlei18n/libaddressinput/wiki/AddressValidationMetadata) and HTML 5.1 [Autofilling form controls: the autocomplete attribute](https://www.w3.org/TR/html51/sec-forms.html#autofilling-form-controls-the-autocomplete-attribute).
	*/
	@SerializedName("address")
	private AddressPortable address;

	public AddressPortable address() { return address; }
	
	public Customer address(AddressPortable address) {
	    this.address = address;
	    return this;
	}

	/**
	* The stand-alone date, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). To represent special legal values, such as a date of birth, you should use dates with no associated time or time-zone data. Whenever possible, use the standard `date_time` type. This regular expression does not validate all dates. For example, February 31 is valid and nothing is known about leap years.
	*/
	@SerializedName("birth_date")
	private String birthDate;

	public String birthDate() { return birthDate; }
	
	public Customer birthDate(String birthDate) {
	    this.birthDate = birthDate;
	    return this;
	}

	/**
	* The internationalized email address.<blockquote><strong>Note:</strong> Up to 64 characters are allowed before and 255 characters are allowed after the <code>@</code> sign. However, the generally accepted maximum length for an email address is 254 characters. The pattern verifies that an unquoted <code>@</code> sign exists.</blockquote>
	*/
	@SerializedName("email_address")
	private String emailAddress;

	public String emailAddress() { return emailAddress; }
	
	public Customer emailAddress(String emailAddress) {
	    this.emailAddress = emailAddress;
	    return this;
	}

	/**
	* The name of the party.
	*/
	@SerializedName("name")
	private Name name;

	public Name name() { return name; }
	
	public Customer name(Name name) {
	    this.name = name;
	    return this;
	}

	/**
	* The PayPal payer ID, which is a masked version of the PayPal account number intended for use with third parties. The account number is reversibly encrypted and a proprietary variant of Base32 is used to encode the result.
	*/
	@SerializedName("payer_id")
	private String payerId;

	public String payerId() { return payerId; }
	
	public Customer payerId(String payerId) {
	    this.payerId = payerId;
	    return this;
	}

	/**
	* The phone information.
	*/
	@SerializedName("phone")
	private Phone phone;

	public Phone phone() { return phone; }
	
	public Customer phone(Phone phone) {
	    this.phone = phone;
	    return this;
	}

	/**
	* The tax ID of the customer. The customer is also known as the payer. Both `tax_id` and `tax_id_type` are required.
	*/
	@SerializedName("tax_info")
	private TaxInformation taxInfo;

	public TaxInformation taxInfo() { return taxInfo; }
	
	public Customer taxInfo(TaxInformation taxInfo) {
	    this.taxInfo = taxInfo;
	    return this;
	}
}
