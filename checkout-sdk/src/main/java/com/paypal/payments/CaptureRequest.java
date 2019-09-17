// This class was generated on Wed, 11 Sep 2019 17:50:29 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// CaptureRequest.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/+xY328cNRB+568Y3QsgXXIl/YGUJ0ILIiDaqA1IqFSXWXv21orX3o7tpAvif0dj797d3h2iVUMlpKgPzY49tuebbz6P78/ZZd/R7HT2FLuYmOAlvU0U4mw++xXZYGXpObYyYTaf/UT95uMZBcWmi8a7jXsAMrEhBoTOs4yBZ4gNQZ2sBUyx8Wz+IA3Y+uQi+BrQbds77Fty8Xg2n50xY1+O92A+e0moXzjbz05rtIHE8DYZJr02XLDviKOhMDt9vQ7sZ++o3w+n7D8Jam2ahnbZEKjETE71gG599NpLmLVx6JRBC5HRBVTiNYeQVAMYAKFCi06R4DDEBjrR3cUXIhu32g9wPPJSeU2TOHdH9sN9HRsmOlINMqpIDOevXhw9Ovnq6w0Q4vvmi4X2KiyMi7RilAUW2jCpuGAKcTFOPpLJYfElxAYjGE0umtpQyMQYJ30QIpHTDiAuWfvX/F9RuUGbpmiMln0U8sgcbhujGmjNqolQ0env6cGDhyrZ/D+VL2vK15mDjAVxZscQmkRqzTXB1Y8Xv10VEJAJnI8Q+84otLaHmgt30B6XRRfjqjt7gCZlWrRrj8N7XT5/trVXSJU2N0aTlhN6iI1PAZ2OTTi83WKM8PuhgHkAH1xqK2Kp3PEgnUVFYSiICUPmEIjg9dPR9lSI8KG0uQtmvNniRuW9JXT75JBatktVpGxCkt2RKVnOnTYKIwW4bSjLX+8TKHTQ4jUBam1KZkGNMokrNC7EjOwB9YNXFCF6uJJwrsDUeUXtM2cEN6dleFhue4dhhcM7ZKw3i2fw1qt/7LIfqWjvWcDG3XijaGn0JEET834pn12cg5QZ8VHHvtQBvYvEEtvgOxK7zoQ3ATxr4mM46zpCDmAcVD42OfIOe+LPw7bmQ2NC9FyuCJlDLRobSgmufYBJkbmh8Ingcj7SMvpl3nyC2O7IFLSsZLXnFgcCyHTAyqdYwAkUo6VC1v8FQgODl8JeTvlA+3AdnrQB7fD4LnT9gcqBLZcilRfYX4iK5z85OhIRD9G3xOEYvnNyrAA1YVGMOjcQeV7ICLbI1xSL9m4aDk0We9KgTagSh5yhPF15a6nkQZouEe0oCYaaKKfQyt2hk/CoUB8UE24umCIKeiMFnsfpo2DIwntiFv77Xmc72GW72+8cGt2XiDo5HTYXZkNWg3dQUYO2lsiEoS2xavDj29Ndbg65WNZEB0i5NRqmdNwZ2athlDPK4W+QjU9CJyGL8m1rQhAqziGaLsxzMr3L6d5N2JP75vu++b5vvu+b77tovuWOp2WFgQ7evpuxyaVLh0miKeYOoh5gGuUZbhu/7iOGnx9E3UVA6mRrY20xDy3e5bavCYA2eLh2/taJjIytySfQjdwRTYLPliVqzRTCQRAkk+yGPi1fvNkHBp+BYZX16vpt8pG2iRYie7cqluc+jgW22LbDL508Cp48grUkhUxrtNbfkoaKai+fTsPJ48f/NAtr0TLBsuwh/CobfDNsurFAMCt3DD/4W7ohnmevFTniXKyoFHWRpAN6Z9rUgiW3ik0pATeNXrJ58nj76CXbHUZBDW6IRzWUYnWQXAZJv+8pgd6ZENd1vAvzp+nyR+7uvoqm9n3qDC1o6bvPn41yKxUALYZr0gJQGHrGuPFApfI1PMhReTqSzilIgeDW5GeAYZ17VkMD7Lt+AZjyDpXtgZziPic2X/TQse/YUETuc/+C5ffCbzHQwxPxTYHye5WcJGUQypDs3bRnb4Z/n/0NAAD//w==
// DO NOT EDIT
package com.paypal.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Captures either a portion or the full authorized amount of an authorized payment.
 */
@Model
public class CaptureRequest {

    // Required default constructor
    public CaptureRequest() {}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("amount")
	private Money amount;

	public Money amount() { return amount; }
	
	public CaptureRequest amount(Money amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* Indicates whether you can make additional captures against the authorized payment. Set to `true` if you do not intend to capture additional payments against the authorization. Set to `false` if you intend to capture additional payments against the authorization.
	*/
	@SerializedName("final_capture")
	private Boolean finalCapture;

	public Boolean finalCapture() { return finalCapture; }
	
	public CaptureRequest finalCapture(Boolean finalCapture) {
	    this.finalCapture = finalCapture;
	    return this;
	}

	/**
	* The API caller-provided external invoice number for this order. Appears in both the payer's transaction history and the emails that the payer receives.
	*/
	@SerializedName("invoice_id")
	private String invoiceId;

	public String invoiceId() { return invoiceId; }
	
	public CaptureRequest invoiceId(String invoiceId) {
	    this.invoiceId = invoiceId;
	    return this;
	}

	/**
	* An informational note about this settlement. Appears in both the payer's transaction history and the emails that the payer receives.
	*/
	@SerializedName("note_to_payer")
	private String noteToPayer;

	public String noteToPayer() { return noteToPayer; }
	
	public CaptureRequest noteToPayer(String noteToPayer) {
	    this.noteToPayer = noteToPayer;
	    return this;
	}

	/**
	* Any additional payment instructions for PayPal for Partner customers. Enables features for partners and marketplaces, such as delayed disbursement and collection of a platform fee. Applies during order creation for captured payments or during capture of authorized payments.
	*/
	@SerializedName("payment_instruction")
	private PaymentInstruction paymentInstruction;

	public PaymentInstruction paymentInstruction() { return paymentInstruction; }
	
	public CaptureRequest paymentInstruction(PaymentInstruction paymentInstruction) {
	    this.paymentInstruction = paymentInstruction;
	    return this;
	}
}
