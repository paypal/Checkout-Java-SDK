// This class was generated on Fri, 15 Feb 2019 14:59:09 PST by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// AirlinePassengerDetail.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/8RWTW/cRgy991cQ6iEJoJWSGg1Q3xznA0GAxEid5pAaNleiVgOPhgpJ2VGL/PdiRlpvdtf9QJq6F8P7huQ8vnnD0e/Z6dhTdpgdOfEuEJygKoUVCTwlQ+ezPPsFxeHS02vsYmSWZ69o3Px4SlqJ681xyA6zKQu4AWsJcK7ar6sWWZ4dieA4bfswz94S1m+CH7PDBr1SBD4OTqi+AU6EexJzpNnhhxvCauLCap9exUMwGc8rrmmL6s7CNu3TluCDXfOialGwMhJ4+fMbOHj0+PHiEcSUs/tlzZWWLhitBGNeWTuhykohtXIuv4ixWj4Aa9HA1RTMNY40yTHHAAsIrRyH4tfh4cODaum5uvw4sFH6Pf2t1ITDakJes9HhBJdf4nD6Rdm4NTQs8EIIDZ6IM3QBnMKUGdentBdP5lobCDDUENj2Yt+9uiVWYVCqwYXUl3G/8HRFHmru4pYBO9JEJckwEyzgnVJKuDj+4WKf9nHrAsI1i6+v3YxV3PUo8XxhCBUHE/aeaujFVQT3j9+dPICOrOU6hyWGS6hQ6jw1UwmrLpYsNQmYYFCs4rHprHq5K/u/9GYYvP+c/61BazQ65+Z86cTaLYfuruxbVA1DvUDPgSBG5/EEPrwMRhLIEpRaN9cl+Tq0s/utWa+HZWnMXgtH1hQsq7K1zpfSVAcHBz99r5SkWfxYPH5QwCmDUC+kFAy0p8qhB08r9HCFfiDNQYeqjTbAaVNuILHOYeQBtOXB19EiaVXh2lkLgQFVuXJoNFOMBnEdLX6bG8IC3rcU6IoEelZ1S095qmPr7lFquEhKxcwLsLGnAk5bp/FODR4F6FPkro4D1EyaXH2F3k3yeD+RKuA5x1js+rjJc1rKgDLCwaN4Y1L8+k60LqwieBn4OgAueTDwhD2MhKLFt/VNMsOea8KEbswyA/seiQvr+duj2Pjfz1z00YDxTJrB+/M9rrev7zwcz07ePjs+On32tEhDLVG/p3CTmxor4BgDLAkQloO6QKoJzyG46nL6jwUwjMDWkkxqTEMIQzTCkkB77wxcMIbGiVoOHtXm+msp4LqlsBExHv9mz+JuRsXtav65hu9vodyTKId8A99TiBWmdu+mj5W7orDfyBb8dZ2kEunI55O8w646V9ee9tvaxr+ur6nGbMn4aqJXBmNQYyHoBm+u9/RlnIILlR/qOKumUvE7YexcNemD8T7c03yr9t0o1Qs17tOWSDfQ/gCblvLpcbA4m423xLlD5jo0u8xvoFue57Q0f/f8T3xlz48b7Ou8OOdPJuqcH2dbHkVLzk/i9H37T8fotMtfGnvedNfU3bapO16beo7/JjKffT77/N0fAAAA//8=
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Detail of the airline passenger.
 */
@Model
public class AirlinePassengerDetail {

    // Required default constructor
    public AirlinePassengerDetail() {}

	/**
	* The [two-character ISO 3166-1 code](/docs/integration/direct/rest/country-codes/) that identifies the country or region.<blockquote><strong>Note:</strong> The country code for Great Britain is <code>GB</code> and not <code>UK</code> as used in the top-level domain names for that country. Use the `C2` country code for China worldwide for comparable uncontrolled price (CUP) method, bank card, and cross-border transactions.</blockquote>
	*/
	@SerializedName("country_code")
	private String countryCode;

	public String countryCode() { return countryCode; }
	
	public AirlinePassengerDetail countryCode(String countryCode) {
	    this.countryCode = countryCode;
	    return this;
	}

	/**
	* The stand-alone date, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). To represent special legal values, such as a date of birth, you should use dates with no associated time or time-zone data. Whenever possible, use the standard `date_time` type. This regular expression does not validate all dates. For example, February 31 is valid and nothing is known about leap years.
	*/
	@SerializedName("date_of_birth")
	private String dateOfBirth;

	public String dateOfBirth() { return dateOfBirth; }
	
	public AirlinePassengerDetail dateOfBirth(String dateOfBirth) {
	    this.dateOfBirth = dateOfBirth;
	    return this;
	}

	/**
	* The name of the party.
	*/
	@SerializedName("name")
	private Name name;

	public Name name() { return name; }
	
	public AirlinePassengerDetail name(Name name) {
	    this.name = name;
	    return this;
	}
}
