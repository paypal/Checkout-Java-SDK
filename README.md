# PayPal Checkout Java SDK v2

![Home Image](homepage.jpg)


### To consolidate support across various channels, we have currently turned off the feature of GitHub issues. Please visit https://www.paypal.com/support to submit your request or ask questions within our community forum.

__Welcome to PayPal Checkout__. This repository contains PayPal's Java SDK for Checkout and samples for [v2/checkout/orders](https://developer.paypal.com/docs/api/orders/v2/) and [v2/payments](https://developer.paypal.com/docs/api/payments/v2/) APIs.

This is a part of the next major PayPal SDK. It includes a simplified interface to only provide simple model objects and blueprints for HTTP calls. This repo currently contains functionality for PayPal Checkout APIs which includes [Orders V2](https://developer.paypal.com/docs/api/orders/v2/) and [Payments V2](https://developer.paypal.com/docs/api/payments/v2/).

Please refer to the [PayPal Checkout Integration Guide](https://developer.paypal.com/docs/checkout/) for more information. Also refer to [Setup your SDK](https://developer.paypal.com/docs/checkout/reference/server-integration/setup-sdk/) for additional information about setting up the SDK's. 

## Prerequisites

Java JDK 8 or higher

An environment which supports TLS 1.2 (see the TLS-update site for more information)

## Usage
### Binaries

It is not necessary to fork this repository for using the PayPal SDK. Please take a look at [PayPal Checkout Server SDK](https://developer.paypal.com/docs/checkout/reference/server-integration) for configuring and working with SDK without forking this code.

For contributing to this repository or using the samples you can fork this repository.

### Setting up credentials

Get client ID and client secret by going to https://developer.paypal.com/developer/applications and generating a REST API app. Get <b>Client ID</b> and <b>Secret</b> from there.

```java
package com.paypal;
import com.paypal.core.PayPalEnvironment;
import com.paypal.core.PayPalHttpClient;
public class Credentials {
    static String clientId = "CLIENT-ID";
    static String secret = "CLIENT-SECRET";
    
    // Creating a sandbox environment
    private static PayPalEnvironment environment = new PayPalEnvironment.Sandbox(clientId, secret);
    
    // Creating a client for the environment
    static PayPalHttpClient client = new PayPalHttpClient(environment);
}
```

## Examples
### Creating an Order
This will create an order and print order id for the created order

```java
package com.paypal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.paypal.http.HttpResponse;
import com.paypal.http.exceptions.HttpException;
import com.paypal.orders.*;

public class CreateOrderExample {
	public static void main(String[] args) {

		Order order = null;
		// Construct a request object and set desired parameters
		// Here, OrdersCreateRequest() creates a POST request to /v2/checkout/orders
		OrderRequest orderRequest = new OrderRequest();
		orderRequest.checkoutPaymentIntent("CAPTURE");
		List<PurchaseUnitRequest> purchaseUnits = new ArrayList<>();
		purchaseUnits
				.add(new PurchaseUnitRequest().amount(new AmountWithBreakdown().currencyCode("USD").value("100.00")));
		orderRequest.purchaseUnits(purchaseUnits);
		OrdersCreateRequest request = new OrdersCreateRequest().requestBody(orderRequest);

		try {
			// Call API with your client and get a response for your call
			HttpResponse<Order> response = Credentials.client.execute(request);

			// If call returns body in response, you can get the de-serialized version by
			// calling result() on the response
			order = response.result();
			System.out.println("Order ID: " + order.id());
			order.links().forEach(link -> System.out.println(link.rel() + " => " + link.method() + ":" + link.href()));
		} catch (IOException ioe) {
			if (ioe instanceof HttpException) {
				// Something went wrong server-side
				HttpException he = (HttpException) ioe;
				System.out.println(he.getMessage());
				he.headers().forEach(x -> System.out.println(x + " :" + he.headers().header(x)));
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
package com.paypal;

import java.io.IOException;

import com.paypal.http.HttpResponse;
import com.paypal.http.exceptions.HttpException;
import com.paypal.orders.*;

public class CaptureOrderExample {
	public static void main(String[] args) {
		Order order = null;
		OrdersCaptureRequest request = new OrdersCaptureRequest("APPROVED-ORDER-ID");

		try {
			// Call API with your client and get a response for your call
			HttpResponse<Order> response = Credentials.client.execute(request);

			// If call returns body in response, you can get the de-serialized version by
			// calling result() on the response
			order = response.result();
			System.out.println("Capture ID: " + order.purchaseUnits().get(0).payments().captures().get(0).id());
			order.purchaseUnits().get(0).payments().captures().get(0).links()
					.forEach(link -> System.out.println(link.rel() + " => " + link.method() + ":" + link.href()));
		} catch (IOException ioe) {
			if (ioe instanceof HttpException) {
				// Something went wrong server-side
				HttpException he = (HttpException) ioe;
				System.out.println(he.getMessage());
				he.headers().forEach(x -> System.out.println(x + " :" + he.headers().header(x)));
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

## Samples

You can start off by trying out [creating and capturing an order](/checkout-sdk-sample/src/main/java/com/paypal/CaptureIntentExamples/RunAll.java).

To try out different samples for both create and authorize intent head to [this link](/checkout-sdk-sample/src/main/java/com/paypal).

Note: Update the `PayPalClient.java` with your sandbox client credentials or pass your client credentials as environment variable while executing the samples.

## License
Code released under [SDK LICENSE](LICENSE)  
