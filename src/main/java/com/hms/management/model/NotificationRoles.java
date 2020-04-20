/*    */
package com.hms.management.model;

/*    */
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "notification_roles")
/*    */ public class NotificationRoles {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private int sendNotificationId;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private int roleId;
	private int isActive;
	private String createdAt;

	public void setSendNotificationId(int sendNotificationId) {
		this.sendNotificationId = sendNotificationId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof NotificationRoles))
			return false;
		NotificationRoles other = (NotificationRoles) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getSendNotificationId() != other.getSendNotificationId())
			return false;
		if (getRoleId() != other.getRoleId())
			return false;
		if (getIsActive() != other.getIsActive())
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		return !((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof NotificationRoles;
	}

	public String toString() {
		return "NotificationRoles(id=" + getId() + ", sendNotificationId=" + getSendNotificationId() + ", roleId="
				+ getRoleId() + ", isActive=" + getIsActive() + ", createdAt=" + getCreatedAt() + ")";
	}

	public NotificationRoles(int id, int sendNotificationId, int roleId, int isActive, String createdAt) {
		/* 17 */ this.id = id;
		this.sendNotificationId = sendNotificationId;
		this.roleId = roleId;
		this.isActive = isActive;
		this.createdAt = createdAt;
		/*    */ }

	/*    */
	/*    */ public NotificationRoles() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 24 */ return this.id;
		/* 25 */ }

	public int getSendNotificationId() {
		return this.sendNotificationId;
	}

	/* 26 */ public int getRoleId() {
		return this.roleId;
	}

	/* 27 */ public int getIsActive() {
		return this.isActive;
	}

	public String getCreatedAt() {
		/* 28 */ return this.createdAt;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * NotificationRoles.class Java compiler version: 8 (52.0) JD-Core Version:
 * 1.1.3
 */