/*    */
package com.hms.management.beans;

import org.springframework.web.multipart.MultipartFile;

/*    */ public class ComplainTypeBean {
	private int id;
	/*    */ private String complainBy;
	/*    */ private String source;
	/*    */ private String phone;
	/*    */ private String date;

	/*    */
	/* 8 */ public void setId(int id) {
		this.id = id;
	}

	private String description;
	private String actionTaken;
	private String assigned;
	private String note;
	private MultipartFile attachedDocument;

	public void setComplainBy(String complainBy) {
		this.complainBy = complainBy;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setActionTaken(String actionTaken) {
		this.actionTaken = actionTaken;
	}

	public void setAssigned(String assigned) {
		this.assigned = assigned;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setAttachedDocument(MultipartFile attachedDocument) {
		this.attachedDocument = attachedDocument;
	}

	/*    */ public String toString() {
		/* 10 */ return "ComplainTypeBean(id=" + getId() + ", complainBy=" + getComplainBy() + ", source=" + getSource()
				+ ", phone=" + getPhone() + ", date=" + getDate() + ", description=" + getDescription()
				+ ", actionTaken=" + getActionTaken() + ", assigned=" + getAssigned() + ", note=" + getNote()
				+ ", attachedDocument=" + getAttachedDocument() + ")";
		/*    */ }

	/*    */
	/*    */ public int getId() {
		/* 14 */ return this.id;
		/* 15 */ }

	public String getComplainBy() {
		return this.complainBy;
	}

	/* 16 */ public String getSource() {
		return this.source;
	}

	/* 17 */ public String getPhone() {
		return this.phone;
	}

	/* 18 */ public String getDate() {
		return this.date;
	}

	/* 19 */ public String getDescription() {
		return this.description;
	}

	/* 20 */ public String getActionTaken() {
		return this.actionTaken;
	}

	/* 21 */ public String getAssigned() {
		return this.assigned;
	}

	/* 22 */ public String getNote() {
		return this.note;
	}

	public MultipartFile getAttachedDocument() {
		/* 23 */ return this.attachedDocument;
		/*    */ }
}

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\beans\
 * ComplainTypeBean.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */