
/*    */
package com.hms.management.opd.modal;

/*    */
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "myopddiagnosis")
/*    */ public class MyOpdDiagnosis {
	/*    */ @Id
	/*    */ private String opdId;
	/*    */ private String reportType;

	/*    */
	/* 13 */ public MyOpdDiagnosis(String opdId, String reportType, String document, String description,
			String reportDate) {
		this.opdId = opdId;
		this.reportType = reportType;
		this.document = document;
		this.description = description;
		this.reportDate = reportDate;
	}

	private String document;
	private String description;
	private String reportDate;

	public void setOpdId(String opdId) {
		/* 14 */ this.opdId = opdId;
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
		if (!(o instanceof MyOpdDiagnosis))
			return false;
		MyOpdDiagnosis other = (MyOpdDiagnosis) o;
		if (!other.canEqual(this))
			return false;
		Object this$opdId = getOpdId(), other$opdId = other.getOpdId();
		if ((this$opdId == null) ? (other$opdId != null) : !this$opdId.equals(other$opdId))
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
		return other instanceof MyOpdDiagnosis;
	}



	public String toString() {
		return "MyOpdDiagnosis(opdId=" + getOpdId() + ", reportType=" + getReportType() + ", document=" + getDocument()
				+ ", description=" + getDescription() + ", reportDate=" + getReportDate() + ")";
	}

	/*    */
	/*    */ public MyOpdDiagnosis() {
	}

	/*    */
	/* 18 */ public String getOpdId() {
		return this.opdId;
	}

	/* 19 */ public String getReportType() {
		return this.reportType;
	}

	/* 20 */ public String getDocument() {
		return this.document;
	}

	/* 21 */ public String getDescription() {
		return this.description;
	}

	public String getReportDate() {
		/* 22 */ return this.reportDate;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\opd\modal\
 * MyOpdDiagnosis.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */