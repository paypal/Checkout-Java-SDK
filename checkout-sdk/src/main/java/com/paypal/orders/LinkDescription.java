// This class was generated on Tue, 04 Dec 2018 17:38:27 PST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// LinkDescription.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data H4sIAAAAAAAC/+xX32/bNhB+319xUAcsBmQ7KNqs81u2pqixZi4cdy9GAZ+ls8WFIlXyFEcY9r8PlOQfsqKkaxVjD3rwg45H8/vujsf7/vZmWULeyPsg1C28JRsYkbDQyvO9P9EIXEr6A2Pn4fne75TtPw6dR94sIjD0JSXLfUMSmUKYv7+cXU0ub0AKdfv5bBjqwA4xEUN9R+ZO0Gb4IkImjbbvPGwPhFppE6P7z4Hne5fGYFYAPPe9KWE4UTLzRiuUlpzhSyoMhTvDR6MTMizIeqP5jpplI9S6TohUkHsc8trb6vRiCgUCZwmBULCJRBABa7DpMhYMvA8AhMj4vfhVKuU//pMkIkOrCoPSUIcf6DiRxASMZk0Mn6YfBjDTEOMtleiLtAUope/cl0IVKzFxpEPYCI6AI2Fh/mk6hhnFidvRL3LGFH4+i5gTOxoOWWtpB4J4NdBmPYw4lkOzCi5e/3zey8thAO+0gcRQPzE6IGuFWvsgVCDTsDh08ePCh8XZwgdUISx6CwgiNBgwGTsAx2jhuC5A2Nz/ljLYFpzjqhUplxbk/EALuAtBwbHggy6B1iVOcW7+T4ljk35b3vJiqpXfofWxAvQBLYS0EopCWGYwn777DV6ev7rYZ2Cz2ezjb1aB+zmPAd9zb1Be9SUVsXMBKuviRHVblNQR+dJUZ/5+Nvu4rUJTnu7u3oO1eyIGhmQFfvFdxz7Pg5sDFFrl6Xvynrz+5c2bF5YCt6P/queX3caSuSPrco8Kxm9hpQ1gmTxX56nCeCnWqU6tzCCspNhSjIpFYEGvdjkfwA0RzPPmPy0R2qMaQoU5NrRWrFVMiu3Q7e1vKR1/Du4djV679yiHeBNEFGM9FXZr32djZ2p8pvIuDdq0Wfz7R0cv/6KA61AxDIXDgnLMFNsK5vpaFfylymDvA8I5tVzsl1LCZAXu/AewSzmpPjZbyzFOQAfJVZpNl/0iF2XTzqMep5bhDqUIkQlwjUJZBteTD/2r1C6+l5rKHqGmsmNqpaUdalqRK7VYG3pGik1Fl78UedlUC65qrzJtt66akSWkQlKB21SFVll4TmxNDX5lcO3a3ZSslmk5FO8RPrhc7zZbNzA7v8FpYitqDUY0tJW8lbSMyjXsOqZ8Eqtg2lqa71nu0fJNuXajVMNUVp/InpIDbkANtGK65z6pQIdCrSG/4vT8MmYpFJrsqjy2Ar629JAqUEyqDrsYDK5TySJJTaItwVgxGUUM1ygkXN0zKetaB5xdj6+vevARDcNE0ciN9jGyy91+D1mLa4JfdSjIPjkAvTx/9bp3okGOj6dwfnoA/+b4zDZ6BHn1gYP1VZG4aCcSn7+iZyjNlVAU38/ZfSeKmp9lrejoWd5a2nuW9/4t95imekuQoxtGU430ofWo8jRgksiskN4FVCd+3BDvWKAKyP4En6Zj64N1f5Evue8DyX6HMqUTvTwJsrsKBzuPmNZW63et9IJk53Yq8A2om+G2fTkf1TqFULmpK56jhU73dLqn0z2d7ul0T6d7Ot3T6Z5O93S6p9M9ne75H+uexkYlWB51qtJSD18hatxyS73jh38BAAD//w==
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The request-related [HATEOAS link](/docs/api/overview/#hateoas-links) information.
 */
@Model
public class LinkDescription {

    // Required default constructor
    public LinkDescription() {}

	/**
	* The media type in which to submit the request data.
	*/
	@SerializedName("encType")
	private String encType;

	public String encType() { return encType; }
	
	public LinkDescription encType(String encType) {
	    this.encType = encType;
	    return this;
	}

	/**
	* REQUIRED
	* The complete target URL. To make the related call, combine the method with this [URI Template-formatted](https://tools.ietf.org/html/rfc6570) link. For pre-processing, include the `$`, `(`, and `)` characters. The `href` is the key HATEOAS component that links a completed call with a subsequent call.
	*/
	@SerializedName("href")
	private String href;

	public String href() { return href; }
	
	public LinkDescription href(String href) {
	    this.href = href;
	    return this;
	}

	/**
	* The media type, as defined by [RFC 2046](https://www.ietf.org/rfc/rfc2046.txt). Describes the link target.
	*/
	@SerializedName("mediaType")
	private String mediaType;

	public String mediaType() { return mediaType; }
	
	public LinkDescription mediaType(String mediaType) {
	    this.mediaType = mediaType;
	    return this;
	}

	/**
	* The HTTP method required to make the related call.
	*/
	@SerializedName("method")
	private String method;

	public String method() { return method; }
	
	public LinkDescription method(String method) {
	    this.method = method;
	    return this;
	}

	/**
	* REQUIRED
	* The [link relation type](https://tools.ietf.org/html/rfc5988#section-4), which serves as an ID for a link that unambiguously describes the semantics of the link. See [Link Relations](https://www.iana.org/assignments/link-relations/link-relations.xhtml).
	*/
	@SerializedName("rel")
	private String rel;

	public String rel() { return rel; }
	
	public LinkDescription rel(String rel) {
	    this.rel = rel;
	    return this;
	}

	/**
	* The request data or link target.
	*/
	@SerializedName("schema")
	private LinkSchema schema;

	public LinkSchema schema() { return schema; }
	
	public LinkDescription schema(LinkSchema schema) {
	    this.schema = schema;
	    return this;
	}

	/**
	* The request data or link target.
	*/
	@SerializedName("targetSchema")
	private LinkSchema targetSchema;

	public LinkSchema targetSchema() { return targetSchema; }
	
	public LinkDescription targetSchema(LinkSchema targetSchema) {
	    this.targetSchema = targetSchema;
	    return this;
	}

	/**
	* The link title.
	*/
	@SerializedName("title")
	private String title;

	public String title() { return title; }
	
	public LinkDescription title(String title) {
	    this.title = title;
	    return this;
	}
}
