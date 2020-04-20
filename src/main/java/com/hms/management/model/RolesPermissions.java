
/*    */
package com.hms.management.model;

/*    */
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "roles_permissions")
/*    */ public class RolesPermissions {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private int roleId;
	/*    */ private int permCatId;
	/*    */ private int canView;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private int canAdd;
	private int canEdit;
	private int canDelete;
	private String createdAt;

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public void setPermCatId(int permCatId) {
		this.permCatId = permCatId;
	}

	public void setCanView(int canView) {
		this.canView = canView;
	}

	public void setCanAdd(int canAdd) {
		this.canAdd = canAdd;
	}

	public void setCanEdit(int canEdit) {
		this.canEdit = canEdit;
	}

	public void setCanDelete(int canDelete) {
		this.canDelete = canDelete;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof RolesPermissions))
			return false;
		RolesPermissions other = (RolesPermissions) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getRoleId() != other.getRoleId())
			return false;
		if (getPermCatId() != other.getPermCatId())
			return false;
		if (getCanView() != other.getCanView())
			return false;
		if (getCanAdd() != other.getCanAdd())
			return false;
		if (getCanEdit() != other.getCanEdit())
			return false;
		if (getCanDelete() != other.getCanDelete())
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		return !((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof RolesPermissions;
	}



	public String toString() {
		return "RolesPermissions(id=" + getId() + ", roleId=" + getRoleId() + ", permCatId=" + getPermCatId()
				+ ", canView=" + getCanView() + ", canAdd=" + getCanAdd() + ", canEdit=" + getCanEdit() + ", canDelete="
				+ getCanDelete() + ", createdAt=" + getCreatedAt() + ")";
	}

	public RolesPermissions(int id, int roleId, int permCatId, int canView, int canAdd, int canEdit, int canDelete,
			String createdAt) {
		/* 17 */ this.id = id;
		this.roleId = roleId;
		this.permCatId = permCatId;
		this.canView = canView;
		this.canAdd = canAdd;
		this.canEdit = canEdit;
		this.canDelete = canDelete;
		this.createdAt = createdAt;
		/*    */ }

	/*    */
	/*    */ public RolesPermissions() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 24 */ return this.id;
		/* 25 */ }

	public int getRoleId() {
		return this.roleId;
	}

	/* 26 */ public int getPermCatId() {
		return this.permCatId;
	}

	/* 27 */ public int getCanView() {
		return this.canView;
	}

	/* 28 */ public int getCanAdd() {
		return this.canAdd;
	}

	/* 29 */ public int getCanEdit() {
		return this.canEdit;
	}

	/* 30 */ public int getCanDelete() {
		return this.canDelete;
	}

	public String getCreatedAt() {
		/* 31 */ return this.createdAt;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * RolesPermissions.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */