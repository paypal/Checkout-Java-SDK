// This class was generated on Tue, 04 Dec 2018 17:38:27 PST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// ExchangeRate.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data H4sIAAAAAAAC/+STQWvVQBDH736KYU8KeY0VRXg3wQoiWKnFSyky7v5fdiDZfZ2dPA3S7y55MS+UCF5663FnNv+d34/Mb3c97OG27uKXj5wa0BUbXOW+sQr/aPGZu7HtKvcJw3J4j+JV9iY5ua27jiDMAcoGsshGAQbtJKGQRRB3uU9GlsnndIAa7TR3lBPI96pIfhibnLJF6Kl25ir3TpWHadKXlbsCh8vUDm6747ZgLNz1oginwhfNe6gJitvenBiLqaRmDVdyrx7f5wcfsK57a/QbiwpsfGRlb1D6+PVy8/rV+duFy+eA2+d1yL7UkgyN8hhQB1F4qxXF6vnyZrxc6heTRAlIJjv5K/GxrKS+be+r/6ox1gb2bzXr3pNSc+C2xwMhc2WtYVK1ME+rcEYXd70cuMW0FuMm9EmM8u4INP17Cxd9yNqxGQJxoaMrKGWlAC8dt3QcgH6KxWOWZTp/Q0EasTIexkyVJp4emL/bZ0n2KNpu75/9AQAA//8=
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The exchange rate that determines the amount to convert from one currency to another currency.
 */
@Model
public class ExchangeRate {

    // Required default constructor
    public ExchangeRate() {}

	/**
	* The [three-character ISO-4217 currency code](/docs/integration/direct/rest/currency-codes/) that identifies the currency.
	*/
	@SerializedName("source_currency")
	private String sourceCurrency;

	public String sourceCurrency() { return sourceCurrency; }
	
	public ExchangeRate sourceCurrency(String sourceCurrency) {
	    this.sourceCurrency = sourceCurrency;
	    return this;
	}

	/**
	* The [three-character ISO-4217 currency code](/docs/integration/direct/rest/currency-codes/) that identifies the currency.
	*/
	@SerializedName("target_currency")
	private String targetCurrency;

	public String targetCurrency() { return targetCurrency; }
	
	public ExchangeRate targetCurrency(String targetCurrency) {
	    this.targetCurrency = targetCurrency;
	    return this;
	}

	/**
	* The target currency amount. Equivalent to one unit of the source currency. Formatted as integer or decimal value with one to 15 digits to the right of the decimal point.
	*/
	@SerializedName("value")
	private String value;

	public String value() { return value; }
	
	public ExchangeRate value(String value) {
	    this.value = value;
	    return this;
	}
}
