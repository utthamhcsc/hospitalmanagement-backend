
/*    */
package com.hms.management.model;

/*    */
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "medicine_dosage")
/*    */ public class MedicineDosageModal {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.SEQUENCE)
	/*    */ private Integer id;

	/*    */
	/* 13 */ public void setId(Integer id) {
		this.id = id;
	}

	private Integer medicineCategory;
	private String dosage;

	public void setMedicineCategory(Integer medicineCategory) {
		this.medicineCategory = medicineCategory;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof MedicineDosageModal))
			return false;
		MedicineDosageModal other = (MedicineDosageModal) o;
		if (!other.canEqual(this))
			return false;
		Object this$id = getId(), other$id = other.getId();
		if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id))
			return false;
		Object this$medicineCategory = getMedicineCategory(), other$medicineCategory = other.getMedicineCategory();
		if ((this$medicineCategory == null) ? (other$medicineCategory != null)
				: !this$medicineCategory.equals(other$medicineCategory))
			return false;
		Object this$dosage = getDosage(), other$dosage = other.getDosage();
		return !((this$dosage == null) ? (other$dosage != null) : !this$dosage.equals(other$dosage));
	}

	protected boolean canEqual(Object other) {
		return other instanceof MedicineDosageModal;
	}

	public String toString() {
		return "MedicineDosageModal(id=" + getId() + ", medicineCategory=" + getMedicineCategory() + ", dosage="
				+ getDosage() + ")";
	}

	/*    */
	/*    */ public MedicineDosageModal() {
	}

	/*    */ public MedicineDosageModal(Integer id, Integer medicineCategory, String dosage) {
		/* 17 */ this.id = id;
		this.medicineCategory = medicineCategory;
		this.dosage = dosage;
		/*    */ }

	/*    */
	/*    */ public Integer getId() {
		/* 21 */ return this.id;
		/* 22 */ }

	public Integer getMedicineCategory() {
		return this.medicineCategory;
	}

	public String getDosage() {
		/* 23 */ return this.dosage;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * MedicineDosageModal.class Java compiler version: 8 (52.0) JD-Core Version:
 * 1.1.3
 */