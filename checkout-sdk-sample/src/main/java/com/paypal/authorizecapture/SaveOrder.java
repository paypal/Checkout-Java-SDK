package com.paypal.authorizecapture;

import java.io.IOException;

import org.json.JSONObject;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.serializer.Json;
import com.paypal.PayPalClient;
import com.paypal.orders.LinkDescription;
import com.paypal.orders.Order;
import com.paypal.orders.OrderActionRequest;
import com.paypal.orders.OrdersAuthorizeRequest;
import com.paypal.orders.OrdersSaveRequest;
import com.paypal.orders.PurchaseUnit;

public class SaveOrder extends PayPalClient {

	/**
	 * Building empty request body. This can be updated with required fields as per
	 * need.
	 * 
	 * @return OrderActionRequest with empty body
	 */
	private OrderActionRequest buildRequestBody() {
		return new OrderActionRequest();
	}

	/**
	 * Method to authorize order after creation
	 * 
	 * @param orderId Valid Approved Order ID from createOrder response
	 * @param debug   true = print response data
	 * @return HttpResponse<Order> response received from API
	 * @throws IOException Exceptions from API if any
	 */
	public HttpResponse<Order> saveOrder(String orderId, boolean debug) throws IOException {
		OrdersSaveRequest request = new OrdersSaveRequest(orderId);
		request.requestBody(buildRequestBody());
		HttpResponse<Order> response = client().execute(request);
		if (debug) {
			System.out.println("Order O-Ids:");
			response.result().purchaseUnits().stream().map(PurchaseUnit::id).forEach(System.out::println);
			System.out.println("Link Descriptions: ");
			for (LinkDescription link : response.result().links()) {
				System.out.println("\t" + link.rel() + ": " + link.href());
			}
			System.out.println("Full response body:");
			System.out.println(new JSONObject(new Json().serialize(response.result())).toString(4));
		}
		return response;
	}

	/**
	 * This is the driver function which invokes the authorizeOrder function to
	 * create an sample order.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			new SaveOrder().saveOrder("7HA75945773554815", true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
