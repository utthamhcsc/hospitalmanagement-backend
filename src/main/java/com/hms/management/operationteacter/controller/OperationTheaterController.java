package com.hms.management.operationteacter.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hms.management.operationteacter.modal.OperationTheater;
import com.hms.management.operationteacter.repo.OperationTheaterRepo;

@RestController
@CrossOrigin
@RequestMapping("/operationtheater")
public class OperationTheaterController {
	@Autowired
	private OperationTheaterRepo OperationTheaterRepo;
	
	@SuppressWarnings("unchecked")
	@PostMapping("/add")
	public <T> T add(@RequestBody OperationTheater b) {
		return (T) OperationTheaterRepo.save(b);
		
	}
	
	@SuppressWarnings("unchecked")
	@GetMapping("/get")
	public <T> T get() {
		return (T) OperationTheaterRepo.fetchall();
		
	}
	@GetMapping({"/getall"})
	/*    */   public <T> T getal() {
	/* 38 */     return (T)this.OperationTheaterRepo.fetchall();
	/*    */   }
	@GetMapping({"/getall/{doctorId}"})
	/*    */   public <T> T getallbydoctor(@PathVariable String doctorId) {
	/* 38 */     return (T)this.OperationTheaterRepo.fetchbydoctor(doctorId);
	/*    */   }

	@PostMapping({"/getbyDate"})
	/*    */   public <T> T fetchBydate(@RequestParam("fromDate") String fromDate,
			@RequestParam("toDate") String toDate,
			@RequestParam("doctorId") String doctorId
			) {
		System.out.println(fromDate+" "+toDate+" "+doctorId);
	/* 38 */    if(doctorId.equals("empty"))
		return (T)OperationTheaterRepo.fetchbydate(fromDate, toDate);
		else
			return (T)OperationTheaterRepo.fetchbydoctoranddate(doctorId, fromDate, toDate);
	/*    */   }
	@SuppressWarnings("unchecked")
	@GetMapping("/delete/{id}")
	public <T> T delete(@PathVariable int id) {
		OperationTheaterRepo.deleteById(id);
		return (T) (""+id);
	
}
}
