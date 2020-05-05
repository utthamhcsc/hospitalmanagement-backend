package com.hms.management.pathology.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
 
import com.hms.management.pathology.modal.PathologyPatient;

public interface PathologyPatientRepo extends JpaRepository<PathologyPatient, Integer>{
	
	@Query("select new Map(p as p,pa.shortName as shortName,pa.testName as testName,u.name as patientName,d.name as doctorName) "
			+ "from PathologyPatient p inner join UserRegistration u on u.userId=p.patientId "
			+ "left join UserRegistration d on d.userId=p.doctorId "
			+ " inner join Pathology pa on pa.id=p.pathologyId")
	List<?> fetchAll();
	@Query("select new Map(p as p,pa.shortName as shortName,pa.testName as testName,u.name as patientName,d.name as doctorName) "
			+ "from PathologyPatient p inner join UserRegistration u on u.userId=p.patientId "
			+ "left join UserRegistration d on d.userId=p.doctorId "
			+ " inner join Pathology pa on pa.id=p.pathologyId "
			+ " where SUBSTRING(p.date,1,10) between SUBSTRING(?1,1,10) and SUBSTRING(?2,1,10)")
	List<?> getByDate(String fromdate,String toDate);

}
