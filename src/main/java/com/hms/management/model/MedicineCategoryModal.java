
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
/*    */ @Table(name = "medicinecategory")
/*    */ public class MedicineCategoryModal {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.SEQUENCE)
	/*    */ private Integer id;

	/*    */
	/* 13 */ public void setId(Integer id) {
		this.id = id;
	}

	private String medicineCategory;

	public void setMedicineCategory(String medicineCategory) {
		this.medicineCategory = medicineCategory;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof MedicineCategoryModal))
			return false;
		MedicineCategoryModal other = (MedicineCategoryModal) o;
		if (!other.canEqual(this))
			return false;
		Object this$id = getId(), other$id = other.getId();
		if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id))
			return false;
		Object this$medicineCategory = getMedicineCategory(), other$medicineCategory = other.getMedicineCategory();
		return !((this$medicineCategory == null) ? (other$medicineCategory != null)
				: !this$medicineCategory.equals(other$medicineCategory));
	}

	protected boolean canEqual(Object other) {
		return other instanceof MedicineCategoryModal;
	}

	
	public String toString() {
		return "MedicineCategoryModal(id=" + getId() + ", medicineCategory=" + getMedicineCategory() + ")";
	}

	/*    */
	/*    */ public MedicineCategoryModal() {
	}

	/*    */ public MedicineCategoryModal(Integer id, String medicineCategory) {
		/* 17 */ this.id = id;
		this.medicineCategory = medicineCategory;
		/*    */ }

	/*    */
	/*    */ public Integer getId() {
		/* 21 */ return this.id;
	}

	public String getMedicineCategory() {
		/* 22 */ return this.medicineCategory;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * MedicineCategoryModal.class Java compiler version: 8 (52.0) JD-Core Version:
 * 1.1.3
 */