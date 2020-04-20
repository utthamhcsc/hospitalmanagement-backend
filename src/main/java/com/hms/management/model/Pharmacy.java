/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */ @Entity
/*    */ @Table(name = "pharmacy")
/*    */ public class Pharmacy {
	@Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	private String medicineName;
	/*    */ private int medicineCategoryId;
	/*    */ private String medicineImage;
	/*    */ private String medicineCompany;
	/*    */ private String medicineComposition;
	/*    */ private String medicineGroup;
	/*    */ private String unit;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String minLevel;
	private String reorderLevel;
	private String vat;
	private String unitPacking;
	private String supplier;
	private String vatAc;
	private String note;
	private String createdAt;
	private String updatedAt;

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public void setMedicineCategoryId(int medicineCategoryId) {
		this.medicineCategoryId = medicineCategoryId;
	}

	public void setMedicineImage(String medicineImage) {
		this.medicineImage = medicineImage;
	}

	public void setMedicineCompany(String medicineCompany) {
		this.medicineCompany = medicineCompany;
	}

	public void setMedicineComposition(String medicineComposition) {
		this.medicineComposition = medicineComposition;
	}

	public void setMedicineGroup(String medicineGroup) {
		this.medicineGroup = medicineGroup;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public void setMinLevel(String minLevel) {
		this.minLevel = minLevel;
	}

	public void setReorderLevel(String reorderLevel) {
		this.reorderLevel = reorderLevel;
	}

	public void setVat(String vat) {
		this.vat = vat;
	}

	public void setUnitPacking(String unitPacking) {
		this.unitPacking = unitPacking;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public void setVatAc(String vatAc) {
		this.vatAc = vatAc;
	}

	public void setNote(String note) {
		this.note = note;
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
		if (!(o instanceof Pharmacy))
			return false;
		Pharmacy other = (Pharmacy) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$medicineName = getMedicineName(), other$medicineName = other.getMedicineName();
		if ((this$medicineName == null) ? (other$medicineName != null) : !this$medicineName.equals(other$medicineName))
			return false;
		if (getMedicineCategoryId() != other.getMedicineCategoryId())
			return false;
		Object this$medicineImage = getMedicineImage(), other$medicineImage = other.getMedicineImage();
		if ((this$medicineImage == null) ? (other$medicineImage != null)
				: !this$medicineImage.equals(other$medicineImage))
			return false;
		Object this$medicineCompany = getMedicineCompany(), other$medicineCompany = other.getMedicineCompany();
		if ((this$medicineCompany == null) ? (other$medicineCompany != null)
				: !this$medicineCompany.equals(other$medicineCompany))
			return false;
		Object this$medicineComposition = getMedicineComposition(),
				other$medicineComposition = other.getMedicineComposition();
		if ((this$medicineComposition == null) ? (other$medicineComposition != null)
				: !this$medicineComposition.equals(other$medicineComposition))
			return false;
		Object this$medicineGroup = getMedicineGroup(), other$medicineGroup = other.getMedicineGroup();
		if ((this$medicineGroup == null) ? (other$medicineGroup != null)
				: !this$medicineGroup.equals(other$medicineGroup))
			return false;
		Object this$unit = getUnit(), other$unit = other.getUnit();
		if ((this$unit == null) ? (other$unit != null) : !this$unit.equals(other$unit))
			return false;
		Object this$minLevel = getMinLevel(), other$minLevel = other.getMinLevel();
		if ((this$minLevel == null) ? (other$minLevel != null) : !this$minLevel.equals(other$minLevel))
			return false;
		Object this$reorderLevel = getReorderLevel(), other$reorderLevel = other.getReorderLevel();
		if ((this$reorderLevel == null) ? (other$reorderLevel != null) : !this$reorderLevel.equals(other$reorderLevel))
			return false;
		Object this$vat = getVat(), other$vat = other.getVat();
		if ((this$vat == null) ? (other$vat != null) : !this$vat.equals(other$vat))
			return false;
		Object this$unitPacking = getUnitPacking(), other$unitPacking = other.getUnitPacking();
		if ((this$unitPacking == null) ? (other$unitPacking != null) : !this$unitPacking.equals(other$unitPacking))
			return false;
		Object this$supplier = getSupplier(), other$supplier = other.getSupplier();
		if ((this$supplier == null) ? (other$supplier != null) : !this$supplier.equals(other$supplier))
			return false;
		Object this$vatAc = getVatAc(), other$vatAc = other.getVatAc();
		if ((this$vatAc == null) ? (other$vatAc != null) : !this$vatAc.equals(other$vatAc))
			return false;
		Object this$note = getNote(), other$note = other.getNote();
		if ((this$note == null) ? (other$note != null) : !this$note.equals(other$note))
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		if ((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt))
			return false;
		Object this$updatedAt = getUpdatedAt(), other$updatedAt = other.getUpdatedAt();
		return !((this$updatedAt == null) ? (other$updatedAt != null) : !this$updatedAt.equals(other$updatedAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof Pharmacy;
	}

	public String toString() {
		return "Pharmacy(id=" + getId() + ", medicineName=" + getMedicineName() + ", medicineCategoryId="
				+ getMedicineCategoryId() + ", medicineImage=" + getMedicineImage() + ", medicineCompany="
				+ getMedicineCompany() + ", medicineComposition=" + getMedicineComposition() + ", medicineGroup="
				+ getMedicineGroup() + ", unit=" + getUnit() + ", minLevel=" + getMinLevel() + ", reorderLevel="
				+ getReorderLevel() + ", vat=" + getVat() + ", unitPacking=" + getUnitPacking() + ", supplier="
				+ getSupplier() + ", vatAc=" + getVatAc() + ", note=" + getNote() + ", createdAt=" + getCreatedAt()
				+ ", updatedAt=" + getUpdatedAt() + ")";
	}

	public Pharmacy(int id, String medicineName, int medicineCategoryId, String medicineImage, String medicineCompany,
			String medicineComposition, String medicineGroup, String unit, String minLevel, String reorderLevel,
			String vat, String unitPacking, String supplier, String vatAc, String note, String createdAt,
			String updatedAt) {
		/* 15 */ this.id = id;
		this.medicineName = medicineName;
		this.medicineCategoryId = medicineCategoryId;
		this.medicineImage = medicineImage;
		this.medicineCompany = medicineCompany;
		this.medicineComposition = medicineComposition;
		this.medicineGroup = medicineGroup;
		this.unit = unit;
		this.minLevel = minLevel;
		this.reorderLevel = reorderLevel;
		this.vat = vat;
		this.unitPacking = unitPacking;
		this.supplier = supplier;
		this.vatAc = vatAc;
		this.note = note;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		/*    */ }

	/*    */
	/*    */ public Pharmacy() {
	}

	/*    */
	/*    */ public int getId() {
		/* 21 */ return this.id;
		/* 22 */ }

	public String getMedicineName() {
		return this.medicineName;
	}

	/* 23 */ public int getMedicineCategoryId() {
		return this.medicineCategoryId;
	}

	/* 24 */ public String getMedicineImage() {
		return this.medicineImage;
	}

	/* 25 */ public String getMedicineCompany() {
		return this.medicineCompany;
	}

	/* 26 */ public String getMedicineComposition() {
		return this.medicineComposition;
	}

	/* 27 */ public String getMedicineGroup() {
		return this.medicineGroup;
	}

	/* 28 */ public String getUnit() {
		return this.unit;
	}

	/* 29 */ public String getMinLevel() {
		return this.minLevel;
	}

	/* 30 */ public String getReorderLevel() {
		return this.reorderLevel;
	}

	/* 31 */ public String getVat() {
		return this.vat;
	}

	/* 32 */ public String getUnitPacking() {
		return this.unitPacking;
	}

	/* 33 */ public String getSupplier() {
		return this.supplier;
	}

	/* 34 */ public String getVatAc() {
		return this.vatAc;
	}

	/* 35 */ public String getNote() {
		return this.note;
	}

	/* 36 */ public String getCreatedAt() {
		return this.createdAt;
	}

	public String getUpdatedAt() {
		/* 37 */ return this.updatedAt;
		/*    */ }
}

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\Pharmacy.
 * class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */