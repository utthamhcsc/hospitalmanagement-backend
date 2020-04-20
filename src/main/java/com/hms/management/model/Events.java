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
/*    */ @Table(name = "events")
/*    */ public class Events {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String eventTitle;
	/*    */ private String eventDescription;
	/*    */ private String startDate;

	/*    */
	/* 15 */ public void setId(int id) {
		this.id = id;
	}

	private String endDate;
	private String eventType;
	private String eventColor;
	private String eventFor;
	private String isActive;

	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public void setEventColor(String eventColor) {
		this.eventColor = eventColor;
	}

	public void setEventFor(String eventFor) {
		this.eventFor = eventFor;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Events))
			return false;
		Events other = (Events) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$eventTitle = getEventTitle(), other$eventTitle = other.getEventTitle();
		if ((this$eventTitle == null) ? (other$eventTitle != null) : !this$eventTitle.equals(other$eventTitle))
			return false;
		Object this$eventDescription = getEventDescription(), other$eventDescription = other.getEventDescription();
		if ((this$eventDescription == null) ? (other$eventDescription != null)
				: !this$eventDescription.equals(other$eventDescription))
			return false;
		Object this$startDate = getStartDate(), other$startDate = other.getStartDate();
		if ((this$startDate == null) ? (other$startDate != null) : !this$startDate.equals(other$startDate))
			return false;
		Object this$endDate = getEndDate(), other$endDate = other.getEndDate();
		if ((this$endDate == null) ? (other$endDate != null) : !this$endDate.equals(other$endDate))
			return false;
		Object this$eventType = getEventType(), other$eventType = other.getEventType();
		if ((this$eventType == null) ? (other$eventType != null) : !this$eventType.equals(other$eventType))
			return false;
		Object this$eventColor = getEventColor(), other$eventColor = other.getEventColor();
		if ((this$eventColor == null) ? (other$eventColor != null) : !this$eventColor.equals(other$eventColor))
			return false;
		Object this$eventFor = getEventFor(), other$eventFor = other.getEventFor();
		if ((this$eventFor == null) ? (other$eventFor != null) : !this$eventFor.equals(other$eventFor))
			return false;
		Object this$isActive = getIsActive(), other$isActive = other.getIsActive();
		return !((this$isActive == null) ? (other$isActive != null) : !this$isActive.equals(other$isActive));
	}

	protected boolean canEqual(Object other) {
		return other instanceof Events;
	}

	

	public String toString() {
		return "Events(id=" + getId() + ", eventTitle=" + getEventTitle() + ", eventDescription="
				+ getEventDescription() + ", startDate=" + getStartDate() + ", endDate=" + getEndDate() + ", eventType="
				+ getEventType() + ", eventColor=" + getEventColor() + ", eventFor=" + getEventFor() + ", isActive="
				+ getIsActive() + ")";
	}

	public Events(int id, String eventTitle, String eventDescription, String startDate, String endDate,
			String eventType, String eventColor, String eventFor, String isActive) {
		/* 16 */ this.id = id;
		this.eventTitle = eventTitle;
		this.eventDescription = eventDescription;
		this.startDate = startDate;
		this.endDate = endDate;
		this.eventType = eventType;
		this.eventColor = eventColor;
		this.eventFor = eventFor;
		this.isActive = isActive;
		/*    */ }

	/*    */
	/*    */ public Events() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 23 */ return this.id;
		/* 24 */ }

	public String getEventTitle() {
		return this.eventTitle;
	}

	/* 25 */ public String getEventDescription() {
		return this.eventDescription;
	}

	/* 26 */ public String getStartDate() {
		return this.startDate;
	}

	/* 27 */ public String getEndDate() {
		return this.endDate;
	}

	/* 28 */ public String getEventType() {
		return this.eventType;
	}

	/* 29 */ public String getEventColor() {
		return this.eventColor;
	}

	/* 30 */ public String getEventFor() {
		return this.eventFor;
	}

	public String getIsActive() {
		/* 31 */ return this.isActive;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\Events.
 * class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */