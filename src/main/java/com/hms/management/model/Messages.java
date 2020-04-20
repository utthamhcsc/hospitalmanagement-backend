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
/*    */ @Table(name = "messages")
/*    */ public class Messages {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String title;
	/*    */ private String message;
	/*    */ private String sendMail;
	/*    */ private String sendSms;
	/*    */ private String isGroup;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String isIndividual;
	private int isClass;
	private String groupList;
	private String userList;
	private String createdAt;
	private String updatedAt;

	public void setTitle(String title) {
		this.title = title;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setSendMail(String sendMail) {
		this.sendMail = sendMail;
	}

	public void setSendSms(String sendSms) {
		this.sendSms = sendSms;
	}

	public void setIsGroup(String isGroup) {
		this.isGroup = isGroup;
	}

	public void setIsIndividual(String isIndividual) {
		this.isIndividual = isIndividual;
	}

	public void setIsClass(int isClass) {
		this.isClass = isClass;
	}

	public void setGroupList(String groupList) {
		this.groupList = groupList;
	}

	public void setUserList(String userList) {
		this.userList = userList;
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
		if (!(o instanceof Messages))
			return false;
		Messages other = (Messages) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$title = getTitle(), other$title = other.getTitle();
		if ((this$title == null) ? (other$title != null) : !this$title.equals(other$title))
			return false;
		Object this$message = getMessage(), other$message = other.getMessage();
		if ((this$message == null) ? (other$message != null) : !this$message.equals(other$message))
			return false;
		Object this$sendMail = getSendMail(), other$sendMail = other.getSendMail();
		if ((this$sendMail == null) ? (other$sendMail != null) : !this$sendMail.equals(other$sendMail))
			return false;
		Object this$sendSms = getSendSms(), other$sendSms = other.getSendSms();
		if ((this$sendSms == null) ? (other$sendSms != null) : !this$sendSms.equals(other$sendSms))
			return false;
		Object this$isGroup = getIsGroup(), other$isGroup = other.getIsGroup();
		if ((this$isGroup == null) ? (other$isGroup != null) : !this$isGroup.equals(other$isGroup))
			return false;
		Object this$isIndividual = getIsIndividual(), other$isIndividual = other.getIsIndividual();
		if ((this$isIndividual == null) ? (other$isIndividual != null) : !this$isIndividual.equals(other$isIndividual))
			return false;
		if (getIsClass() != other.getIsClass())
			return false;
		Object this$groupList = getGroupList(), other$groupList = other.getGroupList();
		if ((this$groupList == null) ? (other$groupList != null) : !this$groupList.equals(other$groupList))
			return false;
		Object this$userList = getUserList(), other$userList = other.getUserList();
		if ((this$userList == null) ? (other$userList != null) : !this$userList.equals(other$userList))
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		if ((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt))
			return false;
		Object this$updatedAt = getUpdatedAt(), other$updatedAt = other.getUpdatedAt();
		return !((this$updatedAt == null) ? (other$updatedAt != null) : !this$updatedAt.equals(other$updatedAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof Messages;
	}

	
	public String toString() {
		return "Messages(id=" + getId() + ", title=" + getTitle() + ", message=" + getMessage() + ", sendMail="
				+ getSendMail() + ", sendSms=" + getSendSms() + ", isGroup=" + getIsGroup() + ", isIndividual="
				+ getIsIndividual() + ", isClass=" + getIsClass() + ", groupList=" + getGroupList() + ", userList="
				+ getUserList() + ", createdAt=" + getCreatedAt() + ", updatedAt=" + getUpdatedAt() + ")";
	}

	public Messages(int id, String title, String message, String sendMail, String sendSms, String isGroup,
			String isIndividual, int isClass, String groupList, String userList, String createdAt, String updatedAt) {
		/* 17 */ this.id = id;
		this.title = title;
		this.message = message;
		this.sendMail = sendMail;
		this.sendSms = sendSms;
		this.isGroup = isGroup;
		this.isIndividual = isIndividual;
		this.isClass = isClass;
		this.groupList = groupList;
		this.userList = userList;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		/*    */ }

	/*    */
	/*    */ public Messages() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 24 */ return this.id;
		/* 25 */ }

	public String getTitle() {
		return this.title;
	}

	/* 26 */ public String getMessage() {
		return this.message;
	}

	/* 27 */ public String getSendMail() {
		return this.sendMail;
	}

	/* 28 */ public String getSendSms() {
		return this.sendSms;
	}

	/* 29 */ public String getIsGroup() {
		return this.isGroup;
	}

	/* 30 */ public String getIsIndividual() {
		return this.isIndividual;
	}

	/* 31 */ public int getIsClass() {
		return this.isClass;
	}

	/* 32 */ public String getGroupList() {
		return this.groupList;
	}

	/* 33 */ public String getUserList() {
		return this.userList;
	}

	/* 34 */ public String getCreatedAt() {
		return this.createdAt;
	}

	public String getUpdatedAt() {
		/* 35 */ return this.updatedAt;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\Messages.
 * class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */