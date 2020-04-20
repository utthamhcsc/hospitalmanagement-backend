/*    */ package com.hms.management.model;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.persistence.CascadeType;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
/*    */ import javax.persistence.GenerationType;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.JoinColumn;
/*    */ import javax.persistence.OneToMany;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Entity
/*    */ @Table(name = "pharmacyBill_Basic")
/*    */ public class Pharmacy_Bill_Basic
/*    */ {
/*    */   @Id
/*    */   @GeneratedValue(strategy = GenerationType.AUTO)
/*    */   private int id;
/*    */   private String patientId;
/*    */   private String patientName;
/*    */   private String date;
/*    */   private String doctor;
/*    */   private String doctorName;
/*    */   private String note;
/*    */   private float discount;
/*    */   private float tax;
/*    */   private float total;
/*    */   private float netamount;
/*    */   @OneToMany(targetEntity = Pharmacy_bill_Details.class, cascade = {CascadeType.ALL})
/*    */   @JoinColumn(name = "pid", referencedColumnName = "id", insertable = true, updatable = true, nullable = false)
/*    */   private List<Pharmacy_bill_Details> medicine;
/*    */   
/*    */   public Pharmacy_Bill_Basic(int id, String patientId, String patientName, String date, String doctor, String doctorName, String note, float discount, float tax, float total, float netamount, List<Pharmacy_bill_Details> medicine) {
/* 39 */     this.medicine = new ArrayList<>(); this.id = id; this.patientId = patientId; this.patientName = patientName; this.date = date; this.doctor = doctor; this.doctorName = doctorName; this.note = note; this.discount = discount; this.tax = tax; this.total = total; this.netamount = netamount; this.medicine = medicine; } public Pharmacy_Bill_Basic() { this.medicine = new ArrayList<>(); }
/*    */   public void setId(int id) { this.id = id; }
/* 41 */   public void setPatientId(String patientId) { this.patientId = patientId; } public void setPatientName(String patientName) { this.patientName = patientName; } public List<Pharmacy_bill_Details> getMedicine() { return this.medicine; }
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
/*    */   public void setDoctorName(String doctorName) {
/*    */     this.doctorName = doctorName;
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
/*    */   public void setTotal(float total) {
/*    */     this.total = total;
/*    */   }
/*    */   
/*    */   public void setNetamount(float netamount) {
/*    */     this.netamount = netamount;
/*    */   }
/*    */   
/*    */   public void setMedicine(List<Pharmacy_bill_Details> medicine) {
/*    */     this.medicine = medicine;
/*    */   }
/*    */   
/*    */   protected boolean canEqual(Object other) {
/*    */     return other instanceof Pharmacy_Bill_Basic;
/*    */   }
/*    */   
/*    */   
/*    */   public String toString() {
/*    */     return "Pharmacy_Bill_Basic(id=" + getId() + ", patientId=" + getPatientId() + ", patientName=" + getPatientName() + ", date=" + getDate() + ", doctor=" + getDoctor() + ", doctorName=" + getDoctorName() + ", note=" + getNote() + ", discount=" + getDiscount() + ", tax=" + getTax() + ", total=" + getTotal() + ", netamount=" + getNetamount() + ", medicine=" + getMedicine() + ")";
/*    */   }
/*    */   
/*    */   public int getId() {
/*    */     return this.id;
/*    */   }
/*    */   
/*    */   public String getPatientId() {
/*    */     return this.patientId;
/*    */   }
/*    */   
/*    */   public String getPatientName() {
/*    */     return this.patientName;
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
/*    */   public String getDoctorName() {
/*    */     return this.doctorName;
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
/*    */   public float getTotal() {
/*    */     return this.total;
/*    */   }
/*    */   
/*    */   public float getNetamount() {
/*    */     return this.netamount;
/*    */   }
/*    */ }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\model\Pharmacy_Bill_Basic.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */