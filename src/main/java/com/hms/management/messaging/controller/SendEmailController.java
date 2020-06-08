
package com.hms.management.messaging.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.management.EmailSender;
import com.hms.management.messaging.model.SendEmail;
import com.hms.management.messaging.repo.SendEmailRepo;
import com.hms.management.repository.UserRegistrationRepository;
@CrossOrigin
@RestController
@RequestMapping("/mysendemail")
public class SendEmailController {
	
	 @Autowired
		private UserRegistrationRepository userRegistrationRepo;
	@Autowired
	private SendEmailRepo SendEmailRepo;
	
	@PostMapping("/add")
	public <T> T add(@RequestBody SendEmail b) {
		//System.out.println(b);
		List<String> to=new ArrayList<>();
		if(b.getMessageTo().size()>0) {
			
			//	System.out.println(item.getRole());
			//	to.addAll(userRegistrationRepo.findByRoleIn())
				to.addAll(userRegistrationRepo.findByRoleIn(b.getMessageTo().stream().map(item1->item1.getRole()).collect(Collectors.toList())).stream().map(item1->item1.getEmail()).collect(Collectors.toList()));
			//	System.out.println(to);
		
			System.out.println(b);
			if(b.isSendEmail()) {
				EmailSender.sendMailToGroup( b.getTitle(),b.getMessage(),to);
				
			}
		}
		return (T) SendEmailRepo.save(b);
		
		
	}
	
	@PostMapping("/sendIndividual")
	public <T> T addIndividual(@RequestBody SendEmail b) {
		//System.out.println(b);
		List<String> to=new ArrayList<>();
		if(b.getMessageList().size()>0) {
			
			System.out.println(b);
			if(b.isSendEmail()) {
				EmailSender.sendMailToGroup( b.getTitle(),b.getMessage(),b.getMessageList());
				
			}
		}
		return (T) "1";
		
		
	}
	
	@GetMapping("/get")
	public <T> T get() {
		return (T) SendEmailRepo.findAll();
		
	}
	
	
	
	@GetMapping("/delete/{id}")
	public <T> T delete(@PathVariable int id) {
		SendEmailRepo.deleteById(id);
		return (T) (""+id);
	}

}
