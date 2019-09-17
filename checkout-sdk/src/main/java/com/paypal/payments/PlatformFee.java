// This class was generated on Wed, 11 Sep 2019 17:50:29 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// PlatformFee.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/6xW328bNwx+319B3NMGuHGWNhuQp3UNhv3A0mDLBgxZkNISz0dEJ11Jyc5t6P8+SHfn2LGDtUifDkeJIvnx4yf9W131HVVnVecw1kHa25qomlV/ojAuHF1ge2D1F+rHhWpWnZMa4S5y8NVZddUQTLshCHQo0ZNATTQDE9qWVTn4WV5bSLgjwSXlVYgNRmAFVA2GMZKFNccGYkMQBb2iyTGO4CJEQFDqUDBSPog1uOKwtQ8cLaGW0JYD6D6SeHTQkWhHJvKKjmAn2ZwDKzhuOR/FHtSEjgC9LWm5NfaHswvCSy6HY9+Sj1AHKQtdEtOgEiTP8aiaVa9FsB8QP55VvxHat9711VmNTikb3icWshvDpYSOJDJpdXa96dWvwVO/3yRsQ/Jxpz0b036TTBIhb/pS37Cv5I1Qs0dvGN02nDPQZBpABYQFOvSGhvYOFdtEn1RflPRkeRqF/XK/vinjWxPsLgsfr+xXex0bIXphGhQ0kQR++v3ti1cnX3/7gEP2vflyboPROftIS8F8wNyykIlzIY3zafOLvFnnX42kteQj10xauj5teiYgPjn3Yfa/qKzQpV00Jss+CmVlBuuGTQMtL5sICzr7Ox0fvzTJlS8Nf46Hv9ceChZ5goNMpeVKHd8RvPv58q93AwgoBD5EiH3HBp3roZaBOuiOhkPn06mPYoAlwy26jcfhWFcX51uxNC0sr9iWUY0BYhOSorex0cPh5lOFP4zTKSP44FO7IIFQbxLpHBrScR52GDIDJYLrN5PtTSbCp9LmczDjZosbHfZEtwvUQ9K9vfZAkmI+SBJLEdnpRsRayiLmI6ybAEKGeDUSvU7eatGPOrmandNRDi3JIK4b3yKgGuDOh7XPKlLkMefw+WTxqQmhFtntFF8st2itkOpBEHInxeNAX/6HLBQfGH1Ghi1cMHfvU4i0TTSNEvxysFyEOA3YfNsOf3QQA3zzCjaSpIXW6FxYk4UF1UGGy+fk9PSpXVhnLctYDjEyv4YA341BHyygvPRH8GNY04pkVryW5EnKsKIx1OVbrcV7blMLjvwyNsMI+N3qczdPTrdTH69SjBk1WJFMapiH1UPyBST7sVkC3bPGzRw/hvmZjPlIYZ24e8t2hzy79n3qXGJ/ObwF8jVzPsltngBoUe/IZoDyIygrTnzwQGPKLTzKUaagz/KWW5CUpvcGiy2vKqYR9sd+CkIlwsL1QN5IXxpb7nnoJHTCFFF6WOWCfcxpfI9KL0+yb9L8jgrZMVgahVKTe/b7ZVStmw9f/AcAAP//
// DO NOT EDIT
package com.paypal.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The platform or partner fee, commission, or brokerage fee that is associated with the transaction. Not a separate or isolated transaction leg from the external perspective. The platform fee is limited in scope and is always associated with the original payment for the purchase unit.
 */
@Model
public class PlatformFee {

    // Required default constructor
    public PlatformFee() {}

	/**
	* REQUIRED
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("amount")
	private Money amount;

	public Money amount() { return amount; }
	
	public PlatformFee amount(Money amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The details for the merchant who receives the funds and fulfills the order. The merchant is also known as the payee.
	*/
	@SerializedName("payee")
	private PayeeBase payeeBase;

	public PayeeBase payeeBase() { return payeeBase; }
	
	public PlatformFee payeeBase(PayeeBase payeeBase) {
	    this.payeeBase = payeeBase;
	    return this;
	}
}
