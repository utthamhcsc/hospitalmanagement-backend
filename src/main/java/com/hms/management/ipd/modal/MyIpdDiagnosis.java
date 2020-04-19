/*    */
package com.hms.management.ipd.modal;

import javax.persistence.Entity;
/*    */
/*    */ import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "myIpddiagnosis")
/*    */ public class MyIpdDiagnosis {
	/*    */ @Id
	/*    */ @GeneratedValue
	/*    */ private int id;
	/*    */ private String ipdId;
	/*    */ private String reportType;

	/*    */
	/* 14 */ public MyIpdDiagnosis(int id, String ipdId, String reportType, String document, String description,
			String reportDate) {
		this.id = id;
		this.ipdId = ipdId;
		this.reportType = reportType;
		this.document = document;
		this.description = description;
		this.reportDate = reportDate;
	}

	private String document;
	private String description;
	private String reportDate;

	public void setId(int id) {
		/* 15 */ this.id = id;
	}

	public void setIpdId(String ipdId) {
		this.ipdId = ipdId;
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
		if (!(o instanceof MyIpdDiagnosis))
			return false;
		MyIpdDiagnosis other = (MyIpdDiagnosis) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$ipdId = getIpdId(), other$ipdId = other.getIpdId();
		if ((this$ipdId == null) ? (other$ipdId != null) : !this$ipdId.equals(other$ipdId))
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
		return other instanceof MyIpdDiagnosis;
	}

	

	public String toString() {
		return "MyIpdDiagnosis(id=" + getId() + ", ipdId=" + getIpdId() + ", reportType=" + getReportType()
				+ ", document=" + getDocument() + ", description=" + getDescription() + ", reportDate="
				+ getReportDate() + ")";
	}

	/*    */
	/*    */
	/*    */ public MyIpdDiagnosis() {
	}

	/*    */
	/* 20 */ public int getId() {
		return this.id;
	}

	/* 21 */ public String getIpdId() {
		return this.ipdId;
	}

	/* 22 */ public String getReportType() {
		return this.reportType;
	}

	/* 23 */ public String getDocument() {
		return this.document;
	}

	/* 24 */ public String getDescription() {
		return this.description;
	}

	public String getReportDate() {
		/* 25 */ return this.reportDate;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\ipd\modal\
 * MyIpdDiagnosis.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */