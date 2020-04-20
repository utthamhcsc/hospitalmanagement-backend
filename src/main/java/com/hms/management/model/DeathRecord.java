/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */ @Entity
/*    */ @Table(name = "DeathRecord")
/*    */ public class DeathRecord {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String PatientName;
	/*    */ private String ipdOrOpdNo;

	/*    */
	/*    */ public DeathRecord(int id, String PatientName, String ipdOrOpdNo, String deathDate, String guardianName,
			String report, String recieverName) {
		/* 12 */ this.id = id;
		this.PatientName = PatientName;
		this.ipdOrOpdNo = ipdOrOpdNo;
		this.deathDate = deathDate;
		this.guardianName = guardianName;
		this.report = report;
		this.recieverName = recieverName;
		/*    */ }

	private String deathDate;
	private String guardianName;
	private String report;
	private String recieverName;

	public DeathRecord() {
	}

	public void setId(int id) {
		/* 14 */ this.id = id;
	}

	public void setPatientName(String PatientName) {
		this.PatientName = PatientName;
	}

	public void setIpdOrOpdNo(String ipdOrOpdNo) {
		this.ipdOrOpdNo = ipdOrOpdNo;
	}

	public void setDeathDate(String deathDate) {
		this.deathDate = deathDate;
	}

	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

	public void setReport(String report) {
		this.report = report;
	}

	public void setRecieverName(String recieverName) {
		this.recieverName = recieverName;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof DeathRecord))
			return false;
		DeathRecord other = (DeathRecord) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$PatientName = getPatientName(), other$PatientName = other.getPatientName();
		if ((this$PatientName == null) ? (other$PatientName != null) : !this$PatientName.equals(other$PatientName))
			return false;
		Object this$ipdOrOpdNo = getIpdOrOpdNo(), other$ipdOrOpdNo = other.getIpdOrOpdNo();
		if ((this$ipdOrOpdNo == null) ? (other$ipdOrOpdNo != null) : !this$ipdOrOpdNo.equals(other$ipdOrOpdNo))
			return false;
		Object this$deathDate = getDeathDate(), other$deathDate = other.getDeathDate();
		if ((this$deathDate == null) ? (other$deathDate != null) : !this$deathDate.equals(other$deathDate))
			return false;
		Object this$guardianName = getGuardianName(), other$guardianName = other.getGuardianName();
		if ((this$guardianName == null) ? (other$guardianName != null) : !this$guardianName.equals(other$guardianName))
			return false;
		Object this$report = getReport(), other$report = other.getReport();
		if ((this$report == null) ? (other$report != null) : !this$report.equals(other$report))
			return false;
		Object this$recieverName = getRecieverName(), other$recieverName = other.getRecieverName();
		return !((this$recieverName == null) ? (other$recieverName != null)
				: !this$recieverName.equals(other$recieverName));
	}

	protected boolean canEqual(Object other) {
		return other instanceof DeathRecord;
	}

	

	public String toString() {
		return "DeathRecord(id=" + getId() + ", PatientName=" + getPatientName() + ", ipdOrOpdNo=" + getIpdOrOpdNo()
				+ ", deathDate=" + getDeathDate() + ", guardianName=" + getGuardianName() + ", report=" + getReport()
				+ ", recieverName=" + getRecieverName() + ")";
	}

	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */ public int getId() {
		/* 22 */ return this.id;
		/* 23 */ }

	public String getPatientName() {
		return this.PatientName;
	}

	/* 24 */ public String getIpdOrOpdNo() {
		return this.ipdOrOpdNo;
	}

	/* 25 */ public String getDeathDate() {
		return this.deathDate;
	}

	/* 26 */ public String getGuardianName() {
		return this.guardianName;
	}

	/* 27 */ public String getReport() {
		return this.report;
	}

	public String getRecieverName() {
		/* 28 */ return this.recieverName;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * DeathRecord.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */