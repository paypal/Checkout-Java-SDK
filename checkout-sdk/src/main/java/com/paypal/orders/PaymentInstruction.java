// This class was generated on Tue, 04 Dec 2018 17:38:27 PST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// PaymentInstruction.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data H4sIAAAAAAAC/7xXTW/cNhO+v79ioFMCbHbzOh8FfKqTNKhbJDFat0CRBs4sOVoRpkhlSO5GLfrfiyElr7TrFE3rBj7YGs5wvp55hv69uuw7qk6rC+xbchHOXYicVDTeVYvqZ2SDa0uvsRWlalF9T/3+4wUFxabLyqfVmesBtTbyiRa64UazvzFA7RkusL9AO/zJ0RGDSiH6ljgs4RsnDgPUhDExFZOu6AVAp6FFvqbYWVQUFhCSagADaLLYkwZtwjpxoOxb1JW3lrJ78DUgdBZj7bmFmmgJZ11nDQXQiY3bgGct4TBhNhDfCjsJRI8JBfA8qg9n+eIUG8/mt4nislpUZ8zYlxo/XFQ/EOo3zvbVaY02kAg+JMOkbwQX7DviaChUp29vuhOiuDtuyDTZq9ZrmnXottN5yy4bgjo5HSA2GAGZoCGrwTtYU4O2lsxiQ9ASqwZd/LcpuWTtH4s96sZevCQ6zm7s1FVNFGaZHZ4cAhFQYpTgt8jGJ4GTgEX5tjUhCBQXEE0XFrmZ3uV2Hzbs6T9v2CvvqD/OCFufXJylciM67oxKzORUn2Fc9DIiEWrj0CmDFiKjC5jhvZ8FhDVadIogz06ZQ53ovwfkGPKVOgTj4clxum9jw0QPVIOMKhLD+Y9vHjw++f9X+0KI7bt7K+1VWBkXacO5cSttmFRcMYW4GpUfiHJY3S/QNppcNLWMepyU9rMqEjn9NZw/VZUt2jSvxig5rkI+WcCuMaqB1myaCGs6/TU9fPhIJZt/U/mypnydOci1IC58VVKTTK25Jnj/3cUv7/fz7XyE2HdGobU91Fywg3ZZLl2Ntx74AE3KtELbg8Xtvi5fv5j4CmmtzdZo0hKhh9j4FNDp2ITb3a3GDF96zn3iofjgUrsmlokeAykLYBiIGUIWEIjg7fNR9lyA8LmwuQtkvJtg49XAoPAMw21chz3NITJKjiGiKaKxJfUpOcOu8cCkyGwHmBduF/qok62NtUWct9wSLqe2JgDa4OHa+Z0TEhHFHMMXYA1rZEUZPWeMifS4CF1aW6P2c13Aj11XtjdpWPez6qxKMnDuInudFGmIHkLqOs8RUiBQGCjAPbmHlpslPGM07pKJYAIa2JnYDG+Y+7BriIcyAbVo7BVqzRTyI2H0fGW0lFcmD7dorGR+x4v0U5WdxTSr7uHJcYUlaS6bEW1+2GQbGGyGCV5br64/JB9pOsghsnebInnt40hgq6kcfuqkA08fww3lh0wbaK3fSQOp9vLpNJw8efIpLaxlV0iniw+Z3+Lg68HpXgLBbNwSvvU72hIvstWGHHEmQ1SKOkFOix9Nm1qw5DaxKcBy8+yloSdPpqGXeeowStVgSzxuGyFDB8nlIum/GyXQRxPiDU8elvnLwGeC4Bl45vJj6AxPfJkLhvMX4zoTjoEWwzVpKVAY3uRxb4FK5WfOQPcCQSfrQ1ogI5qHLzaGdf6fwNBQ9kO7AEzZw9r2QE5xnxubH1LQse/YUETu8/tQ6M/XmZgfnYhtCoUcyElThkUUkr2b5++7/PO/PwEAAP//
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Any additional payment instructions for PayPal for Partner customers. Enables features for partners and marketplaces, such as delayed disbursement and collection of a platform fee. Applies during order creation for captured payments or during capture of authorized payments.
 */
@Model
public class PaymentInstruction {

    // Required default constructor
    public PaymentInstruction() {}

	/**
	* The funds that are held on behalf of the merchant.
	*/
	@SerializedName("disbursement_mode")
	private String disbursementMode;

	public String disbursementMode() { return disbursementMode; }
	
	public PaymentInstruction disbursementMode(String disbursementMode) {
	    this.disbursementMode = disbursementMode;
	    return this;
	}

	/**
	* An array of various fees, commissions, tips, or donations.
	*/
	@SerializedName(value = "platform_fees", listClass = PlatformFee.class)
	private List<PlatformFee> platformFees;

	public List<PlatformFee> platformFees() { return platformFees; }
	
	public PaymentInstruction platformFees(List<PlatformFee> platformFees) {
	    this.platformFees = platformFees;
	    return this;
	}
}
