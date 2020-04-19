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
  
  
}


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\opd\Repo\MyOpdRepo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */