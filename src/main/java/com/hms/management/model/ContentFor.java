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
/*    */ @Table(name = "content_for")
/*    */ public class ContentFor {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String role;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private int contentId;
	private int userId;
	private String createdAt;

	public void setRole(String role) {
		this.role = role;
	}

	public void setContentId(int contentId) {
		this.contentId = contentId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof ContentFor))
			return false;
		ContentFor other = (ContentFor) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$role = getRole(), other$role = other.getRole();
		if ((this$role == null) ? (other$role != null) : !this$role.equals(other$role))
			return false;
		if (getContentId() != other.getContentId())
			return false;
		if (getUserId() != other.getUserId())
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		return !((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof ContentFor;
	}

	

	public String toString() {
		return "ContentFor(id=" + getId() + ", role=" + getRole() + ", contentId=" + getContentId() + ", userId="
				+ getUserId() + ", createdAt=" + getCreatedAt() + ")";
	}

	public ContentFor(int id, String role, int contentId, int userId, String createdAt) {
		/* 17 */ this.id = id;
		this.role = role;
		this.contentId = contentId;
		this.userId = userId;
		this.createdAt = createdAt;
		/*    */ }

	/*    */
	/*    */
	/*    */ public ContentFor() {
	}

	/*    */
	/*    */
	/*    */ public int getId() {
		/* 25 */ return this.id;
		/* 26 */ }

	public String getRole() {
		return this.role;
	}

	/* 27 */ public int getContentId() {
		return this.contentId;
	}

	/* 28 */ public int getUserId() {
		return this.userId;
	}

	public String getCreatedAt() {
		/* 29 */ return this.createdAt;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\ContentFor
 * .class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */