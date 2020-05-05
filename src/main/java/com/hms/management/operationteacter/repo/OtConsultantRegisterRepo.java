package com.hms.management.operationteacter.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hms.management.operationteacter.modal.OtConsultantRegister;

public interface OtConsultantRegisterRepo extends JpaRepository<OtConsultantRegister, Integer> {

	
	@Query("select new Map(o as o,u.name as doctorName) from OtConsultantRegister o left join UserRegistration u on u.userId=o.doctorId where o.otid=?1")
	List<?> getbyotid(int id);

}
