// This class was generated on Fri, 15 Feb 2019 14:59:09 PST by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// Phone.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/9xTwWrbQBC99yuGPdmgWA20PehWlJwKbkhNLyGYkTSWBlaz6u4IV5T8e1lLVUjk0kPBlN60M/PmvX1v9cPsho5MZu4aJ2QS8xU9Y2Fpi20sm8R8ouH5cEOh9NwpOzGZ2TUEXQSC9G1BPgEWYA1QojjhEi2wKHnBCEALD7eb6w/vpmmWGjqLAgfnW9THVaPahSxNj8fjhrXfsGjqqUx3V/e3+dUJmpKsNyYxH73HYZT+NjH3hNVnsYPJDmgDxcK3nj1Vc+HOu468MgWTPcyXDhpFLG9dul7UD/sSrWWp96Wr6IUT88DYWLoyDcC0AeIgrPJ8fSGLYBTRFixUgSWptQF3AG0I8hxQqtPnzDrSQdsHBXEKBUHtCZU8aIMC1++h4po1jJtf40ongYOGSIHP3YqC8niaHNje5OsTe+iL6FkETztWX7Z/Ha301j4lf8yXvitJYCf7kftFtmeay3znoUn9hYT/cvac7mVvKftVbv/AY/ztj/J/vFH1/bmkH5/e/AQAAP//
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The phone number, in its canonical international [E.164 numbering plan format](https://www.itu.int/rec/T-REC-E.164/en).
 */
@Model
public class Phone {

    // Required default constructor
    public Phone() {}

	/**
	* The country calling code (CC), in its canonical international [E.164 numbering plan format](https://www.itu.int/rec/T-REC-E.164/en). The combined length of the CC and the national number must not be greater than 15 digits. The national number consists of a national destination code (NDC) and subscriber number (SN).
	*/
	@SerializedName("country_code")
	private String countryCallingCode;

	public String countryCallingCode() { return countryCallingCode; }
	
	public Phone countryCallingCode(String countryCallingCode) {
	    this.countryCallingCode = countryCallingCode;
	    return this;
	}

	/**
	* The extension number.
	*/
	@SerializedName("extension_number")
	private String extensionNumber;

	public String extensionNumber() { return extensionNumber; }
	
	public Phone extensionNumber(String extensionNumber) {
	    this.extensionNumber = extensionNumber;
	    return this;
	}

	/**
	* REQUIRED
	* The national number, in its canonical international [E.164 numbering plan format](https://www.itu.int/rec/T-REC-E.164/en). The combined length of the country calling code (CC) and the national number must not be greater than 15 digits. The national number consists of a national destination code (NDC) and subscriber number (SN).
	*/
	@SerializedName("national_number")
	private String nationalNumber;

	public String nationalNumber() { return nationalNumber; }
	
	public Phone nationalNumber(String nationalNumber) {
	    this.nationalNumber = nationalNumber;
	    return this;
	}
}
