// This class was generated on Tue, 04 Dec 2018 17:38:27 PST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// Media.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data H4sIAAAAAAAC/6ySwUrDQBCG7z7FsKcWYlNEPeSmWKFIbNHipfSwTSbJwmZ2nZ1gg/TdJbVUS0BFPe6/DPPt9++rWrQeVaJSzI1WkXrSbPTa4r2uu1hF6g7bj8MNhoyNF+NIJWpRIdTdIEjrETTlkDkS3MgpUuZyQyWErMIaRypSV8y6fV83jtQD6nxGtlVJoW3ALnhuDGN+CObsPLIYDCpZHkCDsKGyT7o2pLmd7Ncecfeu+q/YYVMfGx4RYZk2Voxv2LuAMCVBJhRItbEw2QhSMI4CDNJpOhnCXLPAjDCBW8e1FnDFpxkMQZcI1y43GFaDSsSHJI7FORtGBqUYOS7jSmobc5Gdjc8vhn91R4212+hbgV2FR9r2wVeV/9rP4sUlsPtz0GH9yMTl/5hYbU/eAAAA//8=
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
