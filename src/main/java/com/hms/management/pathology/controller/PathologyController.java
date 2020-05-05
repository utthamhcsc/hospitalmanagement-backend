package com.hms.management.pathology.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.management.pathology.modal.Pathology;
import com.hms.management.pathology.repository.PathologyRepo;

@RestController
@CrossOrigin
@RequestMapping("/pathology")
public class PathologyController {
	@Autowired
	private PathologyRepo PathologyRepo;
	
	@PostMapping("/add")
	public <T> T add(@RequestBody Pathology b) {
		return (T) PathologyRepo.save(b);
		
	}
	
	@GetMapping("/get")
	public <T> T get() {
		return (T) PathologyRepo.fetchAll();
		
	}
	
	@GetMapping("/delete/{id}")
	public <T> T delete(@PathVariable int id) {
		PathologyRepo.deleteById(id);
		return (T) (""+id);
		
	}


}
