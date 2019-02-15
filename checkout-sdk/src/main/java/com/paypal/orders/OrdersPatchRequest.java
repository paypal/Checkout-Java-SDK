// This class was generated on Fri, 15 Feb 2019 14:59:09 PST by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// OrdersPatchRequest.java
// @version 0.1.0-dev+8fcb5f
// @type request
// @data H4sIAAAAAAAC/8xYXW8btxJ9v79iwBe/rLW+uRcBqiJAFcdF3Da2aqspitiQKO6sl/EuZ0MOnaqG/3tBLtfWSnHjIK7bJ3v5MXPmzHB4qGtxJBsUY0G2QOtGrWRViUy8QqesblmTEWPxS1tIRgfSQFwHHzVXwBXCYv/kYDI7eLUAsrCYTKcnx2/Dl2PJ3o3O/N7e/9TS5vEf/I08KGkMMfho8pMWj99MfzqY3W9lRtDIy7i3s5LBijw03jG0lq50gSBhYbFEi0bhXBeLTRuHZdxDjeattVCS3QBGBqH1VlXSIXijOYOpXE1lDQ7ZdbiHNphgUWApfc2LDD5WWlWARi5rdNEzE3gXcLaSq3GHrrXYoTsTYfRMjOFM5L3fefDr8u/W/bx4sZOc7OTXktnqpWfcJbtLy/eo+OZMdKbzW9v35ARi5kMkAVVvKaS8gM6WC5gVNW2NjGkhtWhlKBKXQvB1iiB+1Xr9S1GRMGjDaDghuxuG8OfZ86aQrvoWLLa1VD3efGjrPstDsh7mIQNZFF/j5t35SHnH1Mx18QUuM7DY0BV+pevi7qg+vfNWrhBH2EhdPx3ZrtJtq83F04frqOR5TzjZpwcgG/JPcXLenY+0uSIdu8w/UlYNGp5r49h69fDafny/o0K7pbcO40TT730okmVN6vKDJ8Z1CI4tpfrFI2JM3TNfH4eXK0jNPYNN5A8Apd3WrsOj09nkaLa1tmft02Afk8y2llySbeYlonu0usr7a0dk4mePdjWVVjbIaJ0YvzvPxGuUBdrB6LWYrdqgfBxbbS5EJt5Kq8MFnRTRxHNFVv8R7zeRiR9xdc/MUCz18uTk4HQGk+khKFnXLgNtVO2LeHPCEqVFC0yXaEAb4Eo7qCLINSX0Mq5agPRcoWGtokNwqsIGRzCrEK5k7WOq0+KU8olS6NzuLNjvmOkE2kvptOrLotYxO8XYobLIad1IZGJirVx19Oxl4gRlcWzqlRiXsnYYBj54bbEQY7YeMzG1QQewRifGxtf1TfZZcvcpSoDduGyd242JIbW946jQ7rRHR5kEix88OoYlFasNemTb1om/TveoUIUyBT2CXyu0XWp2uomdsGvnvSOz8xiMnGfie7LNZl1OJVdfVpVRlM51MSBtuwYrhMNXQGUMqROyQXFGufxI8Zx0bHdGbnFP0wNiA3ZUl/OUoAH2zZlhIBMDMkANofxwenyUZOqaIg2ZXUErLWtZpwjjhEVH3ip0G/E+/8t408B6wJ9PSmmpGQSVBraT0tWehMpi+eJMVMytG+c5E9VupJHLEdmLvOKmzm2pnn+z99+k4DFGP6UgnXvdIVPXZIppZmkvkKEg5UPfhZpSwwho0hOECUIbjevj4RjB4FDxLca7rhw2bLfq2+P3ReX0CXof2DGoHTAcP7f5fWpU4Z22Wc7Vvyfzku/yvv50+9t46g7mNk+x1gZE9SPbTHVNuz/aXSPfrEn7uaqEgtCBIY63grbhqd0V/GMEfH4TVrmWjMPOThjO+tsrkbF+6YSbRGTiNXP7BrmiIvTKyWz/tehuATEW+dWzXFWoLslz3v0ek1/3/f5GZOL0Ure3mA5+b1ExFqfxN5J9KlCMn+39/+Y/fwIAAP//
// DO NOT EDIT
package com.paypal.orders;

import com.braintreepayments.http.*;
import java.util.*;
import java.util.stream.Collectors;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * Updates an order with the `CREATED` or `APPROVED` status.<br/>You cannot update an order with the `COMPLETED` status.<br/>To make an update, you must provide a `reference_id`.<br/>If you omit a `reference_id` for an order with one purchase unit, PayPal sets the `reference_id` to `default`, which enables you to use a path:<pre>"path": "/purchase_units/@reference_id=='default'/{attribute-or-object}"</pre>.<br/>You can patch these attributes and objects to complete these operations:<ul><li><code>intent</code> &mdash; replace.</li><li><code>purchase_units</code> &mdash; replace, add.</li><li><code>purchase_units[].custom_id</code> &mdash; replace, add, remove.</li><li><code>purchase_units[].description</code> &mdash; replace, add, remove.</li><li><code>purchase_units[].payee.email</code> &mdash; replace, add.</li><li><code>purchase_units[].shipping</code> &mdash; replace, add, remove.</li><li><code>purchase_units[].soft_descriptor</code> &mdash; replace, add, remove.</li><li><code>purchase_units[].amount</code> &mdash; replace.</li><li><code>purchase_units[].invoice_id</code> &mdash; replace, add, remove.</li><li><code>purchase_units[].payment_instruction</code> &mdash; replace.</li><li><code>purchase_units[].payment_instruction.disbursement_mode</code> &mdash; replace.<blockquote><strong>Note:</strong> By default, <code>disbursement_mode</code> is <code>INSTANT</code>.</blockquote></li><li><code>purchase_units[].payment_instruction.platform_fees</code> &mdash; replace, add, remove.</li></ul>
 */
public class OrdersPatchRequest extends HttpRequest<Void> {

    public OrdersPatchRequest(String orderId) {
        super("/v2/checkout/orders/{order_id}?", "PATCH", Void.class);
        try {
            path(path().replace("{order_id}", URLEncoder.encode(String.valueOf(orderId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    public OrdersPatchRequest authorization(String authorization) {
        header("Authorization", String.valueOf(authorization));
        return this;
    }
    
    public OrdersPatchRequest contentType(String contentType) {
        header("Content-Type", String.valueOf(contentType));
        return this;
    }
    
    

    public OrdersPatchRequest requestBody(List<Patch> patchRequest) {
        super.requestBody(patchRequest);
        return this;
    }
}
