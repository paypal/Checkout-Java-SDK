// This class was generated on Fri, 15 Feb 2019 14:59:09 PST by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// AddressDetails.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/7xVTW/DRBC98ytGPjtuEbfcqlYIASpVVbgAisfecTJivWNmd5NaqP8drT+SukmFqqLe7Jn9eO/Nm9l/sqe+o2yd3Rij5D3cUUC2Psuz31AZK0v32KYFWZ79RP3p5458rdwFFpets6cdgRO36kRD2gRoDKcc2vQ5HG3GoyHsMAAqgZeWArfkwREZMtCIQi1tZxldTTko+79yEAUJO1LwNTlUFg+HHSlBw45WW0V2xzvYNaItppuh5e0uQEXT6QXcS4AjwAOHXbqsFQdhx2qgQw09oDMgHTnwErWmAh7JRGfQhXnLcDNZ44s/4vX1d3WlV8MHfS8K9IxtZymHcoK0mW8s5oBlR5tvS2AP0Ue0tgdMSCp2I3BpTrsn0QoflChsXGwr0jKHcg5gS2U+oJ5Doe+oLLI8u1HFfqzvdZ49EppfnO2zdYPWUwr8HVnJHAMPKh1pYPLZ+vejM3xQdttzQ1SRrWG3HSAs3PE2s7TKDaSwASv1QHcyhFKn5MmF9E/QKbXsqYBfjxLNxw77kytGMWAwjbVUz+LNC/1YMZzLvNxXwKJeYy1rMTQW81ZxTw5+kOjHSH11Sn5WXRetfcn/U2JDlvek/caT7rleqnwhed6T8yKYFhXwID6ANA3XBJU851DhdlJkaLXuVT4J9kVUX9l5wXIZPyc45kek8GP0Aco7jdqXwG76hJ/Rfb4hPshjEPQikznzPpfRnl+KN82MS2in+LtYU/5NI6W2iZRDJdHSHtXkoIJmMBc9pyb3B+y/il6sNvM4WPJbJs4JNqw+rEQNKZALHHqoyMoBcJpfx3EkepxlF0eZj9Xqwjjz7LaWTsekWZVesg8MswJu0aUXDqGxGHLwQbTPobEimmSXdpAd09PWkgv/i+p/vnzzLwAAAP//
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The non-portable additional address details that are sometimes needed for compliance, risk, or other scenarios where fine-grain address information might be needed. Not portable with common third party and open source. Redundant with core fields.<br/>For example, `address_portable.address_line_1` is usually a combination of `address_details.street_number`, `street_name`, and `street_type`.
 */
@Model
public class AddressDetails {

    // Required default constructor
    public AddressDetails() {}

	/**
	* A named locations that represents the premise. Usually a building name or number or collection of buildings with a common name or number. For example, <code>Craven House</code>.
	*/
	@SerializedName("building_name")
	private String buildingName;

	public String buildingName() { return buildingName; }
	
	public AddressDetails buildingName(String buildingName) {
	    this.buildingName = buildingName;
	    return this;
	}

	/**
	* The delivery service. Post office box, bag number, or post office name.
	*/
	@SerializedName("delivery_service")
	private String deliveryService;

	public String deliveryService() { return deliveryService; }
	
	public AddressDetails deliveryService(String deliveryService) {
	    this.deliveryService = deliveryService;
	    return this;
	}

	/**
	* The street name. Just `Drury` in `Drury Lane`.
	*/
	@SerializedName("street_name")
	private String streetName;

	public String streetName() { return streetName; }
	
	public AddressDetails streetName(String streetName) {
	    this.streetName = streetName;
	    return this;
	}

	/**
	* The street number.
	*/
	@SerializedName("street_number")
	private String streetNumber;

	public String streetNumber() { return streetNumber; }
	
	public AddressDetails streetNumber(String streetNumber) {
	    this.streetNumber = streetNumber;
	    return this;
	}

	/**
	* The street type. For example, avenue, boulevard, road, or expressway.
	*/
	@SerializedName("street_type")
	private String streetType;

	public String streetType() { return streetType; }
	
	public AddressDetails streetType(String streetType) {
	    this.streetType = streetType;
	    return this;
	}

	/**
	* The first-order entity below a named building or location that represents the sub-premise. Usually a single building within a collection of buildings with a common name. Can be a flat, story, floor, room, or apartment.
	*/
	@SerializedName("sub_building")
	private String subBuilding;

	public String subBuilding() { return subBuilding; }
	
	public AddressDetails subBuilding(String subBuilding) {
	    this.subBuilding = subBuilding;
	    return this;
	}
}
