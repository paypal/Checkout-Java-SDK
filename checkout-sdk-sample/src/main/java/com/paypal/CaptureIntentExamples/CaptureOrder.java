package com.paypal.CaptureIntentExamples;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.serializer.Json;
import com.paypal.PayPalClient;
import com.paypal.orders.*;
import org.json.JSONObject;

import java.io.IOException;

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
	 * @param orderId Order ID from createOrder response
	 * @param debug   true = print response data
	 * @return HttpResponse<Order> response received from API
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
			Payer buyer = response.result().payer();
			System.out.println("\tEmail Address: " + buyer.email());
			System.out.println("\tName: " + buyer.name().givenName() + " " + buyer.name().surname());
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
			new CaptureOrder().captureOrder("<<REPLACE-WITH-APPROVED-ORDER-ID>>", true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
