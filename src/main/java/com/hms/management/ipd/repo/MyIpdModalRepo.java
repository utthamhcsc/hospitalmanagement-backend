package com.hms.management.ipd.repo;

import com.hms.management.ipd.modal.MyIpdmodal;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MyIpdModalRepo extends JpaRepository<MyIpdmodal, String> {
  List<MyIpdmodal> findByPatientIdAndStatus(String paramString1, String paramString2);
  
  @Query("select new Map(i as ipd,u.name as name,u.gender as gender,u.mobileNo as phone,s.firstName as doctorName,SUM(c.appliedCharge) as charge,SUM(p.amount) as payment,SUM(c.appliedCharge)-SUM(p.amount) as duePayment)  from MyIpdmodal i left join MyIpdCharges c on i.ipdId=c.ipdId left join MyIpdPayment p on i.ipdId=p.ipdId left join com.hms.management.humanresource.modal.Staff s on s.staffId=i.doctorId left join UserRegistration u on u.userId=i.patientId where i.status=?1 group by i.ipdId")
  List<?> fetchIpdPatients(String paramString);
  @Query("select new Map(i as ipd,u.name as name,u.gender as gender,u.mobileNo as phone,s.firstName as doctorName,SUM(c.appliedCharge) as charge,SUM(p.amount) as payment,SUM(c.appliedCharge)-SUM(p.amount) as duePayment)  from MyIpdmodal i left join MyIpdCharges c on i.ipdId=c.ipdId left join MyIpdPayment p on i.ipdId=p.ipdId left join com.hms.management.humanresource.modal.Staff s on s.staffId=i.doctorId left join UserRegistration u on u.userId=i.patientId where  i.doctorId=?1 AND i.status=?2 group by i.ipdId")
 List<?> fetchIpdPatients(String doctorId, String status);
}


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\ipd\repo\MyIpdModalRepo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */