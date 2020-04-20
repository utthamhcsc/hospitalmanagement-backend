
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
/*    */ @Table(name = "lab")
/*    */ public class Lab {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String labName;

	public void setLabName(String labName) {
		this.labName = labName;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Lab))
			return false;
		Lab other = (Lab) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$labName = getLabName(), other$labName = other.getLabName();
		return !((this$labName == null) ? (other$labName != null) : !this$labName.equals(other$labName));
	}

	protected boolean canEqual(Object other) {
		return other instanceof Lab;
	}

	public String toString() {
		return "Lab(id=" + getId() + ", labName=" + getLabName() + ")";
	}

	public Lab(int id, String labName) {
		/* 15 */ this.id = id;
		this.labName = labName;
		/*    */ }

	/*    */
	/*    */ public Lab() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 22 */ return this.id;
	}

	public String getLabName() {
		/* 23 */ return this.labName;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\Lab.class
 * Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */