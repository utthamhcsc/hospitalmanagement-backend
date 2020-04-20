/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
/*    */ @Entity(name = "ScheduleList")
/*    */ public class ScheduleList {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String slno;
	/*    */ private String doctorName;
	/*    */ private String department;
	/*    */ private String doctorId;

	/*    */
	/*    */ public ScheduleList(int id, String slno, String doctorName, String department, String doctorId, String day,
			String startTime, String endTime, String perPatientTime, String status, String action) {
		/* 13 */ this.id = id;
		this.slno = slno;
		this.doctorName = doctorName;
		this.department = department;
		this.doctorId = doctorId;
		this.day = day;
		this.startTime = startTime;
		this.endTime = endTime;
		this.perPatientTime = perPatientTime;
		this.status = status;
		this.action = action;
		/*    */ }

	private String day;
	private String startTime;
	private String endTime;
	private String perPatientTime;
	private String status;
	private String action;

	public ScheduleList() {
	}

	public void setId(int id) {
		/* 15 */ this.id = id;
	}

	public void setSlno(String slno) {
		this.slno = slno;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public void setPerPatientTime(String perPatientTime) {
		this.perPatientTime = perPatientTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof ScheduleList))
			return false;
		ScheduleList other = (ScheduleList) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$slno = getSlno(), other$slno = other.getSlno();
		if ((this$slno == null) ? (other$slno != null) : !this$slno.equals(other$slno))
			return false;
		Object this$doctorName = getDoctorName(), other$doctorName = other.getDoctorName();
		if ((this$doctorName == null) ? (other$doctorName != null) : !this$doctorName.equals(other$doctorName))
			return false;
		Object this$department = getDepartment(), other$department = other.getDepartment();
		if ((this$department == null) ? (other$department != null) : !this$department.equals(other$department))
			return false;
		Object this$doctorId = getDoctorId(), other$doctorId = other.getDoctorId();
		if ((this$doctorId == null) ? (other$doctorId != null) : !this$doctorId.equals(other$doctorId))
			return false;
		Object this$day = getDay(), other$day = other.getDay();
		if ((this$day == null) ? (other$day != null) : !this$day.equals(other$day))
			return false;
		Object this$startTime = getStartTime(), other$startTime = other.getStartTime();
		if ((this$startTime == null) ? (other$startTime != null) : !this$startTime.equals(other$startTime))
			return false;
		Object this$endTime = getEndTime(), other$endTime = other.getEndTime();
		if ((this$endTime == null) ? (other$endTime != null) : !this$endTime.equals(other$endTime))
			return false;
		Object this$perPatientTime = getPerPatientTime(), other$perPatientTime = other.getPerPatientTime();
		if ((this$perPatientTime == null) ? (other$perPatientTime != null)
				: !this$perPatientTime.equals(other$perPatientTime))
			return false;
		Object this$status = getStatus(), other$status = other.getStatus();
		if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status))
			return false;
		Object this$action = getAction(), other$action = other.getAction();
		return !((this$action == null) ? (other$action != null) : !this$action.equals(other$action));
	}

	protected boolean canEqual(Object other) {
		return other instanceof ScheduleList;
	}

	
	public String toString() {
		return "ScheduleList(id=" + getId() + ", slno=" + getSlno() + ", doctorName=" + getDoctorName()
				+ ", department=" + getDepartment() + ", doctorId=" + getDoctorId() + ", day=" + getDay()
				+ ", startTime=" + getStartTime() + ", endTime=" + getEndTime() + ", perPatientTime="
				+ getPerPatientTime() + ", status=" + getStatus() + ", action=" + getAction() + ")";
	}

	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */ public int getId() {
		/* 23 */ return this.id;
		/* 24 */ }

	public String getSlno() {
		return this.slno;
	}

	/* 25 */ public String getDoctorName() {
		return this.doctorName;
	}

	/* 26 */ public String getDepartment() {
		return this.department;
	}

	/* 27 */ public String getDoctorId() {
		return this.doctorId;
	}

	/* 28 */ public String getDay() {
		return this.day;
	}

	/* 29 */ public String getStartTime() {
		return this.startTime;
	}

	/* 30 */ public String getEndTime() {
		return this.endTime;
	}

	/* 31 */ public String getPerPatientTime() {
		return this.perPatientTime;
	}

	/* 32 */ public String getStatus() {
		return this.status;
	}

	public String getAction() {
		/* 33 */ return this.action;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * ScheduleList.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */