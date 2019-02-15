// This class was generated on Fri, 15 Feb 2019 14:59:09 PST by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// PhoneWithType.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/9xVwWrbQBC99yuGPdmg2A20PehWlJwKbkhNewjGrKSxNLCaVXdHuKLk38tqVQdbNm1pCSU378zbeW/fjEff1bpvUaXqrraM8IWkhiGSqM/akc4NrnQTACpRH7B/OtygLxy1QpZVqtY1QjuUIN5Z1+gQX6hEvXdO95HjdaLuUZcf2fQq3WnjMQS+duSwPATunG3RCaFX6cOxuqmmgXHLXZOjO9J3krikNQISIAYSD4Vmy1RoA8SCjodHaAMPt4vrd29GNHEFrdEM8ZmbWS3S+nS53O/3C5JuQSxLh8VyfXV/m10NV5fI8z8yQ1x30QsvQcPUjMJ2LK7fFtoY4mpb2BKPTDkAYmJqygiAsQIEIMyybP5MDkEU0eTEWIJBrqQGuwOpEbIMNJfDzwNrpIOm8wJsBXKEyqEWdCC1Zrh+CyVVJD5WPr1XWPbkxQcK/ZQt0QvF0+jA6iabD+y+y4Nn4fJYY/ZpNf/bMefOmMfkl/3Fb4LsyfK5gT+TnPb3ABrVP5Pwn86e0z3NTWWf9O0/GMaLf5SXMaPT7TN0evMbvY6LV+IX5HQfj+FL2zik/8lIbh5f/QAAAP//
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The phone information.
 */
@Model
public class PhoneWithType {

    // Required default constructor
    public PhoneWithType() {}

	/**
	* REQUIRED
	* The phone number, in its canonical international [E.164 numbering plan format](https://www.itu.int/rec/T-REC-E.164/en).
	*/
	@SerializedName("phone_number")
	private Phone phoneNumber;

	public Phone phoneNumber() { return phoneNumber; }
	
	public PhoneWithType phoneNumber(Phone phoneNumber) {
	    this.phoneNumber = phoneNumber;
	    return this;
	}

	/**
	* The phone type.
	*/
	@SerializedName("phone_type")
	private String phoneType;

	public String phoneType() { return phoneType; }
	
	public PhoneWithType phoneType(String phoneType) {
	    this.phoneType = phoneType;
	    return this;
	}
}
