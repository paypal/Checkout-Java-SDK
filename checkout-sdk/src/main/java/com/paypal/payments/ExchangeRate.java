// This class was generated on Wed, 11 Sep 2019 17:50:29 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// ExchangeRate.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/+STQWvVQBDH736KYU8KeY0VRXg3QQURrGjxUkoZd/8vO5Dsvs5Ongbpd5e8NHmUFLz05jHzn8zu78fOH3c57OG2Dr995NTgRtngKveDVfhniy/cPRZ/xnCfuMq9R/Eqe5Oc3NZdRtDcTmM7WWSjAIN2klDIIoi73Ccjy+RzOkCNdpo7ygnke1UkP4whp2wRutTOXOXeqfIwXftl5b6Bw0VqB7fdcVswFm57UYSl8FXzHmqC4rZXC3AxldSsSUvu1eNmPvAB6zpbo19ZVGDjIyt7g9Kn7xeb16/O3564fA64fl6H7EstydAojwPqIApvtaJYPTdvxuZSv5gkSkAy2cm9xKeykvq2vav+qcZYG9jjatbZf6XmwG3/cC/mylrDpOrEPK3CGX247eXALaa1GDehT2KUd0eg6e2duOhj1o7NEIgLHV1BKSsFeOm4peMF6JdYPM6yTOdvKEgjVsaPcaZKE5cD5v/2WZI9ibbru2d/AQAA//8=
// DO NOT EDIT
package com.paypal.payments;

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
