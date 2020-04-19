/*    */ package com.hms.management.opd.controller;
/*    */ 
/*    */ import com.hms.management.opd.Repo.MyOpdChargesRepo;
/*    */ import com.hms.management.opd.modal.MyOpdCharges;
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
/*    */ @RequestMapping({"/myopdcharges"})
/*    */ public class MyOpdChargesController
/*    */ {
/*    */   @Autowired
/*    */   private MyOpdChargesRepo myOpdChargesRepo;
/*    */   
/*    */   @PostMapping({"/add"})
/*    */   public <T> T add(@RequestBody MyOpdCharges b) {
/* 25 */     return (T)this.myOpdChargesRepo.save(b);
/*    */   }
/*    */ 
/*    */   
/*    */   @GetMapping({"/get"})
/*    */   public <T> T get() {
/* 31 */     return (T)this.myOpdChargesRepo.findAll();
/*    */   }
/*    */ 
/*    */   
/*    */   @GetMapping({"/get/{opdId}"})
/*    */   public <T> T get(@PathVariable String opdId) {
/* 37 */     return (T)this.myOpdChargesRepo.findByOpdId(opdId);
/*    */   }
/*    */ 
/*    */   
/*    */   @GetMapping({"/delete/{id}"})
/*    */   public <T> T delete(@PathVariable int id) {
/* 43 */     this.myOpdChargesRepo.deleteById(Integer.valueOf(id));
/*    */     
/* 45 */     return (T)("" + id);
/*    */   }
/*    */ }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\opd\controller\MyOpdChargesController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */