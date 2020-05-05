package com.hms.management.Finance.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.hms.management.Finance.modal.FinanceIncomeHead;
import com.hms.management.Finance.repo.FinanceIncomeRepo;
import com.hms.management.serviceimpl.UploadFile;

@RestController
/*    */ @CrossOrigin
/*    */ @RequestMapping({"/financeincome"})
/*    */ public class FinanceIncomeController
/*    */ {
/*    */   @Autowired
/*    */   private UploadFile upload;
/*    */   @Autowired
/*    */   private FinanceIncomeRepo FinanceIncomeRepo;
/*    */   
/*    */   @PostMapping({"/add"})
/*    */   public <T> T add(FinanceIncomeHead b, @RequestParam("file") Optional<MultipartFile> file) {
/* 34 */     b.setAttachDocument(file.isPresent() ? (String)this.upload.upload(file.get()) : b.getAttachDocument());
/* 35 */     return (T)this.FinanceIncomeRepo.save(b);
/*    */   }
/*    */ 
@PostMapping({"/getbyDate"})
/*    */   public <T> T get(@RequestParam("fromDate")String fromDate,@RequestParam("toDate")String toDate) {
/* 41 */     return (T)this.FinanceIncomeRepo.getbydate(fromDate, toDate);
/*    */   }
/*    */   
/*    */   @GetMapping({"/get"})
/*    */   public <T> T get() {
/* 41 */     return (T)this.FinanceIncomeRepo.fetchAll();
/*    */   }
/*    */ 
/*    */   
/*    */  
/*    */ 
/*    */   
/*    */   @GetMapping({"/delete/{id}"})
/*    */   public <T> T delete(@PathVariable int id) {
/* 53 */     this.FinanceIncomeRepo.deleteById(id);
/* 54 */    
/* 56 */     return (T)(""+id);
/*    */   }
/*    */ }

