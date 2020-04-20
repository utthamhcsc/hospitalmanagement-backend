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
/*    */ @Table(name = "users")
/*    */ public class Users {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private int userId;
	/*    */ private String username;
	/*    */ private String password;
	/*    */ private String childs;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String role;
	private String verificationCode;
	private String isActive;
	private String createdAt;
	private String updatedAt;

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setChilds(String childs) {
		this.childs = childs;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
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
		if (!(o instanceof Users))
			return false;
		Users other = (Users) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getUserId() != other.getUserId())
			return false;
		Object this$username = getUsername(), other$username = other.getUsername();
		if ((this$username == null) ? (other$username != null) : !this$username.equals(other$username))
			return false;
		Object this$password = getPassword(), other$password = other.getPassword();
		if ((this$password == null) ? (other$password != null) : !this$password.equals(other$password))
			return false;
		Object this$childs = getChilds(), other$childs = other.getChilds();
		if ((this$childs == null) ? (other$childs != null) : !this$childs.equals(other$childs))
			return false;
		Object this$role = getRole(), other$role = other.getRole();
		if ((this$role == null) ? (other$role != null) : !this$role.equals(other$role))
			return false;
		Object this$verificationCode = getVerificationCode(), other$verificationCode = other.getVerificationCode();
		if ((this$verificationCode == null) ? (other$verificationCode != null)
				: !this$verificationCode.equals(other$verificationCode))
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
		return other instanceof Users;
	}

	

	public String toString() {
		return "Users(id=" + getId() + ", userId=" + getUserId() + ", username=" + getUsername() + ", password="
				+ getPassword() + ", childs=" + getChilds() + ", role=" + getRole() + ", verificationCode="
				+ getVerificationCode() + ", isActive=" + getIsActive() + ", createdAt=" + getCreatedAt()
				+ ", updatedAt=" + getUpdatedAt() + ")";
	}

	public Users(int id, int userId, String username, String password, String childs, String role,
			String verificationCode, String isActive, String createdAt, String updatedAt) {
		/* 17 */ this.id = id;
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.childs = childs;
		this.role = role;
		this.verificationCode = verificationCode;
		this.isActive = isActive;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		/*    */ }

	/*    */
	/*    */ public Users() {
	}

	/*    */
	/*    */ public int getId() {
		/* 23 */ return this.id;
		/* 24 */ }

	public int getUserId() {
		return this.userId;
	}

	/* 25 */ public String getUsername() {
		return this.username;
	}

	/* 26 */ public String getPassword() {
		return this.password;
	}

	/* 27 */ public String getChilds() {
		return this.childs;
	}

	/* 28 */ public String getRole() {
		return this.role;
	}

	/* 29 */ public String getVerificationCode() {
		return this.verificationCode;
	}

	/* 30 */ public String getIsActive() {
		return this.isActive;
	}

	/* 31 */ public String getCreatedAt() {
		return this.createdAt;
	}

	public String getUpdatedAt() {
		/* 32 */ return this.updatedAt;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\Users.
 * class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */