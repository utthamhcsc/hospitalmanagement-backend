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
  @Query("select new Map(i as ipd,u.name as name,u.gender as gender,u.mobileNo as phone,s.firstName as doctorName,SUM(c.appliedCharge) as charge,SUM(p.amount) as payment,SUM(c.appliedCharge)-SUM(p.amount) as duePayment)  from MyIpdmodal i left join MyIpdCharges c on i.ipdId=c.ipdId left join MyIpdPayment p on i.ipdId=p.ipdId left join com.hms.management.humanresource.modal.Staff s on s.staffId=i.doctorId left join UserRegistration u on u.userId=i.patientId where  i.patientId=?1 AND i.status=?2 group by i.ipdId")
  List<?> fetchIpdPatient(String patientId, String status);
  @Query("select new Map(i as ipd,u.name as name,u.gender as gender,u.mobileNo as phone,"
  		+ "s.firstName as doctorName,"
  		+ "(select SUM(c.appliedCharge) from MyIpdCharges c where c.ipdId=i.ipdId group by c.ipdId) as charge  ,"
  		+ "(select SUM(p.amount)  from MyIpdPayment p where p.ipdId=ipdId group by p.ipdId)  as payment)"
  		+ " from MyIpdmodal i left join com.hms.management.humanresource.modal.Staff s on s.staffId=i.doctorId "
  		+ "left join UserRegistration u on u.userId=i.patientId")
  List<?> getall();
  
  @Query("select new Map(i as ipd,u.name as name,u.gender as gender,u.mobileNo as phone,"
	  		+ "s.firstName as doctorName,"
	  		+ "(select SUM(c.appliedCharge) from MyIpdCharges c where c.ipdId=i.ipdId group by c.ipdId) as charge  ,"
	  		+ "(select SUM(p.amount)  from MyIpdPayment p where p.ipdId=ipdId group by p.ipdId)  as payment)"
	  		+ " from MyIpdmodal i  left join com.hms.management.humanresource.modal.Staff s on s.staffId=i.doctorId "
	  		+ "left join UserRegistration u on u.userId=i.patientId where i.status=?1")
	  List<?> getallbyStatus(String status);
  
  @Query("select new Map(i as ipd,u.name as name,u.gender as gender,u.mobileNo as phone,"
	  		+ "s.firstName as doctorName,"
	  		+ "(select SUM(c.appliedCharge) from MyIpdCharges c where c.ipdId=i.ipdId group by c.ipdId) as charge  ,"
	  		+ "(select SUM(p.amount)  from MyIpdPayment p where p.ipdId=ipdId group by p.ipdId)  as payment)"
	  		+ " from MyIpdmodal i  left join com.hms.management.humanresource.modal.Staff s on s.staffId=i.doctorId "
	  		+ "left join UserRegistration u on u.userId=i.patientId where i.doctorId=?1")
	  List<?> getallbydoctor(String doctorId);
  
  @Query("select new Map(i as ipd,u.name as name,u.gender as gender,u.mobileNo as phone,"
	  		+ "s.firstName as doctorName,"
	  		+ "(select SUM(c.appliedCharge) from MyIpdCharges c where c.ipdId=i.ipdId group by c.ipdId) as charge  ,"
	  		+ "(select SUM(p.amount)  from MyIpdPayment p where p.ipdId=ipdId group by p.ipdId)  as payment)"
	  		+ " from MyIpdmodal i  left join com.hms.management.humanresource.modal.Staff s on s.staffId=i.doctorId "
	  		+ "left join UserRegistration u on u.userId=i.patientId where i.doctorId=?1 and i.status=?2")
	  List<?> getallbydoctorandstatus(String doctorId,String status);
  
  
  
  @Query("select new Map(i as ipd,u.name as name,u.gender as gender,u.mobileNo as phone,"
	  		+ "s.firstName as doctorName,"
	  		+ "(select SUM(c.appliedCharge) from MyIpdCharges c where c.ipdId=i.ipdId group by c.ipdId) as charge  ,"
	  		+ "(select SUM(p.amount)  from MyIpdPayment p where p.ipdId=ipdId group by p.ipdId)  as payment)"
	  		+ " from MyIpdmodal i  left join com.hms.management.humanresource.modal.Staff s on s.staffId=i.doctorId "
	  		+ "left join UserRegistration u on u.userId=i.patientId where i.doctorId=?1 and SUBSTRING(i.admissionDate,1,10) between SUBSTRING(?2,1,10) and SUBSTRING(?3,1,10)")
	  List<?> getallbydoctoranddate(String doctorId,String fromDate,String toDate);
  
  
  
  
  
  @Query("select new Map(i as ipd,u.name as name,u.gender as gender,u.mobileNo as phone,"
	  		+ "s.firstName as doctorName,"
	  		+ "(select SUM(c.appliedCharge) from MyIpdCharges c where c.ipdId=i.ipdId group by c.ipdId) as charge  ,"
	  		+ "(select SUM(p.amount)  from MyIpdPayment p where p.ipdId=ipdId group by p.ipdId)  as payment)"
	  		+ " from MyIpdmodal i  left join com.hms.management.humanresource.modal.Staff s on s.staffId=i.doctorId "
	  		+ "left join UserRegistration u on u.userId=i.patientId where i.doctorId=?1 and i.status=?2 and SUBSTRING(i.admissionDate,1,10) between SUBSTRING(?3,1,10) and SUBSTRING(?4,1,10)")
	  List<?> getallbydoctoranddateandstatus(String doctorId,String status,String fromDate,String toDate);
  
  
  @Query("select new Map(i as ipd,u.name as name,u.gender as gender,u.mobileNo as phone,"
	  		+ "s.firstName as doctorName,"
	  		+ "(select SUM(c.appliedCharge) from MyIpdCharges c where c.ipdId=i.ipdId group by c.ipdId) as charge  ,"
	  		+ "(select SUM(p.amount)  from MyIpdPayment p where p.ipdId=ipdId group by p.ipdId)  as payment)"
	  		+ " from MyIpdmodal i  left join com.hms.management.humanresource.modal.Staff s on s.staffId=i.doctorId "
	  		+ "left join UserRegistration u on u.userId=i.patientId where  i.status=?1 and SUBSTRING(i.admissionDate,1,10) between SUBSTRING(?2,1,10) and SUBSTRING(?3,1,10)")
	  List<?> getallbydateandstatus(String status,String fromDate,String toDate);

  
  
  
  
  
  @Query("select new Map(i as ipd,u.name as name,u.gender as gender,u.mobileNo as phone,"
	  		+ "s.firstName as doctorName,"
	  		+ "(select SUM(c.appliedCharge) from MyIpdCharges c where c.ipdId=i.ipdId group by c.ipdId) as charge  ,"
	  		+ "(select SUM(p.amount)  from MyIpdPayment p where p.ipdId=ipdId group by p.ipdId)  as payment)"
	  		+ " from MyIpdmodal i  left join com.hms.management.humanresource.modal.Staff s on s.staffId=i.doctorId "
	  		+ "left join UserRegistration u on u.userId=i.patientId where SUBSTRING(i.admissionDate,1,10) between SUBSTRING(?1,1,10) and SUBSTRING(?2,1,10)")
	  List<?> getallbydate(String fromDate,String toDate);
  
  
  
  
  
}
//+ "left join MyIpdCharges c on i.ipdId=c.ipdId "
//+ "left join MyIpdPayment p on i.ipdId=p.ipdId "

/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\ipd\repo\MyIpdModalRepo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */