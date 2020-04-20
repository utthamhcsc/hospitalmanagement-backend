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
/*    */ @Table(name = "leave_types")
/*    */ public class LeaveLypes {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String type;
	private String isActive;

	public void setType(String type) {
		this.type = type;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof LeaveLypes))
			return false;
		LeaveLypes other = (LeaveLypes) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$type = getType(), other$type = other.getType();
		if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type))
			return false;
		Object this$isActive = getIsActive(), other$isActive = other.getIsActive();
		return !((this$isActive == null) ? (other$isActive != null) : !this$isActive.equals(other$isActive));
	}

	protected boolean canEqual(Object other) {
		return other instanceof LeaveLypes;
	}


	public String toString() {
		return "LeaveLypes(id=" + getId() + ", type=" + getType() + ", isActive=" + getIsActive() + ")";
	}

	public LeaveLypes(int id, String type, String isActive) {
		/* 15 */ this.id = id;
		this.type = type;
		this.isActive = isActive;
		/*    */ }

	/*    */
	/*    */ public LeaveLypes() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 22 */ return this.id;
		/* 23 */ }

	public String getType() {
		return this.type;
	}

	public String getIsActive() {
		/* 24 */ return this.isActive;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\LeaveLypes
 * .class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */