/*    */
package com.hms.management.model;

/*    */
/*    */ import java.util.Date;

import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "FinanceIncome")
/*    */ public class FinanceIncome {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String incHeadId;
	/*    */ private String name;
	/*    */ private String invoiceNo;
	/*    */ private String date;

	/*    */
	/* 17 */ public void setId(int id) {
		this.id = id;
	}

	private float amount;
	private String note;
	private Date createdAt;
	private Date updatedAt;
	private String documents;

	public void setIncHeadId(String incHeadId) {
		this.incHeadId = incHeadId;
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

	public void setNote(String note) {
		this.note = note;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public void setDocuments(String documents) {
		this.documents = documents;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof FinanceIncome))
			return false;
		FinanceIncome other = (FinanceIncome) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$incHeadId = getIncHeadId(), other$incHeadId = other.getIncHeadId();
		if ((this$incHeadId == null) ? (other$incHeadId != null) : !this$incHeadId.equals(other$incHeadId))
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
		Object this$note = getNote(), other$note = other.getNote();
		if ((this$note == null) ? (other$note != null) : !this$note.equals(other$note))
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		if ((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt))
			return false;
		Object this$updatedAt = getUpdatedAt(), other$updatedAt = other.getUpdatedAt();
		if ((this$updatedAt == null) ? (other$updatedAt != null) : !this$updatedAt.equals(other$updatedAt))
			return false;
		Object this$documents = getDocuments(), other$documents = other.getDocuments();
		return !((this$documents == null) ? (other$documents != null) : !this$documents.equals(other$documents));
	}

	protected boolean canEqual(Object other) {
		return other instanceof FinanceIncome;
	}

	

	public String toString() {
		return "FinanceIncome(id=" + getId() + ", incHeadId=" + getIncHeadId() + ", name=" + getName() + ", invoiceNo="
				+ getInvoiceNo() + ", date=" + getDate() + ", amount=" + getAmount() + ", note=" + getNote()
				+ ", createdAt=" + getCreatedAt() + ", updatedAt=" + getUpdatedAt() + ", documents=" + getDocuments()
				+ ")";
	}

	public FinanceIncome(int id, String incHeadId, String name, String invoiceNo, String date, float amount,
			String note, Date createdAt, Date updatedAt, String documents) {
		/* 18 */ this.id = id;
		this.incHeadId = incHeadId;
		this.name = name;
		this.invoiceNo = invoiceNo;
		this.date = date;
		this.amount = amount;
		this.note = note;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.documents = documents;
		/*    */ }

	/*    */
	/*    */
	/*    */
	/*    */ public FinanceIncome() {
	}

	/*    */
	/*    */
	/*    */ public int getId() {
		/* 27 */ return this.id;
		/* 28 */ }

	public String getIncHeadId() {
		return this.incHeadId;
	}

	/* 29 */ public String getName() {
		return this.name;
	}

	/* 30 */ public String getInvoiceNo() {
		return this.invoiceNo;
	}

	/* 31 */ public String getDate() {
		return this.date;
	}

	/* 32 */ public float getAmount() {
		return this.amount;
	}

	/* 33 */ public String getNote() {
		return this.note;
	}

	/* 34 */ public Date getCreatedAt() {
		return this.createdAt;
	}

	/* 35 */ public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public String getDocuments() {
		/* 36 */ return this.documents;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * FinanceIncome.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */