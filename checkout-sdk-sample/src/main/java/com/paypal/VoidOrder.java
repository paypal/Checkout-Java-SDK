package com.paypal;

import java.io.IOException;

import org.json.JSONObject;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.serializer.Json;
import com.paypal.authorizecapture.CreateOrder;
import com.paypal.authorizecapture.SaveOrder;
import com.paypal.orders.LinkDescription;
import com.paypal.orders.Order;
import com.paypal.orders.OrdersGetRequest;
import com.paypal.orders.OrdersVoidRequest;

public class VoidOrder extends PayPalClient {

	/**
	 * Method to void order
	 * 
	 * @throws IOException Exceptions from API if any
	 */
	public void voidOrder(String orderId) throws IOException {
		OrdersVoidRequest request = new OrdersVoidRequest(orderId);
		client().execute(request);
		OrdersGetRequest getRequest = new OrdersGetRequest(orderId);
		HttpResponse<Order> response = client.execute(getRequest);
		System.out.println("After Void:");
		System.out.println("Order ID: " + response.result().id());
		System.out.println("Intent: " + response.result().intent());
		System.out.println("Links: ");
		for (LinkDescription link : response.result().links()) {
			System.out.println("\t" + link.rel() + ": " + link.href() + "\tCall Type: " + link.method());
		}
		System.out.println("Gross Amount: " + response.result().purchaseUnits().get(0).amount().currencyCode() + " "
				+ response.result().purchaseUnits().get(0).amount().value());
		System.out.println("Full response body:");
		System.out.println(response.result().status());
		System.out.println(new JSONObject(new Json().serialize(response.result())).toString(4));
	}

	/**
	 * This is an driver function to create order, save order (after buyer approval)
	 * and then void order.
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("Before VOID:");
		HttpResponse<Order> response = new CreateOrder().createOrder(true);
		System.out.println(
				"Copy approve link and paste it in browser. Login with buyer account and follow the instructions.\nOnce approved hit enter...");
		System.in.read();
		new SaveOrder().saveOrder(response.result().id(), true);
		System.out.println("\nAfter VOID :");
		new VoidOrder().voidOrder(response.result().id());
	}
}
