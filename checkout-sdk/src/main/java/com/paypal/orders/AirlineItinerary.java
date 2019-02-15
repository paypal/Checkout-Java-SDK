// This class was generated on Fri, 15 Feb 2019 14:59:09 PST by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// AirlineItinerary.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data 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
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The details of the airline itinerary.
 */
@Model
public class AirlineItinerary {

    // Required default constructor
    public AirlineItinerary() {}

	/**
	* An array of the airline itinerary legs.
	*/
	@SerializedName(value = "flight_leg_details", listClass = FlightLeg.class)
	private List<FlightLeg> flightLegDetails;

	public List<FlightLeg> flightLegDetails() { return flightLegDetails; }
	
	public AirlineItinerary flightLegDetails(List<FlightLeg> flightLegDetails) {
	    this.flightLegDetails = flightLegDetails;
	    return this;
	}

	/**
	* Detail of the airline passenger.
	*/
	@SerializedName("passenger")
	private AirlinePassengerDetail passenger;

	public AirlinePassengerDetail passenger() { return passenger; }
	
	public AirlineItinerary passenger(AirlinePassengerDetail passenger) {
	    this.passenger = passenger;
	    return this;
	}

	/**
	* Details of the airline ticket.
	*/
	@SerializedName("ticket")
	private AirlineTicketDetail ticket;

	public AirlineTicketDetail ticket() { return ticket; }
	
	public AirlineItinerary ticket(AirlineTicketDetail ticket) {
	    this.ticket = ticket;
	    return this;
	}
}
