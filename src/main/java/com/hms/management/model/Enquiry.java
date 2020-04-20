/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */ @Entity
/*    */ @Table(name = "enquiry")
/*    */ public class Enquiry {
	@Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String name;
	/*    */ private String contact;
	/*    */ private String address;
	/*    */ private String reference;
	/*    */ private String date;
	/*    */ private String description;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String followUpDate;
	private String note;
	private String source;
	private String email;
	private String assigned;
	private int clas;
	private String noOfChild;
	private String status;

	public void setName(String name) {
		this.name = name;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setFollowUpDate(String followUpDate) {
		this.followUpDate = followUpDate;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAssigned(String assigned) {
		this.assigned = assigned;
	}

	public void setClas(int clas) {
		this.clas = clas;
	}

	public void setNoOfChild(String noOfChild) {
		this.noOfChild = noOfChild;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Enquiry))
			return false;
		Enquiry other = (Enquiry) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$name = getName(), other$name = other.getName();
		if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name))
			return false;
		Object this$contact = getContact(), other$contact = other.getContact();
		if ((this$contact == null) ? (other$contact != null) : !this$contact.equals(other$contact))
			return false;
		Object this$address = getAddress(), other$address = other.getAddress();
		if ((this$address == null) ? (other$address != null) : !this$address.equals(other$address))
			return false;
		Object this$reference = getReference(), other$reference = other.getReference();
		if ((this$reference == null) ? (other$reference != null) : !this$reference.equals(other$reference))
			return false;
		Object this$date = getDate(), other$date = other.getDate();
		if ((this$date == null) ? (other$date != null) : !this$date.equals(other$date))
			return false;
		Object this$description = getDescription(), other$description = other.getDescription();
		if ((this$description == null) ? (other$description != null) : !this$description.equals(other$description))
			return false;
		Object this$followUpDate = getFollowUpDate(), other$followUpDate = other.getFollowUpDate();
		if ((this$followUpDate == null) ? (other$followUpDate != null) : !this$followUpDate.equals(other$followUpDate))
			return false;
		Object this$note = getNote(), other$note = other.getNote();
		if ((this$note == null) ? (other$note != null) : !this$note.equals(other$note))
			return false;
		Object this$source = getSource(), other$source = other.getSource();
		if ((this$source == null) ? (other$source != null) : !this$source.equals(other$source))
			return false;
		Object this$email = getEmail(), other$email = other.getEmail();
		if ((this$email == null) ? (other$email != null) : !this$email.equals(other$email))
			return false;
		Object this$assigned = getAssigned(), other$assigned = other.getAssigned();
		if ((this$assigned == null) ? (other$assigned != null) : !this$assigned.equals(other$assigned))
			return false;
		if (getClas() != other.getClas())
			return false;
		Object this$noOfChild = getNoOfChild(), other$noOfChild = other.getNoOfChild();
		if ((this$noOfChild == null) ? (other$noOfChild != null) : !this$noOfChild.equals(other$noOfChild))
			return false;
		Object this$status = getStatus(), other$status = other.getStatus();
		return !((this$status == null) ? (other$status != null) : !this$status.equals(other$status));
	}

	protected boolean canEqual(Object other) {
		return other instanceof Enquiry;
	}

	
	public String toString() {
		return "Enquiry(id=" + getId() + ", name=" + getName() + ", contact=" + getContact() + ", address="
				+ getAddress() + ", reference=" + getReference() + ", date=" + getDate() + ", description="
				+ getDescription() + ", followUpDate=" + getFollowUpDate() + ", note=" + getNote() + ", source="
				+ getSource() + ", email=" + getEmail() + ", assigned=" + getAssigned() + ", clas=" + getClas()
				+ ", noOfChild=" + getNoOfChild() + ", status=" + getStatus() + ")";
	}

	public Enquiry(int id, String name, String contact, String address, String reference, String date,
			String description, String followUpDate, String note, String source, String email, String assigned,
			int clas, String noOfChild, String status) {
		/* 15 */ this.id = id;
		this.name = name;
		this.contact = contact;
		this.address = address;
		this.reference = reference;
		this.date = date;
		this.description = description;
		this.followUpDate = followUpDate;
		this.note = note;
		this.source = source;
		this.email = email;
		this.assigned = assigned;
		this.clas = clas;
		this.noOfChild = noOfChild;
		this.status = status;
		/*    */ }

	/*    */
	/*    */ public Enquiry() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 22 */ return this.id;
		/* 23 */ }

	public String getName() {
		return this.name;
	}

	/* 24 */ public String getContact() {
		return this.contact;
	}

	/* 25 */ public String getAddress() {
		return this.address;
	}

	/* 26 */ public String getReference() {
		return this.reference;
	}

	/* 27 */ public String getDate() {
		return this.date;
	}

	/* 28 */ public String getDescription() {
		return this.description;
	}

	/* 29 */ public String getFollowUpDate() {
		return this.followUpDate;
	}

	/* 30 */ public String getNote() {
		return this.note;
	}

	/* 31 */ public String getSource() {
		return this.source;
	}

	/* 32 */ public String getEmail() {
		return this.email;
	}

	/* 33 */ public String getAssigned() {
		return this.assigned;
	}

	/* 34 */ public int getClas() {
		return this.clas;
	}

	/* 35 */ public String getNoOfChild() {
		return this.noOfChild;
	}

	public String getStatus() {
		/* 36 */ return this.status;
		/*    */ }
}

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\Enquiry.
 * class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */