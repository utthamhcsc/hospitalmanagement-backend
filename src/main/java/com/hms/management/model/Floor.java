
/*    */
package com.hms.management.model;

/*    */
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
/*    */ import javax.persistence.Id;
import javax.persistence.Table;

/*    */
/*    */ @Entity
/*    */ @Table(name = "floor")
/*    */ public class Floor {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String name;
	private String description;

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Floor))
			return false;
		Floor other = (Floor) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$name = getName(), other$name = other.getName();
		if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name))
			return false;
		Object this$description = getDescription(), other$description = other.getDescription();
		return !((this$description == null) ? (other$description != null)
				: !this$description.equals(other$description));
	}

	protected boolean canEqual(Object other) {
		return other instanceof Floor;
	}


	public String toString() {
		return "Floor(id=" + getId() + ", name=" + getName() + ", description=" + getDescription() + ")";
	}

	public Floor(int id, String name, String description) {
		/* 15 */ this.id = id;
		this.name = name;
		this.description = description;
		/*    */ }

	/*    */
	/*    */ public Floor() {
	}

	/*    */
	/*    */ public int getId() {
		/* 21 */ return this.id;
		/* 22 */ }

	public String getName() {
		return this.name;
	}

	public String getDescription() {
		/* 23 */ return this.description;
		/*    */ }
	/*    */ }

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\Floor.
 * class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */