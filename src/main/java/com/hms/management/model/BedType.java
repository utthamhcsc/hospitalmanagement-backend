
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
/*    */ @Table(name = "bed_type")
/*    */ public class BedType {
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
		if (!(o instanceof BedType))
			return false;
		BedType other = (BedType) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$name = getName(), other$name = other.getName();
		return !((this$name == null) ? (other$name != null) : !this$name.equals(other$name));
	}

	protected boolean canEqual(Object other) {
		return other instanceof BedType;
	}

	

	public String toString() {
		return "BedType(id=" + getId() + ", name=" + getName() + ")";
	}

	public BedType(int id, String name) {
		/* 15 */ this.id = id;
		this.name = name;
		/*    */ }

	/*    */
	/*    */ public BedType() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 22 */ return this.id;
	}

	public String getName() {
		/* 23 */ return this.name;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\BedType.
 * class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */