/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */ @Entity
/*    */ @Table(name = "OpdDetail")
/*    */ public class OpdOutPatient {
	@Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	private String patientId;
	private String name;
	/*    */ private String opdId;
	/*    */ private String doctorId;
	/*    */ private String appointmentDate;
	/*    */ private String caseType;
	/*    */ private String casuality;
	/*    */ private String Symptoms;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String bp;
	private String oldPatient;
	private String height;
	private String weight;
	private String tpa;
	private String doctorName;
	private String standardCharge;
	private String appliedCharge;
	private String paymentMode;
	private String note;

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOpdId(String opdId) {
		this.opdId = opdId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
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

	public void setSymptoms(String Symptoms) {
		this.Symptoms = Symptoms;
	}

	public void setBp(String bp) {
		this.bp = bp;
	}

	public void setOldPatient(String oldPatient) {
		this.oldPatient = oldPatient;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public void setTpa(String tpa) {
		this.tpa = tpa;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public void setStandardCharge(String standardCharge) {
		this.standardCharge = standardCharge;
	}

	public void setAppliedCharge(String appliedCharge) {
		this.appliedCharge = appliedCharge;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof OpdOutPatient))
			return false;
		OpdOutPatient other = (OpdOutPatient) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$patientId = getPatientId(), other$patientId = other.getPatientId();
		if ((this$patientId == null) ? (other$patientId != null) : !this$patientId.equals(other$patientId))
			return false;
		Object this$name = getName(), other$name = other.getName();
		if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name))
			return false;
		Object this$opdId = getOpdId(), other$opdId = other.getOpdId();
		if ((this$opdId == null) ? (other$opdId != null) : !this$opdId.equals(other$opdId))
			return false;
		Object this$doctorId = getDoctorId(), other$doctorId = other.getDoctorId();
		if ((this$doctorId == null) ? (other$doctorId != null) : !this$doctorId.equals(other$doctorId))
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
		Object this$Symptoms = getSymptoms(), other$Symptoms = other.getSymptoms();
		if ((this$Symptoms == null) ? (other$Symptoms != null) : !this$Symptoms.equals(other$Symptoms))
			return false;
		Object this$bp = getBp(), other$bp = other.getBp();
		if ((this$bp == null) ? (other$bp != null) : !this$bp.equals(other$bp))
			return false;
		Object this$oldPatient = getOldPatient(), other$oldPatient = other.getOldPatient();
		if ((this$oldPatient == null) ? (other$oldPatient != null) : !this$oldPatient.equals(other$oldPatient))
			return false;
		Object this$height = getHeight(), other$height = other.getHeight();
		if ((this$height == null) ? (other$height != null) : !this$height.equals(other$height))
			return false;
		Object this$weight = getWeight(), other$weight = other.getWeight();
		if ((this$weight == null) ? (other$weight != null) : !this$weight.equals(other$weight))
			return false;
		Object this$tpa = getTpa(), other$tpa = other.getTpa();
		if ((this$tpa == null) ? (other$tpa != null) : !this$tpa.equals(other$tpa))
			return false;
		Object this$doctorName = getDoctorName(), other$doctorName = other.getDoctorName();
		if ((this$doctorName == null) ? (other$doctorName != null) : !this$doctorName.equals(other$doctorName))
			return false;
		Object this$standardCharge = getStandardCharge(), other$standardCharge = other.getStandardCharge();
		if ((this$standardCharge == null) ? (other$standardCharge != null)
				: !this$standardCharge.equals(other$standardCharge))
			return false;
		Object this$appliedCharge = getAppliedCharge(), other$appliedCharge = other.getAppliedCharge();
		if ((this$appliedCharge == null) ? (other$appliedCharge != null)
				: !this$appliedCharge.equals(other$appliedCharge))
			return false;
		Object this$paymentMode = getPaymentMode(), other$paymentMode = other.getPaymentMode();
		if ((this$paymentMode == null) ? (other$paymentMode != null) : !this$paymentMode.equals(other$paymentMode))
			return false;
		Object this$note = getNote(), other$note = other.getNote();
		return !((this$note == null) ? (other$note != null) : !this$note.equals(other$note));
	}

	protected boolean canEqual(Object other) {
		return other instanceof OpdOutPatient;
	}

	public String toString() {
		return "OpdOutPatient(id=" + getId() + ", patientId=" + getPatientId() + ", name=" + getName() + ", opdId="
				+ getOpdId() + ", doctorId=" + getDoctorId() + ", appointmentDate=" + getAppointmentDate()
				+ ", caseType=" + getCaseType() + ", casuality=" + getCasuality() + ", Symptoms=" + getSymptoms()
				+ ", bp=" + getBp() + ", oldPatient=" + getOldPatient() + ", height=" + getHeight() + ", weight="
				+ getWeight() + ", tpa=" + getTpa() + ", doctorName=" + getDoctorName() + ", standardCharge="
				+ getStandardCharge() + ", appliedCharge=" + getAppliedCharge() + ", paymentMode=" + getPaymentMode()
				+ ", note=" + getNote() + ")";
	}

	public OpdOutPatient(int id, String patientId, String name, String opdId, String doctorId, String appointmentDate,
			String caseType, String casuality, String Symptoms, String bp, String oldPatient, String height,
			String weight, String tpa, String doctorName, String standardCharge, String appliedCharge,
			String paymentMode, String note) {
		/* 15 */ this.id = id;
		this.patientId = patientId;
		this.name = name;
		this.opdId = opdId;
		this.doctorId = doctorId;
		this.appointmentDate = appointmentDate;
		this.caseType = caseType;
		this.casuality = casuality;
		this.Symptoms = Symptoms;
		this.bp = bp;
		this.oldPatient = oldPatient;
		this.height = height;
		this.weight = weight;
		this.tpa = tpa;
		this.doctorName = doctorName;
		this.standardCharge = standardCharge;
		this.appliedCharge = appliedCharge;
		this.paymentMode = paymentMode;
		this.note = note;
		/*    */ }

	/*    */
	/*    */ public OpdOutPatient() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 22 */ return this.id;
		/* 23 */ }

	public String getPatientId() {
		return this.patientId;
	}

	/* 24 */ public String getName() {
		return this.name;
	}

	/* 25 */ public String getOpdId() {
		return this.opdId;
	}

	/* 26 */ public String getDoctorId() {
		return this.doctorId;
	}

	/* 27 */ public String getAppointmentDate() {
		return this.appointmentDate;
	}

	/* 28 */ public String getCaseType() {
		return this.caseType;
	}

	/* 29 */ public String getCasuality() {
		return this.casuality;
	}

	/* 30 */ public String getSymptoms() {
		return this.Symptoms;
	}

	/* 31 */ public String getBp() {
		return this.bp;
	}

	/* 32 */ public String getOldPatient() {
		return this.oldPatient;
	}

	/* 33 */ public String getHeight() {
		return this.height;
	}

	/* 34 */ public String getWeight() {
		return this.weight;
	}

	/* 35 */ public String getTpa() {
		return this.tpa;
	}

	/* 36 */ public String getDoctorName() {
		return this.doctorName;
	}

	/* 37 */ public String getStandardCharge() {
		return this.standardCharge;
	}

	/* 38 */ public String getAppliedCharge() {
		return this.appliedCharge;
	}

	/* 39 */ public String getPaymentMode() {
		return this.paymentMode;
	}

	public String getNote() {
		/* 40 */ return this.note;
		/*    */ }
}

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * OpdOutPatient.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */