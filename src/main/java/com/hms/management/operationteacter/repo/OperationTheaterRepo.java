package com.hms.management.operationteacter.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hms.management.operationteacter.modal.OperationTheater;

public interface OperationTheaterRepo extends JpaRepository<OperationTheater, Integer> {
	@Query("select new Map( o as o ,d.name as doctorName,u.name as patientName,u.gender as gender,u.mobileNo as phone,t.organisationName as tpa ) "
			+ "from OperationTheater o "
			+ "left join UserRegistration u on u.userId=o.patientId "
			+ "left join UserRegistration d on d.userId=o.doctorId "
			+ "left join Organisation t on t.id=o.tpaId")
	List<?> fetchall();
	
	@Query("select new Map( o as o ,d.name as doctorName,u.name as patientName,u.gender as gender,u.mobileNo as phone,t.organisationName as tpa ) "
			+ "from OperationTheater o "
			+ "left join UserRegistration u on u.userId=o.patientId "
			+ "left join UserRegistration d on d.userId=o.doctorId "
			+ "left join Organisation t on t.id=o.tpaId "
			+ "where o.doctorId=?1")
	List<?> fetchbydoctor(String doctorId);
	
	@Query("select new Map( o as o ,d.name as doctorName,u.name as patientName,u.gender as gender,u.mobileNo as phone,t.organisationName as tpa ) "
			+ "from OperationTheater o "
			+ "left join UserRegistration u on u.userId=o.patientId "
			+ "left join UserRegistration d on d.userId=o.doctorId "
			+ "left join Organisation t on t.id=o.tpaId "
			+ "where o.doctorId=?1 and o.operationDate between SUBSTRING(?2,1,10) AND SUBSTRING(?3,1,10)")
	List<?> fetchbydoctoranddate(String doctorId,String fromDate,String toDate);
	
	
	@Query("select new Map( o as o ,d.name as doctorName,u.name as patientName,u.gender as gender,u.mobileNo as phone,t.organisationName as tpa ) "
			+ "from OperationTheater o "
			+ "left join UserRegistration u on u.userId=o.patientId "
			+ "left join UserRegistration d on d.userId=o.doctorId "
			+ "left join Organisation t on t.id=o.tpaId "
			+ "where o.operationDate between SUBSTRING(?1,1,10) AND SUBSTRING(?2,1,10)")
	List<?> fetchbydate(String fromDate,String toDate);
	
	@Query("select new Map( o as o ,d.name as doctorName,u.name as patientName,u.gender as gender,u.mobileNo as phone,t.organisationName as tpa ) "
			+ "from OperationTheater o "
			+ "left join UserRegistration u on u.userId=o.patientId "
			+ "left join UserRegistration d on d.userId=o.doctorId "
			+ "left join Organisation t on t.id=o.tpaId "
			+ "where o.patientId=?1")
	List<?> fetchByPatient(String patientId);
	
	

}
