/*    */
package com.hms.management.model;

import javax.persistence.Entity;
/*    */
/*    */ import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "opddiagnosis")
/*    */ public class OpdDiagnosis {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String opdId;
	/*    */ private String reportType;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String document;
	private String description;
	private String reportDate;

	public void setOpdId(String opdId) {
		this.opdId = opdId;
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
		if (!(o instanceof OpdDiagnosis))
			return false;
		OpdDiagnosis other = (OpdDiagnosis) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
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
		return other instanceof OpdDiagnosis;
	}


	public String toString() {
		return "OpdDiagnosis(id=" + getId() + ", opdId=" + getOpdId() + ", reportType=" + getReportType()
				+ ", document=" + getDocument() + ", description=" + getDescription() + ", reportDate="
				+ getReportDate() + ")";
	}

	public OpdDiagnosis(int id, String opdId, String reportType, String document, String description,
			String reportDate) {
		/* 15 */ this.id = id;
		this.opdId = opdId;
		this.reportType = reportType;
		this.document = document;
		this.description = description;
		this.reportDate = reportDate;
		/*    */ }

	/*    */
	/*    */ public OpdDiagnosis() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 22 */ return this.id;
		/* 23 */ }

	public String getOpdId() {
		return this.opdId;
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
 * OpdDiagnosis.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */