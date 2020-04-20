/*    */
package com.hms.management.model;

import javax.persistence.Entity;
/*    */
/*    */ import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "purpose")
/*    */ public class Purpose {
	/*    */ @Id
	/*    */ @GeneratedValue
	/*    */ private int id;
	/*    */ private String purpose;

	/*    */
	/* 13 */ public Purpose(int id, String purpose, String description) {
		this.id = id;
		this.purpose = purpose;
		this.description = description;
	}

	private String description;

	public Purpose() {
	}

	public void setId(int id) {
		/* 14 */ this.id = id;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Purpose))
			return false;
		Purpose other = (Purpose) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$purpose = getPurpose(), other$purpose = other.getPurpose();
		if ((this$purpose == null) ? (other$purpose != null) : !this$purpose.equals(other$purpose))
			return false;
		Object this$description = getDescription(), other$description = other.getDescription();
		return !((this$description == null) ? (other$description != null)
				: !this$description.equals(other$description));
	}

	protected boolean canEqual(Object other) {
		return other instanceof Purpose;
	}


	public String toString() {
		return "Purpose(id=" + getId() + ", purpose=" + getPurpose() + ", description=" + getDescription() + ")";
	}

	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */ public int getId() {
		/* 21 */ return this.id;
		/* 22 */ }

	public String getPurpose() {
		return this.purpose;
	}

	public String getDescription() {
		/* 23 */ return this.description;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\Purpose.
 * class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */