/*    */
package com.hms.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */ @Entity
/*    */ @Table(name = "staff")
/*    */ public class Staff {
	@Id
	/*    */ @GeneratedValue(strategy = GenerationType.AUTO)
	/*    */ private int id;
	private String staffId;
	private String role;
	private String firstName;
	private String lastName;
	private String gender;
	private String maritalStatus;
	private String dateOfJoining;
	/*    */ private String phone;
	/*    */ private String qualification;
	/*    */ private String workExperiance;
	/*    */ private String designation;
	/*    */ private String department;
	/*    */ private String fatherName;

	/*    */
	/* 14 */ public void setId(int id) {
		this.id = id;
	}

	private String motherName;
	private String bloodGroup;
	private String dateOfBirth;
	private String email;
	private String photo;
	private String Specialization;
	private String note;
	private String permnentAddress;
	private String currentAddrees;
	private String accountTitle;
	private String bankName;
	private String bankBranchName;
	private String accountNumber;
	private String ifscCode;

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public void setWorkExperiance(String workExperiance) {
		this.workExperiance = workExperiance;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public void setSpecialization(String Specialization) {
		this.Specialization = Specialization;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setPermnentAddress(String permnentAddress) {
		this.permnentAddress = permnentAddress;
	}

	public void setCurrentAddrees(String currentAddrees) {
		this.currentAddrees = currentAddrees;
	}

	public void setAccountTitle(String accountTitle) {
		this.accountTitle = accountTitle;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public void setBankBranchName(String bankBranchName) {
		this.bankBranchName = bankBranchName;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Staff))
			return false;
		Staff other = (Staff) o;
		if (!other.canEqual(this))
			return false;
		if (getId() != other.getId())
			return false;
		Object this$staffId = getStaffId(), other$staffId = other.getStaffId();
		if ((this$staffId == null) ? (other$staffId != null) : !this$staffId.equals(other$staffId))
			return false;
		Object this$role = getRole(), other$role = other.getRole();
		if ((this$role == null) ? (other$role != null) : !this$role.equals(other$role))
			return false;
		Object this$firstName = getFirstName(), other$firstName = other.getFirstName();
		if ((this$firstName == null) ? (other$firstName != null) : !this$firstName.equals(other$firstName))
			return false;
		Object this$lastName = getLastName(), other$lastName = other.getLastName();
		if ((this$lastName == null) ? (other$lastName != null) : !this$lastName.equals(other$lastName))
			return false;
		Object this$gender = getGender(), other$gender = other.getGender();
		if ((this$gender == null) ? (other$gender != null) : !this$gender.equals(other$gender))
			return false;
		Object this$maritalStatus = getMaritalStatus(), other$maritalStatus = other.getMaritalStatus();
		if ((this$maritalStatus == null) ? (other$maritalStatus != null)
				: !this$maritalStatus.equals(other$maritalStatus))
			return false;
		Object this$dateOfJoining = getDateOfJoining(), other$dateOfJoining = other.getDateOfJoining();
		if ((this$dateOfJoining == null) ? (other$dateOfJoining != null)
				: !this$dateOfJoining.equals(other$dateOfJoining))
			return false;
		Object this$phone = getPhone(), other$phone = other.getPhone();
		if ((this$phone == null) ? (other$phone != null) : !this$phone.equals(other$phone))
			return false;
		Object this$qualification = getQualification(), other$qualification = other.getQualification();
		if ((this$qualification == null) ? (other$qualification != null)
				: !this$qualification.equals(other$qualification))
			return false;
		Object this$workExperiance = getWorkExperiance(), other$workExperiance = other.getWorkExperiance();
		if ((this$workExperiance == null) ? (other$workExperiance != null)
				: !this$workExperiance.equals(other$workExperiance))
			return false;
		Object this$designation = getDesignation(), other$designation = other.getDesignation();
		if ((this$designation == null) ? (other$designation != null) : !this$designation.equals(other$designation))
			return false;
		Object this$department = getDepartment(), other$department = other.getDepartment();
		if ((this$department == null) ? (other$department != null) : !this$department.equals(other$department))
			return false;
		Object this$fatherName = getFatherName(), other$fatherName = other.getFatherName();
		if ((this$fatherName == null) ? (other$fatherName != null) : !this$fatherName.equals(other$fatherName))
			return false;
		Object this$motherName = getMotherName(), other$motherName = other.getMotherName();
		if ((this$motherName == null) ? (other$motherName != null) : !this$motherName.equals(other$motherName))
			return false;
		Object this$bloodGroup = getBloodGroup(), other$bloodGroup = other.getBloodGroup();
		if ((this$bloodGroup == null) ? (other$bloodGroup != null) : !this$bloodGroup.equals(other$bloodGroup))
			return false;
		Object this$dateOfBirth = getDateOfBirth(), other$dateOfBirth = other.getDateOfBirth();
		if ((this$dateOfBirth == null) ? (other$dateOfBirth != null) : !this$dateOfBirth.equals(other$dateOfBirth))
			return false;
		Object this$email = getEmail(), other$email = other.getEmail();
		if ((this$email == null) ? (other$email != null) : !this$email.equals(other$email))
			return false;
		Object this$photo = getPhoto(), other$photo = other.getPhoto();
		if ((this$photo == null) ? (other$photo != null) : !this$photo.equals(other$photo))
			return false;
		Object this$Specialization = getSpecialization(), other$Specialization = other.getSpecialization();
		if ((this$Specialization == null) ? (other$Specialization != null)
				: !this$Specialization.equals(other$Specialization))
			return false;
		Object this$note = getNote(), other$note = other.getNote();
		if ((this$note == null) ? (other$note != null) : !this$note.equals(other$note))
			return false;
		Object this$permnentAddress = getPermnentAddress(), other$permnentAddress = other.getPermnentAddress();
		if ((this$permnentAddress == null) ? (other$permnentAddress != null)
				: !this$permnentAddress.equals(other$permnentAddress))
			return false;
		Object this$currentAddrees = getCurrentAddrees(), other$currentAddrees = other.getCurrentAddrees();
		if ((this$currentAddrees == null) ? (other$currentAddrees != null)
				: !this$currentAddrees.equals(other$currentAddrees))
			return false;
		Object this$accountTitle = getAccountTitle(), other$accountTitle = other.getAccountTitle();
		if ((this$accountTitle == null) ? (other$accountTitle != null) : !this$accountTitle.equals(other$accountTitle))
			return false;
		Object this$bankName = getBankName(), other$bankName = other.getBankName();
		if ((this$bankName == null) ? (other$bankName != null) : !this$bankName.equals(other$bankName))
			return false;
		Object this$bankBranchName = getBankBranchName(), other$bankBranchName = other.getBankBranchName();
		if ((this$bankBranchName == null) ? (other$bankBranchName != null)
				: !this$bankBranchName.equals(other$bankBranchName))
			return false;
		Object this$accountNumber = getAccountNumber(), other$accountNumber = other.getAccountNumber();
		if ((this$accountNumber == null) ? (other$accountNumber != null)
				: !this$accountNumber.equals(other$accountNumber))
			return false;
		Object this$ifscCode = getIfscCode(), other$ifscCode = other.getIfscCode();
		return !((this$ifscCode == null) ? (other$ifscCode != null) : !this$ifscCode.equals(other$ifscCode));
	}

	protected boolean canEqual(Object other) {
		return other instanceof Staff;
	}

	
	public String toString() {
		return "Staff(id=" + getId() + ", staffId=" + getStaffId() + ", role=" + getRole() + ", firstName="
				+ getFirstName() + ", lastName=" + getLastName() + ", gender=" + getGender() + ", maritalStatus="
				+ getMaritalStatus() + ", dateOfJoining=" + getDateOfJoining() + ", phone=" + getPhone()
				+ ", qualification=" + getQualification() + ", workExperiance=" + getWorkExperiance() + ", designation="
				+ getDesignation() + ", department=" + getDepartment() + ", fatherName=" + getFatherName()
				+ ", motherName=" + getMotherName() + ", bloodGroup=" + getBloodGroup() + ", dateOfBirth="
				+ getDateOfBirth() + ", email=" + getEmail() + ", photo=" + getPhoto() + ", Specialization="
				+ getSpecialization() + ", note=" + getNote() + ", permnentAddress=" + getPermnentAddress()
				+ ", currentAddrees=" + getCurrentAddrees() + ", accountTitle=" + getAccountTitle() + ", bankName="
				+ getBankName() + ", bankBranchName=" + getBankBranchName() + ", accountNumber=" + getAccountNumber()
				+ ", ifscCode=" + getIfscCode() + ")";
	}

	public Staff(int id, String staffId, String role, String firstName, String lastName, String gender,
			String maritalStatus, String dateOfJoining, String phone, String qualification, String workExperiance,
			String designation, String department, String fatherName, String motherName, String bloodGroup,
			String dateOfBirth, String email, String photo, String Specialization, String note, String permnentAddress,
			String currentAddrees, String accountTitle, String bankName, String bankBranchName, String accountNumber,
			String ifscCode) {
		/* 15 */ this.id = id;
		this.staffId = staffId;
		this.role = role;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.dateOfJoining = dateOfJoining;
		this.phone = phone;
		this.qualification = qualification;
		this.workExperiance = workExperiance;
		this.designation = designation;
		this.department = department;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.bloodGroup = bloodGroup;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.photo = photo;
		this.Specialization = Specialization;
		this.note = note;
		this.permnentAddress = permnentAddress;
		this.currentAddrees = currentAddrees;
		this.accountTitle = accountTitle;
		this.bankName = bankName;
		this.bankBranchName = bankBranchName;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		/*    */ }

	/*    */
	/*    */
	/*    */ public Staff() {
	}

	/*    */
	/*    */
	/*    */ public int getId() {
		/* 23 */ return this.id;
		/* 24 */ }

	public String getStaffId() {
		return this.staffId;
	}

	/* 25 */ public String getRole() {
		return this.role;
	}

	/* 26 */ public String getFirstName() {
		return this.firstName;
	}

	/* 27 */ public String getLastName() {
		return this.lastName;
	}

	/* 28 */ public String getGender() {
		return this.gender;
	}

	/* 29 */ public String getMaritalStatus() {
		return this.maritalStatus;
	}

	/* 30 */ public String getDateOfJoining() {
		return this.dateOfJoining;
	}

	/* 31 */ public String getPhone() {
		return this.phone;
	}

	/* 32 */ public String getQualification() {
		return this.qualification;
	}

	/* 33 */ public String getWorkExperiance() {
		return this.workExperiance;
	}

	/* 34 */ public String getDesignation() {
		return this.designation;
	}

	/* 35 */ public String getDepartment() {
		return this.department;
	}

	/* 36 */ public String getFatherName() {
		return this.fatherName;
	}

	/* 37 */ public String getMotherName() {
		return this.motherName;
	}

	/* 38 */ public String getBloodGroup() {
		return this.bloodGroup;
	}

	/* 39 */ public String getDateOfBirth() {
		return this.dateOfBirth;
	}

	/* 40 */ public String getEmail() {
		return this.email;
	}

	/* 41 */ public String getPhoto() {
		return this.photo;
	}

	/* 42 */ public String getSpecialization() {
		return this.Specialization;
	}

	/* 43 */ public String getNote() {
		return this.note;
	}

	/* 44 */ public String getPermnentAddress() {
		return this.permnentAddress;
	}

	/* 45 */ public String getCurrentAddrees() {
		return this.currentAddrees;
	}

	/* 46 */ public String getAccountTitle() {
		return this.accountTitle;
	}

	/* 47 */ public String getBankName() {
		return this.bankName;
	}

	/* 48 */ public String getBankBranchName() {
		return this.bankBranchName;
	}

	/* 49 */ public String getAccountNumber() {
		return this.accountNumber;
	}

	public String getIfscCode() {
		/* 50 */ return this.ifscCode;
		/*    */ }
}

/*
 * Location:
 * C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\Staff.
 * class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */