
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
/*    */ @Table
/*    */ public class DoctorCharges {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private int organisationId;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String organisationName;
	private String charges;

	public void setOrganisationId(int organisationId) {
		this.organisationId = organisationId;
	}

	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}

	public void setCharges(String charges) {
		this.charges = charges;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof DoctorCharges))
			return false;
		DoctorCharges other = (DoctorCharges) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getOrganisationId() != other.getOrganisationId())
			return false;
		Object this$organisationName = getOrganisationName(), other$organisationName = other.getOrganisationName();
		if ((this$organisationName == null) ? (other$organisationName != null)
				: !this$organisationName.equals(other$organisationName))
			return false;
		Object this$charges = getCharges(), other$charges = other.getCharges();
		return !((this$charges == null) ? (other$charges != null) : !this$charges.equals(other$charges));
	}

	protected boolean canEqual(Object other) {
		return other instanceof DoctorCharges;
	}


	public String toString() {
		return "DoctorCharges(id=" + getId() + ", organisationId=" + getOrganisationId() + ", organisationName="
				+ getOrganisationName() + ", charges=" + getCharges() + ")";
	}

	public DoctorCharges(int id, int organisationId, String organisationName, String charges) {
		/* 15 */ this.id = id;
		this.organisationId = organisationId;
		this.organisationName = organisationName;
		this.charges = charges;
		/*    */ }

	/*    */
	/*    */ public DoctorCharges() {
	}

	/*    */
	/*    */ public int getId() {
		/* 21 */ return this.id;
		/* 22 */ }

	public int getOrganisationId() {
		return this.organisationId;
	}

	/* 23 */ public String getOrganisationName() {
		return this.organisationName;
	}

	public String getCharges() {
		/* 24 */ return this.charges;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * DoctorCharges.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */