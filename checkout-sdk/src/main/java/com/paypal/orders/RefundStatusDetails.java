// This class was generated on Tue, 04 Dec 2018 17:38:27 PST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// RefundStatusDetails.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data H4sIAAAAAAAC/6yPwUoDMRCG7z7FMOdFPO+tsFWKspZavIiQ0cyaQEzWmQQJ0neXNrAqvXr8v2T++eYL93Vm7HHHU4kWHjLlojBwJh8UO3wk8fQSeKT34zfs8JbrTxhYX8XP2aeIPe4dg22jkCbIjkFar556L7HDlQjVtvSqwx2TvY+hYj9RUD6Cj+KF7QK2kmaW7Fmxf1p0NYuPb+d+wqQp/rFc0Llre4JPV3+7OtJTNNv1OGzGGwNJwFyvNnfrwfzTJbGEcHg+XHwDAAD//w==
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The details of the refund status.
 */
@Model
public class RefundStatusDetails {

    // Required default constructor
    public RefundStatusDetails() {}

	/**
	* The reason why the refund has the `PENDING` or `FAILED` status.
	*/
	@SerializedName("reason")
	private String reason;

	public String reason() { return reason; }
	
	public RefundStatusDetails reason(String reason) {
	    this.reason = reason;
	    return this;
	}
}
