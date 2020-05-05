package com.hms.management.BirthDeath.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hms.management.BirthDeath.modal.MyBirthRecord;

public interface MyBirthRecordRepo extends JpaRepository<MyBirthRecord, Integer> {
	@Query("select p from MyBirthRecord p "
			+ "where p.birthDate between SUBSTRING(?1,1,10) AND SUBSTRING(?2,1,10)")
	List<MyBirthRecord> getbydate(String fromDate,String toDate);
	
}
