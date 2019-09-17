// This class was generated on Wed, 11 Sep 2019 17:50:29 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// NetAmountBreakdown.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/+xWTW8bNxC991cM9tQCsuX0AwV0C5IGaIsmRmoUKFxDGZGzIhHuUBkOrS6K/PeC+yFLWvXDhi9tfFqQM5zhe3h8O39UV+2GqkXFpEtsYmZdroTwvY1brmbVLygeV4FeY/M3WT9SOyRUs+olJSN+oz5ytaiuHAGTQn/qHN6SZmGysHXEoI7AZBFi00Ksu7VQndmCT2B9XZMQK9QSm5PJl9heYgA0ppQvRYW6QENiHLKCi8GmsuUFSuF0Xs2q5yLY9sgvZtVbQvuGQ1stagyJysaH7IXsbuNS4oZEPaVqcb3j7KfI1E5JMpFvSZTsQNUBQSeCU8J2KJHtwBzUUQCh9oxsPAZQQU5oyqkZpGwcYAKEFQZkQxAFNtg2hTyb6fEwJxXP6xOghysvTbR0iPgoMoV7rU6IzoxDQaMk8P3Pb86+/vLZt3dElLM3n89tNGnuWWktWArMrRcyOhdKOh+Tz0pymn8B6lDBW2L1tad0IKB7MaKSjwjhHMLH2T+ycoshH7Ix7kxZ6CIz2DpvHDR+7RRWtPgtX1x8ZXLovtSvgu9Xzxk6Lkg6dQzQCtLg3xO8++Hy13c9CSgEHBW03XiDIbRQS68dDOd90flY9agHWDK+wbA7cbrX1euXe71SXll/6y3ZcsMI6mJOyFZdOt1uPiJ8FWVwgZ584NysSMp7Hy+yCWgoDQ/iQCEzSERw/WLce1GEcF/ZPIYybva0Qb8XI1rTUlBpKpHj8J1UjiNTyYwZUDJ69i0pSeN5kPtgHhphMJ7eSiPvmYxGQI7qSB72Oh7kFylmMbQcGx4An8b+g55xgpV/aRqKsiY9Tc009klRcx8/7ana+5cOE8h3H7K/xUD9sygvIbPXcaDotXeHC15FaVCVbPm/jnYbZedG3QVg69V1tTTCs2/A+rXXBJ3zEUhn5kODnYtFz/ootO2bzV+MJBtsy+rUQDIJPY0jT+PI0zjyPxtHbj5+9icAAAD//w==
// DO NOT EDIT
package com.paypal.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The net amount. Returned when the currency of the refund is different from the currency of the PayPal account where the merchant holds their funds.
 */
@Model
public class NetAmountBreakdown {

    // Required default constructor
    public NetAmountBreakdown() {}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("converted_amount")
	private Money convertedAmount;

	public Money convertedAmount() { return convertedAmount; }
	
	public NetAmountBreakdown convertedAmount(Money convertedAmount) {
	    this.convertedAmount = convertedAmount;
	    return this;
	}

	/**
	* The exchange rate that determines the amount to convert from one currency to another currency.
	*/
	@SerializedName("exchange_rate")
	private ExchangeRate exchangeRate;

	public ExchangeRate exchangeRate() { return exchangeRate; }
	
	public NetAmountBreakdown exchangeRate(ExchangeRate exchangeRate) {
	    this.exchangeRate = exchangeRate;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("payable_amount")
	private Money payableAmount;

	public Money payableAmount() { return payableAmount; }
	
	public NetAmountBreakdown payableAmount(Money payableAmount) {
	    this.payableAmount = payableAmount;
	    return this;
	}
}
