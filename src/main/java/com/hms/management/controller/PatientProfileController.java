package com.hms.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.management.model.PatientProfile;
import com.hms.management.repository.PatientProfileRepository;
@CrossOrigin
@RestController
@RequestMapping("patientprofile")
public class PatientProfileController {

	
	
	@Autowired
	private PatientProfileRepository patientProfileRepository;
	
	
	@PostMapping("/add")
	public <T> T add(@RequestBody PatientProfile b) {
		return (T) patientProfileRepository.save(b);
		
	}
	
	@GetMapping("/get")
	public <T> T get() {
		return (T) patientProfileRepository.findAll();
		
	}
	
	@GetMapping("/get/patient/{patientId}")
	public <T> T get(@PathVariable String patientId) {
		List<?> li=patientProfileRepository.fetchByPatientId(patientId);
		return (T) (li.size()>0?li.get(0):new PatientProfile());
		
	}
	
	@GetMapping("/delete/{id}")
	public <T> T delete(@PathVariable int id) {
		patientProfileRepository.deleteById(id);
		return (T) (""+id);
	
	}
	
}
