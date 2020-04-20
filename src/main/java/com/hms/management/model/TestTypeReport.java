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
/*    */ @Table(name = "test_type_report")
/*    */ public class TestTypeReport {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private int radiologyId;
	/*    */ private String type;
	/*    */ private String testName;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String reportingDate;
	private String description;
	private String testReport;
	private String createdAt;
	private String updatedAt;

	public void setRadiologyId(int radiologyId) {
		this.radiologyId = radiologyId;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public void setReportingDate(String reportingDate) {
		this.reportingDate = reportingDate;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setTestReport(String testReport) {
		this.testReport = testReport;
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
		if (!(o instanceof TestTypeReport))
			return false;
		TestTypeReport other = (TestTypeReport) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getRadiologyId() != other.getRadiologyId())
			return false;
		Object this$type = getType(), other$type = other.getType();
		if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type))
			return false;
		Object this$testName = getTestName(), other$testName = other.getTestName();
		if ((this$testName == null) ? (other$testName != null) : !this$testName.equals(other$testName))
			return false;
		Object this$reportingDate = getReportingDate(), other$reportingDate = other.getReportingDate();
		if ((this$reportingDate == null) ? (other$reportingDate != null)
				: !this$reportingDate.equals(other$reportingDate))
			return false;
		Object this$description = getDescription(), other$description = other.getDescription();
		if ((this$description == null) ? (other$description != null) : !this$description.equals(other$description))
			return false;
		Object this$testReport = getTestReport(), other$testReport = other.getTestReport();
		if ((this$testReport == null) ? (other$testReport != null) : !this$testReport.equals(other$testReport))
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		if ((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt))
			return false;
		Object this$updatedAt = getUpdatedAt(), other$updatedAt = other.getUpdatedAt();
		return !((this$updatedAt == null) ? (other$updatedAt != null) : !this$updatedAt.equals(other$updatedAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof TestTypeReport;
	}

	
	public String toString() {
		return "TestTypeReport(id=" + getId() + ", radiologyId=" + getRadiologyId() + ", type=" + getType()
				+ ", testName=" + getTestName() + ", reportingDate=" + getReportingDate() + ", description="
				+ getDescription() + ", testReport=" + getTestReport() + ", createdAt=" + getCreatedAt()
				+ ", updatedAt=" + getUpdatedAt() + ")";
	}

	public TestTypeReport(int id, int radiologyId, String type, String testName, String reportingDate,
			String description, String testReport, String createdAt, String updatedAt) {
		/* 15 */ this.id = id;
		this.radiologyId = radiologyId;
		this.type = type;
		this.testName = testName;
		this.reportingDate = reportingDate;
		this.description = description;
		this.testReport = testReport;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		/*    */ }

	/*    */
	/*    */ public TestTypeReport() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 22 */ return this.id;
		/* 23 */ }

	public int getRadiologyId() {
		return this.radiologyId;
	}

	/* 24 */ public String getType() {
		return this.type;
	}

	/* 25 */ public String getTestName() {
		return this.testName;
	}

	/* 26 */ public String getReportingDate() {
		return this.reportingDate;
	}

	/* 27 */ public String getDescription() {
		return this.description;
	}

	/* 28 */ public String getTestReport() {
		return this.testReport;
	}

	/* 29 */ public String getCreatedAt() {
		return this.createdAt;
	}

	public String getUpdatedAt() {
		/* 30 */ return this.updatedAt;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * TestTypeReport.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */