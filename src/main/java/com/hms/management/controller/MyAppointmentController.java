package com.hms.management.controller;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.hms.management.EmailSender;
import com.hms.management.model.Appointment;
import com.hms.management.model.PatientProfile;
import com.hms.management.model.UserRegistration;
import com.hms.management.repository.MyAppointmentRepo;
import com.hms.management.repository.PatientProfileRepository;
import com.hms.management.repository.UserRegistrationRepository;
@CrossOrigin
@RestController
@RequestMapping("myappointment")
public class MyAppointmentController {
	
	@Autowired
	private MyAppointmentRepo appointmentRepo;
	
	@Autowired
	private UserRegistrationRepository userRepo;
	
	@Autowired
	private PatientProfileRepository patientProfileRepository;

	@PostMapping("/add")
	public <T> T add(@RequestBody Appointment s) {
			if(s.getPatientId().isEmpty()) {
				if(userRepo.findByEmail(s.getEmail()).size()>0) {
					Map map=new HashMap<>();
					map.put("err", "emailid arready exist");
					return (T)map;
				}
				PatientProfile p=new PatientProfile();
				p.setAddress(s.getAddress());
				p.setEmail(s.getEmail());
				p.setGender(s.getGender());
				p.setPhone(s.getMobileNumber());
				p.setRole("patient");
				p.setName(s.getPatientName());
				p.setPatientId("pat"+"-"+DateTimeFormatter.ofPattern("yyyyMMddHHmmssa").format(LocalDateTime.now()));
				patientProfileRepository.save(p);
				UserRegistration u=new UserRegistration();
				u.setEmail(s.getEmail());
				u.setGender(s.getGender());
				u.setMobileNo(s.getMobileNumber());
				u.setName(s.getPatientName());
				u.setPassword("pat"+String.valueOf(new Random().nextInt()).substring(0, 5));
				u.setRole("patient");
				u.setUserId(p.getPatientId());
				s.setPatientId(u.getUserId());
				//if(userRepo.findByEmail(s.getEmail()).size()>0)
				userRepo.save(u);
				EmailSender.sendMail("revanhj1993@gmail.com", "sunday14031993", "userName:"+s.getEmail()+" password:"+u.getPassword(), s.getEmail());
			}else {
				Optional<Appointment> a= appointmentRepo.findByPatientId(s.getPatientId()).stream().findFirst();
				if(a.isPresent()) {
					Appointment app=a.get();
					s.setMobileNumber(app.getMobileNumber());
					s.setAddress(app.getAddress());
					s.setEmail(app.getEmail());
					s.setGender(app.getGender());
					s.setPatientName(app.getPatientName());
				}
				else {
					Map map=new HashMap<>();
					map.put("err", "invalid patientId");
					return (T) map;
				}
			}
			
			
			s.setAptId("apt"+"-"+DateTimeFormatter.ofPattern("yyyyMMddHHmmssa").format(LocalDateTime.now()));	
		return (T)appointmentRepo.save(s);
	}
	
	@GetMapping("/get")
	public <T> T get() {
		return (T)appointmentRepo.findAll();
	}
	
	@PostMapping("/getbyDate")
	public <T> T fetch(@RequestParam("fromDate") String fromDate
			,@RequestParam("toDate") String toDate,
			@RequestParam("doctorId") String doctorId
			) {
		if(doctorId.equals("empty"))
		return (T)appointmentRepo.fetchByDate(fromDate, toDate);
		else
		return (T)appointmentRepo.fetchByDate(doctorId, fromDate,toDate);
	}
	
	@GetMapping("/get/patient/{patientId}")
	public <T> T get(@PathVariable String patientId) {
	return (T)appointmentRepo.fetchByPatientId(patientId);
	}
	
	@GetMapping("/get/doctor/{doctorId}")
	public <T> T getByDoctor(@PathVariable String doctorId) {
	return (T)appointmentRepo.findByDoctorId(doctorId);
	}
	@GetMapping("/delete/{id}")
	public <T> T delete(@PathVariable int id) {
	appointmentRepo.deleteById(id);
	return (T)(""+id);
	}
}
