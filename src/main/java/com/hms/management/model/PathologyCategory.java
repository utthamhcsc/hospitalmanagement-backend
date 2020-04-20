
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
/*    */ @Table(name = "pathology_category")
/*    */ public class PathologyCategory {
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
		if (!(o instanceof PathologyCategory))
			return false;
		PathologyCategory other = (PathologyCategory) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$name = getName(), other$name = other.getName();
		return !((this$name == null) ? (other$name != null) : !this$name.equals(other$name));
	}

	protected boolean canEqual(Object other) {
		return other instanceof PathologyCategory;
	}

	

	public String toString() {
		return "PathologyCategory(id=" + getId() + ", name=" + getName() + ")";
	}

	public PathologyCategory(int id, String name) {
		/* 15 */ this.id = id;
		this.name = name;
		/*    */ }

	/*    */
	/*    */ public PathologyCategory() {
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
 * PathologyCategory.class Java compiler version: 8 (52.0) JD-Core Version:
 * 1.1.3
 */