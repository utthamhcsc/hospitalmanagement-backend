/*    */ package com.hms.management.ipd.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */ 
/*    */ 
/*    */ @Entity
/*    */ @Table
/*    */ public class MyIpdPayment {
/*    */   @Id
/*    */   @GeneratedValue(strategy = GenerationType.AUTO)
/*    */   private int id;
/*    */   private String ipdId;
/*    */   private String paymentMode;
/*    */   
	/* 13 */ public void setId(int id) {
		this.id = id;
	}

	private float amount;
	private String attachDocument;
	private String note;
	private String date;

	public void setIpdId(String ipdId) {
		this.ipdId = ipdId;
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
		if (!(o instanceof MyIpdPayment))
			return false;
		MyIpdPayment other = (MyIpdPayment) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$ipdId = getIpdId(), other$ipdId = other.getIpdId();
		if ((this$ipdId == null) ? (other$ipdId != null) : !this$ipdId.equals(other$ipdId))
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
		return other instanceof MyIpdPayment;
	}

	

	public String toString() {
		return "MyIpdPayment(id=" + getId() + ", ipdId=" + getIpdId() + ", paymentMode=" + getPaymentMode()
				+ ", amount=" + getAmount() + ", attachDocument=" + getAttachDocument() + ", note=" + getNote()
				+ ", date=" + getDate() + ")";
	}

	public MyIpdPayment(int id, String ipdId, String paymentMode, float amount, String attachDocument, String note,
			String date) {
		/* 14 */ this.id = id;
		this.ipdId = ipdId;
		this.paymentMode = paymentMode;
		this.amount = amount;
		this.attachDocument = attachDocument;
		this.note = note;
		this.date = date;
		/*    */ }

	/*    */
	/*    */
	/*    */ public MyIpdPayment() {
	}

	/*    */
	/*    */
	/*    */ public int getId() {
		/* 22 */ return this.id;
		/* 23 */ }

	public String getIpdId() {
		return this.ipdId;
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


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\ipd\modal\MyIpdPayment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */