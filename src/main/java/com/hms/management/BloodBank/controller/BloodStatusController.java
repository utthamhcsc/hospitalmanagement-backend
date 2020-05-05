package com.hms.management.BloodBank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.management.BloodBank.Repo.BloodStatusRepo;
import com.hms.management.BloodBank.modal.BloodStatus;

@RestController
@CrossOrigin
@RequestMapping("/bloodstatus")
public class  BloodStatusController{
	@Autowired
	private BloodStatusRepo BloodStatusRepo;
	
	@PostMapping("/add")
	public <T> T add(@RequestBody BloodStatus b) {
		return (T) BloodStatusRepo.save(b);
		
	}
	
	@GetMapping("/get")
	public <T> T get() {
		return (T) BloodStatusRepo.findAll();
		
	}
	
	@GetMapping("/get/{id}")
	public <T> T get(@PathVariable String id) {
		return (T) BloodStatusRepo.findById(id);
		
	}
	
	
	
}
	

