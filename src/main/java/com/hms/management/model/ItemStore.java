
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
/*    */ @Table(name = "item_store")
/*    */ public class ItemStore {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String itemStoreName;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String itemStockCode;
	private String description;

	public void setItemStoreName(String itemStoreName) {
		this.itemStoreName = itemStoreName;
	}

	public void setItemStockCode(String itemStockCode) {
		this.itemStockCode = itemStockCode;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof ItemStore))
			return false;
		ItemStore other = (ItemStore) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$itemStoreName = getItemStoreName(), other$itemStoreName = other.getItemStoreName();
		if ((this$itemStoreName == null) ? (other$itemStoreName != null)
				: !this$itemStoreName.equals(other$itemStoreName))
			return false;
		Object this$itemStockCode = getItemStockCode(), other$itemStockCode = other.getItemStockCode();
		if ((this$itemStockCode == null) ? (other$itemStockCode != null)
				: !this$itemStockCode.equals(other$itemStockCode))
			return false;
		Object this$description = getDescription(), other$description = other.getDescription();
		return !((this$description == null) ? (other$description != null)
				: !this$description.equals(other$description));
	}

	protected boolean canEqual(Object other) {
		return other instanceof ItemStore;
	}

	
	public String toString() {
		return "ItemStore(id=" + getId() + ", itemStoreName=" + getItemStoreName() + ", itemStockCode="
				+ getItemStockCode() + ", description=" + getDescription() + ")";
	}

	public ItemStore(int id, String itemStoreName, String itemStockCode, String description) {
		/* 15 */ this.id = id;
		this.itemStoreName = itemStoreName;
		this.itemStockCode = itemStockCode;
		this.description = description;
		/*    */ }

	/*    */
	/*    */ public ItemStore() {
	}

	/*    */
	/*    */ public int getId() {
		/* 21 */ return this.id;
		/* 22 */ }

	public String getItemStoreName() {
		return this.itemStoreName;
	}

	/* 23 */ public String getItemStockCode() {
		return this.itemStockCode;
	}

	public String getDescription() {
		/* 24 */ return this.description;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\ItemStore.
 * class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */