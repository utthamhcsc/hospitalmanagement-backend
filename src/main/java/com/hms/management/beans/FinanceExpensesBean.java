/*    */ package com.hms.management.beans;
/*    */ 
/*    */ import java.util.Date;
/*    */ import org.springframework.web.multipart.MultipartFile;
/*    */ 
/*    */ 
/*    */ public class FinanceExpensesBean
/*    */ {
/*    */   private int id;
/*    */   private int expHeadId;
/*    */   private String name;
/*    */   private String invoiceNo;
/*    */   private String date;
/*    */   private float amount;
/*    */   private MultipartFile documents;
/*    */   private String note;
/*    */   private String isActive;
/*    */   private String isDeleted;
/*    */   private Date createdAt;
/*    */   private Date updatedAt;
/*    */   
/*    */   public int getId() {
/* 23 */     return this.id;
/*    */   }
/*    */   public void setId(int id) {
/* 26 */     this.id = id;
/*    */   }
/*    */   public int getExpHeadId() {
/* 29 */     return this.expHeadId;
/*    */   }
/*    */   public void setExpHeadId(int expHeadId) {
/* 32 */     this.expHeadId = expHeadId;
/*    */   }
/*    */   public String getName() {
/* 35 */     return this.name;
/*    */   }
/*    */   public void setName(String name) {
/* 38 */     this.name = name;
/*    */   }
/*    */   public String getInvoiceNo() {
/* 41 */     return this.invoiceNo;
/*    */   }
/*    */   public void setInvoiceNo(String invoiceNo) {
/* 44 */     this.invoiceNo = invoiceNo;
/*    */   }
/*    */   public String getDate() {
/* 47 */     return this.date;
/*    */   }
/*    */   public void setDate(String date) {
/* 50 */     this.date = date;
/*    */   }
/*    */   public float getAmount() {
/* 53 */     return this.amount;
/*    */   }
/*    */   public void setAmount(float amount) {
/* 56 */     this.amount = amount;
/*    */   }
/*    */   public MultipartFile getDocuments() {
/* 59 */     return this.documents;
/*    */   }
/*    */   public void setDocuments(MultipartFile documents) {
/* 62 */     this.documents = documents;
/*    */   }
/*    */   public String getNote() {
/* 65 */     return this.note;
/*    */   }
/*    */   public void setNote(String note) {
/* 68 */     this.note = note;
/*    */   }
/*    */   public String getIsActive() {
/* 71 */     return this.isActive;
/*    */   }
/*    */   public void setIsActive(String isActive) {
/* 74 */     this.isActive = isActive;
/*    */   }
/*    */   public String getIsDeleted() {
/* 77 */     return this.isDeleted;
/*    */   }
/*    */   public void setIsDeleted(String isDeleted) {
/* 80 */     this.isDeleted = isDeleted;
/*    */   }
/*    */   public Date getCreatedAt() {
/* 83 */     return this.createdAt;
/*    */   }
/*    */   public void setCreatedAt(Date createdAt) {
/* 86 */     this.createdAt = createdAt;
/*    */   }
/*    */   public Date getUpdatedAt() {
/* 89 */     return this.updatedAt;
/*    */   }
/*    */   public void setUpdatedAt(Date updatedAt) {
/* 92 */     this.updatedAt = updatedAt;
/*    */   }
/*    */ }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\beans\FinanceExpensesBean.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */