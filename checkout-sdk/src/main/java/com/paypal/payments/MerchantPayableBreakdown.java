// This class was generated on Wed, 11 Sep 2019 17:50:29 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// MerchantPayableBreakdown.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/+xa34/bNhJ+v79ioKc7wFknm2wO2KfLjwsud7hkkW4LFGngjMmRRSxFKsORHbXo/16QkmzLltFNsC3QjZ4WmhmK5MdvPg9H+0t23VSUXWb/J1YFOoErbHBpCZ4z4Y32G5fNsh+QTTS+wTLGZrPsf9TsHl5SUGwqMd5ll9l1QbDsB4PPQQoCprx2+iybZc+YsWknfTjL3hHqt8422WWONlA0fKoNk94arthXxGIoZJfvd8v1jprjla3Yh7DA0tdOBqs8cByvWNXM5FQD6DS0cZB7BoTcOHTKoAVhdAFVHDWDUKsCMADCEi06ReAZKmxKcgK6prvbaxA2bnW82X7JC+U1DXZ76Dne7nspmOiBKpBRCTG8/u7tgyfnj/65AyKO/fD3ufYqzI0TWjHGF8y1YVIyZwoy74MfxOAw/wdIgQJGkxOTGwrp7PugL0JEuD4AxNXW/jr7XVTWaOshGr3lGIXkmcGmMKqA0qwKgSVd/lQ/fPhY1Tb9pfbJmvbpmYOEBXFiR7e1uFNrbgg+/vfqx48tCMgEzgtIUxmF1jaQc8sdtGftS+f9Ww/mAE3KlGi3I8bnun7zcm+uUC+1WRtNOq7QgxS+Dui0FGF8unm/w1eeuxxtwQdXl0vimLr9QiqLikKXEAOGzCAQwfsXve1FJMKX0uYumPFhjxsn1MGRjGnDwDwpw6QMkzLcW2XY5fpiebrAORE1JhmDgCGPnjnAuPQI164gSsxqAYvQOpJOVM7gHUnNjjRsCnKDBBmWUWACaJPnxFFRcvblaPAVNldoAZVKmrUpiCk5KmyIoPBWpzQ0DPGt4QDrp3denSnv1sRCekyFR5yTFk9aPGnxvdVi+hxvnCtaMAodU+TQvaPKoeeYMn0ExIgWfU1CXBrX0b0TD/HQCU+ro97tiYx4QOelIP667PgqvQi+ZkWLfsLBxo99f0HNGEHllqIhyCuScWiOfd8UNF+ipy1Ue7+lXfnx70+1WaOlNi1iJtTOSF9NtNzb7QteeS5RhHT8fe3l1vNWjdICYGOkSO8SD48uQJuVkQBJ+Qg4iXk3wVbFvHFyJ7Dd4kpYtd2usYLkyDWVI1M5MpUj96wcuZ1GVGgXOdGhPuzMkzZM2jBpw729qlQWJfdcdtl+KBB73jDUiAPP6QZRH9kmPYuLhCAKM1C+LE0Ixrswi94l+xtiXFHybxtJo1/Y7r6HM1IoTQXSJIKTCH4DIogN0WKJgUZrpJ1vUCOdKI80CRq7k6+y//+DTeGBSZFZd0RPvekkIHltc2Nta/asic/gen+sCYA2eLhxfuOijGy73X+8blCJxg7bVNGyQK2ZQhgFIZ4kO2zpa34mDWkMdGM6hi2tVzefai+0T7Qg7N2qtbzx0ifYfN8O31fxqv30CWwlKSRao7V+QxqWlPv46DScX1ycisI8alnEsp0j8qud4F/dpDsLBLNyZ/Afv6E18SyNWpEjTsmKSlElpKHEz6asS7DkVlK0KeCGu4+neX6xv/T2tCuUiBqsiXs1jMnqoHYJJH3bVQJ9NkG2eXwI85/TuOm5uzB6QJ6h/Zg63cedSG6G1y97uY0ZACWGG9IRoFg1nPgc1MlRpKCL8haPoA5dw0YKwzrVIYY62A/HBWBKMyxtA+QUN+lg0w89VOwrNiTIDazjhl1q8zzHQI/P49g6kI7UJBcPpRPKUNu7avzc4lonXtAu2rJp/JPUqYipzpnqnKnOuXeNoL/9BgAA//8=
// DO NOT EDIT
package com.paypal.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The breakdown of the refund.
 */
@Model
public class MerchantPayableBreakdown {

    // Required default constructor
    public MerchantPayableBreakdown() {}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("gross_amount")
	private Money grossAmount;

	public Money grossAmount() { return grossAmount; }
	
	public MerchantPayableBreakdown grossAmount(Money grossAmount) {
	    this.grossAmount = grossAmount;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("net_amount")
	private Money netAmount;

	public Money netAmount() { return netAmount; }
	
	public MerchantPayableBreakdown netAmount(Money netAmount) {
	    this.netAmount = netAmount;
	    return this;
	}

	/**
	* An array of breakdown values for the net amount. Returned when the currency of the refund is different from the currency of the PayPal account where the payee holds their funds.
	*/
	@SerializedName(value = "net_amount_breakdown", listClass = NetAmountBreakdown.class)
	private List<NetAmountBreakdown> netAmountBreakdown;

	public List<NetAmountBreakdown> netAmountBreakdown() { return netAmountBreakdown; }
	
	public MerchantPayableBreakdown netAmountBreakdown(List<NetAmountBreakdown> netAmountBreakdown) {
	    this.netAmountBreakdown = netAmountBreakdown;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("paypal_fee")
	private Money paypalFee;

	public Money paypalFee() { return paypalFee; }
	
	public MerchantPayableBreakdown paypalFee(Money paypalFee) {
	    this.paypalFee = paypalFee;
	    return this;
	}

	/**
	* An array of platform or partner fees, commissions, or brokerage fees for the refund.
	*/
	@SerializedName(value = "platform_fees", listClass = PlatformFee.class)
	private List<PlatformFee> platformFees;

	public List<PlatformFee> platformFees() { return platformFees; }
	
	public MerchantPayableBreakdown platformFees(List<PlatformFee> platformFees) {
	    this.platformFees = platformFees;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("total_refunded_amount")
	private Money totalRefundedAmount;

	public Money totalRefundedAmount() { return totalRefundedAmount; }
	
	public MerchantPayableBreakdown totalRefundedAmount(Money totalRefundedAmount) {
	    this.totalRefundedAmount = totalRefundedAmount;
	    return this;
	}
}
