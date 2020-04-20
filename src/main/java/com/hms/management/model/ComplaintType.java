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
/*    */ @Table(name = "complaint_type")
/*    */ public class ComplaintType {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String complainType;
	private String description;

	public void setComplainType(String complainType) {
		this.complainType = complainType;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof ComplaintType))
			return false;
		ComplaintType other = (ComplaintType) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$complainType = getComplainType(), other$complainType = other.getComplainType();
		if ((this$complainType == null) ? (other$complainType != null) : !this$complainType.equals(other$complainType))
			return false;
		Object this$description = getDescription(), other$description = other.getDescription();
		return !((this$description == null) ? (other$description != null)
				: !this$description.equals(other$description));
	}

	protected boolean canEqual(Object other) {
		return other instanceof ComplaintType;
	}


	public String toString() {
		return "ComplaintType(id=" + getId() + ", complainType=" + getComplainType() + ", description="
				+ getDescription() + ")";
	}

	public ComplaintType(int id, String complainType, String description) {
		/* 15 */ this.id = id;
		this.complainType = complainType;
		this.description = description;
		/*    */ }

	/*    */
	/*    */ public ComplaintType() {
	}

	/*    */
	/*    */ public int getId() {
		/* 21 */ return this.id;
		/* 22 */ }

	public String getComplainType() {
		return this.complainType;
	}

	public String getDescription() {
		/* 23 */ return this.description;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * ComplaintType.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */