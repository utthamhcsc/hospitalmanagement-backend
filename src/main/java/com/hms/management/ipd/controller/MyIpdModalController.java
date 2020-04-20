/*    */ package com.hms.management.ipd.controller;
/*    */ 
/*    */ import com.hms.management.ipd.modal.MyIpdmodal;
/*    */ import com.hms.management.ipd.repo.MyIpdModalRepo;
/*    */ import com.hms.management.model.Bed;
/*    */ import com.hms.management.repository.BedRepo;
/*    */ import java.time.LocalDateTime;
/*    */ import java.time.format.DateTimeFormatter;
/*    */ import java.util.HashMap;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.Optional;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.web.bind.annotation.CrossOrigin;
/*    */ import org.springframework.web.bind.annotation.GetMapping;
/*    */ import org.springframework.web.bind.annotation.PathVariable;
/*    */ import org.springframework.web.bind.annotation.PostMapping;
/*    */ import org.springframework.web.bind.annotation.RequestBody;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ import org.springframework.web.bind.annotation.RestController;
/*    */ 
/*    */ 
/*    */ 
/*    */ @CrossOrigin
/*    */ @RestController
/*    */ @RequestMapping({"/myIpd"})
/*    */ public class MyIpdModalController
/*    */ {
/*    */   @Autowired
/*    */   private MyIpdModalRepo myIpdModalRepo;
/*    */   @Autowired
/*    */   private BedRepo bedrepo;
/*    */   
/*    */   @PostMapping({"/add"})
/*    */   public <T> T add(@RequestBody MyIpdmodal s) {
/* 36 */     List<?> m = this.myIpdModalRepo.findByPatientIdAndStatus(s.getPatientId(), "NO");
/* 37 */     if (m.size() > 0) {
	if(s.getIpdId() != null && !s.getIpdId().isEmpty()){
		
	}else {
/* 38 */       Map<String, String> map = new HashMap<>();
/* 39 */       map.put("err", "Record Already Exist");
/* 40 */       return (T)map;
	}
/*    */     } 
/* 42 */     s.setStatus("NO");
/* 43 */     Optional<Bed> bed = this.bedrepo.findById(Integer.valueOf(s.getBedNumber()));
/* 44 */     if (bed.isPresent()) {
/* 45 */       Bed b = bed.get();
/* 46 */       b.setIsActive(1);
/* 47 */       this.bedrepo.save(b);
/*    */     } 
/* 49 */     s.setIpdId((s.getIpdId() != null && !s.getIpdId().isEmpty()) ? s.getIpdId() : ("ipd-" + DateTimeFormatter.ofPattern("yyyyMMMddhhmmsa").format(LocalDateTime.now())));
/* 50 */     return (T)this.myIpdModalRepo.save(s);
/*    */   }
/*    */   
/*    */   @PostMapping({"/discharge"})
/*    */   public <T> T update(@RequestBody MyIpdmodal s) {
/* 55 */     Optional<Bed> bed = this.bedrepo.findById(Integer.valueOf(s.getBedNumber()));
/* 56 */     if (bed.isPresent()) {
/* 57 */       Bed b = bed.get();
/* 58 */       b.setIsActive(0);
/* 59 */       this.bedrepo.save(b);
/*    */     } 
/* 61 */     s.setStatus("YES");
/*    */     
/* 63 */     return (T)this.myIpdModalRepo.save(s);
/*    */   }
/*    */   
/*    */   @GetMapping({"/get/status/{value}"})
/*    */   public <T> T get(@PathVariable String value) {
/* 68 */     return (T)this.myIpdModalRepo.fetchIpdPatients(value);
/*    */   }

@GetMapping({"/get/doctor/{doctorId}/{status}"})
/*    */   public <T> T getbyDoctor(@PathVariable String doctorId,@PathVariable String status) {
/* 68 */     return (T)this.myIpdModalRepo.fetchIpdPatients(doctorId,status);
/*    */   }
/*    */ }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\ipd\controller\MyIpdModalController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */