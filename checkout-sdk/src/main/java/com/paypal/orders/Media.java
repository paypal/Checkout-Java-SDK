// This class was generated on Fri, 15 Feb 2019 14:59:09 PST by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// Media.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/6ySQUvzQBCG79+vGPbUQr6miHrITbFCkdiixUspsk0mycJmdp2dYIP0v0tabS0FFfW47zDMs8/Mi5q1HlWiUsyNVpF60Gz00uKtrrtYReoG2/3jCkPGxotxpBI1qxDqrhGk9QiacsgcCa7kP1LmckMlhKzCGgcqUhfMut2OG0bqDnU+IduqpNA2YBc8NYYx3wVTdh5ZDAaVzHegQdhQeUy6NKS5fXyfewC+rY32peNvbLjpmBvuEWGeNlaMb9i7gDAmQSYUSLWxMFoJUjCOAvTScTrqw1SzwIQwgWvHtRZwxYceDEGXCJcuNxgWvUrEhySOxTkbBgalGDgu40pqG3ORnQxPz/q/lUeNtevoS4PdDg+0vQWf7fzHfmbPLoHN0UGH9S0T539jYrH+9woAAP//
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The media type and context-encoding scheme.
 */
@Model
public class Media {

    // Required default constructor
    public Media() {}

	/**
	* The content-encoding scheme. See [Multipurpose Internet Mail Extensions (MIME) Part One: Format of Internet Message Bodies](https://tools.ietf.org/html/rfc2045).
	*/
	@SerializedName("binaryEncoding")
	private String binaryEncoding;

	public String binaryEncoding() { return binaryEncoding; }
	
	public Media binaryEncoding(String binaryEncoding) {
	    this.binaryEncoding = binaryEncoding;
	    return this;
	}

	/**
	* The media type. See [Multipurpose Internet Mail Extensions (MIME) Part Two: Media Types](https://tools.ietf.org/html/rfc2046).
	*/
	@SerializedName("type")
	private String type;

	public String type() { return type; }
	
	public Media type(String type) {
	    this.type = type;
	    return this;
	}
}
