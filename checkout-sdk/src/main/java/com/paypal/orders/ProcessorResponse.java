package com.paypal.orders;

import com.paypal.http.annotations.Model;
import com.paypal.http.annotations.SerializedName;

/**
 * An object that provides additional processor information for a direct credit card transaction.
 */
@Model
public class ProcessorResponse {

    // Required default constructor
    public ProcessorResponse() {}

    /**
     * The address verification code for Visa, Discover, Mastercard, or American Express transactions.
     */
    @SerializedName("avs_code")
    private String avsCode;

    public String avsCode() {
        return avsCode;
    }

    public ProcessorResponse avsCode(String avsCode) {
        this.avsCode = avsCode;
        return this;
    }

    /**
     * The card verification value code for for Visa, Discover, Mastercard, or American Express.
     */
    @SerializedName("cvv_code")
    private String cvvCode;

    public String cvvCode() {
        return cvvCode;
    }

    public ProcessorResponse cvvCode(String cvvCode) {
        this.cvvCode = cvvCode;
        return this;
    }

    /**
     * Processor response code for the non-PayPal payment processor errors.
     */
    @SerializedName("response_code")
    private String responseCode;

    public String responseCode() {
        return responseCode;
    }

    public ProcessorResponse responseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
}
