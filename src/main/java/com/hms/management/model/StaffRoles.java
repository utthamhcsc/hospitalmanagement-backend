
/*    */
package com.hms.management.model;

/*    */
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "staff_roles")
/*    */ public class StaffRoles {
	/*    */ @Id
	/*    */ private int id;
	/*    */ private int roleId;
	/*    */ private int staffId;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private int isActive;
	private String createdAt;
	private String updatedAt;

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public void setIsActive(int isActive) {
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
		if (!(o instanceof StaffRoles))
			return false;
		StaffRoles other = (StaffRoles) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getRoleId() != other.getRoleId())
			return false;
		if (getStaffId() != other.getStaffId())
			return false;
		if (getIsActive() != other.getIsActive())
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		if ((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt))
			return false;
		Object this$updatedAt = getUpdatedAt(), other$updatedAt = other.getUpdatedAt();
		return !((this$updatedAt == null) ? (other$updatedAt != null) : !this$updatedAt.equals(other$updatedAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof StaffRoles;
	}

	

	public String toString() {
		return "StaffRoles(id=" + getId() + ", roleId=" + getRoleId() + ", staffId=" + getStaffId() + ", isActive="
				+ getIsActive() + ", createdAt=" + getCreatedAt() + ", updatedAt=" + getUpdatedAt() + ")";
	}

	public StaffRoles(int id, int roleId, int staffId, int isActive, String createdAt, String updatedAt) {
		/* 15 */ this.id = id;
		this.roleId = roleId;
		this.staffId = staffId;
		this.isActive = isActive;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		/*    */ }

	/*    */
	/*    */ public StaffRoles() {
	}

	/*    */
	/* 20 */ public int getId() {
		return this.id;
	}

	/* 21 */ public int getRoleId() {
		return this.roleId;
	}

	/* 22 */ public int getStaffId() {
		return this.staffId;
	}

	/* 23 */ public int getIsActive() {
		return this.isActive;
	}

	/* 24 */ public String getCreatedAt() {
		return this.createdAt;
	}

	public String getUpdatedAt() {
		/* 25 */ return this.updatedAt;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\StaffRoles
 * .class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */