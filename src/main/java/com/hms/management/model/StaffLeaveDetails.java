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
/*    */ @Table(name = "staff_leave_details")
/*    */ public class StaffLeaveDetails {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private int staffId;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private int leaveIypeId;
	private String allotedIeave;

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public void setLeaveIypeId(int leaveIypeId) {
		this.leaveIypeId = leaveIypeId;
	}

	public void setAllotedIeave(String allotedIeave) {
		this.allotedIeave = allotedIeave;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof StaffLeaveDetails))
			return false;
		StaffLeaveDetails other = (StaffLeaveDetails) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getStaffId() != other.getStaffId())
			return false;
		if (getLeaveIypeId() != other.getLeaveIypeId())
			return false;
		Object this$allotedIeave = getAllotedIeave(), other$allotedIeave = other.getAllotedIeave();
		return !((this$allotedIeave == null) ? (other$allotedIeave != null)
				: !this$allotedIeave.equals(other$allotedIeave));
	}

	protected boolean canEqual(Object other) {
		return other instanceof StaffLeaveDetails;
	}


	public String toString() {
		return "StaffLeaveDetails(id=" + getId() + ", staffId=" + getStaffId() + ", leaveIypeId=" + getLeaveIypeId()
				+ ", allotedIeave=" + getAllotedIeave() + ")";
	}

	public StaffLeaveDetails(int id, int staffId, int leaveIypeId, String allotedIeave) {
		/* 15 */ this.id = id;
		this.staffId = staffId;
		this.leaveIypeId = leaveIypeId;
		this.allotedIeave = allotedIeave;
		/*    */ }

	/*    */
	/*    */ public StaffLeaveDetails() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 22 */ return this.id;
		/* 23 */ }

	public int getStaffId() {
		return this.staffId;
	}

	/* 24 */ public int getLeaveIypeId() {
		return this.leaveIypeId;
	}

	public String getAllotedIeave() {
		/* 25 */ return this.allotedIeave;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * StaffLeaveDetails.class Java compiler version: 8 (52.0) JD-Core Version:
 * 1.1.3
 */