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
/*    */ @Table(name = "medicine_bad_stock")
/*    */ public class MedicineBadStock {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private int pharmacyId;
	/*    */ private String outwardDate;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String expiryDate;
	private String batchNo;
	private String quantity;
	private String note;

	public void setPharmacyId(int pharmacyId) {
		this.pharmacyId = pharmacyId;
	}

	public void setOutwardDate(String outwardDate) {
		this.outwardDate = outwardDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof MedicineBadStock))
			return false;
		MedicineBadStock other = (MedicineBadStock) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getPharmacyId() != other.getPharmacyId())
			return false;
		Object this$outwardDate = getOutwardDate(), other$outwardDate = other.getOutwardDate();
		if ((this$outwardDate == null) ? (other$outwardDate != null) : !this$outwardDate.equals(other$outwardDate))
			return false;
		Object this$expiryDate = getExpiryDate(), other$expiryDate = other.getExpiryDate();
		if ((this$expiryDate == null) ? (other$expiryDate != null) : !this$expiryDate.equals(other$expiryDate))
			return false;
		Object this$batchNo = getBatchNo(), other$batchNo = other.getBatchNo();
		if ((this$batchNo == null) ? (other$batchNo != null) : !this$batchNo.equals(other$batchNo))
			return false;
		Object this$quantity = getQuantity(), other$quantity = other.getQuantity();
		if ((this$quantity == null) ? (other$quantity != null) : !this$quantity.equals(other$quantity))
			return false;
		Object this$note = getNote(), other$note = other.getNote();
		return !((this$note == null) ? (other$note != null) : !this$note.equals(other$note));
	}

	protected boolean canEqual(Object other) {
		return other instanceof MedicineBadStock;
	}

	public String toString() {
		return "MedicineBadStock(id=" + getId() + ", pharmacyId=" + getPharmacyId() + ", outwardDate="
				+ getOutwardDate() + ", expiryDate=" + getExpiryDate() + ", batchNo=" + getBatchNo() + ", quantity="
				+ getQuantity() + ", note=" + getNote() + ")";
	}

	public MedicineBadStock(int id, int pharmacyId, String outwardDate, String expiryDate, String batchNo,
			String quantity, String note) {
		/* 15 */ this.id = id;
		this.pharmacyId = pharmacyId;
		this.outwardDate = outwardDate;
		this.expiryDate = expiryDate;
		this.batchNo = batchNo;
		this.quantity = quantity;
		this.note = note;
		/*    */ }

	/*    */
	/*    */ public MedicineBadStock() {
	}

	/*    */
	/*    */ public int getId() {
		/* 21 */ return this.id;
		/* 22 */ }

	public int getPharmacyId() {
		return this.pharmacyId;
	}

	/* 23 */ public String getOutwardDate() {
		return this.outwardDate;
	}

	/* 24 */ public String getExpiryDate() {
		return this.expiryDate;
	}

	/* 25 */ public String getBatchNo() {
		return this.batchNo;
	}

	/* 26 */ public String getQuantity() {
		return this.quantity;
	}

	public String getNote() {
		/* 27 */ return this.note;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * MedicineBadStock.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */