/*    */
package com.hms.management.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */ @Entity
/*    */ @Table(name = "appointment")
/*    */ public class Appointment {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String aptId;
	/*    */ private String patientId;
	/*    */ private String date;
	/*    */ private String patientName;
	/*    */ private String gender;
	/*    */ private String email;
	/*    */ private String mobileNumber;

	/*    */
	/* 16 */ public void setId(int id) {
		this.id = id;
	}

	private String address;
	private String doctorId;
	private String message;
	private String appointmentStatus;
	private String source;
	private String department;
	private Date createdAt;
	private Date updatedAt;

	public void setAptId(String aptId) {
		this.aptId = aptId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setAppointmentStatus(String appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Appointment))
			return false;
		Appointment other = (Appointment) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$aptId = getAptId(), other$aptId = other.getAptId();
		if ((this$aptId == null) ? (other$aptId != null) : !this$aptId.equals(other$aptId))
			return false;
		Object this$patientId = getPatientId(), other$patientId = other.getPatientId();
		if ((this$patientId == null) ? (other$patientId != null) : !this$patientId.equals(other$patientId))
			return false;
		Object this$date = getDate(), other$date = other.getDate();
		if ((this$date == null) ? (other$date != null) : !this$date.equals(other$date))
			return false;
		Object this$patientName = getPatientName(), other$patientName = other.getPatientName();
		if ((this$patientName == null) ? (other$patientName != null) : !this$patientName.equals(other$patientName))
			return false;
		Object this$gender = getGender(), other$gender = other.getGender();
		if ((this$gender == null) ? (other$gender != null) : !this$gender.equals(other$gender))
			return false;
		Object this$email = getEmail(), other$email = other.getEmail();
		if ((this$email == null) ? (other$email != null) : !this$email.equals(other$email))
			return false;
		Object this$mobileNumber = getMobileNumber(), other$mobileNumber = other.getMobileNumber();
		if ((this$mobileNumber == null) ? (other$mobileNumber != null) : !this$mobileNumber.equals(other$mobileNumber))
			return false;
		Object this$address = getAddress(), other$address = other.getAddress();
		if ((this$address == null) ? (other$address != null) : !this$address.equals(other$address))
			return false;
		Object this$doctorId = getDoctorId(), other$doctorId = other.getDoctorId();
		if ((this$doctorId == null) ? (other$doctorId != null) : !this$doctorId.equals(other$doctorId))
			return false;
		Object this$message = getMessage(), other$message = other.getMessage();
		if ((this$message == null) ? (other$message != null) : !this$message.equals(other$message))
			return false;
		Object this$appointmentStatus = getAppointmentStatus(), other$appointmentStatus = other.getAppointmentStatus();
		if ((this$appointmentStatus == null) ? (other$appointmentStatus != null)
				: !this$appointmentStatus.equals(other$appointmentStatus))
			return false;
		Object this$source = getSource(), other$source = other.getSource();
		if ((this$source == null) ? (other$source != null) : !this$source.equals(other$source))
			return false;
		Object this$department = getDepartment(), other$department = other.getDepartment();
		if ((this$department == null) ? (other$department != null) : !this$department.equals(other$department))
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		if ((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt))
			return false;
		Object this$updatedAt = getUpdatedAt(), other$updatedAt = other.getUpdatedAt();
		return !((this$updatedAt == null) ? (other$updatedAt != null) : !this$updatedAt.equals(other$updatedAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof Appointment;
	}


	public String toString() {
		return "Appointment(id=" + getId() + ", aptId=" + getAptId() + ", patientId=" + getPatientId() + ", date="
				+ getDate() + ", patientName=" + getPatientName() + ", gender=" + getGender() + ", email=" + getEmail()
				+ ", mobileNumber=" + getMobileNumber() + ", address=" + getAddress() + ", doctorId=" + getDoctorId()
				+ ", message=" + getMessage() + ", appointmentStatus=" + getAppointmentStatus() + ", source="
				+ getSource() + ", department=" + getDepartment() + ", createdAt=" + getCreatedAt() + ", updatedAt="
				+ getUpdatedAt() + ")";
	}

	public Appointment(int id, String aptId, String patientId, String date, String patientName, String gender,
			String email, String mobileNumber, String address, String doctorId, String message,
			String appointmentStatus, String source, String department, Date createdAt, Date updatedAt) {
		/* 17 */ this.id = id;
		this.aptId = aptId;
		this.patientId = patientId;
		this.date = date;
		this.patientName = patientName;
		this.gender = gender;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.doctorId = doctorId;
		this.message = message;
		this.appointmentStatus = appointmentStatus;
		this.source = source;
		this.department = department;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		/*    */ }

	/*    */
	/*    */
	/*    */ public Appointment() {
	}

	/*    */
	/*    */
	/*    */ public int getId() {
		/* 25 */ return this.id;
		/* 26 */ }

	public String getAptId() {
		return this.aptId;
	}

	/* 27 */ public String getPatientId() {
		return this.patientId;
	}

	/* 28 */ public String getDate() {
		return this.date;
	}

	/* 29 */ public String getPatientName() {
		return this.patientName;
	}

	/* 30 */ public String getGender() {
		return this.gender;
	}

	/* 31 */ public String getEmail() {
		return this.email;
	}

	/* 32 */ public String getMobileNumber() {
		return this.mobileNumber;
	}

	/* 33 */ public String getAddress() {
		return this.address;
	}

	/* 34 */ public String getDoctorId() {
		return this.doctorId;
	}

	/* 35 */ public String getMessage() {
		return this.message;
	}

	/* 36 */ public String getAppointmentStatus() {
		return this.appointmentStatus;
	}

	/* 37 */ public String getSource() {
		return this.source;
	}

	/* 38 */ public String getDepartment() {
		return this.department;
	}

	/* 39 */ public Date getCreatedAt() {
		return this.createdAt;
	}

	public Date getUpdatedAt() {
		/* 40 */ return this.updatedAt;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * Appointment.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */