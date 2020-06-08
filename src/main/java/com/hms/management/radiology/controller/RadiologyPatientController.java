package com.hms.management.radiology.controller;

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

import com.hms.management.radiology.modal.RadiologyPatient;
import com.hms.management.radiology.repo.RadiologyPatientRepo;
import com.hms.management.serviceimpl.UploadFile;
@RestController
@CrossOrigin
@RequestMapping("/radiologypatient")
public class RadiologyPatientController {
	 @Autowired
	 /*    */   private UploadFile upload;
	 /*    */   @Autowired
	 /*    */   private  RadiologyPatientRepo  RadiologyPatientRepo;
	 /*    */   
	 /*    */   @PostMapping({"/add"})
	 /*    */   public <T> T add(RadiologyPatient b, @RequestParam("file") Optional<MultipartFile> file) {
	 /* 34 */     b.setTestReport(file.isPresent() ? (String)this.upload.upload(file.get()) : b.getTestReport());
	 /* 35 */     return (T)this. RadiologyPatientRepo.save(b);
	 /*    */   }
	 /*    */ 
	 /*    */   
	 /*    */   @GetMapping({"/get"})
	 /*    */   public <T> T get() {
	 /* 41 */     return (T)this. RadiologyPatientRepo.fetchAll();
	 /*    */   }
	 /*    */ 
	 @PostMapping({"/getbyDate"})
	 /*    */   public <T> T getbyDates1(@RequestParam("fromDate") String fromDate,@RequestParam("toDate") String toDate) {
	 /* 41 */     return (T)this. RadiologyPatientRepo.getByDate(fromDate, toDate);
	 /*    */   }
	 /*    */ 
	 /*    */   @GetMapping("/get/doctor/{doctorId}")
		public <T> T getBydoctor(@PathVariable String doctorId) {
			return (T) RadiologyPatientRepo.fetchByDoctor(doctorId);
	 /*    */ }
	 /*    */  	@GetMapping("/get/patient/{patientId}")
		public <T> T getBypatient(@PathVariable String patientId) {
			return (T) RadiologyPatientRepo.fetchByPatient(patientId);
			
		}
	 /*    */ 
	 /*    */   
	 /*    */   @GetMapping({"/delete/{id}"})
	 /*    */   public <T> T delete(@PathVariable int id) {
	 /* 53 */     this. RadiologyPatientRepo.deleteById(id);
	 /* 54 */    
	 /* 56 */     return (T) (""+id);
	 /*    */   }
	 /*    */ }
