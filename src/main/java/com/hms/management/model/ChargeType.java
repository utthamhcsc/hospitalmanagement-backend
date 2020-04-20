/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */
/*    */ @Entity
/*    */ @Table(name = "chargeType")
/*    */ public class ChargeType {
	/*    */ @Id
	/*    */ @GeneratedValue
	/*    */ private int id;

	/*    */
	/* 11 */ public void setId(int id) {
		this.id = id;
	}

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof ChargeType))
			return false;
		ChargeType other = (ChargeType) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$name = getName(), other$name = other.getName();
		return !((this$name == null) ? (other$name != null) : !this$name.equals(other$name));
	}

	protected boolean canEqual(Object other) {
		return other instanceof ChargeType;
	}


	public String toString() {
		return "ChargeType(id=" + getId() + ", name=" + getName() + ")";
	}

	public ChargeType(int id, String name) {
		/* 12 */ this.id = id;
		this.name = name;
		/*    */ }

	/*    */
	/*    */ public ChargeType() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 19 */ return this.id;
	}

	public String getName() {
		/* 20 */ return this.name;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\ChargeType
 * .class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */