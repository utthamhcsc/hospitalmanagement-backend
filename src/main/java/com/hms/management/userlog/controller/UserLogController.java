package com.hms.management.userlog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hms.management.userlog.repo.UserLogRepo;

@RequestMapping("/userlog")
@CrossOrigin
@RestController
public class UserLogController {
	
	@Autowired 
	private UserLogRepo userlogrepo;
	@GetMapping("/get")
	public <T>T getAll(){
		return (T)userlogrepo.findAll();
	}
	
	@PostMapping({"/getbyDate"})
	/*    */   public <T> T get(@RequestParam("fromDate")String fromDate,@RequestParam("toDate")String toDate) {
	/* 41 */     return (T)this.userlogrepo.getbydate(fromDate, toDate);
	/*    */   }

}
