// This class was generated on Fri, 15 Feb 2019 14:59:09 PST by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// Patch.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/8xTwYoUQQy9+xWhzk33iCDY4EHwpLA76ODF8ZCtTk+VVHfKVHqlkf13qa7ZGYYWFkaFPdZLJXnvJflldnMk05otqnWmMl9QPN4FusEhw6YyH2k+P95TsuKjeh5Na3aO4MPn2xuIORv47jtZBWXAGMMMEUU9Bphih0opB4QST2Ip1aYy70RwLv03lflE2N2OYTZtjyFRBn5MXqg7AVvhSKKekmm/npgnFT8e1tR74eGC/hFYS9hPm80ri+CE+rd741RjaptGmUOqPWlfsxwap0NopLev32xe7s2SQ4v4LftRSUqVBkski1VHoCgHUujYTgONCoEt5taQ2cBP563LXwe+p+X/PYaJanjUDj3Lgpfqljsq9XPCseMZhOzPUv5v7R2nEB6qJz3meOHw8lz7ex0rlek6UhHVXdA6As9k8KjnsVseYiAto/9fwytnufZpWbULox6RtVNL5HTZNez+sJLy1FJCx5RgZAUp9AGP+/4vBH97ePEbAAD//w==
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
	* The <a href="https://tools.ietf.org/html/rfc6901">JSON Pointer</a> to the target document location from which to move the value. Required for the <code>move</code> operation.
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
	* The operation.
	*/
	@SerializedName("op")
	private String op;

	public String op() { return op; }
	
	public Patch op(String op) {
	    this.op = op;
	    return this;
	}

	/**
	* The <a href="https://tools.ietf.org/html/rfc6901">JSON Pointer</a> to the target document location at which to complete the operation.
	*/
	@SerializedName("path")
	private String path;

	public String path() { return path; }
	
	public Patch path(String path) {
	    this.path = path;
	    return this;
	}

	/**
	* The value to apply. The <code>remove</code> operation does not require a value.
	*/
	@SerializedName("value")
	private Object value;

	public Object value() { return value; }
	
	public Patch value(Object value) {
	    this.value = value;
	    return this;
	}
}
