package com.hms.management.ambulance.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hms.management.ambulance.Repo.AmbulanceCallRepo;
import com.hms.management.ambulance.model.Ambulancecall;

@RestController
@CrossOrigin
@RequestMapping("/vehicle/call")
public class AmbulancecallController {
	@Autowired
	private AmbulanceCallRepo ambulanceRepo;
	
	@PostMapping("/add")
	public <T> T add(@RequestBody Ambulancecall b) {
		return (T) ambulanceRepo.save(b);
		
	}
	
	@GetMapping("/get")
	public <T> T get() {
		return (T) ambulanceRepo.fetchAll();
		
	}
	
	@PostMapping({"/getbyDate"})
	/*    */   public <T> T get(@RequestParam("fromDate")String fromDate,@RequestParam("toDate")String toDate) {
	/* 41 */     return (T)this.ambulanceRepo.getbydate(fromDate, toDate);
	/*    */   }
	
	@GetMapping("/delete/{id}")
	public <T> T delete(@PathVariable int id) {
		ambulanceRepo.deleteById(id);
		return (T) (""+id);
	
}
}
