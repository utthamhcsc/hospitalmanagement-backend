package com.hms.management.calander.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.management.calander.modal.CalenderEvent;
import com.hms.management.calander.repo.CalenderEventRepo;

@CrossOrigin
@RestController
@RequestMapping("/calenderEvent")
public class CalenderEventController {
	@Autowired
	private CalenderEventRepo CalenderEventRepo;
	
	@PostMapping("/add")
	public <T> T add(@RequestBody CalenderEvent b) {
		//System.out.println(b);
		
		return (T) CalenderEventRepo.save(b);
		//return null;
		
	}
	
	@GetMapping("/get")
	public <T> T get() {
		return (T) CalenderEventRepo.findAll();
		
	}
	
	@GetMapping("/getByUser/{userId}")
	public <T> T findByuserId(@PathVariable String userId) {
		return (T) CalenderEventRepo.getByUserId(userId, "public");
		
	}
	
	
	@GetMapping("/delete/{id}")
	public <T> T delete(@PathVariable int id) {
		CalenderEventRepo.deleteById(id);
		return (T) (""+id);
	}
}
