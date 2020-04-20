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
/*    */ @Table(name = "item_category")
/*    */ public class ItemCategory {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String itemCategory;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String isActive;
	private String description;

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof ItemCategory))
			return false;
		ItemCategory other = (ItemCategory) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$itemCategory = getItemCategory(), other$itemCategory = other.getItemCategory();
		if ((this$itemCategory == null) ? (other$itemCategory != null) : !this$itemCategory.equals(other$itemCategory))
			return false;
		Object this$isActive = getIsActive(), other$isActive = other.getIsActive();
		if ((this$isActive == null) ? (other$isActive != null) : !this$isActive.equals(other$isActive))
			return false;
		Object this$description = getDescription(), other$description = other.getDescription();
		return !((this$description == null) ? (other$description != null)
				: !this$description.equals(other$description));
	}

	protected boolean canEqual(Object other) {
		return other instanceof ItemCategory;
	}

	

	public String toString() {
		return "ItemCategory(id=" + getId() + ", itemCategory=" + getItemCategory() + ", isActive=" + getIsActive()
				+ ", description=" + getDescription() + ")";
	}

	public ItemCategory(int id, String itemCategory, String isActive, String description) {
		/* 17 */ this.id = id;
		this.itemCategory = itemCategory;
		this.isActive = isActive;
		this.description = description;
		/*    */ }

	/*    */
	/*    */ public ItemCategory() {
	}

	/*    */
	/*    */ public int getId() {
		/* 23 */ return this.id;
		/* 24 */ }

	public String getItemCategory() {
		return this.itemCategory;
	}

	/* 25 */ public String getIsActive() {
		return this.isActive;
	}

	public String getDescription() {
		/* 26 */ return this.description;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * ItemCategory.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */