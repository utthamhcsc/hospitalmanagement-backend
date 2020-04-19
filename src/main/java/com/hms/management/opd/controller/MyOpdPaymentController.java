/*    */ package com.hms.management.opd.controller;
/*    */ 
/*    */ import com.hms.management.opd.Repo.MyOpdPaymentRepo;
/*    */ import com.hms.management.opd.modal.MyOpdPayment;
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
/*    */ @RequestMapping({"/myopdpayment"})
/*    */ public class MyOpdPaymentController
/*    */ {
/*    */   @Autowired
/*    */   private UploadFile upload;
/*    */   @Autowired
/*    */   private MyOpdPaymentRepo myOpdPaymentRepo;
/*    */   
/*    */   @PostMapping({"/add"})
/*    */   public <T> T add(MyOpdPayment b, @RequestParam("file") Optional<MultipartFile> file) {
/* 29 */     b.setAttachDocument(file.isPresent() ? (String)this.upload.upload(file.get()) : b.getAttachDocument());
/* 30 */     return (T)this.myOpdPaymentRepo.save(b);
/*    */   }
/*    */ 
/*    */   
/*    */   @GetMapping({"/get"})
/*    */   public <T> T get() {
/* 36 */     return (T)this.myOpdPaymentRepo.findAll();
/*    */   }
/*    */ 
/*    */   
/*    */   @GetMapping({"/get/{opdId}"})
/*    */   public <T> T get(@PathVariable String opdId) {
/* 42 */     return (T)this.myOpdPaymentRepo.findByOpdId(opdId);
/*    */   }
/*    */ 
/*    */   
/*    */   @GetMapping({"/delete/{id}"})
/*    */   public <T> T delete(@PathVariable int id) {
/* 48 */     this.myOpdPaymentRepo.deleteById(Integer.valueOf(id));
/*    */     
/* 50 */     return (T)("" + id);
/*    */   }
/*    */ }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\opd\controller\MyOpdPaymentController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */