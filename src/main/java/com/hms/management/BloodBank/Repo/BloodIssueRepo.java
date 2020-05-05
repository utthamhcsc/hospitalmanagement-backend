package com.hms.management.BloodBank.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hms.management.BloodBank.modal.BloodIssue;

public interface BloodIssueRepo extends JpaRepository<BloodIssue, Integer> {
	
	@Query("select new Map(b as b,u.name as patientName,u.gender as gender,do.donarName as donarName) "
			+ "from BloodIssue b inner join UserRegistration u on u.userId=b.patientId "
			+ " "
			+ "left join BloodDonar do on do.id=b.donorId")
	List<?> fetchAll();
	
	@Query("select new Map(b as b,u.name as patientName,u.gender as gender,do.donarName as donarName) "
			+ "from BloodIssue b inner join UserRegistration u on u.userId=b.patientId "
			+ " "
			+ "left join BloodDonar do on do.id=b.donorId "
			+ "where b.issueDate between SUBSTRING(?1,1,10) AND SUBSTRING(?2,1,10)")
	List<?> getbydate(String fromDate,String toDate);

}
