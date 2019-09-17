// This class was generated on Wed, 11 Sep 2019 17:50:29 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// Refund.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data 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
// DO NOT EDIT
package com.paypal.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The refund information.
 */
@Model
public class Refund {

    // Required default constructor
    public Refund() {}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("amount")
	private Money amount;

	public Money amount() { return amount; }
	
	public Refund amount(Money amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote>
	*/
	@SerializedName("create_time")
	private String createTime;

	public String createTime() { return createTime; }
	
	public Refund createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The PayPal-generated ID for the refund.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Refund id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* The API caller-provided external invoice number for this order. Appears in both the payer's transaction history and the emails that the payer receives.
	*/
	@SerializedName("invoice_id")
	private String invoiceId;

	public String invoiceId() { return invoiceId; }
	
	public Refund invoiceId(String invoiceId) {
	    this.invoiceId = invoiceId;
	    return this;
	}

	/**
	* An array of related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links).
	*/
	@SerializedName(value = "links", listClass = LinkDescription.class)
	private List<LinkDescription> links;

	public List<LinkDescription> links() { return links; }
	
	public Refund links(List<LinkDescription> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The reason for the refund. Appears in both the payer's transaction history and the emails that the payer receives.
	*/
	@SerializedName("note_to_payer")
	private String noteToPayer;

	public String noteToPayer() { return noteToPayer; }
	
	public Refund noteToPayer(String noteToPayer) {
	    this.noteToPayer = noteToPayer;
	    return this;
	}

	/**
	* The details of the refund status.
	*/
	@SerializedName("status_details")
	private RefundStatusDetails refundStatusDetails;

	public RefundStatusDetails refundStatusDetails() { return refundStatusDetails; }
	
	public Refund refundStatusDetails(RefundStatusDetails refundStatusDetails) {
	    this.refundStatusDetails = refundStatusDetails;
	    return this;
	}

	/**
	* The breakdown of the refund.
	*/
	@SerializedName("seller_payable_breakdown")
	private MerchantPayableBreakdown sellerPayableBreakdown;

	public MerchantPayableBreakdown sellerPayableBreakdown() { return sellerPayableBreakdown; }
	
	public Refund sellerPayableBreakdown(MerchantPayableBreakdown sellerPayableBreakdown) {
	    this.sellerPayableBreakdown = sellerPayableBreakdown;
	    return this;
	}

	/**
	* The status of the capture.
	*/
	@SerializedName("status")
	private String status;

	public String status() { return status; }
	
	public Refund status(String status) {
	    this.status = status;
	    return this;
	}

	/**
	* The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote>
	*/
	@SerializedName("update_time")
	private String updateTime;

	public String updateTime() { return updateTime; }
	
	public Refund updateTime(String updateTime) {
	    this.updateTime = updateTime;
	    return this;
	}
}
