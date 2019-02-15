// This class was generated on Fri, 15 Feb 2019 14:59:09 PST by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// Refund.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/+xcX3MbtxF/76fYYToTa4YiHdtSEj1VjuRGbWRrJLkzHdVDgoclDxUOuAA4Umwn372zwB15fy0lptnGvQePh7vA3f7DD7u4Ff49uF2nODgZXOM8U3wwHPyNGcFmEt+yhOiD4eCvuN7+OEMbGZE6odXgZHAbIxg/E4Saa5MwYowGw8GpMWwdnv18OLhGxt8puR6czJm0SISfM2GQbwhXRqdonEA7OLnbSHWpFa6bQrFEZ8pVRNuQmgJGmTGoojUwxSGMg7k2wGAuFFORYBKcYcqyiGYNwWZRDMwCgxmTTEUI2kDK1gkqBzzD3elnnRFq0VSwEHkSaY4VPeucprp3LjaIh1HMDIscGri4eXf46sU3324NQXM/PBtzHdmxUA4XxvttzIXByI0NWjcuBh/SYDs+ABczB4KjcmIu0IIrmfZXWcSZrGYQlUn5y/BRqyyZzKrWKChNK3jOEFaxiGJIxCJ2MMOTf2TPn7+MMun/x/BLivDrVIG3BRofHblqpKkU9wjTv1z9fRqMwAyC0g7cOhURk3INcxNih8lReOi4eGrtHcAxEgmTmxnt77p9e1Z6l81mXCwFR1plToOLdWaZ4i627a8bFxq+0cb7yeTGB5UlMzSg5xtBUskitPmCqETIECwi3P1Q0H6gQPi1YbOLyPjwhNiIDDKHEyeS2nqp0JtxwplDDww0YghCwd2FcmgUuioPArx9eBY7l9qT8dhpLe1IoJuPtFmMY5fIsZlHL1++/P4ri965h0ej44MR3GCkFbfelxtPrGIhsRQ4YEujdFqJppnU0f3PmXZY9rJ1RqtFoLzVrojucZkOAaEXmWQG8CE1aC1FXWo0BZSFRSa4h7hZ5oBrtD6yDf4TIwdMShBqyaTg3hibcKsL9ImA+MT1L3jFtf5n06NXbH3F5OECFRrmkMPFmY9ut9mrRnsSVy21iHBSF7tMbop/enUBBCpoDnMnccAHikjmnUFzi2Uc1BIWtOFoRnCapsiMpSieaRd7lVO2RvO1Le9wEAvrtAkbIo3BhAlpA+Bs5oDBCMUS7Y7N9ZNQ91DWu2E4KdS9rdisoFTNdaqAkVwEZwald/bdj6e35+9Ob8BPKdCKpWKsl2iWAlfjr2LmUDN76IfUEep497s5qmjiaEhZJVTRbaA1YyBBLhhtL0iuDHuY07QPJMJtAB2thyi2p3CODc4rGuSEloRLJ6lEh+CYWaCD99c/jeBWQ8LuMZc+OIvifEjDZ0IFToIu1hxWwkevsHD3/voCbjFJacZhwGCH/FEYPj769vmBD4IR0C6YGqT1FBH+qQUBfSQzHl46/eN0CNNn06FfENODKWySJzvyCDolXacgQtZzj2sowox01YoSQ796fEjRRpqbIOgY9GHkQEuOU86T9+Q4H03NAPTkJ4TgkFJhjnOhkMNsDXfXb36AF89fHW99sFqtth4w84j+0YiRe3AHo3yxz/KckUyUR8beDEBBVVM+JzU1//H29qqIw81u7Tqid08aGJQV8cPvltzfG9cLSDhP7nt0pRx9/913m4Tl1UGRM1s0S7S+DFLFFspy51GkZ4olM7HIdGblGnjFxRYTppyILCFz4XPKgxDuPPxf5xLaWgwxxbxszFqxUFRv2THNPSxUqv8cPZAaB59ji7qJYkxY0xe2oG/dsSG1VcdboKYycofRv9149IzStZY6mXMREsmJcJhU99Qt8yLn1XfXNWzHgH/Aju3MpJzouZetRXjPrIos5bv5R9MAm80Ogzdy5PZ2TzLrwKexPqNfMKFsyG7L4z8xD6jrptYf0c0zq7qp9Q5108ofWiQ6lI+fSceuuPO7hQ+cashV6VVNdxtZ3ZKlqHiotWuiVRifU7YukJ8btiDImxi0WmZ5brwVseBfl9lNxCmGwfYxo/0Yt4kxogNZPJrsWCpC1t3UEn7EjpfKJeVTHblZMy17rCqgPDXSyuGDO0QVaS7UAvwa38Ph5EwoZtaT4r0V6QPvfMtqqw6UQ9WUO6QHl5l0Is1Mqi3C5iTmkgkJ5w8OlSXwgGeXF5fnB3DFjIN3Ck8oxU+YI+dt56C1bIHwWnOB9tE06MXzV0cHe0rnGrm4ezwN/832uV3pE/DhByTWkyxxvBtLfHgCaChdPcgPvz/r3qCwe2cOzIpEWuGOd+bt+B2jTFfApczFE+uYqdqayDc5tRZ7GliaynUowoOs4I+eEUgNpiK0X8P76ws7BP9gz6LfpeLdH8LvafNJmaPFMEm3U2uqEvuqzG0ut3wUbB+yL+k7pO4Wd9fr86M1TyhYbpqVT43R1z99/dPXP33909c/ff3T1z99/dPXP33909c/ff3zO6h/OrFKOFkDq5zSNF8obog92pd4SjucOD3xLRt1IKlw2mozZvMOtFJzzO+ji+QSTRQz5eCKrckc8Nogu+d61dJPYlFKNGQIIk5mpZGlb3jdg5qW23CLD5y7aSx6tPF1YbS1k5b21xqjb4Ltm2D7Jtgvtgm2Ax0UujZsqJB7ZOiRoUeGLxYZ3qKD07CGNwkRXLRWeltY6MiIOgZ0l4HbrMiHl91kllSihyeN4BpdZpRvgEdVWSXVXAqEBS7mczQEK3Ojk9bBodsbWBR5pVcxGtxknwixltyvRWGAnmp31+3bAcKRVks0DnkbFLcwe0DuAbkH5C8WkM8fqExdIFwzhy1/GpCzJyawS38fUOM0Q6YYATQiWJ+jQ5MIlYd7Dh5OQw48AUe1KoGM08CUdjGa37Y6fhNeWJ2ZCCfFC6uFeIP3O8SMTzgb99/G203T5P1fmebX4Gn+pyfbvTRPP85/zsSSSQzLglZCpoQrsokQe1u98u8qDjntrwXcarNBIy9AOPGlZzkN3xwBFwvhbHFcbDyY5y/YoJgWyu38kLAjJSnOtFoSkgarT0f6dKRPR76wdORpGJEyOZkj1vFhS+6xoceGHhu+2FLlSjI31yaBN9hSqaQ5l7Cg9pG2xuk+ICpGhkVvnKKAQLT+b4AT4a8msEPizoy+R8MW6Pkf//v94/5+mR4EexDsQXAnn9aKvoLXzGJrmtTMkDqSI47ON0QU4JUUj17FetMW4Tn+ZNrDxzyTcyFlIOe3etyW5woLTFoN90qvFIHI5qx7D6ghBSpXv8+kTG3pKMpmUkTbdR2Cn6UphJt5/JUCZeuMgzJwoZzRPIvCH9/bLE21cZBZhIhZtPCMnoOjxQheGybUrUGEUtCEmjx8HTjIPwuETwK+TWXCODdorW8Sz988Ef6jA608tmRCkuZ7OtmoyFQ9BqxxmhYWvgmSBXgQ/0IeNIR8zqdfIfQ+JQ8cvyrdiuFhg0mpV+RAnGsTenJfHB11jWJz2ivI0+EdtH7DC/6Uv3RLASsWagQ/6hUu0Qz9rHCfD4EhiyJMKXIS9iCSLAGJauHiEFiqqj059MXRq8aFHkWj2xJNsdsQGCrIlDcSf6qUgA/Cuv/yxUilCK71UpfpXVcl5Y1aF2fFdkYYAwmz98jJQP7CqPbPbTncUwgq2j7IBbREixZIw32eJzA3e32eBYP+DTO5BlSRWXvH+kTKNyEagY6ZNSxJYeWP0QiYX76guZkN4OA7qYu7OWwmd3Ww9oSy2WnH5CSkpe2f/LpG9Hlkn0f2eeQXfNDW+e3LMZdVN/kNqRkfgVXAb8RSl5ldZyXh7le4Ca86C2lrl+ATvuHXFSixurPhapNHmPj5gSq0OtfuUMpJnY3Rq3hdljXOs+3p1fnbs4u3f54S3E7fnF78dH423ZEmT+77zlLeet9lld7fd/m/e9/lh1/+8B8AAAD//w==
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The refund information.
 */
