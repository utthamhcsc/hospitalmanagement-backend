/*    */
package com.hms.management.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */
/*    */ @Entity
/*    */ @Table(name = "radiology_report")
/*    */ public class RadiologyReport {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private int radiologyId;
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
	private String radiologyReport;
	private float applyCharge;
	private Date createdAt;
	private Date updatedAt;

	public void setRadiologyId(int radiologyId) {
		this.radiologyId = radiologyId;
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

	public void setRadiologyReport(String radiologyReport) {
		this.radiologyReport = radiologyReport;
	}

	public void setApplyCharge(float applyCharge) {
		this.applyCharge = applyCharge;
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
		if (!(o instanceof RadiologyReport))
			return false;
		RadiologyReport other = (RadiologyReport) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getRadiologyId() != other.getRadiologyId())
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
		Object this$radiologyReport = getRadiologyReport(), other$radiologyReport = other.getRadiologyReport();
		if ((this$radiologyReport == null) ? (other$radiologyReport != null)
				: !this$radiologyReport.equals(other$radiologyReport))
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
		return other instanceof RadiologyReport;
	}

	

	public String toString() {
		return "RadiologyReport(id=" + getId() + ", radiologyId=" + getRadiologyId() + ", patientId=" + getPatientId()
				+ ", customerType=" + getCustomerType() + ", patientName=" + getPatientName() + ", consultantDoctor="
				+ getConsultantDoctor() + ", reportingDate=" + getReportingDate() + ", description=" + getDescription()
				+ ", radiologyReport=" + getRadiologyReport() + ", applyCharge=" + getApplyCharge() + ", createdAt="
				+ getCreatedAt() + ", updatedAt=" + getUpdatedAt() + ")";
	}

	public RadiologyReport(int id, int radiologyId, String patientId, String customerType, String patientName,
			String consultantDoctor, String reportingDate, String description, String radiologyReport,
			float applyCharge, Date createdAt, Date updatedAt) {
		/* 17 */ this.id = id;
		this.radiologyId = radiologyId;
		this.patientId = patientId;
		this.customerType = customerType;
		this.patientName = patientName;
		this.consultantDoctor = consultantDoctor;
		this.reportingDate = reportingDate;
		this.description = description;
		this.radiologyReport = radiologyReport;
		this.applyCharge = applyCharge;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		/*    */ }

	/*    */
	/*    */ public RadiologyReport() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 24 */ return this.id;
		/* 25 */ }

	public int getRadiologyId() {
		return this.radiologyId;
	}

	/* 26 */ public String getPatientId() {
		return this.patientId;
	}

	/* 27 */ public String getCustomerType() {
		return this.customerType;
	}

	/* 28 */ public String getPatientName() {
		return this.patientName;
	}

	/* 29 */ public String getConsultantDoctor() {
		return this.consultantDoctor;
	}

	/* 30 */ public String getReportingDate() {
		return this.reportingDate;
	}

	/* 31 */ public String getDescription() {
		return this.description;
	}

	/* 32 */ public String getRadiologyReport() {
		return this.radiologyReport;
	}

	/* 33 */ public float getApplyCharge() {
		return this.applyCharge;
	}

	/* 34 */ public Date getCreatedAt() {
		return this.createdAt;
	}

	public Date getUpdatedAt() {
		/* 35 */ return this.updatedAt;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * RadiologyReport.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */