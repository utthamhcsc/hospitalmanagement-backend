/*    */
package com.hms.management.model;

/*    */
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "charge_categories")
/*    */ public class ChargeCategories {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String name;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String description;
	private String chargeType;

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof ChargeCategories))
			return false;
		ChargeCategories other = (ChargeCategories) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$name = getName(), other$name = other.getName();
		if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name))
			return false;
		Object this$description = getDescription(), other$description = other.getDescription();
		if ((this$description == null) ? (other$description != null) : !this$description.equals(other$description))
			return false;
		Object this$chargeType = getChargeType(), other$chargeType = other.getChargeType();
		return !((this$chargeType == null) ? (other$chargeType != null) : !this$chargeType.equals(other$chargeType));
	}

	protected boolean canEqual(Object other) {
		return other instanceof ChargeCategories;
	}

	

	public String toString() {
		return "ChargeCategories(id=" + getId() + ", name=" + getName() + ", description=" + getDescription()
				+ ", chargeType=" + getChargeType() + ")";
	}

	public ChargeCategories(int id, String name, String description, String chargeType) {
		/* 17 */ this.id = id;
		this.name = name;
		this.description = description;
		this.chargeType = chargeType;
		/*    */ }

	/*    */
	/*    */ public ChargeCategories() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 24 */ return this.id;
		/* 25 */ }

	public String getName() {
		return this.name;
	}

	/* 26 */ public String getDescription() {
		return this.description;
	}

	public String getChargeType() {
		/* 27 */ return this.chargeType;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * ChargeCategories.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */