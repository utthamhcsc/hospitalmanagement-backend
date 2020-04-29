/*    */ package com.hms.management.opd.controller;
/*    */ import java.time.LocalDateTime;
/*    */ import java.time.format.DateTimeFormatter;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import java.util.Optional;

/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.web.bind.annotation.CrossOrigin;
/*    */ import org.springframework.web.bind.annotation.GetMapping;
/*    */ import org.springframework.web.bind.annotation.PathVariable;
/*    */ import org.springframework.web.bind.annotation.PostMapping;
/*    */ import org.springframework.web.bind.annotation.RequestBody;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
/*    */ import org.springframework.web.bind.annotation.RestController;

/*    */ 
/*    */ import com.hms.management.opd.Repo.MyOpdRepo;
/*    */ import com.hms.management.opd.modal.MyOpdmodal;
/*    */ 
/*    */ 
/*    */ @CrossOrigin
/*    */ @RestController
/*    */ @RequestMapping({"/myopd"})
/*    */ public class MyOpdController
/*    */ {
/*    */   @Autowired
/*    */   private MyOpdRepo myOpdRepo;
/*    */   
/*    */   @PostMapping({"/add"})
/*    */   public <T> T add(@RequestBody MyOpdmodal s) {
/* 30 */     System.out.println(s);
/* 31 */     if (s.getOpdId() == null || !s.getOpdId().isEmpty())
/* 32 */       s.setOpdId("OPD-" + DateTimeFormatter.ofPattern("yyyyMMddHHmmssa").format(LocalDateTime.now())); 
/* 33 */     return (T)this.myOpdRepo.save(s);
/*    */   }
/*    */   
/*    */   @GetMapping({"/get"})
/*    */   public <T> T get() {
/* 38 */     return (T)this.myOpdRepo.fetchAll();
/*    */   }

@GetMapping({"/getall"})
/*    */   public <T> T getal() {
/* 38 */     return (T)this.myOpdRepo.getAll();
/*    */   }
@GetMapping({"/getall/{doctorId}"})
/*    */   public <T> T getallbydoctor(@PathVariable String doctorId) {
/* 38 */     return (T)this.myOpdRepo.getAllByDoctorId(doctorId);
/*    */   }

@PostMapping({"/getbyDate"})
/*    */   public <T> T fetchBydate(@RequestParam("fromDate") String fromDate,
		@RequestParam("toDate") String toDate,
		@RequestParam("doctorId") String doctorId
		) {
	System.out.println(fromDate+" "+toDate+" "+doctorId);
/* 38 */    if(doctorId.equals("empty"))
	return (T)myOpdRepo.getByDate(fromDate, toDate);
	else
		return (T)myOpdRepo.getbyDatewithDoctorId(doctorId, fromDate,toDate);
/*    */   }


/*    */   @GetMapping({"/get/opd/{id}"})
/*    */   public <T> T get1(@PathVariable String id) {
/* 42 */     Optional<MyOpdmodal> s = this.myOpdRepo.findById(id);
/* 43 */     return s.isPresent() ? (T)s : (T)new MyOpdmodal();
/*    */   }
/*    */   
/*    */   @GetMapping({"/get/patient/{patientId}"})
/*    */   public <T> T get(@PathVariable String patientId) {
/* 48 */     return (T)this.myOpdRepo.fetchByPatientId(patientId);
/*    */   }
/*    */    @GetMapping({"/get/doctor/{patientId}"})
/*    */   public <T> T getbydoctor(@PathVariable String patientId) {
/* 48 */     return (T)this.myOpdRepo.fetchByDoctorId(patientId);
/*    */   }
/*    */   @GetMapping({"/delete/{id}"})
/*    */   public <T> T delete(@PathVariable String id) {
/* 53 */     this.myOpdRepo.deleteById(id);
/*    */     
/* 55 */     Map<String, String> map = new HashMap<>();
/* 56 */     map.put("id", id);
/* 57 */     return (T)map;
/*    */   }
/*    */ }


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\opd\controller\MyOpdController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */