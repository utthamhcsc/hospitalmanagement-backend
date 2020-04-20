/*    */
package com.hms.management.model;

/*    */
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
/*    */ import javax.persistence.GenerationType;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "permission_group")
/*    */ public class PermissionGroup {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String name;
	/*    */ private String shortCode;

	/*    */
	/* 18 */ public void setId(int id) {
		this.id = id;
	}

	private int isActive;
	private int system;
	private int sortOrder;
	private String createdAt;

	public void setName(String name) {
		this.name = name;
	}

	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public void setSystem(int system) {
		this.system = system;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof PermissionGroup))
			return false;
		PermissionGroup other = (PermissionGroup) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$name = getName(), other$name = other.getName();
		if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name))
			return false;
		Object this$shortCode = getShortCode(), other$shortCode = other.getShortCode();
		if ((this$shortCode == null) ? (other$shortCode != null) : !this$shortCode.equals(other$shortCode))
			return false;
		if (getIsActive() != other.getIsActive())
			return false;
		if (getSystem() != other.getSystem())
			return false;
		if (getSortOrder() != other.getSortOrder())
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		return !((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof PermissionGroup;
	}

	public String toString() {
		return "PermissionGroup(id=" + getId() + ", name=" + getName() + ", shortCode=" + getShortCode() + ", isActive="
				+ getIsActive() + ", system=" + getSystem() + ", sortOrder=" + getSortOrder() + ", createdAt="
				+ getCreatedAt() + ")";
	}

	public PermissionGroup(int id, String name, String shortCode, int isActive, int system, int sortOrder,
			String createdAt) {
		/* 19 */ this.id = id;
		this.name = name;
		this.shortCode = shortCode;
		this.isActive = isActive;
		this.system = system;
		this.sortOrder = sortOrder;
		this.createdAt = createdAt;
		/*    */ }

	/*    */
	/*    */ public PermissionGroup() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 26 */ return this.id;
		/* 27 */ }

	public String getName() {
		return this.name;
	}

	/* 28 */ public String getShortCode() {
		return this.shortCode;
	}

	/* 29 */ public int getIsActive() {
		return this.isActive;
	}

	/* 30 */ public int getSystem() {
		return this.system;
	}

	/* 31 */ public int getSortOrder() {
		return this.sortOrder;
	}

	public String getCreatedAt() {
		/* 32 */ return this.createdAt;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * PermissionGroup.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */