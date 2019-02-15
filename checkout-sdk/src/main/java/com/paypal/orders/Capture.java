// This class was generated on Fri, 15 Feb 2019 14:59:09 PST by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// Capture.java
// @version 0.1.0-dev+8fcb5f
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
	* The data required to capture application context.
	*/
	@SerializedName("application_context")
	private CaptureApplicationContext applicationContext;

	public CaptureApplicationContext applicationContext() { return applicationContext; }
	
	public Capture applicationContext(CaptureApplicationContext applicationContext) {
	    this.applicationContext = applicationContext;
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
