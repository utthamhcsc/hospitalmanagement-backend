package com.hms.management.operationteacter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.management.operationteacter.modal.OtConsultantRegister;
import com.hms.management.operationteacter.repo.OtConsultantRegisterRepo;

@RestController
@CrossOrigin
@RequestMapping("/otconsutantregister")
public class OtConsultantRegisterController {
	@Autowired
	private OtConsultantRegisterRepo otConsultantRegisterRepo;
	
	@PostMapping("/add")
	public <T> T add(@RequestBody List<OtConsultantRegister> b) {
		return (T) otConsultantRegisterRepo.saveAll(b);
		
	}
	
	@GetMapping("/get/{id}")
	public <T> T get(@PathVariable int id) {
		return (T) otConsultantRegisterRepo.getbyotid(id);
		
	}
	
	@GetMapping("/get")
	public <T> T get() {
		return (T) otConsultantRegisterRepo.findAll();
		
	}
	
	@GetMapping("/delete/{id}")
	public <T> T delete(@PathVariable int id) {
		otConsultantRegisterRepo.deleteById(id);
		return (T) (""+id);
	
}
}
