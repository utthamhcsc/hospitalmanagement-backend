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
/*    */ @Table(name = "bed")
/*    */ public class Bed {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String name;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private int bedTypeId;
	private int bedGroupId;
	private int isActive;

	public void setName(String name) {
		this.name = name;
	}

	public void setBedTypeId(int bedTypeId) {
		this.bedTypeId = bedTypeId;
	}

	public void setBedGroupId(int bedGroupId) {
		this.bedGroupId = bedGroupId;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Bed))
			return false;
		Bed other = (Bed) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$name = getName(), other$name = other.getName();
		return ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) ? false
				: ((getBedTypeId() != other.getBedTypeId()) ? false
						: ((getBedGroupId() != other.getBedGroupId()) ? false
								: (!(getIsActive() != other.getIsActive()))));
	}

	protected boolean canEqual(Object other) {
		return other instanceof Bed;
	}


	public String toString() {
		return "Bed(id=" + getId() + ", name=" + getName() + ", bedTypeId=" + getBedTypeId() + ", bedGroupId="
				+ getBedGroupId() + ", isActive=" + getIsActive() + ")";
	}

	public Bed(int id, String name, int bedTypeId, int bedGroupId, int isActive) {
		/* 15 */ this.id = id;
		this.name = name;
		this.bedTypeId = bedTypeId;
		this.bedGroupId = bedGroupId;
		this.isActive = isActive;
		/*    */ }

	/*    */
	/*    */ public Bed() {
	}

	/*    */
	/*    */ public int getId() {
		/* 21 */ return this.id;
		/* 22 */ }

	public String getName() {
		return this.name;
	}

	/* 23 */ public int getBedTypeId() {
		return this.bedTypeId;
	}

	/* 24 */ public int getBedGroupId() {
		return this.bedGroupId;
	}

	public int getIsActive() {
		/* 25 */ return this.isActive;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\Bed.class
 * Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */