/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */
/*    */ @Entity
/*    */ @Table(name = "medicine_category")
/*    */ public class MedicineCategory {
	/*    */ @Id
	/*    */ private String medicianCatId;
	/*    */ private String medicineCategory;
	/*    */ private String medicianName;

	/*    */
	/* 12 */ public void setMedicianCatId(String medicianCatId) {
		this.medicianCatId = medicianCatId;
	}

	private String expiredate;
	private String quentity;
	private String salePrice;
	private float charges;

	public void setMedicineCategory(String medicineCategory) {
		this.medicineCategory = medicineCategory;
	}

	public void setMedicianName(String medicianName) {
		this.medicianName = medicianName;
	}

	public void setExpiredate(String expiredate) {
		this.expiredate = expiredate;
	}

	public void setQuentity(String quentity) {
		this.quentity = quentity;
	}

	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public void setCharges(float charges) {
		this.charges = charges;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof MedicineCategory))
			return false;
		MedicineCategory other = (MedicineCategory) o;
		if (!other.canEqual(this))
			return false;
		Object this$medicianCatId = getMedicianCatId(), other$medicianCatId = other.getMedicianCatId();
		if ((this$medicianCatId == null) ? (other$medicianCatId != null)
				: !this$medicianCatId.equals(other$medicianCatId))
			return false;
		Object this$medicineCategory = getMedicineCategory(), other$medicineCategory = other.getMedicineCategory();
		if ((this$medicineCategory == null) ? (other$medicineCategory != null)
				: !this$medicineCategory.equals(other$medicineCategory))
			return false;
		Object this$medicianName = getMedicianName(), other$medicianName = other.getMedicianName();
		if ((this$medicianName == null) ? (other$medicianName != null) : !this$medicianName.equals(other$medicianName))
			return false;
		Object this$expiredate = getExpiredate(), other$expiredate = other.getExpiredate();
		if ((this$expiredate == null) ? (other$expiredate != null) : !this$expiredate.equals(other$expiredate))
			return false;
		Object this$quentity = getQuentity(), other$quentity = other.getQuentity();
		if ((this$quentity == null) ? (other$quentity != null) : !this$quentity.equals(other$quentity))
			return false;
		Object this$salePrice = getSalePrice(), other$salePrice = other.getSalePrice();
		return ((this$salePrice == null) ? (other$salePrice != null) : !this$salePrice.equals(other$salePrice)) ? false
				: (!(Float.compare(getCharges(), other.getCharges()) != 0));
	}

	protected boolean canEqual(Object other) {
		return other instanceof MedicineCategory;
	}

	

	public String toString() {
		return "MedicineCategory(medicianCatId=" + getMedicianCatId() + ", medicineCategory=" + getMedicineCategory()
				+ ", medicianName=" + getMedicianName() + ", expiredate=" + getExpiredate() + ", quentity="
				+ getQuentity() + ", salePrice=" + getSalePrice() + ", charges=" + getCharges() + ")";
	}

	public MedicineCategory(String medicianCatId, String medicineCategory, String medicianName, String expiredate,
			String quentity, String salePrice, float charges) {
		/* 13 */ this.medicianCatId = medicianCatId;
		this.medicineCategory = medicineCategory;
		this.medicianName = medicianName;
		this.expiredate = expiredate;
		this.quentity = quentity;
		this.salePrice = salePrice;
		this.charges = charges;
		/*    */ }

	/*    */
	/*    */ public MedicineCategory() {
	}

	/*    */
	/*    */ public String getMedicianCatId() {
		/* 19 */ return this.medicianCatId;
		/* 20 */ }

	public String getMedicineCategory() {
		return this.medicineCategory;
	}

	/* 21 */ public String getMedicianName() {
		return this.medicianName;
	}

	/* 22 */ public String getExpiredate() {
		return this.expiredate;
	}

	/* 23 */ public String getQuentity() {
		return this.quentity;
	}

	/* 24 */ public String getSalePrice() {
		return this.salePrice;
	}

	public float getCharges() {
		/* 25 */ return this.charges;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * MedicineCategory.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */