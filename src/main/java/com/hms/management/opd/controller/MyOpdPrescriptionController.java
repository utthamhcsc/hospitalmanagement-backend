/*    */ package com.hms.management.opd.controller;
/*    */ 
/*    */ import com.hms.management.opd.Repo.MyOpdPrescriptionRepo;
/*    */ import com.hms.management.opd.modal.MyOpdPrescription;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
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
/*    */ @RestController
/*    */ @CrossOrigin
/*    */ @RequestMapping({"/myopdprescription"})
/*    */ public class MyOpdPrescriptionController
/*    */ {
/*    */   @Autowired
/*    */   private MyOpdPrescriptionRepo myOpdPrescriptionRepo;
/*    */   
/*    */   @PostMapping({"/add"})
/*    */   public <T> T add(@RequestBody MyOpdPrescription b) {
/* 29 */     return (T)this.myOpdPrescriptionRepo.save(b);
/*    */   }
/*    */ 
/*    */   
/*    */   @GetMapping({"/get"})
/*    */   public <T> T get() {
/* 35 */     return (T)this.myOpdPrescriptionRepo.findAll();
/*    */   }
/*    */ 
/*    */   
/*    */   @GetMapping({"/get/{opdId}"})
/*    */   public <T> T get(@PathVariable String opdId) {
/* 41 */     return (T)this.myOpdPrescriptionRepo.fetchByOpdId(opdId);
/*    */   }
/*    */ 
/*    */   
/*    */   @GetMapping({"/delete/{id}"})
/*    */   public <T> T delete(@PathVariable String id) {
/* 47 */     this.myOpdPrescriptionRepo.deleteById(id);
/* 48 */     Map<String, String> map = new HashMap<>();
/* 49 */     map.put("id", id);
/* 50 */     return (T)map;
/*    */   }
/*    */ }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\opd\controller\MyOpdPrescriptionController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */