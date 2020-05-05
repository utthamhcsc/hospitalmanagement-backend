package com.hms.management.operationteacter.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class OperationTheater {
	
	@Id
	@GeneratedValue
	private int id;
	private String patientId;
	private String operationName;
	private String operationType;
	private String operationDate;
	private String doctorId;
	private String assistantConsultant1;
	private String assistantConsultant2;
	private String anasthesist;
	private String anasthesistType;
	private String otTechnician;
	private String otAssistant;
	private int tpaId;
	private String chargeCategory;
	private String code;
	private float standardCharge;
	private float appliedCharge;
	private String note;
	private float weight;
	private float height;
	private float bp;
	private String symptoms;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getOperationName() {
		return operationName;
	}
	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}
	public String getOperationType() {
		return operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}
	public String getOperationDate() {
		return operationDate;
	}
	public void setOperationDate(String operationDate) {
		this.operationDate = operationDate;
	}
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getAssistantConsultant1() {
		return assistantConsultant1;
	}
	public void setAssistantConsultant1(String assistantConsultant1) {
		this.assistantConsultant1 = assistantConsultant1;
	}
	public String getAssistantConsultant2() {
		return assistantConsultant2;
	}
	public void setAssistantConsultant2(String assistantConsultant2) {
		this.assistantConsultant2 = assistantConsultant2;
	}
	public String getAnasthesist() {
		return anasthesist;
	}
	public void setAnasthesist(String anasthesist) {
		this.anasthesist = anasthesist;
	}
	public String getAnasthesistType() {
		return anasthesistType;
	}
	public void setAnasthesistType(String anasthesistType) {
		this.anasthesistType = anasthesistType;
	}
	public String getOtTechnician() {
		return otTechnician;
	}
	public void setOtTechnician(String otTechnician) {
		this.otTechnician = otTechnician;
	}
	public String getOtAssistant() {
		return otAssistant;
	}
	public void setOtAssistant(String otAssistant) {
		this.otAssistant = otAssistant;
	}
	public int getTpaId() {
		return tpaId;
	}
	public void setTpaId(int tpaId) {
		this.tpaId = tpaId;
	}
	public String getChargeCategory() {
		return chargeCategory;
	}
	public void setChargeCategory(String chargeCategory) {
		this.chargeCategory = chargeCategory;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public float getStandardCharge() {
		return standardCharge;
	}
	public void setStandardCharge(float standardCharge) {
		this.standardCharge = standardCharge;
	}
	public float getAppliedCharge() {
		return appliedCharge;
	}
	public void setAppliedCharge(float appliedCharge) {
		this.appliedCharge = appliedCharge;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getBp() {
		return bp;
	}
	public void setBp(float bp) {
		this.bp = bp;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		symptoms = symptoms;
	}
	public OperationTheater(int id, String patientId, String operationName, String operationType, String operationDate,
			String doctorId, String assistantConsultant1, String assistantConsultant2, String anasthesist,
			String anasthesistType, String otTechnician, String otAssistant, int tpaId, String chargeCategory,
			String code, float standardCharge, float appliedCharge, String note, float weight, float height, float bp,
			String symptoms) {
		super();
		this.id = id;
		this.patientId = patientId;
		this.operationName = operationName;
		this.operationType = operationType;
		this.operationDate = operationDate;
		this.doctorId = doctorId;
		this.assistantConsultant1 = assistantConsultant1;
		this.assistantConsultant2 = assistantConsultant2;
		this.anasthesist = anasthesist;
		this.anasthesistType = anasthesistType;
		this.otTechnician = otTechnician;
		this.otAssistant = otAssistant;
		this.tpaId = tpaId;
		this.chargeCategory = chargeCategory;
		this.code = code;
		this.standardCharge = standardCharge;
		this.appliedCharge = appliedCharge;
		this.note = note;
		this.weight = weight;
		this.height = height;
		this.bp = bp;
		symptoms = symptoms;
	}
	public OperationTheater() {
		super();
		// TODO Auto-generated constructor stub
	}

}