@Model
public class Refund {

    // Required default constructor
    public Refund() {}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("amount")
	private Money amount;

	public Money amount() { return amount; }
	
	public Refund amount(Money amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote>
	*/
	@SerializedName("create_time")
	private String createTime;

	public String createTime() { return createTime; }
	
	public Refund createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The PayPal-generated ID for the refund.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Refund id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* The API caller-provided external invoice number for this order. Appears in both the payer's transaction history and the emails that the payer receives.
	*/
	@SerializedName("invoice_id")
	private String invoiceId;

	public String invoiceId() { return invoiceId; }
	
	public Refund invoiceId(String invoiceId) {
	    this.invoiceId = invoiceId;
	    return this;
	}

	/**
	* An array of related [HATEOAS links](/docs/api/overview/#hateoas-links).
	*/
	@SerializedName(value = "links", listClass = LinkDescription.class)
	private List<LinkDescription> links;

	public List<LinkDescription> links() { return links; }
	
	public Refund links(List<LinkDescription> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The reason for the refund. Appears in both the payer's transaction history and the emails that the payer receives.
	*/
	@SerializedName("note_to_payer")
	private String noteToPayer;

	public String noteToPayer() { return noteToPayer; }
	
	public Refund noteToPayer(String noteToPayer) {
	    this.noteToPayer = noteToPayer;
	    return this;
	}

	/**
	* The breakdown of the refund.
	*/
	@SerializedName("seller_payable_breakdown")
	private MerchantPayableBreakdown sellerPayableBreakdown;

	public MerchantPayableBreakdown sellerPayableBreakdown() { return sellerPayableBreakdown; }
	
	public Refund sellerPayableBreakdown(MerchantPayableBreakdown sellerPayableBreakdown) {
	    this.sellerPayableBreakdown = sellerPayableBreakdown;
	    return this;
	}

	/**
	* The status of the capture.
	*/
	@SerializedName("status")
	private String status;

	public String status() { return status; }
	
	public Refund status(String status) {
	    this.status = status;
	    return this;
	}

	/**
	* The details of the refund status.
	*/
	@SerializedName("status_details")
	private RefundStatusDetails statusDetails;

	public RefundStatusDetails statusDetails() { return statusDetails; }
	
	public Refund statusDetails(RefundStatusDetails statusDetails) {
	    this.statusDetails = statusDetails;
	    return this;
	}

	/**
	* The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote>
	*/
	@SerializedName("update_time")
	private String updateTime;

	public String updateTime() { return updateTime; }
	
	public Refund updateTime(String updateTime) {
	    this.updateTime = updateTime;
	    return this;
	}
}
