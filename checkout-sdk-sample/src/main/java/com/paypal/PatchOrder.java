package com.paypal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.serializer.Json;
import com.paypal.delayedauthorizecapture.CreateOrder;
import com.paypal.orders.AmountBreakdown;
import com.paypal.orders.AmountWithBreakdown;
import com.paypal.orders.LinkDescription;
import com.paypal.orders.Money;
import com.paypal.orders.Order;
import com.paypal.orders.OrdersGetRequest;
import com.paypal.orders.OrdersPatchRequest;
import com.paypal.orders.Patch;

public class PatchOrder extends PayPalClient {
	/**
	 * Method to created body for patch order
	 * 
	 * @return List<Patch> list of patches to be made
	 * @throws IOException
	 */
	private List<Patch> buildRequestBody() throws IOException {
		List<Patch> patches = new ArrayList<>();
		patches.add(new Patch().op("replace").path("/intent").value("CAPTURE"));
		patches.add(new Patch().op("replace").path("/purchase_units/@reference_id=='PUHF'/amount")
				.value(new AmountWithBreakdown().currencyCode("USD").value("200.00")
						.breakdown(new AmountBreakdown().itemTotal(new Money().currencyCode("USD").value("180.00"))
								.taxTotal(new Money().currencyCode("USD").value("20.00")))));
		return patches;
	}

	/**
	 * Method to patch order
	 * 
	 * @throws IOException Exceptions from API if any
	 */
	public void patchOrder(String orderId) throws IOException {
		OrdersPatchRequest request = new OrdersPatchRequest(orderId);
		request.requestBody(buildRequestBody());
		client().execute(request);
		OrdersGetRequest getRequest = new OrdersGetRequest(orderId);
		HttpResponse<Order> response = client.execute(getRequest);
		System.out.println("After Patch:");
		System.out.println("Order ID: " + response.result().id());
		System.out.println("Intent: " + response.result().intent());
		System.out.println("Links: ");
		for (LinkDescription link : response.result().links()) {
			System.out.println("\t" + link.rel() + ": " + link.href() + "\tCall Type: " + link.method());
		}
		System.out.println("Gross Amount: " + response.result().purchaseUnits().get(0).amount().currencyCode() + " "
				+ response.result().purchaseUnits().get(0).amount().value());
		System.out.println("Full response body:");
		System.out.println(new JSONObject(new Json().serialize(response.result())).toString(4));
	}

	public static void main(String[] args) throws IOException {
		System.out.println("Before PATCH:");
		HttpResponse<Order> response = new CreateOrder().createOrder(true);
		System.out.println("\nAfter PATCH (Changed Intent and Amount):");
		new PatchOrder().patchOrder(response.result().id());
	}
}
