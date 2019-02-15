// This class was generated on Fri, 15 Feb 2019 14:59:09 PST by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// PurchaseUnitRequest.java
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
	* The ID for the purchase unit. Required for multiple `purchase_units` or if an order must be updated by using `PATCH`. If you omit the `reference_id` for an order with one purchase unit, PayPal sets the `reference_id` to `default`.
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
