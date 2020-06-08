package com.hms.management.pathology.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.hms.management.pathology.modal.PathologyPatient;
import com.hms.management.pathology.repository.PathologyPatientRepo;
import com.hms.management.serviceimpl.UploadFile;
@RestController
@CrossOrigin
@RequestMapping("/pathologypatient")
public class PathologyPatientController {
	 @Autowired
	 /*    */   private UploadFile upload;
	 /*    */   @Autowired
	 /*    */   private  PathologyPatientRepo  PathologyPatientRepo;
	 /*    */   
	 /*    */   @PostMapping({"/add"})
	 /*    */   public <T> T add(PathologyPatient b, @RequestParam("file") Optional<MultipartFile> file) {
	 /* 34 */     b.setTestReport(file.isPresent() ? (String)this.upload.upload(file.get()) : b.getTestReport());
	 /* 35 */     return (T)this. PathologyPatientRepo.save(b);
	 /*    */   }
	 /*    */ 
	 /*    */   
	 /*    */   @GetMapping({"/get"})
	 /*    */   public <T> T get() {
	 /* 41 */     return (T)this. PathologyPatientRepo.fetchAll();
	 /*    */   }
	 /*    */ 
	 @PostMapping({"/getbyDate"})
	 /*    */   public <T> T getbyDates1(@RequestParam("fromDate") String fromDate,@RequestParam("toDate") String toDate) {
	 /* 41 */     return (T)this. PathologyPatientRepo.getByDate(fromDate, toDate);
	 /*    */   }
	 /*    */ 
	 /*    */   
	 /*    */  	@GetMapping("/get/patient/{patientId}")
		public <T> T getBypatient(@PathVariable String patientId) {
			return (T) PathologyPatientRepo.fetchByPatient(patientId);
	 /*    */ }
	 
		@GetMapping("/get/doctor/{doctorId}")
		public <T> T getBydoctor(@PathVariable String doctorId) {
			return (T) PathologyPatientRepo.fetchByDoctor(doctorId);
	 /*    */ }
	 /*    */   
	 /*    */   @GetMapping({"/delete/{id}"})
	 /*    */   public <T> T delete(@PathVariable int id) {
	 /* 53 */     this. PathologyPatientRepo.deleteById(id);
	 /* 54 */    
	 /* 56 */     return (T) (""+id);
	 /*    */   }
	 /*    */ }
