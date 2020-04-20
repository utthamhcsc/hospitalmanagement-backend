/*    */ package com.hms.management.beans;

import org.springframework.web.multipart.MultipartFile;

/*    */ public class VisitorListBean {
/*    */   private int id;
/*    */   private String purpose;
/*    */   private String name;
/*    */   private String phone;
/*    */   private String date;
/*    */   private String inTime;
/*    */   
/* 10 */   public void setId(int id) { this.id = id; } private String outTime; private String action; private String numberOfPersons; private String idCard; private String note; private MultipartFile attachedDocument; public void setPurpose(String purpose) { this.purpose = purpose; } public void setName(String name) { this.name = name; } public void setPhone(String phone) { this.phone = phone; } public void setDate(String date) { this.date = date; } public void setInTime(String inTime) { this.inTime = inTime; } public void setOutTime(String outTime) { this.outTime = outTime; } public void setAction(String action) { this.action = action; } public void setNumberOfPersons(String numberOfPersons) { this.numberOfPersons = numberOfPersons; } public void setIdCard(String idCard) { this.idCard = idCard; } public void setNote(String note) { this.note = note; } public void setAttachedDocument(MultipartFile attachedDocument) { this.attachedDocument = attachedDocument; }
/*    */ 
/*    */   
/*    */   public int getId()
/*    */   {
/* 15 */     return this.id;
/* 16 */   } public String getPurpose() { return this.purpose; }
/* 17 */   public String getName() { return this.name; }
/* 18 */   public String getPhone() { return this.phone; }
/* 19 */   public String getDate() { return this.date; }
/* 20 */   public String getInTime() { return this.inTime; }
/* 21 */   public String getOutTime() { return this.outTime; }
/* 22 */   public String getAction() { return this.action; }
/* 23 */   public String getNumberOfPersons() { return this.numberOfPersons; }
/* 24 */   public String getIdCard() { return this.idCard; }
/* 25 */   public String getNote() { return this.note; } public MultipartFile getAttachedDocument() {
/* 26 */     return this.attachedDocument;
/*    */   }
/*    */ }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\beans\VisitorListBean.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */