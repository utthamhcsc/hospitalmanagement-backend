/*    */ package com.hms.management.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*    */ 
/*    */ @Entity
/*    */ @Table(name = "UserRegistration")
/*    */ public class UserRegistration {
/*    */   @Id
/*    */   @GeneratedValue(strategy = GenerationType.AUTO)
/*    */   private int id;
/*    */   private String name;
/*    */   private String mobileNo;
/*    */   private String email;
/*    */   private String password;
/*    */   
/*    */   public UserRegistration(int id, String name, String mobileNo, String email, String password, String userId, String gender, Date signupDate, String role, String userProfile) {
/* 15 */     this.id = id; this.name = name; this.mobileNo = mobileNo; this.email = email; this.password = password; this.userId = userId; this.gender = gender; this.signupDate = signupDate; this.role = role; this.userProfile = userProfile;
/*    */   } private String userId; private String gender; private Date signupDate; private String role; private String userProfile; public UserRegistration() {}
/*    */   public void setId(int id) {
/* 18 */     this.id = id; } public void setName(String name) { this.name = name; } public void setMobileNo(String mobileNo) { this.mobileNo = mobileNo; } public void setEmail(String email) { this.email = email; } public void setPassword(String password) { this.password = password; } public void setUserId(String userId) { this.userId = userId; } public void setGender(String gender) { this.gender = gender; } public void setSignupDate(Date signupDate) { this.signupDate = signupDate; } public void setRole(String role) { this.role = role; } public void setUserProfile(String userProfile) { this.userProfile = userProfile; }
  
/*    */   public int getId() {
/* 26 */     return this.id;
/* 27 */   } public String getName() { return this.name; }
/* 28 */   public String getMobileNo() { return this.mobileNo; }
/* 29 */   public String getEmail() { return this.email; }
/* 30 */   public String getPassword() { return this.password; }
/* 31 */   public String getUserId() { return this.userId; }
/* 32 */   public String getGender() { return this.gender; }
/* 33 */   public Date getSignupDate() { return this.signupDate; }
/* 34 */   public String getRole() { return this.role; } public String getUserProfile() {
/* 35 */     return this.userProfile;
/*    */   }
/*    */ }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\UserRegistration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */