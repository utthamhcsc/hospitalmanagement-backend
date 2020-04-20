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
/*    */ @Table(name = "read_notification")
/*    */ public class ReadNotification {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private int studentId;
	/*    */ private int parentId;
	/*    */ private int staffId;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private int notificationId;
	private String isActive;
	private String createdAt;
	private String updatedAt;

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public void setNotificationId(int notificationId) {
		this.notificationId = notificationId;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof ReadNotification))
			return false;
		ReadNotification other = (ReadNotification) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getStudentId() != other.getStudentId())
			return false;
		if (getParentId() != other.getParentId())
			return false;
		if (getStaffId() != other.getStaffId())
			return false;
		if (getNotificationId() != other.getNotificationId())
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
		return other instanceof ReadNotification;
	}

	
	public String toString() {
		return "ReadNotification(id=" + getId() + ", studentId=" + getStudentId() + ", parentId=" + getParentId()
				+ ", staffId=" + getStaffId() + ", notificationId=" + getNotificationId() + ", isActive="
				+ getIsActive() + ", createdAt=" + getCreatedAt() + ", updatedAt=" + getUpdatedAt() + ")";
	}

	public ReadNotification(int id, int studentId, int parentId, int staffId, int notificationId, String isActive,
			String createdAt, String updatedAt) {
		/* 15 */ this.id = id;
		this.studentId = studentId;
		this.parentId = parentId;
		this.staffId = staffId;
		this.notificationId = notificationId;
		this.isActive = isActive;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		/*    */ }

	/*    */
	/*    */ public ReadNotification() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 22 */ return this.id;
		/* 23 */ }

	public int getStudentId() {
		return this.studentId;
	}

	/* 24 */ public int getParentId() {
		return this.parentId;
	}

	/* 25 */ public int getStaffId() {
		return this.staffId;
	}

	/* 26 */ public int getNotificationId() {
		return this.notificationId;
	}

	/* 27 */ public String getIsActive() {
		return this.isActive;
	}

	/* 28 */ public String getCreatedAt() {
		return this.createdAt;
	}

	public String getUpdatedAt() {
		/* 29 */ return this.updatedAt;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * ReadNotification.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */