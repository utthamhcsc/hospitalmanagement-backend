/*    */ package com.hms.management.model;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.persistence.CascadeType;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.JoinColumn;
/*    */ import javax.persistence.OneToMany;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Entity
/*    */ @Table(name = "medicianDetails")
/*    */ public class MedicianDetails
/*    */ {
/*    */   @Id
/*    */   @GeneratedValue
/*    */   private int mid;
/*    */   private String billNo;
/*    */   private String patientId;
/*    */   private String date;
/*    */   private String doctor;
/*    */   private String hospitalDoctor;
/*    */   private String note;
/*    */   private float discount;
/*    */   private float tax;
/*    */   private float netAmount;
/*    */   @OneToMany(targetEntity = MedicineCategory.class, cascade = {CascadeType.ALL})
/*    */   @JoinColumn(name = "mc_fk", referencedColumnName = "mid", insertable = true, updatable = true, nullable = false)
/*    */   private List<MedicineCategory> medicineCategory;
/*    */   
/*    */   public MedicianDetails(int mid, String billNo, String patientId, String date, String doctor, String hospitalDoctor, String note, float discount, float tax, float netAmount, List<MedicineCategory> medicineCategory) {
/* 38 */     this.medicineCategory = new ArrayList<>(); this.mid = mid; this.billNo = billNo; this.patientId = patientId; this.date = date; this.doctor = doctor; this.hospitalDoctor = hospitalDoctor; this.note = note; this.discount = discount; this.tax = tax; this.netAmount = netAmount; this.medicineCategory = medicineCategory; } public MedicianDetails() { this.medicineCategory = new ArrayList<>(); }
/*    */   public void setMid(int mid) { this.mid = mid; }
/* 40 */   public void setBillNo(String billNo) { this.billNo = billNo; } public void setPatientId(String patientId) { this.patientId = patientId; } public List<MedicineCategory> getMedicineCategory() { return this.medicineCategory; }
/*    */ 
/*    */   
/*    */   public void setDate(String date) {
/*    */     this.date = date;
/*    */   }
/*    */   
/*    */   public void setDoctor(String doctor) {
/*    */     this.doctor = doctor;
/*    */   }
/*    */   
/*    */   public void setHospitalDoctor(String hospitalDoctor) {
/*    */     this.hospitalDoctor = hospitalDoctor;
/*    */   }
/*    */   
/*    */   public void setNote(String note) {
/*    */     this.note = note;
/*    */   }
/*    */   
/*    */   public void setDiscount(float discount) {
/*    */     this.discount = discount;
/*    */   }
/*    */   
/*    */   public void setTax(float tax) {
/*    */     this.tax = tax;
/*    */   }
/*    */   
/*    */   public void setNetAmount(float netAmount) {
/*    */     this.netAmount = netAmount;
/*    */   }
/*    */   
/*    */   public void setMedicineCategory(List<MedicineCategory> medicineCategory) {
/*    */     this.medicineCategory = medicineCategory;
/*    */   }
/*    */   
/*    */   
/*    */   protected boolean canEqual(Object other) {
/*    */     return other instanceof MedicianDetails;
/*    */   }
/*    */   
/*    */   
/*    */   public String toString() {
/*    */     return "MedicianDetails(mid=" + getMid() + ", billNo=" + getBillNo() + ", patientId=" + getPatientId() + ", date=" + getDate() + ", doctor=" + getDoctor() + ", hospitalDoctor=" + getHospitalDoctor() + ", note=" + getNote() + ", discount=" + getDiscount() + ", tax=" + getTax() + ", netAmount=" + getNetAmount() + ", medicineCategory=" + getMedicineCategory() + ")";
/*    */   }
/*    */   
/*    */   public int getMid() {
/*    */     return this.mid;
/*    */   }
/*    */   
/*    */   public String getBillNo() {
/*    */     return this.billNo;
/*    */   }
/*    */   
/*    */   public String getPatientId() {
/*    */     return this.patientId;
/*    */   }
/*    */   
/*    */   public String getDate() {
/*    */     return this.date;
/*    */   }
/*    */   
/*    */   public String getDoctor() {
/*    */     return this.doctor;
/*    */   }
/*    */   
/*    */   public String getHospitalDoctor() {
/*    */     return this.hospitalDoctor;
/*    */   }
/*    */   
/*    */   public String getNote() {
/*    */     return this.note;
/*    */   }
/*    */   
/*    */   public float getDiscount() {
/*    */     return this.discount;
/*    */   }
/*    */   
/*    */   public float getTax() {
/*    */     return this.tax;
/*    */   }
/*    */   
/*    */   public float getNetAmount() {
/*    */     return this.netAmount;
/*    */   }
/*    */ }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\MedicianDetails.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */