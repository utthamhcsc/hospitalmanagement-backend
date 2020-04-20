/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */ @Entity
/*    */ @Table(name = "ComplainType")
/*    */ public class ComplainType {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String complainBy;
	/*    */ private String source;
	/*    */ private String phone;
	/*    */ private String date;

	/*    */
	/*    */ public ComplainType(int id, String complainBy, String source, String phone, String date,
			String description, String actionTaken, String assigned, String note, String attachedDocument) {
		/* 14 */ this.id = id;
		this.complainBy = complainBy;
		this.source = source;
		this.phone = phone;
		this.date = date;
		this.description = description;
		this.actionTaken = actionTaken;
		this.assigned = assigned;
		this.note = note;
		this.attachedDocument = attachedDocument;
		/*    */ }

	private String description;
	private String actionTaken;
	private String assigned;
	private String note;
	private String attachedDocument;

	public ComplainType() {
	}

	public void setId(int id) {
		/* 16 */ this.id = id;
	}

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

	public void setAttachedDocument(String attachedDocument) {
		this.attachedDocument = attachedDocument;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof ComplainType))
			return false;
		ComplainType other = (ComplainType) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$complainBy = getComplainBy(), other$complainBy = other.getComplainBy();
		if ((this$complainBy == null) ? (other$complainBy != null) : !this$complainBy.equals(other$complainBy))
			return false;
		Object this$source = getSource(), other$source = other.getSource();
		if ((this$source == null) ? (other$source != null) : !this$source.equals(other$source))
			return false;
		Object this$phone = getPhone(), other$phone = other.getPhone();
		if ((this$phone == null) ? (other$phone != null) : !this$phone.equals(other$phone))
			return false;
		Object this$date = getDate(), other$date = other.getDate();
		if ((this$date == null) ? (other$date != null) : !this$date.equals(other$date))
			return false;
		Object this$description = getDescription(), other$description = other.getDescription();
		if ((this$description == null) ? (other$description != null) : !this$description.equals(other$description))
			return false;
		Object this$actionTaken = getActionTaken(), other$actionTaken = other.getActionTaken();
		if ((this$actionTaken == null) ? (other$actionTaken != null) : !this$actionTaken.equals(other$actionTaken))
			return false;
		Object this$assigned = getAssigned(), other$assigned = other.getAssigned();
		if ((this$assigned == null) ? (other$assigned != null) : !this$assigned.equals(other$assigned))
			return false;
		Object this$note = getNote(), other$note = other.getNote();
		if ((this$note == null) ? (other$note != null) : !this$note.equals(other$note))
			return false;
		Object this$attachedDocument = getAttachedDocument(), other$attachedDocument = other.getAttachedDocument();
		return !((this$attachedDocument == null) ? (other$attachedDocument != null)
				: !this$attachedDocument.equals(other$attachedDocument));
	}

	protected boolean canEqual(Object other) {
		return other instanceof ComplainType;
	}


	public String toString() {
		return "ComplainType(id=" + getId() + ", complainBy=" + getComplainBy() + ", source=" + getSource() + ", phone="
				+ getPhone() + ", date=" + getDate() + ", description=" + getDescription() + ", actionTaken="
				+ getActionTaken() + ", assigned=" + getAssigned() + ", note=" + getNote() + ", attachedDocument="
				+ getAttachedDocument() + ")";
	}

	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */ public int getId() {
		/* 24 */ return this.id;
		/* 25 */ }

	public String getComplainBy() {
		return this.complainBy;
	}

	/* 26 */ public String getSource() {
		return this.source;
	}

	/* 27 */ public String getPhone() {
		return this.phone;
	}

	/* 28 */ public String getDate() {
		return this.date;
	}

	/* 29 */ public String getDescription() {
		return this.description;
	}

	/* 30 */ public String getActionTaken() {
		return this.actionTaken;
	}

	/* 31 */ public String getAssigned() {
		return this.assigned;
	}

	/* 32 */ public String getNote() {
		return this.note;
	}

	public String getAttachedDocument() {
		/* 33 */ return this.attachedDocument;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * ComplainType.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */