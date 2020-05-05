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

import com.hms.management.BloodBank.Repo.BloodIssueRepo;
import com.hms.management.BloodBank.Repo.BloodStatusRepo;
import com.hms.management.BloodBank.modal.BloodIssue;
import com.hms.management.BloodBank.modal.BloodStatus;

@RestController
@CrossOrigin
@RequestMapping("/bloodissue")
public class BloodIssueController {
	@Autowired
	private BloodIssueRepo BloodIssueRepo;
	@Autowired
	private BloodStatusRepo BloodStatusRepo;
	
	@PostMapping("/add")
	public <T> T add(@RequestBody BloodIssue b) {
		
		if(b.getId()==0) {
		Optional<BloodStatus> blood=BloodStatusRepo.findById(b.getBloodGroup());
		if(blood.isPresent()) {
			BloodStatus a=blood.get();
			a.setStatus(a.getStatus()-1);
			BloodStatusRepo.save(a);
		}
		}
		return (T) BloodIssueRepo.save(b);
		
	}
	@PostMapping({"/getbyDate"})
	/*    */   public <T> T get(@RequestParam("fromDate")String fromDate,@RequestParam("toDate")String toDate) {
	/* 41 */     return (T)this.BloodIssueRepo.getbydate(fromDate, toDate);
	/*    */   }
	/*    */   
	@GetMapping("/get")
	public <T> T get() {
		return (T) BloodIssueRepo.fetchAll();
		
	}
	
	@GetMapping("/delete/{id}")
	public <T> T delete(@PathVariable int id) {
		BloodIssueRepo.deleteById(id);
		return (T) (""+id);
	
}
}

