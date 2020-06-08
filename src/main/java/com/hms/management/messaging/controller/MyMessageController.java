package com.hms.management.messaging.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.management.messaging.model.MyMessage;
import com.hms.management.messaging.repo.MyMessageRepo;
@CrossOrigin
@RestController
@RequestMapping("/mymessagecontroller")
public class MyMessageController {
	@Autowired
	private MyMessageRepo MyMessageRepo;
	
	@PostMapping("/add")
	public <T> T add(@RequestBody MyMessage b) {
		//System.out.println(b);
		
		return (T) MyMessageRepo.save(b);
		//return null;
		
	}
	
	@GetMapping("/get")
	public <T> T get() {
		return (T) MyMessageRepo.findAll();
		
	}
	
	@GetMapping("/getbyrole/{role}")
	public <T> T getbyR(@PathVariable String role) {
		return (T) MyMessageRepo.fetchbyrole(role);
		
	}
	
	@GetMapping("/delete/{id}")
	public <T> T delete(@PathVariable int id) {
		MyMessageRepo.deleteById(id);
		return (T) (""+id);
	}

}
