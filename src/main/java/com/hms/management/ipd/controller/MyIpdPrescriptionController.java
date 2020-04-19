/*    */ package com.hms.management.ipd.controller;
/*    */ 
/*    */ import com.hms.management.ipd.modal.MyIpdPrescription;
/*    */ import com.hms.management.ipd.repo.MyIpdPrescriptionRepo;
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
/*    */ @RequestMapping({"/myipdprescription"})
/*    */ public class MyIpdPrescriptionController
/*    */ {
/*    */   @Autowired
/*    */   private MyIpdPrescriptionRepo myIpdPrescriptionRepo;
/*    */   
/*    */   @PostMapping({"/add"})
/*    */   public <T> T add(@RequestBody MyIpdPrescription b) {
/* 29 */     return (T)this.myIpdPrescriptionRepo.save(b);
/*    */   }
/*    */ 
/*    */   
/*    */   @GetMapping({"/get"})
/*    */   public <T> T get() {
/* 35 */     return (T)this.myIpdPrescriptionRepo.findAll();
/*    */   }
/*    */ 
/*    */   
/*    */   @GetMapping({"/get/{IpdId}"})
/*    */   public <T> T get(@PathVariable String IpdId) {
/* 41 */     return (T)this.myIpdPrescriptionRepo.fetchByIpdId(IpdId);
/*    */   }
/*    */ 
/*    */   
/*    */   @GetMapping({"/delete/{id}"})
/*    */   public <T> T delete(@PathVariable int id) {
/* 47 */     this.myIpdPrescriptionRepo.deleteById(Integer.valueOf(id));
/* 48 */     Map<String, String> map = new HashMap<>();
/* 49 */     map.put("id", "" + id);
/* 50 */     return (T)map;
/*    */   }
/*    */ }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\ipd\controller\MyIpdPrescriptionController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */