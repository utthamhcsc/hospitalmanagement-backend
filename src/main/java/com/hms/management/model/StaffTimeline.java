
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
/*    */ @Table(name = "staff_timeline")
/*    */ public class StaffTimeline {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private int staffId;
	/*    */ private String title;
	/*    */ private String timelineDate;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String description;
	private String document;
	private String status;
	private String date;

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setTimelineDate(String timelineDate) {
		this.timelineDate = timelineDate;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof StaffTimeline))
			return false;
		StaffTimeline other = (StaffTimeline) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getStaffId() != other.getStaffId())
			return false;
		Object this$title = getTitle(), other$title = other.getTitle();
		if ((this$title == null) ? (other$title != null) : !this$title.equals(other$title))
			return false;
		Object this$timelineDate = getTimelineDate(), other$timelineDate = other.getTimelineDate();
		if ((this$timelineDate == null) ? (other$timelineDate != null) : !this$timelineDate.equals(other$timelineDate))
			return false;
		Object this$description = getDescription(), other$description = other.getDescription();
		if ((this$description == null) ? (other$description != null) : !this$description.equals(other$description))
			return false;
		Object this$document = getDocument(), other$document = other.getDocument();
		if ((this$document == null) ? (other$document != null) : !this$document.equals(other$document))
			return false;
		Object this$status = getStatus(), other$status = other.getStatus();
		if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status))
			return false;
		Object this$date = getDate(), other$date = other.getDate();
		return !((this$date == null) ? (other$date != null) : !this$date.equals(other$date));
	}

	protected boolean canEqual(Object other) {
		return other instanceof StaffTimeline;
	}

	
	public String toString() {
		return "StaffTimeline(id=" + getId() + ", staffId=" + getStaffId() + ", title=" + getTitle() + ", timelineDate="
				+ getTimelineDate() + ", description=" + getDescription() + ", document=" + getDocument() + ", status="
				+ getStatus() + ", date=" + getDate() + ")";
	}

	public StaffTimeline(int id, int staffId, String title, String timelineDate, String description, String document,
			String status, String date) {
		/* 17 */ this.id = id;
		this.staffId = staffId;
		this.title = title;
		this.timelineDate = timelineDate;
		this.description = description;
		this.document = document;
		this.status = status;
		this.date = date;
		/*    */ }

	/*    */
	/*    */ public StaffTimeline() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 24 */ return this.id;
		/* 25 */ }

	public int getStaffId() {
		return this.staffId;
	}

	/* 26 */ public String getTitle() {
		return this.title;
	}

	/* 27 */ public String getTimelineDate() {
		return this.timelineDate;
	}

	/* 28 */ public String getDescription() {
		return this.description;
	}

	/* 29 */ public String getDocument() {
		return this.document;
	}

	/* 30 */ public String getStatus() {
		return this.status;
	}

	public String getDate() {
		/* 31 */ return this.date;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * StaffTimeline.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */