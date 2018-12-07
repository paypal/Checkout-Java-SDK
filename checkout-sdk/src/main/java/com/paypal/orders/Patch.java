// This class was generated on Tue, 04 Dec 2018 17:38:27 PST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// Patch.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data H4sIAAAAAAAC/7STwWrjMBCG7/sUg84m7Nm3hT3tQhLa0EspZCJPYhXZo47GKabk3YuUxME1pbRpj/o1Y38fM3oxqz6QKc0S1damMHcoDjee5tik2BTmP/WXw1+KVlxQx60pzaom+He7mENI3cCbR7IKyoAh+B4Cijr00IUKlWK6EIrciaU4M4X5I4L98f+/C3NDWC1a35tyiz5SCp46J1QNwVI4kKijaMr7gTyquHY3Rd8KNyP8U/CeArtWSRKk1gSKsiOFim3XUKvg2WJqgfQVeK6drVNpw3vK9Xv0Hc3gzAxblpyvU8UaEnjuv9a77bw/FB/Kcxip5+NUfKBKKpab4EnpU4Qq3dcAA2o9QjwFV04H9TKbs1Du+KkBHHd+6pf3YSR4TqaG+WZ4NjNI2VrozeZAxRShZQU58gGetu47jB4Ov14BAAD//w==
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The JSON patch object to apply partial updates to resources.
 */
@Model
public class Patch {

    // Required default constructor
    public Patch() {}

	/**
	* The JSON pointer to the target document location from which to move the value. Required for the `move` operation.
	*/
	@SerializedName("from")
	private String from;

	public String from() { return from; }
	
	public Patch from(String from) {
	    this.from = from;
	    return this;
	}

	/**
	* REQUIRED
	* The operation to complete.
	*/
	@SerializedName("op")
	private String op;

	public String op() { return op; }
	
	public Patch op(String op) {
	    this.op = op;
	    return this;
	}

	/**
	* The JSON pointer to the target document location at which to complete the operation.
	*/
	@SerializedName("path")
	private String path;

	public String path() { return path; }
	
	public Patch path(String path) {
	    this.path = path;
	    return this;
	}

	/**
	* The value to apply. The `remove` operation does not require a value.
	*/
	@SerializedName("value")
	private Object value;

	public Object value() { return value; }
	
	public Patch value(Object value) {
	    this.value = value;
	    return this;
	}
}
