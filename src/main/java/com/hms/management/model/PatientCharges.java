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
/*    */ @Table(name = "patient_charges")
/*    */ public class PatientCharges {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String date;
	/*    */ private int patientId;
	/*    */ private int chargeId;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private int orgChargeId;
	private String applyCharge;
	private String createdAt;
	private String updatedAt;

	public void setDate(String date) {
		this.date = date;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public void setChargeId(int chargeId) {
		this.chargeId = chargeId;
	}

	public void setOrgChargeId(int orgChargeId) {
		this.orgChargeId = orgChargeId;
	}

	public void setApplyCharge(String applyCharge) {
		this.applyCharge = applyCharge;
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
		if (!(o instanceof PatientCharges))
			return false;
		PatientCharges other = (PatientCharges) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$date = getDate(), other$date = other.getDate();
		if ((this$date == null) ? (other$date != null) : !this$date.equals(other$date))
			return false;
		if (getPatientId() != other.getPatientId())
			return false;
		if (getChargeId() != other.getChargeId())
			return false;
		if (getOrgChargeId() != other.getOrgChargeId())
			return false;
		Object this$applyCharge = getApplyCharge(), other$applyCharge = other.getApplyCharge();
		if ((this$applyCharge == null) ? (other$applyCharge != null) : !this$applyCharge.equals(other$applyCharge))
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		if ((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt))
			return false;
		Object this$updatedAt = getUpdatedAt(), other$updatedAt = other.getUpdatedAt();
		return !((this$updatedAt == null) ? (other$updatedAt != null) : !this$updatedAt.equals(other$updatedAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof PatientCharges;
	}


	public String toString() {
		return "PatientCharges(id=" + getId() + ", date=" + getDate() + ", patientId=" + getPatientId() + ", chargeId="
				+ getChargeId() + ", orgChargeId=" + getOrgChargeId() + ", applyCharge=" + getApplyCharge()
				+ ", createdAt=" + getCreatedAt() + ", updatedAt=" + getUpdatedAt() + ")";
	}

	public PatientCharges(int id, String date, int patientId, int chargeId, int orgChargeId, String applyCharge,
			String createdAt, String updatedAt) {
		/* 17 */ this.id = id;
		this.date = date;
		this.patientId = patientId;
		this.chargeId = chargeId;
		this.orgChargeId = orgChargeId;
		this.applyCharge = applyCharge;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		/*    */ }

	/*    */
	/*    */ public PatientCharges() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 24 */ return this.id;
		/* 25 */ }

	public String getDate() {
		return this.date;
	}

	/* 26 */ public int getPatientId() {
		return this.patientId;
	}

	/* 27 */ public int getChargeId() {
		return this.chargeId;
	}

	/* 28 */ public int getOrgChargeId() {
		return this.orgChargeId;
	}

	/* 29 */ public String getApplyCharge() {
		return this.applyCharge;
	}

	/* 30 */ public String getCreatedAt() {
		return this.createdAt;
	}

	public String getUpdatedAt() {
		/* 31 */ return this.updatedAt;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * PatientCharges.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */