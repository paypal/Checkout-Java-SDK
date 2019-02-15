// This class was generated on Fri, 15 Feb 2019 14:59:09 PST by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// AirlineTicketDetail.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/7xU0WvUThB+//0Vw/5eFNJEORS8t6OlUASVcupDKddJMkmW7u2mM5PWKP3fZZP0bLwqoqVPx33z7c73zX6Tb2bdt2SWZmXZWU+wtsUlKRyRonUmMZ+QLeaO3uE20kxi3lL/488RScG2VRu8WZrxlECoQBsCnO7U4c7UJGbFjP3Y8UViTgnL9971ZlmhE4rAVWeZyh3wgUNLrJbELM92WkXZ+npfnBXpaFOi0kzmDJ4LXjcEoujLA3TBE0RSAtbD2YlXYk86QIC+BLVbgirwFvX8WaPayjLLNAQnqSWt0sB11ujWZVwVi8Xizf9CRWxz8Cp9/TyFdQCmlknIK0hLhUUHjmp0cI2uI0lAuqIBFMCxaaggt6xNAn3oQJrQuRI6GVUK3FhtwAdAkVBYVJokBh5+D75OhjCFzw15uiaGNojY3FEy3KN37pFLuIi3buLJC9C+pRTWjRVgqjuHDPQlahcbPJSBBHzQqNuO43FuFJXCcYhc3LaxyTHl3CH3sHgJVkb+MEsftLG+juClDzceMA+dgiNsoSdk+dew+M652+SPEmN9vSmQ2RJvilDuZ+cBwjxFh2MRYvEu+2PmYcgeP5Eb321z4pn+HfRT7kd1YzWLjyKj1BLy/v7uPpFyZbwmt8GafNHvv8KD5bmjk9V6NflJAJ0EWJ0eTkBcidXpYXaPk8JHb686Gt4sm2hVXJ2hFYytQBvUu8FoXIfH+ZT91VR8BH89lak8n0pk7hL5G2f0mMbOb//7DgAA//8=
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Details of the airline ticket.
 */
@Model
public class AirlineTicketDetail {

    // Required default constructor
    public AirlineTicketDetail() {}

	/**
	* The stand-alone date, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). To represent special legal values, such as a date of birth, you should use dates with no associated time or time-zone data. Whenever possible, use the standard `date_time` type. This regular expression does not validate all dates. For example, February 31 is valid and nothing is known about leap years.
	*/
	@SerializedName("issue_date")
	private String issueDate;

	public String issueDate() { return issueDate; }
	
	public AirlineTicketDetail issueDate(String issueDate) {
	    this.issueDate = issueDate;
	    return this;
	}

	/**
	* Carrier code of the ticket issuer.
	*/
	@SerializedName("issuing_carrier_code")
	private String issuingCarrierCode;

	public String issuingCarrierCode() { return issuingCarrierCode; }
	
	public AirlineTicketDetail issuingCarrierCode(String issuingCarrierCode) {
	    this.issuingCarrierCode = issuingCarrierCode;
	    return this;
	}

	/**
	* Ticket number/id as issued by the airline.
	*/
	@SerializedName("number")
	private String number;

	public String number() { return number; }
	
	public AirlineTicketDetail number(String number) {
	    this.number = number;
	    return this;
	}

	/**
	* IATA number, also ARC number or ARC/IATA number. Unique code/number for travel agency that issued this ticket.
	*/
	@SerializedName("travel_agency_code")
	private String travelAgencyCode;

	public String travelAgencyCode() { return travelAgencyCode; }
	
	public AirlineTicketDetail travelAgencyCode(String travelAgencyCode) {
	    this.travelAgencyCode = travelAgencyCode;
	    return this;
	}

	/**
	* Name of the travel agency that issued the ticket.
	*/
	@SerializedName("travel_agency_name")
	private String travelAgencyName;

	public String travelAgencyName() { return travelAgencyName; }
	
	public AirlineTicketDetail travelAgencyName(String travelAgencyName) {
	    this.travelAgencyName = travelAgencyName;
	    return this;
	}
}
