/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */
/*    */ @Entity
/*    */ @Table(name = "payment")
/*    */ public class Payment {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private int patientId;
	/*    */ private float paidAmount;
	/*    */ private int balanceAmount;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private int totalAmount;
	private String paymentMode;
	private String note;
	private String date;
	private String document;

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public void setPaidAmount(float paidAmount) {
		this.paidAmount = paidAmount;
	}

	public void setBalanceAmount(int balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Payment))
			return false;
		Payment other = (Payment) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getPatientId() != other.getPatientId())
			return false;
		if (Float.compare(getPaidAmount(), other.getPaidAmount()) != 0)
			return false;
		if (getBalanceAmount() != other.getBalanceAmount())
			return false;
		if (getTotalAmount() != other.getTotalAmount())
			return false;
		Object this$paymentMode = getPaymentMode(), other$paymentMode = other.getPaymentMode();
		if ((this$paymentMode == null) ? (other$paymentMode != null) : !this$paymentMode.equals(other$paymentMode))
			return false;
		Object this$note = getNote(), other$note = other.getNote();
		if ((this$note == null) ? (other$note != null) : !this$note.equals(other$note))
			return false;
		Object this$date = getDate(), other$date = other.getDate();
		if ((this$date == null) ? (other$date != null) : !this$date.equals(other$date))
			return false;
		Object this$document = getDocument(), other$document = other.getDocument();
		return !((this$document == null) ? (other$document != null) : !this$document.equals(other$document));
	}

	protected boolean canEqual(Object other) {
		return other instanceof Payment;
	}


	public String toString() {
		return "Payment(id=" + getId() + ", patientId=" + getPatientId() + ", paidAmount=" + getPaidAmount()
				+ ", balanceAmount=" + getBalanceAmount() + ", totalAmount=" + getTotalAmount() + ", paymentMode="
				+ getPaymentMode() + ", note=" + getNote() + ", date=" + getDate() + ", document=" + getDocument()
				+ ")";
	}

	public Payment(int id, int patientId, float paidAmount, int balanceAmount, int totalAmount, String paymentMode,
			String note, String date, String document) {
		/* 15 */ this.id = id;
		this.patientId = patientId;
		this.paidAmount = paidAmount;
		this.balanceAmount = balanceAmount;
		this.totalAmount = totalAmount;
		this.paymentMode = paymentMode;
		this.note = note;
		this.date = date;
		this.document = document;
		/*    */ }

	/*    */
	/*    */ public Payment() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 22 */ return this.id;
		/* 23 */ }

	public int getPatientId() {
		return this.patientId;
	}

	/* 24 */ public float getPaidAmount() {
		return this.paidAmount;
	}

	/* 25 */ public int getBalanceAmount() {
		return this.balanceAmount;
	}

	/* 26 */ public int getTotalAmount() {
		return this.totalAmount;
	}

	/* 27 */ public String getPaymentMode() {
		return this.paymentMode;
	}

	/* 28 */ public String getNote() {
		return this.note;
	}

	/* 29 */ public String getDate() {
		return this.date;
	}

	public String getDocument() {
		/* 30 */ return this.document;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\Payment.
 * class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */