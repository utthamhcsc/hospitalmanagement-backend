/*    */ package com.hms.management.beans;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.multipart.MultipartFile;

/*    */ public class StaffBean { @Id
/*    */   @GeneratedValue(strategy = GenerationType.AUTO)
/*    */   private int id; private String staffId; private String role; private String firstName; private String lastName; private String gender; private String maritalStatus;
/*    */   private String dateOfJoining;
/*    */   private String phone;
/*    */   private String qualification;
/*    */   private String workExperiance;
/*    */   private String designation;
/*    */   private String department;
/*    */   private String fatherName;
/*    */   
/* 13 */   public void setId(int id) { this.id = id; } private String motherName; private String bloodGroup; private String dateOfBirth; private String email; private MultipartFile photo; private String Specialization; private String note; private String permnentAddress; private String currentAddress; private String accountTitle; private String bankName; private String bankBranchName; private String accountNumber; private String ifscCode; public void setStaffId(String staffId) { this.staffId = staffId; } public void setRole(String role) { this.role = role; } public void setFirstName(String firstName) { this.firstName = firstName; } public void setLastName(String lastName) { this.lastName = lastName; } public void setGender(String gender) { this.gender = gender; } public void setMaritalStatus(String maritalStatus) { this.maritalStatus = maritalStatus; } public void setDateOfJoining(String dateOfJoining) { this.dateOfJoining = dateOfJoining; } public void setPhone(String phone) { this.phone = phone; } public void setQualification(String qualification) { this.qualification = qualification; } public void setWorkExperiance(String workExperiance) { this.workExperiance = workExperiance; } public void setDesignation(String designation) { this.designation = designation; } public void setDepartment(String department) { this.department = department; } public void setFatherName(String fatherName) { this.fatherName = fatherName; } public void setMotherName(String motherName) { this.motherName = motherName; } public void setBloodGroup(String bloodGroup) { this.bloodGroup = bloodGroup; } public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; } public void setEmail(String email) { this.email = email; } public void setPhoto(MultipartFile photo) { this.photo = photo; } public void setSpecialization(String Specialization) { this.Specialization = Specialization; } public void setNote(String note) { this.note = note; } public void setPermnentAddress(String permnentAddress) { this.permnentAddress = permnentAddress; } public void setCurrentAddress(String currentAddress) { this.currentAddress = currentAddress; } public void setAccountTitle(String accountTitle) { this.accountTitle = accountTitle; } public void setBankName(String bankName) { this.bankName = bankName; } public void setBankBranchName(String bankBranchName) { this.bankBranchName = bankBranchName; } public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; } public void setIfscCode(String ifscCode) { this.ifscCode = ifscCode; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getId() {
/* 20 */     return this.id;
/* 21 */   } public String getStaffId() { return this.staffId; }
/* 22 */   public String getRole() { return this.role; }
/* 23 */   public String getFirstName() { return this.firstName; }
/* 24 */   public String getLastName() { return this.lastName; }
/* 25 */   public String getGender() { return this.gender; }
/* 26 */   public String getMaritalStatus() { return this.maritalStatus; }
/* 27 */   public String getDateOfJoining() { return this.dateOfJoining; }
/* 28 */   public String getPhone() { return this.phone; }
/* 29 */   public String getQualification() { return this.qualification; }
/* 30 */   public String getWorkExperiance() { return this.workExperiance; }
/* 31 */   public String getDesignation() { return this.designation; }
/* 32 */   public String getDepartment() { return this.department; }
/* 33 */   public String getFatherName() { return this.fatherName; }
/* 34 */   public String getMotherName() { return this.motherName; }
/* 35 */   public String getBloodGroup() { return this.bloodGroup; }
/* 36 */   public String getDateOfBirth() { return this.dateOfBirth; }
/* 37 */   public String getEmail() { return this.email; }
/* 38 */   public MultipartFile getPhoto() { return this.photo; }
/* 39 */   public String getSpecialization() { return this.Specialization; }
/* 40 */   public String getNote() { return this.note; }
/* 41 */   public String getPermnentAddress() { return this.permnentAddress; }
/* 42 */   public String getCurrentAddress() { return this.currentAddress; }
/* 43 */   public String getAccountTitle() { return this.accountTitle; }
/* 44 */   public String getBankName() { return this.bankName; }
/* 45 */   public String getBankBranchName() { return this.bankBranchName; }
/* 46 */   public String getAccountNumber() { return this.accountNumber; } public String getIfscCode() {
/* 47 */     return this.ifscCode;
/*    */   } }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\beans\StaffBean.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */