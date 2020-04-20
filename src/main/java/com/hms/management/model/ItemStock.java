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
/*    */ @Table(name = "item_stock")
/*    */ public class ItemStock {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private int itemId;
	/*    */ private int supplierId;
	/*    */ private String symbol;
	/*    */ private int storeId;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private int quantity;
	private String date;
	private String attachment;
	private String description;
	private String isActive;
	private String createdAt;

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof ItemStock))
			return false;
		ItemStock other = (ItemStock) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getItemId() != other.getItemId())
			return false;
		if (getSupplierId() != other.getSupplierId())
			return false;
		Object this$symbol = getSymbol(), other$symbol = other.getSymbol();
		if ((this$symbol == null) ? (other$symbol != null) : !this$symbol.equals(other$symbol))
			return false;
		if (getStoreId() != other.getStoreId())
			return false;
		if (getQuantity() != other.getQuantity())
			return false;
		Object this$date = getDate(), other$date = other.getDate();
		if ((this$date == null) ? (other$date != null) : !this$date.equals(other$date))
			return false;
		Object this$attachment = getAttachment(), other$attachment = other.getAttachment();
		if ((this$attachment == null) ? (other$attachment != null) : !this$attachment.equals(other$attachment))
			return false;
		Object this$description = getDescription(), other$description = other.getDescription();
		if ((this$description == null) ? (other$description != null) : !this$description.equals(other$description))
			return false;
		Object this$isActive = getIsActive(), other$isActive = other.getIsActive();
		if ((this$isActive == null) ? (other$isActive != null) : !this$isActive.equals(other$isActive))
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		return !((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof ItemStock;
	}

	
	public String toString() {
		return "ItemStock(id=" + getId() + ", itemId=" + getItemId() + ", supplierId=" + getSupplierId() + ", symbol="
				+ getSymbol() + ", storeId=" + getStoreId() + ", quantity=" + getQuantity() + ", date=" + getDate()
				+ ", attachment=" + getAttachment() + ", description=" + getDescription() + ", isActive="
				+ getIsActive() + ", createdAt=" + getCreatedAt() + ")";
	}

	public ItemStock(int id, int itemId, int supplierId, String symbol, int storeId, int quantity, String date,
			String attachment, String description, String isActive, String createdAt) {
		/* 17 */ this.id = id;
		this.itemId = itemId;
		this.supplierId = supplierId;
		this.symbol = symbol;
		this.storeId = storeId;
		this.quantity = quantity;
		this.date = date;
		this.attachment = attachment;
		this.description = description;
		this.isActive = isActive;
		this.createdAt = createdAt;
		/*    */ }

	/*    */
	/*    */ public ItemStock() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 24 */ return this.id;
		/* 25 */ }

	public int getItemId() {
		return this.itemId;
	}

	/* 26 */ public int getSupplierId() {
		return this.supplierId;
	}

	/* 27 */ public String getSymbol() {
		return this.symbol;
	}

	/* 28 */ public int getStoreId() {
		return this.storeId;
	}

	/* 29 */ public int getQuantity() {
		return this.quantity;
	}

	/* 30 */ public String getDate() {
		return this.date;
	}

	/* 31 */ public String getAttachment() {
		return this.attachment;
	}

	/* 32 */ public String getDescription() {
		return this.description;
	}

	/* 33 */ public String getIsActive() {
		return this.isActive;
	}

	public String getCreatedAt() {
		/* 34 */ return this.createdAt;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\ItemStock.
 * class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */