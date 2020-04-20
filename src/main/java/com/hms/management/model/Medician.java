/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
/*    */ @Table(name = "medician")
/*    */ public class Medician {
	@Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	private String medicineName;
	private String medicineCategory;
	/*    */ private String medicineCompany;
	/*    */ private String medicineComposition;
	/*    */ private String medicineGroup;
	/*    */ private String unit;

	/*    */
	/*    */ public Medician(int id, String medicineName, String medicineCategory, String medicineCompany,
			String medicineComposition, String medicineGroup, String unit, String minLevel, String reOrderLevel,
			String vat, String packing, String note, String vatAc, String MedicinePhoto) {
		/* 12 */ this.id = id;
		this.medicineName = medicineName;
		this.medicineCategory = medicineCategory;
		this.medicineCompany = medicineCompany;
		this.medicineComposition = medicineComposition;
		this.medicineGroup = medicineGroup;
		this.unit = unit;
		this.minLevel = minLevel;
		this.reOrderLevel = reOrderLevel;
		this.vat = vat;
		this.packing = packing;
		this.note = note;
		this.vatAc = vatAc;
		this.MedicinePhoto = MedicinePhoto;
		/*    */ }

	private String minLevel;
	private String reOrderLevel;
	private String vat;
	private String packing;
	private String note;
	private String vatAc;
	private String MedicinePhoto;

	public Medician() {
	}

	public void setId(int id) {
		/* 14 */ this.id = id;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public void setMedicineCategory(String medicineCategory) {
		this.medicineCategory = medicineCategory;
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

	public void setReOrderLevel(String reOrderLevel) {
		this.reOrderLevel = reOrderLevel;
	}

	public void setVat(String vat) {
		this.vat = vat;
	}

	public void setPacking(String packing) {
		this.packing = packing;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setVatAc(String vatAc) {
		this.vatAc = vatAc;
	}

	public void setMedicinePhoto(String MedicinePhoto) {
		this.MedicinePhoto = MedicinePhoto;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Medician))
			return false;
		Medician other = (Medician) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$medicineName = getMedicineName(), other$medicineName = other.getMedicineName();
		if ((this$medicineName == null) ? (other$medicineName != null) : !this$medicineName.equals(other$medicineName))
			return false;
		Object this$medicineCategory = getMedicineCategory(), other$medicineCategory = other.getMedicineCategory();
		if ((this$medicineCategory == null) ? (other$medicineCategory != null)
				: !this$medicineCategory.equals(other$medicineCategory))
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
		Object this$reOrderLevel = getReOrderLevel(), other$reOrderLevel = other.getReOrderLevel();
		if ((this$reOrderLevel == null) ? (other$reOrderLevel != null) : !this$reOrderLevel.equals(other$reOrderLevel))
			return false;
		Object this$vat = getVat(), other$vat = other.getVat();
		if ((this$vat == null) ? (other$vat != null) : !this$vat.equals(other$vat))
			return false;
		Object this$packing = getPacking(), other$packing = other.getPacking();
		if ((this$packing == null) ? (other$packing != null) : !this$packing.equals(other$packing))
			return false;
		Object this$note = getNote(), other$note = other.getNote();
		if ((this$note == null) ? (other$note != null) : !this$note.equals(other$note))
			return false;
		Object this$vatAc = getVatAc(), other$vatAc = other.getVatAc();
		if ((this$vatAc == null) ? (other$vatAc != null) : !this$vatAc.equals(other$vatAc))
			return false;
		Object this$MedicinePhoto = getMedicinePhoto(), other$MedicinePhoto = other.getMedicinePhoto();
		return !((this$MedicinePhoto == null) ? (other$MedicinePhoto != null)
				: !this$MedicinePhoto.equals(other$MedicinePhoto));
	}

	protected boolean canEqual(Object other) {
		return other instanceof Medician;
	}

	
	public String toString() {
		return "Medician(id=" + getId() + ", medicineName=" + getMedicineName() + ", medicineCategory="
				+ getMedicineCategory() + ", medicineCompany=" + getMedicineCompany() + ", medicineComposition="
				+ getMedicineComposition() + ", medicineGroup=" + getMedicineGroup() + ", unit=" + getUnit()
				+ ", minLevel=" + getMinLevel() + ", reOrderLevel=" + getReOrderLevel() + ", vat=" + getVat()
				+ ", packing=" + getPacking() + ", note=" + getNote() + ", vatAc=" + getVatAc() + ", MedicinePhoto="
				+ getMedicinePhoto() + ")";
	}

	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */ public int getId() {
		/* 21 */ return this.id;
		/* 22 */ }

	public String getMedicineName() {
		return this.medicineName;
	}

	/* 23 */ public String getMedicineCategory() {
		return this.medicineCategory;
	}

	/* 24 */ public String getMedicineCompany() {
		return this.medicineCompany;
	}

	/* 25 */ public String getMedicineComposition() {
		return this.medicineComposition;
	}

	/* 26 */ public String getMedicineGroup() {
		return this.medicineGroup;
	}

	/* 27 */ public String getUnit() {
		return this.unit;
	}

	/* 28 */ public String getMinLevel() {
		return this.minLevel;
	}

	/* 29 */ public String getReOrderLevel() {
		return this.reOrderLevel;
	}

	/* 30 */ public String getVat() {
		return this.vat;
	}

	/* 31 */ public String getPacking() {
		return this.packing;
	}

	/* 32 */ public String getNote() {
		return this.note;
	}

	/* 33 */ public String getVatAc() {
		return this.vatAc;
	}

	public String getMedicinePhoto() {
		/* 34 */ return this.MedicinePhoto;
		/*    */ }
}

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\Medician.
 * class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */