package com.hms.management.BirthDeath.controller;

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

import com.hms.management.BirthDeath.modal.MyDeathRecord;
import com.hms.management.BirthDeath.repo.MyDeathRecordRepo;
import com.hms.management.serviceimpl.UploadFile;

@RestController
/*    */ @CrossOrigin
/*    */ @RequestMapping({"/mydeathrecord"})
/*    */ public class MyDeathRecordController
/*    */ {
/*    */   @Autowired
/*    */   private UploadFile upload;
/*    */   @Autowired
/*    */   private MyDeathRecordRepo MyDeathRecordRepo;
/*    */   
/*    */   @PostMapping({"/add"})
/*    */   public <T> T add(MyDeathRecord b, @RequestParam("file") Optional<MultipartFile> file) {
/* 34 */    // b.setAttachDocument(file.isPresent() ? (String)this.upload.upload(file.get()) : b.getAttachDocument());
/* 35 */     return (T)this.MyDeathRecordRepo.save(b);
/*    */   }
/*    */ 
/*    */   
/*    */   @GetMapping({"/get"})
/*    */   public <T> T get() {
/* 41 */     return (T)this.MyDeathRecordRepo.fetchAll();
/*    */   }

@PostMapping({"/getbyDate"})
/*    */   public <T> T get(@RequestParam("fromDate")String fromDate,@RequestParam("toDate")String toDate) {
/* 41 */     return (T)this.MyDeathRecordRepo.getbydate(fromDate, toDate);
/*    */   }
/*    */ 
/*    */   
/*    */  
/*    */ 
/*    */   
/*    */   @GetMapping({"/delete/{id}"})
/*    */   public <T> T delete(@PathVariable int id) {
/* 53 */     this.MyDeathRecordRepo.deleteById(id);
/* 54 */    
/* 56 */     return (T)(""+id);
/*    */   }
/*    */ }

