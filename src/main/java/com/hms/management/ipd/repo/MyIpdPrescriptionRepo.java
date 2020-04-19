package com.hms.management.ipd.repo;

import com.hms.management.ipd.modal.MyIpdPrescription;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MyIpdPrescriptionRepo extends JpaRepository<MyIpdPrescription, Integer> {
  @Query("select m from MyIpdPrescription m where m.ipdId=?1")
  List<MyIpdPrescription> fetchByIpdId(String paramString);
}


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\ipd\repo\MyIpdPrescriptionRepo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */