// This class was generated on Tue, 04 Dec 2018 17:38:27 PST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// Name.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data H4sIAAAAAAAC/8RUTY/TMBC98ytGvuzFqjj3Vm17QoLVqsABoZXbTJrROuPgmbBEaP87SpwmzaZ8qKBya549z+89v/q72TYVmqV560o01nxwkdzOY/e5NMaaN9iMH2uUfaRKKbBZmm2BwK5ECDlogVC5qM3CWLOK0TWJ+LU19+iyd+wbs8ydF2yBLzVFzAbgLoYKoxKKWX4aJIlG4sNclPOKkZ3iQ157/8BJ+ajz/PpU+npzd7+5XW036wVsj9JvBIbZztgCbh3DDsHBrhZiFOlwC0z7x/QrRHDcQNACY0pDC6ewd8xB21mpPCkQa4CcoqgF70R7/mMU8FQgjyECycmZfxsp194/29/mej7Nn2f48YzkCqMEtiN8I9AyJLvX8XGgr8hzIxP4MicdRXfl/U1e0VVJWeZxbmuKX+YrcfSVfC8IzksADSAaIkJZe6XK4+k+AeK9rzPiQ0+lMXBT0j7l49r/w43YCfd1kqoi5vRtEtIAzR+wtNSJVlKPtvV9Gs4VlUudv1Q+QHPlaQnyVvn/0htnfRyxy7rYz6cSleSbvpartpKPHJ4YnHQTf/qMplN+Wez+0JelLqelLsOx1P3+fxLz5+dXPwAAAP//
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The name of the party.
 */
@Model
public class Name {

    // Required default constructor
    public Name() {}

	/**
	* DEPRECATED. The party's alternate name. Can be a business name, nickname, or any other name that cannot be split into first, last name. Required when the party is a business.
	*/
	@SerializedName("alternate_full_name")
	private String alternateFullName;

	public String alternateFullName() { return alternateFullName; }
	
	public Name alternateFullName(String alternateFullName) {
	    this.alternateFullName = alternateFullName;
	    return this;
	}

	/**
	* When the party is a person, the party's full name.
	*/
	@SerializedName("full_name")
	private String fullName;

	public String fullName() { return fullName; }
	
	public Name fullName(String fullName) {
	    this.fullName = fullName;
	    return this;
	}

	/**
	* When the party is a person, the party's given, or first, name.
	*/
	@SerializedName("given_name")
	private String givenName;

	public String givenName() { return givenName; }
	
	public Name givenName(String givenName) {
	    this.givenName = givenName;
	    return this;
	}

	/**
	* When the party is a person, the party's middle name. Use also to store multiple middle names including the patronymic, or father's, middle name.
	*/
	@SerializedName("middle_name")
	private String middleName;

	public String middleName() { return middleName; }
	
	public Name middleName(String middleName) {
	    this.middleName = middleName;
	    return this;
	}

	/**
	* The prefix, or title, to the party's name.
	*/
	@SerializedName("prefix")
	private String prefix;

	public String prefix() { return prefix; }
	
	public Name prefix(String prefix) {
	    this.prefix = prefix;
	    return this;
	}

	/**
	* The suffix for the party's name.
	*/
	@SerializedName("suffix")
	private String suffix;

	public String suffix() { return suffix; }
	
	public Name suffix(String suffix) {
	    this.suffix = suffix;
	    return this;
	}

	/**
	* When the party is a person, the party's surname or family name. Also known as the last name. Required when the party is a person. Use also to store multiple surnames including the matronymic, or mother's, surname.
	*/
	@SerializedName("surname")
	private String surname;

	public String surname() { return surname; }
	
	public Name surname(String surname) {
	    this.surname = surname;
	    return this;
	}
}
