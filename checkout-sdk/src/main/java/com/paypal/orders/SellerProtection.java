// This class was generated on Tue, 04 Dec 2018 17:38:27 PST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// SellerProtection.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data H4sIAAAAAAAC/9SSwYrUQBCG7z5F0SeFOPHkIbcFEUTUQRcvyyI1yZ9JQ093W1XZ0Mi+u3QWsjuOIB73mD+Vqvq+1C93XTJc574hBAjtJRl68ym6xn1n8XwI+MynWuIa9xHl8eEdtBef1+LOXU+ggDsESiPlrQ2lcYRgIFYaMPqIgQ6FbvZc9hzoYiyNSegTpJ84mt6+nMyydm27LMsuc8kcdn06tbO2Cw6cs7annFtFP4u30ura7/Xj/Fc717grES4PoG8a9xU8fImhuG7koKjBz9kLhi3YS8oQ81DX3WyK1MTH46WXwWueDT96NhyT1K+emvrr63N3V5G4rljV9SkOvuZKNrERC6hPd6vD6sYmkAlH5ZXvD7y3/4sX5xDum38yqrHN51xbdM7yIQ6+oiotE2zCxcbklRD80R8CVqKHf/bkZnb0Pgn5OCY5cQ0aUuAZ3cwq9fb+xW8AAAD//w==
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The level of protection offered as defined by [PayPal Seller Protection for Merchants](https://www.paypal.com/us/webapps/mpp/security/seller-protection).
 */
@Model
public class SellerProtection {

    // Required default constructor
    public SellerProtection() {}

	/**
	* An array of conditions that are covered for the transaction.
	*/
	@SerializedName(value = "dispute_categories", listClass = String.class)
	private List<String> disputeCategories;

	public List<String> disputeCategories() { return disputeCategories; }
	
	public SellerProtection disputeCategories(List<String> disputeCategories) {
	    this.disputeCategories = disputeCategories;
	    return this;
	}

	/**
	* Indicates whether the transaction is eligible for seller protection. For information, see [PayPal Seller Protection for Merchants](https://www.paypal.com/us/webapps/mpp/security/seller-protection).
	*/
	@SerializedName("status")
	private String status;

	public String status() { return status; }
	
	public SellerProtection status(String status) {
	    this.status = status;
	    return this;
	}
}
