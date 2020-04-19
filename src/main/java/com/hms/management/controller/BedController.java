/*    */ package com.hms.management.controller;
/*    */ 
/*    */ import com.hms.management.model.Bed;
/*    */ import com.hms.management.repository.BedRepo;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.web.bind.annotation.CrossOrigin;
/*    */ import org.springframework.web.bind.annotation.GetMapping;
/*    */ import org.springframework.web.bind.annotation.PathVariable;
/*    */ import org.springframework.web.bind.annotation.PostMapping;
/*    */ import org.springframework.web.bind.annotation.RequestBody;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ import org.springframework.web.bind.annotation.RestController;
/*    */ 
/*    */ @RestController
/*    */ @CrossOrigin
/*    */ @RequestMapping({"/bed"})
/*    */ public class BedController {
/*    */   @Autowired
/*    */   private BedRepo bedRepo;
/*    */   
/*    */   @PostMapping({"/add"})
/*    */   public <T> T add(@RequestBody Bed b) {
/* 23 */     return (T)this.bedRepo.save(b);
/*    */   }
/*    */ 
/*    */   
/*    */   @GetMapping({"/get"})
/*    */   public <T> T get() {
/* 29 */     return (T)this.bedRepo.fetchAll();
/*    */   }
/*    */   
/*    */   @GetMapping({"/get/bedgroup/{id}/{status}"})
/*    */   public <T> T get(@PathVariable int id, @PathVariable int status) {
/* 34 */     return (T)this.bedRepo.fetchByBedGrroupId(id, status);
/*    */   }
/*    */   
/*    */   @GetMapping({"/delete/{id}"})
/*    */   public <T> T delete(@PathVariable int id) {
/* 39 */     this.bedRepo.deleteById(Integer.valueOf(id));
/* 40 */     return (T)("" + id);
/*    */   }
/*    */ }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\controller\BedController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */