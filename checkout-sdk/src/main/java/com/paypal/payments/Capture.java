// This class was generated on Wed, 11 Sep 2019 17:50:29 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// Capture.java
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
	* The details of the captured payment status.
	*/
	@SerializedName("status_details")
	private CaptureStatusDetails captureStatusDetails;

	public CaptureStatusDetails captureStatusDetails() { return captureStatusDetails; }
	
	public Capture captureStatusDetails(CaptureStatusDetails captureStatusDetails) {
	    this.captureStatusDetails = captureStatusDetails;
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
	* The API caller-provided external ID. Used to reconcile API caller-initiated transactions with PayPal transactions. Appears in transaction and settlement reports.
	*/
	@SerializedName("custom_id")
	private String customId;

	public String customId() { return customId; }
	
	public Capture customId(String customId) {
	    this.customId = customId;
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
	* An array of related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links).
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
