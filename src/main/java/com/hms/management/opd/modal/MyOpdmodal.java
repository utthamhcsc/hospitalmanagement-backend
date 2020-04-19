/*    */
package com.hms.management.opd.modal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */ @Entity
/*    */ @Table
/*    */ public class MyOpdmodal {
	@Id
	/*    */ private String opdId;
	private String patientId;
	private float height;
	private float weight;
	/*    */ private float bp;
	/*    */ private String symptoms;
	/*    */ private String note;
	/*    */ private String appointmentDate;
	/*    */ private String caseType;

	/*    */
	/* 12 */ public void setOpdId(String opdId) {
		this.opdId = opdId;
	}

	private String casuality;
	private String oldPatient;
	private int tpa;
	private String reference;
	private String doctorId;
	private String doctorName;
	private float standardCharge;
	private float appliedCharge;
	private String paymentMode;
	private int department;

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

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
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

	public void setStandardCharge(float standardCharge) {
		this.standardCharge = standardCharge;
	}

	public void setAppliedCharge(float appliedCharge) {
		this.appliedCharge = appliedCharge;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof MyOpdmodal))
			return false;
		MyOpdmodal other = (MyOpdmodal) o;
		if (!other.canEqual(this))
			return false;
		Object this$opdId = getOpdId(), other$opdId = other.getOpdId();
		if ((this$opdId == null) ? (other$opdId != null) : !this$opdId.equals(other$opdId))
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
		Object this$appointmentDate = getAppointmentDate(), other$appointmentDate = other.getAppointmentDate();
		if ((this$appointmentDate == null) ? (other$appointmentDate != null)
				: !this$appointmentDate.equals(other$appointmentDate))
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
		if (Float.compare(getStandardCharge(), other.getStandardCharge()) != 0)
			return false;
		if (Float.compare(getAppliedCharge(), other.getAppliedCharge()) != 0)
			return false;
		Object this$paymentMode = getPaymentMode(), other$paymentMode = other.getPaymentMode();
		return ((this$paymentMode == null) ? (other$paymentMode != null) : !this$paymentMode.equals(other$paymentMode))
				? false
				: (!(getDepartment() != other.getDepartment()));
	}

	protected boolean canEqual(Object other) {
		return other instanceof MyOpdmodal;
	}

	
	public String toString() {
		return "MyOpdmodal(opdId=" + getOpdId() + ", patientId=" + getPatientId() + ", height=" + getHeight()
				+ ", weight=" + getWeight() + ", bp=" + getBp() + ", symptoms=" + getSymptoms() + ", note=" + getNote()
				+ ", appointmentDate=" + getAppointmentDate() + ", caseType=" + getCaseType() + ", casuality="
				+ getCasuality() + ", oldPatient=" + getOldPatient() + ", tpa=" + getTpa() + ", reference="
				+ getReference() + ", doctorId=" + getDoctorId() + ", doctorName=" + getDoctorName()
				+ ", standardCharge=" + getStandardCharge() + ", appliedCharge=" + getAppliedCharge() + ", paymentMode="
				+ getPaymentMode() + ", department=" + getDepartment() + ")";
	}

	public MyOpdmodal(String opdId, String patientId, float height, float weight, float bp, String symptoms,
			String note, String appointmentDate, String caseType, String casuality, String oldPatient, int tpa,
			String reference, String doctorId, String doctorName, float standardCharge, float appliedCharge,
			String paymentMode, int department) {
		/* 13 */ this.opdId = opdId;
		this.patientId = patientId;
		this.height = height;
		this.weight = weight;
		this.bp = bp;
		this.symptoms = symptoms;
		this.note = note;
		this.appointmentDate = appointmentDate;
		this.caseType = caseType;
		this.casuality = casuality;
		this.oldPatient = oldPatient;
		this.tpa = tpa;
		this.reference = reference;
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.standardCharge = standardCharge;
		this.appliedCharge = appliedCharge;
		this.paymentMode = paymentMode;
		this.department = department;
		/*    */ }

	/*    */
	/*    */ public MyOpdmodal() {
	}

	/*    */
	/* 18 */ public String getOpdId() {
		return this.opdId;
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

	/* 25 */ public String getAppointmentDate() {
		return this.appointmentDate;
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

	/* 33 */ public float getStandardCharge() {
		return this.standardCharge;
	}

	/* 34 */ public float getAppliedCharge() {
		return this.appliedCharge;
	}

	/* 35 */ public String getPaymentMode() {
		return this.paymentMode;
	}

	public int getDepartment() {
		/* 36 */ return this.department;
		/*    */ }
}

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\opd\modal\
 * MyOpdmodal.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */