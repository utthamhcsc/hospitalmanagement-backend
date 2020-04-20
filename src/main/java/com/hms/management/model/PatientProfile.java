/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
/*    */ @Table
/*    */ public class PatientProfile {
	/*    */ @Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	/*    */ private String name;
	/*    */ private String role;
	/*    */ private String patientId;
	/*    */ private String gender;
	/*    */ private String meritalStatus;

	/*    */
	/*    */ public PatientProfile(int id, String name, String role, String patientId, String gender,
			String meritalStatus, String phone, String email, String address, String age, String patientProfile,
			String guardianName) {
		/* 14 */ this.id = id;
		this.name = name;
		this.role = role;
		this.patientId = patientId;
		this.gender = gender;
		this.meritalStatus = meritalStatus;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.age = age;
		this.patientProfile = patientProfile;
		this.guardianName = guardianName;
		/*    */ }

	private String phone;
	private String email;
	private String address;
	private String age;
	private String patientProfile;
	private String guardianName;

	public PatientProfile() {
	}

	public void setId(int id) {
		/* 16 */ this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setMeritalStatus(String meritalStatus) {
		this.meritalStatus = meritalStatus;
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

	public void setAge(String age) {
		this.age = age;
	}

	public void setPatientProfile(String patientProfile) {
		this.patientProfile = patientProfile;
	}

	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof PatientProfile))
			return false;
		PatientProfile other = (PatientProfile) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$name = getName(), other$name = other.getName();
		if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name))
			return false;
		Object this$role = getRole(), other$role = other.getRole();
		if ((this$role == null) ? (other$role != null) : !this$role.equals(other$role))
			return false;
		Object this$patientId = getPatientId(), other$patientId = other.getPatientId();
		if ((this$patientId == null) ? (other$patientId != null) : !this$patientId.equals(other$patientId))
			return false;
		Object this$gender = getGender(), other$gender = other.getGender();
		if ((this$gender == null) ? (other$gender != null) : !this$gender.equals(other$gender))
			return false;
		Object this$meritalStatus = getMeritalStatus(), other$meritalStatus = other.getMeritalStatus();
		if ((this$meritalStatus == null) ? (other$meritalStatus != null)
				: !this$meritalStatus.equals(other$meritalStatus))
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
		Object this$age = getAge(), other$age = other.getAge();
		if ((this$age == null) ? (other$age != null) : !this$age.equals(other$age))
			return false;
		Object this$patientProfile = getPatientProfile(), other$patientProfile = other.getPatientProfile();
		if ((this$patientProfile == null) ? (other$patientProfile != null)
				: !this$patientProfile.equals(other$patientProfile))
			return false;
		Object this$guardianName = getGuardianName(), other$guardianName = other.getGuardianName();
		return !((this$guardianName == null) ? (other$guardianName != null)
				: !this$guardianName.equals(other$guardianName));
	}

	protected boolean canEqual(Object other) {
		return other instanceof PatientProfile;
	}

	

	public String toString() {
		return "PatientProfile(id=" + getId() + ", name=" + getName() + ", role=" + getRole() + ", patientId="
				+ getPatientId() + ", gender=" + getGender() + ", meritalStatus=" + getMeritalStatus() + ", phone="
				+ getPhone() + ", email=" + getEmail() + ", address=" + getAddress() + ", age=" + getAge()
				+ ", patientProfile=" + getPatientProfile() + ", guardianName=" + getGuardianName() + ")";
	}

	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */ public int getId() {
		/* 23 */ return this.id;
		/* 24 */ }

	public String getName() {
		return this.name;
	}

	/* 25 */ public String getRole() {
		return this.role;
	}

	/* 26 */ public String getPatientId() {
		return this.patientId;
	}

	/* 27 */ public String getGender() {
		return this.gender;
	}

	/* 28 */ public String getMeritalStatus() {
		return this.meritalStatus;
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

	/* 32 */ public String getAge() {
		return this.age;
	}

	/* 33 */ public String getPatientProfile() {
		return this.patientProfile;
	}

	public String getGuardianName() {
		/* 34 */ return this.guardianName;
		/*    */ }
	/*    */ }

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * PatientProfile.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */