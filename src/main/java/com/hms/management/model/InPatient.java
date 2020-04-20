/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */ @Entity
/*    */ @Table(name = "InPatient")
/*    */ public class InPatient {
	@Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	private String patientId;
	private String ipdId;
	private String appointmentDate;
	private String doctorId;
	/*    */ private String caseType;
	/*    */ private String casulity;
	/*    */ private String symptoms;
	/*    */ private String bp;
	/*    */ private String oldPatient;

	/*    */
	/* 13 */ public void setId(int id) {
		this.id = id;
	}

	private String height;
	private String weight;
	private String tpa;
	private String doctorName;
	private String note;
	private String creditLimit;
	private String bedGroup;
	private String bedNumber;
	private String disChargeStatus;
	private String summer;
	private String disChargeDate;

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public void setIpdId(String ipdId) {
		this.ipdId = ipdId;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}

	public void setCasulity(String casulity) {
		this.casulity = casulity;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
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

	public void setNote(String note) {
		this.note = note;
	}

	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}

	public void setBedGroup(String bedGroup) {
		this.bedGroup = bedGroup;
	}

	public void setBedNumber(String bedNumber) {
		this.bedNumber = bedNumber;
	}

	public void setDisChargeStatus(String disChargeStatus) {
		this.disChargeStatus = disChargeStatus;
	}

	public void setSummer(String summer) {
		this.summer = summer;
	}

	public void setDisChargeDate(String disChargeDate) {
		this.disChargeDate = disChargeDate;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof InPatient))
			return false;
		InPatient other = (InPatient) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$patientId = getPatientId(), other$patientId = other.getPatientId();
		if ((this$patientId == null) ? (other$patientId != null) : !this$patientId.equals(other$patientId))
			return false;
		Object this$ipdId = getIpdId(), other$ipdId = other.getIpdId();
		if ((this$ipdId == null) ? (other$ipdId != null) : !this$ipdId.equals(other$ipdId))
			return false;
		Object this$appointmentDate = getAppointmentDate(), other$appointmentDate = other.getAppointmentDate();
		if ((this$appointmentDate == null) ? (other$appointmentDate != null)
				: !this$appointmentDate.equals(other$appointmentDate))
			return false;
		Object this$doctorId = getDoctorId(), other$doctorId = other.getDoctorId();
		if ((this$doctorId == null) ? (other$doctorId != null) : !this$doctorId.equals(other$doctorId))
			return false;
		Object this$caseType = getCaseType(), other$caseType = other.getCaseType();
		if ((this$caseType == null) ? (other$caseType != null) : !this$caseType.equals(other$caseType))
			return false;
		Object this$casulity = getCasulity(), other$casulity = other.getCasulity();
		if ((this$casulity == null) ? (other$casulity != null) : !this$casulity.equals(other$casulity))
			return false;
		Object this$symptoms = getSymptoms(), other$symptoms = other.getSymptoms();
		if ((this$symptoms == null) ? (other$symptoms != null) : !this$symptoms.equals(other$symptoms))
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
		Object this$note = getNote(), other$note = other.getNote();
		if ((this$note == null) ? (other$note != null) : !this$note.equals(other$note))
			return false;
		Object this$creditLimit = getCreditLimit(), other$creditLimit = other.getCreditLimit();
		if ((this$creditLimit == null) ? (other$creditLimit != null) : !this$creditLimit.equals(other$creditLimit))
			return false;
		Object this$bedGroup = getBedGroup(), other$bedGroup = other.getBedGroup();
		if ((this$bedGroup == null) ? (other$bedGroup != null) : !this$bedGroup.equals(other$bedGroup))
			return false;
		Object this$bedNumber = getBedNumber(), other$bedNumber = other.getBedNumber();
		if ((this$bedNumber == null) ? (other$bedNumber != null) : !this$bedNumber.equals(other$bedNumber))
			return false;
		Object this$disChargeStatus = getDisChargeStatus(), other$disChargeStatus = other.getDisChargeStatus();
		if ((this$disChargeStatus == null) ? (other$disChargeStatus != null)
				: !this$disChargeStatus.equals(other$disChargeStatus))
			return false;
		Object this$summer = getSummer(), other$summer = other.getSummer();
		if ((this$summer == null) ? (other$summer != null) : !this$summer.equals(other$summer))
			return false;
		Object this$disChargeDate = getDisChargeDate(), other$disChargeDate = other.getDisChargeDate();
		return !((this$disChargeDate == null) ? (other$disChargeDate != null)
				: !this$disChargeDate.equals(other$disChargeDate));
	}

	protected boolean canEqual(Object other) {
		return other instanceof InPatient;
	}


	public String toString() {
		return "InPatient(id=" + getId() + ", patientId=" + getPatientId() + ", ipdId=" + getIpdId()
				+ ", appointmentDate=" + getAppointmentDate() + ", doctorId=" + getDoctorId() + ", caseType="
				+ getCaseType() + ", casulity=" + getCasulity() + ", symptoms=" + getSymptoms() + ", bp=" + getBp()
				+ ", oldPatient=" + getOldPatient() + ", height=" + getHeight() + ", weight=" + getWeight() + ", tpa="
				+ getTpa() + ", doctorName=" + getDoctorName() + ", note=" + getNote() + ", creditLimit="
				+ getCreditLimit() + ", bedGroup=" + getBedGroup() + ", bedNumber=" + getBedNumber()
				+ ", disChargeStatus=" + getDisChargeStatus() + ", summer=" + getSummer() + ", disChargeDate="
				+ getDisChargeDate() + ")";
	}

	public InPatient(int id, String patientId, String ipdId, String appointmentDate, String doctorId, String caseType,
			String casulity, String symptoms, String bp, String oldPatient, String height, String weight, String tpa,
			String doctorName, String note, String creditLimit, String bedGroup, String bedNumber,
			String disChargeStatus, String summer, String disChargeDate) {
		/* 14 */ this.id = id;
		this.patientId = patientId;
		this.ipdId = ipdId;
		this.appointmentDate = appointmentDate;
		this.doctorId = doctorId;
		this.caseType = caseType;
		this.casulity = casulity;
		this.symptoms = symptoms;
		this.bp = bp;
		this.oldPatient = oldPatient;
		this.height = height;
		this.weight = weight;
		this.tpa = tpa;
		this.doctorName = doctorName;
		this.note = note;
		this.creditLimit = creditLimit;
		this.bedGroup = bedGroup;
		this.bedNumber = bedNumber;
		this.disChargeStatus = disChargeStatus;
		this.summer = summer;
		this.disChargeDate = disChargeDate;
		/*    */ }

	/*    */
	/*    */
	/*    */
	/*    */ public InPatient() {
	}

	/*    */
	/*    */
	/*    */ public int getId() {
		/* 23 */ return this.id;
		/* 24 */ }

	public String getPatientId() {
		return this.patientId;
	}

	/* 25 */ public String getIpdId() {
		return this.ipdId;
	}

	/* 26 */ public String getAppointmentDate() {
		return this.appointmentDate;
	}

	/* 27 */ public String getDoctorId() {
		return this.doctorId;
	}

	/* 28 */ public String getCaseType() {
		return this.caseType;
	}

	/* 29 */ public String getCasulity() {
		return this.casulity;
	}

	/* 30 */ public String getSymptoms() {
		return this.symptoms;
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

	/* 37 */ public String getNote() {
		return this.note;
	}

	/* 38 */ public String getCreditLimit() {
		return this.creditLimit;
	}

	/* 39 */ public String getBedGroup() {
		return this.bedGroup;
	}

	public String getBedNumber() {
		/* 40 */ return this.bedNumber;
		/*    */ }

	/* 42 */ public String getDisChargeStatus() {
		return this.disChargeStatus;
	}

	/* 43 */ public String getSummer() {
		return this.summer;
	}

	public String getDisChargeDate() {
		/* 44 */ return this.disChargeDate;
		/*    */ }
}

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\InPatient.
 * class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */