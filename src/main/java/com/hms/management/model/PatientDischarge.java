/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
/*    */ @Table(name = "PatientDischarge")
/*    */ public class PatientDischarge {
	@Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String name;
	/*    */ private String patientId;
	/*    */ private String gender;
	/*    */ private String phone;
	/*    */ private String consultant;

	/*    */
	/*    */ public PatientDischarge(int id, String name, String patientId, String gender, String phone,
			String consultant, String admissionbDate, String disChargeDate, float charge, float otherCharges, float tax,
			float discount, float paidAmount) {
		/* 13 */ this.id = id;
		this.name = name;
		this.patientId = patientId;
		this.gender = gender;
		this.phone = phone;
		this.consultant = consultant;
		this.admissionbDate = admissionbDate;
		this.disChargeDate = disChargeDate;
		this.charge = charge;
		this.otherCharges = otherCharges;
		this.tax = tax;
		this.discount = discount;
		this.paidAmount = paidAmount;
		/*    */ }

	private String admissionbDate;
	private String disChargeDate;
	private float charge;
	private float otherCharges;
	private float tax;
	private float discount;
	private float paidAmount;

	public PatientDischarge() {
	}

	public void setId(int id) {
		/* 15 */ this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setConsultant(String consultant) {
		this.consultant = consultant;
	}

	public void setAdmissionbDate(String admissionbDate) {
		this.admissionbDate = admissionbDate;
	}

	public void setDisChargeDate(String disChargeDate) {
		this.disChargeDate = disChargeDate;
	}

	public void setCharge(float charge) {
		this.charge = charge;
	}

	public void setOtherCharges(float otherCharges) {
		this.otherCharges = otherCharges;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public void setPaidAmount(float paidAmount) {
		this.paidAmount = paidAmount;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof PatientDischarge))
			return false;
		PatientDischarge other = (PatientDischarge) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$name = getName(), other$name = other.getName();
		if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name))
			return false;
		Object this$patientId = getPatientId(), other$patientId = other.getPatientId();
		if ((this$patientId == null) ? (other$patientId != null) : !this$patientId.equals(other$patientId))
			return false;
		Object this$gender = getGender(), other$gender = other.getGender();
		if ((this$gender == null) ? (other$gender != null) : !this$gender.equals(other$gender))
			return false;
		Object this$phone = getPhone(), other$phone = other.getPhone();
		if ((this$phone == null) ? (other$phone != null) : !this$phone.equals(other$phone))
			return false;
		Object this$consultant = getConsultant(), other$consultant = other.getConsultant();
		if ((this$consultant == null) ? (other$consultant != null) : !this$consultant.equals(other$consultant))
			return false;
		Object this$admissionbDate = getAdmissionbDate(), other$admissionbDate = other.getAdmissionbDate();
		if ((this$admissionbDate == null) ? (other$admissionbDate != null)
				: !this$admissionbDate.equals(other$admissionbDate))
			return false;
		Object this$disChargeDate = getDisChargeDate(), other$disChargeDate = other.getDisChargeDate();
		return ((this$disChargeDate == null) ? (other$disChargeDate != null)
				: !this$disChargeDate.equals(other$disChargeDate))
						? false
						: ((Float.compare(getCharge(), other.getCharge()) != 0) ? false
								: ((Float.compare(getOtherCharges(), other.getOtherCharges()) != 0) ? false
										: ((Float.compare(getTax(), other.getTax()) != 0) ? false
												: ((Float.compare(getDiscount(), other.getDiscount()) != 0) ? false
														: (!(Float.compare(getPaidAmount(),
																other.getPaidAmount()) != 0))))));
	}

	protected boolean canEqual(Object other) {
		return other instanceof PatientDischarge;
	}

	
	public String toString() {
		return "PatientDischarge(id=" + getId() + ", name=" + getName() + ", patientId=" + getPatientId() + ", gender="
				+ getGender() + ", phone=" + getPhone() + ", consultant=" + getConsultant() + ", admissionbDate="
				+ getAdmissionbDate() + ", disChargeDate=" + getDisChargeDate() + ", charge=" + getCharge()
				+ ", otherCharges=" + getOtherCharges() + ", tax=" + getTax() + ", discount=" + getDiscount()
				+ ", paidAmount=" + getPaidAmount() + ")";
	}

	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */ public int getId() {
		/* 23 */ return this.id;
		/* 24 */ }

	public String getName() {
		return this.name;
	}

	/* 25 */ public String getPatientId() {
		return this.patientId;
	}

	/* 26 */ public String getGender() {
		return this.gender;
	}

	/* 27 */ public String getPhone() {
		return this.phone;
	}

	/* 28 */ public String getConsultant() {
		return this.consultant;
	}

	/* 29 */ public String getAdmissionbDate() {
		return this.admissionbDate;
	}

	/* 30 */ public String getDisChargeDate() {
		return this.disChargeDate;
	}

	/* 31 */ public float getCharge() {
		return this.charge;
	}

	/* 32 */ public float getOtherCharges() {
		return this.otherCharges;
	}

	/* 33 */ public float getTax() {
		return this.tax;
	}

	/* 34 */ public float getDiscount() {
		return this.discount;
	}

	public float getPaidAmount() {
		/* 35 */ return this.paidAmount;
		/*    */ }
}

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * PatientDischarge.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */