/*    */ package com.hms.management.ipd.controller;
/*    */ 
/*    */ import com.hms.management.ipd.modal.MyIpdDiagnosis;
/*    */ import com.hms.management.ipd.repo.MyIpdDiagnosisRepo;
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
/*    */ @RequestMapping({"/myipddiagnosis"})
/*    */ public class MyIpdDiagnisisController
/*    */ {
/*    */   @Autowired
/*    */   private UploadFile upload;
/*    */   @Autowired
/*    */   private MyIpdDiagnosisRepo myIpdDiagnosisRepo;
/*    */   
/*    */   @PostMapping({"/add"})
/*    */   public <T> T add(MyIpdDiagnosis b, @RequestParam("file") Optional<MultipartFile> file) {
/* 34 */     b.setDocument(file.isPresent() ? (String)this.upload.upload(file.get()) : b.getDocument());
/* 35 */     return (T)this.myIpdDiagnosisRepo.save(b);
/*    */   }
/*    */ 
/*    */   
/*    */   @GetMapping({"/get"})
/*    */   public <T> T get() {
/* 41 */     return (T)this.myIpdDiagnosisRepo.findAll();
/*    */   }
/*    */ 
/*    */   
/*    */   @GetMapping({"/get/{IpdId}"})
/*    */   public <T> T get(@PathVariable String IpdId) {
/* 47 */     return (T)this.myIpdDiagnosisRepo.fetchByIpdId(IpdId);
/*    */   }
/*    */ 
/*    */   
/*    */   @GetMapping({"/delete/{id}"})
/*    */   public <T> T delete(@PathVariable int id) {
/* 53 */     this.myIpdDiagnosisRepo.deleteById(Integer.valueOf(id));
/* 54 */     Map<String, String> map = new HashMap<>();
/* 55 */     map.put("id", "" + id);
/* 56 */     return (T)map;
/*    */   }
/*    */ }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\ipd\controller\MyIpdDiagnisisController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */