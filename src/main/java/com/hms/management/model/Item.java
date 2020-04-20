/*    */
package com.hms.management.model;

import javax.persistence.Entity;
/*    */
/*    */ import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "item")
/*    */ public class Item {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private int itemCategoryId;
	/*    */ private String name;
	/*    */ private String itemPhoto;
	/*    */ private String description;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String createdAt;
	private String updatedAt;
	private int itemStoreId;
	private int itemSupplierId;
	private int quantity;
	private String date;

	public void setItemCategoryId(int itemCategoryId) {
		this.itemCategoryId = itemCategoryId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setItemPhoto(String itemPhoto) {
		this.itemPhoto = itemPhoto;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public void setItemStoreId(int itemStoreId) {
		this.itemStoreId = itemStoreId;
	}

	public void setItemSupplierId(int itemSupplierId) {
		this.itemSupplierId = itemSupplierId;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Item))
			return false;
		Item other = (Item) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getItemCategoryId() != other.getItemCategoryId())
			return false;
		Object this$name = getName(), other$name = other.getName();
		if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name))
			return false;
		Object this$itemPhoto = getItemPhoto(), other$itemPhoto = other.getItemPhoto();
		if ((this$itemPhoto == null) ? (other$itemPhoto != null) : !this$itemPhoto.equals(other$itemPhoto))
			return false;
		Object this$description = getDescription(), other$description = other.getDescription();
		if ((this$description == null) ? (other$description != null) : !this$description.equals(other$description))
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		if ((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt))
			return false;
		Object this$updatedAt = getUpdatedAt(), other$updatedAt = other.getUpdatedAt();
		if ((this$updatedAt == null) ? (other$updatedAt != null) : !this$updatedAt.equals(other$updatedAt))
			return false;
		if (getItemStoreId() != other.getItemStoreId())
			return false;
		if (getItemSupplierId() != other.getItemSupplierId())
			return false;
		if (getQuantity() != other.getQuantity())
			return false;
		Object this$date = getDate(), other$date = other.getDate();
		return !((this$date == null) ? (other$date != null) : !this$date.equals(other$date));
	}

	protected boolean canEqual(Object other) {
		return other instanceof Item;
	}

	
	public String toString() {
		return "Item(id=" + getId() + ", itemCategoryId=" + getItemCategoryId() + ", name=" + getName() + ", itemPhoto="
				+ getItemPhoto() + ", description=" + getDescription() + ", createdAt=" + getCreatedAt()
				+ ", updatedAt=" + getUpdatedAt() + ", itemStoreId=" + getItemStoreId() + ", itemSupplierId="
				+ getItemSupplierId() + ", quantity=" + getQuantity() + ", date=" + getDate() + ")";
	}

	public Item(int id, int itemCategoryId, String name, String itemPhoto, String description, String createdAt,
			String updatedAt, int itemStoreId, int itemSupplierId, int quantity, String date) {
		/* 17 */ this.id = id;
		this.itemCategoryId = itemCategoryId;
		this.name = name;
		this.itemPhoto = itemPhoto;
		this.description = description;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.itemStoreId = itemStoreId;
		this.itemSupplierId = itemSupplierId;
		this.quantity = quantity;
		this.date = date;
		/*    */ }

	/*    */
	/*    */ public Item() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 24 */ return this.id;
		/* 25 */ }

	public int getItemCategoryId() {
		return this.itemCategoryId;
	}

	/* 26 */ public String getName() {
		return this.name;
	}

	/* 27 */ public String getItemPhoto() {
		return this.itemPhoto;
	}

	/* 28 */ public String getDescription() {
		return this.description;
	}

	/* 29 */ public String getCreatedAt() {
		return this.createdAt;
	}

	/* 30 */ public String getUpdatedAt() {
		return this.updatedAt;
	}

	/* 31 */ public int getItemStoreId() {
		return this.itemStoreId;
	}

	/* 32 */ public int getItemSupplierId() {
		return this.itemSupplierId;
	}

	/* 33 */ public int getQuantity() {
		return this.quantity;
	}

	public String getDate() {
		/* 34 */ return this.date;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\Item.class
 * Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */