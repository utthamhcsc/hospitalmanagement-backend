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
/*    */ @Table(name = "expense_head")
/*    */ public class ExpenseHead {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String expenseHead;
	/*    */ private String description;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String isActive;
	private String isDeleted;
	private String createdAt;
	private String updatedAt;

	public void setExpenseHead(String expenseHead) {
		this.expenseHead = expenseHead;
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
		if (!(o instanceof ExpenseHead))
			return false;
		ExpenseHead other = (ExpenseHead) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$expenseHead = getExpenseHead(), other$expenseHead = other.getExpenseHead();
		if ((this$expenseHead == null) ? (other$expenseHead != null) : !this$expenseHead.equals(other$expenseHead))
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
		return other instanceof ExpenseHead;
	}

	
	public String toString() {
		return "ExpenseHead(id=" + getId() + ", expenseHead=" + getExpenseHead() + ", description=" + getDescription()
				+ ", isActive=" + getIsActive() + ", isDeleted=" + getIsDeleted() + ", createdAt=" + getCreatedAt()
				+ ", updatedAt=" + getUpdatedAt() + ")";
	}

	public ExpenseHead(int id, String expenseHead, String description, String isActive, String isDeleted,
			String createdAt, String updatedAt) {
		/* 17 */ this.id = id;
		this.expenseHead = expenseHead;
		this.description = description;
		this.isActive = isActive;
		this.isDeleted = isDeleted;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		/*    */ }

	/*    */
	/*    */ public ExpenseHead() {
	}

	/*    */
	/*    */ public int getId() {
		/* 23 */ return this.id;
		/* 24 */ }

	public String getExpenseHead() {
		return this.expenseHead;
	}

	/* 25 */ public String getDescription() {
		return this.description;
	}

	/* 26 */ public String getIsActive() {
		return this.isActive;
	}

	/* 27 */ public String getIsDeleted() {
		return this.isDeleted;
	}

	/* 28 */ public String getCreatedAt() {
		return this.createdAt;
	}

	public String getUpdatedAt() {
		/* 29 */ return this.updatedAt;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * ExpenseHead.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */