# REST API SDK for Java V2

![Home Image](homepage.jpg)

__Welcome to PayPal Java SDK__. This repository contains PayPal's Java SDK and samples for REST API.

This is a part of the next major PayPal SDK. It includes a simplified interface to only provide simple model objects and blueprints for HTTP calls. This repo currently contains functionality for PayPal Checkout APIs which includes Orders V2 and Payments V2.

## Please Note
> **The Payment Card Industry (PCI) Council has [mandated](http://blog.pcisecuritystandards.org/migrating-from-ssl-and-early-tls) that early versions of TLS be retired from service.  All organizations that handle credit card information are required to comply with this standard. As part of this obligation, PayPal is updating its services to require TLS 1.2 for all HTTPS connections. At this time, PayPal will also require HTTP/1.1 for all connections. [Click here](https://github.com/paypal/tls-update) for more information. Connections to the sandbox environment use only TLS 1.2.**

## Prerequisites

Java JDK 6 or higher

An environment which supports TLS 1.2 (see the TLS-update site for more information)

## Usage

### Setting up credentials
Get client ID and client secret by going to https://developer.paypal.com/developer/applications and generating a REST API app. Get <b>Client ID</b> and <b>Secret</b> from there.

```java
import com.paypal.core.PayPalEnvironment;
import com.paypal.core.PayPalHttpClient;
public class Credentials {
    static String clientId = "CLIENT-ID";
    static String secret = "CLIENT-SECRET";
    
    // Creating a sandbox environment
    private PayPalEnvironment environment = new PayPalEnvironment.Sandbox(clientId, secret);
    
    // Creating a client for the environment
    static PayPalHttpClient client = new PayPalHttpClient(environment);
}
```

## Examples
### Creating an Order
This will create an order and print order id for the created order

```java

import java.io.IOException;
import java.util.*;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.exceptions.HttpException;
import com.paypal.PayPalClient;
import com.paypal.orders.*;

public class CreateOrderExample {
	public static void main(String[] args) {

		// Construct a request object and set desired parameters
		// Here, OrdersCreateRequest() creates a POST request to /v2/checkout/orders
		List<PurchaseUnitRequest> purchaseUnitRequests = new ArrayList<>();
		PurchaseUnitRequest purchaseUnitRequest = new PurchaseUnitRequest()
				.amount(new AmountWithBreakdown().currencyCode("USD").value("220.00"));
		purchaseUnitRequests.add(purchaseUnitRequest);
		OrdersCreateRequest request = new OrdersCreateRequest()
				.requestBody(new OrderRequest()
						.intent("CAPTURE").applicationContext(new ApplicationContext()
								.cancelUrl("https://www.example.com").returnUrl("https://www.example.com"))
						.purchaseUnits(purchaseUnitRequests));

		try {
			// Call API with your client and get a response for your call
			HttpResponse<Order> response = Credentials.client.execute(request);

			// If call returns body in response, you can get the deserialized version by
			// calling result() on the response
			Order order = response.result();
			System.out.println("Order ID: " + order.id());
		} catch (IOException ioe) {
			if (ioe instanceof HttpException) {
				// Something went wrong server-side
				HttpException he = (HttpException) ioe;
				int statusCode = he.statusCode();
				String message = he.getMessage();
			} else {
				// Something went wrong client-side
			}
		}
	}
}
```

### Capturing an Order
This will capture an order
```java

import java.io.IOException;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.exceptions.HttpException;
import com.paypal.PayPalClient;
import com.paypal.orders.*;

public class CaptureOrderExample {
	public static void main(String[] args) {

		// Construct a request object and set desired parameters
		// Here, OrdersCaptureRequest() creates a POST request to /v2/checkout/orders
		// Replace ORDER-ID with the order id from create order
		OrdersCaptureRequest request = new OrdersCaptureRequest("ORDER-ID");

		try {
			// Call API with your client and get a response for your call
			HttpResponse<Order> response = new PayPalClient().client().execute(request);

			// If call returns body in response, you can get the deserialized version by
			// calling result() on the response
			Order order = response.result();
			System.out.println(order.status());
		} catch (IOException ioe) {
			if (ioe instanceof HttpException) {
				// Something went wrong server-side
				HttpException he = (HttpException) ioe;
				int statusCode = he.statusCode();
				String message = he.getMessage();
				System.out.println("Status Code: " + statusCode + " - Message:" + message);
			} else {
				// Something went wrong client-side
			}
		}
	}
}
```
## Running tests

To run integration tests using your client id and secret, run the `test` gradle command with the `-Pintegration` flag
```sh
$ PAYPAL_CLIENT_ID=your_client_id PAYPAL_CLIENT_SECRET=your_client_secret ./gradlew clean test -Pintegration
```

You may use the client id and secret above for demonstration purposes.


*NOTE*: This SDK is still in beta, is subject to change, and should not be used in production.

## Samples

You can start off by trying out [creating and capturing an order](/checkout-sdk-sample/src/main/java/com/paypal/CaptureIntentExamples/RunAll.java).

To try out different samples for both create and authorize intent head to [this link](/checkout-sdk-sample/src/main/java/com/paypal).
