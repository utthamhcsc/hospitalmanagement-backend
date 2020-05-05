package com.hms.management.BloodBank.modal;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class BloodIssue {
	
	@Id
	@GeneratedValue
	private int id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date issueDate;
	private String patientId;
	private String doctorId;
	private String doctorName;
	private String technician; 
	private int donorId;
	private String bloodGroup;
	private String lot;
	private String bagNo;
	private String remarks;
	private float amount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
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
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getTechnician() {
		return technician;
	}
	public void setTechnician(String technician) {
		this.technician = technician;
	}
	public int getDonorId() {
		return donorId;
	}
	public void setDonorId(int donorId) {
		this.donorId = donorId;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getLot() {
		return lot;
	}
	public void setLot(String lot) {
		this.lot = lot;
	}
	public String getBagNo() {
		return bagNo;
	}
	public void setBagNo(String bagNo) {
		this.bagNo = bagNo;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public BloodIssue(int id, Date issueDate, String patientId, String doctorId, String doctorName, String technician,
			int donorId, String bloodGroup, String lot, String bagNo, String remarks, float amount) {
		super();
		this.id = id;
		this.issueDate = issueDate;
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.technician = technician;
		this.donorId = donorId;
		this.bloodGroup = bloodGroup;
		this.lot = lot;
		this.bagNo = bagNo;
		this.remarks = remarks;
		this.amount = amount;
	}
	public BloodIssue() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
