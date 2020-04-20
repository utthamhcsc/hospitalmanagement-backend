/*    */
package com.hms.management.beans;

import org.springframework.web.multipart.MultipartFile;

/*    */ public class IpdDiagnosisBean {
	/*    */ private int id;
	/*    */ private int patientId;
	/*    */ private String reportType;

	/*    */
	/* 7 */ public void setId(int id) {
		this.id = id;
	}

	private MultipartFile document;
	private String description;
	private String reportDate;

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public void setDocument(MultipartFile document) {
		this.document = document;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	/*    */
	/*    */
	/*    */ public int getId() {
		/* 11 */ return this.id;
		/* 12 */ }

	public int getPatientId() {
		return this.patientId;
	}

	/* 13 */ public String getReportType() {
		return this.reportType;
	}

	/* 14 */ public MultipartFile getDocument() {
		return this.document;
	}

	/* 15 */ public String getDescription() {
		return this.description;
	}

	public String getReportDate() {
		/* 16 */ return this.reportDate;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\beans\
 * IpdDiagnosisBean.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */