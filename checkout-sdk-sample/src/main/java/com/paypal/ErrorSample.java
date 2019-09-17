package com.paypal;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.exceptions.HttpException;
import com.paypal.orders.*;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

public class ErrorSample extends PayPalClient {

    /**
     * Body has no required parameters (intent, purchase_units)
     */
    public void createError1() {
        OrdersCreateRequest request = new OrdersCreateRequest();
        request.requestBody(new OrderRequest());
        System.out.println("Request Body: {}\n");
        System.out.println("Response:");
        try {
            HttpResponse<Order> response = client.execute(request);
        } catch (IOException e){
            HttpException h = (HttpException) e;
            JSONObject message = new JSONObject(h.getMessage());
            System.out.println(this.prettyPrint(message, ""));
            System.out.println();
        }
    }

    /**
     * Body has invalid parameter value for intent
     */
    public void createError2() {
        OrdersCreateRequest request = new OrdersCreateRequest();
        request.requestBody(new OrderRequest()
                .checkoutPaymentIntent("INVALID")
                .purchaseUnits(new ArrayList<PurchaseUnitRequest>() {{
                    add(new PurchaseUnitRequest().amountWithBreakdown(new AmountWithBreakdown().currencyCode("USD").value("100.00")));
                }}));
        System.out.println("Request Body:");
        System.out.println("{\n\"intent\": \"INVALID\",\n\"purchase_units\": [\n{\n\"amount\": {\n\"currency_code\": \"USD\",\n\"value\": \"100.00\"\n}\n}\n]\n}\n");
        System.out.println("Response:");
        try {
            HttpResponse<Order> response = client.execute(request);
        } catch (IOException e){
            HttpException h = (HttpException) e;
            JSONObject message = new JSONObject(h.getMessage());
            System.out.println(this.prettyPrint(message, ""));
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ErrorSample errorSample = new ErrorSample();

        System.out.println("Calling createError1 (Body has no required parameters (intent, purchase_units))");
        errorSample.createError1();

        System.out.println("Calling createError2 (Body has invalid parameter value for intent)");
        errorSample.createError2();

    }
}
