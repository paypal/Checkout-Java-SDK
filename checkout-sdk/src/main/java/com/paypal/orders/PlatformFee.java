// This class was generated on Tue, 04 Dec 2018 17:38:27 PST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// PlatformFee.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data H4sIAAAAAAAC/7xW0W8btw9+//0VxD21gGPnlzYbkKe1DYplQ9NgywYMWZDSEu+OiE66UpKd25D/fZDuzvbFCdaiwZ4MU0eR/Pjxo/4uLruWipPiwmAonTTwnqiYFb+jMC4NnWOTTotZ8TN12z+n5JVwG9jZ4qS4rAna0d8JtCjBkkBJNAPlmoa9Z2dn6Wwp7pYEK0qnEGoMwB7Qe6cYA2lYc6gh1ARB0HpUKcYczl0ABE8tCgZKF7F3JjvsfAeGKijFNfkCugskFg20JL4lFXhFc5gkm3JgD4YbTlexBa9cS4BW57TMGrvHs3PCFefLsWvIBiid5IM2iqrRE0TLYV7Mijci2PUoH86KXwj1R2u64qRE4ykZPkcW0hvDhbiWJDD54uRq058PzlK33xhsXLRh0p6Nab9JKoqQVV2ur/8u541QskWrGM0unDPwUdWAHhCWaNAq6tvbV6wjfVV9QeKT5fkgbKv9+saMb5TTNCnz4cl+tVehFqIDVaOgCiRw9uvHg9dH//9+i0PyvX6x0E75BdtAlWC6YKFZSIWFkA+L8eOD9LFfvBxIq8kGLpl87vr40TcCYqMx97N/RWWFJk7RGC37KOSTGaxrVjU0XNUBlnTyZzw8fKWiyb/U/zPc/3tjIWORJtjJWFqq1PAtwaefLv741IOAQmBdgNC1rNCYDkrpqYNm3l+6GG99EAM0KW7QbDwej3V5froTy8el5hXrPKrBQahd9Gh1qP3j4RZjhe+H6ZQBfLCxWZKAKzeJtAYV+WEeJgyZgSeCq3ej7V0iwtfS5jmYcb3DjQ+UdMYGeIv+EcVusaMpRUbLPkU0BWTjNxLWjFevawdCing10LyMVvusHmU0JRvjBzHUJL20bnyzfHoHt9atbdKQLI4ph+cTxSdVwzDZcMN6qhg71kcWWFwaVtu57smPbQtKKGv/spugs+iLgTMbxOmo0ipy4GPbOgkQPYFCTx5epHtoXs3hrSDbS0k7Z0uafqVcYHeB5iWsa5IBJqAG2dyg1kLeJ+EdI99w3k5p8nCFbFLl3wrqFyrPJKcJug9P9hFORYvFXh74L9J9hTD4DBO8NE7dfo4u0O4g+yDOVr3l3IVRwBa7dvitTR347jVsJN9n2UBj3Do1kEon/XI/Oj5+6iss065Ine5jpPntA/wwBN1awHNl5/CjW9OKZJa9KrIkWQxRKWoTcxq84yY2YMhWoe6JZafVp4YeHe+mPjxVMCTUYEUybpskhhaizSDpL80S6I592OjkQ5j/G/rsMHhCnql9nzr9eOS5EDg7HddZ0hho0N+STgClR2ZS9LD1QKXyK2eQ+0RBm9ZHakEa0eE9x6Lzq5VpgP2hnwehHGFpOiCrpMuNze8oaMW1whRQOlilgm1IaSRhfnWUfKPvxYFsasqwiHw04Vmm9vr++v5//wAAAP//
// DO NOT EDIT
package com.paypal.orders;

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
	private MerchantBase payee;

	public MerchantBase payee() { return payee; }
	
	public PlatformFee payee(MerchantBase payee) {
	    this.payee = payee;
	    return this;
	}
}
