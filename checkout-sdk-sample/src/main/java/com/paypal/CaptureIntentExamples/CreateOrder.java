package com.paypal.CaptureIntentExamples;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.serializer.Json;
import com.paypal.PayPalClient;
import com.paypal.orders.*;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateOrder extends PayPalClient {

	/**
	 * Method to generate sample create order body with <b>CAPTURE</b> intent
	 * 
	 * @return OrderRequest with created order request
	 */
	private OrderRequest buildRequestBody() {
		OrderRequest orderRequest = new OrderRequest();
		orderRequest.checkoutPaymentIntent("CAPTURE");

		ApplicationContext applicationContext = new ApplicationContext().brandName("EXAMPLE INC").landingPage("BILLING")
				.cancelUrl("https://www.example.com").returnUrl("https://www.example.com").userAction("CONTINUE")
				.shippingPreference("SET_PROVIDED_ADDRESS");
		orderRequest.applicationContext(applicationContext);

		List<PurchaseUnitRequest> purchaseUnitRequests = new ArrayList<PurchaseUnitRequest>();
		PurchaseUnitRequest purchaseUnitRequest = new PurchaseUnitRequest().referenceId("PUHF")
				.description("Sporting Goods").customId("CUST-HighFashions").softDescriptor("HighFashions")
				.amountWithBreakdown(new AmountWithBreakdown().currencyCode("USD").value("220.00")
						.amountBreakdown(new AmountBreakdown().itemTotal(new Money().currencyCode("USD").value("180.00"))
								.shipping(new Money().currencyCode("USD").value("20.00"))
								.handling(new Money().currencyCode("USD").value("10.00"))
								.taxTotal(new Money().currencyCode("USD").value("20.00"))
								.shippingDiscount(new Money().currencyCode("USD").value("10.00"))))
				.items(new ArrayList<Item>() {
					{
						add(new Item().name("T-shirt").description("Green XL").sku("sku01")
								.unitAmount(new Money().currencyCode("USD").value("90.00"))
								.tax(new Money().currencyCode("USD").value("10.00")).quantity("1")
								.category("PHYSICAL_GOODS"));
						add(new Item().name("Shoes").description("Running, Size 10.5").sku("sku02")
								.unitAmount(new Money().currencyCode("USD").value("45.00"))
								.tax(new Money().currencyCode("USD").value("5.00")).quantity("2")
								.category("PHYSICAL_GOODS"));
					}
				})
				.shippingDetail(new ShippingDetail().name(new Name().fullName("John Doe"))
						.addressPortable(new AddressPortable().addressLine1("123 Townsend St").addressLine2("Floor 6")
								.adminArea2("San Francisco").adminArea1("CA").postalCode("94107").countryCode("US")));
		purchaseUnitRequests.add(purchaseUnitRequest);
		orderRequest.purchaseUnits(purchaseUnitRequests);
		return orderRequest;
	}

	/**
	 * Method to create order
	 * 
	 * @param debug true = print response data
	 * @return HttpResponse<Order> response received from API
	 * @throws IOException Exceptions from API if any
	 */
	public HttpResponse<Order> createOrder(boolean debug) throws IOException {
		OrdersCreateRequest request = new OrdersCreateRequest();
		request.header("prefer","return=representation");
		request.requestBody(buildRequestBody());
		HttpResponse<Order> response = client().execute(request);
		if (debug) {
			if (response.statusCode() == 201) {
				System.out.println("Status Code: " + response.statusCode());
				System.out.println("Status: " + response.result().status());
				System.out.println("Order ID: " + response.result().id());
				System.out.println("Intent: " + response.result().checkoutPaymentIntent());
				System.out.println("Links: ");
				for (LinkDescription link : response.result().links()) {
					System.out.println("\t" + link.rel() + ": " + link.href() + "\tCall Type: " + link.method());
				}
				System.out.println("Total Amount: " + response.result().purchaseUnits().get(0).amountWithBreakdown().currencyCode()
						+ " " + response.result().purchaseUnits().get(0).amountWithBreakdown().value());
				System.out.println("Full response body:");
				System.out.println(new JSONObject(new Json().serialize(response.result())).toString(4));
			}
		}
		return response;
	}

	/**
	 * This is the driver function which invokes the createOrder function to create
	 * an sample order.
	 */
	public static void main(String args[]) {
		try {
			new CreateOrder().createOrder(true);
		} catch (com.braintreepayments.http.exceptions.HttpException e) {
			System.out.println(e.getLocalizedMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}