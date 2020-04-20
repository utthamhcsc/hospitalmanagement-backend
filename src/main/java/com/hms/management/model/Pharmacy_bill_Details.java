/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "pharmacyBill_Details")
/*    */ public class Pharmacy_bill_Details {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private int medicineCategoryId;
	/*    */ private String medicineCategory;
	/*    */ private int pharmacyId;
	/*    */ private String medicineName;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String batchNum;
	private String expiryDate;
	private float quantity;
	private float saleprice;
	private float amount;
	private int medicineBatch;

	public void setMedicineCategoryId(int medicineCategoryId) {
		this.medicineCategoryId = medicineCategoryId;
	}

	public void setMedicineCategory(String medicineCategory) {
		this.medicineCategory = medicineCategory;
	}

	public void setPharmacyId(int pharmacyId) {
		this.pharmacyId = pharmacyId;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public void setBatchNum(String batchNum) {
		this.batchNum = batchNum;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public void setSaleprice(float saleprice) {
		this.saleprice = saleprice;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public void setMedicineBatch(int medicineBatch) {
		this.medicineBatch = medicineBatch;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Pharmacy_bill_Details))
			return false;
		Pharmacy_bill_Details other = (Pharmacy_bill_Details) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getMedicineCategoryId() != other.getMedicineCategoryId())
			return false;
		Object this$medicineCategory = getMedicineCategory(), other$medicineCategory = other.getMedicineCategory();
		if ((this$medicineCategory == null) ? (other$medicineCategory != null)
				: !this$medicineCategory.equals(other$medicineCategory))
			return false;
		if (getPharmacyId() != other.getPharmacyId())
			return false;
		Object this$medicineName = getMedicineName(), other$medicineName = other.getMedicineName();
		if ((this$medicineName == null) ? (other$medicineName != null) : !this$medicineName.equals(other$medicineName))
			return false;
		Object this$batchNum = getBatchNum(), other$batchNum = other.getBatchNum();
		if ((this$batchNum == null) ? (other$batchNum != null) : !this$batchNum.equals(other$batchNum))
			return false;
		Object this$expiryDate = getExpiryDate(), other$expiryDate = other.getExpiryDate();
		return ((this$expiryDate == null) ? (other$expiryDate != null) : !this$expiryDate.equals(other$expiryDate))
				? false
				: ((Float.compare(getQuantity(), other.getQuantity()) != 0) ? false
						: ((Float.compare(getSaleprice(), other.getSaleprice()) != 0) ? false
								: ((Float.compare(getAmount(), other.getAmount()) != 0) ? false
										: (!(getMedicineBatch() != other.getMedicineBatch())))));
	}

	protected boolean canEqual(Object other) {
		return other instanceof Pharmacy_bill_Details;
	}


	public String toString() {
		return "Pharmacy_bill_Details(id=" + getId() + ", medicineCategoryId=" + getMedicineCategoryId()
				+ ", medicineCategory=" + getMedicineCategory() + ", pharmacyId=" + getPharmacyId() + ", medicineName="
				+ getMedicineName() + ", batchNum=" + getBatchNum() + ", expiryDate=" + getExpiryDate() + ", quantity="
				+ getQuantity() + ", saleprice=" + getSaleprice() + ", amount=" + getAmount() + ", medicineBatch="
				+ getMedicineBatch() + ")";
	}

	public Pharmacy_bill_Details(int id, int medicineCategoryId, String medicineCategory, int pharmacyId,
			String medicineName, String batchNum, String expiryDate, float quantity, float saleprice, float amount,
			int medicineBatch) {
		/* 15 */ this.id = id;
		this.medicineCategoryId = medicineCategoryId;
		this.medicineCategory = medicineCategory;
		this.pharmacyId = pharmacyId;
		this.medicineName = medicineName;
		this.batchNum = batchNum;
		this.expiryDate = expiryDate;
		this.quantity = quantity;
		this.saleprice = saleprice;
		this.amount = amount;
		this.medicineBatch = medicineBatch;
		/*    */ }

	/*    */
	/*    */ public Pharmacy_bill_Details() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 22 */ return this.id;
		/* 23 */ }

	public int getMedicineCategoryId() {
		return this.medicineCategoryId;
	}

	/* 24 */ public String getMedicineCategory() {
		return this.medicineCategory;
	}

	/* 25 */ public int getPharmacyId() {
		return this.pharmacyId;
	}

	/* 26 */ public String getMedicineName() {
		return this.medicineName;
	}

	/* 27 */ public String getBatchNum() {
		return this.batchNum;
	}

	/* 28 */ public String getExpiryDate() {
		return this.expiryDate;
	}

	/* 29 */ public float getQuantity() {
		return this.quantity;
	}

	/* 30 */ public float getSaleprice() {
		return this.saleprice;
	}

	/* 31 */ public float getAmount() {
		return this.amount;
	}

	public int getMedicineBatch() {
		/* 32 */ return this.medicineBatch;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * Pharmacy_bill_Details.class Java compiler version: 8 (52.0) JD-Core Version:
 * 1.1.3
 */