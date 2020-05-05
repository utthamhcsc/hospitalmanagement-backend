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

import com.hms.management.BirthDeath.modal.MyBirthRecord;
import com.hms.management.BirthDeath.repo.MyBirthRecordRepo;
import com.hms.management.serviceimpl.UploadFile;

@RestController
/*    */ @CrossOrigin
/*    */ @RequestMapping({"/mybirthrecord"})
/*    */ public class MyBirthRecordController
/*    */ {
/*    */   @Autowired
/*    */   private UploadFile upload;
/*    */   @Autowired
/*    */   private MyBirthRecordRepo MyBirthRecordRepo;
/*    */   
/*    */   @PostMapping({"/add"})
/*    */   public <T> T add(MyBirthRecord b, @RequestParam("file") Optional<MultipartFile> file,
		
		@RequestParam("childPhotoFile") Optional<MultipartFile> childPhotoFile,
		@RequestParam("motherPhotoFile") Optional<MultipartFile> motherPhotoFile,
		@RequestParam("fatherPhotoFile") Optional<MultipartFile> fatherPhotoFile
		) {
/* 34 */     b.setChildPhoto(childPhotoFile.isPresent() ? (String)this.upload.upload(childPhotoFile.get()) : b.getChildPhoto());
b.setMotherPhoto(motherPhotoFile.isPresent() ? (String)this.upload.upload(motherPhotoFile.get()) : b.getMotherPhoto());
b.setFatherPhoto(fatherPhotoFile.isPresent() ? (String)this.upload.upload(fatherPhotoFile.get()) : b.getFatherPhoto());
b.setAttachDocument(file.isPresent() ? (String)this.upload.upload(file.get()) : b.getAttachDocument());
/* 35 */     return (T)this.MyBirthRecordRepo.save(b);
/*    */   }
/*    */ 
@PostMapping({"/getbyDate"})
/*    */   public <T> T get(@RequestParam("fromDate")String fromDate,@RequestParam("toDate")String toDate) {
/* 41 */     return (T)this.MyBirthRecordRepo.getbydate(fromDate, toDate);
/*    */   }
/*    */   
/*    */   @GetMapping({"/get"})
/*    */   public <T> T get() {
/* 41 */     return (T)this.MyBirthRecordRepo.findAll();
/*    */   }

/*    */   @GetMapping({"/delete/{id}"})
/*    */   public <T> T delete(@PathVariable int id) {
/* 53 */     this.MyBirthRecordRepo.deleteById(id);
/* 54 */    
/* 56 */     return (T)(""+id);
/*    */   }
/*    */ }


