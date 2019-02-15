// This class was generated on Fri, 15 Feb 2019 14:59:09 PST by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// CreditFinancingOffer.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/+yVW2vsRgyA3/srhJ9a8MbpBQr7FhICaWkS2lAoadhoZ+T1kPGMq5ETTMl/P4xvm11vzkk4e17CPhlLmpE+jS7/JzdNRck8OWXSRuDcOHTKuBVc5TlxkiZ/IxtcWrrEMtolafI7NeufMwqKTSXGu2Se3BQEmgSNDYBLXwtIQVBhQzwLZEkJaVCdq3x05aOroyRNTpix6QI6TpM/CfWVs00yz9EGioL/asOkR8E1+4pYDIVkfjuiXLggaG1JTuCsC2bKYdZGCz0ardF266e0HRtWFftH0vDiWFR1X4tuyMr+KP/wjpopV+90oWva4NmUTzlUzUxONYBOA5a+dgK5Z8DhndCCMLqAKp5KIdSqAAyAsESLThF4HpF1TfsjDcLGraaoQ8gL5fUm7LZminsrBRPNVIGMSojh4q+r2S8//fjrOhHx7N33mfYqZMYJrRjjBZk2TEoypiDZYDyLxiH7AaRAAaPJickNhbb8B6N3ZUS43kqIq619Tr+YlUe0W08/SKZZaDUpPBVGFVCaVSGwpPm/9fHxz6q27Ze6P2u6vxMHbS6I2+ro0SKpNQ8E979d/3PfJQGZwHkBaSqj0NoGcu5qB+1Rd2k23LrlAzQpU6IdT+z2dXN59sJXqJfaPBrdNqF4kMLXAZ2WIux2lw2E557bd+I++eDqckkMPh8DqSwqCn1DbFRICoEIbk8H2WkshPeWzT4q4+4NtVERG68358IgmlZHHhPSQj0ZKfoqGec5FLH5V0ykQTyU+ECDMo6Ar23/NzOZEOp2Ub2Y3YNoytSp4tO2nflNNtFWo/b9Mo1ciMuNuHvBa0tmXKDreOOJFIyD0rtY6PuN/JUVI17QLiJWLOZNgm3VYdEcFs1h0XzYRfPZCdH36I4BsdYc5sNhPhzmwwebD3fP330CAAD//w==
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The details about the payer-selected credit financing offer.
 */
@Model
public class CreditFinancingOffer {

    // Required default constructor
    public CreditFinancingOffer() {}

	/**
	* The payer-approved installment payment plan details.
	*/
	@SerializedName("installment_details")
	private InstallmentDetails installmentDetails;

	public InstallmentDetails installmentDetails() { return installmentDetails; }
	
	public CreditFinancingOffer installmentDetails(InstallmentDetails installmentDetails) {
	    this.installmentDetails = installmentDetails;
	    return this;
	}

	/**
	* The issuer of the credit financing offer.
	*/
	@SerializedName("issuer")
	private String issuer;

	public String issuer() { return issuer; }
	
	public CreditFinancingOffer issuer(String issuer) {
	    this.issuer = issuer;
	    return this;
	}

	/**
	* The payer-selected financing term, in months.
	*/
	@SerializedName("term")
	private Integer term;

	public Integer term() { return term; }
	
	public CreditFinancingOffer term(Integer term) {
	    this.term = term;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("total_interest")
	private Money totalInterest;

	public Money totalInterest() { return totalInterest; }
	
	public CreditFinancingOffer totalInterest(Money totalInterest) {
	    this.totalInterest = totalInterest;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("total_payment")
	private Money totalPayment;

	public Money totalPayment() { return totalPayment; }
	
	public CreditFinancingOffer totalPayment(Money totalPayment) {
	    this.totalPayment = totalPayment;
	    return this;
	}
}
