package com.hms.management.ipd.repo;

import com.hms.management.ipd.modal.MyIpdConsultantInstructionRegister;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MyIpdConsultantRegisterRepo extends JpaRepository<MyIpdConsultantInstructionRegister, Integer> {
  List<MyIpdConsultantInstructionRegister> findByIpdId(String paramString);
  
  @Query("select  new Map(c.id as id,c.appliedDate as appliedDate,c.doctorId as doctorId,c.instruction as instruction,c.instructionDate as instructionDate,s.firstName as doctorName) from MyIpdConsultantInstructionRegister c left join com.hms.management.humanresource.modal.Staff s on s.staffId=c.doctorId where c.ipdId=?1")
  List<?> fetchByIpdid(String paramString);
}


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\ipd\repo\MyIpdConsultantRegisterRepo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */