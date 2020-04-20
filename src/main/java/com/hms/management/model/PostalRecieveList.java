/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */ @Entity
/*    */ @Table(name = "PostalRecieveList")
/*    */ public class PostalRecieveList {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String fromTitle;
	/*    */ private String referenceNo;
	/*    */ private String toTitle;

	/*    */
	/* 12 */ public void setId(int id) {
		this.id = id;
	}

	private String date;
	private String note;
	private String address;
	private String attachdocument;

	public void setFromTitle(String fromTitle) {
		this.fromTitle = fromTitle;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public void setToTitle(String toTitle) {
		this.toTitle = toTitle;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAttachdocument(String attachdocument) {
		this.attachdocument = attachdocument;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof PostalRecieveList))
			return false;
		PostalRecieveList other = (PostalRecieveList) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$fromTitle = getFromTitle(), other$fromTitle = other.getFromTitle();
		if ((this$fromTitle == null) ? (other$fromTitle != null) : !this$fromTitle.equals(other$fromTitle))
			return false;
		Object this$referenceNo = getReferenceNo(), other$referenceNo = other.getReferenceNo();
		if ((this$referenceNo == null) ? (other$referenceNo != null) : !this$referenceNo.equals(other$referenceNo))
			return false;
		Object this$toTitle = getToTitle(), other$toTitle = other.getToTitle();
		if ((this$toTitle == null) ? (other$toTitle != null) : !this$toTitle.equals(other$toTitle))
			return false;
		Object this$date = getDate(), other$date = other.getDate();
		if ((this$date == null) ? (other$date != null) : !this$date.equals(other$date))
			return false;
		Object this$note = getNote(), other$note = other.getNote();
		if ((this$note == null) ? (other$note != null) : !this$note.equals(other$note))
			return false;
		Object this$address = getAddress(), other$address = other.getAddress();
		if ((this$address == null) ? (other$address != null) : !this$address.equals(other$address))
			return false;
		Object this$attachdocument = getAttachdocument(), other$attachdocument = other.getAttachdocument();
		return !((this$attachdocument == null) ? (other$attachdocument != null)
				: !this$attachdocument.equals(other$attachdocument));
	}

	protected boolean canEqual(Object other) {
		return other instanceof PostalRecieveList;
	}

	

	public String toString() {
		return "PostalRecieveList(id=" + getId() + ", fromTitle=" + getFromTitle() + ", referenceNo=" + getReferenceNo()
				+ ", toTitle=" + getToTitle() + ", date=" + getDate() + ", note=" + getNote() + ", address="
				+ getAddress() + ", attachdocument=" + getAttachdocument() + ")";
	}

	public PostalRecieveList(int id, String fromTitle, String referenceNo, String toTitle, String date, String note,
			String address, String attachdocument) {
		/* 13 */ this.id = id;
		this.fromTitle = fromTitle;
		this.referenceNo = referenceNo;
		this.toTitle = toTitle;
		this.date = date;
		this.note = note;
		this.address = address;
		this.attachdocument = attachdocument;
		/*    */ }

	/*    */
	/*    */
	/*    */ public PostalRecieveList() {
	}

	/*    */
	/*    */
	/*    */ public int getId() {
		/* 21 */ return this.id;
		/* 22 */ }

	public String getFromTitle() {
		return this.fromTitle;
	}

	/* 23 */ public String getReferenceNo() {
		return this.referenceNo;
	}

	/* 24 */ public String getToTitle() {
		return this.toTitle;
	}

	/* 25 */ public String getDate() {
		return this.date;
	}

	/* 26 */ public String getNote() {
		return this.note;
	}

	/* 27 */ public String getAddress() {
		return this.address;
	}

	public String getAttachdocument() {
		/* 28 */ return this.attachdocument;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * PostalRecieveList.class Java compiler version: 8 (52.0) JD-Core Version:
 * 1.1.3
 */