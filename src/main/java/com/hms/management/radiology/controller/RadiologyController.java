package com.hms.management.radiology.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.management.radiology.modal.Radiology;
import com.hms.management.radiology.repo.RadiologyRepo;

@RestController
@CrossOrigin
@RequestMapping("/radiology")
public class RadiologyController {
	@Autowired
	private RadiologyRepo RadiologyRepo;
	
	@PostMapping("/add")
	public <T> T add(@RequestBody Radiology b) {
		return (T) RadiologyRepo.save(b);
		
	}
	
	@GetMapping("/get")
	public <T> T get() {
		return (T) RadiologyRepo.fetchAll();
		
	}
	
	@GetMapping("/delete/{id}")
	public <T> T delete(@PathVariable int id) {
		RadiologyRepo.deleteById(id);
		return (T) (""+id);
		
	}


}
