/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */ @Entity
/*    */ @Table
/*    */ public class MedicineBatchDetails {
	@Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	private int pharmacyId;
	private String medicineName;
	/*    */ private int medicineCategoryId;
	/*    */ private String medicineCategory;
	/*    */ private String batchamt;
	/*    */ private String inwardDate;
	/*    */ private String expiryDate;
	/*    */ private String batchNum;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String packingqty;
	private String purchasePrice;
	private float quantity;
	private float mrp;
	private float saleprice;
	private float amount;
	private float availableQuantity;
	private String createdAt;
	private String updatedAt;

	public void setPharmacyId(int pharmacyId) {
		this.pharmacyId = pharmacyId;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public void setMedicineCategoryId(int medicineCategoryId) {
		this.medicineCategoryId = medicineCategoryId;
	}

	public void setMedicineCategory(String medicineCategory) {
		this.medicineCategory = medicineCategory;
	}

	public void setBatchamt(String batchamt) {
		this.batchamt = batchamt;
	}

	public void setInwardDate(String inwardDate) {
		this.inwardDate = inwardDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public void setBatchNum(String batchNum) {
		this.batchNum = batchNum;
	}

	public void setPackingqty(String packingqty) {
		this.packingqty = packingqty;
	}

	public void setPurchasePrice(String purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public void setMrp(float mrp) {
		this.mrp = mrp;
	}

	public void setSaleprice(float saleprice) {
		this.saleprice = saleprice;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public void setAvailableQuantity(float availableQuantity) {
		this.availableQuantity = availableQuantity;
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
		if (!(o instanceof MedicineBatchDetails))
			return false;
		MedicineBatchDetails other = (MedicineBatchDetails) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getPharmacyId() != other.getPharmacyId())
			return false;
		Object this$medicineName = getMedicineName(), other$medicineName = other.getMedicineName();
		if ((this$medicineName == null) ? (other$medicineName != null) : !this$medicineName.equals(other$medicineName))
			return false;
		if (getMedicineCategoryId() != other.getMedicineCategoryId())
			return false;
		Object this$medicineCategory = getMedicineCategory(), other$medicineCategory = other.getMedicineCategory();
		if ((this$medicineCategory == null) ? (other$medicineCategory != null)
				: !this$medicineCategory.equals(other$medicineCategory))
			return false;
		Object this$batchamt = getBatchamt(), other$batchamt = other.getBatchamt();
		if ((this$batchamt == null) ? (other$batchamt != null) : !this$batchamt.equals(other$batchamt))
			return false;
		Object this$inwardDate = getInwardDate(), other$inwardDate = other.getInwardDate();
		if ((this$inwardDate == null) ? (other$inwardDate != null) : !this$inwardDate.equals(other$inwardDate))
			return false;
		Object this$expiryDate = getExpiryDate(), other$expiryDate = other.getExpiryDate();
		if ((this$expiryDate == null) ? (other$expiryDate != null) : !this$expiryDate.equals(other$expiryDate))
			return false;
		Object this$batchNum = getBatchNum(), other$batchNum = other.getBatchNum();
		if ((this$batchNum == null) ? (other$batchNum != null) : !this$batchNum.equals(other$batchNum))
			return false;
		Object this$packingqty = getPackingqty(), other$packingqty = other.getPackingqty();
		if ((this$packingqty == null) ? (other$packingqty != null) : !this$packingqty.equals(other$packingqty))
			return false;
		Object this$purchasePrice = getPurchasePrice(), other$purchasePrice = other.getPurchasePrice();
		if ((this$purchasePrice == null) ? (other$purchasePrice != null)
				: !this$purchasePrice.equals(other$purchasePrice))
			return false;
		if (Float.compare(getQuantity(), other.getQuantity()) != 0)
			return false;
		if (Float.compare(getMrp(), other.getMrp()) != 0)
			return false;
		if (Float.compare(getSaleprice(), other.getSaleprice()) != 0)
			return false;
		if (Float.compare(getAmount(), other.getAmount()) != 0)
			return false;
		if (Float.compare(getAvailableQuantity(), other.getAvailableQuantity()) != 0)
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		if ((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt))
			return false;
		Object this$updatedAt = getUpdatedAt(), other$updatedAt = other.getUpdatedAt();
		return !((this$updatedAt == null) ? (other$updatedAt != null) : !this$updatedAt.equals(other$updatedAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof MedicineBatchDetails;
	}

	

	public String toString() {
		return "MedicineBatchDetails(id=" + getId() + ", pharmacyId=" + getPharmacyId() + ", medicineName="
				+ getMedicineName() + ", medicineCategoryId=" + getMedicineCategoryId() + ", medicineCategory="
				+ getMedicineCategory() + ", batchamt=" + getBatchamt() + ", inwardDate=" + getInwardDate()
				+ ", expiryDate=" + getExpiryDate() + ", batchNum=" + getBatchNum() + ", packingqty=" + getPackingqty()
				+ ", purchasePrice=" + getPurchasePrice() + ", quantity=" + getQuantity() + ", mrp=" + getMrp()
				+ ", saleprice=" + getSaleprice() + ", amount=" + getAmount() + ", availableQuantity="
				+ getAvailableQuantity() + ", createdAt=" + getCreatedAt() + ", updatedAt=" + getUpdatedAt() + ")";
	}

	public MedicineBatchDetails(int id, int pharmacyId, String medicineName, int medicineCategoryId,
			String medicineCategory, String batchamt, String inwardDate, String expiryDate, String batchNum,
			String packingqty, String purchasePrice, float quantity, float mrp, float saleprice, float amount,
			float availableQuantity, String createdAt, String updatedAt) {
		/* 15 */ this.id = id;
		this.pharmacyId = pharmacyId;
		this.medicineName = medicineName;
		this.medicineCategoryId = medicineCategoryId;
		this.medicineCategory = medicineCategory;
		this.batchamt = batchamt;
		this.inwardDate = inwardDate;
		this.expiryDate = expiryDate;
		this.batchNum = batchNum;
		this.packingqty = packingqty;
		this.purchasePrice = purchasePrice;
		this.quantity = quantity;
		this.mrp = mrp;
		this.saleprice = saleprice;
		this.amount = amount;
		this.availableQuantity = availableQuantity;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		/*    */ }

	/*    */
	/*    */ public MedicineBatchDetails() {
	}

	/*    */
	/*    */ public int getId() {
		/* 21 */ return this.id;
		/* 22 */ }

	public int getPharmacyId() {
		return this.pharmacyId;
	}

	/* 23 */ public String getMedicineName() {
		return this.medicineName;
	}

	/* 24 */ public int getMedicineCategoryId() {
		return this.medicineCategoryId;
	}

	/* 25 */ public String getMedicineCategory() {
		return this.medicineCategory;
	}

	/* 26 */ public String getBatchamt() {
		return this.batchamt;
	}

	/* 27 */ public String getInwardDate() {
		return this.inwardDate;
	}

	/* 28 */ public String getExpiryDate() {
		return this.expiryDate;
	}

	/* 29 */ public String getBatchNum() {
		return this.batchNum;
	}

	/* 30 */ public String getPackingqty() {
		return this.packingqty;
	}

	/* 31 */ public String getPurchasePrice() {
		return this.purchasePrice;
	}

	/* 32 */ public float getQuantity() {
		return this.quantity;
	}

	/* 33 */ public float getMrp() {
		return this.mrp;
	}

	/* 34 */ public float getSaleprice() {
		return this.saleprice;
	}

	/* 35 */ public float getAmount() {
		return this.amount;
	}

	/* 36 */ public float getAvailableQuantity() {
		return this.availableQuantity;
	}

	/* 37 */ public String getCreatedAt() {
		return this.createdAt;
	}

	public String getUpdatedAt() {
		/* 38 */ return this.updatedAt;
		/*    */ }
}

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * MedicineBatchDetails.class Java compiler version: 8 (52.0) JD-Core Version:
 * 1.1.3
 */