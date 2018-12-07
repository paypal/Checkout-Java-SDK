// This class was generated on Tue, 04 Dec 2018 17:38:27 PST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// ApplicationContext.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data H4sIAAAAAAAC/8RX3Y8bNRB/568YLS+clGTbaylq3qqWBwRto6PwclTRxDvZtc6xfTP2pSnif0f2fuQ2G6ASx/GSaOfL/s23fy8+HDwVy+KV90YrDNpZeO1soE+hmBW/ImvcGHqHuyRUzIof6XD8eEOiWPukVCyL11GC2+nPJBAaAo8HYqBPnliTVQRVZG3rzEPv2d2hAc9OkQhsHfdKO7IB9jo0sMLDCs3it/jkyTO1MU7d3EYXKH+3v0oCO1u3lHcu0LIll/fpsEIOllgAbQVvkW8oeIOKBHa6bgI0eEfQKipXdfY3jLZaW9x1J5VHVrZzKi+N9l7beu2ZtsQJ8VRRObvVdWSqem/49m6ASrloAwiF6CE0mHxgDLg7YtYVZe8w3UaSAHdoIknnmPLUM8WseMWMhzayT2bFFWH13ppDsdyiEUqE26iZqoGwYueJgyYpltdDTkhIV5ymwdE1o4QYkcep8aEhMLgh0yLrQbWJsomibUqCpAraZmIb+8EtbkQVHWjxL2HaaMwfs3/EqtAqMuvIZoR1RJ5i/eXqJ9g3xG3YVC4MYtACTJVmUoEqwG0gHgu0ZuV+KTwSToO2ytmL9TiqJ4wp1nDwBG4LnSAkQQgOpHH7M3HLpX4E3JC6cfHRUDqF5gRfT5oiuzZo65jhYP3xmyYEL8uyDM4ZWWgK24XjumzCzpQb5Z9/97WQSurzy4uhoQ0mtIV9o1WTXJPP1J/b7CBmx3Mmgykp2pvLDCSqBlBgRyJYk8xAi8T0n7qPxLomyVmUj5QF5FhgnZJshxVB9Ckq6YTrH35+Dy+evZxfHq+TmtIR0n6/XxinFrW7KyWgrZArKbW4rFX6xucutjZawsI3/mKWDbvsLTT5hPnTb19ePofWiWOPJfPR6mQiu0yLy8LZaLIpi+TFixZbf+X5s6cvXgAa3+D8EnIf4EN38bJySkptA9Wch1bZllXJJKHsZOdJVsqLB06uVTej3lJoXDVNsq5w17uef0y2CWuadENpJFfsiFWDNgxz8ThcZPGf9/k0wambZ8nKCZIT3hRKf/v5IDbgEBf5ATB8YdnnVWQtZHLjneAYsf46IvNeakDRhrFvckOwHmw8ffwybDmlgrshezbZes4UWaofTvWrjCYb5jVZ4tyGss4jRYcpRLaTETsiP9yIbVdP+j9m7JkVcYT4PH8KvZe71w26vTea+8ux0e3XGy3e4KGFPChjVXHauoIbOajfKnvlsanvbcIjY5cGB6pxTtJiPJg9s7H9reUrSm5T4cT2lt0OUlnVw9uhO+Dec6IL4/z0WXH+xLL30uNEPQrxup3So2iP6SdPqf6dIIAwfemkB5q2kc49dhyfUVjhAd65/Tn5fgODrXH7B+paX/0JAAD//w==
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Customizes the payer experience during the approval process for the payment with PayPal.<blockquote><strong>Note:</strong> Partners and Marketplaces might have <code>brand_name</code> and <code>shipping_preference</code> configured during partner account setup that will override the request values.</blockquote>
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
