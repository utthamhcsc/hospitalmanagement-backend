package com.hms.management.userlog.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hms.management.userlog.modal.Userlog;

public interface UserLogRepo extends JpaRepository<Userlog, Integer>{
	@Query("select d from Userlog d "
			+ ""
			+ "where Date(d.loginDatetime) between SUBSTRING(?1,1,10) AND SUBSTRING(?2,1,10)")
	List<Userlog> getbydate(String fromDate, String toDate);
	
}