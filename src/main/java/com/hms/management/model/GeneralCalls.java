
/*    */
package com.hms.management.model;

/*    */
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "general_calls")
/*    */ public class GeneralCalls {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String name;
	/*    */ private String contact;
	/*    */ private String date;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String description;
	private String followUpDate;
	private String callDureation;
	private String note;
	private String callType;

	public void setName(String name) {
		this.name = name;
	}

	public void setContact(String contact) {
		this.contact = contact;
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

	public void setCallDureation(String callDureation) {
		this.callDureation = callDureation;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setCallType(String callType) {
		this.callType = callType;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof GeneralCalls))
			return false;
		GeneralCalls other = (GeneralCalls) o;
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
		Object this$date = getDate(), other$date = other.getDate();
		if ((this$date == null) ? (other$date != null) : !this$date.equals(other$date))
			return false;
		Object this$description = getDescription(), other$description = other.getDescription();
		if ((this$description == null) ? (other$description != null) : !this$description.equals(other$description))
			return false;
		Object this$followUpDate = getFollowUpDate(), other$followUpDate = other.getFollowUpDate();
		if ((this$followUpDate == null) ? (other$followUpDate != null) : !this$followUpDate.equals(other$followUpDate))
			return false;
		Object this$callDureation = getCallDureation(), other$callDureation = other.getCallDureation();
		if ((this$callDureation == null) ? (other$callDureation != null)
				: !this$callDureation.equals(other$callDureation))
			return false;
		Object this$note = getNote(), other$note = other.getNote();
		if ((this$note == null) ? (other$note != null) : !this$note.equals(other$note))
			return false;
		Object this$callType = getCallType(), other$callType = other.getCallType();
		return !((this$callType == null) ? (other$callType != null) : !this$callType.equals(other$callType));
	}

	protected boolean canEqual(Object other) {
		return other instanceof GeneralCalls;
	}


	public String toString() {
		return "GeneralCalls(id=" + getId() + ", name=" + getName() + ", contact=" + getContact() + ", date="
				+ getDate() + ", description=" + getDescription() + ", followUpDate=" + getFollowUpDate()
				+ ", callDureation=" + getCallDureation() + ", note=" + getNote() + ", callType=" + getCallType() + ")";
	}

	public GeneralCalls(int id, String name, String contact, String date, String description, String followUpDate,
			String callDureation, String note, String callType) {
		/* 17 */ this.id = id;
		this.name = name;
		this.contact = contact;
		this.date = date;
		this.description = description;
		this.followUpDate = followUpDate;
		this.callDureation = callDureation;
		this.note = note;
		this.callType = callType;
		/*    */ }

	/*    */
	/*    */ public GeneralCalls() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 24 */ return this.id;
		/* 25 */ }

	public String getName() {
		return this.name;
	}

	/* 26 */ public String getContact() {
		return this.contact;
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

	/* 30 */ public String getCallDureation() {
		return this.callDureation;
	}

	/* 31 */ public String getNote() {
		return this.note;
	}

	public String getCallType() {
		/* 32 */ return this.callType;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * GeneralCalls.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */