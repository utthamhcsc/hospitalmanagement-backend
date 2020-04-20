
/*    */
package com.hms.management.model;

/*    */
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "tpa_master")
/*    */ public class TpaMaster {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String organisation;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private int chargeId;
	private String organisationCharge;

	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}

	public void setChargeId(int chargeId) {
		this.chargeId = chargeId;
	}

	public void setOrganisationCharge(String organisationCharge) {
		this.organisationCharge = organisationCharge;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof TpaMaster))
			return false;
		TpaMaster other = (TpaMaster) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$organisation = getOrganisation(), other$organisation = other.getOrganisation();
		if ((this$organisation == null) ? (other$organisation != null) : !this$organisation.equals(other$organisation))
			return false;
		if (getChargeId() != other.getChargeId())
			return false;
		Object this$organisationCharge = getOrganisationCharge(),
				other$organisationCharge = other.getOrganisationCharge();
		return !((this$organisationCharge == null) ? (other$organisationCharge != null)
				: !this$organisationCharge.equals(other$organisationCharge));
	}

	protected boolean canEqual(Object other) {
		return other instanceof TpaMaster;
	}

	
	public String toString() {
		return "TpaMaster(id=" + getId() + ", organisation=" + getOrganisation() + ", chargeId=" + getChargeId()
				+ ", organisationCharge=" + getOrganisationCharge() + ")";
	}

	public TpaMaster(int id, String organisation, int chargeId, String organisationCharge) {
		/* 15 */ this.id = id;
		this.organisation = organisation;
		this.chargeId = chargeId;
		this.organisationCharge = organisationCharge;
		/*    */ }

	/*    */
	/*    */ public TpaMaster() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 22 */ return this.id;
		/* 23 */ }

	public String getOrganisation() {
		return this.organisation;
	}

	/* 24 */ public int getChargeId() {
		return this.chargeId;
	}

	public String getOrganisationCharge() {
		/* 25 */ return this.organisationCharge;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\TpaMaster.
 * class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */