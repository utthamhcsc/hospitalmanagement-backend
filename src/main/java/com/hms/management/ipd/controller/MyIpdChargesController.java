/*    */ package com.hms.management.ipd.controller;
/*    */ 
/*    */ import com.hms.management.ipd.modal.MyIpdCharges;
/*    */ import com.hms.management.ipd.repo.MyIpdChargesRepo;
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
/*    */ @CrossOrigin
/*    */ @RestController
/*    */ @RequestMapping({"/myipdcharges"})
/*    */ public class MyIpdChargesController
/*    */ {
/*    */   @Autowired
/*    */   private MyIpdChargesRepo myIpdChargesRepo;
/*    */   
/*    */   @PostMapping({"/add"})
/*    */   public <T> T add(@RequestBody MyIpdCharges b) {
/* 25 */     return (T)this.myIpdChargesRepo.save(b);
/*    */   }
/*    */ 
/*    */   
/*    */   @GetMapping({"/get"})
/*    */   public <T> T get() {
/* 31 */     return (T)this.myIpdChargesRepo.findAll();
/*    */   }
/*    */ 
/*    */   
/*    */   @GetMapping({"/get/{IpdId}"})
/*    */   public <T> T get(@PathVariable String IpdId) {
/* 37 */     return (T)this.myIpdChargesRepo.findByIpdId(IpdId);
/*    */   }
/*    */ 
/*    */   
/*    */   @GetMapping({"/delete/{id}"})
/*    */   public <T> T delete(@PathVariable int id) {
/* 43 */     this.myIpdChargesRepo.deleteById(Integer.valueOf(id));
/*    */     
/* 45 */     return (T)("" + id);
/*    */   }
/*    */ }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\ipd\controller\MyIpdChargesController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */