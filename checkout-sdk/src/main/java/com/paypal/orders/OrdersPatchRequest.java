// This class was generated on Tue, 04 Dec 2018 17:38:27 PST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// OrdersPatchRequest.java
// @version 0.1.0-dev+904328-dirty
// @type request
// @data H4sIAAAAAAAC/8xYT1MjtxO9/z5Fly5cZm1qf6kcnJMXSLFJFhxwNpUilC1LbUbLjCSkFsSh+O4pSTPYYzvsQqDKN6bV0/Ne/9PD9+yE18gGzDiJzvcsJ1Gygh2iF05ZUkazAfvNSk7ogWtIfnCnqAQqEaYHZ0fD8dHhFIyD6XA0Ojv9HJ88cQq+B3+YAIJrbQhCCrI1xumn0S9H4y3vQcITvTwCJ3JqFjIQCWb2BQX5wZ9hf///gviswvQnNoYSuewYXPc4Pw3boJFADpkd+q1H1//UouMxLX6rW7/7lf4mipmRiydgdZyFkQ0npQl1i2xpbr8it8VwaCsutvus4fw2EDY4UXKPk6AV+ReBKYBL+VaILi57Ingy9UTJl6MrwGFtbvENUcrldO00TssXiD2suap2stq+VNYqfbXTSfRmTpO24sbtNFZem7Bja+bisqf0rVECd32qLV/UqGmitCcXxPOnOz/NKiOub4KhziuenGkaHU8MYXPt9VftcBCcQ03VooDF8uJt71DlYa6wknBXok4O65S6pVzagcOT7Dde6DWW7Vyezn5/44rsr1zurGC/BnSLEXe8RkLn2eDismDHyCW6jvWejRc2ahtPTukrVrDP3KkYqtE8w0ClcervdJ+zgv2Mi3856cqhsYGaXyOcHZ2PYTj6CIJXlS9AaVEFiUnUzJA7dEDmGjUondNfJpAryudD8poCD1SiJiXSB8GLEmvswbhEuOVVQFC+dW4qMRQCvX83jvFzZrIE+8C9Em21KpX6Uf7gUTikxq/HCjZ0ji9yevYLdoZcnupqwQZzXnmMhpugHEo2IBewYCNnLDpS6NlAh6p6KL6a3AOTJMu75Laa27WDbmrbD8M8yrFHrZVTxsHhTUBPEDtkLT3c2qrJXz/TnxtX84Z0D34v0eXS7OWDvfjW3hdv9N5rZOSyYD8aV6/35YhT+byuTOp4omQnaZs9WCJ8PAQzT5SyoibTiOxX4nOWs52DPOIeNf8irMFOW2bSFKiDff2kS2SogUeokcpP56cnzbpq1H3kFCu7AMsdKV41DNOBQ2+CE+jX+H7/JN/GsEr460WZO1N3SDWGzaJkDiYK9lSRWB7i7goJpBEh3hBQmWbQYxS4K1Xczwbi/ZT8U1P3oDMMaV9Ej+lyLp5V5y28v3GUje1QT4+bxB9RRSrC1LbCZ3biyxFaTuV6z5X/vTyclsVpGeV5e6MK5K7f5JcaokOwtWwyzBuxnZu8JadZ/Ky0DkiDHqI8cBkf8KbtXoPR5UP08tZojzlONBft7m/Yrq7suIdZwY6J7Cek0si4aYbjg2OWdygbsP7t+74oUVybQP38e0X/vt2WD6xg59fKPmI6+suiIJTn6ReFAyORDd7vf/fwv38AAAD//w==
// DO NOT EDIT
package com.paypal.orders;

import com.braintreepayments.http.*;
import java.util.*;
import java.util.stream.Collectors;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * Updates an order with the `CREATED` or `APPROVED` status. You cannot update an order with the `COMPLETED` status. You can patch these attributes and objects:<table><thead><tr><th>Attribute or object</th><th>Operations</th></tr></thead><tbody><tr><td><code>intent</code></td><td>replace</td></tr><tr><td><code>purchase_units</code></td><td>replace, add</td></tr><tr><td><code>purchase_units[].custom_id</code></td><td>replace, add, remove</td></tr><tr><td><code>purchase_units[].description</code></td><td>replace, add, remove</td></tr><tr><td><code>purchase_units[].payee.email</code></td><td>replace, add</td></tr><tr><td><code>purchase_units[].shipping</code></td><td>replace, add, remove</td></tr><tr><td><code>purchase_units[].soft_descriptor</code></td><td>replace, add, remove</td></tr><tr><td><code>purchase_units[].amount</code></td><td>replace</td></tr><tr><td><code>purchase_units[].invoice_id</code></td><td>replace, add, remove</td></tr><tr><td><code>purchase_units[].payment_instruction</code></td><td><blockquote><strong>Note:</strong> Currently, you cannot patch this field when you <code>replace</code> a <code>purchase_unit</code>.</blockquote></td></tr></tbody></table>
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
