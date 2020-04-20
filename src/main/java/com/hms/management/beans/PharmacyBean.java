/*    */ package com.hms.management.beans;

import org.springframework.web.multipart.MultipartFile;

/*    */ public class PharmacyBean {
/*    */   private int id;
/*    */   private String medicineName;
/*    */   private int medicineCategoryId;
/*    */   private MultipartFile medicineImage;
/*    */   private String medicineCompany;
/*    */   private String medicineComposition;
/*    */   private String medicineGroup;
/*    */   private String unit;
/*    */   
/* 12 */   public void setId(int id) { this.id = id; } private String minLevel; private String reorderLevel; private String vat; private String unitPacking; private String supplier; private String vatAc; private String note; private String createdAt; private String updatedAt; public void setMedicineName(String medicineName) { this.medicineName = medicineName; } public void setMedicineCategoryId(int medicineCategoryId) { this.medicineCategoryId = medicineCategoryId; } public void setMedicineImage(MultipartFile medicineImage) { this.medicineImage = medicineImage; } public void setMedicineCompany(String medicineCompany) { this.medicineCompany = medicineCompany; } public void setMedicineComposition(String medicineComposition) { this.medicineComposition = medicineComposition; } public void setMedicineGroup(String medicineGroup) { this.medicineGroup = medicineGroup; } public void setUnit(String unit) { this.unit = unit; } public void setMinLevel(String minLevel) { this.minLevel = minLevel; } public void setReorderLevel(String reorderLevel) { this.reorderLevel = reorderLevel; } public void setVat(String vat) { this.vat = vat; } public void setUnitPacking(String unitPacking) { this.unitPacking = unitPacking; } public void setSupplier(String supplier) { this.supplier = supplier; } public void setVatAc(String vatAc) { this.vatAc = vatAc; } public void setNote(String note) { this.note = note; } public void setCreatedAt(String createdAt) { this.createdAt = createdAt; } public void setUpdatedAt(String updatedAt) { this.updatedAt = updatedAt; } public String toString() {
/* 13 */     return "PharmacyBean(id=" + getId() + ", medicineName=" + getMedicineName() + ", medicineCategoryId=" + getMedicineCategoryId() + ", medicineImage=" + getMedicineImage() + ", medicineCompany=" + getMedicineCompany() + ", medicineComposition=" + getMedicineComposition() + ", medicineGroup=" + getMedicineGroup() + ", unit=" + getUnit() + ", minLevel=" + getMinLevel() + ", reorderLevel=" + getReorderLevel() + ", vat=" + getVat() + ", unitPacking=" + getUnitPacking() + ", supplier=" + getSupplier() + ", vatAc=" + getVatAc() + ", note=" + getNote() + ", createdAt=" + getCreatedAt() + ", updatedAt=" + getUpdatedAt() + ")";
/*    */   }
/* 15 */   public int getId() { return this.id; }
/* 16 */   public String getMedicineName() { return this.medicineName; }
/* 17 */   public int getMedicineCategoryId() { return this.medicineCategoryId; }
/* 18 */   public MultipartFile getMedicineImage() { return this.medicineImage; }
/* 19 */   public String getMedicineCompany() { return this.medicineCompany; }
/* 20 */   public String getMedicineComposition() { return this.medicineComposition; }
/* 21 */   public String getMedicineGroup() { return this.medicineGroup; }
/* 22 */   public String getUnit() { return this.unit; }
/* 23 */   public String getMinLevel() { return this.minLevel; }
/* 24 */   public String getReorderLevel() { return this.reorderLevel; }
/* 25 */   public String getVat() { return this.vat; }
/* 26 */   public String getUnitPacking() { return this.unitPacking; }
/* 27 */   public String getSupplier() { return this.supplier; }
/* 28 */   public String getVatAc() { return this.vatAc; }
/* 29 */   public String getNote() { return this.note; }
/* 30 */   public String getCreatedAt() { return this.createdAt; } public String getUpdatedAt() {
/* 31 */     return this.updatedAt;
/*    */   }
/*    */ }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\beans\PharmacyBean.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */