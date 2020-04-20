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
/*    */ @Table(name = "visitors_book")
/*    */ public class VisitorsBook {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String source;
	/*    */ private String purpose;
	/*    */ private String name;
	/*    */ private String email;
	/*    */ private String contact;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String idProof;
	private int noOfPepple;
	private String date;
	private String inTime;
	private String outTime;
	private String note;
	private String image;

	public void setSource(String source) {
		this.source = source;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}

	public void setNoOfPepple(int noOfPepple) {
		this.noOfPepple = noOfPepple;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	public void setOutTime(String outTime) {
		this.outTime = outTime;
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
		if (!(o instanceof VisitorsBook))
			return false;
		VisitorsBook other = (VisitorsBook) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$source = getSource(), other$source = other.getSource();
		if ((this$source == null) ? (other$source != null) : !this$source.equals(other$source))
			return false;
		Object this$purpose = getPurpose(), other$purpose = other.getPurpose();
		if ((this$purpose == null) ? (other$purpose != null) : !this$purpose.equals(other$purpose))
			return false;
		Object this$name = getName(), other$name = other.getName();
		if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name))
			return false;
		Object this$email = getEmail(), other$email = other.getEmail();
		if ((this$email == null) ? (other$email != null) : !this$email.equals(other$email))
			return false;
		Object this$contact = getContact(), other$contact = other.getContact();
		if ((this$contact == null) ? (other$contact != null) : !this$contact.equals(other$contact))
			return false;
		Object this$idProof = getIdProof(), other$idProof = other.getIdProof();
		if ((this$idProof == null) ? (other$idProof != null) : !this$idProof.equals(other$idProof))
			return false;
		if (getNoOfPepple() != other.getNoOfPepple())
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
		Object this$note = getNote(), other$note = other.getNote();
		if ((this$note == null) ? (other$note != null) : !this$note.equals(other$note))
			return false;
		Object this$image = getImage(), other$image = other.getImage();
		return !((this$image == null) ? (other$image != null) : !this$image.equals(other$image));
	}

	protected boolean canEqual(Object other) {
		return other instanceof VisitorsBook;
	}


	public String toString() {
		return "VisitorsBook(id=" + getId() + ", source=" + getSource() + ", purpose=" + getPurpose() + ", name="
				+ getName() + ", email=" + getEmail() + ", contact=" + getContact() + ", idProof=" + getIdProof()
				+ ", noOfPepple=" + getNoOfPepple() + ", date=" + getDate() + ", inTime=" + getInTime() + ", outTime="
				+ getOutTime() + ", note=" + getNote() + ", image=" + getImage() + ")";
	}

	public VisitorsBook(int id, String source, String purpose, String name, String email, String contact,
			String idProof, int noOfPepple, String date, String inTime, String outTime, String note, String image) {
		/* 17 */ this.id = id;
		this.source = source;
		this.purpose = purpose;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.idProof = idProof;
		this.noOfPepple = noOfPepple;
		this.date = date;
		this.inTime = inTime;
		this.outTime = outTime;
		this.note = note;
		this.image = image;
		/*    */ }

	/*    */
	/*    */ public VisitorsBook() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 24 */ return this.id;
		/* 25 */ }

	public String getSource() {
		return this.source;
	}

	/* 26 */ public String getPurpose() {
		return this.purpose;
	}

	/* 27 */ public String getName() {
		return this.name;
	}

	/* 28 */ public String getEmail() {
		return this.email;
	}

	/* 29 */ public String getContact() {
		return this.contact;
	}

	/* 30 */ public String getIdProof() {
		return this.idProof;
	}

	/* 31 */ public int getNoOfPepple() {
		return this.noOfPepple;
	}

	/* 32 */ public String getDate() {
		return this.date;
	}

	/* 33 */ public String getInTime() {
		return this.inTime;
	}

	/* 34 */ public String getOutTime() {
		return this.outTime;
	}

	/* 35 */ public String getNote() {
		return this.note;
	}

	public String getImage() {
		/* 36 */ return this.image;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * VisitorsBook.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */