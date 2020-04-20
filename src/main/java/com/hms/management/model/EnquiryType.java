

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
/*    */ @Table(name = "enquiry_type")
/*    */ public class EnquiryType {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String enquiryType;
	private String description;

	public void setEnquiryType(String enquiryType) {
		this.enquiryType = enquiryType;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof EnquiryType))
			return false;
		EnquiryType other = (EnquiryType) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$enquiryType = getEnquiryType(), other$enquiryType = other.getEnquiryType();
		if ((this$enquiryType == null) ? (other$enquiryType != null) : !this$enquiryType.equals(other$enquiryType))
			return false;
		Object this$description = getDescription(), other$description = other.getDescription();
		return !((this$description == null) ? (other$description != null)
				: !this$description.equals(other$description));
	}

	protected boolean canEqual(Object other) {
		return other instanceof EnquiryType;
	}

	

	public String toString() {
		return "EnquiryType(id=" + getId() + ", enquiryType=" + getEnquiryType() + ", description=" + getDescription()
				+ ")";
	}

	public EnquiryType(int id, String enquiryType, String description) {
		/* 15 */ this.id = id;
		this.enquiryType = enquiryType;
		this.description = description;
		/*    */ }

	/*    */
	/*    */
	/*    */ public EnquiryType() {
	}

	/*    */
	/*    */
	/*    */ public int getId() {
		/* 23 */ return this.id;
		/* 24 */ }

	public String getEnquiryType() {
		return this.enquiryType;
	}

	public String getDescription() {
		/* 25 */ return this.description;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * EnquiryType.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */