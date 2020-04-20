/*    */ package com.hms.management.beans;

import org.springframework.web.multipart.MultipartFile;

/*    */ public class PatientRegistrationBean { private String patientId; private String patientName; private String gender; private String dateOfBirth;
/*    */   private String gurdianName;
/*    */   private String age;
/*    */   private String bloodGroup;
/*    */   
/*  7 */   public void setPatientId(String patientId) { this.patientId = patientId; } private String maritalStatus; private MultipartFile PatientPhoto; private String phone; private String email; private String address; private String remarks; private String knownAllergies; public void setPatientName(String patientName) { this.patientName = patientName; } public void setGender(String gender) { this.gender = gender; } public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; } public void setGurdianName(String gurdianName) { this.gurdianName = gurdianName; } public void setAge(String age) { this.age = age; } public void setBloodGroup(String bloodGroup) { this.bloodGroup = bloodGroup; } public void setMaritalStatus(String maritalStatus) { this.maritalStatus = maritalStatus; } public void setPatientPhoto(MultipartFile PatientPhoto) { this.PatientPhoto = PatientPhoto; } public void setPhone(String phone) { this.phone = phone; } public void setEmail(String email) { this.email = email; } public void setAddress(String address) { this.address = address; } public void setRemarks(String remarks) { this.remarks = remarks; } public void setKnownAllergies(String knownAllergies) { this.knownAllergies = knownAllergies; }
/*    */ 
/*    */   
/*    */   public String getPatientId()
/*    */   {
/* 12 */     return this.patientId;
/* 13 */   } public String getPatientName() { return this.patientName; }
/* 14 */   public String getGender() { return this.gender; }
/* 15 */   public String getDateOfBirth() { return this.dateOfBirth; }
/* 16 */   public String getGurdianName() { return this.gurdianName; }
/* 17 */   public String getAge() { return this.age; }
/* 18 */   public String getBloodGroup() { return this.bloodGroup; }
/* 19 */   public String getMaritalStatus() { return this.maritalStatus; }
/* 20 */   public MultipartFile getPatientPhoto() { return this.PatientPhoto; }
/* 21 */   public String getPhone() { return this.phone; }
/* 22 */   public String getEmail() { return this.email; }
/* 23 */   public String getAddress() { return this.address; }
/* 24 */   public String getRemarks() { return this.remarks; } public String getKnownAllergies() {
/* 25 */     return this.knownAllergies;
/*    */   } }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\beans\PatientRegistrationBean.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */