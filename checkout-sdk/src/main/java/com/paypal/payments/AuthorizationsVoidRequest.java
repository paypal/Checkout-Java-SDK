// This class was generated on Wed, 11 Sep 2019 17:50:29 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// AuthorizationsVoidRequest.java
// @version 0.1.0-dev+8fcb5f
// @type request
// @data H4sIAAAAAAAC/7xW32/bNhB+319x4B6yAbIVdMMeVOzBa1o0HZZ4tdFgWILgTJ4tNhKpHE/ptCD/+0BRdvwrGAoMe4u/4x31fffdMY/qAmtShcJWSs/2bxTrXRg/eGtUps4oaLZNxFShPnlrQgaeQaPTVIUM0ME6kww02NXkJINFB+dnY/jDt/Go8wKx4PHTICUKlBhgQeRg2VZVBxobaZnMWGXq95a4myJjTUIcVPHnTabeExriHfRRzbsmcgnC1q1Upj4hW1xUNHCcbHNUmfqVuhciu7znHmq8I/j4djaHyfQcNFaRvHW6ag2BlAQLQiYG8XfkwLoeu25PT3/Q2hvq/6KdW1Iwf45C2VOCL1bKo+m/9Fcc5kVJyYnVfV0IuqSaxjAvCR6waglseKFWD7/6qZLXE60phNE8fn4CV/L68CrPh5UwWP1cSFeWnNxas6lSbGKBNJO8XD42e8KMXerjaaY+EppLV3WqWGIVKAL3rWUyqhBuKVNT9g2xWAqqcG1VPWX/6oI33gk5GfXHtk2wF9j1wPpiWHqGeGcalNQtBKb7loLAwptuT3psmmroTZ4oLz3XKANnuCqJk4dOUuAkZp18Dt6d/D+KTLGbYjWK9hxNQojZe/Px0oldjSYuTscoTgfxqGH/YA0Z+DC7vIArWkDvLvjuw9X8e8B1lTT+1kQHLy2FXomaWJfoZAzvPIMhQRsHLtB6KhBKpuXP18p4HXJsbM60JCanKf4aDf0I+bcNdg1Wozgko82l1yqpf5TX4EscGpR+Liqv7+5bL4NXExqEvVsl5MILFUPuNh4ZSMlE0CBLB8LoAupkH+vgS2l1tFCMOuLY/Bodrqxb9VpsFg54BwsqsVqCXwJuRMr6Y+v0ug0bObsdMaENsSZZKYkB4Sj59Rby3G/rfi0MWy0tJuQVyW1oF59JyyBOvq/O19h2AA58e5Opd57r/cU/RSm/bu3vPG23/bv27OzDZV/SWpkVuTjnZOD8rJ/7qOaxB8z3z9t/Maw36QwFSUUiGKHQeBdoGxu21cB9e8nEzaEy9V6k+Y2k9CYO8OVsrpJ4qlD5w6t8+PiQ7778+eO+XE/58M/A7M42GyZv/2pIC5mZoLThjTekilenPz598w8AAAD//w==
// DO NOT EDIT
package com.paypal.payments;

import com.braintreepayments.http.*;
import java.util.*;
import java.util.stream.Collectors;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * Voids, or cancels, an authorized payment, by ID. You cannot void an authorized payment that has been fully captured.
 */
public class AuthorizationsVoidRequest extends HttpRequest<Void> {

    public AuthorizationsVoidRequest(String authorizationId) {
        super("/v2/payments/authorizations/{authorization_id}/void?", "POST", Void.class);
        try {
            path(path().replace("{authorization_id}", URLEncoder.encode(String.valueOf(authorizationId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    public AuthorizationsVoidRequest authorization(String authorization) {
        header("Authorization", String.valueOf(authorization));
        return this;
    }
    
    public AuthorizationsVoidRequest contentType(String contentType) {
        header("Content-Type", String.valueOf(contentType));
        return this;
    }
    
    public AuthorizationsVoidRequest payPalAuthAssertion(String payPalAuthAssertion) {
        header("PayPal-Auth-Assertion", String.valueOf(payPalAuthAssertion));
        return this;
    }
    
    
}
