
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
/*    */ @Table(name = "radiology_category")
/*    */ public class RadiologyCategory {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof RadiologyCategory))
			return false;
		RadiologyCategory other = (RadiologyCategory) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$name = getName(), other$name = other.getName();
		return !((this$name == null) ? (other$name != null) : !this$name.equals(other$name));
	}

	protected boolean canEqual(Object other) {
		return other instanceof RadiologyCategory;
	}

	
	public String toString() {
		return "RadiologyCategory(id=" + getId() + ", name=" + getName() + ")";
	}

	public RadiologyCategory(int id, String name) {
		/* 15 */ this.id = id;
		this.name = name;
		/*    */ }

	/*    */
	/*    */ public RadiologyCategory() {
	}

	/*    */
	/*    */ public int getId() {
		/* 21 */ return this.id;
	}

	public String getName() {
		/* 22 */ return this.name;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * RadiologyCategory.class Java compiler version: 8 (52.0) JD-Core Version:
 * 1.1.3
 */