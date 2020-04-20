/*    */ package com.hms.management.beans;

import org.springframework.web.multipart.MultipartFile;

/*    */ 
/*    */ public class PostalDisPatchListBean {
/*    */   private int id;
/*    */   private String fromTitle;
/*    */   private String referenceNo;
/*    */   private String toTitle;
/*    */   
/*  9 */   public void setId(int id) { this.id = id; } private String address; private String note; private String date; private MultipartFile attachdDocument; public void setFromTitle(String fromTitle) { this.fromTitle = fromTitle; } public void setReferenceNo(String referenceNo) { this.referenceNo = referenceNo; } public void setToTitle(String toTitle) { this.toTitle = toTitle; } public void setAddress(String address) { this.address = address; } public void setNote(String note) { this.note = note; } public void setDate(String date) { this.date = date; } public void setAttachdDocument(MultipartFile attachdDocument) { this.attachdDocument = attachdDocument; }
/*    */    public String toString() {
/* 11 */     return "PostalDisPatchListBean(id=" + getId() + ", fromTitle=" + getFromTitle() + ", referenceNo=" + getReferenceNo() + ", toTitle=" + getToTitle() + ", address=" + getAddress() + ", note=" + getNote() + ", date=" + getDate() + ", attachdDocument=" + getAttachdDocument() + ")";
/*    */   }
/*    */   
/*    */   public int getId() {
/* 15 */     return this.id;
/* 16 */   } public String getFromTitle() { return this.fromTitle; }
/* 17 */   public String getReferenceNo() { return this.referenceNo; }
/* 18 */   public String getToTitle() { return this.toTitle; }
/* 19 */   public String getAddress() { return this.address; }
/* 20 */   public String getNote() { return this.note; }
/* 21 */   public String getDate() { return this.date; } public MultipartFile getAttachdDocument() {
/* 22 */     return this.attachdDocument;
/*    */   }
/*    */ }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\beans\PostalDisPatchListBean.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */