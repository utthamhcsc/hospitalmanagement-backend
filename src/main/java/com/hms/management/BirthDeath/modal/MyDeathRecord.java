package com.hms.management.BirthDeath.modal;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class MyDeathRecord {
	
	@Id
	@GeneratedValue
	private int id;
	private String patientId;
	@Temporal(TemporalType.DATE)
	  private Date deathDate;
	  private String guardianName;
	  private String ipdopdNo;
	  private String report;
	  private String receiverName;
	public MyDeathRecord(int id, String patientId, Date deathDate, String guardianName, String ipdopdNo, String report,
			String receiverName) {
		super();
		this.id = id;
		this.patientId = patientId;
		this.deathDate = deathDate;
		this.guardianName = guardianName;
		this.ipdopdNo = ipdopdNo;
		this.report = report;
		this.receiverName = receiverName;
	}
	public MyDeathRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public Date getDeathDate() {
		return deathDate;
	}
	public void setDeathDate(Date deathDate) {
		this.deathDate = deathDate;
	}
	public String getGuardianName() {
		return guardianName;
	}
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}
	public String getIpdopdNo() {
		return ipdopdNo;
	}
	public void setIpdopdNo(String ipdopdNo) {
		this.ipdopdNo = ipdopdNo;
	}
	public String getReport() {
		return report;
	}
	public void setReport(String report) {
		this.report = report;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

}
