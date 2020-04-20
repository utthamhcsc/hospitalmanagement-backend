

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
/*    */ @Table(name = "designation")
/*    */ public class Designation {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String name;
	private String isActive;

	public void setName(String name) {
		this.name = name;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Designation))
			return false;
		Designation other = (Designation) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$name = getName(), other$name = other.getName();
		if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name))
			return false;
		Object this$isActive = getIsActive(), other$isActive = other.getIsActive();
		return !((this$isActive == null) ? (other$isActive != null) : !this$isActive.equals(other$isActive));
	}

	protected boolean canEqual(Object other) {
		return other instanceof Designation;
	}

	

	public String toString() {
		return "Designation(id=" + getId() + ", name=" + getName() + ", isActive=" + getIsActive() + ")";
	}

	public Designation(int id, String name, String isActive) {
		/* 15 */ this.id = id;
		this.name = name;
		this.isActive = isActive;
		/*    */ }

	/*    */
	/*    */ public Designation() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 22 */ return this.id;
		/* 23 */ }

	public String getName() {
		return this.name;
	}

	public String getIsActive() {
		/* 24 */ return this.isActive;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * Designation.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */