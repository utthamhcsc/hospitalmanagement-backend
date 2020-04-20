/*    */
package com.hms.management.model;

/*    */
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "charge_category")
/*    */ public class ChargesCategory {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String chargeCategory;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String description;
	private String chargeType;

	public void setChargeCategory(String chargeCategory) {
		this.chargeCategory = chargeCategory;
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
		if (!(o instanceof ChargesCategory))
			return false;
		ChargesCategory other = (ChargesCategory) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$chargeCategory = getChargeCategory(), other$chargeCategory = other.getChargeCategory();
		if ((this$chargeCategory == null) ? (other$chargeCategory != null)
				: !this$chargeCategory.equals(other$chargeCategory))
			return false;
		Object this$description = getDescription(), other$description = other.getDescription();
		if ((this$description == null) ? (other$description != null) : !this$description.equals(other$description))
			return false;
		Object this$chargeType = getChargeType(), other$chargeType = other.getChargeType();
		return !((this$chargeType == null) ? (other$chargeType != null) : !this$chargeType.equals(other$chargeType));
	}

	protected boolean canEqual(Object other) {
		return other instanceof ChargesCategory;
	}


	public String toString() {
		return "ChargesCategory(id=" + getId() + ", chargeCategory=" + getChargeCategory() + ", description="
				+ getDescription() + ", chargeType=" + getChargeType() + ")";
	}

	public ChargesCategory(int id, String chargeCategory, String description, String chargeType) {
		/* 15 */ this.id = id;
		this.chargeCategory = chargeCategory;
		this.description = description;
		this.chargeType = chargeType;
		/*    */ }

	/*    */
	/*    */ public ChargesCategory() {
	}

	/*    */
	/*    */ public int getId() {
		/* 21 */ return this.id;
		/* 22 */ }

	public String getChargeCategory() {
		return this.chargeCategory;
	}

	/* 23 */ public String getDescription() {
		return this.description;
	}

	public String getChargeType() {
		/* 24 */ return this.chargeType;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * ChargesCategory.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */