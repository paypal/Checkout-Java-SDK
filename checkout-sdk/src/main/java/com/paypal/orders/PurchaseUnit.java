// This class was generated on Tue, 04 Dec 2018 17:38:27 PST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// PurchaseUnit.java
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
 * The purchase unit details. Used to capture required information for the payment contract.
 */
@Model
public class PurchaseUnit {

    // Required default constructor
    public PurchaseUnit() {}

	/**
	* The total order amount with an optional breakdown that provides details, such as the total item amount, total tax amount, shipping, handling, insurance, and discounts, if any.<br/>If you specify `amount.breakdown`, the amount equals `item_total` plus `tax_total` plus `shipping` plus `handling` plus `insurance` minus `shipping_discount`.<br/>The amount must be a positive number. For listed of supported currencies and decimal precision, see the PayPal REST APIs <a href="/docs/integration/direct/rest/currency-codes/">Currency Codes</a>.
	*/
	@SerializedName("amount")
	private AmountWithBreakdown amount;

	public AmountWithBreakdown amount() { return amount; }
	
	public PurchaseUnit amount(AmountWithBreakdown amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The API caller-provided external ID. Used to reconcile API caller-initiated transactions with PayPal transactions. Appears in transaction and settlement reports.
	*/
	@SerializedName("custom_id")
	private String customId;

	public String customId() { return customId; }
	
	public PurchaseUnit customId(String customId) {
	    this.customId = customId;
	    return this;
	}

	/**
	* The purchase description.
	*/
	@SerializedName("description")
	private String description;

	public String description() { return description; }
	
	public PurchaseUnit description(String description) {
	    this.description = description;
	    return this;
	}

	/**
	* The PayPal-generated ID for the purchase unit. This ID appears in both the payer's transaction history and the emails that the payer receives. In addition, this ID is available in transaction and settlement reports that merchants and API callers can use to reconcile transactions. This ID is only available when an order is saved by calling <code>v2/checkout/orders/id/save</code>.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public PurchaseUnit id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* The API caller-provided external invoice ID for this order.
	*/
	@SerializedName("invoice_id")
	private String invoiceId;

	public String invoiceId() { return invoiceId; }
	
	public PurchaseUnit invoiceId(String invoiceId) {
	    this.invoiceId = invoiceId;
	    return this;
	}

	/**
	* An array of items that the customer purchases from the merchant.
	*/
	@SerializedName(value = "items", listClass = Item.class)
	private List<Item> items;

	public List<Item> items() { return items; }
	
	public PurchaseUnit items(List<Item> items) {
	    this.items = items;
	    return this;
	}

	/**
	* The merchant who receives the funds and fulfills the order. The merchant is also known as the payee.
	*/
	@SerializedName("payee")
	private Payee payee;

	public Payee payee() { return payee; }
	
	public PurchaseUnit payee(Payee payee) {
	    this.payee = payee;
	    return this;
	}

	/**
	* Any additional payment instructions for PayPal for Partner customers. Enables features for partners and marketplaces, such as delayed disbursement and collection of a platform fee. Applies during order creation for captured payments or during capture of authorized payments.
	*/
	@SerializedName("payment_instruction")
	private PaymentInstruction paymentInstruction;

	public PaymentInstruction paymentInstruction() { return paymentInstruction; }
	
	public PurchaseUnit paymentInstruction(PaymentInstruction paymentInstruction) {
	    this.paymentInstruction = paymentInstruction;
	    return this;
	}

	/**
	* The collection of payments, or transactions, for a purchase unit in an order. For example, authorized payments, captured payments, and refunds.
	*/
	@SerializedName("payments")
	private PaymentCollection payments;

	public PaymentCollection payments() { return payments; }
	
	public PurchaseUnit payments(PaymentCollection payments) {
	    this.payments = payments;
	    return this;
	}

	/**
	* The API caller-provided external ID for the purchase unit. Required for multiple purchase units when you must update the order through `PATCH`.
	*/
	@SerializedName("reference_id")
	private String referenceId;

	public String referenceId() { return referenceId; }
	
	public PurchaseUnit referenceId(String referenceId) {
	    this.referenceId = referenceId;
	    return this;
	}

	/**
	* The shipping details.
	*/
	@SerializedName("shipping")
	private ShippingDetails shipping;

	public ShippingDetails shipping() { return shipping; }
	
	public PurchaseUnit shipping(ShippingDetails shipping) {
	    this.shipping = shipping;
	    return this;
	}

	/**
	* The payment descriptor on the customer's credit card statement of account transactions.
	*/
	@SerializedName("soft_descriptor")
	private String softDescriptor;

	public String softDescriptor() { return softDescriptor; }
	
	public PurchaseUnit softDescriptor(String softDescriptor) {
	    this.softDescriptor = softDescriptor;
	    return this;
	}
}
