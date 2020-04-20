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
/*    */ @Table(name = "expenses")
/*    */ public class FinanceExpenses {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private int expHeadId;
	/*    */ private String name;
	/*    */ private String invoiceNo;
	/*    */ private String date;
	/*    */ private float amount;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String documents;
	private String note;
	private String isActive;
	private String isDeleted;
	private String description;
	private Date createdAt;
	private Date updatedAt;

	public void setExpHeadId(int expHeadId) {
		this.expHeadId = expHeadId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public void setDocuments(String documents) {
		this.documents = documents;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof FinanceExpenses))
			return false;
		FinanceExpenses other = (FinanceExpenses) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getExpHeadId() != other.getExpHeadId())
			return false;
		Object this$name = getName(), other$name = other.getName();
		if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name))
			return false;
		Object this$invoiceNo = getInvoiceNo(), other$invoiceNo = other.getInvoiceNo();
		if ((this$invoiceNo == null) ? (other$invoiceNo != null) : !this$invoiceNo.equals(other$invoiceNo))
			return false;
		Object this$date = getDate(), other$date = other.getDate();
		if ((this$date == null) ? (other$date != null) : !this$date.equals(other$date))
			return false;
		if (Float.compare(getAmount(), other.getAmount()) != 0)
			return false;
		Object this$documents = getDocuments(), other$documents = other.getDocuments();
		if ((this$documents == null) ? (other$documents != null) : !this$documents.equals(other$documents))
			return false;
		Object this$note = getNote(), other$note = other.getNote();
		if ((this$note == null) ? (other$note != null) : !this$note.equals(other$note))
			return false;
		Object this$isActive = getIsActive(), other$isActive = other.getIsActive();
		if ((this$isActive == null) ? (other$isActive != null) : !this$isActive.equals(other$isActive))
			return false;
		Object this$isDeleted = getIsDeleted(), other$isDeleted = other.getIsDeleted();
		if ((this$isDeleted == null) ? (other$isDeleted != null) : !this$isDeleted.equals(other$isDeleted))
			return false;
		Object this$description = getDescription(), other$description = other.getDescription();
		if ((this$description == null) ? (other$description != null) : !this$description.equals(other$description))
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		if ((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt))
			return false;
		Object this$updatedAt = getUpdatedAt(), other$updatedAt = other.getUpdatedAt();
		return !((this$updatedAt == null) ? (other$updatedAt != null) : !this$updatedAt.equals(other$updatedAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof FinanceExpenses;
	}

	
	public String toString() {
		return "FinanceExpenses(id=" + getId() + ", expHeadId=" + getExpHeadId() + ", name=" + getName()
				+ ", invoiceNo=" + getInvoiceNo() + ", date=" + getDate() + ", amount=" + getAmount() + ", documents="
				+ getDocuments() + ", note=" + getNote() + ", isActive=" + getIsActive() + ", isDeleted="
				+ getIsDeleted() + ", description=" + getDescription() + ", createdAt=" + getCreatedAt()
				+ ", updatedAt=" + getUpdatedAt() + ")";
	}

	public FinanceExpenses(int id, int expHeadId, String name, String invoiceNo, String date, float amount,
			String documents, String note, String isActive, String isDeleted, String description, Date createdAt,
			Date updatedAt) {
		/* 17 */ this.id = id;
		this.expHeadId = expHeadId;
		this.name = name;
		this.invoiceNo = invoiceNo;
		this.date = date;
		this.amount = amount;
		this.documents = documents;
		this.note = note;
		this.isActive = isActive;
		this.isDeleted = isDeleted;
		this.description = description;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		/*    */ }

	/*    */
	/*    */ public FinanceExpenses() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 24 */ return this.id;
		/* 25 */ }

	public int getExpHeadId() {
		return this.expHeadId;
	}

	/* 26 */ public String getName() {
		return this.name;
	}

	/* 27 */ public String getInvoiceNo() {
		return this.invoiceNo;
	}

	/* 28 */ public String getDate() {
		return this.date;
	}

	/* 29 */ public float getAmount() {
		return this.amount;
	}

	/* 30 */ public String getDocuments() {
		return this.documents;
	}

	/* 31 */ public String getNote() {
		return this.note;
	}

	/* 32 */ public String getIsActive() {
		return this.isActive;
	}

	/* 33 */ public String getIsDeleted() {
		return this.isDeleted;
	}

	/* 34 */ public String getDescription() {
		return this.description;
	}

	/* 35 */ public Date getCreatedAt() {
		return this.createdAt;
	}

	public Date getUpdatedAt() {
		/* 36 */ return this.updatedAt;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * FinanceExpenses.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */