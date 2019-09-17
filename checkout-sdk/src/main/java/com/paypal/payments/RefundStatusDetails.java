// This class was generated on Wed, 11 Sep 2019 17:50:29 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// RefundStatusDetails.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/6yPQUsDMRCF7/6KYc6LeN5bYasUZS1SvIg0o5k1gZisMwkSpP9dNGVRFE8e583H43tvuKszY4/CU4l2r5ly0b3lTD4odnhL4ukh8EjPf2GXXI8EdjiwPoqfs08Re9w5hiMIaYLsGFoLtJZT7HAlQrWZnHV4w2SvY6jYTxSUP4KX4oXtEmwlzSzZs2J/t2zQLD4+/SZNmuI3yyX66dpe8OrqV1dH+nma7XocNuOFgSRgzlebq/Vg/mlJLCEc7g8n7wAAAP//
// DO NOT EDIT
package com.paypal.payments;

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
