/*    */ package com.hms.management.beans;

import org.springframework.web.multipart.MultipartFile;

/*    */ public class PurchaseMedicianBean { private int id; private String medicianCategory; private String medicianName; private int batchNo; private String expireDate;
/*    */   private float MRP;
/*    */   private float batchAmount;
/*    */   private float salePrice;
/*    */   private String packagingQty;
/*    */   
/*  8 */   public void setId(int id) { this.id = id; } private String quentity; private String packagingPrice; private float amount; private float total; private float discount; private float tax; private float netAmount; private String note; private MultipartFile attachDocument; public void setMedicianCategory(String medicianCategory) { this.medicianCategory = medicianCategory; } public void setMedicianName(String medicianName) { this.medicianName = medicianName; } public void setBatchNo(int batchNo) { this.batchNo = batchNo; } public void setExpireDate(String expireDate) { this.expireDate = expireDate; } public void setMRP(float MRP) { this.MRP = MRP; } public void setBatchAmount(float batchAmount) { this.batchAmount = batchAmount; } public void setSalePrice(float salePrice) { this.salePrice = salePrice; } public void setPackagingQty(String packagingQty) { this.packagingQty = packagingQty; } public void setQuentity(String quentity) { this.quentity = quentity; } public void setPackagingPrice(String packagingPrice) { this.packagingPrice = packagingPrice; } public void setAmount(float amount) { this.amount = amount; } public void setTotal(float total) { this.total = total; } public void setDiscount(float discount) { this.discount = discount; } public void setTax(float tax) { this.tax = tax; } public void setNetAmount(float netAmount) { this.netAmount = netAmount; } public void setNote(String note) { this.note = note; } public void setAttachDocument(MultipartFile attachDocument) { this.attachDocument = attachDocument; }
/*    */ 
/*    */   
/*    */   public int getId() {
/* 12 */     return this.id;
/* 13 */   } public String getMedicianCategory() { return this.medicianCategory; }
/* 14 */   public String getMedicianName() { return this.medicianName; }
/* 15 */   public int getBatchNo() { return this.batchNo; }
/* 16 */   public String getExpireDate() { return this.expireDate; }
/* 17 */   public float getMRP() { return this.MRP; }
/* 18 */   public float getBatchAmount() { return this.batchAmount; }
/* 19 */   public float getSalePrice() { return this.salePrice; }
/* 20 */   public String getPackagingQty() { return this.packagingQty; }
/* 21 */   public String getQuentity() { return this.quentity; }
/* 22 */   public String getPackagingPrice() { return this.packagingPrice; }
/* 23 */   public float getAmount() { return this.amount; }
/* 24 */   public float getTotal() { return this.total; }
/* 25 */   public float getDiscount() { return this.discount; }
/* 26 */   public float getTax() { return this.tax; }
/* 27 */   public float getNetAmount() { return this.netAmount; }
/* 28 */   public String getNote() { return this.note; } public MultipartFile getAttachDocument() {
/* 29 */     return this.attachDocument;
/*    */   } }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\beans\PurchaseMedicianBean.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */