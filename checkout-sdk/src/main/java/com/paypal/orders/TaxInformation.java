// This class was generated on Tue, 04 Dec 2018 17:38:27 PST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// TaxInformation.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data H4sIAAAAAAAC/6yRTUvDQBBA7/6KYS9eQrDgKTelFxG0aPAi0k6zk2Zxs7vObLSL9L9L0g8/2kMLHmd4TPLefqoyBVKFKnEJN6723GI03qlMPSEbnFu6w7YHVKZuKX0PY5KKTRjgQpUNQexPjMHXEBuCqpPoW+Icyh8TGAG04uHV+Q8HKAMbMPXgtY8NzCIup0bPAJ3eDtOYAs0AmYDprTNMOleZumLGtP7/i0w9EOp7Z5MqarRC/WKN7hYT9oE4GhJVPO/MJbJxi33h9ad/ae9W+/JbwXPZdMjhsQvBcyQNtefBc4JpgrbXbclFaCk2XoN3NuVQpmAqtDZlA7qJaQRGI6gaZKwisYD1bjHcM06bd6M7tDKkGl0exOadGEciJCcVi9z9CeY6a1fZkdWGBzuQbrs/oh/06IkR/8HwZXX2BQAA//8=
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The tax ID of the customer. The customer is also known as the payer. Both `tax_id` and `tax_id_type` are required.
 */
@Model
public class TaxInformation {

    // Required default constructor
    public TaxInformation() {}

	/**
	* REQUIRED
	* The customer's tax ID. Supported for the PayPal payment method only. Typically, the tax ID is 11 characters long for individuals and 14 characters long for businesses.
	*/
	@SerializedName("tax_id")
	private String taxId;

	public String taxId() { return taxId; }
	
	public TaxInformation taxId(String taxId) {
	    this.taxId = taxId;
	    return this;
	}

	/**
	* REQUIRED
	* The customer's tax ID type. Supported for the PayPal payment method only.
	*/
	@SerializedName("tax_id_type")
	private String taxIdType;

	public String taxIdType() { return taxIdType; }
	
	public TaxInformation taxIdType(String taxIdType) {
	    this.taxIdType = taxIdType;
	    return this;
	}
}
