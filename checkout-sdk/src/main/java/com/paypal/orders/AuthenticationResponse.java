package com.paypal.orders;

import com.paypal.http.annotations.Model;
import com.paypal.http.annotations.SerializedName;

@Model
public class AuthenticationResponse {

    // Required default constructor
    public AuthenticationResponse() {}

    /**
     * Liability shift indicator. The outcome of the issuer's authentication.
     */
    @SerializedName("liability_shift")
    private String liabilityShift;

    public String liabilityShift() { return liabilityShift; }

    public AuthenticationResponse liabilityShift(String liabilityShift) {
        this.liabilityShift = liabilityShift;
        return this;
    }

    /**
     * Results of 3D Secure Authentication.
     */
    @SerializedName("three_d_secure")
    private ThreeDSecure threeDSecure;

    public ThreeDSecure threeDSecure() { return threeDSecure; }

    public AuthenticationResponse threeDSecure(ThreeDSecure threeDSecure) {
        this.threeDSecure = threeDSecure;
        return this;
    }


}
