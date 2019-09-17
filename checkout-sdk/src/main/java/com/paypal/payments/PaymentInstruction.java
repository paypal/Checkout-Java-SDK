// This class was generated on Wed, 11 Sep 2019 17:50:29 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// PaymentInstruction.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/7RW224kNRO+/5+i1Fc/0mQmZDeLlCvCBsSCyEYQkFCIZqvt6mkrbru3yp7ZBvHuyO7uTM8hiIWscpFxHboO31dl/1Hcdi0VF0WLXUMuLI2TwFEF410xK35BNlhausbmaaPvqRv0xay4IlFs2qy6KC5dB6i1SUe0MPjDxF+g8gw32N2gHX5ycMSgogTfEMscvnYpB4GKMESm3qXt7QTQaWiQHyi0FhXJDCSqGlBAk8WONGgjZWShHDuZK28t5fDgK0BoLYbKcwMV0Rwu29YaEtCRjVuBZ53SYcLskGIrbFMieixIwPNoPujyh2OoPZvfJ4bzYlZcMmPXt/10VvxIqN862xUXFVqhJHgfDZN+FNywb4mDISku7h4Bk5DCHWI0LXbZeE07CB3T7kJ2WxNU0WmBUGMAZIKarAbvoKQabZUqCzVBQ6xqdOG/luSitX/OtkQcsFhWREcYONHKTmX7mn0iAqYcU/JrZONjolMii/JNY0QSFWcQTCuzDKZ3Ge59wF79e8B+8I66w4qw8dGFnVIeRYfIqMhMTnWZxr1dZiRCZRw6ZdBCYHSCmd7bWUAo0aJTBHl2+jnUkT49IceUl2qfjPuaw3LvQs1EJ6pGRhWI4c1Pb09enn3+xbYRyff+/wvtlSyMC7TiDNxCGyYVFkwSFqPxSTKWxWc9tY0mF0yVRj1MWvtRHQkc/57OT3VljTbudmOUHHYha2awqY2qoTGrOkBJF7/F09MXKtr8n/qTNf3p0kHuBXG/r/rSUqXWPBC8++7m13fb+XY+QOhao9DaDiruuYN23n90MX51LwZoUqZJa3vwOB7r9vpqEktiqc3aaNIpQw+h9lHQ6VDL8XCLscJvPGeceGg+uNiUxGmix0T6C2AYiB2GzECI4O71KHudiPCxtHkOZtxPVx12RMsShY5etVvdZMsl8VGSaApobF/8dD3DpvbApMisB6L32z0tkCrayljbi/M9N4fbqa8RQCseHpzfuLRGkmHO4dPvDWrQ2J3is2SJWjOJHG1CQpL7zY02X7zZBwafgWGl9erhffSBpkSTwN6tesm1D+OALaZy+LmF4OHVS3hcSZJpjdb6DWkoqfLp6DScnZ8/ZYVV2mWpl32MxK8+wJdD0K0ExKzcHL71G1oTz7LXihxxHlZUitpA6QX0wTSxAUtuFep+BNxu9QnNs/Np6j3aLYbUNVgTj9swDauD6HKT9D/NEuiDkfA4x/ttft53wlO0Gbm7NHqHPLvyQ+oMT9BEboY3V+O6TRMADcoD6dQgGd6MYeuBSuVreFhHiYIurbcEQRSCjQk1hNqwzm9WQ0Pb9/0EmHKE0nZATnGXgc0XPbTsWzYUkLv8fknD6Sv4CoVenCXfKKQTNcklUIZFKdE+z/PsPv/97y8AAAD//w==
// DO NOT EDIT
package com.paypal.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Any additional payment instructions for PayPal for Partner customers. Enables features for partners and marketplaces, such as delayed disbursement and collection of a platform fee. Applies during order creation for captured payments or during capture of authorized payments.
 */
@Model
public class PaymentInstruction {

    // Required default constructor
    public PaymentInstruction() {}

	/**
	* The funds that are held on behalf of the merchant.
	*/
	@SerializedName("disbursement_mode")
	private String disbursementMode;

	public String disbursementMode() { return disbursementMode; }
	
	public PaymentInstruction disbursementMode(String disbursementMode) {
	    this.disbursementMode = disbursementMode;
	    return this;
	}

	/**
	* An array of various fees, commissions, tips, or donations.
	*/
	@SerializedName(value = "platform_fees", listClass = PlatformFee.class)
	private List<PlatformFee> platformFees;

	public List<PlatformFee> platformFees() { return platformFees; }
	
	public PaymentInstruction platformFees(List<PlatformFee> platformFees) {
	    this.platformFees = platformFees;
	    return this;
	}
}
