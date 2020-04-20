/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */
/*    */ @Entity
/*    */ @Table(name = "pathology_report")
/*    */ public class PathologyReport {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private int pathologyId;
	/*    */ private String patientId;
	/*    */ private String customerType;
	/*    */ private String patientName;
	/*    */ private String consultantDoctor;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String reportingDate;
	private String description;
	private String pathologyReport;
	private float applyCharge;
	private String createdAt;
	private String updatedAt;

	public void setPathologyId(int pathologyId) {
		this.pathologyId = pathologyId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public void setConsultantDoctor(String consultantDoctor) {
		this.consultantDoctor = consultantDoctor;
	}

	public void setReportingDate(String reportingDate) {
		this.reportingDate = reportingDate;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPathologyReport(String pathologyReport) {
		this.pathologyReport = pathologyReport;
	}

	public void setApplyCharge(float applyCharge) {
		this.applyCharge = applyCharge;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof PathologyReport))
			return false;
		PathologyReport other = (PathologyReport) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getPathologyId() != other.getPathologyId())
			return false;
		Object this$patientId = getPatientId(), other$patientId = other.getPatientId();
		if ((this$patientId == null) ? (other$patientId != null) : !this$patientId.equals(other$patientId))
			return false;
		Object this$customerType = getCustomerType(), other$customerType = other.getCustomerType();
		if ((this$customerType == null) ? (other$customerType != null) : !this$customerType.equals(other$customerType))
			return false;
		Object this$patientName = getPatientName(), other$patientName = other.getPatientName();
		if ((this$patientName == null) ? (other$patientName != null) : !this$patientName.equals(other$patientName))
			return false;
		Object this$consultantDoctor = getConsultantDoctor(), other$consultantDoctor = other.getConsultantDoctor();
		if ((this$consultantDoctor == null) ? (other$consultantDoctor != null)
				: !this$consultantDoctor.equals(other$consultantDoctor))
			return false;
		Object this$reportingDate = getReportingDate(), other$reportingDate = other.getReportingDate();
		if ((this$reportingDate == null) ? (other$reportingDate != null)
				: !this$reportingDate.equals(other$reportingDate))
			return false;
		Object this$description = getDescription(), other$description = other.getDescription();
		if ((this$description == null) ? (other$description != null) : !this$description.equals(other$description))
			return false;
		Object this$pathologyReport = getPathologyReport(), other$pathologyReport = other.getPathologyReport();
		if ((this$pathologyReport == null) ? (other$pathologyReport != null)
				: !this$pathologyReport.equals(other$pathologyReport))
			return false;
		if (Float.compare(getApplyCharge(), other.getApplyCharge()) != 0)
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		if ((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt))
			return false;
		Object this$updatedAt = getUpdatedAt(), other$updatedAt = other.getUpdatedAt();
		return !((this$updatedAt == null) ? (other$updatedAt != null) : !this$updatedAt.equals(other$updatedAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof PathologyReport;
	}

	

	public String toString() {
		return "PathologyReport(id=" + getId() + ", pathologyId=" + getPathologyId() + ", patientId=" + getPatientId()
				+ ", customerType=" + getCustomerType() + ", patientName=" + getPatientName() + ", consultantDoctor="
				+ getConsultantDoctor() + ", reportingDate=" + getReportingDate() + ", description=" + getDescription()
				+ ", pathologyReport=" + getPathologyReport() + ", applyCharge=" + getApplyCharge() + ", createdAt="
				+ getCreatedAt() + ", updatedAt=" + getUpdatedAt() + ")";
	}

	public PathologyReport(int id, int pathologyId, String patientId, String customerType, String patientName,
			String consultantDoctor, String reportingDate, String description, String pathologyReport,
			float applyCharge, String createdAt, String updatedAt) {
		/* 17 */ this.id = id;
		this.pathologyId = pathologyId;
		this.patientId = patientId;
		this.customerType = customerType;
		this.patientName = patientName;
		this.consultantDoctor = consultantDoctor;
		this.reportingDate = reportingDate;
		this.description = description;
		this.pathologyReport = pathologyReport;
		this.applyCharge = applyCharge;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		/*    */ }

	/*    */
	/*    */ public PathologyReport() {
	}

	/*    */
	/*    */ public int getId() {
		/* 23 */ return this.id;
		/* 24 */ }

	public int getPathologyId() {
		return this.pathologyId;
	}

	/* 25 */ public String getPatientId() {
		return this.patientId;
	}

	/* 26 */ public String getCustomerType() {
		return this.customerType;
	}

	/* 27 */ public String getPatientName() {
		return this.patientName;
	}

	/* 28 */ public String getConsultantDoctor() {
		return this.consultantDoctor;
	}

	/* 29 */ public String getReportingDate() {
		return this.reportingDate;
	}

	/* 30 */ public String getDescription() {
		return this.description;
	}

	/* 31 */ public String getPathologyReport() {
		return this.pathologyReport;
	}

	/* 32 */ public float getApplyCharge() {
		return this.applyCharge;
	}

	/* 33 */ public String getCreatedAt() {
		return this.createdAt;
	}

	public String getUpdatedAt() {
		/* 34 */ return this.updatedAt;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * PathologyReport.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */