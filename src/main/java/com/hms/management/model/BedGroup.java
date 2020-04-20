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
/*    */ @Table(name = "bed_group")
/*    */ public class BedGroup {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String name;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String description;
	private int floorId;
	private int isActive;

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setFloorId(int floorId) {
		this.floorId = floorId;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof BedGroup))
			return false;
		BedGroup other = (BedGroup) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$name = getName(), other$name = other.getName();
		if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name))
			return false;
		Object this$description = getDescription(), other$description = other.getDescription();
		return ((this$description == null) ? (other$description != null) : !this$description.equals(other$description))
				? false
				: ((getFloorId() != other.getFloorId()) ? false : (!(getIsActive() != other.getIsActive())));
	}

	protected boolean canEqual(Object other) {
		return other instanceof BedGroup;
	}

	

	public String toString() {
		return "BedGroup(id=" + getId() + ", name=" + getName() + ", description=" + getDescription() + ", floorId="
				+ getFloorId() + ", isActive=" + getIsActive() + ")";
	}

	public BedGroup(int id, String name, String description, int floorId, int isActive) {
		/* 15 */ this.id = id;
		this.name = name;
		this.description = description;
		this.floorId = floorId;
		this.isActive = isActive;
		/*    */ }

	/*    */
	/*    */ public BedGroup() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 22 */ return this.id;
		/* 23 */ }

	public String getName() {
		return this.name;
	}

	/* 24 */ public String getDescription() {
		return this.description;
	}

	/* 25 */ public int getFloorId() {
		return this.floorId;
	}

	public int getIsActive() {
		/* 26 */ return this.isActive;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\BedGroup.
 * class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */