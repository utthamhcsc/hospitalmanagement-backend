package com.hms.management.BloodBank.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hms.management.BloodBank.Repo.BloodStatusRepo;
import com.hms.management.BloodBank.Repo.DonateBloodRepo;
import com.hms.management.BloodBank.modal.BloodStatus;
import com.hms.management.BloodBank.modal.DonateBlood;

@RestController
@CrossOrigin
@RequestMapping("/donateblood")
public class DonateBloodController {
	@Autowired
	private BloodStatusRepo BloodStatusRepo;
	
	@Autowired
	private DonateBloodRepo DonateBloodRepo;
	
	@PostMapping("/add")
	public <T> T add(@RequestBody DonateBlood b) {
		if(b.getId()==0) {
		Optional<BloodStatus> blood=BloodStatusRepo.findById(b.getBloodGroup());
		if(blood.isPresent()) {
			BloodStatus a=blood.get();
			a.setStatus(a.getStatus()+1);
			BloodStatusRepo.save(a);
		}
		}
		return (T) DonateBloodRepo.save(b);
		
	}
	
	@GetMapping("/get")
	public <T> T get() {
		return (T) DonateBloodRepo.getall();
		
	}
	
	@PostMapping({"/getbyDate"})
	/*    */   public <T> T get(@RequestParam("fromDate")String fromDate,@RequestParam("toDate")String toDate) {
	/* 41 */     return (T)this.DonateBloodRepo.getbydate(fromDate, toDate);
	/*    */   }
	/*    */   
	
	@GetMapping("/getbydonor/{id}")
	public <T> T getbynn(@PathVariable int id) {
		return (T) DonateBloodRepo.findByDonareId(id);
		
	}
	
	@GetMapping("/delete/{id}")
	public <T> T delete(@PathVariable int id) {
		DonateBloodRepo.deleteById(id);
		return (T) (""+id);
	
}
}

