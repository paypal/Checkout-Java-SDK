// This class was generated on Tue, 04 Dec 2018 17:38:27 PST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// Item.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data H4sIAAAAAAAC/+yUX0vkPBTG799PcciVQrW+f+CFuRNlwRX/sLoLiyt6JjkzDZMmNTnRLYvffcm0HVuriLsy7IVXJU9Okl9Onzw/xHldkZiIA6ZSZOILeo1TQ8dYJlVk4pDqh8E+Bel1xdpZMRHnBYEiRm0CzJwHLgg0UxmAHUwJquhlgYHUtsjErvdYN4ftZOIToTqxphaTGZpASbiJ2pNaCafeVeRZUxCTixVmYK/tfAwqkWnufD0A7olj8AQKXQVwXdHvUtpozH32IqrqofRph/pznSbVkPeq18Rt06cP3ArPtDbNQjKFZvO61rKPv0Z4E9Gy5qEJeuIzpF3FNhzFwMm4CHeFMwQ2llPy64EPizjgbsZj5MBOLmBBVGk7h2g1w8bZ4efNwQt8Y0scOUv1GJnx+wC5GY+RZfSerKwBrQIsXbS8pEWYaYtWajTAHm1AmVZlEKIsAAMgTNGglUsjVViXZBlUpDXkSYt8JZ0auv7xzPi6F1x4oi1ZoEfJ5OHg7GTrv3/+/v+hEWnt5UaunAy5tkxzj2mDXGlPknNPgfOueCsVh3wTuEAGrciynmkKy5/dFa3Ho7do4rAbnTLuwnImg7tCywJKPS/Sy5p8izs7/8poll9qRkY3o10Ly16QX7qjvVq6qdELguuPp1+vmyagJ7COU2pricbUMPONd9BsN5vm3a6PzgBFUpdoViuePuv8eL93VohTpW+1SuFr2QEXLga0iovw9HF5d8MP7aP0bfPbSAE3W4FUBiWF9kEMHJJBIIKLvU7bS0Z4rW3ewhmXL2dBCqKr5m0PDDLU/7RsGN/3PRreo+E9Gl4TDZf3f/0EAAD//w==
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The details for the items to be purchased.
 */
@Model
public class Item {

    // Required default constructor
    public Item() {}

	/**
	* The item category type.
	*/
	@SerializedName("category")
	private String category;

	public String category() { return category; }
	
	public Item category(String category) {
	    this.category = category;
	    return this;
	}

	/**
	* The detailed item description.
	*/
	@SerializedName("description")
	private String description;

	public String description() { return description; }
	
	public Item description(String description) {
	    this.description = description;
	    return this;
	}

	/**
	* REQUIRED
	* The item name or title.
	*/
	@SerializedName("name")
	private String name;

	public String name() { return name; }
	
	public Item name(String name) {
	    this.name = name;
	    return this;
	}

	/**
	* REQUIRED
	* The item quantity. Must be a whole number.
	*/
	@SerializedName("quantity")
	private String quantity;

	public String quantity() { return quantity; }
	
	public Item quantity(String quantity) {
	    this.quantity = quantity;
	    return this;
	}

	/**
	* The stock keeping unit (SKU) for the item.
	*/
	@SerializedName("sku")
	private String sku;

	public String sku() { return sku; }
	
	public Item sku(String sku) {
	    this.sku = sku;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("tax")
	private Money tax;

	public Money tax() { return tax; }
	
	public Item tax(Money tax) {
	    this.tax = tax;
	    return this;
	}

	/**
	* REQUIRED
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("unit_amount")
	private Money unitAmount;

	public Money unitAmount() { return unitAmount; }
	
	public Item unitAmount(Money unitAmount) {
	    this.unitAmount = unitAmount;
	    return this;
	}
}
