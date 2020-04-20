
/*    */ package com.hms.management.model;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

/*    */ public class VisitorListBean {
/*    */   private int id;
/*    */   private String purpose;
/*    */   private String name;
/*    */   private String phone;
/*    */   private Date date;
/*    */   
/*  9 */   public void setId(int id) { this.id = id; } private String intime; private String outtime; private String action; private String note; private MultipartFile attachedDocument; public void setPurpose(String purpose) { this.purpose = purpose; } public void setName(String name) { this.name = name; } public void setPhone(String phone) { this.phone = phone; } public void setDate(Date date) { this.date = date; } public void setIntime(String intime) { this.intime = intime; } public void setOuttime(String outtime) { this.outtime = outtime; } public void setAction(String action) { this.action = action; } public void setNote(String note) { this.note = note; } public void setAttachedDocument(MultipartFile attachedDocument) { this.attachedDocument = attachedDocument; }
/*    */ 
/*    */   
/*    */   public int getId()
/*    */   {
/* 14 */     return this.id;
/* 15 */   } public String getPurpose() { return this.purpose; }
/* 16 */   public String getName() { return this.name; }
/* 17 */   public String getPhone() { return this.phone; }
/* 18 */   public Date getDate() { return this.date; }
/* 19 */   public String getIntime() { return this.intime; }
/* 20 */   public String getOuttime() { return this.outtime; }
/* 21 */   public String getAction() { return this.action; }
/* 22 */   public String getNote() { return this.note; } public MultipartFile getAttachedDocument() {
/* 23 */     return this.attachedDocument;
/*    */   }
/*    */ }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\VisitorListBean.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */