/*    */
package com.hms.management.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */
/*    */ @Entity
/*    */ @Table(name = "send_notification")
/*    */ public class SendNotification {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String title;
	/*    */ private String publishDate;
	/*    */ private String date;
	/*    */ private String message;
	/*    */ private String visibleStudent;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String visibleStaff;
	private String visibleParent;
	private String createdBy;
	private int createdId;
	private String isActive;
	private Date createdAt;
	private Date updatedAt;

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setVisibleStudent(String visibleStudent) {
		this.visibleStudent = visibleStudent;
	}

	public void setVisibleStaff(String visibleStaff) {
		this.visibleStaff = visibleStaff;
	}

	public void setVisibleParent(String visibleParent) {
		this.visibleParent = visibleParent;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public void setCreatedId(int createdId) {
		this.createdId = createdId;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof SendNotification))
			return false;
		SendNotification other = (SendNotification) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$title = getTitle(), other$title = other.getTitle();
		if ((this$title == null) ? (other$title != null) : !this$title.equals(other$title))
			return false;
		Object this$publishDate = getPublishDate(), other$publishDate = other.getPublishDate();
		if ((this$publishDate == null) ? (other$publishDate != null) : !this$publishDate.equals(other$publishDate))
			return false;
		Object this$date = getDate(), other$date = other.getDate();
		if ((this$date == null) ? (other$date != null) : !this$date.equals(other$date))
			return false;
		Object this$message = getMessage(), other$message = other.getMessage();
		if ((this$message == null) ? (other$message != null) : !this$message.equals(other$message))
			return false;
		Object this$visibleStudent = getVisibleStudent(), other$visibleStudent = other.getVisibleStudent();
		if ((this$visibleStudent == null) ? (other$visibleStudent != null)
				: !this$visibleStudent.equals(other$visibleStudent))
			return false;
		Object this$visibleStaff = getVisibleStaff(), other$visibleStaff = other.getVisibleStaff();
		if ((this$visibleStaff == null) ? (other$visibleStaff != null) : !this$visibleStaff.equals(other$visibleStaff))
			return false;
		Object this$visibleParent = getVisibleParent(), other$visibleParent = other.getVisibleParent();
		if ((this$visibleParent == null) ? (other$visibleParent != null)
				: !this$visibleParent.equals(other$visibleParent))
			return false;
		Object this$createdBy = getCreatedBy(), other$createdBy = other.getCreatedBy();
		if ((this$createdBy == null) ? (other$createdBy != null) : !this$createdBy.equals(other$createdBy))
			return false;
		if (getCreatedId() != other.getCreatedId())
			return false;
		Object this$isActive = getIsActive(), other$isActive = other.getIsActive();
		if ((this$isActive == null) ? (other$isActive != null) : !this$isActive.equals(other$isActive))
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		if ((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt))
			return false;
		Object this$updatedAt = getUpdatedAt(), other$updatedAt = other.getUpdatedAt();
		return !((this$updatedAt == null) ? (other$updatedAt != null) : !this$updatedAt.equals(other$updatedAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof SendNotification;
	}

	

	public String toString() {
		return "SendNotification(id=" + getId() + ", title=" + getTitle() + ", publishDate=" + getPublishDate()
				+ ", date=" + getDate() + ", message=" + getMessage() + ", visibleStudent=" + getVisibleStudent()
				+ ", visibleStaff=" + getVisibleStaff() + ", visibleParent=" + getVisibleParent() + ", createdBy="
				+ getCreatedBy() + ", createdId=" + getCreatedId() + ", isActive=" + getIsActive() + ", createdAt="
				+ getCreatedAt() + ", updatedAt=" + getUpdatedAt() + ")";
	}

	public SendNotification(int id, String title, String publishDate, String date, String message,
			String visibleStudent, String visibleStaff, String visibleParent, String createdBy, int createdId,
			String isActive, Date createdAt, Date updatedAt) {
		/* 17 */ this.id = id;
		this.title = title;
		this.publishDate = publishDate;
		this.date = date;
		this.message = message;
		this.visibleStudent = visibleStudent;
		this.visibleStaff = visibleStaff;
		this.visibleParent = visibleParent;
		this.createdBy = createdBy;
		this.createdId = createdId;
		this.isActive = isActive;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		/*    */ }

	/*    */
	/*    */ public SendNotification() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 24 */ return this.id;
		/* 25 */ }

	public String getTitle() {
		return this.title;
	}

	/* 26 */ public String getPublishDate() {
		return this.publishDate;
	}

	/* 27 */ public String getDate() {
		return this.date;
	}

	/* 28 */ public String getMessage() {
		return this.message;
	}

	/* 29 */ public String getVisibleStudent() {
		return this.visibleStudent;
	}

	/* 30 */ public String getVisibleStaff() {
		return this.visibleStaff;
	}

	/* 31 */ public String getVisibleParent() {
		return this.visibleParent;
	}

	/* 32 */ public String getCreatedBy() {
		return this.createdBy;
	}

	/* 33 */ public int getCreatedId() {
		return this.createdId;
	}

	/* 34 */ public String getIsActive() {
		return this.isActive;
	}

	/* 35 */ public Date getCreatedAt() {
		return this.createdAt;
	}

	public Date getUpdatedAt() {
		/* 36 */ return this.updatedAt;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * SendNotification.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */