/*    */
package com.hms.management.model;

/*    */
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;

/*    */ import javax.persistence.CascadeType;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.JoinColumn;
/*    */ import javax.persistence.OneToMany;
/*    */ import javax.persistence.Table;

/*    */
/*    */
/*    */
/*    */ @Entity
/*    */ @Table(name = "purchaseMedicineModal")
/*    */ public class PurchaseMedicineModal
/*    */ {
	/*    */ @Id
	/*    */ @GeneratedValue
	/*    */ private int id;
	/*    */ private String supplierId;
	/*    */ private String date;
	/*    */ private String note;
	/*    */ private float discount;
	/*    */ private float tax;
	/*    */ private float netamount;
	/*    */ private String attachDocument;
	/*    */ private float total;
	/*    */ @OneToMany(targetEntity = MedicineBatchDetails.class, cascade = { CascadeType.ALL })
	/*    */ @JoinColumn(name = "mc_fk", referencedColumnName = "id", insertable = true, updatable = true, nullable = false)
	/*    */ private List<MedicineBatchDetails> medicine;

	/*    */
	/*    */ public PurchaseMedicineModal(int id, String supplierId, String date, String note, float discount,
			float tax, float netamount, String attachDocument, float total, List<MedicineBatchDetails> medicine) {
		/* 35 */ this.medicine = new ArrayList<>();
		this.id = id;
		this.supplierId = supplierId;
		this.date = date;
		this.note = note;
		this.discount = discount;
		this.tax = tax;
		this.netamount = netamount;
		this.attachDocument = attachDocument;
		this.total = total;
		this.medicine = medicine;
	}

	public PurchaseMedicineModal() {
		this.medicine = new ArrayList<>();
	}

	/*    */ public void setId(int id) {
		this.id = id;
	}

	/* 37 */ public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public List<MedicineBatchDetails> getMedicine() {
		return this.medicine;
	}

	/*    */
	/*    */
	/*    */ public void setDate(String date) {
		/*    */ this.date = date;
		/*    */ }

	/*    */
	/*    */ public void setNote(String note) {
		/*    */ this.note = note;
		/*    */ }

	/*    */
	/*    */ public void setDiscount(float discount) {
		/*    */ this.discount = discount;
		/*    */ }

	/*    */
	/*    */ public void setTax(float tax) {
		/*    */ this.tax = tax;
		/*    */ }

	/*    */
	/*    */ public void setNetamount(float netamount) {
		/*    */ this.netamount = netamount;
		/*    */ }

	/*    */
	/*    */ public void setAttachDocument(String attachDocument) {
		/*    */ this.attachDocument = attachDocument;
		/*    */ }

	/*    */
	/*    */ public void setTotal(float total) {
		/*    */ this.total = total;
		/*    */ }

	/*    */
	/*    */ public void setMedicine(List<MedicineBatchDetails> medicine) {
		/*    */ this.medicine = medicine;
		/*    */ }


	/*    */
	/*    */ protected boolean canEqual(Object other) {
		/*    */ return other instanceof PurchaseMedicineModal;
		/*    */ }



	/*    */
	/*    */ public String toString() {
		/*    */ return "PurchaseMedicineModal(id=" + getId() + ", supplierId=" + getSupplierId() + ", date="
				+ getDate() + ", note=" + getNote() + ", discount=" + getDiscount() + ", tax=" + getTax()
				+ ", netamount=" + getNetamount() + ", attachDocument=" + getAttachDocument() + ", total=" + getTotal()
				+ ", medicine=" + getMedicine() + ")";
		/*    */ }

	/*    */
	/*    */ public int getId() {
		/*    */ return this.id;
		/*    */ }

	/*    */
	/*    */ public String getSupplierId() {
		/*    */ return this.supplierId;
		/*    */ }

	/*    */
	/*    */ public String getDate() {
		/*    */ return this.date;
		/*    */ }

	/*    */
	/*    */ public String getNote() {
		/*    */ return this.note;
		/*    */ }

	/*    */
	/*    */ public float getDiscount() {
		/*    */ return this.discount;
		/*    */ }

	/*    */
	/*    */ public float getTax() {
		/*    */ return this.tax;
		/*    */ }

	/*    */
	/*    */ public float getNetamount() {
		/*    */ return this.netamount;
		/*    */ }

	/*    */
	/*    */ public String getAttachDocument() {
		/*    */ return this.attachDocument;
		/*    */ }

	/*    */
	/*    */ public float getTotal() {
		/*    */ return this.total;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * PurchaseMedicineModal.class Java compiler version: 8 (52.0) JD-Core Version:
 * 1.1.3
 */