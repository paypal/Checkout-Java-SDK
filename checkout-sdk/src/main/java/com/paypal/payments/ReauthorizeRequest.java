// This class was generated on Wed, 11 Sep 2019 17:50:29 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// ReauthorizeRequest.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/6xVYWvcRhD93l8xiBZakC07aQj1txBTcEudI74Wgmvqud3RaclqV56ZdaIW//ey0ul8Ol8wgXy7Hc3OzHv73tx/xbLvqDgr3hMmbSK7fwne010i0aIs/kJ2uPJ0iW1OKsrid+ofD+ckhl2nLoZ5CQEMsD1ZWGC/QA9oTExBocO+paAlrHq4OD+GZQQKkphAG1SoU7ACyASiznvAe3Q+j1EC74yJUx3AWonBqYALTh160IaJjiz20MQQGTpiFy3Q584xyTF8iAkMhi/Ui8H3EIMhqDm2YLEXqGNi0Agvfjn+O52cvDQrroYftHe8qOHlyXinwXsCZQyS21oQl2tqQ2BRCWI9/I7s1i5kejajYCa0hD4maJMoGKacPqd0mtUFUUKbiz2CcWF9uPTjxWdQvNmlZqebCvkaGhRACPRpTu8AiIkG9M80OPgCBxGODxEZUpcf4PT01Q9fpI4sYJs1VkKImtPps6EcDeBCJlIG3r9//Qr+vDp/Zsar1HWRVUZB5Ia3Y/Vb4NEj0CFjS0o8lfLRfLxLUWm3oijHsB4jl1HpbAxXu3FYNk62dZ2AScwU1PcDFBlnITtQsUDWQAxJCAwKTWxX+/2LsnjDjP1o85Myu9S+C74vzmr0Qjlwl7I6t4EFx45YHUlxdr1dEH/EQP3TlTDyMVsM29B8PSwb2kAyPWCYHmqAg1C7gMEM1s1+QTN6QJJpYBDbCj1mIWS1bYRhEx1/M3yi7ML6KcBp5H9MtDTDuf/lKdzrcQ2ZBhlNXlEXV++Ofn5x+vqRiHz35sfKRiOVC0prHtxfWcdktGISrabko5ws1U/jlnSWgrrakQzKnJK+ihHltEdISN4/lM+yco8+zdmYIk9ZGL6U8KlxpoHWrRuF1eSA5Hdt4t1m+WSzKq2JB3VsoGWk3n0kuP1t8eF2JCH/SQxG7ztn0Pseah61g36yxFR1rwdYMq5Fv71xuNfy8nynl6SVdffOks0TRtAmJsFgtZHD7aoJ4a+Rh3fiDfkQUrsizstoGqTzaEg2hpgppAQhguu3U+xtFsLXyuZbKOPm4ebhu/8BAAD//w==
// DO NOT EDIT
package com.paypal.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Reauthorizes an authorized PayPal account payment, by ID. To ensure that funds are still available, reauthorize a payment after its initial three-day honor period expires. You can reauthorize a payment only once from days four to 29.<br/><br/>If 30 days have transpired since the date of the original authorization, you must create an authorized payment instead of reauthorizing the original authorized payment.<br/><br/>A reauthorized payment itself has a new honor period of three days.<br/><br/>You can reauthorize an authorized payment once for up to 115% of the original authorized amount, not to exceed an increase of $75 USD.<br/><br/>Supports only the `amount` request parameter.<blockquote><strong>Note:</strong> This request is currently not supported for Partner use cases.</blockquote>
 */
@Model
public class ReauthorizeRequest {

    // Required default constructor
    public ReauthorizeRequest() {}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("amount")
	private Money amount;

	public Money amount() { return amount; }
	
	public ReauthorizeRequest amount(Money amount) {
	    this.amount = amount;
	    return this;
	}
}
