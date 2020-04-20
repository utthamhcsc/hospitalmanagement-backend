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
/*    */ @Table(name = "PhoneCallLogList")
/*    */ public class PhoneCallLogList {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String name;
	/*    */ private String date;
	/*    */ private String phone;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String nextFallowUpDate;
	private String description;
	private String callDuretion;
	private String callType;
	private String note;

	public void setName(String name) {
		this.name = name;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setNextFallowUpDate(String nextFallowUpDate) {
		this.nextFallowUpDate = nextFallowUpDate;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCallDuretion(String callDuretion) {
		this.callDuretion = callDuretion;
	}

	public void setCallType(String callType) {
		this.callType = callType;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof PhoneCallLogList))
			return false;
		PhoneCallLogList other = (PhoneCallLogList) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$name = getName(), other$name = other.getName();
		if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name))
			return false;
		Object this$date = getDate(), other$date = other.getDate();
		if ((this$date == null) ? (other$date != null) : !this$date.equals(other$date))
			return false;
		Object this$phone = getPhone(), other$phone = other.getPhone();
		if ((this$phone == null) ? (other$phone != null) : !this$phone.equals(other$phone))
			return false;
		Object this$nextFallowUpDate = getNextFallowUpDate(), other$nextFallowUpDate = other.getNextFallowUpDate();
		if ((this$nextFallowUpDate == null) ? (other$nextFallowUpDate != null)
				: !this$nextFallowUpDate.equals(other$nextFallowUpDate))
			return false;
		Object this$description = getDescription(), other$description = other.getDescription();
		if ((this$description == null) ? (other$description != null) : !this$description.equals(other$description))
			return false;
		Object this$callDuretion = getCallDuretion(), other$callDuretion = other.getCallDuretion();
		if ((this$callDuretion == null) ? (other$callDuretion != null) : !this$callDuretion.equals(other$callDuretion))
			return false;
		Object this$callType = getCallType(), other$callType = other.getCallType();
		if ((this$callType == null) ? (other$callType != null) : !this$callType.equals(other$callType))
			return false;
		Object this$note = getNote(), other$note = other.getNote();
		return !((this$note == null) ? (other$note != null) : !this$note.equals(other$note));
	}

	protected boolean canEqual(Object other) {
		return other instanceof PhoneCallLogList;
	}

	

	public String toString() {
		return "PhoneCallLogList(id=" + getId() + ", name=" + getName() + ", date=" + getDate() + ", phone="
				+ getPhone() + ", nextFallowUpDate=" + getNextFallowUpDate() + ", description=" + getDescription()
				+ ", callDuretion=" + getCallDuretion() + ", callType=" + getCallType() + ", note=" + getNote() + ")";
	}

	public PhoneCallLogList(int id, String name, String date, String phone, String nextFallowUpDate, String description,
			String callDuretion, String callType, String note) {
		/* 15 */ this.id = id;
		this.name = name;
		this.date = date;
		this.phone = phone;
		this.nextFallowUpDate = nextFallowUpDate;
		this.description = description;
		this.callDuretion = callDuretion;
		this.callType = callType;
		this.note = note;
		/*    */ }

	/*    */
	/*    */ public PhoneCallLogList() {
	}

	/*    */
	/*    */ public int getId() {
		/* 21 */ return this.id;
		/* 22 */ }

	public String getName() {
		return this.name;
	}

	/* 23 */ public String getDate() {
		return this.date;
	}

	/* 24 */ public String getPhone() {
		return this.phone;
	}

	/* 25 */ public String getNextFallowUpDate() {
		return this.nextFallowUpDate;
	}

	/* 26 */ public String getDescription() {
		return this.description;
	}

	/* 27 */ public String getCallDuretion() {
		return this.callDuretion;
	}

	/* 28 */ public String getCallType() {
		return this.callType;
	}

	public String getNote() {
		/* 29 */ return this.note;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * PhoneCallLogList.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */