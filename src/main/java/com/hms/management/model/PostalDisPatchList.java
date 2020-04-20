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
/*    */ @Table(name = "PostalDisPatchList")
/*    */ public class PostalDisPatchList {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String toTitle;
	/*    */ private String referenceNo;
	/*    */ private String address;

	/*    */
	/* 15 */ public void setId(int id) {
		this.id = id;
	}

	private String note;
	private String fromTitle;
	private String date;
	private String attachdDocument;

	public void setToTitle(String toTitle) {
		this.toTitle = toTitle;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setFromTitle(String fromTitle) {
		this.fromTitle = fromTitle;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setAttachdDocument(String attachdDocument) {
		this.attachdDocument = attachdDocument;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof PostalDisPatchList))
			return false;
		PostalDisPatchList other = (PostalDisPatchList) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$toTitle = getToTitle(), other$toTitle = other.getToTitle();
		if ((this$toTitle == null) ? (other$toTitle != null) : !this$toTitle.equals(other$toTitle))
			return false;
		Object this$referenceNo = getReferenceNo(), other$referenceNo = other.getReferenceNo();
		if ((this$referenceNo == null) ? (other$referenceNo != null) : !this$referenceNo.equals(other$referenceNo))
			return false;
		Object this$address = getAddress(), other$address = other.getAddress();
		if ((this$address == null) ? (other$address != null) : !this$address.equals(other$address))
			return false;
		Object this$note = getNote(), other$note = other.getNote();
		if ((this$note == null) ? (other$note != null) : !this$note.equals(other$note))
			return false;
		Object this$fromTitle = getFromTitle(), other$fromTitle = other.getFromTitle();
		if ((this$fromTitle == null) ? (other$fromTitle != null) : !this$fromTitle.equals(other$fromTitle))
			return false;
		Object this$date = getDate(), other$date = other.getDate();
		if ((this$date == null) ? (other$date != null) : !this$date.equals(other$date))
			return false;
		Object this$attachdDocument = getAttachdDocument(), other$attachdDocument = other.getAttachdDocument();
		return !((this$attachdDocument == null) ? (other$attachdDocument != null)
				: !this$attachdDocument.equals(other$attachdDocument));
	}

	protected boolean canEqual(Object other) {
		return other instanceof PostalDisPatchList;
	}

	
	public String toString() {
		return "PostalDisPatchList(id=" + getId() + ", toTitle=" + getToTitle() + ", referenceNo=" + getReferenceNo()
				+ ", address=" + getAddress() + ", note=" + getNote() + ", fromTitle=" + getFromTitle() + ", date="
				+ getDate() + ", attachdDocument=" + getAttachdDocument() + ")";
	}

	public PostalDisPatchList(int id, String toTitle, String referenceNo, String address, String note, String fromTitle,
			String date, String attachdDocument) {
		/* 16 */ this.id = id;
		this.toTitle = toTitle;
		this.referenceNo = referenceNo;
		this.address = address;
		this.note = note;
		this.fromTitle = fromTitle;
		this.date = date;
		this.attachdDocument = attachdDocument;
		/*    */ }

	/*    */
	/*    */ public PostalDisPatchList() {
	}

	/*    */
	/*    */ public int getId() {
		/* 22 */ return this.id;
		/* 23 */ }

	public String getToTitle() {
		return this.toTitle;
	}

	/* 24 */ public String getReferenceNo() {
		return this.referenceNo;
	}

	/* 25 */ public String getAddress() {
		return this.address;
	}

	/* 26 */ public String getNote() {
		return this.note;
	}

	/* 27 */ public String getFromTitle() {
		return this.fromTitle;
	}

	/* 28 */ public String getDate() {
		return this.date;
	}

	public String getAttachdDocument() {
		/* 29 */ return this.attachdDocument;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * PostalDisPatchList.class Java compiler version: 8 (52.0) JD-Core Version:
 * 1.1.3
 */