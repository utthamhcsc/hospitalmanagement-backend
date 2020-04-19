/*    */ package com.hms.management.ipd.controller;
/*    */ 
/*    */ import com.hms.management.ipd.modal.MyIpdPayment;
/*    */ import com.hms.management.ipd.repo.MyIpdPaymentRepo;
/*    */ import com.hms.management.serviceimpl.UploadFile;
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
/*    */ @RestController
/*    */ @CrossOrigin
/*    */ @RequestMapping({"/myipdpayment"})
/*    */ public class MyIpdPaymentController
/*    */ {
/*    */   @Autowired
/*    */   private UploadFile upload;
/*    */   @Autowired
/*    */   private MyIpdPaymentRepo myIpdPaymentRepo;
/*    */   
/*    */   @PostMapping({"/add"})
/*    */   public <T> T add(MyIpdPayment b, @RequestParam("file") Optional<MultipartFile> file) {
/* 29 */     b.setAttachDocument(file.isPresent() ? (String)this.upload.upload(file.get()) : b.getAttachDocument());
/* 30 */     return (T)this.myIpdPaymentRepo.save(b);
/*    */   }
/*    */ 
/*    */   
/*    */   @GetMapping({"/get"})
/*    */   public <T> T get() {
/* 36 */     return (T)this.myIpdPaymentRepo.findAll();
/*    */   }
/*    */ 
/*    */   
/*    */   @GetMapping({"/get/{IpdId}"})
/*    */   public <T> T get(@PathVariable String IpdId) {
/* 42 */     return (T)this.myIpdPaymentRepo.findByIpdId(IpdId);
/*    */   }
/*    */ 
/*    */   
/*    */   @GetMapping({"/delete/{id}"})
/*    */   public <T> T delete(@PathVariable int id) {
/* 48 */     this.myIpdPaymentRepo.deleteById(Integer.valueOf(id));
/*    */     
/* 50 */     return (T)("" + id);
/*    */   }
/*    */ }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\ipd\controller\MyIpdPaymentController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */