/*    */
package com.hms.management.opd.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */
/*    */ @Entity
/*    */ @Table
/*    */ public class MyOpdPayment {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String opdId;
	/*    */ private String paymentMode;

	/*    */
	/* 13 */ public void setId(int id) {
		this.id = id;
	}

	private float amount;
	private String attachDocument;
	private String note;
	private String date;

	public void setOpdId(String opdId) {
		this.opdId = opdId;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public void setAttachDocument(String attachDocument) {
		this.attachDocument = attachDocument;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof MyOpdPayment))
			return false;
		MyOpdPayment other = (MyOpdPayment) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$opdId = getOpdId(), other$opdId = other.getOpdId();
		if ((this$opdId == null) ? (other$opdId != null) : !this$opdId.equals(other$opdId))
			return false;
		Object this$paymentMode = getPaymentMode(), other$paymentMode = other.getPaymentMode();
		if ((this$paymentMode == null) ? (other$paymentMode != null) : !this$paymentMode.equals(other$paymentMode))
			return false;
		if (Float.compare(getAmount(), other.getAmount()) != 0)
			return false;
		Object this$attachDocument = getAttachDocument(), other$attachDocument = other.getAttachDocument();
		if ((this$attachDocument == null) ? (other$attachDocument != null)
				: !this$attachDocument.equals(other$attachDocument))
			return false;
		Object this$note = getNote(), other$note = other.getNote();
		if ((this$note == null) ? (other$note != null) : !this$note.equals(other$note))
			return false;
		Object this$date = getDate(), other$date = other.getDate();
		return !((this$date == null) ? (other$date != null) : !this$date.equals(other$date));
	}

	protected boolean canEqual(Object other) {
		return other instanceof MyOpdPayment;
	}

	public String toString() {
		return "MyOpdPayment(id=" + getId() + ", opdId=" + getOpdId() + ", paymentMode=" + getPaymentMode()
				+ ", amount=" + getAmount() + ", attachDocument=" + getAttachDocument() + ", note=" + getNote()
				+ ", date=" + getDate() + ")";
	}

	public MyOpdPayment(int id, String opdId, String paymentMode, float amount, String attachDocument, String note,
			String date) {
		/* 14 */ this.id = id;
		this.opdId = opdId;
		this.paymentMode = paymentMode;
		this.amount = amount;
		this.attachDocument = attachDocument;
		this.note = note;
		this.date = date;
		/*    */ }

	/*    */
	/*    */
	/*    */ public MyOpdPayment() {
	}

	/*    */
	/*    */
	/*    */ public int getId() {
		/* 22 */ return this.id;
		/* 23 */ }

	public String getOpdId() {
		return this.opdId;
	}

	/* 24 */ public String getPaymentMode() {
		return this.paymentMode;
	}

	/* 25 */ public float getAmount() {
		return this.amount;
	}

	/* 26 */ public String getAttachDocument() {
		return this.attachDocument;
	}

	/* 27 */ public String getNote() {
		return this.note;
	}

	public String getDate() {
		/* 28 */ return this.date;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\opd\modal\
 * MyOpdPayment.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */