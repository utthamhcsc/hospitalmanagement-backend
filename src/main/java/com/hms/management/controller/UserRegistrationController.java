package com.hms.management.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hms.management.beans.UserRegistrationBean;
import com.hms.management.model.UserRegistration;
import com.hms.management.repository.UserRegistrationRepository;
import com.hms.management.serviceimpl.UserRegistrationServiceImpl;
import com.hms.management.userlog.modal.Userlog;
import com.hms.management.userlog.repo.UserLogRepo;
@RestController
public class UserRegistrationController {


	
	
	
	private static String UPLOADED_FOLDER = "uploads/";

	
	@Autowired
	public UserRegistrationServiceImpl userRegistrationServiceImpl;
	 @Autowired
	private UserRegistrationRepository userRegistrationRepo;
	 @Autowired
	 private UserLogRepo userlogrepo;
	
	 
	 @CrossOrigin
	 @PostMapping("/user/search")
	 public <T>T findUser(@RequestParam("role") String role,@RequestParam("user") String user){
		 return (T)userRegistrationRepo.findByRoleAndNameContainingIgnoreCase(role,user);
	 }
	 
	
	@CrossOrigin
	@RequestMapping(value="/changepassword",method = RequestMethod.POST)
	public <T>T changePassword(@RequestBody @RequestParam("currentPassword") String currentPassword,
			@RequestParam("newPassword") String newPassword,
			@RequestParam("userId") String userId
			){
		UserRegistration u=userRegistrationRepo.findByUserId(userId);
		Map<String,String> map=new HashMap<>();
		if(u!=null) {
			if(currentPassword.trim().equals(u.getPassword())) {
				if(!(newPassword.trim().length()>0)) {
					map.put("err","new password should not be empty");
				}
				else {
				u.setPassword(newPassword.trim());
				userRegistrationRepo.save(u);
				map.put("msg","password changed successfully");
				}
			}
			else {
				map.put("err","current password is wrong");
			}
		}
		
		return (T)map;
	}
	
	@CrossOrigin
	@RequestMapping(value="/get/patient/{patientId}", method = RequestMethod.GET, produces = "application/json")
    public UserRegistration fetchAllUser(@PathVariable String patientId){
		//Map<String, Object> response=new HashMap<String, Object>();
 		//response.put("msg",userRegistrationServiceImpl.userLogIn(userRegistration));
		//Optional<UserRegistration> u=userRegistrationRepo.findByUserId(patientId);
 		return userRegistrationRepo.findByUserId(patientId);
	}
	
	
	
	@CrossOrigin
	@RequestMapping(value="/getall/{role}", method = RequestMethod.GET, produces = "application/json")
    public Object getallbyrole(@PathVariable String role){
		//Map<String, Object> response=new HashMap<String, Object>();
 		//response.put("msg",userRegistrationServiceImpl.userLogIn(userRegistration));
 		return userRegistrationRepo.findByRole(role);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@CrossOrigin
	@RequestMapping(value="register", method = RequestMethod.POST)
    public Map<String, Object> registration(UserRegistrationBean userRegistrationBean){
		Map<String, Object> response=new HashMap<String, Object>();
		UserRegistration n=new UserRegistration();
 	        byte[] bytes = null;
			try {
				bytes = userRegistrationBean.getUserProfile().getBytes();
			} catch (IOException e) {
				// TODO Auto-generated catch block 
				e.printStackTrace();
			}
	        Path path = Paths.get(UPLOADED_FOLDER + userRegistrationBean.getUserProfile().getOriginalFilename());
	        try {
				Files.write(path, bytes);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        n.setUserProfile(UPLOADED_FOLDER + userRegistrationBean.getUserProfile().getOriginalFilename());
			 n.setEmail(userRegistrationBean.getEmail());
			 n.setMobileNo(userRegistrationBean.getMobileNo());
			 n.setName(userRegistrationBean.getName());
			 n.setRole(userRegistrationBean.getRole());
			 n.setPassword(userRegistrationBean.getPassword());
			 n.setSignupDate(userRegistrationBean.getSignupDate());
		 	// response.put("msg",userRegistrationServiceImpl.registration(n)); 
 		     response.put("msg",userRegistrationServiceImpl.registration(n));
 		     return response;
	}
	@CrossOrigin(origins = "*")
	@RequestMapping(value="login", method = RequestMethod.POST, produces = "application/json")
    public Map<String, Object> logIn(@RequestBody UserRegistration userRegistration,HttpServletRequest request){
		Userlog log=new Userlog();
	System.out.println(request.getRemoteAddr());
	
	System.out.println(request.getHeader("user-agent"));
		Map<String, Object> response=new HashMap<String, Object>();
 		response.put("msg",userRegistrationServiceImpl.userLogIn(userRegistration,request));
 		return response;
	}
	@CrossOrigin
	@RequestMapping(value="/fetchalluser", method = RequestMethod.GET, produces = "application/json")
    public List<UserRegistration> getAllUser(){
		
		   
		
		//Map<String, Object> response=new HashMap<String, Object>();
 		//response.put("msg",userRegistrationServiceImpl.userLogIn(userRegistration));
 		return userRegistrationServiceImpl.fetchAllUser();
	}
	
	@CrossOrigin
	@RequestMapping(value="/fetchalluser/{role}", method = RequestMethod.GET, produces = "application/json")
    public Object getUserByRole(@PathVariable String role){
		//Map<String, Object> response=new HashMap<String, Object>();
 		//response.put("msg",userRegistrationServiceImpl.userLogIn(userRegistration));
 		return userRegistrationServiceImpl.fetchByRole(role);
	}
	
	@CrossOrigin
	@RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public Object deleteUserRegistration(@PathVariable int id) {
		return userRegistrationServiceImpl.deleteUserRegistration(id);
		
	}
	 
	
	
	@CrossOrigin
	@RequestMapping(value = "/iffileisnull",method = RequestMethod.POST,produces = "application/json")
	public UserRegistration adUserRegistration(@RequestBody UserRegistration userRegitration) {
		 return userRegistrationServiceImpl.adUserRegistration(userRegitration);
		
	}
	/*
	 * @RequestMapping(value="/getallregistration", method = RequestMethod.GET,
	 * produces = "application/json") public ResponseEntity<List<UserRegistration>>
	 * getAllEmployees(
	 * 
	 * @RequestParam(defaultValue = "0") Integer pageNo,
	 * 
	 * @RequestParam(defaultValue = "10") Integer pageSize,
	 * 
	 * @RequestParam(defaultValue = "id") String sortBy) { List<UserRegistration>
	 * list = userRegistrationServiceImpl.getAllregistration(pageNo, pageSize,
	 * sortBy);
	 * 
	 * return new ResponseEntity<List<UserRegistration>>(list, new HttpHeaders(),
	 * HttpStatus.OK);
	 * 
	 * }
	 */
}
