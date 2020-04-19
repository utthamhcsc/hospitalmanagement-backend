/*    */ package com.hms.management.controller;
/*    */ 
/*    */ import com.hms.management.model.DoctorOpdCharge;
/*    */ import com.hms.management.repository.DoctorOpdChargeRepository;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.web.bind.annotation.CrossOrigin;
/*    */ import org.springframework.web.bind.annotation.GetMapping;
/*    */ import org.springframework.web.bind.annotation.PathVariable;
/*    */ import org.springframework.web.bind.annotation.PostMapping;
/*    */ import org.springframework.web.bind.annotation.RequestBody;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ import org.springframework.web.bind.annotation.RestController;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @CrossOrigin
/*    */ @RestController
/*    */ @RequestMapping({"/doctorOpdCharge"})
/*    */ public class DoctorOpdChargeController
/*    */ {
/*    */   @Autowired
/*    */   private DoctorOpdChargeRepository docOpdCharge;
/*    */   
/*    */   @PostMapping({"/add"})
/*    */   public <T> T add(@RequestBody DoctorOpdCharge b) {
/* 27 */     System.out.println(b);
/* 28 */     return (T)this.docOpdCharge.save(b);
/*    */   }
/*    */ 
/*    */   
/*    */   @GetMapping({"/get"})
/*    */   public <T> T get() {
/* 34 */     return (T)this.docOpdCharge.findAll();
/*    */   }
/*    */   
/*    */   @GetMapping({"/get/{staffId}"})
/*    */   public <T> T get(@PathVariable String staffId) {
/* 39 */     return (T)this.docOpdCharge.findByDoctorId(staffId).stream().findFirst();
/*    */   }
/*    */ 
/*    */   
/*    */   @GetMapping({"/delete/{id}"})
/*    */   public <T> T delete(@PathVariable int id) {
/* 45 */     this.docOpdCharge.deleteById(Integer.valueOf(id));
/* 46 */     return (T)("" + id);
/*    */   }
/*    */ }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\controller\DoctorOpdChargeController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */