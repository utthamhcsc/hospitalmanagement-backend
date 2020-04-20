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
/*    */ @Table(name = "staff_leave_request")
/*    */ public class StaffLeaveRequest {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private int staffId;
	/*    */ private int leaveTypeId;
	/*    */ private String leaveFrom;
	/*    */ private String leaveTo;
	/*    */ private int leaveDays;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String employeeRemark;
	private String adminRemark;
	private String status;
	private String appliedBy;
	private String documentFile;
	private String date;

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public void setLeaveTypeId(int leaveTypeId) {
		this.leaveTypeId = leaveTypeId;
	}

	public void setLeaveFrom(String leaveFrom) {
		this.leaveFrom = leaveFrom;
	}

	public void setLeaveTo(String leaveTo) {
		this.leaveTo = leaveTo;
	}

	public void setLeaveDays(int leaveDays) {
		this.leaveDays = leaveDays;
	}

	public void setEmployeeRemark(String employeeRemark) {
		this.employeeRemark = employeeRemark;
	}

	public void setAdminRemark(String adminRemark) {
		this.adminRemark = adminRemark;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setAppliedBy(String appliedBy) {
		this.appliedBy = appliedBy;
	}

	public void setDocumentFile(String documentFile) {
		this.documentFile = documentFile;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof StaffLeaveRequest))
			return false;
		StaffLeaveRequest other = (StaffLeaveRequest) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		if (getStaffId() != other.getStaffId())
			return false;
		if (getLeaveTypeId() != other.getLeaveTypeId())
			return false;
		Object this$leaveFrom = getLeaveFrom(), other$leaveFrom = other.getLeaveFrom();
		if ((this$leaveFrom == null) ? (other$leaveFrom != null) : !this$leaveFrom.equals(other$leaveFrom))
			return false;
		Object this$leaveTo = getLeaveTo(), other$leaveTo = other.getLeaveTo();
		if ((this$leaveTo == null) ? (other$leaveTo != null) : !this$leaveTo.equals(other$leaveTo))
			return false;
		if (getLeaveDays() != other.getLeaveDays())
			return false;
		Object this$employeeRemark = getEmployeeRemark(), other$employeeRemark = other.getEmployeeRemark();
		if ((this$employeeRemark == null) ? (other$employeeRemark != null)
				: !this$employeeRemark.equals(other$employeeRemark))
			return false;
		Object this$adminRemark = getAdminRemark(), other$adminRemark = other.getAdminRemark();
		if ((this$adminRemark == null) ? (other$adminRemark != null) : !this$adminRemark.equals(other$adminRemark))
			return false;
		Object this$status = getStatus(), other$status = other.getStatus();
		if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status))
			return false;
		Object this$appliedBy = getAppliedBy(), other$appliedBy = other.getAppliedBy();
		if ((this$appliedBy == null) ? (other$appliedBy != null) : !this$appliedBy.equals(other$appliedBy))
			return false;
		Object this$documentFile = getDocumentFile(), other$documentFile = other.getDocumentFile();
		if ((this$documentFile == null) ? (other$documentFile != null) : !this$documentFile.equals(other$documentFile))
			return false;
		Object this$date = getDate(), other$date = other.getDate();
		return !((this$date == null) ? (other$date != null) : !this$date.equals(other$date));
	}

	protected boolean canEqual(Object other) {
		return other instanceof StaffLeaveRequest;
	}


	public String toString() {
		return "StaffLeaveRequest(id=" + getId() + ", staffId=" + getStaffId() + ", leaveTypeId=" + getLeaveTypeId()
				+ ", leaveFrom=" + getLeaveFrom() + ", leaveTo=" + getLeaveTo() + ", leaveDays=" + getLeaveDays()
				+ ", employeeRemark=" + getEmployeeRemark() + ", adminRemark=" + getAdminRemark() + ", status="
				+ getStatus() + ", appliedBy=" + getAppliedBy() + ", documentFile=" + getDocumentFile() + ", date="
				+ getDate() + ")";
	}

	public StaffLeaveRequest(int id, int staffId, int leaveTypeId, String leaveFrom, String leaveTo, int leaveDays,
			String employeeRemark, String adminRemark, String status, String appliedBy, String documentFile,
			String date) {
		/* 17 */ this.id = id;
		this.staffId = staffId;
		this.leaveTypeId = leaveTypeId;
		this.leaveFrom = leaveFrom;
		this.leaveTo = leaveTo;
		this.leaveDays = leaveDays;
		this.employeeRemark = employeeRemark;
		this.adminRemark = adminRemark;
		this.status = status;
		this.appliedBy = appliedBy;
		this.documentFile = documentFile;
		this.date = date;
		/*    */ }

	/*    */
	/*    */ public StaffLeaveRequest() {
	}

	/*    */
	/*    */ public int getId()
	/*    */ {
		/* 24 */ return this.id;
		/* 25 */ }

	public int getStaffId() {
		return this.staffId;
	}

	/* 26 */ public int getLeaveTypeId() {
		return this.leaveTypeId;
	}

	/* 27 */ public String getLeaveFrom() {
		return this.leaveFrom;
	}

	/* 28 */ public String getLeaveTo() {
		return this.leaveTo;
	}

	/* 29 */ public int getLeaveDays() {
		return this.leaveDays;
	}

	/* 30 */ public String getEmployeeRemark() {
		return this.employeeRemark;
	}

	/* 31 */ public String getAdminRemark() {
		return this.adminRemark;
	}

	/* 32 */ public String getStatus() {
		return this.status;
	}

	/* 33 */ public String getAppliedBy() {
		return this.appliedBy;
	}

	/* 34 */ public String getDocumentFile() {
		return this.documentFile;
	}

	public String getDate() {
		/* 35 */ return this.date;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * StaffLeaveRequest.class Java compiler version: 8 (52.0) JD-Core Version:
 * 1.1.3
 */