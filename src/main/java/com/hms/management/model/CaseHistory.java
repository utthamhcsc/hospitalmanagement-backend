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
/*    */ @Table(name = "CaseHistory")
/*    */ public class CaseHistory {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String medicianCategory;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String medicine;
	private String dosage;
	private String instruction;

	public void setMedicianCategory(String medicianCategory) {
		this.medicianCategory = medicianCategory;
	}

	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof CaseHistory))
			return false;
		CaseHistory other = (CaseHistory) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$medicianCategory = getMedicianCategory(), other$medicianCategory = other.getMedicianCategory();
		if ((this$medicianCategory == null) ? (other$medicianCategory != null)
				: !this$medicianCategory.equals(other$medicianCategory))
			return false;
		Object this$medicine = getMedicine(), other$medicine = other.getMedicine();
		if ((this$medicine == null) ? (other$medicine != null) : !this$medicine.equals(other$medicine))
			return false;
		Object this$dosage = getDosage(), other$dosage = other.getDosage();
		if ((this$dosage == null) ? (other$dosage != null) : !this$dosage.equals(other$dosage))
			return false;
		Object this$instruction = getInstruction(), other$instruction = other.getInstruction();
		return !((this$instruction == null) ? (other$instruction != null)
				: !this$instruction.equals(other$instruction));
	}

	protected boolean canEqual(Object other) {
		return other instanceof CaseHistory;
	}


	public String toString() {
		return "CaseHistory(id=" + getId() + ", medicianCategory=" + getMedicianCategory() + ", medicine="
				+ getMedicine() + ", dosage=" + getDosage() + ", instruction=" + getInstruction() + ")";
	}

	public CaseHistory(int id, String medicianCategory, String medicine, String dosage, String instruction) {
		/* 15 */ this.id = id;
		this.medicianCategory = medicianCategory;
		this.medicine = medicine;
		this.dosage = dosage;
		this.instruction = instruction;
		/*    */ }

	/*    */
	/*    */ public CaseHistory() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 22 */ return this.id;
		/* 23 */ }

	public String getMedicianCategory() {
		return this.medicianCategory;
	}

	/* 24 */ public String getMedicine() {
		return this.medicine;
	}

	/* 25 */ public String getDosage() {
		return this.dosage;
	}

	public String getInstruction() {
		/* 26 */ return this.instruction;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * CaseHistory.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */