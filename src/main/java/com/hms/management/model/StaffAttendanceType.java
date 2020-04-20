
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
/*    */ @Table(name = "staff_attendance_type")
/*    */ public class StaffAttendanceType {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String type;
	/*    */ private String keyValue;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String isActive;
	private String createdAt;
	private String updatedAt;

	public void setType(String type) {
		this.type = type;
	}

	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
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
		if (!(o instanceof StaffAttendanceType))
			return false;
		StaffAttendanceType other = (StaffAttendanceType) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$type = getType(), other$type = other.getType();
		if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type))
			return false;
		Object this$keyValue = getKeyValue(), other$keyValue = other.getKeyValue();
		if ((this$keyValue == null) ? (other$keyValue != null) : !this$keyValue.equals(other$keyValue))
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
		return other instanceof StaffAttendanceType;
	}


	public String toString() {
		return "StaffAttendanceType(id=" + getId() + ", type=" + getType() + ", keyValue=" + getKeyValue()
				+ ", isActive=" + getIsActive() + ", createdAt=" + getCreatedAt() + ", updatedAt=" + getUpdatedAt()
				+ ")";
	}

	public StaffAttendanceType(int id, String type, String keyValue, String isActive, String createdAt,
			String updatedAt) {
		/* 17 */ this.id = id;
		this.type = type;
		this.keyValue = keyValue;
		this.isActive = isActive;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		/*    */ }

	/*    */
	/*    */ public StaffAttendanceType() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 24 */ return this.id;
		/* 25 */ }

	public String getType() {
		return this.type;
	}

	/* 26 */ public String getKeyValue() {
		return this.keyValue;
	}

	/* 27 */ public String getIsActive() {
		return this.isActive;
	}

	/* 28 */ public String getCreatedAt() {
		return this.createdAt;
	}

	public String getUpdatedAt() {
		/* 29 */ return this.updatedAt;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * StaffAttendanceType.class Java compiler version: 8 (52.0) JD-Core Version:
 * 1.1.3
 */