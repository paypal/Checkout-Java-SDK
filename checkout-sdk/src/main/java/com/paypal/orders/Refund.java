// This class was generated on Tue, 04 Dec 2018 17:38:27 PST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// Refund.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data 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
// DO NOT EDIT
package com.paypal.orders;

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
	* An array of related [HATEOAS links](/docs/api/overview/#hateoas-links).
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
	* The details of the refund status.
	*/
	@SerializedName("status_details")
	private RefundStatusDetails statusDetails;

	public RefundStatusDetails statusDetails() { return statusDetails; }
	
	public Refund statusDetails(RefundStatusDetails statusDetails) {
	    this.statusDetails = statusDetails;
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
