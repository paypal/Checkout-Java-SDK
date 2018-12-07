// This class was generated on Tue, 04 Dec 2018 17:38:27 PST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// PaymentMethod.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data H4sIAAAAAAAC/6yRT0szQQzG7++nGHLevnjem+BN1CLFi0iJs0/dgflnJnsYpN9d1tqxsgoeekyekPx+5I02NYN6WnMNiGpuoGMaqKMHFsfPHrcc5pw6ukb9Kq5QrLisLkXqaTPC2KloChDDcTABYkeOavLn3izYQRAtyn/q6FKE6+H0RUf34OEu+kr9jn3B3HidnGBojbWkDFGHQv1jgy4qLr4sYTNXYHs4OW85ZV9mS5Uj/aqNNY+SJjmDQ5y833d/EpFtgYfVHzy+Rb9/ZHWcahbh48smRaMnuqY4xVnMnvb/3gEAAP//
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The customer and merchant payment preferences.
 */
@Model
public class PaymentMethod {

    // Required default constructor
    public PaymentMethod() {}

	/**
	* The merchant-preferred payment sources.
	*/
	@SerializedName("payee_preferred")
	private String payeePreferred;

	public String payeePreferred() { return payeePreferred; }
	
	public PaymentMethod payeePreferred(String payeePreferred) {
	    this.payeePreferred = payeePreferred;
	    return this;
	}

	/**
	* The customer-selected payment method on the merchant site.
	*/
	@SerializedName("payer_selected")
	private String payerSelected;

	public String payerSelected() { return payerSelected; }
	
	public PaymentMethod payerSelected(String payerSelected) {
	    this.payerSelected = payerSelected;
	    return this;
	}
}
