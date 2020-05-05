package com.hms.management.BirthDeath.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hms.management.BirthDeath.modal.MyDeathRecord;

public interface MyDeathRecordRepo extends JpaRepository<MyDeathRecord, Integer>{
	@Query("select new Map(p as p,u.name as patientName,u.gender as gender) from MyDeathRecord p "
			+ "left join UserRegistration u on u.userId=p.patientId")
	List<?> fetchAll();
	
	@Query("select new Map(p as p,u.name as patientName,u.gender as gender) from MyDeathRecord p "
			+ "left join UserRegistration u on u.userId=p.patientId where p.deathDate between SUBSTRING(?1,1,10) AND SUBSTRING(?2,1,10)")
	List<?> getbydate(String fromDate,String toDate);
	
	
}
