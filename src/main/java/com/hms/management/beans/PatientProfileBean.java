/*    */ package com.hms.management.beans;
/*    */ public class PatientProfileBean { private int id; private String patientId; private String gender;
/*    */   private String meritalStatus;
/*    */   private String phone;
/*    */   
/*  6 */   public void setId(int id) { this.id = id; } private String email; private String address; private String age; private String patientProfile; private String guardianName; public void setPatientId(String patientId) { this.patientId = patientId; } public void setGender(String gender) { this.gender = gender; } public void setMeritalStatus(String meritalStatus) { this.meritalStatus = meritalStatus; } public void setPhone(String phone) { this.phone = phone; } public void setEmail(String email) { this.email = email; } public void setAddress(String address) { this.address = address; } public void setAge(String age) { this.age = age; } public void setPatientProfile(String patientProfile) { this.patientProfile = patientProfile; } public void setGuardianName(String guardianName) { this.guardianName = guardianName; }
/*    */ 
/*    */   
/*    */   public int getId() {
/* 10 */     return this.id;
/* 11 */   } public String getPatientId() { return this.patientId; }
/* 12 */   public String getGender() { return this.gender; }
/* 13 */   public String getMeritalStatus() { return this.meritalStatus; }
/* 14 */   public String getPhone() { return this.phone; }
/* 15 */   public String getEmail() { return this.email; }
/* 16 */   public String getAddress() { return this.address; }
/* 17 */   public String getAge() { return this.age; }
/* 18 */   public String getPatientProfile() { return this.patientProfile; } public String getGuardianName() {
/* 19 */     return this.guardianName;
/*    */   } }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\beans\PatientProfileBean.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */