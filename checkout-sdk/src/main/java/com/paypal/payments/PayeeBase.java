// This class was generated on Wed, 11 Sep 2019 17:50:29 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// PayeeBase.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/6xTTW/UMBC98ytGPkfbqqUc9gSoBxBSqVDhAqiatV82Vp1xOnZ2G1D/O7KzLd0WBBJcIvnZTzPvI9/NxTTALM3AE3C54gTTmE+snlcBZ9w/uXuHaQebxpwiWfVD9lHM0lx0IIfMPiRqo1LuQD3UdiyZtl0khYXfINWbdhSXiMVRO4bWhzDDUR10QRcPuT4RhxTpSuJWiOeHdauFacwrVZ5mGYeN+QB27yVMZtlySCjA9egV7h441zhAs0cyy8/3BqSsXtZPxaNnH/Z0V+SSnVOk9EsTvGSocEE4+G9wVDm04yy+jIeHx3YVor26HmNGPc9fm7JGWc/IWcxYzvDBQ5w+DpQjvXhOtmNlm6GJWEEcQtzC0QptLEdxdHRy8rtX3GbMKc0zbHS7VV7uhv5EKPm1LOhN3GIDbSprDYFyCBOxtRgyHPV84/uxpwBZ5662gGVffUnz6OTh6nPaA+fiGm2gvvW1JJwLe5RqkvvbLQk3PuU7lw8e2/yPjZExhNvmj7W56+6ld3vl2cefVuecp3MOtdxKb08b2nbedvUPoJ7TFVwxKPkoFNuawo7B1sZRMsnYr6C1guLgagRjAm197ih3Xh0NXLXMtj/mJVLUCaswEcTqVIMtVWIaNA7qkVkn2hTBkssarznh+KhwxwRXqgkpodT9FGkMefE/bP96++wHAAAA//8=
// DO NOT EDIT
package com.paypal.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The details for the merchant who receives the funds and fulfills the order. The merchant is also known as the payee.
 */
@Model
public class PayeeBase {

    // Required default constructor
    public PayeeBase() {}

	/**
	* The internationalized email address.<blockquote><strong>Note:</strong> Up to 64 characters are allowed before and 255 characters are allowed after the <code>@</code> sign. However, the generally accepted maximum length for an email address is 254 characters. The pattern verifies that an unquoted <code>@</code> sign exists.</blockquote>
	*/
	@SerializedName("email_address")
	private String email;

	public String email() { return email; }
	
	public PayeeBase email(String email) {
	    this.email = email;
	    return this;
	}

	/**
	* The PayPal payer ID, which is a masked version of the PayPal account number intended for use with third parties. The account number is reversibly encrypted and a proprietary variant of Base32 is used to encode the result.
	*/
	@SerializedName("merchant_id")
	private String merchantId;

	public String merchantId() { return merchantId; }
	
	public PayeeBase merchantId(String merchantId) {
	    this.merchantId = merchantId;
	    return this;
	}
}
