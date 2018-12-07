package com.paypal.immediatecapture;
import com.braintreepayments.http.HttpResponse;
import com.paypal.delayedauthorizecapture.RefundOrder;
import com.paypal.orders.Capture;
import com.paypal.orders.LinkDescription;
import com.paypal.orders.Order;
import com.paypal.orders.PurchaseUnit;
import com.paypal.payments.Refund;


public class RunAll {
    public static void main(String[] args) {
        try {
            // Creating Order
            HttpResponse<Order> orderResponse = new CreateOrder().createOrder(false);
            String orderId = "";
            System.out.println("Creating Order...");
            if (orderResponse.statusCode() == 201){
                orderId = orderResponse.result().id();
                System.out.println("Links:");
                for (LinkDescription link : orderResponse.result().links()) {
                    System.out.println("\t" + link.rel() + ": " + link.href());
                }
            }
            System.out.println("Created Successfully\n");
            System.out.println("Copy approve link and paste it in browser. Login with buyer account and follow the instructions.\nOnce approved hit enter...");
            System.in.read();

            // Capturing Order
            System.out.println("Capturing Order...");
            orderResponse = new CaptureOrder().captureOrder(orderId, false);
            String captureId = "";
            if (orderResponse.statusCode() == 201){
                System.out.println("Captured Successfully");
                System.out.println("Status Code: " + orderResponse.statusCode());
                System.out.println("Status: " + orderResponse.result().status());
                System.out.println("Order ID: " + orderResponse.result().id());
                System.out.println("Links:");
                for (LinkDescription link : orderResponse.result().links()) {
                    System.out.println("\t" + link.rel() + ": " + link.href());
                }
                System.out.println("Capture ids:");
    			for (PurchaseUnit purchaseUnit : orderResponse.result().purchaseUnits()) {
    				for (Capture capture : purchaseUnit.payments().captures()) {
    					System.out.println("\t" + capture.id());
    					captureId = capture.id();
    				}
    			}
            }
            
            // Refunding Order
            System.out.println("Refunding Order...");
            HttpResponse<Refund> refundResponse = new RefundOrder().refundOrder(captureId, false);
            if (refundResponse.statusCode() == 201){
                System.out.println("Refudned Successfully");
                System.out.println("Status Code: " + refundResponse.statusCode());
                System.out.println("Status: " + refundResponse.result().status());
                System.out.println("Refund ID: " + refundResponse.result().id());
                System.out.println("Links:");
                for (com.paypal.payments.LinkDescription link : refundResponse.result().links()) {
                    System.out.println("\t" + link.rel() + ": " + link.href());
                }
            }


        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
