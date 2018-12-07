// This class was generated on Tue, 04 Dec 2018 17:38:27 PST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// PurchaseUnitRequest.java
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
 * The purchase unit request. Includes required information for the payment contract.
 */
@Model
public class PurchaseUnitRequest {

    // Required default constructor
    public PurchaseUnitRequest() {}

	/**
	* REQUIRED
	* The total order amount with an optional breakdown that provides details, such as the total item amount, total tax amount, shipping, handling, insurance, and discounts, if any.<br/>If you specify `amount.breakdown`, the amount equals `item_total` plus `tax_total` plus `shipping` plus `handling` plus `insurance` minus `shipping_discount`.<br/>The amount must be a positive number. For listed of supported currencies and decimal precision, see the PayPal REST APIs <a href="/docs/integration/direct/rest/currency-codes/">Currency Codes</a>.
	*/
	@SerializedName("amount")
	private AmountWithBreakdown amount;

	public AmountWithBreakdown amount() { return amount; }
	
	public PurchaseUnitRequest amount(AmountWithBreakdown amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The API caller-provided external ID. Used to reconcile client transactions with PayPal transactions. Appears in transaction and settlement reports but is not visible to the payer.
	*/
	@SerializedName("custom_id")
	private String customId;

	public String customId() { return customId; }
	
	public PurchaseUnitRequest customId(String customId) {
	    this.customId = customId;
	    return this;
	}

	/**
	* The purchase description.
	*/
	@SerializedName("description")
	private String description;

	public String description() { return description; }
	
	public PurchaseUnitRequest description(String description) {
	    this.description = description;
	    return this;
	}

	/**
	* The API caller-provided external invoice number for this order. Appears in both the payer's transaction history and the emails that the payer receives.
	*/
	@SerializedName("invoice_id")
	private String invoiceId;

	public String invoiceId() { return invoiceId; }
	
	public PurchaseUnitRequest invoiceId(String invoiceId) {
	    this.invoiceId = invoiceId;
	    return this;
	}

	/**
	* An array of items that the customer is purchasing from the merchant.
	*/
	@SerializedName(value = "items", listClass = Item.class)
	private List<Item> items;

	public List<Item> items() { return items; }
	
	public PurchaseUnitRequest items(List<Item> items) {
	    this.items = items;
	    return this;
	}

	/**
	* The merchant who receives the funds and fulfills the order. The merchant is also known as the payee.
	*/
	@SerializedName("payee")
	private Payee payee;

	public Payee payee() { return payee; }
	
	public PurchaseUnitRequest payee(Payee payee) {
	    this.payee = payee;
	    return this;
	}

	/**
	* Any additional payment instructions for PayPal for Partner customers. Enables features for partners and marketplaces, such as delayed disbursement and collection of a platform fee. Applies during order creation for captured payments or during capture of authorized payments.
	*/
	@SerializedName("payment_instruction")
	private PaymentInstruction paymentInstruction;

	public PaymentInstruction paymentInstruction() { return paymentInstruction; }
	
	public PurchaseUnitRequest paymentInstruction(PaymentInstruction paymentInstruction) {
	    this.paymentInstruction = paymentInstruction;
	    return this;
	}

	/**
	* The ID for the purchase unit. Required for multiple `purchase_units` or if an order must be updated by using `PATCH`.
	*/
	@SerializedName("reference_id")
	private String referenceId;

	public String referenceId() { return referenceId; }
	
	public PurchaseUnitRequest referenceId(String referenceId) {
	    this.referenceId = referenceId;
	    return this;
	}

	/**
	* The shipping details.
	*/
	@SerializedName("shipping")
	private ShippingDetails shipping;

	public ShippingDetails shipping() { return shipping; }
	
	public PurchaseUnitRequest shipping(ShippingDetails shipping) {
	    this.shipping = shipping;
	    return this;
	}

	/**
	* The payment descriptor on the payer's credit card statement.
	*/
	@SerializedName("soft_descriptor")
	private String softDescriptor;

	public String softDescriptor() { return softDescriptor; }
	
	public PurchaseUnitRequest softDescriptor(String softDescriptor) {
	    this.softDescriptor = softDescriptor;
	    return this;
	}
}
