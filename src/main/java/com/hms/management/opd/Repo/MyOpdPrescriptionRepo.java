package com.hms.management.opd.Repo;

import com.hms.management.opd.modal.MyOpdPrescription;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MyOpdPrescriptionRepo extends JpaRepository<MyOpdPrescription, String> {
  @Query("select m from MyOpdPrescription m where m.opdId=?1")
  List<MyOpdPrescription> fetchByOpdId(String paramString);
}


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\opd\Repo\MyOpdPrescriptionRepo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */