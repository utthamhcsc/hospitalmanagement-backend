
/*    */
package com.hms.management.model;

/*    */
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
/*    */ import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "staff_designation")
/*    */ public class StaffDesignation {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String designation;
	private String isActive;

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof StaffDesignation))
			return false;
		StaffDesignation other = (StaffDesignation) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$designation = getDesignation(), other$designation = other.getDesignation();
		if ((this$designation == null) ? (other$designation != null) : !this$designation.equals(other$designation))
			return false;
		Object this$isActive = getIsActive(), other$isActive = other.getIsActive();
		return !((this$isActive == null) ? (other$isActive != null) : !this$isActive.equals(other$isActive));
	}

	protected boolean canEqual(Object other) {
		return other instanceof StaffDesignation;
	}


	public String toString() {
		return "StaffDesignation(id=" + getId() + ", designation=" + getDesignation() + ", isActive=" + getIsActive()
				+ ")";
	}

	public StaffDesignation(int id, String designation, String isActive) {
		/* 15 */ this.id = id;
		this.designation = designation;
		this.isActive = isActive;
		/*    */ }

	/*    */
	/*    */ public StaffDesignation() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 22 */ return this.id;
		/* 23 */ }

	public String getDesignation() {
		return this.designation;
	}

	public String getIsActive() {
		/* 24 */ return this.isActive;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * StaffDesignation.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */