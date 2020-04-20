/*    */ package com.hms.management.beans;
/*    */ 
/*    */ import org.springframework.web.multipart.MultipartFile;
/*    */ 
/*    */ public class PurchaseMedicine {
/*    */   private int id;
/*    */   private String supplierId;
/*    */   private String date;
/*    */   private String note;
/*    */   private float discount;
/*    */   private float tax;
/*    */   private float netamount;
/*    */   private MultipartFile attachDocument;
/*    */   private float total;
/*    */   private String medicine;
/*    */   
/* 17 */   public void setId(int id) { this.id = id; } public void setSupplierId(String supplierId) { this.supplierId = supplierId; } public void setDate(String date) { this.date = date; } public void setNote(String note) { this.note = note; } public void setDiscount(float discount) { this.discount = discount; } public void setTax(float tax) { this.tax = tax; } public void setNetamount(float netamount) { this.netamount = netamount; } public void setAttachDocument(MultipartFile attachDocument) { this.attachDocument = attachDocument; } public void setTotal(float total) { this.total = total; } public void setMedicine(String medicine) { this.medicine = medicine; } public String toString() {
/* 18 */     return "PurchaseMedicine(id=" + getId() + ", supplierId=" + getSupplierId() + ", date=" + getDate() + ", note=" + getNote() + ", discount=" + getDiscount() + ", tax=" + getTax() + ", netamount=" + getNetamount() + ", attachDocument=" + getAttachDocument() + ", total=" + getTotal() + ", medicine=" + getMedicine() + ")";
/*    */   }
/* 20 */   public int getId() { return this.id; }
/* 21 */   public String getSupplierId() { return this.supplierId; }
/* 22 */   public String getDate() { return this.date; }
/* 23 */   public String getNote() { return this.note; }
/* 24 */   public float getDiscount() { return this.discount; }
/* 25 */   public float getTax() { return this.tax; }
/* 26 */   public float getNetamount() { return this.netamount; }
/* 27 */   public MultipartFile getAttachDocument() { return this.attachDocument; }
/* 28 */   public float getTotal() { return this.total; } public String getMedicine() {
/* 29 */     return this.medicine;
/*    */   }
/*    */ }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\beans\PurchaseMedicine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */