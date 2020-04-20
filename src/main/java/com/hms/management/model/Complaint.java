/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */
/*    */ @Entity
/*    */ @Table(name = "complaint")
/*    */ public class Complaint {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String complaintType;
	/*    */ private String source;
	/*    */ private String name;
	/*    */ private String contact;
	/*    */ private String email;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String date;
	private String description;
	private String actionTaken;
	private String assigned;
	private String note;
	private String image;

	public void setComplaintType(String complaintType) {
		this.complaintType = complaintType;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public void setImage(String image) {
		this.image = image;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Complaint))
			return false;
		Complaint other = (Complaint) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$complaintType = getComplaintType(), other$complaintType = other.getComplaintType();
		if ((this$complaintType == null) ? (other$complaintType != null)
				: !this$complaintType.equals(other$complaintType))
			return false;
		Object this$source = getSource(), other$source = other.getSource();
		if ((this$source == null) ? (other$source != null) : !this$source.equals(other$source))
			return false;
		Object this$name = getName(), other$name = other.getName();
		if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name))
			return false;
		Object this$contact = getContact(), other$contact = other.getContact();
		if ((this$contact == null) ? (other$contact != null) : !this$contact.equals(other$contact))
			return false;
		Object this$email = getEmail(), other$email = other.getEmail();
		if ((this$email == null) ? (other$email != null) : !this$email.equals(other$email))
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
		Object this$image = getImage(), other$image = other.getImage();
		return !((this$image == null) ? (other$image != null) : !this$image.equals(other$image));
	}

	protected boolean canEqual(Object other) {
		return other instanceof Complaint;
	}


	public String toString() {
		return "Complaint(id=" + getId() + ", complaintType=" + getComplaintType() + ", source=" + getSource()
				+ ", name=" + getName() + ", contact=" + getContact() + ", email=" + getEmail() + ", date=" + getDate()
				+ ", description=" + getDescription() + ", actionTaken=" + getActionTaken() + ", assigned="
				+ getAssigned() + ", note=" + getNote() + ", image=" + getImage() + ")";
	}

	public Complaint(int id, String complaintType, String source, String name, String contact, String email,
			String date, String description, String actionTaken, String assigned, String note, String image) {
		/* 17 */ this.id = id;
		this.complaintType = complaintType;
		this.source = source;
		this.name = name;
		this.contact = contact;
		this.email = email;
		this.date = date;
		this.description = description;
		this.actionTaken = actionTaken;
		this.assigned = assigned;
		this.note = note;
		this.image = image;
		/*    */ }

	/*    */
	/*    */
	/*    */ public Complaint() {
	}

	/*    */
	/*    */
	/*    */ public int getId() {
		/* 25 */ return this.id;
		/* 26 */ }

	public String getComplaintType() {
		return this.complaintType;
	}

	/* 27 */ public String getSource() {
		return this.source;
	}

	/* 28 */ public String getName() {
		return this.name;
	}

	/* 29 */ public String getContact() {
		return this.contact;
	}

	/* 30 */ public String getEmail() {
		return this.email;
	}

	/* 31 */ public String getDate() {
		return this.date;
	}

	/* 32 */ public String getDescription() {
		return this.description;
	}

	/* 33 */ public String getActionTaken() {
		return this.actionTaken;
	}

	/* 34 */ public String getAssigned() {
		return this.assigned;
	}

	/* 35 */ public String getNote() {
		return this.note;
	}

	public String getImage() {
		/* 36 */ return this.image;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\Complaint.
 * class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */