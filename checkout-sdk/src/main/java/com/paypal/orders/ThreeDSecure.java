package com.paypal.orders;

import com.paypal.http.annotations.SerializedName;

public class ThreeDSecure {

    // Required default constructor
    public ThreeDSecure() {}

    /**
     * The outcome of the issuer's authentication.
     */
    @SerializedName("authentication_status")
    private String authenticationStatus;

    public String authenticationStatus() { return authenticationStatus; }

    public ThreeDSecure authenticationStatus(String authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
        return this;
    }

    /**
     * Status of authentication eligibility.
     */
    @SerializedName("enrollment_status")
    private String enrollmentStatus;

    public String enrollmentStatus() { return enrollmentStatus; }

    public ThreeDSecure enrollmentStatus(String enrollmentStatus) {
        this.enrollmentStatus = enrollmentStatus;
        return this;
    }
}
