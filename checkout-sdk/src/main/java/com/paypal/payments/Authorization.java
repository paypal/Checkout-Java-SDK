// This class was generated on Wed, 11 Sep 2019 17:50:29 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// Authorization.java
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
 * The authorized payment transaction.
 */
@Model
public class Authorization {

    // Required default constructor
    public Authorization() {}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("amount")
	private Money amount;

	public Money amount() { return amount; }
	
	public Authorization amount(Money amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The details of the authorized payment status.
	*/
	@SerializedName("status_details")
	private AuthorizationStatusDetails authorizationStatusDetails;

	public AuthorizationStatusDetails authorizationStatusDetails() { return authorizationStatusDetails; }
	
	public Authorization authorizationStatusDetails(AuthorizationStatusDetails authorizationStatusDetails) {
	    this.authorizationStatusDetails = authorizationStatusDetails;
	    return this;
	}

	/**
	* The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote>
	*/
	@SerializedName("create_time")
	private String createTime;

	public String createTime() { return createTime; }
	
	public Authorization createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The API caller-provided external ID. Used to reconcile API caller-initiated transactions with PayPal transactions. Appears in transaction and settlement reports.
	*/
	@SerializedName("custom_id")
	private String customId;

	public String customId() { return customId; }
	
	public Authorization customId(String customId) {
	    this.customId = customId;
	    return this;
	}

	/**
	* The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote>
	*/
	@SerializedName("expiration_time")
	private String expirationTime;

	public String expirationTime() { return expirationTime; }
	
	public Authorization expirationTime(String expirationTime) {
	    this.expirationTime = expirationTime;
	    return this;
	}

	/**
	* The PayPal-generated ID for the authorized payment.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Authorization id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* The API caller-provided external invoice number for this order. Appears in both the payer's transaction history and the emails that the payer receives.
	*/
	@SerializedName("invoice_id")
	private String invoiceId;

	public String invoiceId() { return invoiceId; }
	
	public Authorization invoiceId(String invoiceId) {
	    this.invoiceId = invoiceId;
	    return this;
	}

	/**
	* An array of related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links).
	*/
	@SerializedName(value = "links", listClass = LinkDescription.class)
	private List<LinkDescription> links;

	public List<LinkDescription> links() { return links; }
	
	public Authorization links(List<LinkDescription> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The level of protection offered as defined by [PayPal Seller Protection for Merchants](https://www.paypal.com/us/webapps/mpp/security/seller-protection).
	*/
	@SerializedName("seller_protection")
	private SellerProtection sellerProtection;

	public SellerProtection sellerProtection() { return sellerProtection; }
	
	public Authorization sellerProtection(SellerProtection sellerProtection) {
	    this.sellerProtection = sellerProtection;
	    return this;
	}

	/**
	* The status for the authorized payment.
	*/
	@SerializedName("status")
	private String status;

	public String status() { return status; }
	
	public Authorization status(String status) {
	    this.status = status;
	    return this;
	}

	/**
	* The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote>
	*/
	@SerializedName("update_time")
	private String updateTime;

	public String updateTime() { return updateTime; }
	
	public Authorization updateTime(String updateTime) {
	    this.updateTime = updateTime;
	    return this;
	}
}
