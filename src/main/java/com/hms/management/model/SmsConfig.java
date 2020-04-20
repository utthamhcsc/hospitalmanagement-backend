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
/*    */ @Table(name = "sms_config")
/*    */ public class SmsConfig {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String type;
	/*    */ private String name;
	/*    */ private String apiId;
	/*    */ private String authkey;
	/*    */ private String senderid;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String contact;
	private String username;
	private String url;
	private String password;
	private String isActive;
	private String createdAt;
	private String updatedAt;

	public void setType(String type) {
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
	}

	public void setAuthkey(String authkey) {
		this.authkey = authkey;
	}

	public void setSenderid(String senderid) {
		this.senderid = senderid;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setPassword(String password) {
		this.password = password;
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
		if (!(o instanceof SmsConfig))
			return false;
		SmsConfig other = (SmsConfig) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$type = getType(), other$type = other.getType();
		if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type))
			return false;
		Object this$name = getName(), other$name = other.getName();
		if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name))
			return false;
		Object this$apiId = getApiId(), other$apiId = other.getApiId();
		if ((this$apiId == null) ? (other$apiId != null) : !this$apiId.equals(other$apiId))
			return false;
		Object this$authkey = getAuthkey(), other$authkey = other.getAuthkey();
		if ((this$authkey == null) ? (other$authkey != null) : !this$authkey.equals(other$authkey))
			return false;
		Object this$senderid = getSenderid(), other$senderid = other.getSenderid();
		if ((this$senderid == null) ? (other$senderid != null) : !this$senderid.equals(other$senderid))
			return false;
		Object this$contact = getContact(), other$contact = other.getContact();
		if ((this$contact == null) ? (other$contact != null) : !this$contact.equals(other$contact))
			return false;
		Object this$username = getUsername(), other$username = other.getUsername();
		if ((this$username == null) ? (other$username != null) : !this$username.equals(other$username))
			return false;
		Object this$url = getUrl(), other$url = other.getUrl();
		if ((this$url == null) ? (other$url != null) : !this$url.equals(other$url))
			return false;
		Object this$password = getPassword(), other$password = other.getPassword();
		if ((this$password == null) ? (other$password != null) : !this$password.equals(other$password))
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
		return other instanceof SmsConfig;
	}


	public String toString() {
		return "SmsConfig(id=" + getId() + ", type=" + getType() + ", name=" + getName() + ", apiId=" + getApiId()
				+ ", authkey=" + getAuthkey() + ", senderid=" + getSenderid() + ", contact=" + getContact()
				+ ", username=" + getUsername() + ", url=" + getUrl() + ", password=" + getPassword() + ", isActive="
				+ getIsActive() + ", createdAt=" + getCreatedAt() + ", updatedAt=" + getUpdatedAt() + ")";
	}

	public SmsConfig(int id, String type, String name, String apiId, String authkey, String senderid, String contact,
			String username, String url, String password, String isActive, String createdAt, String updatedAt) {
		/* 17 */ this.id = id;
		this.type = type;
		this.name = name;
		this.apiId = apiId;
		this.authkey = authkey;
		this.senderid = senderid;
		this.contact = contact;
		this.username = username;
		this.url = url;
		this.password = password;
		this.isActive = isActive;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		/*    */ }

	/*    */
	/*    */ public SmsConfig() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 24 */ return this.id;
		/* 25 */ }

	public String getType() {
		return this.type;
	}

	/* 26 */ public String getName() {
		return this.name;
	}

	/* 27 */ public String getApiId() {
		return this.apiId;
	}

	/* 28 */ public String getAuthkey() {
		return this.authkey;
	}

	/* 29 */ public String getSenderid() {
		return this.senderid;
	}

	/* 30 */ public String getContact() {
		return this.contact;
	}

	/* 31 */ public String getUsername() {
		return this.username;
	}

	/* 32 */ public String getUrl() {
		return this.url;
	}

	/* 33 */ public String getPassword() {
		return this.password;
	}

	/* 34 */ public String getIsActive() {
		return this.isActive;
	}

	/* 35 */ public String getCreatedAt() {
		return this.createdAt;
	}

	public String getUpdatedAt() {
		/* 36 */ return this.updatedAt;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\SmsConfig.
 * class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */