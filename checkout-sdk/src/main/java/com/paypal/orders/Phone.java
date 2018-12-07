// This class was generated on Tue, 04 Dec 2018 17:38:27 PST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// Phone.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data H4sIAAAAAAAC/9xTwWrbQBC99yuGPdmgWA20PehWlJwKbkhNLyGEkTS2Blaz6u4srij597KW6hDLpS2FUnLT7szb9+a90TezGXoyhblpnZDJzGf0jJWlNXbp2mTmAw1PhysKtede2YkpzKYl6BMQJHYV+QxYgDVAjeKEa7TAouQFEwAt3F2vLt+9mbpZdtBbFNg636HeL1rVPhR5vt/vV6xxxaK5pzrfXNxelxcHaE6yXJnMvPceh1H668zcEjYfxQ6m2KINlC6+RPbUHC9uvOvJK1Mwxd1x6KBJxHzq2kVRPzzUrqFnDpwU5m5MDVCjtWm+1AiLslz+I2tgFNFVLNSAJdlpC24L2hKUJaA0h88j60gHXQwK4hQqgp0nVPKgLQpcvoWGd6xhfPkUVzsJHDQkCnyqNhSUx9PkwPqqXB7YQ6ySZwk8vbH4tP6zSNXHk0QlWvuY/TJW+qokgZ08jNTPoj1TnMd7bJrE/+0q/qbwH8ae0z2vzWWfxPYf7OJP/5MXvaL3j6++AwAA//8=
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
	* REQUIRED
	* The country calling code (CC), in its canonical international [E.164 numbering plan format](https://www.itu.int/rec/T-REC-E.164/en). The combined length of the CC and the national number must not be greater than 15 digits. The national number consists of a national destination code (NDC) and subscriber number (SN).
	*/
	@SerializedName("country_code")
	private String countryCode;

	public String countryCode() { return countryCode; }
	
	public Phone countryCode(String countryCode) {
	    this.countryCode = countryCode;
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
