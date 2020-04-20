/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "IpdDiagnosis")
/*    */ public class IpdDiagnosis {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private int patientId;
	/*    */ private String reportType;

	/*    */
	/*    */ public IpdDiagnosis(int id, int patientId, String reportType, String document, String description,
			String reportDate) {
		/* 13 */ this.id = id;
		this.patientId = patientId;
		this.reportType = reportType;
		this.document = document;
		this.description = description;
		this.reportDate = reportDate;
		/*    */ }

	private String document;
	private String description;
	private String reportDate;

	public IpdDiagnosis() {
	}

	public void setId(int id) {
		/* 15 */ this.id = id;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof IpdDiagnosis))
			return false;
		IpdDiagnosis other = (IpdDiagnosis) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getPatientId() != other.getPatientId())
			return false;
		Object this$reportType = getReportType(), other$reportType = other.getReportType();
		if ((this$reportType == null) ? (other$reportType != null) : !this$reportType.equals(other$reportType))
			return false;
		Object this$document = getDocument(), other$document = other.getDocument();
		if ((this$document == null) ? (other$document != null) : !this$document.equals(other$document))
			return false;
		Object this$description = getDescription(), other$description = other.getDescription();
		if ((this$description == null) ? (other$description != null) : !this$description.equals(other$description))
			return false;
		Object this$reportDate = getReportDate(), other$reportDate = other.getReportDate();
		return !((this$reportDate == null) ? (other$reportDate != null) : !this$reportDate.equals(other$reportDate));
	}

	protected boolean canEqual(Object other) {
		return other instanceof IpdDiagnosis;
	}

	

	public String toString() {
		return "IpdDiagnosis(id=" + getId() + ", patientId=" + getPatientId() + ", reportType=" + getReportType()
				+ ", document=" + getDocument() + ", description=" + getDescription() + ", reportDate="
				+ getReportDate() + ")";
	}

	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */ public int getId() {
		/* 22 */ return this.id;
		/* 23 */ }

	public int getPatientId() {
		return this.patientId;
	}

	/* 24 */ public String getReportType() {
		return this.reportType;
	}

	/* 25 */ public String getDocument() {
		return this.document;
	}

	/* 26 */ public String getDescription() {
		return this.description;
	}

	public String getReportDate() {
		/* 27 */ return this.reportDate;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * IpdDiagnosis.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */