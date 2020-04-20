/*    */
package com.hms.management.beans;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

/*    */
/*    */ public class FinanceIncomeBean {
	/*    */ private int id;
	/*    */ private String incHeadId;
	/*    */ private String name;
	/*    */ private String invoiceNo;
	/*    */ private String date;

	/*    */
	/* 10 */ public void setId(int id) {
		this.id = id;
	}

	private float amount;
	private String note;
	private Date createdAt;
	private Date updatedAt;
	private MultipartFile documents;

	public void setIncHeadId(String incHeadId) {
		this.incHeadId = incHeadId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public void setDocuments(MultipartFile documents) {
		this.documents = documents;
	}

	/*    */
	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 15 */ return this.id;
		/* 16 */ }

	public String getIncHeadId() {
		return this.incHeadId;
	}

	/* 17 */ public String getName() {
		return this.name;
	}

	/* 18 */ public String getInvoiceNo() {
		return this.invoiceNo;
	}

	/* 19 */ public String getDate() {
		return this.date;
	}

	/* 20 */ public float getAmount() {
		return this.amount;
	}

	/* 21 */ public String getNote() {
		return this.note;
	}

	/* 22 */ public Date getCreatedAt() {
		return this.createdAt;
	}

	/* 23 */ public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public MultipartFile getDocuments() {
		/* 24 */ return this.documents;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\beans\
 * FinanceIncomeBean.class Java compiler version: 8 (52.0) JD-Core Version:
 * 1.1.3
 */