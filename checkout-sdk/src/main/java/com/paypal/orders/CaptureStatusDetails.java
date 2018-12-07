// This class was generated on Tue, 04 Dec 2018 17:38:27 PST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// CaptureStatusDetails.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data H4sIAAAAAAAC/6SPz0rEQAyH7z5FyLmI597EKbIIddHFiwiN26wdmJ0ZkxQZZN9d1oGKFLx4zJc/vy+fuCuZscUbyjYLw6ORzQqOjXxQbPCJxNNr4J6O5zls8I7LT+FY9+Kz+RSxxd3EMNZVSAewiWFfD4+QqRw5Guh3wiU2eC1CpeZfNfjANN7HULA9UFA+g/fZC48L2ErKLOZZsX1ezNXEx7e1qTBpir98F7S2ri34mMpf1uAVhm3Xu01/O0ASGFzXbzo3/PedOIdwejldfAEAAP//
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The details of the captured payment status.
 */
@Model
public class CaptureStatusDetails {

    // Required default constructor
    public CaptureStatusDetails() {}

	/**
	* The reason why the captured payment status is `PENDING` or `DENIED`.
	*/
	@SerializedName("reason")
	private String reason;

	public String reason() { return reason; }
	
	public CaptureStatusDetails reason(String reason) {
	    this.reason = reason;
	    return this;
	}
}
