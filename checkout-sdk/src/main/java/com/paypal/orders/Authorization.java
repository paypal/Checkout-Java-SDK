// This class was generated on Fri, 15 Feb 2019 14:59:09 PST by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// Authorization.java
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
