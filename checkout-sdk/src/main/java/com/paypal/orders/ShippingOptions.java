// This class was generated on Tue, 04 Dec 2018 17:38:27 PST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// ShippingOptions.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data H4sIAAAAAAAC/7xVzW4bNxC+9ykGe7ENrLXuD1DAN8NpWjWoLVROgcINmhE5EgfhksyQjLMtesgD9EF67Sskfa+Cu1rJklK0SYqcFvO3w+/jx5lfq5suUHVezQ2HwG4F1yGxd7Gqqx9QGBeWrrAtGVVdPaJuazygqIT77Oq8mjpls6YIfqiHIBTJJdKw6CAZgoAdUdOSKIMuQfIbrxQjGg7gBQKrZ5BDCbIAJ2qP48kELmz0wGOTUhnHE48dyZLa6yeTqq4uRLAbYJ7V1feE+trZrjpfoo1UHM8zC+mNYyY+kCSmWJ3fbgj6zjvqDlnB1meXdrjZuHYZujEEKouQUx2g0zDkwdILICzZoVOMFpKgi6hKVQ0xKwMYAWGBFp2iniLsWnIJdKZ3wpck/yO8mITd6hDfeOKflde0A3M/coj2NhkhOlUGBVUigen8+vSLzz79cstDqX1y3GivYsMu0Uqw/KDRLKRSIxRTMyafluTYnEAymIA1ucRLXqthTPpAQly29rf6X1l5gTbvsjF6DlnoIzXcGVYGWl6ZBAs6/ymfnX2usu2/NFiWB+vCQc8FSS+ONbSC1PIzgqffzn58OpCAQuB8gtQFVmhtB0sZpIN2Mvy0Gf+61wM0KW7Rbire3uvm6sG9XjEvNL9gTbqcsLxgnyM6nUx8e7tmRPjQS39PsiYfXG4XJOCXm4MEi4ri+j3sKKSGSAS3l6PvsgjhXWXzfyjjyX/QBusdYfTmriouIDt+nmmr4X4Crq0OcH+2gTI+knv/yfbeQre4ILuDZ/TsQ9JbG6Lxd+5gwhuy/VhvCxwfqY+2PibAEMQHYUwHYx2OabKawEMhgnFH1fB4PpvDTNgLp+6e/6uX4fUfmvvCMISRhfr8dVX31+/5Jb955WD55hWY/PrPkwlME3AEIeXbllyRdy/5csD7uBYE1iu0/EvJGOD1Dio6/shXk0r4/s2sHYcTqKVkfL8XhyG0vZU7dCkWJCtK+xt3nkPwUhbquGDLBDiafzOdzaZXXx+VTXQ0m14+ejw7+tA1u35cn/wNAAD//w==
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Includes options presented by the payee/merchant to the payer to ship or pick up their item(s). Also includes the shipping options elected by the payer.
 */
@Model
public class ShippingOptions {

    // Required default constructor
    public ShippingOptions() {}

	/**
	* REQUIRED
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("amount")
	private Money amount;

	public Money amount() { return amount; }
	
	public ShippingOptions amount(Money amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* REQUIRED
	* A unique identifier to identify a shipping option chosen by the payer.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public ShippingOptions id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* REQUIRED
	* A description shown to the payer to help them choose the most appropriate shipping option (e.g. Free Shipping, USPS Priority Shipping, Expédition prioritaire USPS, USPS yōuxiān fā huò). It is recommended that the description be localized to the locale of the payer.
	*/
	@SerializedName("label")
	private String label;

	public String label() { return label; }
	
	public ShippingOptions label(String label) {
	    this.label = label;
	    return this;
	}

	/**
	* The method by which the payer wants to get their item(s). Supported options are 'SHIPPING' or 'PICKUP'.
	*/
	@SerializedName("type")
	private String type;

	public String type() { return type; }
	
	public ShippingOptions type(String type) {
	    this.type = type;
	    return this;
	}
}
