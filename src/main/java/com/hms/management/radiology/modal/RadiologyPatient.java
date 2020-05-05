package com.hms.management.radiology.modal;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table
public class RadiologyPatient {
	
	@Id
	@GeneratedValue
	private int id;
	private String testReport;
	  private String patientId;
	  private String doctorId;
	  private String code;
	  private float appliedCharge;
	  private float standardCharge;
	  private String chargeCategory;
	  private int radiologyId;
	  private String description;
	
	  @Temporal(TemporalType.DATE)
	  private Date date;
	public RadiologyPatient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RadiologyPatient(int id, String testReport, String patientId, String doctorId, String code,
			float appliedCharge, float standardCharge, String chargeCategory, int radiologyId, String description,
			Date date) {
		super();
		this.id = id;
		this.testReport = testReport;
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.code = code;
		this.appliedCharge = appliedCharge;
		this.standardCharge = standardCharge;
		this.chargeCategory = chargeCategory;
		this.radiologyId = radiologyId;
		this.description = description;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTestReport() {
		return testReport;
	}
	public void setTestReport(String testReport) {
		this.testReport = testReport;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public float getAppliedCharge() {
		return appliedCharge;
	}
	public void setAppliedCharge(float appliedCharge) {
		this.appliedCharge = appliedCharge;
	}
	public float getStandardCharge() {
		return standardCharge;
	}
	public void setStandardCharge(float standardCharge) {
		this.standardCharge = standardCharge;
	}
	public String getChargeCategory() {
		return chargeCategory;
	}
	public void setChargeCategory(String chargeCategory) {
		this.chargeCategory = chargeCategory;
	}
	public int getradiologyId() {
		return radiologyId;
	}
	public void setradiologyId(int radiologyId) {
		this.radiologyId = radiologyId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
