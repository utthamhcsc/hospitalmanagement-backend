/*    */
package com.hms.management.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */
/*    */ @Entity
/*    */ @Table(name = "item_issue")
/*    */ public class ItemIssue {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String issueType;
	/*    */ private String issueTo;
	/*    */ private String issueBy;
	/*    */ private String issueDate;
	/*    */ private String returnDate;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private int itemCategoryId;
	private int itemId;
	private int quantity;
	private String note;
	private int isReturned;
	private Date createdAt;
	private Date isActive;

	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}

	public void setIssueTo(String issueTo) {
		this.issueTo = issueTo;
	}

	public void setIssueBy(String issueBy) {
		this.issueBy = issueBy;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public void setItemCategoryId(int itemCategoryId) {
		this.itemCategoryId = itemCategoryId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setIsReturned(int isReturned) {
		this.isReturned = isReturned;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setIsActive(Date isActive) {
		this.isActive = isActive;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof ItemIssue))
			return false;
		ItemIssue other = (ItemIssue) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$issueType = getIssueType(), other$issueType = other.getIssueType();
		if ((this$issueType == null) ? (other$issueType != null) : !this$issueType.equals(other$issueType))
			return false;
		Object this$issueTo = getIssueTo(), other$issueTo = other.getIssueTo();
		if ((this$issueTo == null) ? (other$issueTo != null) : !this$issueTo.equals(other$issueTo))
			return false;
		Object this$issueBy = getIssueBy(), other$issueBy = other.getIssueBy();
		if ((this$issueBy == null) ? (other$issueBy != null) : !this$issueBy.equals(other$issueBy))
			return false;
		Object this$issueDate = getIssueDate(), other$issueDate = other.getIssueDate();
		if ((this$issueDate == null) ? (other$issueDate != null) : !this$issueDate.equals(other$issueDate))
			return false;
		Object this$returnDate = getReturnDate(), other$returnDate = other.getReturnDate();
		if ((this$returnDate == null) ? (other$returnDate != null) : !this$returnDate.equals(other$returnDate))
			return false;
		if (getItemCategoryId() != other.getItemCategoryId())
			return false;
		if (getItemId() != other.getItemId())
			return false;
		if (getQuantity() != other.getQuantity())
			return false;
		Object this$note = getNote(), other$note = other.getNote();
		if ((this$note == null) ? (other$note != null) : !this$note.equals(other$note))
			return false;
		if (getIsReturned() != other.getIsReturned())
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		if ((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt))
			return false;
		Object this$isActive = getIsActive(), other$isActive = other.getIsActive();
		return !((this$isActive == null) ? (other$isActive != null) : !this$isActive.equals(other$isActive));
	}

	protected boolean canEqual(Object other) {
		return other instanceof ItemIssue;
	}

	   

	public String toString() {
		return "ItemIssue(id=" + getId() + ", issueType=" + getIssueType() + ", issueTo=" + getIssueTo() + ", issueBy="
				+ getIssueBy() + ", issueDate=" + getIssueDate() + ", returnDate=" + getReturnDate()
				+ ", itemCategoryId=" + getItemCategoryId() + ", itemId=" + getItemId() + ", quantity=" + getQuantity()
				+ ", note=" + getNote() + ", isReturned=" + getIsReturned() + ", createdAt=" + getCreatedAt()
				+ ", isActive=" + getIsActive() + ")";
	}

	public ItemIssue(int id, String issueType, String issueTo, String issueBy, String issueDate, String returnDate,
			int itemCategoryId, int itemId, int quantity, String note, int isReturned, Date createdAt, Date isActive) {
		/* 17 */ this.id = id;
		this.issueType = issueType;
		this.issueTo = issueTo;
		this.issueBy = issueBy;
		this.issueDate = issueDate;
		this.returnDate = returnDate;
		this.itemCategoryId = itemCategoryId;
		this.itemId = itemId;
		this.quantity = quantity;
		this.note = note;
		this.isReturned = isReturned;
		this.createdAt = createdAt;
		this.isActive = isActive;
		/*    */ }

	/*    */
	/*    */ public ItemIssue() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 24 */ return this.id;
		/* 25 */ }

	public String getIssueType() {
		return this.issueType;
	}

	/* 26 */ public String getIssueTo() {
		return this.issueTo;
	}

	/* 27 */ public String getIssueBy() {
		return this.issueBy;
	}

	/* 28 */ public String getIssueDate() {
		return this.issueDate;
	}

	/* 29 */ public String getReturnDate() {
		return this.returnDate;
	}

	/* 30 */ public int getItemCategoryId() {
		return this.itemCategoryId;
	}

	/* 31 */ public int getItemId() {
		return this.itemId;
	}

	/* 32 */ public int getQuantity() {
		return this.quantity;
	}

	/* 33 */ public String getNote() {
		return this.note;
	}

	/* 34 */ public int getIsReturned() {
		return this.isReturned;
	}

	/* 35 */ public Date getCreatedAt() {
		return this.createdAt;
	}

	public Date getIsActive() {
		/* 36 */ return this.isActive;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\ItemIssue.
 * class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */