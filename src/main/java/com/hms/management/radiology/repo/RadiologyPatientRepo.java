package com.hms.management.radiology.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hms.management.radiology.modal.RadiologyPatient;

public interface RadiologyPatientRepo extends JpaRepository<RadiologyPatient, Integer>{
	
	@Query("select new Map(p as p,pa.shortName as shortName,pa.testName as testName,u.name as patientName,d.name as doctorName) "
			+ "from RadiologyPatient p inner join UserRegistration u on u.userId=p.patientId "
			+ "left join UserRegistration d on d.userId=p.doctorId "
			+ " inner join Radiology pa on pa.id=p.radiologyId")
	List<?> fetchAll();
	@Query("select new Map(p as p,pa.shortName as shortName,pa.testName as testName,u.name as patientName,d.name as doctorName) "
			+ "from RadiologyPatient p inner join UserRegistration u on u.userId=p.patientId "
			+ "left join UserRegistration d on d.userId=p.doctorId "
			+ " inner join Radiology pa on pa.id=p.radiologyId "
			+ " where SUBSTRING(p.date,1,10) between SUBSTRING(?1,1,10) and SUBSTRING(?2,1,10)")
	List<?> getByDate(String fromdate,String toDate);
	
	@Query("select new Map(p as p,pa.shortName as shortName,pa.testName as testName,u.name as patientName,d.name as doctorName) "
			+ "from RadiologyPatient p inner join UserRegistration u on u.userId=p.patientId "
			+ "left join UserRegistration d on d.userId=p.doctorId "
			+ " inner join Radiology pa on pa.id=p.radiologyId where p.patientId=?1")
	List<?> fetchByPatient(String patientId);
	
	@Query("select new Map(p as p,pa.shortName as shortName,pa.testName as testName,u.name as patientName,d.name as doctorName) "
			+ "from RadiologyPatient p inner join UserRegistration u on u.userId=p.patientId "
			+ "left join UserRegistration d on d.userId=p.doctorId "
			+ " inner join Radiology pa on pa.id=p.radiologyId where p.doctorId=?1")
	List<?> fetchByDoctor(String patientId);


}
