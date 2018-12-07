// This class was generated on Tue, 04 Dec 2018 17:38:27 PST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// Token.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data H4sIAAAAAAAC/6yQTUsEMQyG7/6KkHMVz3MT5rIIOsjiRTzEbWan2GnHNEWq7H+Xrs76MYgIe8zzEvK8ecV1mRgbXMdHDmjwlsTRg+crGitGg5dcPoeW00bcpC6GujQwaF10L2xhojJyUEgxy6YG0OdggebgDA1eiFB5P3lu8IbJXgdfsOnJJ67gKTthewCdxIlFHSds7g6yScWF7dLW2W+++3Fp3FHpyJ9uObCQsoVVC30U0LnNv0RV8g/PkL3fmT9ltcZfdT/Ary+mimBkHaIFHUjhmRLkxLb+eq6zr7Fqj9HhfnfyBgAA//8=
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The tokenized payment source to fund a payment.
 */
@Model
public class Token {

    // Required default constructor
    public Token() {}

	/**
	* REQUIRED
	* The PayPal-generated ID for the token.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Token id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* REQUIRED
	* The tokenization method that was used to generate the ID.
	*/
	@SerializedName("type")
	private String type;

	public String type() { return type; }
	
	public Token type(String type) {
	    this.type = type;
	    return this;
	}
}
