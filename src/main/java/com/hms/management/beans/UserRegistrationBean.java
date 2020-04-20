/*    */ package com.hms.management.beans;
import java.util.Date;

/*    */ 
/*    */ import org.springframework.web.multipart.MultipartFile;
/*    */ 
/*    */ public class UserRegistrationBean {
/*    */   private int id;
/*    */   private String name;
/*    */   private String mobileNo;
/*    */   private String email;
/*    */   
/* 11 */   public void setId(int id) { this.id = id; } private String password; private String userId; private Date signupDate; private String role; private MultipartFile userProfile; public void setName(String name) { this.name = name; } public void setMobileNo(String mobileNo) { this.mobileNo = mobileNo; } public void setEmail(String email) { this.email = email; } public void setPassword(String password) { this.password = password; } public void setUserId(String userId) { this.userId = userId; } public void setSignupDate(Date signupDate) { this.signupDate = signupDate; } public void setRole(String role) { this.role = role; } public void setUserProfile(MultipartFile userProfile) { this.userProfile = userProfile; }
/*    */ 
/*    */   
/*    */   public int getId() {
/* 15 */     return this.id;
/* 16 */   } public String getName() { return this.name; }
/* 17 */   public String getMobileNo() { return this.mobileNo; }
/* 18 */   public String getEmail() { return this.email; }
/* 19 */   public String getPassword() { return this.password; }
/* 20 */   public String getUserId() { return this.userId; }
/* 21 */   public Date getSignupDate() { return this.signupDate; }
/* 22 */   public String getRole() { return this.role; } public MultipartFile getUserProfile() {
/* 23 */     return this.userProfile;
/*    */   }
/*    */ }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\beans\UserRegistrationBean.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */