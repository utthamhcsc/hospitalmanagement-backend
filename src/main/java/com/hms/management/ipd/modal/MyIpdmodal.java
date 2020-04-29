/*    */
package com.hms.management.ipd.modal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */ @Entity
/*    */ @Table
/*    */ public class MyIpdmodal {
	@Id
	/*    */ private String ipdId;
	private String patientId;
	private float height;
	private float weight;
	/*    */ private float bp;
	/*    */ private String symptoms;
	/*    */ private String note;
	/*    */ private String admissionDate;
	/*    */ private String caseType;
private String dischargeDate;
	/*    */
	/* 12 */ public void setIpdId(String ipdId) {
		this.ipdId = ipdId;
	}

	private String casuality;
	private String oldPatient;
	private int tpa;
	private String reference;
	private String doctorId;
	private String doctorName;
	private int bedNumber;
	private int department;
	private String status;

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void setBp(float bp) {
		this.bp = bp;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}

	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}

	public void setCasuality(String casuality) {
		this.casuality = casuality;
	}

	public void setOldPatient(String oldPatient) {
		this.oldPatient = oldPatient;
	}

	public void setTpa(int tpa) {
		this.tpa = tpa;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public void setBedNumber(int bedNumber) {
		this.bedNumber = bedNumber;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof MyIpdmodal))
			return false;
		MyIpdmodal other = (MyIpdmodal) o;
		if (!other.canEqual(this))
			return false;
		Object this$ipdId = getIpdId(), other$ipdId = other.getIpdId();
		if ((this$ipdId == null) ? (other$ipdId != null) : !this$ipdId.equals(other$ipdId))
			return false;
		Object this$patientId = getPatientId(), other$patientId = other.getPatientId();
		if ((this$patientId == null) ? (other$patientId != null) : !this$patientId.equals(other$patientId))
			return false;
		if (Float.compare(getHeight(), other.getHeight()) != 0)
			return false;
		if (Float.compare(getWeight(), other.getWeight()) != 0)
			return false;
		if (Float.compare(getBp(), other.getBp()) != 0)
			return false;
		Object this$symptoms = getSymptoms(), other$symptoms = other.getSymptoms();
		if ((this$symptoms == null) ? (other$symptoms != null) : !this$symptoms.equals(other$symptoms))
			return false;
		Object this$note = getNote(), other$note = other.getNote();
		if ((this$note == null) ? (other$note != null) : !this$note.equals(other$note))
			return false;
		Object this$admissionDate = getAdmissionDate(), other$admissionDate = other.getAdmissionDate();
		if ((this$admissionDate == null) ? (other$admissionDate != null)
				: !this$admissionDate.equals(other$admissionDate))
			return false;
		Object this$caseType = getCaseType(), other$caseType = other.getCaseType();
		if ((this$caseType == null) ? (other$caseType != null) : !this$caseType.equals(other$caseType))
			return false;
		Object this$casuality = getCasuality(), other$casuality = other.getCasuality();
		if ((this$casuality == null) ? (other$casuality != null) : !this$casuality.equals(other$casuality))
			return false;
		Object this$oldPatient = getOldPatient(), other$oldPatient = other.getOldPatient();
		if ((this$oldPatient == null) ? (other$oldPatient != null) : !this$oldPatient.equals(other$oldPatient))
			return false;
		if (getTpa() != other.getTpa())
			return false;
		Object this$reference = getReference(), other$reference = other.getReference();
		if ((this$reference == null) ? (other$reference != null) : !this$reference.equals(other$reference))
			return false;
		Object this$doctorId = getDoctorId(), other$doctorId = other.getDoctorId();
		if ((this$doctorId == null) ? (other$doctorId != null) : !this$doctorId.equals(other$doctorId))
			return false;
		Object this$doctorName = getDoctorName(), other$doctorName = other.getDoctorName();
		if ((this$doctorName == null) ? (other$doctorName != null) : !this$doctorName.equals(other$doctorName))
			return false;
		if (getBedNumber() != other.getBedNumber())
			return false;
		if (getDepartment() != other.getDepartment())
			return false;
		Object this$status = getStatus(), other$status = other.getStatus();
		return !((this$status == null) ? (other$status != null) : !this$status.equals(other$status));
	}

	protected boolean canEqual(Object other) {
		return other instanceof MyIpdmodal;
	}

	public String toString() {
		return "MyIpdmodal(ipdId=" + getIpdId() + ", patientId=" + getPatientId() + ", height=" + getHeight()
				+ ", weight=" + getWeight() + ", bp=" + getBp() + ", symptoms=" + getSymptoms() + ", note=" + getNote()
				+ ", admissionDate=" + getAdmissionDate() + ", caseType=" + getCaseType() + ", casuality="
				+ getCasuality() + ", oldPatient=" + getOldPatient() + ", tpa=" + getTpa() + ", reference="
				+ getReference() + ", doctorId=" + getDoctorId() + ", doctorName=" + getDoctorName() + ", bedNumber="
				+ getBedNumber() + ", department=" + getDepartment() + ", status=" + getStatus() + ")";
	}

	public MyIpdmodal(String ipdId, String patientId, float height, float weight, float bp, String symptoms,
			String note, String admissionDate, String caseType, String casuality, String oldPatient, int tpa,
			String reference, String doctorId, String doctorName, int bedNumber, int department, String status) {
		/* 13 */ this.ipdId = ipdId;
		this.patientId = patientId;
		this.height = height;
		this.weight = weight;
		this.bp = bp;
		this.symptoms = symptoms;
		this.note = note;
		this.admissionDate = admissionDate;
		this.caseType = caseType;
		this.casuality = casuality;
		this.oldPatient = oldPatient;
		this.tpa = tpa;
		this.reference = reference;
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.bedNumber = bedNumber;
		this.department = department;
		this.status = status;
		/*    */ }

	/*    */
	/*    */ public MyIpdmodal() {
	}

	/*    */
	/* 18 */ public String getIpdId() {
		return this.ipdId;
	}

	/* 19 */ public String getPatientId() {
		return this.patientId;
	}

	/* 20 */ public float getHeight() {
		return this.height;
	}

	/* 21 */ public float getWeight() {
		return this.weight;
	}

	/* 22 */ public float getBp() {
		return this.bp;
	}

	/* 23 */ public String getSymptoms() {
		return this.symptoms;
	}

	/* 24 */ public String getNote() {
		return this.note;
	}

	/* 25 */ public String getAdmissionDate() {
		return this.admissionDate;
	}

	/* 26 */ public String getCaseType() {
		return this.caseType;
	}

	/* 27 */ public String getCasuality() {
		return this.casuality;
	}

	/* 28 */ public String getOldPatient() {
		return this.oldPatient;
	}

	/* 29 */ public int getTpa() {
		return this.tpa;
	}

	/* 30 */ public String getReference() {
		return this.reference;
	}

	/* 31 */ public String getDoctorId() {
		return this.doctorId;
	}

	/* 32 */ public String getDoctorName() {
		return this.doctorName;
	}

	public int getBedNumber() {
		/* 33 */ return this.bedNumber;
		/*    */ }

	/* 35 */ public int getDepartment() {
		return this.department;
	}

	public String getStatus() {
		/* 36 */ return this.status;
		/*    */ }

	public String getDischargeDate() {
		return dischargeDate;
	}

	public void setDischargeDate(String dischargeDate) {
		this.dischargeDate = dischargeDate;
	}
}

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\ipd\modal\
 * MyIpdmodal.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */