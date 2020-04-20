
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
/*    */ @Table(name = "income_head")
/*    */ public class IncomeHead {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String incomeHead;
	/*    */ private String description;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String isActive;
	private String isDeleted;
	private String createdAt;
	private String updatedAt;

	public void setIncomeHead(String incomeHead) {
		this.incomeHead = incomeHead;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof IncomeHead))
			return false;
		IncomeHead other = (IncomeHead) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$incomeHead = getIncomeHead(), other$incomeHead = other.getIncomeHead();
		if ((this$incomeHead == null) ? (other$incomeHead != null) : !this$incomeHead.equals(other$incomeHead))
			return false;
		Object this$description = getDescription(), other$description = other.getDescription();
		if ((this$description == null) ? (other$description != null) : !this$description.equals(other$description))
			return false;
		Object this$isActive = getIsActive(), other$isActive = other.getIsActive();
		if ((this$isActive == null) ? (other$isActive != null) : !this$isActive.equals(other$isActive))
			return false;
		Object this$isDeleted = getIsDeleted(), other$isDeleted = other.getIsDeleted();
		if ((this$isDeleted == null) ? (other$isDeleted != null) : !this$isDeleted.equals(other$isDeleted))
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		if ((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt))
			return false;
		Object this$updatedAt = getUpdatedAt(), other$updatedAt = other.getUpdatedAt();
		return !((this$updatedAt == null) ? (other$updatedAt != null) : !this$updatedAt.equals(other$updatedAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof IncomeHead;
	}

	
	public String toString() {
		return "IncomeHead(id=" + getId() + ", incomeHead=" + getIncomeHead() + ", description=" + getDescription()
				+ ", isActive=" + getIsActive() + ", isDeleted=" + getIsDeleted() + ", createdAt=" + getCreatedAt()
				+ ", updatedAt=" + getUpdatedAt() + ")";
	}

	public IncomeHead(int id, String incomeHead, String description, String isActive, String isDeleted,
			String createdAt, String updatedAt) {
		/* 17 */ this.id = id;
		this.incomeHead = incomeHead;
		this.description = description;
		this.isActive = isActive;
		this.isDeleted = isDeleted;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		/*    */ }

	/*    */
	/*    */ public IncomeHead() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 24 */ return this.id;
		/* 25 */ }

	public String getIncomeHead() {
		return this.incomeHead;
	}

	/* 26 */ public String getDescription() {
		return this.description;
	}

	/* 27 */ public String getIsActive() {
		return this.isActive;
	}

	/* 28 */ public String getIsDeleted() {
		return this.isDeleted;
	}

	/* 29 */ public String getCreatedAt() {
		return this.createdAt;
	}

	public String getUpdatedAt() {
		/* 30 */ return this.updatedAt;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\IncomeHead
 * .class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */