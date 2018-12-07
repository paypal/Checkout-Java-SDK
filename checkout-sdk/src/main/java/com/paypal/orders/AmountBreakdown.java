// This class was generated on Tue, 04 Dec 2018 17:38:27 PST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// AmountBreakdown.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data H4sIAAAAAAAC/+yYX2vcOBTF3/dTXPS0C06c3S0U5i1NKLSlSWhDoaQhuSPdiUVkyb2SkpiS715kjyf2zJQSyFNHT4mO/t1z5vrHeH6I87YhMROHtYs2wBsmvFXu3opCfEHWODd0gnVaIQrxgdqnwTF5yboJ2lkxE+cVwXzYDG4BoSLA7tD9p1OhYXenFXlQFFAbDz7KCtBDcAEN6ED1clexlAI+rBRf6abR9qaACq0y3X/a+shoJRWAVoHSXqbFvgC9ALTtvijEITO2vdGDQnwiVKfWtGK2QOMpCd+jZlIr4YxdQxw0eTG7WEX00VlqN3MZSpnkMxI3c5KRmaxsu4J7b7BwDAgLbdFKnWwzWo8y7SpWISHM0SSv4BgabGuyAVSkl/PoA/dVr5kcSr6STtHE6frMpt2LUDHRnqyQUQZiePf5dO/Vf/++fgoi7b38u1RO+lLbQDeM6YBSaSYZSiYfymHxXlrsy38gVBhAK7JBLzT5ruOGRc9KJHBcC8RGYx6L36ZyhyZO0xiUzRS6mQLuKy0rqPVNFWBOs2/x4OB/GU33l/qR0f3o0EKXBXHXHUtryanRtwTX78++XvchIBNYFyC0jZZoTAsL7nsHzX5/aDmcunYHKJK6RrPasf2u85Pj0V0+zpVOz7FKFToIlYserQqV335dOTh867j7nHgZPthYz4kTMIZCGoOS/PKBmHRIAZ4ILo4G7Sg1wnPb5iU643LUG7+gwgpLk/YYq5kLmQuZCzvHhUD1VffNZgqGsZzJkMmQybBrZBhebibdMRIzFTIVMhV2lQpXww8bW/Ewns2cyJzInNg1TgR82PJaMVYzFzIXMhf+MC5cPv71EwAA//8=
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The breakdown of the amount. Breakdown provides details such as total item amount, total tax amount, shipping, handling, insurance, and discounts, if any.
 */
@Model
public class AmountBreakdown {

    // Required default constructor
    public AmountBreakdown() {}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("handling")
	private Money handling;

	public Money handling() { return handling; }
	
	public AmountBreakdown handling(Money handling) {
	    this.handling = handling;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("insurance")
	private Money insurance;

	public Money insurance() { return insurance; }
	
	public AmountBreakdown insurance(Money insurance) {
	    this.insurance = insurance;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("item_total")
	private Money itemTotal;

	public Money itemTotal() { return itemTotal; }
	
	public AmountBreakdown itemTotal(Money itemTotal) {
	    this.itemTotal = itemTotal;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("shipping")
	private Money shipping;

	public Money shipping() { return shipping; }
	
	public AmountBreakdown shipping(Money shipping) {
	    this.shipping = shipping;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("shipping_discount")
	private Money shippingDiscount;

	public Money shippingDiscount() { return shippingDiscount; }
	
	public AmountBreakdown shippingDiscount(Money shippingDiscount) {
	    this.shippingDiscount = shippingDiscount;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("tax_total")
	private Money taxTotal;

	public Money taxTotal() { return taxTotal; }
	
	public AmountBreakdown taxTotal(Money taxTotal) {
	    this.taxTotal = taxTotal;
	    return this;
	}
}
