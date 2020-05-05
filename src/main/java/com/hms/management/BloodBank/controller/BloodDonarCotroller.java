package com.hms.management.BloodBank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.management.BloodBank.Repo.BloodDonarRepo;
import com.hms.management.BloodBank.Repo.BloodStatusRepo;
import com.hms.management.BloodBank.modal.BloodDonar;

@RestController
@CrossOrigin
@RequestMapping("/blooddonar")
public class BloodDonarCotroller {

	@Autowired
	private BloodDonarRepo BloodDonarRepo;
	
	@PostMapping("/add")
	public <T> T add(@RequestBody BloodDonar b) {
		return (T) BloodDonarRepo.save(b);
		
	}
	
	@GetMapping("/get")
	public <T> T get() {
		return (T) BloodDonarRepo.findAll();
		
	}
	
	@GetMapping("/delete/{id}")
	public <T> T delete(@PathVariable int id) {
		BloodDonarRepo.deleteById(id);
		return (T) (""+id);
	
}
}

