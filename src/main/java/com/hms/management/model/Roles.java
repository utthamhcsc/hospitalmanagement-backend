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
/*    */ @Table(name = "roles")
/*    */ public class Roles {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String name;
	/*    */ private String slug;
	/*    */ private int isActive;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private int isSystem;
	private int isSuperadmin;
	private String createdAt;
	private String updatedAt;

	public void setName(String name) {
		this.name = name;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public void setIsSystem(int isSystem) {
		this.isSystem = isSystem;
	}

	public void setIsSuperadmin(int isSuperadmin) {
		this.isSuperadmin = isSuperadmin;
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
		if (!(o instanceof Roles))
			return false;
		Roles other = (Roles) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$name = getName(), other$name = other.getName();
		if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name))
			return false;
		Object this$slug = getSlug(), other$slug = other.getSlug();
		if ((this$slug == null) ? (other$slug != null) : !this$slug.equals(other$slug))
			return false;
		if (getIsActive() != other.getIsActive())
			return false;
		if (getIsSystem() != other.getIsSystem())
			return false;
		if (getIsSuperadmin() != other.getIsSuperadmin())
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		if ((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt))
			return false;
		Object this$updatedAt = getUpdatedAt(), other$updatedAt = other.getUpdatedAt();
		return !((this$updatedAt == null) ? (other$updatedAt != null) : !this$updatedAt.equals(other$updatedAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof Roles;
	}


	public String toString() {
		return "Roles(id=" + getId() + ", name=" + getName() + ", slug=" + getSlug() + ", isActive=" + getIsActive()
				+ ", isSystem=" + getIsSystem() + ", isSuperadmin=" + getIsSuperadmin() + ", createdAt="
				+ getCreatedAt() + ", updatedAt=" + getUpdatedAt() + ")";
	}

	public Roles(int id, String name, String slug, int isActive, int isSystem, int isSuperadmin, String createdAt,
			String updatedAt) {
		/* 15 */ this.id = id;
		this.name = name;
		this.slug = slug;
		this.isActive = isActive;
		this.isSystem = isSystem;
		this.isSuperadmin = isSuperadmin;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		/*    */ }

	/*    */
	/*    */ public Roles() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 22 */ return this.id;
		/* 23 */ }

	public String getName() {
		return this.name;
	}

	/* 24 */ public String getSlug() {
		return this.slug;
	}

	/* 25 */ public int getIsActive() {
		return this.isActive;
	}

	/* 26 */ public int getIsSystem() {
		return this.isSystem;
	}

	/* 27 */ public int getIsSuperadmin() {
		return this.isSuperadmin;
	}

	/* 28 */ public String getCreatedAt() {
		return this.createdAt;
	}

	public String getUpdatedAt() {
		/* 29 */ return this.updatedAt;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\Roles.
 * class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */