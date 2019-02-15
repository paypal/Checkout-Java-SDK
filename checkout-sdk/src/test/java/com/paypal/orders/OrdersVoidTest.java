package com.paypal.orders;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.HttpClient;
import com.braintreepayments.http.serializer.Json;
import com.paypal.TestHarness;
import java.io.File;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.fail;

public class OrdersVoidTest extends TestHarness {

    @Test(enabled = false)
    public void testOrdersVoidRequest() throws IOException {
        String OrderId = "";
        OrdersVoidRequest request = new OrdersVoidRequest(OrderId);

        HttpResponse<Order> response = client().execute(request);
        assertEquals(response.statusCode(), 204);
        assertNotNull(response.result());

        // Add your own checks here
    }
}
