package com.paypal.CaptureIntentExamples;

import java.io.IOException;

import org.json.JSONObject;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.serializer.Json;
import com.paypal.PayPalClient;
import com.paypal.orders.Capture;
import com.paypal.orders.Customer;
import com.paypal.orders.LinkDescription;
import com.paypal.orders.Order;
import com.paypal.orders.OrderRequest;
import com.paypal.orders.OrdersCaptureRequest;
import com.paypal.orders.PurchaseUnit;

public class CaptureOrder extends PayPalClient {

	/**
	 * Creating empty body for capture request. We can set the payment source if
	 * required.
	 * 
	 * @return OrderRequest request with empty body
	 */
	public OrderRequest buildRequestBody() {
		return new OrderRequest();
	}

	/**
	 * Method to capture order after creation. Valid approved order Id should be
	 * passed an argument to this method.
	 * 
	 * @param orderId Authorization ID from authorizeOrder response
	 * @param debug   true = print response data
	 * @return HttpResponse<Capture> response received from API
	 * @throws IOException Exceptions from API if any
	 */
	public HttpResponse<Order> captureOrder(String orderId, boolean debug) throws IOException {
		OrdersCaptureRequest request = new OrdersCaptureRequest(orderId);
		request.requestBody(buildRequestBody());
		HttpResponse<Order> response = client().execute(request);
		if (debug) {
			System.out.println("Status Code: " + response.statusCode());
			System.out.println("Status: " + response.result().status());
			System.out.println("Order ID: " + response.result().id());
			System.out.println("Links: ");
			for (LinkDescription link : response.result().links()) {
				System.out.println("\t" + link.rel() + ": " + link.href());
			}
			System.out.println("Capture ids:");
			for (PurchaseUnit purchaseUnit : response.result().purchaseUnits()) {
				for (Capture capture : purchaseUnit.payments().captures()) {
					System.out.println("\t" + capture.id());
				}
			}
			System.out.println("Buyer: ");
			Customer buyer = response.result().payer();
			System.out.println("\tEmail Address: " + buyer.emailAddress());
			System.out.println("\tName: " + buyer.name().fullName());
			System.out.println("\tPhone Number: " + buyer.phone().phoneNumber().countryCallingCode() + buyer.phone().phoneNumber().nationalNumber());
			System.out.println("Full response body:");
			System.out.println(new JSONObject(new Json().serialize(response.result())).toString(4));
		}
		return response;
	}

	/**
	 * Driver Function to invoke capture payment on order. Order Id should be
	 * replaced with the valid approved order id.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			new CaptureOrder().captureOrder("2KB80915Y4850741U", true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
