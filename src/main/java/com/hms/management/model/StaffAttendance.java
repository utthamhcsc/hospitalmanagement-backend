
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
/*    */ @Table(name = "staff_attendance")
/*    */ public class StaffAttendance {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String date;
	/*    */ private int staffId;
	/*    */ private int staffAttendanceTypeId;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String remark;
	private int isActive;
	private String createdAt;
	private int updatedAt;

	public void setDate(String date) {
		this.date = date;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public void setStaffAttendanceTypeId(int staffAttendanceTypeId) {
		this.staffAttendanceTypeId = staffAttendanceTypeId;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(int updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof StaffAttendance))
			return false;
		StaffAttendance other = (StaffAttendance) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$date = getDate(), other$date = other.getDate();
		if ((this$date == null) ? (other$date != null) : !this$date.equals(other$date))
			return false;
		if (getStaffId() != other.getStaffId())
			return false;
		if (getStaffAttendanceTypeId() != other.getStaffAttendanceTypeId())
			return false;
		Object this$remark = getRemark(), other$remark = other.getRemark();
		if ((this$remark == null) ? (other$remark != null) : !this$remark.equals(other$remark))
			return false;
		if (getIsActive() != other.getIsActive())
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		return ((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt)) ? false
				: (!(getUpdatedAt() != other.getUpdatedAt()));
	}

	protected boolean canEqual(Object other) {
		return other instanceof StaffAttendance;
	}

	
	public String toString() {
		return "StaffAttendance(id=" + getId() + ", date=" + getDate() + ", staffId=" + getStaffId()
				+ ", staffAttendanceTypeId=" + getStaffAttendanceTypeId() + ", remark=" + getRemark() + ", isActive="
				+ getIsActive() + ", createdAt=" + getCreatedAt() + ", updatedAt=" + getUpdatedAt() + ")";
	}

	public StaffAttendance(int id, String date, int staffId, int staffAttendanceTypeId, String remark, int isActive,
			String createdAt, int updatedAt) {
		/* 17 */ this.id = id;
		this.date = date;
		this.staffId = staffId;
		this.staffAttendanceTypeId = staffAttendanceTypeId;
		this.remark = remark;
		this.isActive = isActive;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		/*    */ }

	/*    */
	/*    */ public StaffAttendance() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 24 */ return this.id;
		/* 25 */ }

	public String getDate() {
		return this.date;
	}

	/* 26 */ public int getStaffId() {
		return this.staffId;
	}

	/* 27 */ public int getStaffAttendanceTypeId() {
		return this.staffAttendanceTypeId;
	}

	/* 28 */ public String getRemark() {
		return this.remark;
	}

	/* 29 */ public int getIsActive() {
		return this.isActive;
	}

	/* 30 */ public String getCreatedAt() {
		return this.createdAt;
	}

	public int getUpdatedAt() {
		/* 31 */ return this.updatedAt;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * StaffAttendance.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */