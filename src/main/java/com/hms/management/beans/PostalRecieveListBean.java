/*    */ package com.hms.management.beans;

import org.springframework.web.multipart.MultipartFile;

/*    */ public class PostalRecieveListBean {
/*    */   private int id;
/*    */   private String fromTitle;
/*    */   private String referenceNo;
/*    */   private String toTitle;
/*    */   
/*  8 */   public void setId(int id) { this.id = id; } private String date; private String note; private String address; private MultipartFile attachDocument; public void setFromTitle(String fromTitle) { this.fromTitle = fromTitle; } public void setReferenceNo(String referenceNo) { this.referenceNo = referenceNo; } public void setToTitle(String toTitle) { this.toTitle = toTitle; } public void setDate(String date) { this.date = date; } public void setNote(String note) { this.note = note; } public void setAddress(String address) { this.address = address; } public void setAttachDocument(MultipartFile attachDocument) { this.attachDocument = attachDocument; }
/*    */ 
/*    */   
/*    */   public int getId()
/*    */   {
/* 13 */     return this.id;
/* 14 */   } public String getFromTitle() { return this.fromTitle; }
/* 15 */   public String getReferenceNo() { return this.referenceNo; }
/* 16 */   public String getToTitle() { return this.toTitle; }
/* 17 */   public String getDate() { return this.date; }
/* 18 */   public String getNote() { return this.note; }
/* 19 */   public String getAddress() { return this.address; } public MultipartFile getAttachDocument() {
/* 20 */     return this.attachDocument;
/*    */   }
/*    */ }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\beans\PostalRecieveListBean.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */