package com.paypal;

import com.braintreepayments.http.HttpClient;
import com.paypal.core.PayPalHttpClient;
import com.paypal.core.PayPalEnvironment;
import org.testng.annotations.BeforeMethod;

public class TestHarness {

    private HttpClient client;
    private PayPalEnvironment environment;

    @BeforeMethod
    public void setup() {
        environment = new PayPalEnvironment.Sandbox(
                System.getenv("PAYPAL_CLIENT_ID") != null ? System.getenv("PAYPAL_CLIENT_ID")
                        : "<<PAYPAL-CLIENT-ID>>",
                System.getenv("PAYPAL_CLIENT_SECRET") != null ? System.getenv("PAYPAL_CLIENT_SECRET")
                        : "<<PAYPAL-CLIENT-SECRET>>");
        client = new PayPalHttpClient(environment);
    }

    protected HttpClient client() {
        return client;
    }

    protected PayPalEnvironment environment() {
        return environment;
    }
}