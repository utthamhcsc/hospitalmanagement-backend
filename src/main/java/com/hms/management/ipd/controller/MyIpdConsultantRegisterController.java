/*    */ package com.hms.management.ipd.controller;
/*    */ 
/*    */ import com.hms.management.ipd.modal.MyIpdConsultantInstructionRegister;
/*    */ import com.hms.management.ipd.repo.MyIpdConsultantRegisterRepo;
/*    */ import java.util.HashMap;
/*    */ import java.util.List;
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
/*    */ @RestController
/*    */ @CrossOrigin
/*    */ @RequestMapping({"/myipdconsultantregister"})
/*    */ public class MyIpdConsultantRegisterController
/*    */ {
/*    */   @Autowired
/*    */   private MyIpdConsultantRegisterRepo myIpdPrescriptionRepo;
/*    */   
/*    */   @PostMapping({"/add"})
/*    */   public <T> T add(@RequestBody List<MyIpdConsultantInstructionRegister> b) {
/* 29 */     return (T)this.myIpdPrescriptionRepo.saveAll(b);
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
/* 41 */     return (T)this.myIpdPrescriptionRepo.fetchByIpdid(IpdId);
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


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\ipd\controller\MyIpdConsultantRegisterController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */