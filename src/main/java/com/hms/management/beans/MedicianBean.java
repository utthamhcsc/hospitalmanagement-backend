/*    */ package com.hms.management.beans;

import org.springframework.web.multipart.MultipartFile;

/*    */ public class MedicianBean { private int id; private String medicineName; private String medicineCategory;
/*    */   private String medicineCompany;
/*    */   private String medicineComposition;
/*    */   private String medicineGroup;
/*    */   private String unit;
/*    */   
/*  8 */   public void setId(int id) { this.id = id; } private String minLevel; private String reOrderLevel; private String vat; private String packing; private String vatAc; private String note; private MultipartFile MedicinePhoto; public void setMedicineName(String medicineName) { this.medicineName = medicineName; } public void setMedicineCategory(String medicineCategory) { this.medicineCategory = medicineCategory; } public void setMedicineCompany(String medicineCompany) { this.medicineCompany = medicineCompany; } public void setMedicineComposition(String medicineComposition) { this.medicineComposition = medicineComposition; } public void setMedicineGroup(String medicineGroup) { this.medicineGroup = medicineGroup; } public void setUnit(String unit) { this.unit = unit; } public void setMinLevel(String minLevel) { this.minLevel = minLevel; } public void setReOrderLevel(String reOrderLevel) { this.reOrderLevel = reOrderLevel; } public void setVat(String vat) { this.vat = vat; } public void setPacking(String packing) { this.packing = packing; } public void setVatAc(String vatAc) { this.vatAc = vatAc; } public void setNote(String note) { this.note = note; } public void setMedicinePhoto(MultipartFile MedicinePhoto) { this.MedicinePhoto = MedicinePhoto; }
/*    */ 
/*    */   
/*    */   public int getId() {
/* 12 */     return this.id;
/* 13 */   } public String getMedicineName() { return this.medicineName; }
/* 14 */   public String getMedicineCategory() { return this.medicineCategory; }
/* 15 */   public String getMedicineCompany() { return this.medicineCompany; }
/* 16 */   public String getMedicineComposition() { return this.medicineComposition; }
/* 17 */   public String getMedicineGroup() { return this.medicineGroup; }
/* 18 */   public String getUnit() { return this.unit; }
/* 19 */   public String getMinLevel() { return this.minLevel; }
/* 20 */   public String getReOrderLevel() { return this.reOrderLevel; }
/* 21 */   public String getVat() { return this.vat; }
/* 22 */   public String getPacking() { return this.packing; }
/* 23 */   public String getVatAc() { return this.vatAc; }
/* 24 */   public String getNote() { return this.note; } public MultipartFile getMedicinePhoto() {
/* 25 */     return this.MedicinePhoto;
/*    */   } }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\beans\MedicianBean.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */