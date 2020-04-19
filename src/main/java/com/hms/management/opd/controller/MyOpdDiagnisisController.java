/*    */ package com.hms.management.opd.controller;
/*    */ 
/*    */ import com.hms.management.opd.Repo.MyOpdDiagnosisRepo;
/*    */ import com.hms.management.opd.modal.MyOpdDiagnosis;
/*    */ import com.hms.management.serviceimpl.UploadFile;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import java.util.Optional;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.web.bind.annotation.CrossOrigin;
/*    */ import org.springframework.web.bind.annotation.GetMapping;
/*    */ import org.springframework.web.bind.annotation.PathVariable;
/*    */ import org.springframework.web.bind.annotation.PostMapping;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ import org.springframework.web.bind.annotation.RequestParam;
/*    */ import org.springframework.web.bind.annotation.RestController;
/*    */ import org.springframework.web.multipart.MultipartFile;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @RestController
/*    */ @CrossOrigin
/*    */ @RequestMapping({"/myopddiagnosis"})
/*    */ public class MyOpdDiagnisisController
/*    */ {
/*    */   @Autowired
/*    */   private UploadFile upload;
/*    */   @Autowired
/*    */   private MyOpdDiagnosisRepo myOpdDiagnosisRepo;
/*    */   
/*    */   @PostMapping({"/add"})
/*    */   public <T> T add(MyOpdDiagnosis b, @RequestParam("file") Optional<MultipartFile> file) {
/* 34 */     b.setDocument(file.isPresent() ? (String)this.upload.upload(file.get()) : b.getDocument());
/* 35 */     return (T)this.myOpdDiagnosisRepo.save(b);
/*    */   }
/*    */ 
/*    */   
/*    */   @GetMapping({"/get"})
/*    */   public <T> T get() {
/* 41 */     return (T)this.myOpdDiagnosisRepo.findAll();
/*    */   }
/*    */ 
/*    */   
/*    */   @GetMapping({"/get/{opdId}"})
/*    */   public <T> T get(@PathVariable String opdId) {
/* 47 */     return (T)this.myOpdDiagnosisRepo.fetchByOpdId(opdId);
/*    */   }
/*    */ 
/*    */   
/*    */   @GetMapping({"/delete/{id}"})
/*    */   public <T> T delete(@PathVariable String id) {
/* 53 */     this.myOpdDiagnosisRepo.deleteById(id);
/* 54 */     Map<String, String> map = new HashMap<>();
/* 55 */     map.put("id", id);
/* 56 */     return (T)map;
/*    */   }
/*    */ }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\opd\controller\MyOpdDiagnisisController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */