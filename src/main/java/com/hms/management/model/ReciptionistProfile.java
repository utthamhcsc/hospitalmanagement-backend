/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
/*    */ @Table(name = "ReciptionistProfile")
/*    */ public class ReciptionistProfile {
	@Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	private String name;
	private String role;
	private String staffId;
	private String designetion;
	private String reciptionistProfile;
	private String department;
	private int epfNo;
	private float basicSalary;
	private String cotractType;
	/*    */ private String workShift;
	/*    */ private String location;
	/*    */ private String dateOfJoining;
	/*    */ private String phone;

	/*    */
	/*    */ public ReciptionistProfile(int id, String name, String role, String staffId, String designetion,
			String reciptionistProfile, String department, int epfNo, float basicSalary, String cotractType,
			String workShift, String location, String dateOfJoining, String phone, String emergencyContactNo,
			String email, String gender, String bloodGroup, String dateOfBirth, String maritalStatus, String fatherName,
			String motherName, String quelification, String workExperience, String specilization, String currentAddress,
			String permnentAddress, String note) {
		/* 12 */ this.id = id;
		this.name = name;
		this.role = role;
		this.staffId = staffId;
		this.designetion = designetion;
		this.reciptionistProfile = reciptionistProfile;
		this.department = department;
		this.epfNo = epfNo;
		this.basicSalary = basicSalary;
		this.cotractType = cotractType;
		this.workShift = workShift;
		this.location = location;
		this.dateOfJoining = dateOfJoining;
		this.phone = phone;
		this.emergencyContactNo = emergencyContactNo;
		this.email = email;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.dateOfBirth = dateOfBirth;
		this.maritalStatus = maritalStatus;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.quelification = quelification;
		this.workExperience = workExperience;
		this.specilization = specilization;
		this.currentAddress = currentAddress;
		this.permnentAddress = permnentAddress;
		this.note = note;
		/*    */ }

	private String emergencyContactNo;
	private String email;
	private String gender;
	private String bloodGroup;
	private String dateOfBirth;
	private String maritalStatus;
	private String fatherName;
	private String motherName;
	private String quelification;
	private String workExperience;
	private String specilization;
	private String currentAddress;
	private String permnentAddress;
	private String note;

	public ReciptionistProfile() {
	}

	public void setId(int id) {
		/* 14 */ this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public void setDesignetion(String designetion) {
		this.designetion = designetion;
	}

	public void setReciptionistProfile(String reciptionistProfile) {
		this.reciptionistProfile = reciptionistProfile;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setEpfNo(int epfNo) {
		this.epfNo = epfNo;
	}

	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}

	public void setCotractType(String cotractType) {
		this.cotractType = cotractType;
	}

	public void setWorkShift(String workShift) {
		this.workShift = workShift;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmergencyContactNo(String emergencyContactNo) {
		this.emergencyContactNo = emergencyContactNo;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public void setQuelification(String quelification) {
		this.quelification = quelification;
	}

	public void setWorkExperience(String workExperience) {
		this.workExperience = workExperience;
	}

	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public void setPermnentAddress(String permnentAddress) {
		this.permnentAddress = permnentAddress;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof ReciptionistProfile))
			return false;
		ReciptionistProfile other = (ReciptionistProfile) o;
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
		Object this$staffId = getStaffId(), other$staffId = other.getStaffId();
		if ((this$staffId == null) ? (other$staffId != null) : !this$staffId.equals(other$staffId))
			return false;
		Object this$designetion = getDesignetion(), other$designetion = other.getDesignetion();
		if ((this$designetion == null) ? (other$designetion != null) : !this$designetion.equals(other$designetion))
			return false;
		Object this$reciptionistProfile = getReciptionistProfile(),
				other$reciptionistProfile = other.getReciptionistProfile();
		if ((this$reciptionistProfile == null) ? (other$reciptionistProfile != null)
				: !this$reciptionistProfile.equals(other$reciptionistProfile))
			return false;
		Object this$department = getDepartment(), other$department = other.getDepartment();
		if ((this$department == null) ? (other$department != null) : !this$department.equals(other$department))
			return false;
		if (getEpfNo() != other.getEpfNo())
			return false;
		if (Float.compare(getBasicSalary(), other.getBasicSalary()) != 0)
			return false;
		Object this$cotractType = getCotractType(), other$cotractType = other.getCotractType();
		if ((this$cotractType == null) ? (other$cotractType != null) : !this$cotractType.equals(other$cotractType))
			return false;
		Object this$workShift = getWorkShift(), other$workShift = other.getWorkShift();
		if ((this$workShift == null) ? (other$workShift != null) : !this$workShift.equals(other$workShift))
			return false;
		Object this$location = getLocation(), other$location = other.getLocation();
		if ((this$location == null) ? (other$location != null) : !this$location.equals(other$location))
			return false;
		Object this$dateOfJoining = getDateOfJoining(), other$dateOfJoining = other.getDateOfJoining();
		if ((this$dateOfJoining == null) ? (other$dateOfJoining != null)
				: !this$dateOfJoining.equals(other$dateOfJoining))
			return false;
		Object this$phone = getPhone(), other$phone = other.getPhone();
		if ((this$phone == null) ? (other$phone != null) : !this$phone.equals(other$phone))
			return false;
		Object this$emergencyContactNo = getEmergencyContactNo(),
				other$emergencyContactNo = other.getEmergencyContactNo();
		if ((this$emergencyContactNo == null) ? (other$emergencyContactNo != null)
				: !this$emergencyContactNo.equals(other$emergencyContactNo))
			return false;
		Object this$email = getEmail(), other$email = other.getEmail();
		if ((this$email == null) ? (other$email != null) : !this$email.equals(other$email))
			return false;
		Object this$gender = getGender(), other$gender = other.getGender();
		if ((this$gender == null) ? (other$gender != null) : !this$gender.equals(other$gender))
			return false;
		Object this$bloodGroup = getBloodGroup(), other$bloodGroup = other.getBloodGroup();
		if ((this$bloodGroup == null) ? (other$bloodGroup != null) : !this$bloodGroup.equals(other$bloodGroup))
			return false;
		Object this$dateOfBirth = getDateOfBirth(), other$dateOfBirth = other.getDateOfBirth();
		if ((this$dateOfBirth == null) ? (other$dateOfBirth != null) : !this$dateOfBirth.equals(other$dateOfBirth))
			return false;
		Object this$maritalStatus = getMaritalStatus(), other$maritalStatus = other.getMaritalStatus();
		if ((this$maritalStatus == null) ? (other$maritalStatus != null)
				: !this$maritalStatus.equals(other$maritalStatus))
			return false;
		Object this$fatherName = getFatherName(), other$fatherName = other.getFatherName();
		if ((this$fatherName == null) ? (other$fatherName != null) : !this$fatherName.equals(other$fatherName))
			return false;
		Object this$motherName = getMotherName(), other$motherName = other.getMotherName();
		if ((this$motherName == null) ? (other$motherName != null) : !this$motherName.equals(other$motherName))
			return false;
		Object this$quelification = getQuelification(), other$quelification = other.getQuelification();
		if ((this$quelification == null) ? (other$quelification != null)
				: !this$quelification.equals(other$quelification))
			return false;
		Object this$workExperience = getWorkExperience(), other$workExperience = other.getWorkExperience();
		if ((this$workExperience == null) ? (other$workExperience != null)
				: !this$workExperience.equals(other$workExperience))
			return false;
		Object this$specilization = getSpecilization(), other$specilization = other.getSpecilization();
		if ((this$specilization == null) ? (other$specilization != null)
				: !this$specilization.equals(other$specilization))
			return false;
		Object this$currentAddress = getCurrentAddress(), other$currentAddress = other.getCurrentAddress();
		if ((this$currentAddress == null) ? (other$currentAddress != null)
				: !this$currentAddress.equals(other$currentAddress))
			return false;
		Object this$permnentAddress = getPermnentAddress(), other$permnentAddress = other.getPermnentAddress();
		if ((this$permnentAddress == null) ? (other$permnentAddress != null)
				: !this$permnentAddress.equals(other$permnentAddress))
			return false;
		Object this$note = getNote(), other$note = other.getNote();
		return !((this$note == null) ? (other$note != null) : !this$note.equals(other$note));
	}

	protected boolean canEqual(Object other) {
		return other instanceof ReciptionistProfile;
	}

	public String toString() {
		return "ReciptionistProfile(id=" + getId() + ", name=" + getName() + ", role=" + getRole() + ", staffId="
				+ getStaffId() + ", designetion=" + getDesignetion() + ", reciptionistProfile="
				+ getReciptionistProfile() + ", department=" + getDepartment() + ", epfNo=" + getEpfNo()
				+ ", basicSalary=" + getBasicSalary() + ", cotractType=" + getCotractType() + ", workShift="
				+ getWorkShift() + ", location=" + getLocation() + ", dateOfJoining=" + getDateOfJoining() + ", phone="
				+ getPhone() + ", emergencyContactNo=" + getEmergencyContactNo() + ", email=" + getEmail() + ", gender="
				+ getGender() + ", bloodGroup=" + getBloodGroup() + ", dateOfBirth=" + getDateOfBirth()
				+ ", maritalStatus=" + getMaritalStatus() + ", fatherName=" + getFatherName() + ", motherName="
				+ getMotherName() + ", quelification=" + getQuelification() + ", workExperience=" + getWorkExperience()
				+ ", specilization=" + getSpecilization() + ", currentAddress=" + getCurrentAddress()
				+ ", permnentAddress=" + getPermnentAddress() + ", note=" + getNote() + ")";
	}

	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */ public int getId() {
		/* 22 */ return this.id;
		/* 23 */ }

	public String getName() {
		return this.name;
	}

	/* 24 */ public String getRole() {
		return this.role;
	}

	/* 25 */ public String getStaffId() {
		return this.staffId;
	}

	/* 26 */ public String getDesignetion() {
		return this.designetion;
	}

	/* 27 */ public String getReciptionistProfile() {
		return this.reciptionistProfile;
	}

	/* 28 */ public String getDepartment() {
		return this.department;
	}

	/* 29 */ public int getEpfNo() {
		return this.epfNo;
	}

	/* 30 */ public float getBasicSalary() {
		return this.basicSalary;
	}

	/* 31 */ public String getCotractType() {
		return this.cotractType;
	}

	/* 32 */ public String getWorkShift() {
		return this.workShift;
	}

	/* 33 */ public String getLocation() {
		return this.location;
	}

	/* 34 */ public String getDateOfJoining() {
		return this.dateOfJoining;
	}

	/* 35 */ public String getPhone() {
		return this.phone;
	}

	/* 36 */ public String getEmergencyContactNo() {
		return this.emergencyContactNo;
	}

	/* 37 */ public String getEmail() {
		return this.email;
	}

	/* 38 */ public String getGender() {
		return this.gender;
	}

	/* 39 */ public String getBloodGroup() {
		return this.bloodGroup;
	}

	/* 40 */ public String getDateOfBirth() {
		return this.dateOfBirth;
	}

	/* 41 */ public String getMaritalStatus() {
		return this.maritalStatus;
	}

	/* 42 */ public String getFatherName() {
		return this.fatherName;
	}

	/* 43 */ public String getMotherName() {
		return this.motherName;
	}

	/* 44 */ public String getQuelification() {
		return this.quelification;
	}

	/* 45 */ public String getWorkExperience() {
		return this.workExperience;
	}

	/* 46 */ public String getSpecilization() {
		return this.specilization;
	}

	/* 47 */ public String getCurrentAddress() {
		return this.currentAddress;
	}

	/* 48 */ public String getPermnentAddress() {
		return this.permnentAddress;
	}

	public String getNote() {
		/* 49 */ return this.note;
		/*    */ }
}

/*
 * Location: C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\
 * ReciptionistProfile.class Java compiler version: 8 (52.0) JD-Core Version:
 * 1.1.3
 */