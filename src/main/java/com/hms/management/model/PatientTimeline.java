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
/*    */ @Table(name = "patient_timeline")
/*    */ public class PatientTimeline {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private int patientId;
	/*    */ private String title;
	/*    */ private String timelineDate;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String description;
	private String document;
	private String status;
	private String date;

	public void setPatientId(int patientId) {
		this.patientId = patientId;
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
		if (!(o instanceof PatientTimeline))
			return false;
		PatientTimeline other = (PatientTimeline) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getPatientId() != other.getPatientId())
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
		return other instanceof PatientTimeline;
	}

	

	public String toString() {
		return "PatientTimeline(id=" + getId() + ", patientId=" + getPatientId() + ", title=" + getTitle()
				+ ", timelineDate=" + getTimelineDate() + ", description=" + getDescription() + ", document="
				+ getDocument() + ", status=" + getStatus() + ", date=" + getDate() + ")";
	}

	public PatientTimeline(int id, int patientId, String title, String timelineDate, String description,
			String document, String status, String date) {
		/* 15 */ this.id = id;
		this.patientId = patientId;
		this.title = title;
		this.timelineDate = timelineDate;
		this.description = description;
		this.document = document;
		this.status = status;
		this.date = date;
		/*    */ }

	/*    */
	/*    */ public PatientTimeline() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 22 */ return this.id;
		/* 23 */ }

	public int getPatientId() {
		return this.patientId;
	}

	/* 24 */ public String getTitle() {
		return this.title;
	}

	/* 25 */ public String getTimelineDate() {
		return this.timelineDate;
	}

	/* 26 */ public String getDescription() {
		return this.description;
	}

	/* 27 */ public String getDocument() {
		return this.document;
	}

	/* 28 */ public String getStatus() {
		return this.status;
	}

	public String getDate() {
		/* 29 */ return this.date;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * PatientTimeline.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */