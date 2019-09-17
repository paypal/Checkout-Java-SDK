// This class was generated on Wed, 11 Sep 2019 17:50:29 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// LinkDescription.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/6yUT0/cSBDF7/spSmYPjOQ/HJZddm5IJAIFBTSYXEZIrrHL49a0u01VORMr4rtHbcMQGEUkSo5drlK9X70nf43yoaNoHl0at4EzkpJNp8a7KI4+IRtcWfqIbeiI4ugDDc+P75vnUd4QMN33JJowWVSqYHl+mr+7Or0Ba9zm7jCrfCkZdiZjqonJlRReCZN03glJdtCgkkdJwoDMwLjac4thRRrF0SkzDpPeozhaEFZXzg7RvEYrFAr3vWGqdoVr9h2xGpJovtyRirJx632+hql+wfhY2OcsfdtZUgJFXpPC7eIyhdxDixsCHQ8xHaBEa+PQvjJu+tKSNr6CrdEGtDECy9vFBeTUdmEimXCVqrvDRrWTeZap91ZSQ1qnntdZo63NuC7/Pf7vaDYeNoX3nqFjSjr2JYkYt47BuNL21bS0+LuIoTgsYkBXQTEroGyQsVRiSSEQFYG1ACNj/4YGeLIusHpHTkEb1HGhAO5OMDFOPAjSryRkwOlY/iXPlPtXlrne2of4Td+mk75wblfa9+48z6+fXODH5aA/8O53Q/eTBEz2hfzpva99Ga4/CTTegQ4dvZmT4/9PTg6EyjCR/DOLYduYsgEh/kwCKIAOLs6g9gw4ujv53DtsV2bd+17sANUoZUVTPIRadGpKAV+PhSmFN0SwHH8ji0eF8qxuu92mBh2O2lDErF1LTiULs8kT0utn+iVgzP5Eju4e/voGAAD//w==
// DO NOT EDIT
package com.paypal.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The request-related [HATEOAS link](/docs/api/reference/api-responses/#hateoas-links) information.
 */
@Model
public class LinkDescription {

    // Required default constructor
    public LinkDescription() {}

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
}
