// This class was generated on Tue, 04 Dec 2018 17:38:27 PST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// LinkSchema.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data H4sIAAAAAAAC/7yVTU/bTBDH78+nGO3lASkkqGo55EZVKkVtGgS0F8RhYo/jbdezZncMWFW/e7XOGxtjhIrJ0f+Z9f5mdl5+q6u6JDVWXzX/gsskpwLVQP1Ap3Fu6BsWwagG6gvV249P5BOnS9GW1Vhd5QSObivyAikKgnVgwu8E3YJkqAbq1DmslzcdD9QFYTpjU6txhsZTEG4r7SjdCOfOluREk1fj6w2jnf+kRNp4mKY6sKCZCBU+om3bYvhTrmHrAzo4vZaYK2P+DDbYp8bALINw/xPsxsyymHil7HICBiSwGfhqfuSbp/JDCNlvsl5UXuAOjU5RCHCBmr0AGhP5x6GdvDY0rp8Jjevd0FZKP6FZplBqhXX0hiF2FV1KmeambOKCi/U40n7rqpusJE6Jk3AoRosMb8nmxWletNkyh4uCWC7IW1M1Vz8mfNLcnjZrN3Abv+F+cqtbA0Z3jJVmlPRMFYZ0mynM2phprXT3WePRc6dMKdVPLI9iJW/x1kr7YRsLSF0SIKeQWBZ6kCPixKaaF9C0OPW3UbrKdK4ZXX22ujaCb5naUTTY3MaGSyK4nlZGdFm50nqCCQs5JoEpagNnD0Lsw+iAg+lkenYI5+gEZkxj+GxdgRLebnuGvMcFwUebavI3B7lI6cejkVhr/FCTZEPrFqNcCjNyWfLu+P2Hw+F++jw8YZS2lfDck/9zfq7u7Ria6oOA9aJMnPSTiZsXzAy2EqVi+f2W03fG1L2WLdPOWl4r/a3lrX/PM6ar3kqU/FLQxZl+rO5UngUsS1OD5Nov+xNBLEhOEKJATsj/D98vJn4APvyiMYVvuNeSL8/doaloT5unRAmt8OjkTqQta7vXVl5Qbtz2Bd9B3Y3bT3P+9xcAAP//
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The request data or link target.
 */
@Model
public class LinkSchema {

    // Required default constructor
    public LinkSchema() {}

	/**
	* Any additional items.
	*/
	@SerializedName("additionalItems")
	private Object additionalItems;

	public Object additionalItems() { return additionalItems; }
	
	public LinkSchema additionalItems(Object additionalItems) {
	    this.additionalItems = additionalItems;
	    return this;
	}

//	/**
//	* An array of sub-schemas. The data must validate against all sub-schemas.
//	*/
//	@SerializedName(value = "allOf", listClass = AllOfItem.class)
//	private List<AllOfItem> allOf;
//
//	public List<AllOfItem> allOf() { return allOf; }
//	
//	public LinkSchema allOf(List<AllOfItem> allOf) {
//	    this.allOf = allOf;
//	    return this;
//	}
//
//	/**
//	* An array of sub-schemas. The data must validate against one or more sub-schemas.
//	*/
//	@SerializedName(value = "anyOf", listClass = AnyOfItem.class)
//	private List<AnyOfItem> anyOf;
//
//	public List<AnyOfItem> anyOf() { return anyOf; }
//	
//	public LinkSchema anyOf(List<AnyOfItem> anyOf) {
//	    this.anyOf = anyOf;
//	    return this;
//	}

	/**
	*/
	@SerializedName("definitions")
	private Object definitions;

	public Object definitions() { return definitions; }
	
	public LinkSchema definitions(Object definitions) {
	    this.definitions = definitions;
	    return this;
	}

	/**
	*/
	@SerializedName("dependencies")
	private Object dependencies;

	public Object dependencies() { return dependencies; }
	
	public LinkSchema dependencies(Object dependencies) {
	    this.dependencies = dependencies;
	    return this;
	}

	/**
	* The fragment resolution.
	*/
	@SerializedName("fragmentResolution")
	private String fragmentResolution;

	public String fragmentResolution() { return fragmentResolution; }
	
	public LinkSchema fragmentResolution(String fragmentResolution) {
	    this.fragmentResolution = fragmentResolution;
	    return this;
	}

	/**
	* An item.
	*/
	@SerializedName("items")
	private Object items;

	public Object items() { return items; }
	
	public LinkSchema items(Object items) {
	    this.items = items;
	    return this;
	}

	/**
	* An array of links.
	*/
//	@SerializedName(value = "links", listClass = Link.class)
//	private List<Link> links;
//
//	public List<Link> links() { return links; }
//	
//	public LinkSchema links(List<Link> links) {
//	    this.links = links;
//	    return this;
//	}

	/**
	* The media type and context-encoding scheme.
	*/
	@SerializedName("media")
	private Media media;

	public Media media() { return media; }
	
	public LinkSchema media(Media media) {
	    this.media = media;
	    return this;
	}

	/**
	*/
	@SerializedName("not")
	private Object not;

	public Object not() { return not; }
	
	public LinkSchema not(Object not) {
	    this.not = not;
	    return this;
	}

	/**
	* An array of sub-schemas. The data must validate against one sub-schema.
	*/
//	@SerializedName(value = "oneOf", listClass = OneOfItem.class)
//	private List<OneOfItem> oneOf;
//
//	public List<OneOfItem> oneOf() { return oneOf; }
//	
//	public LinkSchema oneOf(List<OneOfItem> oneOf) {
//	    this.oneOf = oneOf;
//	    return this;
//	}

	/**
	* To apply this schema to the instances' URIs, start the URIs with this value.
	*/
	@SerializedName("pathStart")
	private String pathStart;

	public String pathStart() { return pathStart; }
	
	public LinkSchema pathStart(String pathStart) {
	    this.pathStart = pathStart;
	    return this;
	}

	/**
	* The pattern properties.
	*/
	@SerializedName("patternProperties")
	private Object patternProperties;

	public Object patternProperties() { return patternProperties; }
	
	public LinkSchema patternProperties(Object patternProperties) {
	    this.patternProperties = patternProperties;
	    return this;
	}

	/**
	*/
	@SerializedName("properties")
	private Object properties;

	public Object properties() { return properties; }
	
	public LinkSchema properties(Object properties) {
	    this.properties = properties;
	    return this;
	}
}
