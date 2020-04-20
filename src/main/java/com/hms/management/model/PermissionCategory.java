
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
/*    */ @Table(name = "permission_category")
/*    */ public class PermissionCategory {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private int permGroupId;
	/*    */ private String name;
	/*    */ private String shortCode;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private int enableView;
	private int enableAdd;
	private int enableEdit;
	private int enableDelete;
	private String createdAt;

	public void setPermGroupId(int permGroupId) {
		this.permGroupId = permGroupId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}

	public void setEnableView(int enableView) {
		this.enableView = enableView;
	}

	public void setEnableAdd(int enableAdd) {
		this.enableAdd = enableAdd;
	}

	public void setEnableEdit(int enableEdit) {
		this.enableEdit = enableEdit;
	}

	public void setEnableDelete(int enableDelete) {
		this.enableDelete = enableDelete;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof PermissionCategory))
			return false;
		PermissionCategory other = (PermissionCategory) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getPermGroupId() != other.getPermGroupId())
			return false;
		Object this$name = getName(), other$name = other.getName();
		if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name))
			return false;
		Object this$shortCode = getShortCode(), other$shortCode = other.getShortCode();
		if ((this$shortCode == null) ? (other$shortCode != null) : !this$shortCode.equals(other$shortCode))
			return false;
		if (getEnableView() != other.getEnableView())
			return false;
		if (getEnableAdd() != other.getEnableAdd())
			return false;
		if (getEnableEdit() != other.getEnableEdit())
			return false;
		if (getEnableDelete() != other.getEnableDelete())
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		return !((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof PermissionCategory;
	}

	

	public String toString() {
		return "PermissionCategory(id=" + getId() + ", permGroupId=" + getPermGroupId() + ", name=" + getName()
				+ ", shortCode=" + getShortCode() + ", enableView=" + getEnableView() + ", enableAdd=" + getEnableAdd()
				+ ", enableEdit=" + getEnableEdit() + ", enableDelete=" + getEnableDelete() + ", createdAt="
				+ getCreatedAt() + ")";
	}

	public PermissionCategory(int id, int permGroupId, String name, String shortCode, int enableView, int enableAdd,
			int enableEdit, int enableDelete, String createdAt) {
		/* 17 */ this.id = id;
		this.permGroupId = permGroupId;
		this.name = name;
		this.shortCode = shortCode;
		this.enableView = enableView;
		this.enableAdd = enableAdd;
		this.enableEdit = enableEdit;
		this.enableDelete = enableDelete;
		this.createdAt = createdAt;
		/*    */ }

	/*    */
	/*    */ public PermissionCategory() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 24 */ return this.id;
		/* 25 */ }

	public int getPermGroupId() {
		return this.permGroupId;
	}

	/* 26 */ public String getName() {
		return this.name;
	}

	/* 27 */ public String getShortCode() {
		return this.shortCode;
	}

	/* 28 */ public int getEnableView() {
		return this.enableView;
	}

	/* 29 */ public int getEnableAdd() {
		return this.enableAdd;
	}

	/* 30 */ public int getEnableEdit() {
		return this.enableEdit;
	}

	/* 31 */ public int getEnableDelete() {
		return this.enableDelete;
	}

	public String getCreatedAt() {
		/* 32 */ return this.createdAt;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * PermissionCategory.class Java compiler version: 8 (52.0) JD-Core Version:
 * 1.1.3
 */