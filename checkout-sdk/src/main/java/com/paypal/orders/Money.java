// This class was generated on Tue, 04 Dec 2018 17:38:27 PST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// Money.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data H4sIAAAAAAAC/6yT32vUQBDH3/0rhn1SyDXnDxDurbQIKrZFD0HOYud2J5fBzW6cna0E6f8uSS7X3l1BCj6Fmd358f3ku3/MsmvJLMynGKgzhfmKwrj2dIFNnzaF+UjdfXBOyQq3yjGYhVnWBDaLULAdYHCATcxBoYoCCBUHDJbRgwqGhLavKiBlWwMmQFijx2AJokCLXUNBwWU6MYU5FcFu3GxemM+E7jL4ziwq9In6xK/MQm6XuJLYkihTMovVTlNS4bA5FjWt/MNGR3sKD0+O5a60FqKZrVHQKgm8/3I5e/Pq5dt7EH3t9fPSRZtKDkobwb5B6VjIaimUtJwuz/rLqXwBWqMCOwrKFVMCfYD2SURU8gGQkL2/K/5J5RZ93qcxZY4pDCcF/K7Z1tDwplZY0+J7ns9f2+yHL42R5zE6DTCwIBncsZXWK/X8k+Dmw9W3mxECCkGICtq1bNH7DioZvYP+ZGxaTl0PZoAjyw36XcXjs5YX5w9mpbx2fMuOXL9hBK1jThic1unxceWk8F2U4T/JFj6E3KxJIFa7RVqPltL2Qew5pIBEBKuzKXfWG+Gptvkfzri+e/YXAAD//w==
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The currency and amount for a financial transaction, such as a balance or payment due.
 */
@Model
public class Money {

    // Required default constructor
    public Money() {}

	/**
	* REQUIRED
	* The [three-character ISO-4217 currency code](/docs/integration/direct/rest/currency-codes/) that identifies the currency.
	*/
	@SerializedName("currency_code")
	private String currencyCode;

	public String currencyCode() { return currencyCode; }
	
	public Money currencyCode(String currencyCode) {
	    this.currencyCode = currencyCode;
	    return this;
	}

	/**
	* REQUIRED
	* The value, which might be:<ul><li>An integer for currencies like `JPY` that are not typically fractional.</li><li>A decimal fraction for currencies like `TND` that are subdivided into thousandths.</li></ul>For the required number of decimal places for a currency code, see [Currency Codes](/docs/integration/direct/rest/currency-codes/).
	*/
	@SerializedName("value")
	private String value;

	public String value() { return value; }
	
	public Money value(String value) {
	    this.value = value;
	    return this;
	}
}
