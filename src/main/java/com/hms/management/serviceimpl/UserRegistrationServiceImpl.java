package com.hms.management.serviceimpl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.management.model.UserRegistration;
import com.hms.management.repository.UserRegistrationRepository;
import com.hms.management.service.UserRegistrationService;
import com.hms.management.userlog.modal.Userlog;
import com.hms.management.userlog.repo.UserLogRepo;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService{

	
	@Autowired
	public UserRegistrationRepository userRegistrationRepository;
	@Autowired
	 private UserLogRepo userlogrepo;
	
	//@Autowired
	//public BCryptPasswordEncoder bCryptPasswordEncoder;
	@Override
	public Map<String, Object> registration(UserRegistration userRegistration) {
		Map<String, Object> response = new HashMap<String, Object>();
		Date date= new Date();
		userRegistration.setUserId("UserId-"+DateTimeFormatter.ofPattern("yyyyMMddhhmmss").format(LocalDateTime.now()));

 		//UserRegistration email=userRegistrationRepository.findByEmail(userRegistration.getEmail());
		//UserRegistration mobileno=userRegistrationRepository.findByMobileNo(userRegistration.getMobileNo());
		UserRegistration email=null;
		UserRegistration mobileno=null;

		if(mobileno != null){
			response.put("msg", "duplicate mobileno");
		}
		else if(email!=null){
			response.put("msg", "duplicate emailid");
		}else
		{
			userRegistration.setSignupDate(date);
			//userRegistration.setPassword(bCryptPasswordEncoder.encode(userRegistration.getPassword()));
 			response.put("msg1", userRegistrationRepository.save(userRegistration));
		    response.put("msg", "registerd sucessfully");
		}
 		return response;
	}

	
	public Map<String, Object> userLogIn(UserRegistration userRegistration,HttpServletRequest request) {
		Map<String, Object> response = new HashMap<String, Object>();
		String pwd = userRegistration.getPassword();
		
		System.out.println("pwd=" + pwd);
		 
			String email = userRegistration.getName();
               if (email != null) {
       			//UserRegistration user = userRegistrationRepository.findByEmail(email);
       			List<UserRegistration> user = userRegistrationRepository.findByEmail(email);
    			if (user.size()>0) {
    				UserRegistration u=user.get(0);
                  if (u.getPassword().toString().equals(pwd)) {
             		  u.setPassword(null);
             		  Userlog log=new Userlog();
             		  log.setIpaddress(request.getRemoteAddr());
             		  log.setUser(u.getName());
             		  log.setUserAgent(request.getHeader("user-agent"));
             		  log.setLoginDatetime(userRegistration.getSignupDate());
             		  log.setRole(u.getRole());
             		  userlogrepo.save(log);
					response.put("msg", "user login succesful by mail");
					response.put("status",1);
					response.put("details", u);
 					} else {
 						
					response.put("msg", "wrong password");
				}
			
    			}
			else {
				String mobile = userRegistration.getName();

				if (mobile != null) {
					UserRegistration user1 = userRegistrationRepository.findByMobileNo(mobile);
					if (user1 != null) {

						if (user1.getPassword().toString().equals(pwd)) {
				            user1.setPassword(null);
				            Userlog log=new Userlog();
		             		  log.setIpaddress(request.getRemoteAddr());
		             		  log.setUser(user1.getName());
		             		  log.setUserAgent(request.getHeader("user-agent"));
		             		  log.setLoginDatetime(userRegistration.getSignupDate());
		             		  log.setRole(user1.getRole());
		             		  userlogrepo.save(log);
							response.put("msg", "user login succesful by phone number");
							response.put("status",1);

							response.put("detail", user1);
						} else
							response.put("msg", "wrong password");

					} else {
						response.put("msg", "user doesnot exist");

					}
				}
				response.put("msg", "user doesnot exist");
				}
		}
		
		return response;
	}
    @Override
	public List<UserRegistration> fetchAllUser() {
       return userRegistrationRepository.findAll();
	}
   @Override
	public List<UserRegistration> getAllregistration(Integer pageNo, Integer pageSize, String sortBy) {
 		return userRegistrationRepository.findAll();
	}
@Override
public Object deleteUserRegistration(int id) {
	Map<String, Object> map=new HashMap<>();
	userRegistrationRepository.deleteById(id);
	map.put("status", 1);
 	return map;
}

public UserRegistration fetchByUserId(String userId) {
	
	return userRegistrationRepository.findByUserId(userId);

}
public Object fetchByRole(String role) {
	Map<String,String> map=new HashMap<>();
	 userRegistrationRepository.findByRole(role).forEach(item->map.put(item.getUserId(), item.getName()));
	
	return map;
}
public static void main(String ...strings) {
	UserRegistrationServiceImpl u=new UserRegistrationServiceImpl();
	
	System.out.println(u.fetchByUserId("123"));
}

@Override
public UserRegistration adUserRegistration(UserRegistration userRegitration) {
	 return userRegistrationRepository.save(userRegitration);
}


@Override
public Map<String, Object> userLogIn(UserRegistration userRegistration) {
	// TODO Auto-generated method stub
	return null;
}















}

