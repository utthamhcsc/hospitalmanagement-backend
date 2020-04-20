/*    */
package com.hms.management.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */ @Entity
/*    */ @Table(name = "OperationTheatre")
/*    */ public class OperationTheatre {
	@Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	private int patientId;
	private String operationName;
	private String operationDate;
	private String operationType;
	/*    */ private String patientName;
	/*    */ private String consultantDoctor;
	/*    */ private String assConsultant1;
	/*    */ private String assConsultant2;
	/*    */ private String anesthetist;
	/*    */ private String anesthetistType;
	/*    */ private String otTechnician;
	/*    */ private String otAssistant;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String tpa;
	private String action;
	private String selectCtegory;
	private String code;
	private String standardCharge;
	private String appliedCharge;
	private String height;
	private String weight;
	private String bp;
	private String note;
	private String symptoms;
	private Date createdAt;
	private Date updatedAt;

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

	public void setOperationDate(String operationDate) {
		this.operationDate = operationDate;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public void setConsultantDoctor(String consultantDoctor) {
		this.consultantDoctor = consultantDoctor;
	}

	public void setAssConsultant1(String assConsultant1) {
		this.assConsultant1 = assConsultant1;
	}

	public void setAssConsultant2(String assConsultant2) {
		this.assConsultant2 = assConsultant2;
	}

	public void setAnesthetist(String anesthetist) {
		this.anesthetist = anesthetist;
	}

	public void setAnesthetistType(String anesthetistType) {
		this.anesthetistType = anesthetistType;
	}

	public void setOtTechnician(String otTechnician) {
		this.otTechnician = otTechnician;
	}

	public void setOtAssistant(String otAssistant) {
		this.otAssistant = otAssistant;
	}

	public void setTpa(String tpa) {
		this.tpa = tpa;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public void setSelectCtegory(String selectCtegory) {
		this.selectCtegory = selectCtegory;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setStandardCharge(String standardCharge) {
		this.standardCharge = standardCharge;
	}

	public void setAppliedCharge(String appliedCharge) {
		this.appliedCharge = appliedCharge;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public void setBp(String bp) {
		this.bp = bp;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof OperationTheatre))
			return false;
		OperationTheatre other = (OperationTheatre) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getPatientId() != other.getPatientId())
			return false;
		Object this$operationName = getOperationName(), other$operationName = other.getOperationName();
		if ((this$operationName == null) ? (other$operationName != null)
				: !this$operationName.equals(other$operationName))
			return false;
		Object this$operationDate = getOperationDate(), other$operationDate = other.getOperationDate();
		if ((this$operationDate == null) ? (other$operationDate != null)
				: !this$operationDate.equals(other$operationDate))
			return false;
		Object this$operationType = getOperationType(), other$operationType = other.getOperationType();
		if ((this$operationType == null) ? (other$operationType != null)
				: !this$operationType.equals(other$operationType))
			return false;
		Object this$patientName = getPatientName(), other$patientName = other.getPatientName();
		if ((this$patientName == null) ? (other$patientName != null) : !this$patientName.equals(other$patientName))
			return false;
		Object this$consultantDoctor = getConsultantDoctor(), other$consultantDoctor = other.getConsultantDoctor();
		if ((this$consultantDoctor == null) ? (other$consultantDoctor != null)
				: !this$consultantDoctor.equals(other$consultantDoctor))
			return false;
		Object this$assConsultant1 = getAssConsultant1(), other$assConsultant1 = other.getAssConsultant1();
		if ((this$assConsultant1 == null) ? (other$assConsultant1 != null)
				: !this$assConsultant1.equals(other$assConsultant1))
			return false;
		Object this$assConsultant2 = getAssConsultant2(), other$assConsultant2 = other.getAssConsultant2();
		if ((this$assConsultant2 == null) ? (other$assConsultant2 != null)
				: !this$assConsultant2.equals(other$assConsultant2))
			return false;
		Object this$anesthetist = getAnesthetist(), other$anesthetist = other.getAnesthetist();
		if ((this$anesthetist == null) ? (other$anesthetist != null) : !this$anesthetist.equals(other$anesthetist))
			return false;
		Object this$anesthetistType = getAnesthetistType(), other$anesthetistType = other.getAnesthetistType();
		if ((this$anesthetistType == null) ? (other$anesthetistType != null)
				: !this$anesthetistType.equals(other$anesthetistType))
			return false;
		Object this$otTechnician = getOtTechnician(), other$otTechnician = other.getOtTechnician();
		if ((this$otTechnician == null) ? (other$otTechnician != null) : !this$otTechnician.equals(other$otTechnician))
			return false;
		Object this$otAssistant = getOtAssistant(), other$otAssistant = other.getOtAssistant();
		if ((this$otAssistant == null) ? (other$otAssistant != null) : !this$otAssistant.equals(other$otAssistant))
			return false;
		Object this$tpa = getTpa(), other$tpa = other.getTpa();
		if ((this$tpa == null) ? (other$tpa != null) : !this$tpa.equals(other$tpa))
			return false;
		Object this$action = getAction(), other$action = other.getAction();
		if ((this$action == null) ? (other$action != null) : !this$action.equals(other$action))
			return false;
		Object this$selectCtegory = getSelectCtegory(), other$selectCtegory = other.getSelectCtegory();
		if ((this$selectCtegory == null) ? (other$selectCtegory != null)
				: !this$selectCtegory.equals(other$selectCtegory))
			return false;
		Object this$code = getCode(), other$code = other.getCode();
		if ((this$code == null) ? (other$code != null) : !this$code.equals(other$code))
			return false;
		Object this$standardCharge = getStandardCharge(), other$standardCharge = other.getStandardCharge();
		if ((this$standardCharge == null) ? (other$standardCharge != null)
				: !this$standardCharge.equals(other$standardCharge))
			return false;
		Object this$appliedCharge = getAppliedCharge(), other$appliedCharge = other.getAppliedCharge();
		if ((this$appliedCharge == null) ? (other$appliedCharge != null)
				: !this$appliedCharge.equals(other$appliedCharge))
			return false;
		Object this$height = getHeight(), other$height = other.getHeight();
		if ((this$height == null) ? (other$height != null) : !this$height.equals(other$height))
			return false;
		Object this$weight = getWeight(), other$weight = other.getWeight();
		if ((this$weight == null) ? (other$weight != null) : !this$weight.equals(other$weight))
			return false;
		Object this$bp = getBp(), other$bp = other.getBp();
		if ((this$bp == null) ? (other$bp != null) : !this$bp.equals(other$bp))
			return false;
		Object this$note = getNote(), other$note = other.getNote();
		if ((this$note == null) ? (other$note != null) : !this$note.equals(other$note))
			return false;
		Object this$symptoms = getSymptoms(), other$symptoms = other.getSymptoms();
		if ((this$symptoms == null) ? (other$symptoms != null) : !this$symptoms.equals(other$symptoms))
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		if ((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt))
			return false;
		Object this$updatedAt = getUpdatedAt(), other$updatedAt = other.getUpdatedAt();
		return !((this$updatedAt == null) ? (other$updatedAt != null) : !this$updatedAt.equals(other$updatedAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof OperationTheatre;
	}

	
	public String toString() {
		return "OperationTheatre(id=" + getId() + ", patientId=" + getPatientId() + ", operationName="
				+ getOperationName() + ", operationDate=" + getOperationDate() + ", operationType=" + getOperationType()
				+ ", patientName=" + getPatientName() + ", consultantDoctor=" + getConsultantDoctor()
				+ ", assConsultant1=" + getAssConsultant1() + ", assConsultant2=" + getAssConsultant2()
				+ ", anesthetist=" + getAnesthetist() + ", anesthetistType=" + getAnesthetistType() + ", otTechnician="
				+ getOtTechnician() + ", otAssistant=" + getOtAssistant() + ", tpa=" + getTpa() + ", action="
				+ getAction() + ", selectCtegory=" + getSelectCtegory() + ", code=" + getCode() + ", standardCharge="
				+ getStandardCharge() + ", appliedCharge=" + getAppliedCharge() + ", height=" + getHeight()
				+ ", weight=" + getWeight() + ", bp=" + getBp() + ", note=" + getNote() + ", symptoms=" + getSymptoms()
				+ ", createdAt=" + getCreatedAt() + ", updatedAt=" + getUpdatedAt() + ")";
	}

	public OperationTheatre(int id, int patientId, String operationName, String operationDate, String operationType,
			String patientName, String consultantDoctor, String assConsultant1, String assConsultant2,
			String anesthetist, String anesthetistType, String otTechnician, String otAssistant, String tpa,
			String action, String selectCtegory, String code, String standardCharge, String appliedCharge,
			String height, String weight, String bp, String note, String symptoms, Date createdAt, Date updatedAt) {
		/* 17 */ this.id = id;
		this.patientId = patientId;
		this.operationName = operationName;
		this.operationDate = operationDate;
		this.operationType = operationType;
		this.patientName = patientName;
		this.consultantDoctor = consultantDoctor;
		this.assConsultant1 = assConsultant1;
		this.assConsultant2 = assConsultant2;
		this.anesthetist = anesthetist;
		this.anesthetistType = anesthetistType;
		this.otTechnician = otTechnician;
		this.otAssistant = otAssistant;
		this.tpa = tpa;
		this.action = action;
		this.selectCtegory = selectCtegory;
		this.code = code;
		this.standardCharge = standardCharge;
		this.appliedCharge = appliedCharge;
		this.height = height;
		this.weight = weight;
		this.bp = bp;
		this.note = note;
		this.symptoms = symptoms;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		/*    */ }

	/*    */
	/*    */
	/*    */ public OperationTheatre() {
	}

	/*    */
	/*    */
	/*    */ public int getId() {
		/* 25 */ return this.id;
		/* 26 */ }

	public int getPatientId() {
		return this.patientId;
	}

	/* 27 */ public String getOperationName() {
		return this.operationName;
	}

	/* 28 */ public String getOperationDate() {
		return this.operationDate;
	}

	/* 29 */ public String getOperationType() {
		return this.operationType;
	}

	/* 30 */ public String getPatientName() {
		return this.patientName;
	}

	/* 31 */ public String getConsultantDoctor() {
		return this.consultantDoctor;
	}

	/* 32 */ public String getAssConsultant1() {
		return this.assConsultant1;
	}

	/* 33 */ public String getAssConsultant2() {
		return this.assConsultant2;
	}

	/* 34 */ public String getAnesthetist() {
		return this.anesthetist;
	}

	/* 35 */ public String getAnesthetistType() {
		return this.anesthetistType;
	}

	/* 36 */ public String getOtTechnician() {
		return this.otTechnician;
	}

	/* 37 */ public String getOtAssistant() {
		return this.otAssistant;
	}

	/* 38 */ public String getTpa() {
		return this.tpa;
	}

	/* 39 */ public String getAction() {
		return this.action;
	}

	/* 40 */ public String getSelectCtegory() {
		return this.selectCtegory;
	}

	/* 41 */ public String getCode() {
		return this.code;
	}

	/* 42 */ public String getStandardCharge() {
		return this.standardCharge;
	}

	/* 43 */ public String getAppliedCharge() {
		return this.appliedCharge;
	}

	/* 44 */ public String getHeight() {
		return this.height;
	}

	/* 45 */ public String getWeight() {
		return this.weight;
	}

	/* 46 */ public String getBp() {
		return this.bp;
	}

	/* 47 */ public String getNote() {
		return this.note;
	}

	/* 48 */ public String getSymptoms() {
		return this.symptoms;
	}

	/* 49 */ public Date getCreatedAt() {
		return this.createdAt;
	}

	public Date getUpdatedAt() {
		/* 50 */ return this.updatedAt;
		/*    */ }
}

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * OperationTheatre.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */