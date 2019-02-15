// This class was generated on Fri, 15 Feb 2019 14:59:09 PST by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// ApplicationContext.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/8RX3Y8bNRB/568YLS+clGTbaylq3qqWBwRto6PwclTRxDvZtc6xfTP2pSnif0f2fuQ2G6ASx/GSaOfL/s23fy8+HDwVy+KV90YrDNpZeO1soE+hmBW/ImvcGHqHuyRUzIof6XD8eEOiWPukVCyL11GC2+nPJBAaAo8HYqBPnliTVQRVZG3rzEPv2d2hAc9OkQhsHfdKO7IB9jo0sMLDCs3it/jkyTO1MU7d3EYXKH+3v0oCO1u3lHcu0LIll/fpsEIOllgAbQVvkW8oeIOKBHa6bgIoZ7e6jkzQaitXdYdsGG21trjrjiuPrGzsVF4a7b229dozbYkT7Kli5wff3gpQKRdtAKEQ/Qz2jVYNuDti1lXnSqbbSBLgDk0k6RxSnnqkmBWvmPHQRvTJrLgirN5bcyiWWzRCiXAbNVM1EFbsPHHQJMXyesgFCemC0/AfvTFKhBF5nBIfGgKDGzIQGgwnqDZRtE3BT6qgbSa2MR+c4kZU0YEW/xKmjcb8MftHrAqtIrOObEZYR+Qp1l+ufoJ9Q0z51ioXBDFoAaZKM6lAFeA2EI8FWrNyvwQeCadBW+WExXoc1RPGFGs4eAK3hU4QkiAEB9K4/Zm45RI/Am5I3bj4aCidQnOCrydNkV0btHXMcLD++E0TgpdlWQbnjCw0he3CcV02YWfKjfLPv/taSCX1+eXF0MgGE9p2JR0c5DP15zY7iNnxnMlgSor25jIDiaoBFNiRCNYkM9AiMf2nhiOxrklyFuUjZQE5FlinJNthRRB9iko64fqHn9/Di2cv55fH66Q+dIS03+8XxqlF7e5KCWgr5EpKLS5rlb7xuXGtjZaw8I2/mGXDLnsLTT5h/vTbl5fPoXXi2GPJfLQ6mcgu0+KycDaabMoiefGixdZfef7s6YsXgMY3OL+E3Af40F28rJySUttANedhVbZlVTJJKDvZeZKV8uKBk2vVzaa3FBpXTZOsK9z1rucfk23CmibdUBrJFTti1aANwzw8zhNZ/Od9Pk1u6kZYsnKC5IQ3hdLffj6IDTjERX4ADF9Y9nkFWQuZ3HgnOEasv47IvJcaULRh7JvcEKwHG08fvwxbTqngbsieTbaeM0WW6odT/SqjyYZ5TZY4t6Gs80jRYQqR7WTEjsgPN2LblZP+jxl7ZiscIT7Pn0Lv5e51g27fjeb+Umx0+/VGizd4aCEPylhVnLau4EYO6rfKXnls6nub8MjYpcGBapyTtAsPZs9sbH9r+YqS21Q4sb1lt4NUVvXwZugOuPeM6MI4P31OnD+x7L30OFGPQrxup/Qo2mP6yROqf4kIIExfOOlhpm2kc48cx2cUVniAd25/Tr7fwGBr3P6ButZXfwIAAP//
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Customizes the payer experience during the approval process for the payment with PayPal.<blockquote><strong>Note:</strong> Partners and Marketplaces might configure <code>brand_name</code> and <code>shipping_preference</code> during partner account setup, which overrides the request values.</blockquote>
 */
@Model
public class ApplicationContext {

    // Required default constructor
    public ApplicationContext() {}

	/**
	* The label that overrides the business name in the PayPal account on the PayPal site.
	*/
	@SerializedName("brand_name")
	private String brandName;

	public String brandName() { return brandName; }
	
	public ApplicationContext brandName(String brandName) {
	    this.brandName = brandName;
	    return this;
	}

	/**
	* The URL where the customer is redirected after the customer cancels the payment.
	*/
	@SerializedName("cancel_url")
	private String cancelUrl;

	public String cancelUrl() { return cancelUrl; }
	
	public ApplicationContext cancelUrl(String cancelUrl) {
	    this.cancelUrl = cancelUrl;
	    return this;
	}

	/**
	* The type of landing page to show on the PayPal site for customer checkout.
	*/
	@SerializedName("landing_page")
	private String landingPage;

	public String landingPage() { return landingPage; }
	
	public ApplicationContext landingPage(String landingPage) {
	    this.landingPage = landingPage;
	    return this;
	}

	/**
	* The [language tag](https://tools.ietf.org/html/bcp47#section-2) for the language in which to localize the error-related strings, such as messages, issues, and suggested actions. The tag is made up of the [ISO 639-2 language code](https://www.loc.gov/standards/iso639-2/php/code_list.php), the optional [ISO-15924 script tag](https://www.unicode.org/iso15924/codelists.html), and the [ISO-3166 alpha-2 country code](/docs/integration/direct/rest/country-codes/).
	*/
	@SerializedName("locale")
	private String locale;

	public String locale() { return locale; }
	
	public ApplicationContext locale(String locale) {
	    this.locale = locale;
	    return this;
	}

	/**
	* The customer and merchant payment preferences.
	*/
	@SerializedName("payment_method")
	private PaymentMethod paymentMethod;

	public PaymentMethod paymentMethod() { return paymentMethod; }
	
	public ApplicationContext paymentMethod(PaymentMethod paymentMethod) {
	    this.paymentMethod = paymentMethod;
	    return this;
	}

	/**
	* The internal client-generated token.
	*/
	@SerializedName("payment_token")
	private String paymentToken;

	public String paymentToken() { return paymentToken; }
	
	public ApplicationContext paymentToken(String paymentToken) {
	    this.paymentToken = paymentToken;
	    return this;
	}

	/**
	* The URL where the customer is redirected after the customer approves the payment.
	*/
	@SerializedName("return_url")
	private String returnUrl;

	public String returnUrl() { return returnUrl; }
	
	public ApplicationContext returnUrl(String returnUrl) {
	    this.returnUrl = returnUrl;
	    return this;
	}

	/**
	* The shipping preference:<ul><li>Displays the shipping address to the customer.</li><li>Enables the customer to choose an address on the PayPal site.</li><li>Restricts the customer from changing the address during the payment-approval process.</li></ul>
	*/
	@SerializedName("shipping_preference")
	private String shippingPreference;

	public String shippingPreference() { return shippingPreference; }
	
	public ApplicationContext shippingPreference(String shippingPreference) {
	    this.shippingPreference = shippingPreference;
	    return this;
	}

	/**
	* Configures a <strong>Continue</strong> or <strong>Pay Now</strong> checkout flow.
	*/
	@SerializedName("user_action")
	private String userAction;

	public String userAction() { return userAction; }
	
	public ApplicationContext userAction(String userAction) {
	    this.userAction = userAction;
	    return this;
	}
}
