// This class was generated on Tue, 04 Dec 2018 17:38:27 PST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// Authorization.java
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
	* An array of related [HATEOAS links](/docs/api/overview/#hateoas-links).
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
