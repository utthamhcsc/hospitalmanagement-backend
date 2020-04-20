
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
/*    */ @Table(name = "visitors_purpose")
/*    */ public class VisitorsPurpose {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String visitorsPurpose;
	private String description;

	public void setVisitorsPurpose(String visitorsPurpose) {
		this.visitorsPurpose = visitorsPurpose;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof VisitorsPurpose))
			return false;
		VisitorsPurpose other = (VisitorsPurpose) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$visitorsPurpose = getVisitorsPurpose(), other$visitorsPurpose = other.getVisitorsPurpose();
		if ((this$visitorsPurpose == null) ? (other$visitorsPurpose != null)
				: !this$visitorsPurpose.equals(other$visitorsPurpose))
			return false;
		Object this$description = getDescription(), other$description = other.getDescription();
		return !((this$description == null) ? (other$description != null)
				: !this$description.equals(other$description));
	}

	protected boolean canEqual(Object other) {
		return other instanceof VisitorsPurpose;
	}


	public String toString() {
		return "VisitorsPurpose(id=" + getId() + ", visitorsPurpose=" + getVisitorsPurpose() + ", description="
				+ getDescription() + ")";
	}

	public VisitorsPurpose(int id, String visitorsPurpose, String description) {
		/* 15 */ this.id = id;
		this.visitorsPurpose = visitorsPurpose;
		this.description = description;
		/*    */ }

	/*    */
	/*    */ public VisitorsPurpose() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 22 */ return this.id;
		/* 23 */ }

	public String getVisitorsPurpose() {
		return this.visitorsPurpose;
	}

	public String getDescription() {
		/* 24 */ return this.description;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * VisitorsPurpose.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */