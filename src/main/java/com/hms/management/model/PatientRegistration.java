/*    */
package com.hms.management.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
/*    */ @Table(name = "PatientRegistration")
/*    */ public class PatientRegistration {
	@Id
	/*    */ private String patientId;
	private String patientName;
	private String gender;
	/*    */ private String dateOfBirth;
	/*    */ private String gurdianName;
	/*    */ private String age;
	/*    */ private String bloodGroup;
	/*    */ private String maritalStatus;

	/*    */
	/*    */ public PatientRegistration(String patientId, String patientName, String gender, String dateOfBirth,
			String gurdianName, String age, String bloodGroup, String maritalStatus, String PatientPhoto, String phone,
			String email, String address, String remarks, String knownAllergies, Date createdAt, Date updatedAt) {
		/* 12 */ this.patientId = patientId;
		this.patientName = patientName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.gurdianName = gurdianName;
		this.age = age;
		this.bloodGroup = bloodGroup;
		this.maritalStatus = maritalStatus;
		this.PatientPhoto = PatientPhoto;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.remarks = remarks;
		this.knownAllergies = knownAllergies;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		/*    */ }

	private String PatientPhoto;
	private String phone;
	private String email;
	private String address;
	private String remarks;
	private String knownAllergies;
	private Date createdAt;
	private Date updatedAt;

	public PatientRegistration() {
	}

	public void setPatientId(String patientId) {
		/* 14 */ this.patientId = patientId;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setGurdianName(String gurdianName) {
		this.gurdianName = gurdianName;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public void setPatientPhoto(String PatientPhoto) {
		this.PatientPhoto = PatientPhoto;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public void setKnownAllergies(String knownAllergies) {
		this.knownAllergies = knownAllergies;
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
		if (!(o instanceof PatientRegistration))
			return false;
		PatientRegistration other = (PatientRegistration) o;
		if (!other.canEqual(this))
			return false;
		Object this$patientId = getPatientId(), other$patientId = other.getPatientId();
		if ((this$patientId == null) ? (other$patientId != null) : !this$patientId.equals(other$patientId))
			return false;
		Object this$patientName = getPatientName(), other$patientName = other.getPatientName();
		if ((this$patientName == null) ? (other$patientName != null) : !this$patientName.equals(other$patientName))
			return false;
		Object this$gender = getGender(), other$gender = other.getGender();
		if ((this$gender == null) ? (other$gender != null) : !this$gender.equals(other$gender))
			return false;
		Object this$dateOfBirth = getDateOfBirth(), other$dateOfBirth = other.getDateOfBirth();
		if ((this$dateOfBirth == null) ? (other$dateOfBirth != null) : !this$dateOfBirth.equals(other$dateOfBirth))
			return false;
		Object this$gurdianName = getGurdianName(), other$gurdianName = other.getGurdianName();
		if ((this$gurdianName == null) ? (other$gurdianName != null) : !this$gurdianName.equals(other$gurdianName))
			return false;
		Object this$age = getAge(), other$age = other.getAge();
		if ((this$age == null) ? (other$age != null) : !this$age.equals(other$age))
			return false;
		Object this$bloodGroup = getBloodGroup(), other$bloodGroup = other.getBloodGroup();
		if ((this$bloodGroup == null) ? (other$bloodGroup != null) : !this$bloodGroup.equals(other$bloodGroup))
			return false;
		Object this$maritalStatus = getMaritalStatus(), other$maritalStatus = other.getMaritalStatus();
		if ((this$maritalStatus == null) ? (other$maritalStatus != null)
				: !this$maritalStatus.equals(other$maritalStatus))
			return false;
		Object this$PatientPhoto = getPatientPhoto(), other$PatientPhoto = other.getPatientPhoto();
		if ((this$PatientPhoto == null) ? (other$PatientPhoto != null) : !this$PatientPhoto.equals(other$PatientPhoto))
			return false;
		Object this$phone = getPhone(), other$phone = other.getPhone();
		if ((this$phone == null) ? (other$phone != null) : !this$phone.equals(other$phone))
			return false;
		Object this$email = getEmail(), other$email = other.getEmail();
		if ((this$email == null) ? (other$email != null) : !this$email.equals(other$email))
			return false;
		Object this$address = getAddress(), other$address = other.getAddress();
		if ((this$address == null) ? (other$address != null) : !this$address.equals(other$address))
			return false;
		Object this$remarks = getRemarks(), other$remarks = other.getRemarks();
		if ((this$remarks == null) ? (other$remarks != null) : !this$remarks.equals(other$remarks))
			return false;
		Object this$knownAllergies = getKnownAllergies(), other$knownAllergies = other.getKnownAllergies();
		if ((this$knownAllergies == null) ? (other$knownAllergies != null)
				: !this$knownAllergies.equals(other$knownAllergies))
			return false;
		Object this$createdAt = getCreatedAt(), other$createdAt = other.getCreatedAt();
		if ((this$createdAt == null) ? (other$createdAt != null) : !this$createdAt.equals(other$createdAt))
			return false;
		Object this$updatedAt = getUpdatedAt(), other$updatedAt = other.getUpdatedAt();
		return !((this$updatedAt == null) ? (other$updatedAt != null) : !this$updatedAt.equals(other$updatedAt));
	}

	protected boolean canEqual(Object other) {
		return other instanceof PatientRegistration;
	}

	

	public String toString() {
		return "PatientRegistration(patientId=" + getPatientId() + ", patientName=" + getPatientName() + ", gender="
				+ getGender() + ", dateOfBirth=" + getDateOfBirth() + ", gurdianName=" + getGurdianName() + ", age="
				+ getAge() + ", bloodGroup=" + getBloodGroup() + ", maritalStatus=" + getMaritalStatus()
				+ ", PatientPhoto=" + getPatientPhoto() + ", phone=" + getPhone() + ", email=" + getEmail()
				+ ", address=" + getAddress() + ", remarks=" + getRemarks() + ", knownAllergies=" + getKnownAllergies()
				+ ", createdAt=" + getCreatedAt() + ", updatedAt=" + getUpdatedAt() + ")";
	}

	/*    */
	/*    */
	/*    */
	/*    */
	/*    */ public String getPatientId() {
		/* 20 */ return this.patientId;
		/* 21 */ }

	public String getPatientName() {
		return this.patientName;
	}

	/* 22 */ public String getGender() {
		return this.gender;
	}

	/* 23 */ public String getDateOfBirth() {
		return this.dateOfBirth;
	}

	/* 24 */ public String getGurdianName() {
		return this.gurdianName;
	}

	/* 25 */ public String getAge() {
		return this.age;
	}

	/* 26 */ public String getBloodGroup() {
		return this.bloodGroup;
	}

	/* 27 */ public String getMaritalStatus() {
		return this.maritalStatus;
	}

	/* 28 */ public String getPatientPhoto() {
		return this.PatientPhoto;
	}

	/* 29 */ public String getPhone() {
		return this.phone;
	}

	/* 30 */ public String getEmail() {
		return this.email;
	}

	/* 31 */ public String getAddress() {
		return this.address;
	}

	/* 32 */ public String getRemarks() {
		return this.remarks;
	}

	/* 33 */ public String getKnownAllergies() {
		return this.knownAllergies;
	}

	/* 34 */ public Date getCreatedAt() {
		return this.createdAt;
	}

	public Date getUpdatedAt() {
		/* 35 */ return this.updatedAt;
		/*    */ }
}

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * PatientRegistration.class Java compiler version: 8 (52.0) JD-Core Version:
 * 1.1.3
 */