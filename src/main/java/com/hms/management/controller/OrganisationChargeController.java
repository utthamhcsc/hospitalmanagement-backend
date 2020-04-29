/*    */ package com.hms.management.controller;
/*    */ 
/*    */ import com.hms.management.model.Setting_Charges;
/*    */ import com.hms.management.repository.OrganisationChargesRepo;
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
/*    */ @RequestMapping({"/organisationCharges"})
/*    */ public class OrganisationChargeController {
/*    */   @Autowired
/*    */   private OrganisationChargesRepo organisationChargesRepo;
/*    */   
/*    */   @PostMapping({"/add"})
/*    */   public <T> T add(@RequestBody Setting_Charges b) {
/* 23 */     return (T)this.organisationChargesRepo.save(b);
/*    */   }
/*    */   
/*    */   @GetMapping({"/get"})
/*    */   public <T> T get() {
/* 28 */     return (T)this.organisationChargesRepo.findAll();
/*    */   }
/*    */   
/*    */   @GetMapping({"/get/{chargeType}/{chargeCategory}"})
/*    */   public <T> T get(@PathVariable String chargeType, @PathVariable String chargeCategory) {
/* 33 */     return (T)this.organisationChargesRepo.findByChargeTypeAndChargeCategory(chargeType, chargeCategory);
/*    */   }
/*    */ 
/*    */   
/*    */   @GetMapping({"/delete/{id}"})
/*    */   public <T> T delete(@PathVariable int id) {
/* 39 */     this.organisationChargesRepo.deleteById(Integer.valueOf(id));
/* 40 */     return (T)("" + id);
/*    */   }
/*    */ }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\controller\OrganisationChargeController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */