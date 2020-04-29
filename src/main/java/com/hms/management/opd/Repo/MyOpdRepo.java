package com.hms.management.opd.Repo;

import com.hms.management.opd.modal.MyOpdmodal;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MyOpdRepo extends JpaRepository<MyOpdmodal, String> {
  @Query("select new Map(m.patientId as patientId,u.name as name,u.gender as gender,u.mobileNo as mobileNo,MAX(m.appointmentDate) as lastvistdate,count(m.patientId) as totalVisit) from MyOpdmodal m  inner join UserRegistration u on u.userId=m.patientId  GROUP BY m.patientId")
  List<?> fetchAll();
  
  @Query("select new Map(m as opd,u.name as doctorName) from MyOpdmodal m left join UserRegistration u on u.userId=m.doctorId where m.patientId=?1")
  List<?> fetchByPatientId(String paramString);
  
  @Query("select new Map(m.patientId as patientId,u.name as name,u.gender as gender,u.mobileNo as mobileNo,MAX(m.appointmentDate) as lastvistdate,count(m.patientId) as totalVisit) from MyOpdmodal m  inner join UserRegistration u on u.userId=m.patientId where m.doctorId=?1  GROUP BY m.patientId")
  List<?> fetchByDoctorId(String doctorId);
  
  
  @Query("select new Map(u as user, m as opd,d.name as doctorName ,(select sum(c.appliedCharge) from MyOpdCharges c where c.opdId=m.opdId group by c.opdId) as charge) from MyOpdmodal m  inner join UserRegistration u on u.userId=m.patientId "
  		+ "left join UserRegistration d on d.userId=m.doctorId")
  List<?> getAll();
  
  @Query("select new Map(u as user, m as opd,d.name as doctorName ,(select sum(c.appliedCharge) from MyOpdCharges c where c.opdId=m.opdId group by c.opdId) as charge) from MyOpdmodal m  inner join UserRegistration u on u.userId=m.patientId "
	  		+ "left join UserRegistration d on d.userId=m.doctorId where m.doctorId=?1")
	  List<?> getAllByDoctorId(String doctorId);
  
  @Query("select new Map(u as user, m as opd,d.name as doctorName ,(select sum(c.appliedCharge) from MyOpdCharges c where c.opdId=m.opdId group by c.opdId) as charge) from MyOpdmodal m  inner join UserRegistration u on u.userId=m.patientId "
	  		+ "left join UserRegistration d on d.userId=m.doctorId where SUBSTRING(m.appointmentDate,1,10) between SUBSTRING(?1,1,10) and SUBSTRING(?2,1,10)")
	  List<?> getByDate(String startDate,String endDate);
  
  @Query("select new Map(u as user, m as opd,d.name as doctorName ,(select sum(c.appliedCharge) from MyOpdCharges c where c.opdId=m.opdId group by c.opdId) as charge) from MyOpdmodal m  inner join UserRegistration u on u.userId=m.patientId "
	  		+ "left join UserRegistration d on d.userId=m.doctorId where m.doctorId=?1 and SUBSTRING(m.appointmentDate,1,10) between SUBSTRING(?2,1,10) and SUBSTRING(?3,1,10)")
	  List<?> getbyDatewithDoctorId(String doctorId,String startDate,String endDate);
   
}

