/*    */
package com.hms.management.model;

/*    */
/*    */ import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "VisitorList")
/*    */ public class VisitorList {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String purpose;
	/*    */ private String name;
	/*    */ private String phone;
	/*    */ private Date date;
	/*    */ private String inTime;

	/*    */
	/* 17 */ public void setId(int id) {
		this.id = id;
	}

	private String outTime;
	private String action;
	private String numberOfPersons;
	private String idCard;
	private String note;
	private String attachedDocument;

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public void setNumberOfPersons(String numberOfPersons) {
		this.numberOfPersons = numberOfPersons;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setAttachedDocument(String attachedDocument) {
		this.attachedDocument = attachedDocument;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof VisitorList))
			return false;
		VisitorList other = (VisitorList) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$purpose = getPurpose(), other$purpose = other.getPurpose();
		if ((this$purpose == null) ? (other$purpose != null) : !this$purpose.equals(other$purpose))
			return false;
		Object this$name = getName(), other$name = other.getName();
		if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name))
			return false;
		Object this$phone = getPhone(), other$phone = other.getPhone();
		if ((this$phone == null) ? (other$phone != null) : !this$phone.equals(other$phone))
			return false;
		Object this$date = getDate(), other$date = other.getDate();
		if ((this$date == null) ? (other$date != null) : !this$date.equals(other$date))
			return false;
		Object this$inTime = getInTime(), other$inTime = other.getInTime();
		if ((this$inTime == null) ? (other$inTime != null) : !this$inTime.equals(other$inTime))
			return false;
		Object this$outTime = getOutTime(), other$outTime = other.getOutTime();
		if ((this$outTime == null) ? (other$outTime != null) : !this$outTime.equals(other$outTime))
			return false;
		Object this$action = getAction(), other$action = other.getAction();
		if ((this$action == null) ? (other$action != null) : !this$action.equals(other$action))
			return false;
		Object this$numberOfPersons = getNumberOfPersons(), other$numberOfPersons = other.getNumberOfPersons();
		if ((this$numberOfPersons == null) ? (other$numberOfPersons != null)
				: !this$numberOfPersons.equals(other$numberOfPersons))
			return false;
		Object this$idCard = getIdCard(), other$idCard = other.getIdCard();
		if ((this$idCard == null) ? (other$idCard != null) : !this$idCard.equals(other$idCard))
			return false;
		Object this$note = getNote(), other$note = other.getNote();
		if ((this$note == null) ? (other$note != null) : !this$note.equals(other$note))
			return false;
		Object this$attachedDocument = getAttachedDocument(), other$attachedDocument = other.getAttachedDocument();
		return !((this$attachedDocument == null) ? (other$attachedDocument != null)
				: !this$attachedDocument.equals(other$attachedDocument));
	}

	protected boolean canEqual(Object other) {
		return other instanceof VisitorList;
	}


	public String toString() {
		return "VisitorList(id=" + getId() + ", purpose=" + getPurpose() + ", name=" + getName() + ", phone="
				+ getPhone() + ", date=" + getDate() + ", inTime=" + getInTime() + ", outTime=" + getOutTime()
				+ ", action=" + getAction() + ", numberOfPersons=" + getNumberOfPersons() + ", idCard=" + getIdCard()
				+ ", note=" + getNote() + ", attachedDocument=" + getAttachedDocument() + ")";
	}

	public VisitorList(int id, String purpose, String name, String phone, Date date, String inTime, String outTime,
			String action, String numberOfPersons, String idCard, String note, String attachedDocument) {
		/* 18 */ this.id = id;
		this.purpose = purpose;
		this.name = name;
		this.phone = phone;
		this.date = date;
		this.inTime = inTime;
		this.outTime = outTime;
		this.action = action;
		this.numberOfPersons = numberOfPersons;
		this.idCard = idCard;
		this.note = note;
		this.attachedDocument = attachedDocument;
		/*    */ }

	/*    */
	/*    */ public VisitorList() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 25 */ return this.id;
		/* 26 */ }

	public String getPurpose() {
		return this.purpose;
	}

	/* 27 */ public String getName() {
		return this.name;
	}

	/* 28 */ public String getPhone() {
		return this.phone;
	}

	/* 29 */ public Date getDate() {
		return this.date;
	}

	/* 30 */ public String getInTime() {
		return this.inTime;
	}

	/* 31 */ public String getOutTime() {
		return this.outTime;
	}

	/* 32 */ public String getAction() {
		return this.action;
	}

	/* 33 */ public String getNumberOfPersons() {
		return this.numberOfPersons;
	}

	/* 34 */ public String getIdCard() {
		return this.idCard;
	}

	/* 35 */ public String getNote() {
		return this.note;
	}

	public String getAttachedDocument() {
		/* 36 */ return this.attachedDocument;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * VisitorList.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */