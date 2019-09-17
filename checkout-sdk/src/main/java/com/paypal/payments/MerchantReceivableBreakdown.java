// This class was generated on Wed, 11 Sep 2019 17:50:29 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// MerchantReceivableBreakdown.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/+xZ32/bNhB+319x0NMGuHGbNh2Qp/XHiv1A26DLBgxd4Z7Jk0WEItUjaVcb+r8PR0m2ZbtYtqUD1vgp0B0p8j5+36cz80dx2TZUnBfPiVWFLsIrUmSWOLcEj5nwSvuVKybFL8hGgi+wluHFpPiR2s3DUwqKTRONd8V5cVkRaIpoLGmYD28BX0KsCBQ2MTFpaLCtycWTYlI8Ysa228rdSfGKUL90ti3OS7SBJPAuGSa9Dlywb4ijoVCcv14XQe+lhgXNGCPtb3o3valgN7NfzjACZATECqNUSFwbRyGXhbVPLkL0oLxbEkco2dfgHYFKzORUK0l0PlbE69jNVR8iG7fYLzv4xIpmw4Kjwvdz+6W/jhUT3VEVMqpIDN//9PLOg9N7X2/qUl7Tmy+n2qswNS7SglFeMNWGScUpU4jTYfAdGRymX3UgGk0umtL0IN4UKi5Z+2Hyl9BE5AXFw9Ds524VNEu0aSySIbIPQwfVpuZOCifw7btklmipk4UoITkTBx/ouLepC555rjFG0oABMlbE4Bk0KVOjhbwBWJlY5XdFD/fOQJuFiUEe5J1sFtV6gWFe482/d5kM25st4J57R+0+bgv2Icw6BEbw7ST2UdzA5/TgJqVnQCiNQ6cMWoiMLqCSWRMISVUCFcIcLTpFAlZvqqATfXprGbY8E+KOqt3N/A+1Ezl9eunkzARWlVEV1Jm9czr/Ld29e18lm/9S92RN9/TIrbUh7OhLk0qtuSJ4+8PFr287EJAJnI8Q28YotLaFkjvuoD3pXjod3rqzxlo7w4zDa12+eLq1VkhzbZZGk5YdiiB9Cuh0rMLh5aZDhc88d/LtwQeX6rmIv9yI2KKi0AtixJAJBCJ4/WSIPREi/F3a3AQzruEOjuIhbxiFj85wdIajM9w2Z2iwbdDOShrzYxQ+OsPRGY7O8Nk6Q2Mxlp7rXu27BrGVDWOP2MmMGfPIAcomBZhhZCd6jk4IQRQmoHxdmxCMd2Ei2Tn7K2JcUM735xWCVwblB1r+EXaNy5yH/9w/PuKTB7qnY+d09MejP94Cf8SWaDbHQAfbp01u1D59pHPq7qe74gWmergAX1UeOF+C90Qvk9MhG0iZbGms7cKeNfEJXG7PNQHQBg9Xzq+c2IgMzHv49L5BNRo7vtWWyAy1ZgrhIAhykuywo6/5nTTkOdDP6Rk2t15dvUs+0jbRQmTvFl3khY+DwKbbcfi5gejh4QNYW1LItEZr/Yo0zKn08ug0nJ6dfWwUluJlgmW3hvCrW+CbftFNBIJZuBP4zq9oSTzJsxbkiLNYUSlq5ANW43tTpxosuUWsOgm4cfVymqdn21vvTrvBKKjBknhwQxGrg+QySPq6uwR6b0Jc63gX5v/mnnfg7szoEXnG8X3qXGB7IRaCrXxmng52KwqAGsMVaQFIGorhOrafgUrlz3BvR0JBJ/YmR5ACDa2FYZ1bFEM97LvzAjDlFea2BXKK23yw+UMPDfuGDUXkFpZSsMu3wo8x0P1TmZsCaaEmOTmU3ihDsjd1T3yNX3y8/k/boSuhQ9ljf3Psb479zWfW37z58MWfAAAA//8=
// DO NOT EDIT
package com.paypal.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The detailed breakdown of the captured payment.
 */
@Model
public class MerchantReceivableBreakdown {

    // Required default constructor
    public MerchantReceivableBreakdown() {}

	/**
	* The exchange rate that determines the amount to convert from one currency to another currency.
	*/
	@SerializedName("exchange_rate")
	private ExchangeRate exchangeRate;

	public ExchangeRate exchangeRate() { return exchangeRate; }
	
	public MerchantReceivableBreakdown exchangeRate(ExchangeRate exchangeRate) {
	    this.exchangeRate = exchangeRate;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("gross_amount")
	private Money grossAmount;

	public Money grossAmount() { return grossAmount; }
	
	public MerchantReceivableBreakdown grossAmount(Money grossAmount) {
	    this.grossAmount = grossAmount;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("net_amount")
	private Money netAmount;

	public Money netAmount() { return netAmount; }
	
	public MerchantReceivableBreakdown netAmount(Money netAmount) {
	    this.netAmount = netAmount;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("paypal_fee")
	private Money paypalFee;

	public Money paypalFee() { return paypalFee; }
	
	public MerchantReceivableBreakdown paypalFee(Money paypalFee) {
	    this.paypalFee = paypalFee;
	    return this;
	}

	/**
	* An array of platform or partner fees, commissions, or brokerage fees that associated with the captured payment.
	*/
	@SerializedName(value = "platform_fees", listClass = PlatformFee.class)
	private List<PlatformFee> platformFees;

	public List<PlatformFee> platformFees() { return platformFees; }
	
	public MerchantReceivableBreakdown platformFees(List<PlatformFee> platformFees) {
	    this.platformFees = platformFees;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("receivable_amount")
	private Money receivableAmount;

	public Money receivableAmount() { return receivableAmount; }
	
	public MerchantReceivableBreakdown receivableAmount(Money receivableAmount) {
	    this.receivableAmount = receivableAmount;
	    return this;
	}
}
