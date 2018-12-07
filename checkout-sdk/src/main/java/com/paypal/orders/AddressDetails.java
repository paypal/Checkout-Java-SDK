// This class was generated on Tue, 04 Dec 2018 17:38:27 PST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// AddressDetails.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data H4sIAAAAAAAC/7xVTW/bSAy9768gdJa1WezNtyDBYrG7yAZB2ktb2JSGsomOhipnxo5Q5L8Xow87ih0UQYrcJHL48d48cr5n911L2TK7NEbJe7imgGx9lmcfURlLSzfYpANZnv1L3fHnmnyl3AYWly2z+y2BE7doRUMKAjSGkw9t+uxTmyE1hC0GQCXw0lDghjw4IkMGalGopGkto6soB2X/NQdRkLAlBV+RQ2XxsN+SEtTsaLFRZHeowa4WbTBVhoY32wAljdkLuJEAhwb3HLapWCMOwpbVQIsaOkBnQFpyXqJWVMAdmegMujBF9IXJGl/AX6JAD9i0lnJYjz2sphLFZLDsaPXHGthD9BGt7QBT6ZLd0KnUx+iRpcIHJQorF5uSdN23tZ5s2NDcErqW1kWWZ5eq2A1XepFnd4Tmf2e7bFmj9ZQM3yIrmYPhVqUlDUw+W346iMEHZbc51UAZ2Rp2m76DmSCee+bquIRkNmCl6gGPGlBqlTy5kP4JWqWGPRXw4UDSlLaPT0IY6IBeJ9ZSNdE3HfTDLeF0s/O4Zzf2OV5c/FlVYqj/oivFHTn4W6IfLNXvR+db2XXR2sf8pxQbsrwj7VaedMfVnOUzztMxnA7BeKiAW/EBpK65IijlIYcSNyMj/XS1T/yJsHeC+kTNM5Rz+ynAwT90Cv9EH2B9rVG7NbAbP+E/dG8fiFfi6Ak9i2TyvIxlkOe79pt2xrluR/uLvSb/s0FKYxMph1KipR2qyUEFTS8uekhD7vfYvRe8WK6mdTDHN3ecAqxZfViIGlIgFzh0UJKVPeC4vw7rSPSwy86uMh/LxZl15tltLB3TpF2VHq9XLLMCrtClRw2hthhy8EG0y6G2Ippol6anHdNr1pALv4T1L4+//QAAAP//
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The non-portable additional address details that are sometimes needed for compliance, risk, or other scenarios where fine-grain address information might be needed. Not portable with common third party and opensource. Redundant with core fields. For example, `address_portable.address_line_1` is usually a combination of `address_details.street_number` and `street_name` and `street_type`.
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
