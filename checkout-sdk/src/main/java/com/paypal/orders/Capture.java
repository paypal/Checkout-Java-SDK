// This class was generated on Tue, 04 Dec 2018 17:38:27 PST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// Capture.java
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
 * A captured payment.
 */
@Model
public class Capture {

    // Required default constructor
    public Capture() {}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("amount")
	private Money amount;

	public Money amount() { return amount; }
	
	public Capture amount(Money amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote>
	*/
	@SerializedName("create_time")
	private String createTime;

	public String createTime() { return createTime; }
	
	public Capture createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The funds that are held on behalf of the merchant.
	*/
	@SerializedName("disbursement_mode")
	private String disbursementMode;

	public String disbursementMode() { return disbursementMode; }
	
	public Capture disbursementMode(String disbursementMode) {
	    this.disbursementMode = disbursementMode;
	    return this;
	}

	/**
	* Indicates whether you can make additional captures against the authorized payment. Set to `true` if you do not intend to capture additional payments against the authorization. Set to `false` if you intend to capture additional payments against the authorization.
	*/
	@SerializedName("final_capture")
	private Boolean finalCapture;

	public Boolean finalCapture() { return finalCapture; }
	
	public Capture finalCapture(Boolean finalCapture) {
	    this.finalCapture = finalCapture;
	    return this;
	}

	/**
	* The PayPal-generated ID for the captured payment.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Capture id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* The API caller-provided external invoice number for this order. Appears in both the payer's transaction history and the emails that the payer receives.
	*/
	@SerializedName("invoice_id")
	private String invoiceId;

	public String invoiceId() { return invoiceId; }
	
	public Capture invoiceId(String invoiceId) {
	    this.invoiceId = invoiceId;
	    return this;
	}

	/**
	* An array of related [HATEOAS links](/docs/api/overview/#hateoas-links).
	*/
	@SerializedName(value = "links", listClass = LinkDescription.class)
	private List<LinkDescription> links;

	public List<LinkDescription> links() { return links; }
	
	public Capture links(List<LinkDescription> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The level of protection offered as defined by [PayPal Seller Protection for Merchants](https://www.paypal.com/us/webapps/mpp/security/seller-protection).
	*/
	@SerializedName("seller_protection")
	private SellerProtection sellerProtection;

	public SellerProtection sellerProtection() { return sellerProtection; }
	
	public Capture sellerProtection(SellerProtection sellerProtection) {
	    this.sellerProtection = sellerProtection;
	    return this;
	}

	/**
	* The detailed breakdown of the captured payment.
	*/
	@SerializedName("seller_receivable_breakdown")
	private MerchantReceivableBreakdown sellerReceivableBreakdown;

	public MerchantReceivableBreakdown sellerReceivableBreakdown() { return sellerReceivableBreakdown; }
	
	public Capture sellerReceivableBreakdown(MerchantReceivableBreakdown sellerReceivableBreakdown) {
	    this.sellerReceivableBreakdown = sellerReceivableBreakdown;
	    return this;
	}

	/**
	* The status of the captured payment.
	*/
	@SerializedName("status")
	private String status;

	public String status() { return status; }
	
	public Capture status(String status) {
	    this.status = status;
	    return this;
	}

	/**
	* The details of the captured payment status.
	*/
	@SerializedName("status_details")
	private CaptureStatusDetails statusDetails;

	public CaptureStatusDetails statusDetails() { return statusDetails; }
	
	public Capture statusDetails(CaptureStatusDetails statusDetails) {
	    this.statusDetails = statusDetails;
	    return this;
	}

	/**
	* The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote>
	*/
	@SerializedName("update_time")
	private String updateTime;

	public String updateTime() { return updateTime; }
	
	public Capture updateTime(String updateTime) {
	    this.updateTime = updateTime;
	    return this;
	}
}
