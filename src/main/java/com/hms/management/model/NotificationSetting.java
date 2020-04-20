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
/*    */ @Table(name = "notification_setting")
/*    */ public class NotificationSetting {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String type;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String isMail;
	private String isSms;
	private String createdAt;

	public void setType(String type) {
		this.type = type;
	}

	public void setIsMail(String isMail) {
		this.isMail = isMail;
	}

	public void setIsSms(String isSms) {
		this.isSms = isSms;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof NotificationSetting))
			return false;
		NotificationSetting other = (NotificationSetting) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$type = getType(), other$type = other.getType();
		if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type))
			return false;
		Object this$isMail = getIsMail(), other$isMail = other.getIsMail();
		if ((this$isMail == null) ? (other$isMail != null) : !this$isMail.equals(other$isMail))
			return false;
		Object this$isSms = getIsSms(), other$isSms = other.getIsSms();
		if ((this$isSms == null) ? (other$isSms != null) : !this$isSms.equals(other$isSms))
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		return !((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof NotificationSetting;
	}

	

	public String toString() {
		return "NotificationSetting(id=" + getId() + ", type=" + getType() + ", isMail=" + getIsMail() + ", isSms="
				+ getIsSms() + ", createdAt=" + getCreatedAt() + ")";
	}

	public NotificationSetting(int id, String type, String isMail, String isSms, String createdAt) {
		/* 17 */ this.id = id;
		this.type = type;
		this.isMail = isMail;
		this.isSms = isSms;
		this.createdAt = createdAt;
		/*    */ }

	/*    */
	/*    */ public NotificationSetting() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 24 */ return this.id;
		/* 25 */ }

	public String getType() {
		return this.type;
	}

	/* 26 */ public String getIsMail() {
		return this.isMail;
	}

	/* 27 */ public String getIsSms() {
		return this.isSms;
	}

	public String getCreatedAt() {
		/* 28 */ return this.createdAt;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * NotificationSetting.class Java compiler version: 8 (52.0) JD-Core Version:
 * 1.1.3
 */