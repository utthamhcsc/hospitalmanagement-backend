/*    */ package com.hms.management.beans;

import org.springframework.web.multipart.MultipartFile;

/*    */ 
/*    */ public class OpdDiagnosisBean {
/*    */   private int id;
/*    */   private String opdId;
/*    */   private String reportType;
/*    */   
/*  8 */   public void setId(int id) { this.id = id; } private String description; private String reportDate; private MultipartFile document; public void setOpdId(String opdId) { this.opdId = opdId; } public void setReportType(String reportType) { this.reportType = reportType; } public void setDescription(String description) { this.description = description; } public void setReportDate(String reportDate) { this.reportDate = reportDate; } public void setDocument(MultipartFile document) { this.document = document; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getId() {
/* 14 */     return this.id;
/* 15 */   } public String getOpdId() { return this.opdId; }
/* 16 */   public String getReportType() { return this.reportType; }
/* 17 */   public String getDescription() { return this.description; }
/* 18 */   public String getReportDate() { return this.reportDate; } public MultipartFile getDocument() {
/* 19 */     return this.document;
/*    */   }
/*    */ }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\beans\OpdDiagnosisBean.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */